package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MeasureScope.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001JG\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "layout", "Landroidx/compose/ui/layout/MeasureResult;", "width", "", "height", "alignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "placementBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface MeasureScope extends IntrinsicMeasureScope {

    /* compiled from: MeasureScope.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean isLookingAhead(MeasureScope $this) {
            return MeasureScope.super.isLookingAhead();
        }

        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m4221roundToPxR2X_6o(MeasureScope $this, long $receiver) {
            return MeasureScope.super.mo320roundToPxR2X_6o($receiver);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m4222roundToPx0680j_4(MeasureScope $this, float $receiver) {
            return MeasureScope.super.mo321roundToPx0680j_4($receiver);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m4223toDpGaN1DYA(MeasureScope $this, long $receiver) {
            return MeasureScope.super.mo322toDpGaN1DYA($receiver);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4224toDpu2uoSUM(MeasureScope $this, float $receiver) {
            return MeasureScope.super.mo323toDpu2uoSUM($receiver);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4225toDpu2uoSUM(MeasureScope $this, int $receiver) {
            return MeasureScope.super.mo324toDpu2uoSUM($receiver);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m4226toDpSizekrfVVM(MeasureScope $this, long $receiver) {
            return MeasureScope.super.mo325toDpSizekrfVVM($receiver);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m4227toPxR2X_6o(MeasureScope $this, long $receiver) {
            return MeasureScope.super.mo326toPxR2X_6o($receiver);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m4228toPx0680j_4(MeasureScope $this, float $receiver) {
            return MeasureScope.super.mo327toPx0680j_4($receiver);
        }

        @Deprecated
        public static Rect toRect(MeasureScope $this, DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return MeasureScope.super.toRect(receiver);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m4229toSizeXkaWNTQ(MeasureScope $this, long $receiver) {
            return MeasureScope.super.mo328toSizeXkaWNTQ($receiver);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m4230toSp0xMU5do(MeasureScope $this, float $receiver) {
            return MeasureScope.super.mo329toSp0xMU5do($receiver);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4231toSpkPz2Gy4(MeasureScope $this, float $receiver) {
            return MeasureScope.super.mo330toSpkPz2Gy4($receiver);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4232toSpkPz2Gy4(MeasureScope $this, int $receiver) {
            return MeasureScope.super.mo331toSpkPz2Gy4($receiver);
        }

        @Deprecated
        public static MeasureResult layout(MeasureScope $this, int width, int height, Map<AlignmentLine, Integer> alignmentLines, Function1<? super Placeable.PlacementScope, Unit> placementBlock) {
            Intrinsics.checkNotNullParameter(alignmentLines, "alignmentLines");
            Intrinsics.checkNotNullParameter(placementBlock, "placementBlock");
            return MeasureScope.super.layout(width, height, alignmentLines, placementBlock);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ MeasureResult layout$default(MeasureScope measureScope, int i, int i2, Map map, Function1 function1, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i3 & 4) != 0) {
            map = MapsKt.emptyMap();
        }
        return measureScope.layout(i, i2, map, function1);
    }

    default MeasureResult layout(final int width, final int height, final Map<AlignmentLine, Integer> alignmentLines, final Function1<? super Placeable.PlacementScope, Unit> placementBlock) {
        Intrinsics.checkNotNullParameter(alignmentLines, "alignmentLines");
        Intrinsics.checkNotNullParameter(placementBlock, "placementBlock");
        return new MeasureResult(width, height, alignmentLines, this, placementBlock) { // from class: androidx.compose.ui.layout.MeasureScope$layout$1
            final /* synthetic */ Function1<Placeable.PlacementScope, Unit> $placementBlock;
            final /* synthetic */ int $width;
            private final Map<AlignmentLine, Integer> alignmentLines;
            private final int height;
            final /* synthetic */ MeasureScope this$0;
            private final int width;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.$width = width;
                this.this$0 = this;
                this.$placementBlock = placementBlock;
                this.width = width;
                this.height = height;
                this.alignmentLines = alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
                Placeable.PlacementScope.Companion this_$iv = Placeable.PlacementScope.INSTANCE;
                int parentWidth$iv = this.$width;
                LayoutDirection parentLayoutDirection$iv = this.this$0.getLayoutDirection();
                MeasureScope measureScope = this.this$0;
                LookaheadCapablePlaceable lookaheadCapablePlaceable$iv = measureScope instanceof LookaheadCapablePlaceable ? (LookaheadCapablePlaceable) measureScope : null;
                Function1 block$iv = this.$placementBlock;
                LayoutCoordinates previousLayoutCoordinates$iv = Placeable.PlacementScope._coordinates;
                int previousParentWidth$iv = Placeable.PlacementScope.INSTANCE.getParentWidth();
                LayoutDirection previousParentLayoutDirection$iv = Placeable.PlacementScope.INSTANCE.getParentLayoutDirection();
                LayoutNodeLayoutDelegate previousLayoutDelegate$iv = Placeable.PlacementScope.layoutDelegate;
                Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.INSTANCE;
                Placeable.PlacementScope.parentWidth = parentWidth$iv;
                Placeable.PlacementScope.Companion companion2 = Placeable.PlacementScope.INSTANCE;
                Placeable.PlacementScope.parentLayoutDirection = parentLayoutDirection$iv;
                boolean wasPlacingForAlignment$iv = this_$iv.configureForPlacingForAlignment(lookaheadCapablePlaceable$iv);
                block$iv.invoke(this_$iv);
                if (lookaheadCapablePlaceable$iv != null) {
                    lookaheadCapablePlaceable$iv.setPlacingForAlignment$ui_release(wasPlacingForAlignment$iv);
                }
                Placeable.PlacementScope.Companion companion3 = Placeable.PlacementScope.INSTANCE;
                Placeable.PlacementScope.parentWidth = previousParentWidth$iv;
                Placeable.PlacementScope.Companion companion4 = Placeable.PlacementScope.INSTANCE;
                Placeable.PlacementScope.parentLayoutDirection = previousParentLayoutDirection$iv;
                Placeable.PlacementScope._coordinates = previousLayoutCoordinates$iv;
                Placeable.PlacementScope.layoutDelegate = previousLayoutDelegate$iv;
            }
        };
    }
}
