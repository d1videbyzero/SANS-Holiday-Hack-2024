package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* compiled from: Constraints.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\u001a8\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002\u001a\u001f\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u000b\u001a\u00020\u000f*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000e\u001a!\u0010\u0012\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0003H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a!\u0010\u0016\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0003H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0015\u001a!\u0010\u0019\u001a\u00020\u001a*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a-\u0010\u001d\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u0003H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Constraints", "Landroidx/compose/ui/unit/Constraints;", "minWidth", "", "maxWidth", "minHeight", "maxHeight", "(IIII)J", "addMaxWithMinimum", "max", "value", "constrain", "otherConstraints", "constrain-N9IONVI", "(JJ)J", "Landroidx/compose/ui/unit/IntSize;", "size", "constrain-4WqzIAM", "constrainHeight", "height", "constrainHeight-K40F9xA", "(JI)I", "constrainWidth", "width", "constrainWidth-K40F9xA", "isSatisfiedBy", "", "isSatisfiedBy-4WqzIAM", "(JJ)Z", "offset", "horizontal", "vertical", "offset-NN6Ew-U", "(JII)J", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConstraintsKt {
    public static /* synthetic */ long Constraints$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return Constraints(i, i2, i3, i4);
    }

    public static final long Constraints(int minWidth, int maxWidth, int minHeight, int maxHeight) {
        if (!(maxWidth >= minWidth)) {
            throw new IllegalArgumentException(("maxWidth(" + maxWidth + ") must be >= than minWidth(" + minWidth + ')').toString());
        }
        if (!(maxHeight >= minHeight)) {
            throw new IllegalArgumentException(("maxHeight(" + maxHeight + ") must be >= than minHeight(" + minHeight + ')').toString());
        }
        if (!(minWidth >= 0 && minHeight >= 0)) {
            throw new IllegalArgumentException(("minWidth(" + minWidth + ") and minHeight(" + minHeight + ") must be >= 0").toString());
        }
        return Constraints.INSTANCE.m5179createConstraintsZbe2FdA$ui_unit_release(minWidth, maxWidth, minHeight, maxHeight);
    }

    /* renamed from: constrain-N9IONVI, reason: not valid java name */
    public static final long m5184constrainN9IONVI(long $this$constrain_u2dN9IONVI, long otherConstraints) {
        return Constraints(RangesKt.coerceIn(Constraints.m5174getMinWidthimpl(otherConstraints), Constraints.m5174getMinWidthimpl($this$constrain_u2dN9IONVI), Constraints.m5172getMaxWidthimpl($this$constrain_u2dN9IONVI)), RangesKt.coerceIn(Constraints.m5172getMaxWidthimpl(otherConstraints), Constraints.m5174getMinWidthimpl($this$constrain_u2dN9IONVI), Constraints.m5172getMaxWidthimpl($this$constrain_u2dN9IONVI)), RangesKt.coerceIn(Constraints.m5173getMinHeightimpl(otherConstraints), Constraints.m5173getMinHeightimpl($this$constrain_u2dN9IONVI), Constraints.m5171getMaxHeightimpl($this$constrain_u2dN9IONVI)), RangesKt.coerceIn(Constraints.m5171getMaxHeightimpl(otherConstraints), Constraints.m5173getMinHeightimpl($this$constrain_u2dN9IONVI), Constraints.m5171getMaxHeightimpl($this$constrain_u2dN9IONVI)));
    }

    /* renamed from: constrain-4WqzIAM, reason: not valid java name */
    public static final long m5183constrain4WqzIAM(long $this$constrain_u2d4WqzIAM, long size) {
        return IntSizeKt.IntSize(RangesKt.coerceIn(IntSize.m5376getWidthimpl(size), Constraints.m5174getMinWidthimpl($this$constrain_u2d4WqzIAM), Constraints.m5172getMaxWidthimpl($this$constrain_u2d4WqzIAM)), RangesKt.coerceIn(IntSize.m5375getHeightimpl(size), Constraints.m5173getMinHeightimpl($this$constrain_u2d4WqzIAM), Constraints.m5171getMaxHeightimpl($this$constrain_u2d4WqzIAM)));
    }

    /* renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final int m5186constrainWidthK40F9xA(long $this$constrainWidth_u2dK40F9xA, int width) {
        return RangesKt.coerceIn(width, Constraints.m5174getMinWidthimpl($this$constrainWidth_u2dK40F9xA), Constraints.m5172getMaxWidthimpl($this$constrainWidth_u2dK40F9xA));
    }

    /* renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final int m5185constrainHeightK40F9xA(long $this$constrainHeight_u2dK40F9xA, int height) {
        return RangesKt.coerceIn(height, Constraints.m5173getMinHeightimpl($this$constrainHeight_u2dK40F9xA), Constraints.m5171getMaxHeightimpl($this$constrainHeight_u2dK40F9xA));
    }

    /* renamed from: isSatisfiedBy-4WqzIAM, reason: not valid java name */
    public static final boolean m5187isSatisfiedBy4WqzIAM(long $this$isSatisfiedBy_u2d4WqzIAM, long size) {
        int m5174getMinWidthimpl = Constraints.m5174getMinWidthimpl($this$isSatisfiedBy_u2d4WqzIAM);
        int m5172getMaxWidthimpl = Constraints.m5172getMaxWidthimpl($this$isSatisfiedBy_u2d4WqzIAM);
        int m5376getWidthimpl = IntSize.m5376getWidthimpl(size);
        if (m5174getMinWidthimpl <= m5376getWidthimpl && m5376getWidthimpl <= m5172getMaxWidthimpl) {
            int m5173getMinHeightimpl = Constraints.m5173getMinHeightimpl($this$isSatisfiedBy_u2d4WqzIAM);
            int m5171getMaxHeightimpl = Constraints.m5171getMaxHeightimpl($this$isSatisfiedBy_u2d4WqzIAM);
            int m5375getHeightimpl = IntSize.m5375getHeightimpl(size);
            if (m5173getMinHeightimpl <= m5375getHeightimpl && m5375getHeightimpl <= m5171getMaxHeightimpl) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: offset-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ long m5189offsetNN6EwU$default(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m5188offsetNN6EwU(j, i, i2);
    }

    /* renamed from: offset-NN6Ew-U, reason: not valid java name */
    public static final long m5188offsetNN6EwU(long $this$offset_u2dNN6Ew_u2dU, int horizontal, int vertical) {
        return Constraints(RangesKt.coerceAtLeast(Constraints.m5174getMinWidthimpl($this$offset_u2dNN6Ew_u2dU) + horizontal, 0), addMaxWithMinimum(Constraints.m5172getMaxWidthimpl($this$offset_u2dNN6Ew_u2dU), horizontal), RangesKt.coerceAtLeast(Constraints.m5173getMinHeightimpl($this$offset_u2dNN6Ew_u2dU) + vertical, 0), addMaxWithMinimum(Constraints.m5171getMaxHeightimpl($this$offset_u2dNN6Ew_u2dU), vertical));
    }

    private static final int addMaxWithMinimum(int max, int value) {
        if (max == Integer.MAX_VALUE) {
            return max;
        }
        return RangesKt.coerceAtLeast(max + value, 0);
    }
}
