.class final Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "Clickable.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/ClickableKt;->handlePressInteraction-EPk0efs(Landroidx/compose/foundation/gestures/PressGestureScope;JLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/AbstractClickableNode$InteractionData;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2"
    f = "Clickable.kt"
    i = {
        0x0,
        0x1,
        0x2
    }
    l = {
        0x12b,
        0x12d,
        0x134,
        0x135,
        0x13e
    }
    m = "invokeSuspend"
    n = {
        "delayJob",
        "success",
        "release"
    }
    s = {
        "L$0",
        "Z$0",
        "L$0"
    }
.end annotation


# instance fields
.field final synthetic $delayPressInteraction:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $interactionData:Landroidx/compose/foundation/AbstractClickableNode$InteractionData;

.field final synthetic $interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

.field final synthetic $pressPoint:J

.field final synthetic $this_handlePressInteraction:Landroidx/compose/foundation/gestures/PressGestureScope;

.field private synthetic L$0:Ljava/lang/Object;

.field Z$0:Z

.field label:I


# direct methods
.method constructor <init>(Landroidx/compose/foundation/gestures/PressGestureScope;JLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/AbstractClickableNode$InteractionData;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/PressGestureScope;",
            "J",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/foundation/AbstractClickableNode$InteractionData;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->$this_handlePressInteraction:Landroidx/compose/foundation/gestures/PressGestureScope;

    iput-wide p2, p0, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->$pressPoint:J

    iput-object p4, p0, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iput-object p5, p0, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->$interactionData:Landroidx/compose/foundation/AbstractClickableNode$InteractionData;

    iput-object p6, p0, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->$delayPressInteraction:Lkotlin/jvm/functions/Function0;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v8, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;

    iget-object v1, p0, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->$this_handlePressInteraction:Landroidx/compose/foundation/gestures/PressGestureScope;

    iget-wide v2, p0, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->$pressPoint:J

    iget-object v4, p0, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iget-object v5, p0, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->$interactionData:Landroidx/compose/foundation/AbstractClickableNode$InteractionData;

    iget-object v6, p0, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->$delayPressInteraction:Lkotlin/jvm/functions/Function0;

    move-object v0, v8

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;-><init>(Landroidx/compose/foundation/gestures/PressGestureScope;JLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/AbstractClickableNode$InteractionData;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v8, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->L$0:Ljava/lang/Object;

    check-cast v8, Lkotlin/coroutines/Continuation;

    return-object v8
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 290
    iget v1, p0, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->label:I

    const/4 v2, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    move-object v0, p0

    .local v0, "this":Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;
    .local p1, "$result":Ljava/lang/Object;
    const/4 v1, 0x0

    .local v1, "$i$a$-let-ClickableKt$handlePressInteraction$2$1":I
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    .end local v0    # "this":Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;
    .end local v1    # "$i$a$-let-ClickableKt$handlePressInteraction$2$1":I
    .end local p1    # "$result":Ljava/lang/Object;
    :pswitch_1
    move-object v0, p0

    .restart local v0    # "this":Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;
    .restart local p1    # "$result":Ljava/lang/Object;
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    .end local v0    # "this":Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;
    .end local p1    # "$result":Ljava/lang/Object;
    :pswitch_2
    move-object v1, p0

    .local v1, "this":Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;
    .restart local p1    # "$result":Ljava/lang/Object;
    iget-object v3, v1, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->L$0:Ljava/lang/Object;

    check-cast v3, Landroidx/compose/foundation/interaction/PressInteraction$Release;

    .local v3, "release":Landroidx/compose/foundation/interaction/PressInteraction$Release;
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_2

    .end local v1    # "this":Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;
    .end local v3    # "release":Landroidx/compose/foundation/interaction/PressInteraction$Release;
    .end local p1    # "$result":Ljava/lang/Object;
    :pswitch_3
    move-object v1, p0

    .restart local v1    # "this":Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;
    .restart local p1    # "$result":Ljava/lang/Object;
    iget-boolean v3, v1, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->Z$0:Z

    .local v3, "success":Z
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_1

    .end local v1    # "this":Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;
    .end local v3    # "success":Z
    .end local p1    # "$result":Ljava/lang/Object;
    :pswitch_4
    move-object v1, p0

    .restart local v1    # "this":Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;
    .restart local p1    # "$result":Ljava/lang/Object;
    iget-object v3, v1, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->L$0:Ljava/lang/Object;

    check-cast v3, Lkotlinx/coroutines/Job;

    .local v3, "delayJob":Lkotlinx/coroutines/Job;
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v4, v3

    move-object v3, v1

    move-object v1, p1

    goto :goto_0

    .end local v1    # "this":Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;
    .end local v3    # "delayJob":Lkotlinx/coroutines/Job;
    .end local p1    # "$result":Ljava/lang/Object;
    :pswitch_5
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v1, p0

    .restart local v1    # "this":Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;
    .restart local p1    # "$result":Ljava/lang/Object;
    iget-object v3, v1, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->L$0:Ljava/lang/Object;

    check-cast v3, Lkotlinx/coroutines/CoroutineScope;

    .line 291
    .local v3, "$this$coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    new-instance v11, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2$delayJob$1;

    iget-object v5, v1, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->$delayPressInteraction:Lkotlin/jvm/functions/Function0;

    iget-wide v6, v1, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->$pressPoint:J

    iget-object v8, v1, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iget-object v9, v1, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->$interactionData:Landroidx/compose/foundation/AbstractClickableNode$InteractionData;

    const/4 v10, 0x0

    move-object v4, v11

    invoke-direct/range {v4 .. v10}, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2$delayJob$1;-><init>(Lkotlin/jvm/functions/Function0;JLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/AbstractClickableNode$InteractionData;Lkotlin/coroutines/Continuation;)V

    move-object v7, v11

    check-cast v7, Lkotlin/jvm/functions/Function2;

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v4, v3

    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object v3

    .line 299
    .local v3, "delayJob":Lkotlinx/coroutines/Job;
    iget-object v4, v1, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->$this_handlePressInteraction:Landroidx/compose/foundation/gestures/PressGestureScope;

    move-object v5, v1

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput-object v3, v1, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->L$0:Ljava/lang/Object;

    const/4 v6, 0x1

    iput v6, v1, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->label:I

    invoke-interface {v4, v5}, Landroidx/compose/foundation/gestures/PressGestureScope;->tryAwaitRelease(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_0

    .line 290
    return-object v0

    .line 299
    :cond_0
    move-object v12, v1

    move-object v1, p1

    move-object p1, v4

    move-object v4, v3

    move-object v3, v12

    .end local p1    # "$result":Ljava/lang/Object;
    .local v1, "$result":Ljava/lang/Object;
    .local v3, "this":Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;
    .local v4, "delayJob":Lkotlinx/coroutines/Job;
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 300
    .local p1, "success":Z
    invoke-interface {v4}, Lkotlinx/coroutines/Job;->isActive()Z

    move-result v5

    if-eqz v5, :cond_5

    .line 301
    move-object v5, v3

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput-object v2, v3, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->L$0:Ljava/lang/Object;

    iput-boolean p1, v3, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->Z$0:Z

    const/4 v6, 0x2

    iput v6, v3, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->label:I

    invoke-static {v4, v5}, Lkotlinx/coroutines/JobKt;->cancelAndJoin(Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    .end local v4    # "delayJob":Lkotlinx/coroutines/Job;
    if-ne v4, v0, :cond_1

    .line 290
    return-object v0

    .line 301
    :cond_1
    move-object v12, v3

    move v3, p1

    move-object p1, v1

    move-object v1, v12

    .line 305
    .local v1, "this":Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;
    .local v3, "success":Z
    .local p1, "$result":Ljava/lang/Object;
    :goto_1
    if-eqz v3, :cond_4

    .line 306
    .end local v3    # "success":Z
    new-instance v3, Landroidx/compose/foundation/interaction/PressInteraction$Press;

    iget-wide v4, v1, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->$pressPoint:J

    invoke-direct {v3, v4, v5, v2}, Landroidx/compose/foundation/interaction/PressInteraction$Press;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 307
    .local v3, "press":Landroidx/compose/foundation/interaction/PressInteraction$Press;
    new-instance v4, Landroidx/compose/foundation/interaction/PressInteraction$Release;

    invoke-direct {v4, v3}, Landroidx/compose/foundation/interaction/PressInteraction$Release;-><init>(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V

    .line 308
    .local v4, "release":Landroidx/compose/foundation/interaction/PressInteraction$Release;
    iget-object v5, v1, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-object v6, v3

    check-cast v6, Landroidx/compose/foundation/interaction/Interaction;

    move-object v7, v1

    check-cast v7, Lkotlin/coroutines/Continuation;

    iput-object v4, v1, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->L$0:Ljava/lang/Object;

    const/4 v8, 0x3

    iput v8, v1, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->label:I

    invoke-interface {v5, v6, v7}, Landroidx/compose/foundation/interaction/MutableInteractionSource;->emit(Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    .end local v3    # "press":Landroidx/compose/foundation/interaction/PressInteraction$Press;
    if-ne v3, v0, :cond_2

    .line 290
    return-object v0

    .line 308
    :cond_2
    move-object v3, v4

    .line 309
    .end local v4    # "release":Landroidx/compose/foundation/interaction/PressInteraction$Release;
    .local v3, "release":Landroidx/compose/foundation/interaction/PressInteraction$Release;
    :goto_2
    iget-object v4, v1, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-object v5, v3

    check-cast v5, Landroidx/compose/foundation/interaction/Interaction;

    move-object v6, v1

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput-object v2, v1, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->L$0:Ljava/lang/Object;

    const/4 v7, 0x4

    iput v7, v1, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->label:I

    invoke-interface {v4, v5, v6}, Landroidx/compose/foundation/interaction/MutableInteractionSource;->emit(Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    .end local v3    # "release":Landroidx/compose/foundation/interaction/PressInteraction$Release;
    if-ne v3, v0, :cond_3

    .line 290
    return-object v0

    .line 309
    :cond_3
    move-object v0, v1

    .end local v1    # "this":Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;
    .restart local v0    # "this":Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;
    :goto_3
    move-object v1, p1

    move-object v3, v0

    goto :goto_6

    .line 305
    .end local v0    # "this":Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;
    .restart local v1    # "this":Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;
    .local v3, "success":Z
    :cond_4
    move-object v3, v1

    move-object v1, p1

    goto :goto_6

    .line 312
    .local v1, "$result":Ljava/lang/Object;
    .local v3, "this":Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;
    .local p1, "success":Z
    :cond_5
    iget-object v4, v3, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->$interactionData:Landroidx/compose/foundation/AbstractClickableNode$InteractionData;

    invoke-virtual {v4}, Landroidx/compose/foundation/AbstractClickableNode$InteractionData;->getPressInteraction()Landroidx/compose/foundation/interaction/PressInteraction$Press;

    move-result-object v4

    if-eqz v4, :cond_8

    iget-object v5, v3, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .local v4, "pressInteraction":Landroidx/compose/foundation/interaction/PressInteraction$Press;
    const/4 v6, 0x0

    .line 313
    .local v6, "$i$a$-let-ClickableKt$handlePressInteraction$2$1":I
    nop

    .end local p1    # "success":Z
    if-eqz p1, :cond_6

    .line 314
    new-instance p1, Landroidx/compose/foundation/interaction/PressInteraction$Release;

    invoke-direct {p1, v4}, Landroidx/compose/foundation/interaction/PressInteraction$Release;-><init>(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V

    check-cast p1, Landroidx/compose/foundation/interaction/PressInteraction;

    goto :goto_4

    .line 316
    :cond_6
    new-instance p1, Landroidx/compose/foundation/interaction/PressInteraction$Cancel;

    invoke-direct {p1, v4}, Landroidx/compose/foundation/interaction/PressInteraction$Cancel;-><init>(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V

    check-cast p1, Landroidx/compose/foundation/interaction/PressInteraction;

    .line 313
    .end local v4    # "pressInteraction":Landroidx/compose/foundation/interaction/PressInteraction$Press;
    :goto_4
    nop

    .line 318
    .local p1, "endInteraction":Landroidx/compose/foundation/interaction/PressInteraction;
    move-object v4, p1

    check-cast v4, Landroidx/compose/foundation/interaction/Interaction;

    iput-object v2, v3, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->L$0:Ljava/lang/Object;

    const/4 v7, 0x5

    iput v7, v3, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->label:I

    invoke-interface {v5, v4, v3}, Landroidx/compose/foundation/interaction/MutableInteractionSource;->emit(Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    .end local p1    # "endInteraction":Landroidx/compose/foundation/interaction/PressInteraction;
    if-ne p1, v0, :cond_7

    .line 290
    return-object v0

    .line 318
    :cond_7
    move-object p1, v1

    move-object v0, v3

    move v1, v6

    .line 319
    .end local v3    # "this":Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;
    .end local v6    # "$i$a$-let-ClickableKt$handlePressInteraction$2$1":I
    .restart local v0    # "this":Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;
    .local v1, "$i$a$-let-ClickableKt$handlePressInteraction$2$1":I
    .local p1, "$result":Ljava/lang/Object;
    :goto_5
    nop

    .line 312
    .end local v1    # "$i$a$-let-ClickableKt$handlePressInteraction$2$1":I
    move-object v1, p1

    move-object v3, v0

    nop

    .line 321
    .end local v0    # "this":Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;
    .end local p1    # "$result":Ljava/lang/Object;
    .local v1, "$result":Ljava/lang/Object;
    .restart local v3    # "this":Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;
    :cond_8
    :goto_6
    iget-object p1, v3, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->$interactionData:Landroidx/compose/foundation/AbstractClickableNode$InteractionData;

    invoke-virtual {p1, v2}, Landroidx/compose/foundation/AbstractClickableNode$InteractionData;->setPressInteraction(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V

    .line 322
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
