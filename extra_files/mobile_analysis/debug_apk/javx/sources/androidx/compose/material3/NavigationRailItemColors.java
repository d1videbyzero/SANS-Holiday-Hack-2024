package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: NavigationRail.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BB\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0019R\u0019\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000bR\u0019\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000bR\u001d\u0010\f\u001a\u00020\u00038AX\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000bR\u0019\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000bR\u0019\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000bR\u0019\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000bR\u0019\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/material3/NavigationRailItemColors;", "", "selectedIconColor", "Landroidx/compose/ui/graphics/Color;", "selectedTextColor", "selectedIndicatorColor", "unselectedIconColor", "unselectedTextColor", "disabledIconColor", "disabledTextColor", "(JJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "indicatorColor", "getIndicatorColor", "(Landroidx/compose/runtime/Composer;I)J", "equals", "", "other", "hashCode", "", "iconColor", "Landroidx/compose/runtime/State;", "selected", "enabled", "iconColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "textColor", "textColor$material3_release", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationRailItemColors {
    public static final int $stable = 0;
    private final long disabledIconColor;
    private final long disabledTextColor;
    private final long selectedIconColor;
    private final long selectedIndicatorColor;
    private final long selectedTextColor;
    private final long unselectedIconColor;
    private final long unselectedTextColor;

    public /* synthetic */ NavigationRailItemColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7);
    }

    private NavigationRailItemColors(long selectedIconColor, long selectedTextColor, long selectedIndicatorColor, long unselectedIconColor, long unselectedTextColor, long disabledIconColor, long disabledTextColor) {
        this.selectedIconColor = selectedIconColor;
        this.selectedTextColor = selectedTextColor;
        this.selectedIndicatorColor = selectedIndicatorColor;
        this.unselectedIconColor = unselectedIconColor;
        this.unselectedTextColor = unselectedTextColor;
        this.disabledIconColor = disabledIconColor;
        this.disabledTextColor = disabledTextColor;
    }

    public final State<Color> iconColor$material3_release(boolean selected, boolean enabled, Composer $composer, int $changed) {
        long targetValue;
        $composer.startReplaceableGroup(2131995553);
        ComposerKt.sourceInformation($composer, "C(iconColor)P(1)354@15704L132:NavigationRail.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2131995553, $changed, -1, "androidx.compose.material3.NavigationRailItemColors.iconColor (NavigationRail.kt:348)");
        }
        if (enabled) {
            targetValue = selected ? this.selectedIconColor : this.unselectedIconColor;
        } else {
            targetValue = this.disabledIconColor;
        }
        State<Color> m70animateColorAsStateeuL9pac = SingleValueAnimationKt.m70animateColorAsStateeuL9pac(targetValue, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, $composer, 48, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceableGroup();
        return m70animateColorAsStateeuL9pac;
    }

    public final State<Color> textColor$material3_release(boolean selected, boolean enabled, Composer $composer, int $changed) {
        long targetValue;
        $composer.startReplaceableGroup(-758555563);
        ComposerKt.sourceInformation($composer, "C(textColor)P(1)373@16334L132:NavigationRail.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-758555563, $changed, -1, "androidx.compose.material3.NavigationRailItemColors.textColor (NavigationRail.kt:367)");
        }
        if (enabled) {
            targetValue = selected ? this.selectedTextColor : this.unselectedTextColor;
        } else {
            targetValue = this.disabledTextColor;
        }
        State<Color> m70animateColorAsStateeuL9pac = SingleValueAnimationKt.m70animateColorAsStateeuL9pac(targetValue, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, $composer, 48, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceableGroup();
        return m70animateColorAsStateeuL9pac;
    }

    public final long getIndicatorColor(Composer $composer, int $changed) {
        $composer.startReplaceableGroup(618271448);
        ComposerKt.sourceInformation($composer, "C:NavigationRail.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(618271448, $changed, -1, "androidx.compose.material3.NavigationRailItemColors.<get-indicatorColor> (NavigationRail.kt:382)");
        }
        long j = this.selectedIndicatorColor;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceableGroup();
        return j;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && (other instanceof NavigationRailItemColors) && Color.m2948equalsimpl0(this.selectedIconColor, ((NavigationRailItemColors) other).selectedIconColor) && Color.m2948equalsimpl0(this.unselectedIconColor, ((NavigationRailItemColors) other).unselectedIconColor) && Color.m2948equalsimpl0(this.selectedTextColor, ((NavigationRailItemColors) other).selectedTextColor) && Color.m2948equalsimpl0(this.unselectedTextColor, ((NavigationRailItemColors) other).unselectedTextColor) && Color.m2948equalsimpl0(this.selectedIndicatorColor, ((NavigationRailItemColors) other).selectedIndicatorColor) && Color.m2948equalsimpl0(this.disabledIconColor, ((NavigationRailItemColors) other).disabledIconColor) && Color.m2948equalsimpl0(this.disabledTextColor, ((NavigationRailItemColors) other).disabledTextColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int result = Color.m2954hashCodeimpl(this.selectedIconColor);
        return (((((((((((result * 31) + Color.m2954hashCodeimpl(this.unselectedIconColor)) * 31) + Color.m2954hashCodeimpl(this.selectedTextColor)) * 31) + Color.m2954hashCodeimpl(this.unselectedTextColor)) * 31) + Color.m2954hashCodeimpl(this.selectedIndicatorColor)) * 31) + Color.m2954hashCodeimpl(this.disabledIconColor)) * 31) + Color.m2954hashCodeimpl(this.disabledTextColor);
    }
}
