package androidx.compose.material3;

import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* compiled from: Switch.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jµ\u0001\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000bH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/material3/SwitchDefaults;", "", "()V", "IconSize", "Landroidx/compose/ui/unit/Dp;", "getIconSize-D9Ej5fM", "()F", "F", "colors", "Landroidx/compose/material3/SwitchColors;", "checkedThumbColor", "Landroidx/compose/ui/graphics/Color;", "checkedTrackColor", "checkedBorderColor", "checkedIconColor", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedBorderColor", "uncheckedIconColor", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledCheckedBorderColor", "disabledCheckedIconColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "disabledUncheckedBorderColor", "disabledUncheckedIconColor", "colors-V1nXRL4", "(JJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SwitchColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwitchDefaults {
    public static final int $stable = 0;
    public static final SwitchDefaults INSTANCE = new SwitchDefaults();
    private static final float IconSize = Dp.m5216constructorimpl(16);

    private SwitchDefaults() {
    }

    /* renamed from: colors-V1nXRL4, reason: not valid java name */
    public final SwitchColors m1812colorsV1nXRL4(long checkedThumbColor, long checkedTrackColor, long checkedBorderColor, long checkedIconColor, long uncheckedThumbColor, long uncheckedTrackColor, long uncheckedBorderColor, long uncheckedIconColor, long disabledCheckedThumbColor, long disabledCheckedTrackColor, long disabledCheckedBorderColor, long disabledCheckedIconColor, long disabledUncheckedThumbColor, long disabledUncheckedTrackColor, long disabledUncheckedBorderColor, long disabledUncheckedIconColor, Composer $composer, int $changed, int $changed1, int i) {
        long disabledCheckedThumbColor2;
        long disabledCheckedTrackColor2;
        long disabledCheckedIconColor2;
        long disabledUncheckedThumbColor2;
        long disabledUncheckedTrackColor2;
        long disabledUncheckedBorderColor2;
        long disabledUncheckedIconColor2;
        long m2945copywmQWz5c;
        long m2945copywmQWz5c2;
        long m2945copywmQWz5c3;
        long m2945copywmQWz5c4;
        long m2945copywmQWz5c5;
        long m2945copywmQWz5c6;
        long m2945copywmQWz5c7;
        $composer.startReplaceableGroup(1937926421);
        ComposerKt.sourceInformation($composer, "C(colors)P(2:c#ui.graphics.Color,3:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,14:c#ui.graphics.Color,15:c#ui.graphics.Color,12:c#ui.graphics.Color,13:c#ui.graphics.Color,6:c#ui.graphics.Color,7:c#ui.graphics.Color,4:c#ui.graphics.Color,5:c#ui.graphics.Color,10:c#ui.graphics.Color,11:c#ui.graphics.Color,8:c#ui.graphics.Color,9:c#ui.graphics.Color)284@11666L9,285@11744L9,287@11875L9,288@11958L9,289@12040L9,290@12135L9,291@12215L9,292@12310L9,294@12431L11,295@12536L9,297@12648L11,299@12814L9,301@12933L11,302@13043L9,304@13166L11,305@13275L9,307@13387L11,309@13516L9,311@13636L11,312@13743L9,314@13864L11:Switch.kt#uh7d8r");
        long checkedThumbColor2 = (i & 1) != 0 ? ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getSelectedHandleColor(), $composer, 6) : checkedThumbColor;
        long checkedTrackColor2 = (i & 2) != 0 ? ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getSelectedTrackColor(), $composer, 6) : checkedTrackColor;
        long checkedBorderColor2 = (i & 4) != 0 ? Color.INSTANCE.m2982getTransparent0d7_KjU() : checkedBorderColor;
        long checkedIconColor2 = (i & 8) != 0 ? ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getSelectedIconColor(), $composer, 6) : checkedIconColor;
        long uncheckedThumbColor2 = (i & 16) != 0 ? ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getUnselectedHandleColor(), $composer, 6) : uncheckedThumbColor;
        long uncheckedTrackColor2 = (i & 32) != 0 ? ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getUnselectedTrackColor(), $composer, 6) : uncheckedTrackColor;
        long uncheckedBorderColor2 = (i & 64) != 0 ? ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getUnselectedFocusTrackOutlineColor(), $composer, 6) : uncheckedBorderColor;
        long uncheckedIconColor2 = (i & 128) != 0 ? ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getUnselectedIconColor(), $composer, 6) : uncheckedIconColor;
        if ((i & 256) != 0) {
            m2945copywmQWz5c7 = Color.m2945copywmQWz5c(r7, (r12 & 1) != 0 ? Color.m2949getAlphaimpl(r7) : 1.0f, (r12 & 2) != 0 ? Color.m2953getRedimpl(r7) : 0.0f, (r12 & 4) != 0 ? Color.m2952getGreenimpl(r7) : 0.0f, (r12 & 8) != 0 ? Color.m2950getBlueimpl(ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getDisabledSelectedHandleColor(), $composer, 6)) : 0.0f);
            disabledCheckedThumbColor2 = ColorKt.m2992compositeOverOWjLjI(m2945copywmQWz5c7, MaterialTheme.INSTANCE.getColorScheme($composer, 6).m1376getSurface0d7_KjU());
        } else {
            disabledCheckedThumbColor2 = disabledCheckedThumbColor;
        }
        if ((i & 512) != 0) {
            m2945copywmQWz5c6 = Color.m2945copywmQWz5c(r7, (r12 & 1) != 0 ? Color.m2949getAlphaimpl(r7) : 0.12f, (r12 & 2) != 0 ? Color.m2953getRedimpl(r7) : 0.0f, (r12 & 4) != 0 ? Color.m2952getGreenimpl(r7) : 0.0f, (r12 & 8) != 0 ? Color.m2950getBlueimpl(ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getDisabledSelectedTrackColor(), $composer, 6)) : 0.0f);
            disabledCheckedTrackColor2 = ColorKt.m2992compositeOverOWjLjI(m2945copywmQWz5c6, MaterialTheme.INSTANCE.getColorScheme($composer, 6).m1376getSurface0d7_KjU());
        } else {
            disabledCheckedTrackColor2 = disabledCheckedTrackColor;
        }
        long disabledCheckedBorderColor2 = (i & 1024) != 0 ? Color.INSTANCE.m2982getTransparent0d7_KjU() : disabledCheckedBorderColor;
        if ((i & 2048) != 0) {
            m2945copywmQWz5c5 = Color.m2945copywmQWz5c(r7, (r12 & 1) != 0 ? Color.m2949getAlphaimpl(r7) : 0.38f, (r12 & 2) != 0 ? Color.m2953getRedimpl(r7) : 0.0f, (r12 & 4) != 0 ? Color.m2952getGreenimpl(r7) : 0.0f, (r12 & 8) != 0 ? Color.m2950getBlueimpl(ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getDisabledSelectedIconColor(), $composer, 6)) : 0.0f);
            disabledCheckedIconColor2 = ColorKt.m2992compositeOverOWjLjI(m2945copywmQWz5c5, MaterialTheme.INSTANCE.getColorScheme($composer, 6).m1376getSurface0d7_KjU());
        } else {
            disabledCheckedIconColor2 = disabledCheckedIconColor;
        }
        if ((i & 4096) != 0) {
            m2945copywmQWz5c4 = Color.m2945copywmQWz5c(r7, (r12 & 1) != 0 ? Color.m2949getAlphaimpl(r7) : 0.38f, (r12 & 2) != 0 ? Color.m2953getRedimpl(r7) : 0.0f, (r12 & 4) != 0 ? Color.m2952getGreenimpl(r7) : 0.0f, (r12 & 8) != 0 ? Color.m2950getBlueimpl(ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getDisabledUnselectedHandleColor(), $composer, 6)) : 0.0f);
            disabledUncheckedThumbColor2 = ColorKt.m2992compositeOverOWjLjI(m2945copywmQWz5c4, MaterialTheme.INSTANCE.getColorScheme($composer, 6).m1376getSurface0d7_KjU());
        } else {
            disabledUncheckedThumbColor2 = disabledUncheckedThumbColor;
        }
        if ((i & 8192) != 0) {
            m2945copywmQWz5c3 = Color.m2945copywmQWz5c(r7, (r12 & 1) != 0 ? Color.m2949getAlphaimpl(r7) : 0.12f, (r12 & 2) != 0 ? Color.m2953getRedimpl(r7) : 0.0f, (r12 & 4) != 0 ? Color.m2952getGreenimpl(r7) : 0.0f, (r12 & 8) != 0 ? Color.m2950getBlueimpl(ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getDisabledUnselectedTrackColor(), $composer, 6)) : 0.0f);
            disabledUncheckedTrackColor2 = ColorKt.m2992compositeOverOWjLjI(m2945copywmQWz5c3, MaterialTheme.INSTANCE.getColorScheme($composer, 6).m1376getSurface0d7_KjU());
        } else {
            disabledUncheckedTrackColor2 = disabledUncheckedTrackColor;
        }
        if ((i & 16384) != 0) {
            m2945copywmQWz5c2 = Color.m2945copywmQWz5c(r7, (r12 & 1) != 0 ? Color.m2949getAlphaimpl(r7) : 0.12f, (r12 & 2) != 0 ? Color.m2953getRedimpl(r7) : 0.0f, (r12 & 4) != 0 ? Color.m2952getGreenimpl(r7) : 0.0f, (r12 & 8) != 0 ? Color.m2950getBlueimpl(ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getDisabledUnselectedTrackOutlineColor(), $composer, 6)) : 0.0f);
            disabledUncheckedBorderColor2 = ColorKt.m2992compositeOverOWjLjI(m2945copywmQWz5c2, MaterialTheme.INSTANCE.getColorScheme($composer, 6).m1376getSurface0d7_KjU());
        } else {
            disabledUncheckedBorderColor2 = disabledUncheckedBorderColor;
        }
        if ((i & 32768) != 0) {
            m2945copywmQWz5c = Color.m2945copywmQWz5c(r7, (r12 & 1) != 0 ? Color.m2949getAlphaimpl(r7) : 0.38f, (r12 & 2) != 0 ? Color.m2953getRedimpl(r7) : 0.0f, (r12 & 4) != 0 ? Color.m2952getGreenimpl(r7) : 0.0f, (r12 & 8) != 0 ? Color.m2950getBlueimpl(ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getDisabledUnselectedIconColor(), $composer, 6)) : 0.0f);
            disabledUncheckedIconColor2 = ColorKt.m2992compositeOverOWjLjI(m2945copywmQWz5c, MaterialTheme.INSTANCE.getColorScheme($composer, 6).m1376getSurface0d7_KjU());
        } else {
            disabledUncheckedIconColor2 = disabledUncheckedIconColor;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1937926421, $changed, $changed1, "androidx.compose.material3.SwitchDefaults.colors (Switch.kt:283)");
        }
        SwitchColors switchColors = new SwitchColors(checkedThumbColor2, checkedTrackColor2, checkedBorderColor2, checkedIconColor2, uncheckedThumbColor2, uncheckedTrackColor2, uncheckedBorderColor2, uncheckedIconColor2, disabledCheckedThumbColor2, disabledCheckedTrackColor2, disabledCheckedBorderColor2, disabledCheckedIconColor2, disabledUncheckedThumbColor2, disabledUncheckedTrackColor2, disabledUncheckedBorderColor2, disabledUncheckedIconColor2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceableGroup();
        return switchColors;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1813getIconSizeD9Ej5fM() {
        return IconSize;
    }
}
