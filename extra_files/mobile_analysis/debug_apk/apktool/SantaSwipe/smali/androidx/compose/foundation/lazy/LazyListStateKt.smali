.class public final Landroidx/compose/foundation/lazy/LazyListStateKt;
.super Ljava/lang/Object;
.source "LazyListState.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLazyListState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,439:1\n50#2:440\n49#2:441\n1097#3,6:442\n*S KotlinDebug\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListStateKt\n*L\n62#1:440\n62#1:441\n62#1:442,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u001a!\u0010\u0000\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u0007\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "rememberLazyListState",
        "Landroidx/compose/foundation/lazy/LazyListState;",
        "initialFirstVisibleItemIndex",
        "",
        "initialFirstVisibleItemScrollOffset",
        "(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/LazyListState;",
        "foundation_release"
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
.method public static final rememberLazyListState(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/LazyListState;
    .locals 16
    .param p0, "initialFirstVisibleItemIndex"    # I
    .param p1, "initialFirstVisibleItemScrollOffset"    # I
    .param p2, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p3, "$changed"    # I

    move-object/from16 v7, p2

    move/from16 v8, p3

    const v0, 0x57a86af4

    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const-string v1, "C(rememberLazyListState)61@2758L130,61@2712L176:LazyListState.kt#428nma"

    invoke-static {v7, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v1, p4, 0x1

    if-eqz v1, :cond_0

    .line 59
    const/4 v1, 0x0

    move v9, v1

    .end local p0    # "initialFirstVisibleItemIndex":I
    .local v1, "initialFirstVisibleItemIndex":I
    goto :goto_0

    .line 0
    .end local v1    # "initialFirstVisibleItemIndex":I
    .restart local p0    # "initialFirstVisibleItemIndex":I
    :cond_0
    move/from16 v9, p0

    .line 59
    .end local p0    # "initialFirstVisibleItemIndex":I
    .local v9, "initialFirstVisibleItemIndex":I
    :goto_0
    and-int/lit8 v1, p4, 0x2

    if-eqz v1, :cond_1

    .line 60
    const/4 v1, 0x0

    move v10, v1

    .end local p1    # "initialFirstVisibleItemScrollOffset":I
    .local v1, "initialFirstVisibleItemScrollOffset":I
    goto :goto_1

    .line 59
    .end local v1    # "initialFirstVisibleItemScrollOffset":I
    .restart local p1    # "initialFirstVisibleItemScrollOffset":I
    :cond_1
    move/from16 v10, p1

    .line 60
    .end local p1    # "initialFirstVisibleItemScrollOffset":I
    .local v10, "initialFirstVisibleItemScrollOffset":I
    :goto_1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 61
    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:57)"

    invoke-static {v0, v8, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 62
    sget-object v1, Landroidx/compose/foundation/lazy/LazyListState;->Companion:Landroidx/compose/foundation/lazy/LazyListState$Companion;

    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/LazyListState$Companion;->getSaver()Landroidx/compose/runtime/saveable/Saver;

    move-result-object v1

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .local v2, "key1$iv":Ljava/lang/Object;
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .local v3, "key2$iv":Ljava/lang/Object;
    and-int/lit8 v4, v8, 0xe

    and-int/lit8 v5, v8, 0x70

    or-int/2addr v4, v5

    .local v4, "$changed$iv":I
    const/4 v5, 0x0

    .local v5, "$i$f$remember":I
    const v6, 0x1e7b2b64

    invoke-interface {v7, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const-string v6, "CC(remember)P(1,2):Composables.kt#9igjgp"

    invoke-static {v7, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 440
    invoke-interface {v7, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    invoke-interface {v7, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v6, v11

    .line 441
    nop

    .local v6, "invalid$iv$iv":Z
    move-object/from16 v11, p2

    .local v11, "$this$cache$iv$iv":Landroidx/compose/runtime/Composer;
    const/4 v12, 0x0

    .line 442
    .local v12, "$i$f$cache":I
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v13

    .local v13, "it$iv$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 443
    .local v14, "$i$a$-let-ComposerKt$cache$1$iv$iv":I
    if-nez v6, :cond_4

    sget-object v15, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v15}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v15

    if-ne v13, v15, :cond_3

    goto :goto_2

    .line 447
    :cond_3
    move-object/from16 p0, v2

    move-object v2, v13

    goto :goto_3

    .line 444
    :cond_4
    :goto_2
    const/4 v15, 0x0

    .line 62
    .local v15, "$i$a$-remember-LazyListStateKt$rememberLazyListState$1":I
    move-object/from16 p0, v2

    .end local v2    # "key1$iv":Ljava/lang/Object;
    .local p0, "key1$iv":Ljava/lang/Object;
    new-instance v2, Landroidx/compose/foundation/lazy/LazyListStateKt$rememberLazyListState$1$1;

    invoke-direct {v2, v9, v10}, Landroidx/compose/foundation/lazy/LazyListStateKt$rememberLazyListState$1$1;-><init>(II)V

    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 444
    .end local v15    # "$i$a$-remember-LazyListStateKt$rememberLazyListState$1":I
    nop

    .line 445
    .local v2, "value$iv$iv":Ljava/lang/Object;
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 446
    nop

    .line 443
    .end local v2    # "value$iv$iv":Ljava/lang/Object;
    :goto_3
    nop

    .line 442
    .end local v13    # "it$iv$iv":Ljava/lang/Object;
    .end local v14    # "$i$a$-let-ComposerKt$cache$1$iv$iv":I
    nop

    .line 441
    .end local v6    # "invalid$iv$iv":Z
    .end local v11    # "$this$cache$iv$iv":Landroidx/compose/runtime/Composer;
    .end local v12    # "$i$f$cache":I
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .end local v3    # "key2$iv":Ljava/lang/Object;
    .end local v4    # "$changed$iv":I
    .end local v5    # "$i$f$remember":I
    .end local p0    # "key1$iv":Ljava/lang/Object;
    move-object v3, v2

    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 62
    const/4 v2, 0x0

    const/16 v5, 0x48

    const/4 v6, 0x4

    move-object/from16 v4, p2

    invoke-static/range {v0 .. v6}, Landroidx/compose/runtime/saveable/RememberSaveableKt;->rememberSaveable([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/lazy/LazyListState;

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_5
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    return-object v0
.end method
