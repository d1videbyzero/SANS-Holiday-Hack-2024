.class final Landroidx/compose/material3/SnackbarKt$Snackbar$dismissActionComposable$1$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "Snackbar.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/SnackbarKt$Snackbar$dismissActionComposable$1;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $snackbarData:Landroidx/compose/material3/SnackbarData;


# direct methods
.method constructor <init>(Landroidx/compose/material3/SnackbarData;)V
    .locals 1

    iput-object p1, p0, Landroidx/compose/material3/SnackbarKt$Snackbar$dismissActionComposable$1$1$1;->$snackbarData:Landroidx/compose/material3/SnackbarData;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 225
    invoke-virtual {p0}, Landroidx/compose/material3/SnackbarKt$Snackbar$dismissActionComposable$1$1$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 1

    .line 225
    iget-object v0, p0, Landroidx/compose/material3/SnackbarKt$Snackbar$dismissActionComposable$1$1$1;->$snackbarData:Landroidx/compose/material3/SnackbarData;

    invoke-interface {v0}, Landroidx/compose/material3/SnackbarData;->dismiss()V

    return-void
.end method
