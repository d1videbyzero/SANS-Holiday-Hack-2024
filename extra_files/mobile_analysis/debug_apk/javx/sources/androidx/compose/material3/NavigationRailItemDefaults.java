package androidx.compose.material3;

import androidx.compose.material3.tokens.NavigationRailTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;

/* compiled from: NavigationRail.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JG\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ[\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/material3/NavigationRailItemDefaults;", "", "()V", "colors", "Landroidx/compose/material3/NavigationRailItemColors;", "selectedIconColor", "Landroidx/compose/ui/graphics/Color;", "selectedTextColor", "indicatorColor", "unselectedIconColor", "unselectedTextColor", "colors-zjMxDiM", "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationRailItemColors;", "disabledIconColor", "disabledTextColor", "colors-69fazGs", "(JJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationRailItemColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationRailItemDefaults {
    public static final int $stable = 0;
    public static final NavigationRailItemDefaults INSTANCE = new NavigationRailItemDefaults();

    private NavigationRailItemDefaults() {
    }

    /* renamed from: colors-69fazGs, reason: not valid java name */
    public final NavigationRailItemColors m1626colors69fazGs(long selectedIconColor, long selectedTextColor, long indicatorColor, long unselectedIconColor, long unselectedTextColor, long disabledIconColor, long disabledTextColor, Composer $composer, int $changed, int i) {
        long disabledIconColor2;
        long disabledTextColor2;
        long m2945copywmQWz5c;
        long m2945copywmQWz5c2;
        $composer.startReplaceableGroup(-2104358508);
        ComposerKt.sourceInformation($composer, "C(colors)P(3:c#ui.graphics.Color,4:c#ui.graphics.Color,2:c#ui.graphics.Color,5:c#ui.graphics.Color,6:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color)291@12767L9,292@12855L9,293@12940L9,294@13027L9,295@13119L9:NavigationRail.kt#uh7d8r");
        long selectedIconColor2 = (i & 1) != 0 ? ColorSchemeKt.toColor(NavigationRailTokens.INSTANCE.getActiveIconColor(), $composer, 6) : selectedIconColor;
        long selectedTextColor2 = (i & 2) != 0 ? ColorSchemeKt.toColor(NavigationRailTokens.INSTANCE.getActiveLabelTextColor(), $composer, 6) : selectedTextColor;
        long indicatorColor2 = (i & 4) != 0 ? ColorSchemeKt.toColor(NavigationRailTokens.INSTANCE.getActiveIndicatorColor(), $composer, 6) : indicatorColor;
        long unselectedIconColor2 = (i & 8) != 0 ? ColorSchemeKt.toColor(NavigationRailTokens.INSTANCE.getInactiveIconColor(), $composer, 6) : unselectedIconColor;
        long unselectedTextColor2 = (i & 16) != 0 ? ColorSchemeKt.toColor(NavigationRailTokens.INSTANCE.getInactiveLabelTextColor(), $composer, 6) : unselectedTextColor;
        if ((i & 32) != 0) {
            m2945copywmQWz5c2 = Color.m2945copywmQWz5c(r33, (r12 & 1) != 0 ? Color.m2949getAlphaimpl(r33) : 0.38f, (r12 & 2) != 0 ? Color.m2953getRedimpl(r33) : 0.0f, (r12 & 4) != 0 ? Color.m2952getGreenimpl(r33) : 0.0f, (r12 & 8) != 0 ? Color.m2950getBlueimpl(unselectedIconColor2) : 0.0f);
            disabledIconColor2 = m2945copywmQWz5c2;
        } else {
            disabledIconColor2 = disabledIconColor;
        }
        if ((i & 64) != 0) {
            m2945copywmQWz5c = Color.m2945copywmQWz5c(r33, (r12 & 1) != 0 ? Color.m2949getAlphaimpl(r33) : 0.38f, (r12 & 2) != 0 ? Color.m2953getRedimpl(r33) : 0.0f, (r12 & 4) != 0 ? Color.m2952getGreenimpl(r33) : 0.0f, (r12 & 8) != 0 ? Color.m2950getBlueimpl(unselectedTextColor2) : 0.0f);
            disabledTextColor2 = m2945copywmQWz5c;
        } else {
            disabledTextColor2 = disabledTextColor;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2104358508, $changed, -1, "androidx.compose.material3.NavigationRailItemDefaults.colors (NavigationRail.kt:290)");
        }
        NavigationRailItemColors navigationRailItemColors = new NavigationRailItemColors(selectedIconColor2, selectedTextColor2, indicatorColor2, unselectedIconColor2, unselectedTextColor2, disabledIconColor2, disabledTextColor2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceableGroup();
        return navigationRailItemColors;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use overload with disabledIconColor and disabledTextColor")
    /* renamed from: colors-zjMxDiM, reason: not valid java name */
    public final /* synthetic */ NavigationRailItemColors m1627colorszjMxDiM(long selectedIconColor, long selectedTextColor, long indicatorColor, long unselectedIconColor, long unselectedTextColor, Composer $composer, int $changed, int i) {
        long m2945copywmQWz5c;
        long m2945copywmQWz5c2;
        $composer.startReplaceableGroup(1621601574);
        ComposerKt.sourceInformation($composer, "C(colors)P(1:c#ui.graphics.Color,2:c#ui.graphics.Color,0:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color)314@13940L9,315@14028L9,316@14113L9,317@14200L9,318@14292L9:NavigationRail.kt#uh7d8r");
        long selectedIconColor2 = (i & 1) != 0 ? ColorSchemeKt.toColor(NavigationRailTokens.INSTANCE.getActiveIconColor(), $composer, 6) : selectedIconColor;
        long selectedTextColor2 = (i & 2) != 0 ? ColorSchemeKt.toColor(NavigationRailTokens.INSTANCE.getActiveLabelTextColor(), $composer, 6) : selectedTextColor;
        long indicatorColor2 = (i & 4) != 0 ? ColorSchemeKt.toColor(NavigationRailTokens.INSTANCE.getActiveIndicatorColor(), $composer, 6) : indicatorColor;
        long unselectedIconColor2 = (i & 8) != 0 ? ColorSchemeKt.toColor(NavigationRailTokens.INSTANCE.getInactiveIconColor(), $composer, 6) : unselectedIconColor;
        long unselectedTextColor2 = (i & 16) != 0 ? ColorSchemeKt.toColor(NavigationRailTokens.INSTANCE.getInactiveLabelTextColor(), $composer, 6) : unselectedTextColor;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1621601574, $changed, -1, "androidx.compose.material3.NavigationRailItemDefaults.colors (NavigationRail.kt:313)");
        }
        m2945copywmQWz5c = Color.m2945copywmQWz5c(r29, (r12 & 1) != 0 ? Color.m2949getAlphaimpl(r29) : 0.38f, (r12 & 2) != 0 ? Color.m2953getRedimpl(r29) : 0.0f, (r12 & 4) != 0 ? Color.m2952getGreenimpl(r29) : 0.0f, (r12 & 8) != 0 ? Color.m2950getBlueimpl(unselectedIconColor2) : 0.0f);
        m2945copywmQWz5c2 = Color.m2945copywmQWz5c(r29, (r12 & 1) != 0 ? Color.m2949getAlphaimpl(r29) : 0.38f, (r12 & 2) != 0 ? Color.m2953getRedimpl(r29) : 0.0f, (r12 & 4) != 0 ? Color.m2952getGreenimpl(r29) : 0.0f, (r12 & 8) != 0 ? Color.m2950getBlueimpl(unselectedTextColor2) : 0.0f);
        NavigationRailItemColors navigationRailItemColors = new NavigationRailItemColors(selectedIconColor2, selectedTextColor2, indicatorColor2, unselectedIconColor2, unselectedTextColor2, m2945copywmQWz5c, m2945copywmQWz5c2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceableGroup();
        return navigationRailItemColors;
    }
}
