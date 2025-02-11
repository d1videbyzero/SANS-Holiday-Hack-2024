package androidx.compose.foundation.pager;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* compiled from: PagerMeasurePolicy.kt */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0094\u0001\u0010\u0000\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\u0002\b\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"rememberPagerMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "state", "Landroidx/compose/foundation/pager/PagerState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "beyondBoundsPageCount", "", "pageSpacing", "Landroidx/compose/ui/unit/Dp;", "pageSize", "Landroidx/compose/foundation/pager/PageSize;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "pageCount", "rememberPagerMeasurePolicy-BxUkNYg", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;IFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PagerMeasurePolicyKt {
    /* renamed from: rememberPagerMeasurePolicy-BxUkNYg, reason: not valid java name */
    public static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> m700rememberPagerMeasurePolicyBxUkNYg(final Function0<PagerLazyLayoutItemProvider> itemProviderLambda, final PagerState state, final PaddingValues contentPadding, final boolean reverseLayout, final Orientation orientation, final int beyondBoundsPageCount, final float pageSpacing, final PageSize pageSize, final Alignment.Horizontal horizontalAlignment, final Alignment.Vertical verticalAlignment, final Function0<Integer> pageCount, Composer $composer, int $changed, int $changed1) {
        Intrinsics.checkNotNullParameter(itemProviderLambda, "itemProviderLambda");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(pageSize, "pageSize");
        Intrinsics.checkNotNullParameter(pageCount, "pageCount");
        $composer.startReplaceableGroup(-241579856);
        ComposerKt.sourceInformation($composer, "C(rememberPagerMeasurePolicy)P(3,9,1,8,4!1,7:c#ui.unit.Dp,6!1,10)53@2154L5676:PagerMeasurePolicy.kt#g6yjnt");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-241579856, $changed, $changed1, "androidx.compose.foundation.pager.rememberPagerMeasurePolicy (PagerMeasurePolicy.kt:41)");
        }
        Object[] keys$iv = {contentPadding, Dp.m5214boximpl(pageSpacing), pageSize, state, contentPadding, Boolean.valueOf(reverseLayout), orientation, horizontalAlignment, verticalAlignment, pageCount};
        $composer.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation($composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean invalid$iv = false;
        for (Object key$iv : keys$iv) {
            invalid$iv |= $composer.changed(key$iv);
        }
        Object value$iv$iv = $composer.rememberedValue();
        if (invalid$iv || value$iv$iv == Composer.INSTANCE.getEmpty()) {
            value$iv$iv = new Function2<LazyLayoutMeasureScope, Constraints, PagerMeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ PagerMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return m701invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final PagerMeasureResult m701invoke0kLqBqw(final LazyLayoutMeasureScope $this$null, final long containerConstraints) {
                    int i;
                    int i2;
                    int i3;
                    int m5172getMaxWidthimpl;
                    long visualItemOffset;
                    int i4;
                    int i5;
                    Snapshot this_$iv$iv;
                    Snapshot previous$iv$iv;
                    int firstVisiblePage;
                    int firstVisiblePageOffset;
                    Intrinsics.checkNotNullParameter($this$null, "$this$null");
                    boolean isVertical = Orientation.this == Orientation.Vertical;
                    CheckScrollableContainerConstraintsKt.m189checkScrollableContainerConstraintsK40F9xA(containerConstraints, isVertical ? Orientation.Vertical : Orientation.Horizontal);
                    if (isVertical) {
                        i = $this$null.mo321roundToPx0680j_4(contentPadding.mo433calculateLeftPaddingu2uoSUM($this$null.getLayoutDirection()));
                    } else {
                        i = $this$null.mo321roundToPx0680j_4(PaddingKt.calculateStartPadding(contentPadding, $this$null.getLayoutDirection()));
                    }
                    int startPadding = i;
                    if (isVertical) {
                        i2 = $this$null.mo321roundToPx0680j_4(contentPadding.mo434calculateRightPaddingu2uoSUM($this$null.getLayoutDirection()));
                    } else {
                        i2 = $this$null.mo321roundToPx0680j_4(PaddingKt.calculateEndPadding(contentPadding, $this$null.getLayoutDirection()));
                    }
                    int endPadding = i2;
                    int topPadding = $this$null.mo321roundToPx0680j_4(contentPadding.getTop());
                    int bottomPadding = $this$null.mo321roundToPx0680j_4(contentPadding.getBottom());
                    final int totalVerticalPadding = topPadding + bottomPadding;
                    final int totalHorizontalPadding = startPadding + endPadding;
                    int totalMainAxisPadding = isVertical ? totalVerticalPadding : totalHorizontalPadding;
                    if (isVertical && !reverseLayout) {
                        i3 = topPadding;
                    } else if (isVertical && reverseLayout) {
                        i3 = bottomPadding;
                    } else {
                        i3 = (isVertical || reverseLayout) ? endPadding : startPadding;
                    }
                    int beforeContentPadding = i3;
                    int afterContentPadding = totalMainAxisPadding - beforeContentPadding;
                    long contentConstraints = ConstraintsKt.m5188offsetNN6EwU(containerConstraints, -totalHorizontalPadding, -totalVerticalPadding);
                    state.setDensity$foundation_release($this$null);
                    int spaceBetweenPages = $this$null.mo321roundToPx0680j_4(pageSpacing);
                    if (isVertical) {
                        m5172getMaxWidthimpl = Constraints.m5171getMaxHeightimpl(containerConstraints) - totalVerticalPadding;
                    } else {
                        m5172getMaxWidthimpl = Constraints.m5172getMaxWidthimpl(containerConstraints) - totalHorizontalPadding;
                    }
                    int mainAxisAvailableSize = m5172getMaxWidthimpl;
                    if (!reverseLayout || mainAxisAvailableSize > 0) {
                        visualItemOffset = IntOffsetKt.IntOffset(startPadding, topPadding);
                    } else {
                        visualItemOffset = IntOffsetKt.IntOffset(isVertical ? startPadding : startPadding + mainAxisAvailableSize, isVertical ? topPadding + mainAxisAvailableSize : topPadding);
                    }
                    PageSize $this$invoke_0kLqBqw_u24lambda_u240 = pageSize;
                    int calculateMainAxisPageSize = $this$invoke_0kLqBqw_u24lambda_u240.calculateMainAxisPageSize($this$null, mainAxisAvailableSize, spaceBetweenPages);
                    PagerState pagerState = state;
                    if (Orientation.this == Orientation.Vertical) {
                        i4 = Constraints.m5172getMaxWidthimpl(contentConstraints);
                    } else {
                        i4 = calculateMainAxisPageSize;
                    }
                    if (Orientation.this != Orientation.Vertical) {
                        i5 = Constraints.m5171getMaxHeightimpl(contentConstraints);
                    } else {
                        i5 = calculateMainAxisPageSize;
                    }
                    pagerState.m704setPremeasureConstraintsBRTryo0$foundation_release(ConstraintsKt.Constraints$default(0, i4, 0, i5, 5, null));
                    Snapshot.Companion this_$iv = Snapshot.INSTANCE;
                    PagerState pagerState2 = state;
                    Snapshot snapshot$iv = this_$iv.createNonObservableSnapshot();
                    try {
                        Snapshot previous$iv$iv2 = snapshot$iv.makeCurrent();
                        try {
                            this_$iv$iv = snapshot$iv;
                            firstVisiblePage = pagerState2.getFirstVisiblePage$foundation_release();
                            try {
                                try {
                                    if (Intrinsics.areEqual(pagerState2.getLayoutInfo$foundation_release(), PagerStateKt.getEmptyLayoutInfo())) {
                                        try {
                                            firstVisiblePageOffset = MathKt.roundToInt(pagerState2.getInitialPageOffsetFraction() * calculateMainAxisPageSize);
                                        } catch (Throwable th) {
                                            th = th;
                                            previous$iv$iv = previous$iv$iv2;
                                            try {
                                                this_$iv$iv.restoreCurrent(previous$iv$iv);
                                                throw th;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                snapshot$iv.dispose();
                                                throw th;
                                            }
                                        }
                                    } else {
                                        firstVisiblePageOffset = pagerState2.getFirstVisiblePageOffset$foundation_release();
                                    }
                                    try {
                                        Unit unit = Unit.INSTANCE;
                                        try {
                                            this_$iv$iv.restoreCurrent(previous$iv$iv2);
                                            snapshot$iv.dispose();
                                            PagerLazyLayoutItemProvider itemProvider = itemProviderLambda.invoke();
                                            List pinnedPages = LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(itemProvider, state.getPinnedPages(), state.getBeyondBoundsInfo());
                                            PagerMeasureResult it = PagerMeasureKt.m699measurePagerntgEbfI($this$null, pageCount.invoke().intValue(), itemProvider, mainAxisAvailableSize, beforeContentPadding, afterContentPadding, spaceBetweenPages, firstVisiblePage, firstVisiblePageOffset, state.getScrollToBeConsumed(), contentConstraints, Orientation.this, verticalAlignment, horizontalAlignment, reverseLayout, visualItemOffset, calculateMainAxisPageSize, beyondBoundsPageCount, pinnedPages, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1.2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                                    return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                                }

                                                public final MeasureResult invoke(int width, int height, Function1<? super Placeable.PlacementScope, Unit> placement) {
                                                    Intrinsics.checkNotNullParameter(placement, "placement");
                                                    return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m5186constrainWidthK40F9xA(containerConstraints, totalHorizontalPadding + width), ConstraintsKt.m5185constrainHeightK40F9xA(containerConstraints, totalVerticalPadding + height), MapsKt.emptyMap(), placement);
                                                }
                                            });
                                            state.applyMeasureResult$foundation_release(it);
                                            return it;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            snapshot$iv.dispose();
                                            throw th;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        previous$iv$iv = previous$iv$iv2;
                                        this_$iv$iv.restoreCurrent(previous$iv$iv);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    previous$iv$iv = previous$iv$iv2;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                previous$iv$iv = previous$iv$iv2;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            this_$iv$iv = snapshot$iv;
                            previous$iv$iv = previous$iv$iv2;
                            firstVisiblePage = 0;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                    }
                }
            };
            $composer.updateRememberedValue(value$iv$iv);
        }
        $composer.endReplaceableGroup();
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2 = (Function2) value$iv$iv;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceableGroup();
        return function2;
    }
}
