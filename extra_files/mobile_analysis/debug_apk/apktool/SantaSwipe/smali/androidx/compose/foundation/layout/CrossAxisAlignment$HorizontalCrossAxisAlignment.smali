.class final Landroidx/compose/foundation/layout/CrossAxisAlignment$HorizontalCrossAxisAlignment;
.super Landroidx/compose/foundation/layout/CrossAxisAlignment;
.source "RowColumnImpl.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/layout/CrossAxisAlignment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "HorizontalCrossAxisAlignment"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J-\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0008H\u0010\u00a2\u0006\u0002\u0008\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0010"
    }
    d2 = {
        "Landroidx/compose/foundation/layout/CrossAxisAlignment$HorizontalCrossAxisAlignment;",
        "Landroidx/compose/foundation/layout/CrossAxisAlignment;",
        "horizontal",
        "Landroidx/compose/ui/Alignment$Horizontal;",
        "(Landroidx/compose/ui/Alignment$Horizontal;)V",
        "getHorizontal",
        "()Landroidx/compose/ui/Alignment$Horizontal;",
        "align",
        "",
        "size",
        "layoutDirection",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "placeable",
        "Landroidx/compose/ui/layout/Placeable;",
        "beforeCrossAxisAlignmentLine",
        "align$foundation_layout_release",
        "foundation-layout_release"
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
.field private final horizontal:Landroidx/compose/ui/Alignment$Horizontal;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/Alignment$Horizontal;)V
    .locals 1
    .param p1, "horizontal"    # Landroidx/compose/ui/Alignment$Horizontal;

    const-string/jumbo v0, "horizontal"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 301
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroidx/compose/foundation/layout/CrossAxisAlignment;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 300
    iput-object p1, p0, Landroidx/compose/foundation/layout/CrossAxisAlignment$HorizontalCrossAxisAlignment;->horizontal:Landroidx/compose/ui/Alignment$Horizontal;

    .line 299
    return-void
.end method


# virtual methods
.method public align$foundation_layout_release(ILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/layout/Placeable;I)I
    .locals 2
    .param p1, "size"    # I
    .param p2, "layoutDirection"    # Landroidx/compose/ui/unit/LayoutDirection;
    .param p3, "placeable"    # Landroidx/compose/ui/layout/Placeable;
    .param p4, "beforeCrossAxisAlignmentLine"    # I

    const-string/jumbo v0, "layoutDirection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "placeable"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 308
    iget-object v0, p0, Landroidx/compose/foundation/layout/CrossAxisAlignment$HorizontalCrossAxisAlignment;->horizontal:Landroidx/compose/ui/Alignment$Horizontal;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1, p2}, Landroidx/compose/ui/Alignment$Horizontal;->align(IILandroidx/compose/ui/unit/LayoutDirection;)I

    move-result v0

    return v0
.end method

.method public final getHorizontal()Landroidx/compose/ui/Alignment$Horizontal;
    .locals 1

    .line 300
    iget-object v0, p0, Landroidx/compose/foundation/layout/CrossAxisAlignment$HorizontalCrossAxisAlignment;->horizontal:Landroidx/compose/ui/Alignment$Horizontal;

    return-object v0
.end method
