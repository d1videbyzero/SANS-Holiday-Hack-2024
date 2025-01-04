package androidx.compose.material3;

import androidx.compose.material3.tokens.SuggestionChipTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;

/* compiled from: Chip.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JQ\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u0011H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JQ\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J3\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010&\u001a\u00020\u00112\b\b\u0002\u0010'\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)JQ\u0010*\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u0011H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010\u0018JQ\u0010,\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010\"R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/material3/SuggestionChipDefaults;", "", "()V", "Height", "Landroidx/compose/ui/unit/Dp;", "getHeight-D9Ej5fM", "()F", "F", "IconSize", "getIconSize-D9Ej5fM", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "elevatedSuggestionChipColors", "Landroidx/compose/material3/ChipColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "labelColor", "iconContentColor", "disabledContainerColor", "disabledLabelColor", "disabledIconContentColor", "elevatedSuggestionChipColors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipColors;", "elevatedSuggestionChipElevation", "Landroidx/compose/material3/ChipElevation;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "elevatedSuggestionChipElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;", "suggestionChipBorder", "Landroidx/compose/material3/ChipBorder;", "borderColor", "disabledBorderColor", "borderWidth", "suggestionChipBorder-d_3_b6Q", "(JJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipBorder;", "suggestionChipColors", "suggestionChipColors-5tl4gsc", "suggestionChipElevation", "suggestionChipElevation-aqJV_2Y", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuggestionChipDefaults {
    public static final int $stable = 0;
    public static final SuggestionChipDefaults INSTANCE = new SuggestionChipDefaults();
    private static final float Height = SuggestionChipTokens.INSTANCE.m2445getContainerHeightD9Ej5fM();
    private static final float IconSize = SuggestionChipTokens.INSTANCE.m2454getLeadingIconSizeD9Ej5fM();

    private SuggestionChipDefaults() {
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m1787getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1788getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: suggestionChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m1790suggestionChipColors5tl4gsc(long containerColor, long labelColor, long iconContentColor, long disabledContainerColor, long disabledLabelColor, long disabledIconContentColor, Composer $composer, int $changed, int i) {
        long disabledLabelColor2;
        long disabledIconContentColor2;
        long m2945copywmQWz5c;
        long m2945copywmQWz5c2;
        $composer.startReplaceableGroup(1882647883);
        ComposerKt.sourceInformation($composer, "C(suggestionChipColors)P(0:c#ui.graphics.Color,5:c#ui.graphics.Color,4:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.graphics.Color,2:c#ui.graphics.Color)1165@59051L9,1166@59134L9,1168@59284L9,1170@59456L9:Chip.kt#uh7d8r");
        long containerColor2 = (i & 1) != 0 ? Color.INSTANCE.m2982getTransparent0d7_KjU() : containerColor;
        long labelColor2 = (i & 2) != 0 ? ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getLabelTextColor(), $composer, 6) : labelColor;
        long iconContentColor2 = (i & 4) != 0 ? ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getLeadingIconColor(), $composer, 6) : iconContentColor;
        long disabledContainerColor2 = (i & 8) != 0 ? Color.INSTANCE.m2982getTransparent0d7_KjU() : disabledContainerColor;
        if ((i & 16) != 0) {
            m2945copywmQWz5c2 = Color.m2945copywmQWz5c(r6, (r12 & 1) != 0 ? Color.m2949getAlphaimpl(r6) : 0.38f, (r12 & 2) != 0 ? Color.m2953getRedimpl(r6) : 0.0f, (r12 & 4) != 0 ? Color.m2952getGreenimpl(r6) : 0.0f, (r12 & 8) != 0 ? Color.m2950getBlueimpl(ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getDisabledLabelTextColor(), $composer, 6)) : 0.0f);
            disabledLabelColor2 = m2945copywmQWz5c2;
        } else {
            disabledLabelColor2 = disabledLabelColor;
        }
        if ((i & 32) != 0) {
            m2945copywmQWz5c = Color.m2945copywmQWz5c(r4, (r12 & 1) != 0 ? Color.m2949getAlphaimpl(r4) : 0.38f, (r12 & 2) != 0 ? Color.m2953getRedimpl(r4) : 0.0f, (r12 & 4) != 0 ? Color.m2952getGreenimpl(r4) : 0.0f, (r12 & 8) != 0 ? Color.m2950getBlueimpl(ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getDisabledLeadingIconColor(), $composer, 6)) : 0.0f);
            disabledIconContentColor2 = m2945copywmQWz5c;
        } else {
            disabledIconContentColor2 = disabledIconContentColor;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1882647883, $changed, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipColors (Chip.kt:1163)");
        }
        ChipColors chipColors = new ChipColors(containerColor2, labelColor2, iconContentColor2, Color.INSTANCE.m2983getUnspecified0d7_KjU(), disabledContainerColor2, disabledLabelColor2, disabledIconContentColor2, Color.INSTANCE.m2983getUnspecified0d7_KjU(), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceableGroup();
        return chipColors;
    }

    /* renamed from: suggestionChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m1791suggestionChipElevationaqJV_2Y(float elevation, float pressedElevation, float focusedElevation, float hoveredElevation, float draggedElevation, float disabledElevation, Composer $composer, int $changed, int i) {
        $composer.startReplaceableGroup(1929994057);
        ComposerKt.sourceInformation($composer, "C(suggestionChipElevation)P(2:c#ui.unit.Dp,5:c#ui.unit.Dp,3:c#ui.unit.Dp,4:c#ui.unit.Dp,1:c#ui.unit.Dp,0:c#ui.unit.Dp):Chip.kt#uh7d8r");
        float elevation2 = (i & 1) != 0 ? SuggestionChipTokens.INSTANCE.m2452getFlatContainerElevationD9Ej5fM() : elevation;
        float pressedElevation2 = (i & 2) != 0 ? elevation2 : pressedElevation;
        float focusedElevation2 = (i & 4) != 0 ? elevation2 : focusedElevation;
        float hoveredElevation2 = (i & 8) != 0 ? elevation2 : hoveredElevation;
        float draggedElevation2 = (i & 16) != 0 ? SuggestionChipTokens.INSTANCE.m2446getDraggedContainerElevationD9Ej5fM() : draggedElevation;
        float disabledElevation2 = (i & 32) != 0 ? elevation2 : disabledElevation;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1929994057, $changed, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipElevation (Chip.kt:1196)");
        }
        ChipElevation chipElevation = new ChipElevation(elevation2, pressedElevation2, focusedElevation2, hoveredElevation2, draggedElevation2, disabledElevation2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceableGroup();
        return chipElevation;
    }

    /* renamed from: suggestionChipBorder-d_3_b6Q, reason: not valid java name */
    public final ChipBorder m1789suggestionChipBorderd_3_b6Q(long borderColor, long disabledBorderColor, float borderWidth, Composer $composer, int $changed, int i) {
        $composer.startReplaceableGroup(439283919);
        ComposerKt.sourceInformation($composer, "C(suggestionChipBorder)P(0:c#ui.graphics.Color,2:c#ui.graphics.Color,1:c#ui.unit.Dp)1221@61762L9,1222@61856L9:Chip.kt#uh7d8r");
        long borderColor2 = (i & 1) != 0 ? ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getFlatOutlineColor(), $composer, 6) : borderColor;
        long disabledBorderColor2 = (i & 2) != 0 ? Color.m2945copywmQWz5c(r6, (r12 & 1) != 0 ? Color.m2949getAlphaimpl(r6) : 0.12f, (r12 & 2) != 0 ? Color.m2953getRedimpl(r6) : 0.0f, (r12 & 4) != 0 ? Color.m2952getGreenimpl(r6) : 0.0f, (r12 & 8) != 0 ? Color.m2950getBlueimpl(ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getFlatDisabledOutlineColor(), $composer, 6)) : 0.0f) : disabledBorderColor;
        float borderWidth2 = (i & 4) != 0 ? SuggestionChipTokens.INSTANCE.m2453getFlatOutlineWidthD9Ej5fM() : borderWidth;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(439283919, $changed, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipBorder (Chip.kt:1220)");
        }
        ChipBorder chipBorder = new ChipBorder(borderColor2, disabledBorderColor2, borderWidth2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceableGroup();
        return chipBorder;
    }

    /* renamed from: elevatedSuggestionChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m1785elevatedSuggestionChipColors5tl4gsc(long containerColor, long labelColor, long iconContentColor, long disabledContainerColor, long disabledLabelColor, long disabledIconContentColor, Composer $composer, int $changed, int i) {
        long disabledContainerColor2;
        long disabledLabelColor2;
        long m2945copywmQWz5c;
        long m2945copywmQWz5c2;
        $composer.startReplaceableGroup(1269423125);
        ComposerKt.sourceInformation($composer, "C(elevatedSuggestionChipColors)P(0:c#ui.graphics.Color,5:c#ui.graphics.Color,4:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.graphics.Color,2:c#ui.graphics.Color)1244@62924L9,1245@62999L9,1248@63184L11,1250@63318L9,1252@63494L9,1255@63701L11:Chip.kt#uh7d8r");
        long containerColor2 = (i & 1) != 0 ? ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getElevatedContainerColor(), $composer, 6) : containerColor;
        long labelColor2 = (i & 2) != 0 ? ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getLabelTextColor(), $composer, 6) : labelColor;
        long iconContentColor2 = (i & 4) != 0 ? MaterialTheme.INSTANCE.getColorScheme($composer, 6).m1366getOnSurfaceVariant0d7_KjU() : iconContentColor;
        if ((i & 8) != 0) {
            m2945copywmQWz5c2 = Color.m2945copywmQWz5c(r6, (r12 & 1) != 0 ? Color.m2949getAlphaimpl(r6) : 0.12f, (r12 & 2) != 0 ? Color.m2953getRedimpl(r6) : 0.0f, (r12 & 4) != 0 ? Color.m2952getGreenimpl(r6) : 0.0f, (r12 & 8) != 0 ? Color.m2950getBlueimpl(ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getElevatedDisabledContainerColor(), $composer, 6)) : 0.0f);
            disabledContainerColor2 = m2945copywmQWz5c2;
        } else {
            disabledContainerColor2 = disabledContainerColor;
        }
        if ((i & 16) != 0) {
            m2945copywmQWz5c = Color.m2945copywmQWz5c(r6, (r12 & 1) != 0 ? Color.m2949getAlphaimpl(r6) : 0.38f, (r12 & 2) != 0 ? Color.m2953getRedimpl(r6) : 0.0f, (r12 & 4) != 0 ? Color.m2952getGreenimpl(r6) : 0.0f, (r12 & 8) != 0 ? Color.m2950getBlueimpl(ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getDisabledLabelTextColor(), $composer, 6)) : 0.0f);
            disabledLabelColor2 = m2945copywmQWz5c;
        } else {
            disabledLabelColor2 = disabledLabelColor;
        }
        long disabledIconContentColor2 = (i & 32) != 0 ? Color.m2945copywmQWz5c(r2, (r12 & 1) != 0 ? Color.m2949getAlphaimpl(r2) : 0.38f, (r12 & 2) != 0 ? Color.m2953getRedimpl(r2) : 0.0f, (r12 & 4) != 0 ? Color.m2952getGreenimpl(r2) : 0.0f, (r12 & 8) != 0 ? Color.m2950getBlueimpl(MaterialTheme.INSTANCE.getColorScheme($composer, 6).m1365getOnSurface0d7_KjU()) : 0.0f) : disabledIconContentColor;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1269423125, $changed, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipColors (Chip.kt:1243)");
        }
        ChipColors chipColors = new ChipColors(containerColor2, labelColor2, iconContentColor2, Color.INSTANCE.m2983getUnspecified0d7_KjU(), disabledContainerColor2, disabledLabelColor2, disabledIconContentColor2, Color.INSTANCE.m2983getUnspecified0d7_KjU(), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceableGroup();
        return chipColors;
    }

    /* renamed from: elevatedSuggestionChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m1786elevatedSuggestionChipElevationaqJV_2Y(float elevation, float pressedElevation, float focusedElevation, float hoveredElevation, float draggedElevation, float disabledElevation, Composer $composer, int $changed, int i) {
        $composer.startReplaceableGroup(1118088467);
        ComposerKt.sourceInformation($composer, "C(elevatedSuggestionChipElevation)P(2:c#ui.unit.Dp,5:c#ui.unit.Dp,3:c#ui.unit.Dp,4:c#ui.unit.Dp,1:c#ui.unit.Dp,0:c#ui.unit.Dp):Chip.kt#uh7d8r");
        float elevation2 = (i & 1) != 0 ? SuggestionChipTokens.INSTANCE.m2447getElevatedContainerElevationD9Ej5fM() : elevation;
        float pressedElevation2 = (i & 2) != 0 ? SuggestionChipTokens.INSTANCE.m2451getElevatedPressedContainerElevationD9Ej5fM() : pressedElevation;
        float focusedElevation2 = (i & 4) != 0 ? SuggestionChipTokens.INSTANCE.m2449getElevatedFocusContainerElevationD9Ej5fM() : focusedElevation;
        float hoveredElevation2 = (i & 8) != 0 ? SuggestionChipTokens.INSTANCE.m2450getElevatedHoverContainerElevationD9Ej5fM() : hoveredElevation;
        float draggedElevation2 = (i & 16) != 0 ? SuggestionChipTokens.INSTANCE.m2446getDraggedContainerElevationD9Ej5fM() : draggedElevation;
        float disabledElevation2 = (i & 32) != 0 ? SuggestionChipTokens.INSTANCE.m2448getElevatedDisabledContainerElevationD9Ej5fM() : disabledElevation;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1118088467, $changed, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipElevation (Chip.kt:1280)");
        }
        ChipElevation chipElevation = new ChipElevation(elevation2, pressedElevation2, focusedElevation2, hoveredElevation2, draggedElevation2, disabledElevation2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceableGroup();
        return chipElevation;
    }

    public final Shape getShape(Composer $composer, int $changed) {
        $composer.startReplaceableGroup(641188183);
        ComposerKt.sourceInformation($composer, "C1297@65835L9:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(641188183, $changed, -1, "androidx.compose.material3.SuggestionChipDefaults.<get-shape> (Chip.kt:1297)");
        }
        Shape shape = ShapesKt.toShape(SuggestionChipTokens.INSTANCE.getContainerShape(), $composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceableGroup();
        return shape;
    }
}
