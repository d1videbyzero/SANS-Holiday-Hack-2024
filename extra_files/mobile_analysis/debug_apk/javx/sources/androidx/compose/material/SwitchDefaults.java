package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;

/* compiled from: Switch.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jy\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/SwitchDefaults;", "", "()V", "colors", "Landroidx/compose/material/SwitchColors;", "checkedThumbColor", "Landroidx/compose/ui/graphics/Color;", "checkedTrackColor", "checkedTrackAlpha", "", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedTrackAlpha", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "colors-SQMK_m0", "(JJFJJFJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material/SwitchColors;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwitchDefaults {
    public static final int $stable = 0;
    public static final SwitchDefaults INSTANCE = new SwitchDefaults();

    private SwitchDefaults() {
    }

    /* renamed from: colors-SQMK_m0, reason: not valid java name */
    public final SwitchColors m1208colorsSQMK_m0(long checkedThumbColor, long checkedTrackColor, float checkedTrackAlpha, long uncheckedThumbColor, long uncheckedTrackColor, float uncheckedTrackAlpha, long disabledCheckedThumbColor, long disabledCheckedTrackColor, long disabledUncheckedThumbColor, long disabledUncheckedTrackColor, Composer $composer, int $changed, int $changed1, int i) {
        long checkedThumbColor2;
        long disabledCheckedThumbColor2;
        long disabledCheckedThumbColor3;
        long disabledCheckedTrackColor2;
        long uncheckedThumbColor2;
        long disabledUncheckedThumbColor2;
        long disabledUncheckedTrackColor2;
        long m2945copywmQWz5c;
        long m2945copywmQWz5c2;
        long m2945copywmQWz5c3;
        long m2945copywmQWz5c4;
        long m2945copywmQWz5c5;
        long m2945copywmQWz5c6;
        long m2945copywmQWz5c7;
        long m2945copywmQWz5c8;
        $composer.startReplaceableGroup(-1032127534);
        ComposerKt.sourceInformation($composer, "C(colors)P(0:c#ui.graphics.Color,2:c#ui.graphics.Color!1,7:c#ui.graphics.Color,9:c#ui.graphics.Color,8,3:c#ui.graphics.Color,4:c#ui.graphics.Color,5:c#ui.graphics.Color,6:c#ui.graphics.Color)321@13073L6,324@13245L6,325@13312L6,328@13474L8,329@13525L6,331@13642L8,332@13693L6,334@13814L8,335@13865L6,337@13986L8,338@14037L6:Switch.kt#jmzs0o");
        long checkedThumbColor3 = (i & 1) != 0 ? MaterialTheme.INSTANCE.getColors($composer, 6).m1037getSecondaryVariant0d7_KjU() : checkedThumbColor;
        long checkedTrackColor2 = (i & 2) != 0 ? checkedThumbColor3 : checkedTrackColor;
        float checkedTrackAlpha2 = (i & 4) != 0 ? 0.54f : checkedTrackAlpha;
        long uncheckedThumbColor3 = (i & 8) != 0 ? MaterialTheme.INSTANCE.getColors($composer, 6).m1038getSurface0d7_KjU() : uncheckedThumbColor;
        long uncheckedTrackColor2 = (i & 16) != 0 ? MaterialTheme.INSTANCE.getColors($composer, 6).m1033getOnSurface0d7_KjU() : uncheckedTrackColor;
        float uncheckedTrackAlpha2 = (i & 32) != 0 ? 0.38f : uncheckedTrackAlpha;
        if ((i & 64) != 0) {
            m2945copywmQWz5c8 = Color.m2945copywmQWz5c(r29, (r12 & 1) != 0 ? Color.m2949getAlphaimpl(r29) : ContentAlpha.INSTANCE.getDisabled($composer, 6), (r12 & 2) != 0 ? Color.m2953getRedimpl(r29) : 0.0f, (r12 & 4) != 0 ? Color.m2952getGreenimpl(r29) : 0.0f, (r12 & 8) != 0 ? Color.m2950getBlueimpl(checkedThumbColor3) : 0.0f);
            checkedThumbColor2 = checkedThumbColor3;
            disabledCheckedThumbColor2 = ColorKt.m2992compositeOverOWjLjI(m2945copywmQWz5c8, MaterialTheme.INSTANCE.getColors($composer, 6).m1038getSurface0d7_KjU());
        } else {
            checkedThumbColor2 = checkedThumbColor3;
            disabledCheckedThumbColor2 = disabledCheckedThumbColor;
        }
        if ((i & 128) != 0) {
            m2945copywmQWz5c7 = Color.m2945copywmQWz5c(r29, (r12 & 1) != 0 ? Color.m2949getAlphaimpl(r29) : ContentAlpha.INSTANCE.getDisabled($composer, 6), (r12 & 2) != 0 ? Color.m2953getRedimpl(r29) : 0.0f, (r12 & 4) != 0 ? Color.m2952getGreenimpl(r29) : 0.0f, (r12 & 8) != 0 ? Color.m2950getBlueimpl(checkedTrackColor2) : 0.0f);
            disabledCheckedThumbColor3 = disabledCheckedThumbColor2;
            long disabledCheckedThumbColor4 = MaterialTheme.INSTANCE.getColors($composer, 6).m1038getSurface0d7_KjU();
            disabledCheckedTrackColor2 = ColorKt.m2992compositeOverOWjLjI(m2945copywmQWz5c7, disabledCheckedThumbColor4);
        } else {
            disabledCheckedThumbColor3 = disabledCheckedThumbColor2;
            disabledCheckedTrackColor2 = disabledCheckedTrackColor;
        }
        if ((i & 256) != 0) {
            m2945copywmQWz5c6 = Color.m2945copywmQWz5c(r29, (r12 & 1) != 0 ? Color.m2949getAlphaimpl(r29) : ContentAlpha.INSTANCE.getDisabled($composer, 6), (r12 & 2) != 0 ? Color.m2953getRedimpl(r29) : 0.0f, (r12 & 4) != 0 ? Color.m2952getGreenimpl(r29) : 0.0f, (r12 & 8) != 0 ? Color.m2950getBlueimpl(uncheckedThumbColor3) : 0.0f);
            uncheckedThumbColor2 = uncheckedThumbColor3;
            long uncheckedThumbColor4 = MaterialTheme.INSTANCE.getColors($composer, 6).m1038getSurface0d7_KjU();
            disabledUncheckedThumbColor2 = ColorKt.m2992compositeOverOWjLjI(m2945copywmQWz5c6, uncheckedThumbColor4);
        } else {
            uncheckedThumbColor2 = uncheckedThumbColor3;
            disabledUncheckedThumbColor2 = disabledUncheckedThumbColor;
        }
        if ((i & 512) != 0) {
            m2945copywmQWz5c5 = Color.m2945copywmQWz5c(r29, (r12 & 1) != 0 ? Color.m2949getAlphaimpl(r29) : ContentAlpha.INSTANCE.getDisabled($composer, 6), (r12 & 2) != 0 ? Color.m2953getRedimpl(r29) : 0.0f, (r12 & 4) != 0 ? Color.m2952getGreenimpl(r29) : 0.0f, (r12 & 8) != 0 ? Color.m2950getBlueimpl(uncheckedTrackColor2) : 0.0f);
            disabledUncheckedTrackColor2 = ColorKt.m2992compositeOverOWjLjI(m2945copywmQWz5c5, MaterialTheme.INSTANCE.getColors($composer, 6).m1038getSurface0d7_KjU());
        } else {
            disabledUncheckedTrackColor2 = disabledUncheckedTrackColor;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1032127534, $changed, $changed1, "androidx.compose.material.SwitchDefaults.colors (Switch.kt:320)");
        }
        m2945copywmQWz5c = Color.m2945copywmQWz5c(r30, (r12 & 1) != 0 ? Color.m2949getAlphaimpl(r30) : checkedTrackAlpha2, (r12 & 2) != 0 ? Color.m2953getRedimpl(r30) : 0.0f, (r12 & 4) != 0 ? Color.m2952getGreenimpl(r30) : 0.0f, (r12 & 8) != 0 ? Color.m2950getBlueimpl(checkedTrackColor2) : 0.0f);
        m2945copywmQWz5c2 = Color.m2945copywmQWz5c(r34, (r12 & 1) != 0 ? Color.m2949getAlphaimpl(r34) : uncheckedTrackAlpha2, (r12 & 2) != 0 ? Color.m2953getRedimpl(r34) : 0.0f, (r12 & 4) != 0 ? Color.m2952getGreenimpl(r34) : 0.0f, (r12 & 8) != 0 ? Color.m2950getBlueimpl(uncheckedTrackColor2) : 0.0f);
        m2945copywmQWz5c3 = Color.m2945copywmQWz5c(r38, (r12 & 1) != 0 ? Color.m2949getAlphaimpl(r38) : checkedTrackAlpha2, (r12 & 2) != 0 ? Color.m2953getRedimpl(r38) : 0.0f, (r12 & 4) != 0 ? Color.m2952getGreenimpl(r38) : 0.0f, (r12 & 8) != 0 ? Color.m2950getBlueimpl(disabledCheckedTrackColor2) : 0.0f);
        m2945copywmQWz5c4 = Color.m2945copywmQWz5c(r14, (r12 & 1) != 0 ? Color.m2949getAlphaimpl(r14) : uncheckedTrackAlpha2, (r12 & 2) != 0 ? Color.m2953getRedimpl(r14) : 0.0f, (r12 & 4) != 0 ? Color.m2952getGreenimpl(r14) : 0.0f, (r12 & 8) != 0 ? Color.m2950getBlueimpl(disabledUncheckedTrackColor2) : 0.0f);
        DefaultSwitchColors defaultSwitchColors = new DefaultSwitchColors(checkedThumbColor2, m2945copywmQWz5c, uncheckedThumbColor2, m2945copywmQWz5c2, disabledCheckedThumbColor3, m2945copywmQWz5c3, disabledUncheckedThumbColor2, m2945copywmQWz5c4, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceableGroup();
        return defaultSwitchColors;
    }
}
