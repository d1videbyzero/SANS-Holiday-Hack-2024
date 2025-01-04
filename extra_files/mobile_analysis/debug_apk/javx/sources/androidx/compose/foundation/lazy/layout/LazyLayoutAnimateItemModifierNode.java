package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: LazyLayoutAnimateItemModifierNode.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001$B\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0005J\u001b\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0015J\u0006\u0010\"\u001a\u00020\u001fJ\b\u0010#\u001a\u00020\u001fH\u0016R+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR#\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000eø\u0001\u0000¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0005R4\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00048F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R%\u0010\u001a\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "placementAnimationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntOffset;", "(Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "<set-?>", "", "isAnimationInProgress", "()Z", "setAnimationInProgress", "(Z)V", "isAnimationInProgress$delegate", "Landroidx/compose/runtime/MutableState;", "getPlacementAnimationSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "setPlacementAnimationSpec", "placementDelta", "getPlacementDelta-nOcc-ac", "()J", "setPlacementDelta--gyyYBs", "(J)V", "placementDelta$delegate", "placementDeltaAnimation", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector2D;", "rawOffset", "getRawOffset-nOcc-ac", "setRawOffset--gyyYBs", "J", "animatePlacementDelta", "", "delta", "animatePlacementDelta--gyyYBs", "cancelAnimation", "onDetach", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutAnimateItemModifierNode extends Modifier.Node {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long NotInitialized = IntOffsetKt.IntOffset(Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* renamed from: isAnimationInProgress$delegate, reason: from kotlin metadata */
    private final MutableState isAnimationInProgress;
    private FiniteAnimationSpec<IntOffset> placementAnimationSpec;

    /* renamed from: placementDelta$delegate, reason: from kotlin metadata */
    private final MutableState placementDelta;
    private final Animatable<IntOffset, AnimationVector2D> placementDeltaAnimation;
    private long rawOffset;

    public final FiniteAnimationSpec<IntOffset> getPlacementAnimationSpec() {
        return this.placementAnimationSpec;
    }

    public final void setPlacementAnimationSpec(FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        Intrinsics.checkNotNullParameter(finiteAnimationSpec, "<set-?>");
        this.placementAnimationSpec = finiteAnimationSpec;
    }

    public LazyLayoutAnimateItemModifierNode(FiniteAnimationSpec<IntOffset> placementAnimationSpec) {
        Intrinsics.checkNotNullParameter(placementAnimationSpec, "placementAnimationSpec");
        this.placementAnimationSpec = placementAnimationSpec;
        this.isAnimationInProgress = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.rawOffset = NotInitialized;
        this.placementDeltaAnimation = new Animatable<>(IntOffset.m5325boximpl(IntOffset.INSTANCE.m5344getZeronOccac()), VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE), null, null, 12, null);
        this.placementDelta = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntOffset.m5325boximpl(IntOffset.INSTANCE.m5344getZeronOccac()), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAnimationInProgress(boolean z) {
        MutableState $this$setValue$iv = this.isAnimationInProgress;
        $this$setValue$iv.setValue(Boolean.valueOf(z));
    }

    public final boolean isAnimationInProgress() {
        State $this$getValue$iv = this.isAnimationInProgress;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    /* renamed from: getRawOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getRawOffset() {
        return this.rawOffset;
    }

    /* renamed from: setRawOffset--gyyYBs, reason: not valid java name */
    public final void m629setRawOffsetgyyYBs(long j) {
        this.rawOffset = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setPlacementDelta--gyyYBs, reason: not valid java name */
    public final void m625setPlacementDeltagyyYBs(long j) {
        MutableState $this$setValue$iv = this.placementDelta;
        $this$setValue$iv.setValue(IntOffset.m5325boximpl(j));
    }

    /* renamed from: getPlacementDelta-nOcc-ac, reason: not valid java name */
    public final long m627getPlacementDeltanOccac() {
        State $this$getValue$iv = this.placementDelta;
        return ((IntOffset) $this$getValue$iv.getValue()).getPackedValue();
    }

    public final void cancelAnimation() {
        if (isAnimationInProgress()) {
            BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new LazyLayoutAnimateItemModifierNode$cancelAnimation$1(this, null), 3, null);
        }
    }

    /* renamed from: animatePlacementDelta--gyyYBs, reason: not valid java name */
    public final void m626animatePlacementDeltagyyYBs(long delta) {
        long arg0$iv = m627getPlacementDeltanOccac();
        long arg0$iv2 = IntOffsetKt.IntOffset(IntOffset.m5334getXimpl(arg0$iv) - IntOffset.m5334getXimpl(delta), IntOffset.m5335getYimpl(arg0$iv) - IntOffset.m5335getYimpl(delta));
        m625setPlacementDeltagyyYBs(arg0$iv2);
        setAnimationInProgress(true);
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1(this, arg0$iv2, null), 3, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        m625setPlacementDeltagyyYBs(IntOffset.INSTANCE.m5344getZeronOccac());
        setAnimationInProgress(false);
        this.rawOffset = NotInitialized;
    }

    /* compiled from: LazyLayoutAnimateItemModifierNode.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode$Companion;", "", "()V", "NotInitialized", "Landroidx/compose/ui/unit/IntOffset;", "getNotInitialized-nOcc-ac", "()J", "J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getNotInitialized-nOcc-ac, reason: not valid java name */
        public final long m630getNotInitializednOccac() {
            return LazyLayoutAnimateItemModifierNode.NotInitialized;
        }
    }
}
