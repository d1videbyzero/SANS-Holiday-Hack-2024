.class final Landroidx/compose/foundation/pager/PagerState$settledPage$2;
.super Lkotlin/jvm/internal/Lambda;
.source "PagerState.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/pager/PagerState;-><init>(IF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke",
        "()Ljava/lang/Integer;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/compose/foundation/pager/PagerState;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/pager/PagerState;)V
    .locals 1

    iput-object p1, p0, Landroidx/compose/foundation/pager/PagerState$settledPage$2;->this$0:Landroidx/compose/foundation/pager/PagerState;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Integer;
    .locals 1

    .line 307
    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState$settledPage$2;->this$0:Landroidx/compose/foundation/pager/PagerState;

    invoke-virtual {v0}, Landroidx/compose/foundation/pager/PagerState;->isScrollInProgress()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 308
    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState$settledPage$2;->this$0:Landroidx/compose/foundation/pager/PagerState;

    invoke-static {v0}, Landroidx/compose/foundation/pager/PagerState;->access$getSettledPageState(Landroidx/compose/foundation/pager/PagerState;)I

    move-result v0

    goto :goto_0

    .line 310
    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState$settledPage$2;->this$0:Landroidx/compose/foundation/pager/PagerState;

    invoke-virtual {v0}, Landroidx/compose/foundation/pager/PagerState;->getCurrentPage()I

    move-result v0

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 307
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 306
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerState$settledPage$2;->invoke()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
