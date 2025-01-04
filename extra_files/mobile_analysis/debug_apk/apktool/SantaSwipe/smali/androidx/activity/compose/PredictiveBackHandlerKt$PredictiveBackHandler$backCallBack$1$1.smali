.class public final Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;
.super Landroidx/activity/OnBackPressedCallback;
.source "PredictiveBackHandler.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/activity/compose/PredictiveBackHandlerKt;->PredictiveBackHandler(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016J\u0008\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "androidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1",
        "Landroidx/activity/OnBackPressedCallback;",
        "handleOnBackCancelled",
        "",
        "handleOnBackPressed",
        "handleOnBackProgressed",
        "backEvent",
        "Landroidx/activity/BackEventCompat;",
        "handleOnBackStarted",
        "activity-compose_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $currentOnBack$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lkotlin/jvm/functions/Function2<",
            "Lkotlinx/coroutines/flow/Flow<",
            "Landroidx/activity/BackEventCompat;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $onBackInstance:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Landroidx/activity/compose/OnBackInstance;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onBackScope:Lkotlinx/coroutines/CoroutineScope;


# direct methods
.method constructor <init>(ZLkotlin/jvm/internal/Ref$ObjectRef;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/State;)V
    .locals 0
    .param p1, "$enabled"    # Z
    .param p2, "$onBackInstance"    # Lkotlin/jvm/internal/Ref$ObjectRef;
    .param p3, "$onBackScope"    # Lkotlinx/coroutines/CoroutineScope;
    .param p4, "$currentOnBack$delegate"    # Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Landroidx/activity/compose/OnBackInstance;",
            ">;",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lkotlin/jvm/functions/Function2<",
            "Lkotlinx/coroutines/flow/Flow<",
            "Landroidx/activity/BackEventCompat;",
            ">;-",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    iput-object p2, p0, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;->$onBackInstance:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p3, p0, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;->$onBackScope:Lkotlinx/coroutines/CoroutineScope;

    iput-object p4, p0, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;->$currentOnBack$delegate:Landroidx/compose/runtime/State;

    .line 83
    invoke-direct {p0, p1}, Landroidx/activity/OnBackPressedCallback;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public handleOnBackCancelled()V
    .locals 2

    .line 121
    invoke-super {p0}, Landroidx/activity/OnBackPressedCallback;->handleOnBackCancelled()V

    .line 123
    iget-object v0, p0, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;->$onBackInstance:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Landroidx/activity/compose/OnBackInstance;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/activity/compose/OnBackInstance;->cancel()V

    .line 124
    :cond_0
    iget-object v0, p0, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;->$onBackInstance:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Landroidx/activity/compose/OnBackInstance;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/activity/compose/OnBackInstance;->setPredictiveBack(Z)V

    .line 125
    :goto_0
    return-void
.end method

.method public handleOnBackPressed()V
    .locals 5

    .line 104
    iget-object v0, p0, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;->$onBackInstance:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Landroidx/activity/compose/OnBackInstance;

    if-eqz v0, :cond_1

    iget-object v1, p0, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;->$onBackInstance:Lkotlin/jvm/internal/Ref$ObjectRef;

    .local v0, "$this$handleOnBackPressed_u24lambda_u240":Landroidx/activity/compose/OnBackInstance;
    const/4 v2, 0x0

    .line 105
    .local v2, "$i$a$-apply-PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1$handleOnBackPressed$1":I
    invoke-virtual {v0}, Landroidx/activity/compose/OnBackInstance;->isPredictiveBack()Z

    move-result v3

    if-nez v3, :cond_0

    .line 106
    invoke-virtual {v0}, Landroidx/activity/compose/OnBackInstance;->cancel()V

    .line 107
    const/4 v3, 0x0

    iput-object v3, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 109
    :cond_0
    nop

    .line 104
    .end local v0    # "$this$handleOnBackPressed_u24lambda_u240":Landroidx/activity/compose/OnBackInstance;
    .end local v2    # "$i$a$-apply-PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1$handleOnBackPressed$1":I
    nop

    .line 110
    :cond_1
    iget-object v0, p0, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;->$onBackInstance:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    .line 111
    iget-object v0, p0, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;->$onBackInstance:Lkotlin/jvm/internal/Ref$ObjectRef;

    new-instance v2, Landroidx/activity/compose/OnBackInstance;

    iget-object v3, p0, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;->$onBackScope:Lkotlinx/coroutines/CoroutineScope;

    iget-object v4, p0, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;->$currentOnBack$delegate:Landroidx/compose/runtime/State;

    invoke-static {v4}, Landroidx/activity/compose/PredictiveBackHandlerKt;->access$PredictiveBackHandler$lambda$0(Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-direct {v2, v3, v1, v4}, Landroidx/activity/compose/OnBackInstance;-><init>(Lkotlinx/coroutines/CoroutineScope;ZLkotlin/jvm/functions/Function2;)V

    iput-object v2, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 116
    :cond_2
    iget-object v0, p0, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;->$onBackInstance:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Landroidx/activity/compose/OnBackInstance;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroidx/activity/compose/OnBackInstance;->close()Z

    .line 117
    :cond_3
    iget-object v0, p0, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;->$onBackInstance:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Landroidx/activity/compose/OnBackInstance;

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {v0, v1}, Landroidx/activity/compose/OnBackInstance;->setPredictiveBack(Z)V

    .line 118
    :goto_0
    return-void
.end method

.method public handleOnBackProgressed(Landroidx/activity/BackEventCompat;)V
    .locals 1
    .param p1, "backEvent"    # Landroidx/activity/BackEventCompat;

    .line 95
    invoke-super {p0, p1}, Landroidx/activity/OnBackPressedCallback;->handleOnBackProgressed(Landroidx/activity/BackEventCompat;)V

    .line 96
    iget-object v0, p0, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;->$onBackInstance:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Landroidx/activity/compose/OnBackInstance;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/activity/compose/OnBackInstance;->send-JP2dKIU(Landroidx/activity/BackEventCompat;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/channels/ChannelResult;->box-impl(Ljava/lang/Object;)Lkotlinx/coroutines/channels/ChannelResult;

    .line 97
    :cond_0
    return-void
.end method

.method public handleOnBackStarted(Landroidx/activity/BackEventCompat;)V
    .locals 5
    .param p1, "backEvent"    # Landroidx/activity/BackEventCompat;

    .line 86
    invoke-super {p0, p1}, Landroidx/activity/OnBackPressedCallback;->handleOnBackStarted(Landroidx/activity/BackEventCompat;)V

    .line 90
    iget-object v0, p0, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;->$onBackInstance:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Landroidx/activity/compose/OnBackInstance;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/activity/compose/OnBackInstance;->cancel()V

    .line 91
    :cond_0
    iget-object v0, p0, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;->$onBackInstance:Lkotlin/jvm/internal/Ref$ObjectRef;

    new-instance v1, Landroidx/activity/compose/OnBackInstance;

    iget-object v2, p0, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;->$onBackScope:Lkotlinx/coroutines/CoroutineScope;

    iget-object v3, p0, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;->$currentOnBack$delegate:Landroidx/compose/runtime/State;

    invoke-static {v3}, Landroidx/activity/compose/PredictiveBackHandlerKt;->access$PredictiveBackHandler$lambda$0(Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function2;

    move-result-object v3

    const/4 v4, 0x1

    invoke-direct {v1, v2, v4, v3}, Landroidx/activity/compose/OnBackInstance;-><init>(Lkotlinx/coroutines/CoroutineScope;ZLkotlin/jvm/functions/Function2;)V

    iput-object v1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 92
    return-void
.end method
