package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidClipboardManager.android.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eJ\u001b\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017J\u001b\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001fJ\u001b\u0010\u0005\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010%\u001a\u00020&J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010'\u001a\u00020(J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010)\u001a\u00020*J\u001b\u0010\u0005\u001a\u00020\u00062\u0006\u0010+\u001a\u00020,ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010\nJ\u0006\u0010.\u001a\u00020*J\u0006\u0010/\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, d2 = {"Landroidx/compose/ui/platform/EncodeHelper;", "", "()V", "parcel", "Landroid/os/Parcel;", "encode", "", "color", "Landroidx/compose/ui/graphics/Color;", "encode-8_81llA", "(J)V", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "spanStyle", "Landroidx/compose/ui/text/SpanStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "encode-nzbMABs", "(I)V", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "encode-6p3vJLY", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "encode-4Dl_Bck", "(F)V", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textUnit", "Landroidx/compose/ui/unit/TextUnit;", "encode--R2X_6o", "byte", "", "float", "", "int", "", "string", "", "uLong", "Lkotlin/ULong;", "encode-VKZWuLQ", "encodedString", "reset", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EncodeHelper {
    private Parcel parcel;

    public EncodeHelper() {
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
        this.parcel = obtain;
    }

    public final void reset() {
        this.parcel.recycle();
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
        this.parcel = obtain;
    }

    public final String encodedString() {
        byte[] bytes = this.parcel.marshall();
        String encodeToString = Base64.encodeToString(bytes, 0);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(bytes, Base64.DEFAULT)");
        return encodeToString;
    }

    public final void encode(SpanStyle spanStyle) {
        Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
        if (!Color.m2948equalsimpl0(spanStyle.m4683getColor0d7_KjU(), Color.INSTANCE.m2983getUnspecified0d7_KjU())) {
            encode((byte) 1);
            m4512encode8_81llA(spanStyle.m4683getColor0d7_KjU());
        }
        if (!TextUnit.m5394equalsimpl0(spanStyle.getFontSize(), TextUnit.INSTANCE.m5408getUnspecifiedXSAIIZE())) {
            encode((byte) 2);
            m4509encodeR2X_6o(spanStyle.getFontSize());
        }
        FontWeight it = spanStyle.getFontWeight();
        if (it != null) {
            encode((byte) 3);
            encode(it);
        }
        FontStyle fontStyle = spanStyle.getFontStyle();
        if (fontStyle != null) {
            int it2 = fontStyle.m4822unboximpl();
            encode((byte) 4);
            m4514encodenzbMABs(it2);
        }
        FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
        if (fontSynthesis != null) {
            int it3 = fontSynthesis.getValue();
            encode((byte) 5);
            m4511encode6p3vJLY(it3);
        }
        String it4 = spanStyle.getFontFeatureSettings();
        if (it4 != null) {
            encode((byte) 6);
            encode(it4);
        }
        if (!TextUnit.m5394equalsimpl0(spanStyle.getLetterSpacing(), TextUnit.INSTANCE.m5408getUnspecifiedXSAIIZE())) {
            encode((byte) 7);
            m4509encodeR2X_6o(spanStyle.getLetterSpacing());
        }
        BaselineShift baselineShift = spanStyle.getBaselineShift();
        if (baselineShift != null) {
            float it5 = baselineShift.m4987unboximpl();
            encode((byte) 8);
            m4510encode4Dl_Bck(it5);
        }
        TextGeometricTransform it6 = spanStyle.getTextGeometricTransform();
        if (it6 != null) {
            encode((byte) 9);
            encode(it6);
        }
        if (!Color.m2948equalsimpl0(spanStyle.getBackground(), Color.INSTANCE.m2983getUnspecified0d7_KjU())) {
            encode((byte) 10);
            m4512encode8_81llA(spanStyle.getBackground());
        }
        TextDecoration it7 = spanStyle.getTextDecoration();
        if (it7 != null) {
            encode((byte) 11);
            encode(it7);
        }
        Shadow it8 = spanStyle.getShadow();
        if (it8 != null) {
            encode((byte) 12);
            encode(it8);
        }
    }

    /* renamed from: encode-8_81llA, reason: not valid java name */
    public final void m4512encode8_81llA(long color) {
        m4513encodeVKZWuLQ(color);
    }

    /* renamed from: encode--R2X_6o, reason: not valid java name */
    public final void m4509encodeR2X_6o(long textUnit) {
        long m5396getTypeUIouoOA = TextUnit.m5396getTypeUIouoOA(textUnit);
        byte b = 0;
        if (!TextUnitType.m5425equalsimpl0(m5396getTypeUIouoOA, TextUnitType.INSTANCE.m5431getUnspecifiedUIouoOA())) {
            if (TextUnitType.m5425equalsimpl0(m5396getTypeUIouoOA, TextUnitType.INSTANCE.m5430getSpUIouoOA())) {
                b = 1;
            } else if (TextUnitType.m5425equalsimpl0(m5396getTypeUIouoOA, TextUnitType.INSTANCE.m5429getEmUIouoOA())) {
                b = 2;
            }
        }
        byte typeCode = b;
        encode(typeCode);
        if (!TextUnitType.m5425equalsimpl0(TextUnit.m5396getTypeUIouoOA(textUnit), TextUnitType.INSTANCE.m5431getUnspecifiedUIouoOA())) {
            encode(TextUnit.m5397getValueimpl(textUnit));
        }
    }

    public final void encode(FontWeight fontWeight) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        encode(fontWeight.getWeight());
    }

    /* renamed from: encode-nzbMABs, reason: not valid java name */
    public final void m4514encodenzbMABs(int fontStyle) {
        byte b = 0;
        if (!FontStyle.m4819equalsimpl0(fontStyle, FontStyle.INSTANCE.m4824getNormal_LCdwA()) && FontStyle.m4819equalsimpl0(fontStyle, FontStyle.INSTANCE.m4823getItalic_LCdwA())) {
            b = 1;
        }
        encode(b);
    }

    /* renamed from: encode-6p3vJLY, reason: not valid java name */
    public final void m4511encode6p3vJLY(int fontSynthesis) {
        byte b = 0;
        if (!FontSynthesis.m4828equalsimpl0(fontSynthesis, FontSynthesis.INSTANCE.m4835getNoneGVVA2EU())) {
            if (FontSynthesis.m4828equalsimpl0(fontSynthesis, FontSynthesis.INSTANCE.m4834getAllGVVA2EU())) {
                b = 1;
            } else if (FontSynthesis.m4828equalsimpl0(fontSynthesis, FontSynthesis.INSTANCE.m4837getWeightGVVA2EU())) {
                b = 2;
            } else if (FontSynthesis.m4828equalsimpl0(fontSynthesis, FontSynthesis.INSTANCE.m4836getStyleGVVA2EU())) {
                b = 3;
            }
        }
        byte value = b;
        encode(value);
    }

    /* renamed from: encode-4Dl_Bck, reason: not valid java name */
    public final void m4510encode4Dl_Bck(float baselineShift) {
        encode(baselineShift);
    }

    public final void encode(TextGeometricTransform textGeometricTransform) {
        Intrinsics.checkNotNullParameter(textGeometricTransform, "textGeometricTransform");
        encode(textGeometricTransform.getScaleX());
        encode(textGeometricTransform.getSkewX());
    }

    public final void encode(TextDecoration textDecoration) {
        Intrinsics.checkNotNullParameter(textDecoration, "textDecoration");
        encode(textDecoration.getMask());
    }

    public final void encode(Shadow shadow) {
        Intrinsics.checkNotNullParameter(shadow, "shadow");
        m4512encode8_81llA(shadow.getColor());
        encode(Offset.m2708getXimpl(shadow.getOffset()));
        encode(Offset.m2709getYimpl(shadow.getOffset()));
        encode(shadow.getBlurRadius());
    }

    public final void encode(byte r2) {
        this.parcel.writeByte(r2);
    }

    public final void encode(int r2) {
        this.parcel.writeInt(r2);
    }

    public final void encode(float r2) {
        this.parcel.writeFloat(r2);
    }

    /* renamed from: encode-VKZWuLQ, reason: not valid java name */
    public final void m4513encodeVKZWuLQ(long uLong) {
        this.parcel.writeLong(uLong);
    }

    public final void encode(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        this.parcel.writeString(string);
    }
}
