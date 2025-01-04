package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: Size.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J)\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/layout/FillNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "direction", "Landroidx/compose/foundation/layout/Direction;", "fraction", "", "(Landroidx/compose/foundation/layout/Direction;F)V", "getDirection", "()Landroidx/compose/foundation/layout/Direction;", "setDirection", "(Landroidx/compose/foundation/layout/Direction;)V", "getFraction", "()F", "setFraction", "(F)V", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class FillNode extends Modifier.Node implements LayoutModifierNode {
    private Direction direction;
    private float fraction;

    public final Direction getDirection() {
        return this.direction;
    }

    public final void setDirection(Direction direction) {
        Intrinsics.checkNotNullParameter(direction, "<set-?>");
        this.direction = direction;
    }

    public final float getFraction() {
        return this.fraction;
    }

    public final void setFraction(float f) {
        this.fraction = f;
    }

    public FillNode(Direction direction, float f) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.direction = direction;
        this.fraction = f;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo239measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        int m4836getMinWidthimpl;
        int m4834getMaxWidthimpl;
        int m4833getMaxHeightimpl;
        int i;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (Constraints.m4830getHasBoundedWidthimpl(j) && this.direction != Direction.Vertical) {
            m4836getMinWidthimpl = RangesKt.coerceIn(MathKt.roundToInt(Constraints.m4834getMaxWidthimpl(j) * this.fraction), Constraints.m4836getMinWidthimpl(j), Constraints.m4834getMaxWidthimpl(j));
            m4834getMaxWidthimpl = m4836getMinWidthimpl;
        } else {
            m4836getMinWidthimpl = Constraints.m4836getMinWidthimpl(j);
            m4834getMaxWidthimpl = Constraints.m4834getMaxWidthimpl(j);
        }
        if (Constraints.m4829getHasBoundedHeightimpl(j) && this.direction != Direction.Horizontal) {
            i = RangesKt.coerceIn(MathKt.roundToInt(Constraints.m4833getMaxHeightimpl(j) * this.fraction), Constraints.m4835getMinHeightimpl(j), Constraints.m4833getMaxHeightimpl(j));
            m4833getMaxHeightimpl = i;
        } else {
            int m4835getMinHeightimpl = Constraints.m4835getMinHeightimpl(j);
            m4833getMaxHeightimpl = Constraints.m4833getMaxHeightimpl(j);
            i = m4835getMinHeightimpl;
        }
        final Placeable mo3868measureBRTryo0 = measurable.mo3868measureBRTryo0(ConstraintsKt.Constraints(m4836getMinWidthimpl, m4834getMaxWidthimpl, i, m4833getMaxHeightimpl));
        return MeasureScope.layout$default(measure, mo3868measureBRTryo0.getWidth(), mo3868measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FillNode$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Placeable.PlacementScope.placeRelative$default(layout, Placeable.this, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }
}
