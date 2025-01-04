.class public final Lcom/northpole/santaswipe/ui/theme/ThemeKt;
.super Ljava/lang/Object;
.source "Theme.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Theme.kt\ncom/northpole/santaswipe/ui/theme/ThemeKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,58:1\n76#2:59\n*S KotlinDebug\n*F\n+ 1 Theme.kt\ncom/northpole/santaswipe/ui/theme/ThemeKt\n*L\n45#1:59\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a4\u0010\u0003\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0011\u0010\u0008\u001a\r\u0012\u0004\u0012\u00020\u00040\t\u00a2\u0006\u0002\u0008\nH\u0007\u00a2\u0006\u0002\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "DarkColorScheme",
        "Landroidx/compose/material3/ColorScheme;",
        "LightColorScheme",
        "SantaSwipeTheme",
        "",
        "darkTheme",
        "",
        "dynamicColor",
        "content",
        "Lkotlin/Function0;",
        "Landroidx/compose/runtime/Composable;",
        "(ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V",
        "app_debug"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final DarkColorScheme:Landroidx/compose/material3/ColorScheme;

.field private static final LightColorScheme:Landroidx/compose/material3/ColorScheme;


# direct methods
.method static constructor <clinit>()V
    .locals 61

    .line 14
    nop

    .line 15
    invoke-static {}, Lcom/northpole/santaswipe/ui/theme/ColorKt;->getPurple80()J

    move-result-wide v0

    .line 14
    nop

    .line 16
    invoke-static {}, Lcom/northpole/santaswipe/ui/theme/ColorKt;->getPurpleGrey80()J

    move-result-wide v10

    .line 14
    nop

    .line 17
    invoke-static {}, Lcom/northpole/santaswipe/ui/theme/ColorKt;->getPink80()J

    move-result-wide v18

    .line 14
    const v58, 0x1ffffdde

    const/16 v59, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const-wide/16 v16, 0x0

    const-wide/16 v20, 0x0

    const-wide/16 v22, 0x0

    const-wide/16 v24, 0x0

    const-wide/16 v26, 0x0

    const-wide/16 v28, 0x0

    const-wide/16 v30, 0x0

    const-wide/16 v32, 0x0

    const-wide/16 v34, 0x0

    const-wide/16 v36, 0x0

    const-wide/16 v38, 0x0

    const-wide/16 v40, 0x0

    const-wide/16 v42, 0x0

    const-wide/16 v44, 0x0

    const-wide/16 v46, 0x0

    const-wide/16 v48, 0x0

    const-wide/16 v50, 0x0

    const-wide/16 v52, 0x0

    const-wide/16 v54, 0x0

    const-wide/16 v56, 0x0

    invoke-static/range {v0 .. v59}, Landroidx/compose/material3/ColorSchemeKt;->darkColorScheme-G1PFc-w$default(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJILjava/lang/Object;)Landroidx/compose/material3/ColorScheme;

    move-result-object v0

    sput-object v0, Lcom/northpole/santaswipe/ui/theme/ThemeKt;->DarkColorScheme:Landroidx/compose/material3/ColorScheme;

    .line 20
    nop

    .line 21
    invoke-static {}, Lcom/northpole/santaswipe/ui/theme/ColorKt;->getPurple40()J

    move-result-wide v1

    .line 20
    nop

    .line 22
    invoke-static {}, Lcom/northpole/santaswipe/ui/theme/ColorKt;->getPurpleGrey40()J

    move-result-wide v11

    .line 20
    nop

    .line 23
    invoke-static {}, Lcom/northpole/santaswipe/ui/theme/ColorKt;->getPink40()J

    move-result-wide v19

    .line 20
    const v59, 0x1ffffdde

    const/16 v60, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    const-wide/16 v31, 0x0

    const-wide/16 v33, 0x0

    const-wide/16 v35, 0x0

    const-wide/16 v37, 0x0

    const-wide/16 v39, 0x0

    const-wide/16 v41, 0x0

    const-wide/16 v43, 0x0

    const-wide/16 v45, 0x0

    const-wide/16 v47, 0x0

    const-wide/16 v49, 0x0

    const-wide/16 v51, 0x0

    const-wide/16 v53, 0x0

    const-wide/16 v55, 0x0

    const-wide/16 v57, 0x0

    invoke-static/range {v1 .. v60}, Landroidx/compose/material3/ColorSchemeKt;->lightColorScheme-G1PFc-w$default(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJILjava/lang/Object;)Landroidx/compose/material3/ColorScheme;

    move-result-object v0

    sput-object v0, Lcom/northpole/santaswipe/ui/theme/ThemeKt;->LightColorScheme:Landroidx/compose/material3/ColorScheme;

    return-void
.end method

.method public static final SantaSwipeTheme(ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
    .locals 9
    .param p0, "darkTheme"    # Z
    .param p1, "dynamicColor"    # Z
    .param p2, "content"    # Lkotlin/jvm/functions/Function2;
    .param p3, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p4, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v0, "content"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    const v0, -0x493c1437

    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p3

    const-string v1, "C(SantaSwipeTheme)P(1,2)37@1099L21,52@1586L114:Theme.kt#migxf2"

    invoke-static {p3, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move v1, p4

    .local v1, "$dirty":I
    and-int/lit8 v2, p4, 0xe

    if-nez v2, :cond_1

    and-int/lit8 v2, p5, 0x1

    if-nez v2, :cond_0

    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v1, v2

    :cond_1
    and-int/lit8 v2, p5, 0x2

    if-eqz v2, :cond_2

    or-int/lit8 v1, v1, 0x30

    goto :goto_2

    :cond_2
    and-int/lit8 v3, p4, 0x70

    if-nez v3, :cond_4

    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_1

    :cond_3
    const/16 v3, 0x10

    :goto_1
    or-int/2addr v1, v3

    :cond_4
    :goto_2
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_5

    or-int/lit16 v1, v1, 0x180

    goto :goto_4

    :cond_5
    and-int/lit16 v3, p4, 0x380

    if-nez v3, :cond_7

    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x100

    goto :goto_3

    :cond_6
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v1, v3

    :cond_7
    :goto_4
    and-int/lit16 v3, v1, 0x2db

    const/16 v4, 0x92

    if-ne v3, v4, :cond_9

    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_5

    .line 58
    :cond_8
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_a

    .line 42
    :cond_9
    :goto_5
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v3, p4, 0x1

    if-eqz v3, :cond_c

    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_7

    .line 40
    :cond_a
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v2, p5, 0x1

    if-eqz v2, :cond_b

    and-int/lit8 v1, v1, -0xf

    :cond_b
    :goto_6
    move v8, v1

    goto :goto_8

    .line 42
    :cond_c
    :goto_7
    and-int/lit8 v3, p5, 0x1

    if-eqz v3, :cond_d

    .line 38
    const/4 v3, 0x0

    invoke-static {p3, v3}, Landroidx/compose/foundation/DarkThemeKt;->isSystemInDarkTheme(Landroidx/compose/runtime/Composer;I)Z

    move-result p0

    and-int/lit8 v1, v1, -0xf

    :cond_d
    if-eqz v2, :cond_e

    .line 40
    const/4 p1, 0x1

    goto :goto_6

    .line 38
    :cond_e
    move v8, v1

    .line 40
    .end local v1    # "$dirty":I
    .local v8, "$dirty":I
    :goto_8
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_f

    .line 42
    const/4 v1, -0x1

    const-string v2, "com.northpole.santaswipe.ui.theme.SantaSwipeTheme (Theme.kt:41)"

    invoke-static {v0, v8, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_f
    const v0, 0x67539153    # 9.991001E23f

    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const-string v0, "44@1389L7"

    invoke-static {p3, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 43
    nop

    .line 44
    if-eqz p1, :cond_11

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_11

    .line 45
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/CompositionLocal;

    .local v0, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v1, 0x0

    .local v1, "$changed$iv":I
    const/4 v2, 0x0

    .line 59
    .local v2, "$i$f$getCurrent":I
    const v3, 0x789c5f52

    const-string v4, "CC:CompositionLocal.kt#9igjgp"

    invoke-static {p3, v3, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 45
    .end local v0    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v1    # "$changed$iv":I
    .end local v2    # "$i$f$getCurrent":I
    move-object v0, v3

    check-cast v0, Landroid/content/Context;

    .line 46
    .local v0, "context":Landroid/content/Context;
    if-eqz p0, :cond_10

    invoke-static {v0}, Landroidx/compose/material3/DynamicTonalPaletteKt;->dynamicDarkColorScheme(Landroid/content/Context;)Landroidx/compose/material3/ColorScheme;

    move-result-object v1

    goto :goto_9

    :cond_10
    invoke-static {v0}, Landroidx/compose/material3/DynamicTonalPaletteKt;->dynamicLightColorScheme(Landroid/content/Context;)Landroidx/compose/material3/ColorScheme;

    move-result-object v0

    move-object v1, v0

    .end local v0    # "context":Landroid/content/Context;
    goto :goto_9

    .line 49
    :cond_11
    if-eqz p0, :cond_12

    sget-object v0, Lcom/northpole/santaswipe/ui/theme/ThemeKt;->DarkColorScheme:Landroidx/compose/material3/ColorScheme;

    move-object v1, v0

    goto :goto_9

    .line 50
    :cond_12
    sget-object v0, Lcom/northpole/santaswipe/ui/theme/ThemeKt;->LightColorScheme:Landroidx/compose/material3/ColorScheme;

    move-object v1, v0

    .line 43
    :goto_9
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 54
    .local v1, "colorScheme":Landroidx/compose/material3/ColorScheme;
    nop

    .line 55
    invoke-static {}, Lcom/northpole/santaswipe/ui/theme/TypeKt;->getTypography()Landroidx/compose/material3/Typography;

    move-result-object v3

    .line 56
    shl-int/lit8 v0, v8, 0x3

    and-int/lit16 v0, v0, 0x1c00

    or-int/lit16 v6, v0, 0x180

    .line 53
    const/4 v2, 0x0

    const/4 v7, 0x2

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v1 .. v7}, Landroidx/compose/material3/MaterialThemeKt;->MaterialTheme(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/Shapes;Landroidx/compose/material3/Typography;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 58
    .end local v1    # "colorScheme":Landroidx/compose/material3/ColorScheme;
    :cond_13
    move v1, v8

    .end local v8    # "$dirty":I
    .local v1, "$dirty":I
    :goto_a
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-nez v0, :cond_14

    goto :goto_b

    :cond_14
    new-instance v8, Lcom/northpole/santaswipe/ui/theme/ThemeKt$SantaSwipeTheme$1;

    move-object v2, v8

    move v3, p0

    move v4, p1

    move-object v5, p2

    move v6, p4

    move v7, p5

    invoke-direct/range {v2 .. v7}, Lcom/northpole/santaswipe/ui/theme/ThemeKt$SantaSwipeTheme$1;-><init>(ZZLkotlin/jvm/functions/Function2;II)V

    check-cast v8, Lkotlin/jvm/functions/Function2;

    invoke-interface {v0, v8}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :goto_b
    return-void
.end method
