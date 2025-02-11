package androidx.emoji2.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.core.os.TraceCompat;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class MetadataRepo {
    private static final int DEFAULT_ROOT_SIZE = 1024;
    private static final String S_TRACE_CREATE_REPO = "EmojiCompat.MetadataRepo.create";
    private final char[] mEmojiCharArray;
    private final MetadataList mMetadataList;
    private final Node mRootNode = new Node(1024);
    private final Typeface mTypeface;

    private MetadataRepo(Typeface typeface, MetadataList metadataList) {
        this.mTypeface = typeface;
        this.mMetadataList = metadataList;
        this.mEmojiCharArray = new char[this.mMetadataList.listLength() * 2];
        constructIndex(this.mMetadataList);
    }

    public static MetadataRepo create(Typeface typeface) {
        try {
            TraceCompat.beginSection(S_TRACE_CREATE_REPO);
            return new MetadataRepo(typeface, new MetadataList());
        } finally {
            TraceCompat.endSection();
        }
    }

    public static MetadataRepo create(Typeface typeface, InputStream inputStream) throws IOException {
        try {
            TraceCompat.beginSection(S_TRACE_CREATE_REPO);
            return new MetadataRepo(typeface, MetadataListReader.read(inputStream));
        } finally {
            TraceCompat.endSection();
        }
    }

    public static MetadataRepo create(Typeface typeface, ByteBuffer byteBuffer) throws IOException {
        try {
            TraceCompat.beginSection(S_TRACE_CREATE_REPO);
            return new MetadataRepo(typeface, MetadataListReader.read(byteBuffer));
        } finally {
            TraceCompat.endSection();
        }
    }

    public static MetadataRepo create(AssetManager assetManager, String assetPath) throws IOException {
        try {
            TraceCompat.beginSection(S_TRACE_CREATE_REPO);
            Typeface typeface = Typeface.createFromAsset(assetManager, assetPath);
            return new MetadataRepo(typeface, MetadataListReader.read(assetManager, assetPath));
        } finally {
            TraceCompat.endSection();
        }
    }

    private void constructIndex(MetadataList metadataList) {
        int length = metadataList.listLength();
        for (int i = 0; i < length; i++) {
            TypefaceEmojiRasterizer metadata = new TypefaceEmojiRasterizer(this, i);
            Character.toChars(metadata.getId(), this.mEmojiCharArray, i * 2);
            put(metadata);
        }
    }

    Typeface getTypeface() {
        return this.mTypeface;
    }

    int getMetadataVersion() {
        return this.mMetadataList.version();
    }

    Node getRootNode() {
        return this.mRootNode;
    }

    public char[] getEmojiCharArray() {
        return this.mEmojiCharArray;
    }

    public MetadataList getMetadataList() {
        return this.mMetadataList;
    }

    void put(TypefaceEmojiRasterizer data) {
        Preconditions.checkNotNull(data, "emoji metadata cannot be null");
        Preconditions.checkArgument(data.getCodepointsLength() > 0, "invalid metadata codepoint length");
        this.mRootNode.put(data, 0, data.getCodepointsLength() - 1);
    }

    static class Node {
        private final SparseArray<Node> mChildren;
        private TypefaceEmojiRasterizer mData;

        private Node() {
            this(1);
        }

        Node(int defaultChildrenSize) {
            this.mChildren = new SparseArray<>(defaultChildrenSize);
        }

        Node get(int key) {
            if (this.mChildren == null) {
                return null;
            }
            return this.mChildren.get(key);
        }

        final TypefaceEmojiRasterizer getData() {
            return this.mData;
        }

        void put(TypefaceEmojiRasterizer data, int start, int end) {
            Node node = get(data.getCodepointAt(start));
            if (node == null) {
                node = new Node();
                this.mChildren.put(data.getCodepointAt(start), node);
            }
            if (end > start) {
                node.put(data, start + 1, end);
            } else {
                node.mData = data;
            }
        }
    }
}
