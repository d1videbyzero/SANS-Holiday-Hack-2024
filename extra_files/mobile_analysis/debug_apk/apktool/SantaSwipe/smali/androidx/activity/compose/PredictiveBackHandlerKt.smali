.class public final Landroidx/activity/compose/PredictiveBackHandlerKt;
.super Ljava/lang/Object;
.source "PredictiveBackHandler.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPredictiveBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PredictiveBackHandler.kt\nandroidx/activity/compose/PredictiveBackHandlerKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt\n*L\n1#1,178:1\n473#2,4:179\n477#2,2:187\n481#2:193\n25#3:183\n955#4,3:184\n958#4,3:190\n955#4,6:194\n955#4,6:201\n473#5:189\n76#6:200\n89#7:207\n*S KotlinDebug\n*F\n+ 1 PredictiveBackHandler.kt\nandroidx/activity/compose/PredictiveBackHandlerKt\n*L\n79#1:179,4\n79#1:187,2\n79#1:193\n79#1:183\n79#1:184,3\n79#1:190,3\n82#1:194,6\n143#1:201,6\n79#1:189\n141#1:200\n78#1:207\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u001aZ\u0010\u0000\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032A\u0010\u0004\u001a=\u0008\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0008\u0008\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u000b\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0001\u00a2\u0006\u0002\u0008\u00080\u000c\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0005H\u0007\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f\u00b2\u0006E\u0010\u0010\u001a=\u0008\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0008\u0008\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u000b\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0001\u00a2\u0006\u0002\u0008\u00080\u000c\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0005X\u008a\u0084\u0002"
    }
    d2 = {
        "PredictiveBackHandler",
        "",
        "enabled",
        "",
        "onBack",
        "Lkotlin/Function2;",
        "Lkotlinx/coroutines/flow/Flow;",
        "Landroidx/activity/BackEventCompat;",
        "Lkotlin/jvm/JvmSuppressWildcards;",
        "Lkotlin/ParameterName;",
        "name",
        "progress",
        "Lkotlin/coroutines/Continuation;",
        "",
        "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V",
        "activity-compose_release",
        "currentOnBack"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final PredictiveBackHandler(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
    .locals 19
    .param p0, "enabled"    # Z
    .param p1, "onBack"    # Lkotlin/jvm/functions/Function2;
    .param p2, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p3, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function2<",
            "Lkotlinx/coroutines/flow/Flow<",
            "Landroidx/activity/BackEventCompat;",
            ">;-",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 76
    move-object/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, p4

    const v3, -0x264426c9

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v3

    .end local p2    # "$composer":Landroidx/compose/runtime/Composer;
    .local v3, "$composer":Landroidx/compose/runtime/Composer;
    const-string v4, "C(PredictiveBackHandler)77@3028L28,78@3079L24,81@3175L2013,128@5194L176,*136@5444L7,140@5632L7,142@5694L137,142@5645L186:PredictiveBackHandler.kt#q1dkbc"

    invoke-static {v3, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v4, p3

    .local v4, "$dirty":I
    and-int/lit8 v5, v2, 0x1

    if-eqz v5, :cond_0

    or-int/lit8 v4, v4, 0x6

    move/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v1, 0x6

    if-nez v6, :cond_2

    move/from16 v6, p0

    invoke-interface {v3, v6}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v4, v7

    goto :goto_1

    :cond_2
    move/from16 v6, p0

    :goto_1
    and-int/lit8 v7, v2, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v4, v4, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v1, 0x30

    if-nez v7, :cond_5

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    :cond_5
    :goto_3
    and-int/lit8 v7, v4, 0x13

    const/16 v8, 0x12

    if-ne v7, v8, :cond_7

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_4

    .line 150
    :cond_6
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move/from16 p2, v4

    goto/16 :goto_a

    .line 76
    :cond_7
    :goto_4
    if-eqz v5, :cond_8

    .line 73
    const/4 v5, 0x1

    .end local p0    # "enabled":Z
    .local v5, "enabled":Z
    goto :goto_5

    .line 76
    .end local v5    # "enabled":Z
    .restart local p0    # "enabled":Z
    :cond_8
    move v5, v6

    .line 78
    .end local p0    # "enabled":Z
    .restart local v5    # "enabled":Z
    :goto_5
    shr-int/lit8 v6, v4, 0x3

    and-int/lit8 v6, v6, 0xe

    invoke-static {v0, v3, v6}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v6

    .line 79
    .local v6, "currentOnBack$delegate":Landroidx/compose/runtime/State;
    const/4 v7, 0x0

    move v8, v7

    .local v8, "$changed$iv":I
    const/4 v9, 0x0

    .local v9, "$i$f$rememberCoroutineScope":I
    const v10, -0x2b2019d8

    invoke-interface {v3, v10}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const-string v10, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp"

    invoke-static {v3, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 179
    nop

    .line 181
    move-object v10, v3

    .line 182
    .local v10, "composer$iv":Landroidx/compose/runtime/Composer;
    move v11, v7

    .local v11, "$changed$iv$iv":I
    const/4 v12, 0x0

    .local v12, "$i$f$remember":I
    const v13, -0x384349

    invoke-interface {v3, v13}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const-string v13, "C(remember):Composables.kt#9igjgp"

    invoke-static {v3, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 183
    const/4 v13, 0x0

    .local v13, "invalid$iv$iv$iv":Z
    move-object v14, v3

    .local v14, "$this$cache$iv$iv$iv":Landroidx/compose/runtime/Composer;
    const/4 v15, 0x0

    .line 184
    .local v15, "$i$f$cache":I
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    .local v7, "it$iv$iv$iv":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 185
    .local v16, "$i$a$-let-ComposerKt$cache$1$iv$iv$iv":I
    sget-object v17, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 p2, v8

    .end local v8    # "$changed$iv":I
    .local p2, "$changed$iv":I
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v7, v8, :cond_9

    .line 186
    const/4 v8, 0x0

    .line 187
    .local v8, "$i$a$-remember-EffectsKt$rememberCoroutineScope$wrapper$1$iv":I
    nop

    .line 188
    const/16 v17, 0x0

    .line 189
    .local v17, "$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1":I
    sget-object v17, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 188
    .end local v17    # "$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1":I
    move-object/from16 v18, v7

    .end local v7    # "it$iv$iv$iv":Ljava/lang/Object;
    .local v18, "it$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v7, v17

    check-cast v7, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v7, v10}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v7

    .line 187
    move/from16 v17, v8

    .end local v8    # "$i$a$-remember-EffectsKt$rememberCoroutineScope$wrapper$1$iv":I
    .local v17, "$i$a$-remember-EffectsKt$rememberCoroutineScope$wrapper$1$iv":I
    new-instance v8, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    invoke-direct {v8, v7}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;-><init>(Lkotlinx/coroutines/CoroutineScope;)V

    .end local v17    # "$i$a$-remember-EffectsKt$rememberCoroutineScope$wrapper$1$iv":I
    move-object v7, v8

    .line 190
    .local v7, "value$iv$iv$iv":Ljava/lang/Object;
    invoke-interface {v14, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 191
    nop

    .end local v7    # "value$iv$iv$iv":Ljava/lang/Object;
    goto :goto_6

    .line 192
    .end local v18    # "it$iv$iv$iv":Ljava/lang/Object;
    .local v7, "it$iv$iv$iv":Ljava/lang/Object;
    :cond_9
    move-object/from16 v18, v7

    .line 185
    .end local v7    # "it$iv$iv$iv":Ljava/lang/Object;
    .restart local v18    # "it$iv$iv$iv":Ljava/lang/Object;
    :goto_6
    nop

    .line 184
    .end local v16    # "$i$a$-let-ComposerKt$cache$1$iv$iv$iv":I
    .end local v18    # "it$iv$iv$iv":Ljava/lang/Object;
    nop

    .line 183
    .end local v13    # "invalid$iv$iv$iv":Z
    .end local v14    # "$this$cache$iv$iv$iv":Landroidx/compose/runtime/Composer;
    .end local v15    # "$i$f$cache":I
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 182
    .end local v11    # "$changed$iv$iv":I
    .end local v12    # "$i$f$remember":I
    check-cast v7, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    .line 193
    .local v7, "wrapper$iv":Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;
    invoke-virtual {v7}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;->getCoroutineScope()Lkotlinx/coroutines/CoroutineScope;

    move-result-object v8

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 79
    .end local v7    # "wrapper$iv":Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;
    .end local v9    # "$i$f$rememberCoroutineScope":I
    .end local v10    # "composer$iv":Landroidx/compose/runtime/Composer;
    .end local p2    # "$changed$iv":I
    move-object v7, v8

    .line 80
    .local v7, "onBackScope":Lkotlinx/coroutines/CoroutineScope;
    new-instance v8, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v8}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .local v8, "onBackInstance":Lkotlin/jvm/internal/Ref$ObjectRef;
    const v9, -0x3fdefee7

    invoke-interface {v3, v9}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const-string v9, "CC(remember):PredictiveBackHandler.kt#9igjgp"

    invoke-static {v3, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 82
    const/4 v10, 0x0

    move v11, v10

    .local v11, "invalid$iv":Z
    move-object v10, v3

    .local v10, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v12, 0x0

    .line 194
    .local v12, "$i$f$cache":I
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v13

    .local v13, "it$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 195
    .local v14, "$i$a$-let-ComposerKt$cache$1$iv":I
    sget-object v15, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v15}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v15

    if-ne v13, v15, :cond_a

    .line 196
    const/4 v15, 0x0

    .line 83
    .local v15, "$i$a$-cache-PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1":I
    move/from16 p2, v11

    .end local v11    # "invalid$iv":Z
    .local p2, "invalid$iv":Z
    new-instance v11, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;

    invoke-direct {v11, v5, v8, v7, v6}, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;-><init>(ZLkotlin/jvm/internal/Ref$ObjectRef;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/State;)V

    .line 196
    .end local v15    # "$i$a$-cache-PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1":I
    nop

    .line 197
    .local v11, "value$iv":Ljava/lang/Object;
    invoke-interface {v10, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 198
    nop

    .end local v11    # "value$iv":Ljava/lang/Object;
    goto :goto_7

    .line 199
    .end local p2    # "invalid$iv":Z
    .local v11, "invalid$iv":Z
    :cond_a
    move/from16 p2, v11

    .end local v11    # "invalid$iv":Z
    .restart local p2    # "invalid$iv":Z
    move-object v11, v13

    .line 195
    :goto_7
    nop

    .line 194
    .end local v13    # "it$iv":Ljava/lang/Object;
    .end local v14    # "$i$a$-let-ComposerKt$cache$1$iv":I
    nop

    .line 82
    .end local v10    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v12    # "$i$f$cache":I
    .end local p2    # "invalid$iv":Z
    move-object v10, v11

    check-cast v10, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;

    .local v10, "backCallBack":Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 129
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    new-instance v12, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$1;

    const/4 v13, 0x0

    invoke-direct {v12, v10, v5, v8, v13}, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$1;-><init>(Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;ZLkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V

    check-cast v12, Lkotlin/jvm/functions/Function2;

    and-int/lit8 v13, v4, 0xe

    invoke-static {v11, v12, v3, v13}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 137
    sget-object v11, Landroidx/activity/compose/LocalOnBackPressedDispatcherOwner;->INSTANCE:Landroidx/activity/compose/LocalOnBackPressedDispatcherOwner;

    const/4 v12, 0x6

    invoke-virtual {v11, v3, v12}, Landroidx/activity/compose/LocalOnBackPressedDispatcherOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/activity/OnBackPressedDispatcherOwner;

    move-result-object v11

    if-eqz v11, :cond_e

    .line 139
    invoke-interface {v11}, Landroidx/activity/OnBackPressedDispatcherOwner;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object v11

    .line 137
    nop

    .line 141
    .local v11, "backDispatcher":Landroidx/activity/OnBackPressedDispatcher;
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v12

    check-cast v12, Landroidx/compose/runtime/CompositionLocal;

    .local v12, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v13, 0x0

    .local v13, "$changed$iv":I
    const/4 v14, 0x0

    .line 200
    .local v14, "$i$f$getCurrent":I
    const v15, 0x6292b32

    move/from16 p2, v4

    .end local v4    # "$dirty":I
    .local p2, "$dirty":I
    const-string v4, "C:CompositionLocal.kt#9igjgp"

    invoke-static {v3, v15, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v3, v12}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 141
    .end local v12    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v13    # "$changed$iv":I
    .end local v14    # "$i$f$getCurrent":I
    check-cast v4, Landroidx/lifecycle/LifecycleOwner;

    .line 143
    .local v4, "lifecycleOwner":Landroidx/lifecycle/LifecycleOwner;
    const v12, -0x3fdef510

    invoke-interface {v3, v12}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-static {v3, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-interface {v3, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    invoke-interface {v3, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v9, v12

    invoke-interface {v3, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v9, v12

    .local v9, "invalid$iv":Z
    move-object v12, v3

    .local v12, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v13, 0x0

    .line 201
    .local v13, "$i$f$cache":I
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v14

    .local v14, "it$iv":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 202
    .local v15, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v9, :cond_c

    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v17, v5

    .end local v5    # "enabled":Z
    .local v17, "enabled":Z
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v14, v5, :cond_b

    goto :goto_8

    .line 206
    :cond_b
    move-object v5, v14

    goto :goto_9

    .line 202
    .end local v17    # "enabled":Z
    .restart local v5    # "enabled":Z
    :cond_c
    move/from16 v17, v5

    .line 203
    .end local v5    # "enabled":Z
    .restart local v17    # "enabled":Z
    :goto_8
    const/4 v5, 0x0

    .line 143
    .local v5, "$i$a$-cache-PredictiveBackHandlerKt$PredictiveBackHandler$2":I
    move/from16 v16, v5

    .end local v5    # "$i$a$-cache-PredictiveBackHandlerKt$PredictiveBackHandler$2":I
    .local v16, "$i$a$-cache-PredictiveBackHandlerKt$PredictiveBackHandler$2":I
    new-instance v5, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$2$1;

    invoke-direct {v5, v11, v4, v10}, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$2$1;-><init>(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;)V

    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 203
    .end local v16    # "$i$a$-cache-PredictiveBackHandlerKt$PredictiveBackHandler$2":I
    nop

    .line 204
    .local v5, "value$iv":Ljava/lang/Object;
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 205
    nop

    .line 202
    .end local v5    # "value$iv":Ljava/lang/Object;
    :goto_9
    nop

    .line 201
    .end local v14    # "it$iv":Ljava/lang/Object;
    .end local v15    # "$i$a$-let-ComposerKt$cache$1$iv":I
    nop

    .line 143
    .end local v9    # "invalid$iv":Z
    .end local v12    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v13    # "$i$f$cache":I
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    const/4 v9, 0x0

    invoke-static {v4, v11, v5, v3, v9}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move/from16 v6, v17

    .line 150
    .end local v4    # "lifecycleOwner":Landroidx/lifecycle/LifecycleOwner;
    .end local v7    # "onBackScope":Lkotlinx/coroutines/CoroutineScope;
    .end local v8    # "onBackInstance":Lkotlin/jvm/internal/Ref$ObjectRef;
    .end local v10    # "backCallBack":Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;
    .end local v11    # "backDispatcher":Landroidx/activity/OnBackPressedDispatcher;
    .end local v17    # "enabled":Z
    .local v6, "enabled":Z
    :goto_a
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v4

    if-eqz v4, :cond_d

    new-instance v5, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$3;

    invoke-direct {v5, v6, v0, v1, v2}, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$3;-><init>(ZLkotlin/jvm/functions/Function2;II)V

    check-cast v5, Lkotlin/jvm/functions/Function2;

    invoke-interface {v4, v5}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_d
    return-void

    .line 137
    .end local p2    # "$dirty":I
    .local v4, "$dirty":I
    .local v5, "enabled":Z
    .local v6, "currentOnBack$delegate":Landroidx/compose/runtime/State;
    .restart local v7    # "onBackScope":Lkotlinx/coroutines/CoroutineScope;
    .restart local v8    # "onBackInstance":Lkotlin/jvm/internal/Ref$ObjectRef;
    .restart local v10    # "backCallBack":Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;
    :cond_e
    move/from16 p2, v4

    .end local v4    # "$dirty":I
    .restart local p2    # "$dirty":I
    const/4 v2, 0x0

    .line 138
    .local v2, "$i$a$-checkNotNull-PredictiveBackHandlerKt$PredictiveBackHandler$backDispatcher$1":I
    nop

    .line 137
    .end local v2    # "$i$a$-checkNotNull-PredictiveBackHandlerKt$PredictiveBackHandler$backDispatcher$1":I
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v4, "No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner"

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method private static final PredictiveBackHandler$lambda$0(Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function2;
    .locals 4
    .param p0, "$currentOnBack$delegate"    # Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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
            ">;>;)",
            "Lkotlin/jvm/functions/Function2<",
            "Lkotlinx/coroutines/flow/Flow<",
            "Landroidx/activity/BackEventCompat;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 78
    const/4 v0, 0x0

    .local v0, "thisObj$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .local v1, "property$iv":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "$this$getValue$iv":Landroidx/compose/runtime/State;
    const/4 v3, 0x0

    .line 207
    .local v3, "$i$f$getValue":I
    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "thisObj$iv":Ljava/lang/Object;
    .end local v1    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v2    # "$this$getValue$iv":Landroidx/compose/runtime/State;
    .end local v3    # "$i$f$getValue":I
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 78
    return-object v0
.end method

.method public static final synthetic access$PredictiveBackHandler$lambda$0(Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function2;
    .locals 1
    .param p0, "$currentOnBack$delegate"    # Landroidx/compose/runtime/State;

    .line 1
    invoke-static {p0}, Landroidx/activity/compose/PredictiveBackHandlerKt;->PredictiveBackHandler$lambda$0(Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function2;

    move-result-object v0

    return-object v0
.end method
