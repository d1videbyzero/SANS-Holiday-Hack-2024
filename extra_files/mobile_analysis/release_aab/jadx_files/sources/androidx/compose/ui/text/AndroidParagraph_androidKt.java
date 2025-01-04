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
    public static final int m4278toLayoutAlignAMY3VfE(TextAlign textAlign) {
        int m4775getLefte0LSkKk = TextAlign.INSTANCE.m4775getLefte0LSkKk();
        if (textAlign != null && TextAlign.m4768equalsimpl0(textAlign.getValue(), m4775getLefte0LSkKk)) {
            return 3;
        }
        int m4776getRighte0LSkKk = TextAlign.INSTANCE.m4776getRighte0LSkKk();
        if (textAlign != null && TextAlign.m4768equalsimpl0(textAlign.getValue(), m4776getRighte0LSkKk)) {
            return 4;
        }
        int m4772getCentere0LSkKk = TextAlign.INSTANCE.m4772getCentere0LSkKk();
        if (textAlign != null && TextAlign.m4768equalsimpl0(textAlign.getValue(), m4772getCentere0LSkKk)) {
            return 2;
        }
        int m4777getStarte0LSkKk = TextAlign.INSTANCE.m4777getStarte0LSkKk();
        if (textAlign == null || !TextAlign.m4768equalsimpl0(textAlign.getValue(), m4777getStarte0LSkKk)) {
            int m4773getEnde0LSkKk = TextAlign.INSTANCE.m4773getEnde0LSkKk();
            if (textAlign != null && TextAlign.m4768equalsimpl0(textAlign.getValue(), m4773getEnde0LSkKk)) {
                return 1;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutHyphenationFrequency-0_XeFpE, reason: not valid java name */
    public static final int m4280toLayoutHyphenationFrequency0_XeFpE(Hyphens hyphens) {
        int m4691getAutovmbZdU8 = Hyphens.INSTANCE.m4691getAutovmbZdU8();
        if (hyphens != null && Hyphens.m4687equalsimpl0(hyphens.getValue(), m4691getAutovmbZdU8)) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        int m4692getNonevmbZdU8 = Hyphens.INSTANCE.m4692getNonevmbZdU8();
        if (hyphens != null) {
            Hyphens.m4687equalsimpl0(hyphens.getValue(), m4692getNonevmbZdU8);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutBreakStrategy-u6PBz3U, reason: not valid java name */
    public static final int m4279toLayoutBreakStrategyu6PBz3U(LineBreak.Strategy strategy) {
        int m4718getSimplefcGXIks = LineBreak.Strategy.INSTANCE.m4718getSimplefcGXIks();
        if (strategy != null && LineBreak.Strategy.m4712equalsimpl0(strategy.getValue(), m4718getSimplefcGXIks)) {
            return 0;
        }
        int m4717getHighQualityfcGXIks = LineBreak.Strategy.INSTANCE.m4717getHighQualityfcGXIks();
        if (strategy != null && LineBreak.Strategy.m4712equalsimpl0(strategy.getValue(), m4717getHighQualityfcGXIks)) {
            return 1;
        }
        return (strategy != null && LineBreak.Strategy.m4712equalsimpl0(strategy.getValue(), LineBreak.Strategy.INSTANCE.m4716getBalancedfcGXIks())) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakStyle-4a2g8L8, reason: not valid java name */
    public static final int m4281toLayoutLineBreakStyle4a2g8L8(LineBreak.Strictness strictness) {
        int m4726getDefaultusljTpc = LineBreak.Strictness.INSTANCE.m4726getDefaultusljTpc();
        if (strictness != null && LineBreak.Strictness.m4722equalsimpl0(strictness.getValue(), m4726getDefaultusljTpc)) {
            return 0;
        }
        int m4727getLooseusljTpc = LineBreak.Strictness.INSTANCE.m4727getLooseusljTpc();
        if (strictness != null && LineBreak.Strictness.m4722equalsimpl0(strictness.getValue(), m4727getLooseusljTpc)) {
            return 1;
        }
        int m4728getNormalusljTpc = LineBreak.Strictness.INSTANCE.m4728getNormalusljTpc();
        if (strictness != null && LineBreak.Strictness.m4722equalsimpl0(strictness.getValue(), m4728getNormalusljTpc)) {
            return 2;
        }
        return (strictness != null && LineBreak.Strictness.m4722equalsimpl0(strictness.getValue(), LineBreak.Strictness.INSTANCE.m4729getStrictusljTpc())) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakWordStyle-gvcdTPQ, reason: not valid java name */
    public static final int m4282toLayoutLineBreakWordStylegvcdTPQ(LineBreak.WordBreak wordBreak) {
        int m4737getDefaultjp8hJ3c = LineBreak.WordBreak.INSTANCE.m4737getDefaultjp8hJ3c();
        if (wordBreak != null && LineBreak.WordBreak.m4733equalsimpl0(wordBreak.getValue(), m4737getDefaultjp8hJ3c)) {
            return 0;
        }
        return (wordBreak != null && LineBreak.WordBreak.m4733equalsimpl0(wordBreak.getValue(), LineBreak.WordBreak.INSTANCE.m4738getPhrasejp8hJ3c())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int numberOfLinesThatFitMaxHeight(TextLayout textLayout, int i) {
        int lineCount = textLayout.getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            if (textLayout.getLineBottom(i2) > i) {
                return i2;
            }
        }
        return textLayout.getLineCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldAttachIndentationFixSpan(TextStyle textStyle, boolean z) {
        if (!z || TextUnit.m5056equalsimpl0(textStyle.m4434getLetterSpacingXSAIIZE(), TextUnitKt.getSp(0)) || TextUnit.m5056equalsimpl0(textStyle.m4434getLetterSpacingXSAIIZE(), TextUnit.INSTANCE.m5070getUnspecifiedXSAIIZE()) || textStyle.m4437getTextAlignbuA522U() == null) {
            return false;
        }
        TextAlign m4437getTextAlignbuA522U = textStyle.m4437getTextAlignbuA522U();
        int m4777getStarte0LSkKk = TextAlign.INSTANCE.m4777getStarte0LSkKk();
        if (m4437getTextAlignbuA522U != null && TextAlign.m4768equalsimpl0(m4437getTextAlignbuA522U.getValue(), m4777getStarte0LSkKk)) {
            return false;
        }
        TextAlign m4437getTextAlignbuA522U2 = textStyle.m4437getTextAlignbuA522U();
        return m4437getTextAlignbuA522U2 == null || !TextAlign.m4768equalsimpl0(m4437getTextAlignbuA522U2.getValue(), TextAlign.INSTANCE.m4774getJustifye0LSkKk());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence attachIndentationFixSpan(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        SpannableString spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
        SpannableExtensions_androidKt.setSpan(spannableString, new IndentationFixSpan(), spannableString.length() - 1, spannableString.length() - 1);
        return spannableString;
    }
}
