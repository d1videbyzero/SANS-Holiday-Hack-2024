.class public final Landroidx/activity/compose/ReportDrawnKt$ReportDrawnWhen$1$1$invoke$$inlined$onDispose$2;
.super Ljava/lang/Object;
.source "Effects.kt"

# interfaces
.implements Landroidx/compose/runtime/DisposableEffectResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/activity/compose/ReportDrawnKt$ReportDrawnWhen$1$1;->invoke(Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnWhen$1$1\n*L\n1#1,483:1\n139#2,2:484\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004\u00b8\u0006\u0000"
    }
    d2 = {
        "androidx/compose/runtime/DisposableEffectScope$onDispose$1",
        "Landroidx/compose/runtime/DisposableEffectResult;",
        "dispose",
        "",
        "runtime_release"
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
.field final synthetic $compositionDrawn$inlined:Landroidx/activity/compose/ReportDrawnComposition;


# direct methods
.method public constructor <init>(Landroidx/activity/compose/ReportDrawnComposition;)V
    .locals 0

    iput-object p1, p0, Landroidx/activity/compose/ReportDrawnKt$ReportDrawnWhen$1$1$invoke$$inlined$onDispose$2;->$compositionDrawn$inlined:Landroidx/activity/compose/ReportDrawnComposition;

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    .line 64
    const/4 v0, 0x0

    .line 484
    .local v0, "$i$a$-onDispose-ReportDrawnKt$ReportDrawnWhen$1$1$2":I
    iget-object v1, p0, Landroidx/activity/compose/ReportDrawnKt$ReportDrawnWhen$1$1$invoke$$inlined$onDispose$2;->$compositionDrawn$inlined:Landroidx/activity/compose/ReportDrawnComposition;

    invoke-virtual {v1}, Landroidx/activity/compose/ReportDrawnComposition;->removeReporter()V

    .line 485
    nop

    .line 64
    .end local v0    # "$i$a$-onDispose-ReportDrawnKt$ReportDrawnWhen$1$1$2":I
    nop

    .line 65
    return-void
.end method
