.class final Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$3;
.super Lkotlin/jvm/internal/Lambda;
.source "BottomSheetScaffold.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3$1$1;->invoke(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/lang/Boolean;",
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
.field final synthetic $scope:Lkotlinx/coroutines/CoroutineScope;

.field final synthetic $this_with:Landroidx/compose/material3/SheetState;


# direct methods
.method constructor <init>(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/material3/SheetState;)V
    .locals 1

    iput-object p1, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$3;->$scope:Lkotlinx/coroutines/CoroutineScope;

    iput-object p2, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$3;->$this_with:Landroidx/compose/material3/SheetState;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Boolean;
    .locals 6

    .line 299
    iget-object v0, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$3;->$scope:Lkotlinx/coroutines/CoroutineScope;

    new-instance v1, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$3$1;

    iget-object v2, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$3;->$this_with:Landroidx/compose/material3/SheetState;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$3$1;-><init>(Landroidx/compose/material3/SheetState;Lkotlin/coroutines/Continuation;)V

    move-object v3, v1

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 300
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 298
    invoke-virtual {p0}, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$3;->invoke()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
