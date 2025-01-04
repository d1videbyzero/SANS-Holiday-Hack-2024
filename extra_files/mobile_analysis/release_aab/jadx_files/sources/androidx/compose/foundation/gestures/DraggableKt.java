package androidx.compose.foundation.gestures;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.SendChannel;

/* compiled from: Draggable.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u001a!\u0010\u0006\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0007¢\u0006\u0002\u0010\u0007\u001aX\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t*\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0082@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001aS\u0010\u0016\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0082@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001aÏ\u0001\u0010\u001f\u001a\u00020 *\u00020 2\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\"\u001a\u00020\u000e2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2>\b\u0002\u0010%\u001a8\b\u0001\u0012\u0004\u0012\u00020'\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050+\u0012\u0006\u0012\u0004\u0018\u00010,0&¢\u0006\u0002\b-2>\b\u0002\u0010.\u001a8\b\u0001\u0012\u0004\u0012\u00020'\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(/\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050+\u0012\u0006\u0012\u0004\u0018\u00010,0&¢\u0006\u0002\b-2\b\b\u0002\u0010\u001c\u001a\u00020\u000eø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u00100\u001aA\u00101\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u00102\u001a\u0002032\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003H\u0082@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a!\u00107\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a!\u00107\u001a\u00020\u0004*\u00020:2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b;\u00109\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006<"}, d2 = {"DraggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "onDelta", "Lkotlin/Function1;", "", "", "rememberDraggableState", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/DraggableState;", "awaitDownAndSlop", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "canDrag", "", "startDragImmediately", "Lkotlin/Function0;", "velocityTracker", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitDrag", "startEvent", "initialDelta", "channel", "Lkotlinx/coroutines/channels/SendChannel;", "Landroidx/compose/foundation/gestures/DragEvent;", "reverseDirection", "awaitDrag-Su4bsnU", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;JLandroidx/compose/ui/input/pointer/util/VelocityTracker;Lkotlinx/coroutines/channels/SendChannel;ZLandroidx/compose/foundation/gestures/Orientation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "draggable", "Landroidx/compose/ui/Modifier;", "state", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "onDragStarted", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "startedPosition", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "onDragStopped", "velocity", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)Landroidx/compose/ui/Modifier;", "onDragOrUp", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "onDrag", "onDragOrUp-Axegvzg", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/gestures/Orientation;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toFloat", "toFloat-3MmeM6k", "(JLandroidx/compose/foundation/gestures/Orientation;)F", "Landroidx/compose/ui/unit/Velocity;", "toFloat-sF-c-tU", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DraggableKt {
    public static final DraggableState DraggableState(Function1<? super Float, Unit> onDelta) {
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        return new DefaultDraggableState(onDelta);
    }

    public static final DraggableState rememberDraggableState(Function1<? super Float, Unit> onDelta, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        composer.startReplaceableGroup(-183245213);
        ComposerKt.sourceInformation(composer, "C(rememberDraggableState)140@6075L29,141@6116L61:Draggable.kt#8bwon0");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-183245213, i, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:139)");
        }
        final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onDelta, composer, i & 14);
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = DraggableState(new Function1<Float, Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$rememberDraggableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                    invoke(f.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(float f) {
                    rememberUpdatedState.getValue().invoke(Float.valueOf(f));
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DraggableState draggableState = (DraggableState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return draggableState;
    }

    public static final Modifier draggable(Modifier modifier, DraggableState state, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, final boolean z2, Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> onDragStarted, Function3<? super CoroutineScope, ? super Float, ? super Continuation<? super Unit>, ? extends Object> onDragStopped, boolean z3) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(onDragStarted, "onDragStarted");
        Intrinsics.checkNotNullParameter(onDragStopped, "onDragStopped");
        return modifier.then(new DraggableElement(state, new Function1<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$3
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(PointerInputChange it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return true;
            }
        }, orientation, z, mutableInteractionSource, new Function0<Boolean>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(z2);
            }
        }, onDragStarted, new DraggableKt$draggable$5(onDragStopped, orientation, null), z3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02e1 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00cb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0228 -> B:22:0x029d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x028e -> B:13:0x0293). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x02e3 -> B:22:0x029d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitDownAndSlop(androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> r21, kotlin.jvm.functions.Function0<java.lang.Boolean> r22, androidx.compose.ui.input.pointer.util.VelocityTracker r23, androidx.compose.foundation.gestures.Orientation r24, kotlin.coroutines.Continuation<? super kotlin.Pair<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset>> r25) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.awaitDownAndSlop(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.ui.input.pointer.util.VelocityTracker, androidx.compose.foundation.gestures.Orientation, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: awaitDrag-Su4bsnU, reason: not valid java name */
    public static final Object m289awaitDragSu4bsnU(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, long j, final VelocityTracker velocityTracker, final SendChannel<? super DragEvent> sendChannel, final boolean z, Orientation orientation, Continuation<? super Boolean> continuation) {
        sendChannel.mo6667trySendJP2dKIU(new DragEvent.DragStarted(Offset.m2395minusMKHz9U(pointerInputChange.getPosition(), OffsetKt.Offset(Offset.m2391getXimpl(j) * Math.signum(Offset.m2391getXimpl(pointerInputChange.getPosition())), Offset.m2392getYimpl(j) * Math.signum(Offset.m2392getYimpl(pointerInputChange.getPosition())))), null));
        sendChannel.mo6667trySendJP2dKIU(new DragEvent.DragDelta(z ? Offset.m2398timestuRUvjQ(j, -1.0f) : j, null));
        return m290onDragOrUpAxegvzg(awaitPointerEventScope, orientation, pointerInputChange.getId(), new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$awaitDrag$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange2) {
                invoke2(pointerInputChange2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PointerInputChange event) {
                Intrinsics.checkNotNullParameter(event, "event");
                VelocityTrackerKt.addPointerInputChange(VelocityTracker.this, event);
                if (PointerEventKt.changedToUpIgnoreConsumed(event)) {
                    return;
                }
                long positionChange = PointerEventKt.positionChange(event);
                event.consume();
                SendChannel<DragEvent> sendChannel2 = sendChannel;
                if (z) {
                    positionChange = Offset.m2398timestuRUvjQ(positionChange, -1.0f);
                }
                sendChannel2.mo6667trySendJP2dKIU(new DragEvent.DragDelta(positionChange, null));
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0117, code lost:
    
        if ((!r16) != false) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0093 -> B:10:0x009a). Please report as a decompilation issue!!! */
    /* renamed from: onDragOrUp-Axegvzg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m290onDragOrUpAxegvzg(androidx.compose.ui.input.pointer.AwaitPointerEventScope r18, androidx.compose.foundation.gestures.Orientation r19, long r20, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> r22, kotlin.coroutines.Continuation<? super java.lang.Boolean> r23) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.m290onDragOrUpAxegvzg(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.gestures.Orientation, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-3MmeM6k, reason: not valid java name */
    public static final float m291toFloat3MmeM6k(long j, Orientation orientation) {
        return orientation == Orientation.Vertical ? Offset.m2392getYimpl(j) : Offset.m2391getXimpl(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-sF-c-tU, reason: not valid java name */
    public static final float m292toFloatsFctU(long j, Orientation orientation) {
        return orientation == Orientation.Vertical ? Velocity.m5104getYimpl(j) : Velocity.m5103getXimpl(j);
    }
}
