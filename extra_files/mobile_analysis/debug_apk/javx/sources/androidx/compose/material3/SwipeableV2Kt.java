package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableKt$draggable$1;
import androidx.compose.foundation.gestures.DraggableKt$draggable$2;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SwipeableV2.kt */
@Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001aC\u0010\u0000\u001a(\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00072\u0006\u0010\b\u001a\u00020\tH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a6\u0010\f\u001a(\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00072\u0006\u0010\r\u001a\u00020\u0003H\u0001\u001aZ\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00100\u000f\"\b\b\u0000\u0010\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u0002H\u00102\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142#\b\u0002\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u0011H\u0010¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0001¢\u0006\u0002\u0010\u0019\u001a7\u0010\u001a\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0010*\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u00030\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u0018H\u0002¢\u0006\u0002\u0010\u001e\u001a%\u0010\u001f\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0010*\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u00030\u001bH\u0002¢\u0006\u0002\u0010 \u001a%\u0010!\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0010*\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u00030\u001bH\u0002¢\u0006\u0002\u0010 \u001a}\u0010\"\u001a\u00020#\"\u0004\b\u0000\u0010\u0010*\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00100\u000f2\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H\u00100&2\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u0002H\u0010\u0018\u00010(28\u0010)\u001a4\u0012\u0013\u0012\u0011H\u0010¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110+¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(,\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0001ø\u0001\u0001\u001aH\u0010-\u001a\u00020#\"\u0004\b\u0000\u0010\u0010*\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00100\u000f2\u0006\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u00020\u00182\b\b\u0002\u00101\u001a\u00020\u00182\n\b\u0002\u00102\u001a\u0004\u0018\u000103H\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00064"}, d2 = {"fixedPositionalThreshold", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "distance", "Lkotlin/ExtensionFunctionType;", "threshold", "Landroidx/compose/ui/unit/Dp;", "fixedPositionalThreshold-0680j_4", "(F)Lkotlin/jvm/functions/Function2;", "fractionalPositionalThreshold", "fraction", "rememberSwipeableV2State", "Landroidx/compose/material3/SwipeableV2State;", "T", "", "initialValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "confirmValueChange", "Lkotlin/Function1;", "newValue", "", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SwipeableV2State;", "closestAnchor", "", "offset", "searchUpwards", "(Ljava/util/Map;FZ)Ljava/lang/Object;", "maxOrNull", "(Ljava/util/Map;)Ljava/lang/Float;", "minOrNull", "swipeAnchors", "Landroidx/compose/ui/Modifier;", "state", "possibleValues", "", "anchorChangeHandler", "Landroidx/compose/material3/AnchorChangeHandler;", "calculateAnchor", "value", "Landroidx/compose/ui/unit/IntSize;", "layoutSize", "swipeableV2", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "enabled", "reverseDirection", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwipeableV2Kt {
    public static final <T> Modifier swipeableV2(Modifier $this$swipeableV2, SwipeableV2State<T> state, Orientation orientation, boolean enabled, boolean reverseDirection, MutableInteractionSource interactionSource) {
        Modifier draggable;
        Intrinsics.checkNotNullParameter($this$swipeableV2, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        draggable = DraggableKt.draggable($this$swipeableV2, state.getSwipeDraggableState(), orientation, (r20 & 4) != 0 ? true : enabled, (r20 & 8) != 0 ? null : interactionSource, (r20 & 16) != 0 ? false : state.isAnimationRunning(), (r20 & 32) != 0 ? new DraggableKt$draggable$1(null) : null, (r20 & 64) != 0 ? new DraggableKt$draggable$2(null) : new SwipeableV2Kt$swipeableV2$1(state, null), (r20 & 128) != 0 ? false : reverseDirection);
        return draggable;
    }

    public static /* synthetic */ Modifier swipeAnchors$default(Modifier modifier, SwipeableV2State swipeableV2State, Set set, AnchorChangeHandler anchorChangeHandler, Function2 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            anchorChangeHandler = null;
        }
        return swipeAnchors(modifier, swipeableV2State, set, anchorChangeHandler, function2);
    }

    public static final <T> Modifier swipeAnchors(Modifier $this$swipeAnchors, final SwipeableV2State<T> state, final Set<? extends T> possibleValues, final AnchorChangeHandler<T> anchorChangeHandler, final Function2<? super T, ? super IntSize, Float> calculateAnchor) {
        Intrinsics.checkNotNullParameter($this$swipeAnchors, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(possibleValues, "possibleValues");
        Intrinsics.checkNotNullParameter(calculateAnchor, "calculateAnchor");
        return $this$swipeAnchors.then(new SwipeAnchorsModifierImpl(new Function1<Density, Unit>() { // from class: androidx.compose.material3.SwipeableV2Kt$swipeAnchors$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Density density) {
                invoke2(density);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Density it) {
                Intrinsics.checkNotNullParameter(it, "it");
                state.setDensity$material3_release(it);
            }
        }, new Function1<IntSize, Unit>() { // from class: androidx.compose.material3.SwipeableV2Kt$swipeAnchors$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                m1809invokeozmzZPI(intSize.getPackedValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-ozmzZPI, reason: not valid java name */
            public final void m1809invokeozmzZPI(long layoutSize) {
                AnchorChangeHandler<T> anchorChangeHandler2;
                Map previousAnchors = state.getAnchors$material3_release();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterable $this$forEach$iv = possibleValues;
                Function2<T, IntSize, Float> function2 = calculateAnchor;
                for (Object element$iv : $this$forEach$iv) {
                    Float anchorValue = function2.invoke(element$iv, IntSize.m5368boximpl(layoutSize));
                    if (anchorValue != null) {
                        linkedHashMap.put(element$iv, anchorValue);
                    }
                }
                if (!Intrinsics.areEqual(previousAnchors, linkedHashMap)) {
                    Object previousTarget = state.getTargetValue();
                    boolean stateRequiresCleanup = state.updateAnchors$material3_release(linkedHashMap);
                    if (stateRequiresCleanup && (anchorChangeHandler2 = anchorChangeHandler) != 0) {
                        anchorChangeHandler2.onAnchorsChanged(previousTarget, previousAnchors, linkedHashMap);
                    }
                }
            }
        }, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.SwipeableV2Kt$swipeAnchors$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo $this$null) {
                Intrinsics.checkNotNullParameter($this$null, "$this$null");
                $this$null.setName("swipeAnchors");
                $this$null.getProperties().set("state", SwipeableV2State.this);
                $this$null.getProperties().set("possibleValues", possibleValues);
                $this$null.getProperties().set("anchorChangeHandler", anchorChangeHandler);
                $this$null.getProperties().set("calculateAnchor", calculateAnchor);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    public static final <T> SwipeableV2State<T> rememberSwipeableV2State(final T initialValue, final AnimationSpec<Float> animationSpec, final Function1<? super T, Boolean> function1, Composer $composer, int $changed, int i) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        $composer.startReplaceableGroup(856267266);
        ComposerKt.sourceInformation($composer, "C(rememberSwipeableV2State)P(2)522@21823L698:SwipeableV2.kt#uh7d8r");
        if ((i & 2) != 0) {
            AnimationSpec animationSpec2 = SwipeableV2Defaults.INSTANCE.getAnimationSpec();
            animationSpec = animationSpec2;
        }
        if ((i & 4) != 0) {
            Function1 confirmValueChange = new Function1<T, Boolean>() { // from class: androidx.compose.material3.SwipeableV2Kt$rememberSwipeableV2State$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(T it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return true;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                    return invoke((SwipeableV2Kt$rememberSwipeableV2State$1<T>) obj);
                }
            };
            function1 = confirmValueChange;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(856267266, $changed, -1, "androidx.compose.material3.rememberSwipeableV2State (SwipeableV2.kt:517)");
        }
        SwipeableV2State<T> swipeableV2State = (SwipeableV2State) RememberSaveableKt.m2594rememberSaveable(new Object[]{initialValue, animationSpec, function1}, (Saver) SwipeableV2State.INSTANCE.m1811SavereqLRuRQ(animationSpec, function1, SwipeableV2Defaults.INSTANCE.getPositionalThreshold(), SwipeableV2Defaults.INSTANCE.m1807getVelocityThresholdD9Ej5fM()), (String) null, (Function0) new Function0<SwipeableV2State<T>>() { // from class: androidx.compose.material3.SwipeableV2Kt$rememberSwipeableV2State$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final SwipeableV2State<T> invoke() {
                return new SwipeableV2State<>(initialValue, animationSpec, function1, SwipeableV2Defaults.INSTANCE.getPositionalThreshold(), SwipeableV2Defaults.INSTANCE.m1807getVelocityThresholdD9Ej5fM(), null);
            }
        }, $composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceableGroup();
        return swipeableV2State;
    }

    /* renamed from: fixedPositionalThreshold-0680j_4, reason: not valid java name */
    public static final Function2<Density, Float, Float> m1808fixedPositionalThreshold0680j_4(final float threshold) {
        return new Function2<Density, Float, Float>() { // from class: androidx.compose.material3.SwipeableV2Kt$fixedPositionalThreshold$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Float invoke(Density density, Float f) {
                return invoke(density, f.floatValue());
            }

            public final Float invoke(Density $this$null, float it) {
                Intrinsics.checkNotNullParameter($this$null, "$this$null");
                return Float.valueOf($this$null.mo327toPx0680j_4(threshold));
            }
        };
    }

    public static final Function2<Density, Float, Float> fractionalPositionalThreshold(final float fraction) {
        return new Function2<Density, Float, Float>() { // from class: androidx.compose.material3.SwipeableV2Kt$fractionalPositionalThreshold$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final Float invoke(Density $this$null, float distance) {
                Intrinsics.checkNotNullParameter($this$null, "$this$null");
                return Float.valueOf(fraction * distance);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Float invoke(Density density, Float f) {
                return invoke(density, f.floatValue());
            }
        };
    }

    static /* synthetic */ Object closestAnchor$default(Map map, float f, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return closestAnchor(map, f, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T closestAnchor(Map<T, Float> map, float f, boolean z) {
        if (!(!map.isEmpty())) {
            throw new IllegalArgumentException("The anchors were empty when trying to find the closest anchor".toString());
        }
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        if (it.hasNext()) {
            float floatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
            float f2 = z ? floatValue - f : f - floatValue;
            if (f2 < 0.0f) {
                f2 = Float.POSITIVE_INFINITY;
            }
            do {
                T next2 = it.next();
                float floatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                float f3 = z ? floatValue2 - f : f - floatValue2;
                if (f3 < 0.0f) {
                    f3 = Float.POSITIVE_INFINITY;
                }
                if (Float.compare(f2, f3) > 0) {
                    next = next2;
                    f2 = f3;
                }
            } while (it.hasNext());
        }
        return (T) ((Map.Entry) next).getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Float minOrNull(Map<T, Float> map) {
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) ((Map.Entry) it.next()).getValue()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) ((Map.Entry) it.next()).getValue()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Float maxOrNull(Map<T, Float> map) {
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) ((Map.Entry) it.next()).getValue()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) ((Map.Entry) it.next()).getValue()).floatValue());
        }
        return Float.valueOf(floatValue);
    }
}
