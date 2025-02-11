package androidx.compose.ui.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.style.IndentationFixSpan;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;

/* compiled from: AndroidParagraph.android.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\u001d\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\t\u001a\u001d\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\r\u001a\u001d\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u0011\u001a\u001d\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u0015\u001a\u001d\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u0019\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\u001bH\u0002\u001a\u0014\u0010\u001c\u001a\u00020\u0006*\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0006H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"shouldAttachIndentationFixSpan", "", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "ellipsis", "toLayoutAlign", "", "align", "Landroidx/compose/ui/text/style/TextAlign;", "toLayoutAlign-AMY3VfE", "toLayoutBreakStrategy", "breakStrategy", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "toLayoutBreakStrategy-u6PBz3U", "toLayoutHyphenationFrequency", "hyphens", "Landroidx/compose/ui/text/style/Hyphens;", "toLayoutHyphenationFrequency-0_XeFpE", "toLayoutLineBreakStyle", "lineBreakStrictness", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "toLayoutLineBreakStyle-4a2g8L8", "toLayoutLineBreakWordStyle", "lineBreakWordStyle", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "toLayoutLineBreakWordStyle-gvcdTPQ", "attachIndentationFixSpan", "", "numberOfLinesThatFitMaxHeight", "Landroidx/compose/ui/text/android/TextLayout;", "maxHeight", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidParagraph_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutAlign-AMY3VfE, reason: not valid java name */
    public static final int m4594toLayoutAlignAMY3VfE(TextAlign align) {
        if (align == null ? false : TextAlign.m5084equalsimpl0(align.getValue(), TextAlign.INSTANCE.m5091getLefte0LSkKk())) {
            return 3;
        }
        if (align == null ? false : TextAlign.m5084equalsimpl0(align.getValue(), TextAlign.INSTANCE.m5092getRighte0LSkKk())) {
            return 4;
        }
        if (align == null ? false : TextAlign.m5084equalsimpl0(align.getValue(), TextAlign.INSTANCE.m5088getCentere0LSkKk())) {
            return 2;
        }
        if (align == null ? false : TextAlign.m5084equalsimpl0(align.getValue(), TextAlign.INSTANCE.m5093getStarte0LSkKk())) {
            return 0;
        }
        return align == null ? false : TextAlign.m5084equalsimpl0(align.getValue(), TextAlign.INSTANCE.m5089getEnde0LSkKk()) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutHyphenationFrequency-0_XeFpE, reason: not valid java name */
    public static final int m4596toLayoutHyphenationFrequency0_XeFpE(Hyphens hyphens) {
        if (hyphens == null ? false : Hyphens.m5003equalsimpl0(hyphens.getValue(), Hyphens.INSTANCE.m5007getAutovmbZdU8())) {
            if (Build.VERSION.SDK_INT <= 32) {
                return 2;
            }
            return 4;
        }
        int m5008getNonevmbZdU8 = Hyphens.INSTANCE.m5008getNonevmbZdU8();
        if (hyphens == null) {
            return 0;
        }
        Hyphens.m5003equalsimpl0(hyphens.getValue(), m5008getNonevmbZdU8);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutBreakStrategy-u6PBz3U, reason: not valid java name */
    public static final int m4595toLayoutBreakStrategyu6PBz3U(LineBreak.Strategy breakStrategy) {
        if (breakStrategy == null ? false : LineBreak.Strategy.m5028equalsimpl0(breakStrategy.getValue(), LineBreak.Strategy.INSTANCE.m5034getSimplefcGXIks())) {
            return 0;
        }
        if (breakStrategy == null ? false : LineBreak.Strategy.m5028equalsimpl0(breakStrategy.getValue(), LineBreak.Strategy.INSTANCE.m5033getHighQualityfcGXIks())) {
            return 1;
        }
        return breakStrategy == null ? false : LineBreak.Strategy.m5028equalsimpl0(breakStrategy.getValue(), LineBreak.Strategy.INSTANCE.m5032getBalancedfcGXIks()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakStyle-4a2g8L8, reason: not valid java name */
    public static final int m4597toLayoutLineBreakStyle4a2g8L8(LineBreak.Strictness lineBreakStrictness) {
        if (lineBreakStrictness == null ? false : LineBreak.Strictness.m5038equalsimpl0(lineBreakStrictness.getValue(), LineBreak.Strictness.INSTANCE.m5042getDefaultusljTpc())) {
            return 0;
        }
        if (lineBreakStrictness == null ? false : LineBreak.Strictness.m5038equalsimpl0(lineBreakStrictness.getValue(), LineBreak.Strictness.INSTANCE.m5043getLooseusljTpc())) {
            return 1;
        }
        if (lineBreakStrictness == null ? false : LineBreak.Strictness.m5038equalsimpl0(lineBreakStrictness.getValue(), LineBreak.Strictness.INSTANCE.m5044getNormalusljTpc())) {
            return 2;
        }
        return lineBreakStrictness == null ? false : LineBreak.Strictness.m5038equalsimpl0(lineBreakStrictness.getValue(), LineBreak.Strictness.INSTANCE.m5045getStrictusljTpc()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakWordStyle-gvcdTPQ, reason: not valid java name */
    public static final int m4598toLayoutLineBreakWordStylegvcdTPQ(LineBreak.WordBreak lineBreakWordStyle) {
        if (lineBreakWordStyle == null ? false : LineBreak.WordBreak.m5049equalsimpl0(lineBreakWordStyle.getValue(), LineBreak.WordBreak.INSTANCE.m5053getDefaultjp8hJ3c())) {
            return 0;
        }
        return lineBreakWordStyle == null ? false : LineBreak.WordBreak.m5049equalsimpl0(lineBreakWordStyle.getValue(), LineBreak.WordBreak.INSTANCE.m5054getPhrasejp8hJ3c()) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int numberOfLinesThatFitMaxHeight(TextLayout $this$numberOfLinesThatFitMaxHeight, int maxHeight) {
        int lineCount = $this$numberOfLinesThatFitMaxHeight.getLineCount();
        for (int lineIndex = 0; lineIndex < lineCount; lineIndex++) {
            if ($this$numberOfLinesThatFitMaxHeight.getLineBottom(lineIndex) > maxHeight) {
                return lineIndex;
            }
        }
        int lineIndex2 = $this$numberOfLinesThatFitMaxHeight.getLineCount();
        return lineIndex2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldAttachIndentationFixSpan(TextStyle textStyle, boolean ellipsis) {
        if (ellipsis && !TextUnit.m5394equalsimpl0(textStyle.m4750getLetterSpacingXSAIIZE(), TextUnitKt.getSp(0)) && !TextUnit.m5394equalsimpl0(textStyle.m4750getLetterSpacingXSAIIZE(), TextUnit.INSTANCE.m5408getUnspecifiedXSAIIZE()) && textStyle.m4753getTextAlignbuA522U() != null) {
            TextAlign m4753getTextAlignbuA522U = textStyle.m4753getTextAlignbuA522U();
            if (!(m4753getTextAlignbuA522U == null ? false : TextAlign.m5084equalsimpl0(m4753getTextAlignbuA522U.getValue(), TextAlign.INSTANCE.m5093getStarte0LSkKk()))) {
                TextAlign m4753getTextAlignbuA522U2 = textStyle.m4753getTextAlignbuA522U();
                return !(m4753getTextAlignbuA522U2 == null ? false : TextAlign.m5084equalsimpl0(m4753getTextAlignbuA522U2.getValue(), TextAlign.INSTANCE.m5090getJustifye0LSkKk()));
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence attachIndentationFixSpan(CharSequence $this$attachIndentationFixSpan) {
        if ($this$attachIndentationFixSpan.length() == 0) {
            return $this$attachIndentationFixSpan;
        }
        SpannableString spannable = $this$attachIndentationFixSpan instanceof Spannable ? (Spannable) $this$attachIndentationFixSpan : new SpannableString($this$attachIndentationFixSpan);
        SpannableExtensions_androidKt.setSpan(spannable, new IndentationFixSpan(), spannable.length() - 1, spannable.length() - 1);
        return spannable;
    }
}
