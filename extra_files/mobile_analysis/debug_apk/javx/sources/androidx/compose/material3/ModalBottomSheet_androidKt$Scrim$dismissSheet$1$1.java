package androidx.compose.material3;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: ModalBottomSheet.android.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1", f = "ModalBottomSheet.android.kt", i = {}, l = {335}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onDismissRequest;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1(Function0<Unit> function0, Continuation<? super ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1> continuation) {
        super(2, continuation);
        this.$onDismissRequest = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1 modalBottomSheet_androidKt$Scrim$dismissSheet$1$1 = new ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1(this.$onDismissRequest, continuation);
        modalBottomSheet_androidKt$Scrim$dismissSheet$1$1.L$0 = obj;
        return modalBottomSheet_androidKt$Scrim$dismissSheet$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object detectTapGestures;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                PointerInputScope $this$pointerInput = (PointerInputScope) this.L$0;
                final Function0<Unit> function0 = this.$onDismissRequest;
                Function1<Offset, Unit> function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                        m1603invokek4lQ0M(offset.getPackedValue());
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                    public final void m1603invokek4lQ0M(long it) {
                        function0.invoke();
                    }
                };
                this.label = 1;
                detectTapGestures = TapGestureDetectorKt.detectTapGestures($this$pointerInput, (r13 & 1) != 0 ? null : null, (r13 & 2) != 0 ? null : null, (r13 & 4) != 0 ? TapGestureDetectorKt.NoPressGesture : null, (r13 & 8) != 0 ? null : function1, this);
                if (detectTapGestures != coroutine_suspended) {
                    break;
                } else {
                    return coroutine_suspended;
                }
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
