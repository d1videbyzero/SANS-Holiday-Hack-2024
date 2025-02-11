package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EditingBuffer.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u0000 =2\u00020\u0001:\u0001=B\u001a\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\bJ\r\u0010$\u001a\u00020%H\u0000¢\u0006\u0002\b&J\r\u0010'\u001a\u00020%H\u0000¢\u0006\u0002\b(J\u001d\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\rH\u0000¢\u0006\u0002\b,J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\rH\u0080\u0002¢\u0006\u0002\b0J\r\u00101\u001a\u000202H\u0000¢\u0006\u0002\b3J%\u00104\u001a\u00020%2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0007H\u0000¢\u0006\u0002\b5J%\u00104\u001a\u00020%2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¢\u0006\u0002\b5J\u001d\u00106\u001a\u00020%2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\rH\u0000¢\u0006\u0002\b7J\u001d\u00108\u001a\u00020%2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\rH\u0000¢\u0006\u0002\b9J\r\u0010:\u001a\u00020\u0007H\u0000¢\u0006\u0002\b;J\b\u0010<\u001a\u00020\u0003H\u0016R\u001f\u0010\t\u001a\u0004\u0018\u00010\u00058@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R$\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0010R\u001d\u0010\u0004\u001a\u00020\u00058@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r@BX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0016R$\u0010!\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r@BX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006>"}, d2 = {"Landroidx/compose/ui/text/input/EditingBuffer;", "", "text", "", "selection", "Landroidx/compose/ui/text/TextRange;", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "composition", "getComposition-MzsxiRA$ui_text_release", "()Landroidx/compose/ui/text/TextRange;", "<set-?>", "", "compositionEnd", "getCompositionEnd$ui_text_release", "()I", "compositionStart", "getCompositionStart$ui_text_release", "cursor", "getCursor$ui_text_release", "setCursor$ui_text_release", "(I)V", "gapBuffer", "Landroidx/compose/ui/text/input/PartialGapBuffer;", "length", "getLength$ui_text_release", "getSelection-d9O1mEE$ui_text_release", "()J", "value", "selectionEnd", "getSelectionEnd$ui_text_release", "setSelectionEnd", "selectionStart", "getSelectionStart$ui_text_release", "setSelectionStart", "cancelComposition", "", "cancelComposition$ui_text_release", "commitComposition", "commitComposition$ui_text_release", "delete", "start", "end", "delete$ui_text_release", "get", "", "index", "get$ui_text_release", "hasComposition", "", "hasComposition$ui_text_release", "replace", "replace$ui_text_release", "setComposition", "setComposition$ui_text_release", "setSelection", "setSelection$ui_text_release", "toAnnotatedString", "toAnnotatedString$ui_text_release", "toString", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EditingBuffer {
    public static final int NOWHERE = -1;
    private int compositionEnd;
    private int compositionStart;
    private final PartialGapBuffer gapBuffer;
    private int selectionEnd;
    private int selectionStart;
    public static final int $stable = 8;

    public /* synthetic */ EditingBuffer(AnnotatedString annotatedString, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j);
    }

    public /* synthetic */ EditingBuffer(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j);
    }

    private EditingBuffer(AnnotatedString text, long selection) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.gapBuffer = new PartialGapBuffer(text.getText());
        this.selectionStart = TextRange.m4722getMinimpl(selection);
        this.selectionEnd = TextRange.m4721getMaximpl(selection);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        int start = TextRange.m4722getMinimpl(selection);
        int end = TextRange.m4721getMaximpl(selection);
        if (start < 0 || start > text.length()) {
            throw new IndexOutOfBoundsException("start (" + start + ") offset is outside of text region " + text.length());
        }
        if (end < 0 || end > text.length()) {
            throw new IndexOutOfBoundsException("end (" + end + ") offset is outside of text region " + text.length());
        }
        if (start <= end) {
        } else {
            throw new IllegalArgumentException("Do not set reversed range: " + start + " > " + end);
        }
    }

    /* renamed from: getSelectionStart$ui_text_release, reason: from getter */
    public final int getSelectionStart() {
        return this.selectionStart;
    }

    private final void setSelectionStart(int value) {
        if (!(value >= 0)) {
            throw new IllegalArgumentException(("Cannot set selectionStart to a negative value: " + value).toString());
        }
        this.selectionStart = value;
    }

    /* renamed from: getSelectionEnd$ui_text_release, reason: from getter */
    public final int getSelectionEnd() {
        return this.selectionEnd;
    }

    private final void setSelectionEnd(int value) {
        if (!(value >= 0)) {
            throw new IllegalArgumentException(("Cannot set selectionEnd to a negative value: " + value).toString());
        }
        this.selectionEnd = value;
    }

    /* renamed from: getCompositionStart$ui_text_release, reason: from getter */
    public final int getCompositionStart() {
        return this.compositionStart;
    }

    /* renamed from: getCompositionEnd$ui_text_release, reason: from getter */
    public final int getCompositionEnd() {
        return this.compositionEnd;
    }

    public final boolean hasComposition$ui_text_release() {
        return this.compositionStart != -1;
    }

    /* renamed from: getComposition-MzsxiRA$ui_text_release, reason: not valid java name */
    public final TextRange m4864getCompositionMzsxiRA$ui_text_release() {
        if (hasComposition$ui_text_release()) {
            return TextRange.m4712boximpl(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd));
        }
        return null;
    }

    /* renamed from: getSelection-d9O1mEE$ui_text_release, reason: not valid java name */
    public final long m4865getSelectiond9O1mEE$ui_text_release() {
        return TextRangeKt.TextRange(this.selectionStart, this.selectionEnd);
    }

    public final int getCursor$ui_text_release() {
        if (this.selectionStart == this.selectionEnd) {
            return this.selectionEnd;
        }
        return -1;
    }

    public final void setCursor$ui_text_release(int cursor) {
        setSelection$ui_text_release(cursor, cursor);
    }

    public final char get$ui_text_release(int index) {
        return this.gapBuffer.get(index);
    }

    public final int getLength$ui_text_release() {
        return this.gapBuffer.getLength();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private EditingBuffer(String text, long selection) {
        this(new AnnotatedString(text, null, null, 6, null), selection, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(text, "text");
    }

    public final void replace$ui_text_release(int start, int end, AnnotatedString text) {
        Intrinsics.checkNotNullParameter(text, "text");
        replace$ui_text_release(start, end, text.getText());
    }

    public final void replace$ui_text_release(int start, int end, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (start < 0 || start > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("start (" + start + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (end < 0 || end > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("end (" + end + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (start > end) {
            throw new IllegalArgumentException("Do not set reversed range: " + start + " > " + end);
        }
        this.gapBuffer.replace(start, end, text);
        setSelectionStart(text.length() + start);
        setSelectionEnd(text.length() + start);
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void delete$ui_text_release(int start, int end) {
        long deleteRange = TextRangeKt.TextRange(start, end);
        this.gapBuffer.replace(start, end, "");
        long newSelection = EditingBufferKt.m4866updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.selectionStart, this.selectionEnd), deleteRange);
        setSelectionStart(TextRange.m4722getMinimpl(newSelection));
        setSelectionEnd(TextRange.m4721getMaximpl(newSelection));
        if (hasComposition$ui_text_release()) {
            long compositionRange = TextRangeKt.TextRange(this.compositionStart, this.compositionEnd);
            long newComposition = EditingBufferKt.m4866updateRangeAfterDeletepWDy79M(compositionRange, deleteRange);
            if (TextRange.m4718getCollapsedimpl(newComposition)) {
                commitComposition$ui_text_release();
            } else {
                this.compositionStart = TextRange.m4722getMinimpl(newComposition);
                this.compositionEnd = TextRange.m4721getMaximpl(newComposition);
            }
        }
    }

    public final void setSelection$ui_text_release(int start, int end) {
        if (start < 0 || start > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("start (" + start + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (end < 0 || end > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("end (" + end + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (start > end) {
            throw new IllegalArgumentException("Do not set reversed range: " + start + " > " + end);
        }
        setSelectionStart(start);
        setSelectionEnd(end);
    }

    public final void setComposition$ui_text_release(int start, int end) {
        if (start < 0 || start > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("start (" + start + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (end < 0 || end > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("end (" + end + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (start >= end) {
            throw new IllegalArgumentException("Do not set reversed or empty range: " + start + " > " + end);
        }
        this.compositionStart = start;
        this.compositionEnd = end;
    }

    public final void cancelComposition$ui_text_release() {
        replace$ui_text_release(this.compositionStart, this.compositionEnd, "");
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void commitComposition$ui_text_release() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public String toString() {
        return this.gapBuffer.toString();
    }

    public final AnnotatedString toAnnotatedString$ui_text_release() {
        return new AnnotatedString(toString(), null, null, 6, null);
    }
}
