.class public final Landroidx/compose/ui/layout/MeasureScope$layout$1;
.super Ljava/lang/Object;
.source "MeasureScope.kt"

# interfaces
.implements Landroidx/compose/ui/layout/MeasureResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/layout/MeasureScope;->layout(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureScope.kt\nandroidx/compose/ui/layout/MeasureScope$layout$1\n+ 2 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope$Companion\n*L\n1#1,61:1\n365#2,15:62\n*S KotlinDebug\n*F\n+ 1 MeasureScope.kt\nandroidx/compose/ui/layout/MeasureScope$layout$1\n*L\n52#1:62,15\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\r\u001a\u00020\u000eH\u0016R \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0008\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\n\u00a8\u0006\u000f"
    }
    d2 = {
        "androidx/compose/ui/layout/MeasureScope$layout$1",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "alignmentLines",
        "",
        "Landroidx/compose/ui/layout/AlignmentLine;",
        "",
        "getAlignmentLines",
        "()Ljava/util/Map;",
        "height",
        "getHeight",
        "()I",
        "width",
        "getWidth",
        "placeChildren",
        "",
        "ui_release"
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
.field final synthetic $placementBlock:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $width:I

.field private final alignmentLines:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroidx/compose/ui/layout/AlignmentLine;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final height:I

.field final synthetic this$0:Landroidx/compose/ui/layout/MeasureScope;

.field private final width:I


# direct methods
.method constructor <init>(IILjava/util/Map;Landroidx/compose/ui/layout/MeasureScope;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .param p1, "$width"    # I
    .param p2, "$height"    # I
    .param p3, "$alignmentLines"    # Ljava/util/Map;
    .param p4, "$receiver"    # Landroidx/compose/ui/layout/MeasureScope;
    .param p5, "$placementBlock"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/Map<",
            "Landroidx/compose/ui/layout/AlignmentLine;",
            "Ljava/lang/Integer;",
            ">;",
            "Landroidx/compose/ui/layout/MeasureScope;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput p1, p0, Landroidx/compose/ui/layout/MeasureScope$layout$1;->$width:I

    iput-object p4, p0, Landroidx/compose/ui/layout/MeasureScope$layout$1;->this$0:Landroidx/compose/ui/layout/MeasureScope;

    iput-object p5, p0, Landroidx/compose/ui/layout/MeasureScope$layout$1;->$placementBlock:Lkotlin/jvm/functions/Function1;

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput p1, p0, Landroidx/compose/ui/layout/MeasureScope$layout$1;->width:I

    .line 49
    iput p2, p0, Landroidx/compose/ui/layout/MeasureScope$layout$1;->height:I

    .line 50
    iput-object p3, p0, Landroidx/compose/ui/layout/MeasureScope$layout$1;->alignmentLines:Ljava/util/Map;

    .line 47
    return-void
.end method


# virtual methods
.method public getAlignmentLines()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Landroidx/compose/ui/layout/AlignmentLine;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 50
    iget-object v0, p0, Landroidx/compose/ui/layout/MeasureScope$layout$1;->alignmentLines:Ljava/util/Map;

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    .line 49
    iget v0, p0, Landroidx/compose/ui/layout/MeasureScope$layout$1;->height:I

    return v0
.end method

.method public getWidth()I
    .locals 1

    .line 48
    iget v0, p0, Landroidx/compose/ui/layout/MeasureScope$layout$1;->width:I

    return v0
.end method

.method public placeChildren()V
    .locals 12

    .line 52
    sget-object v0, Landroidx/compose/ui/layout/Placeable$PlacementScope;->Companion:Landroidx/compose/ui/layout/Placeable$PlacementScope$Companion;

    .line 53
    iget v1, p0, Landroidx/compose/ui/layout/MeasureScope$layout$1;->$width:I

    .line 54
    iget-object v2, p0, Landroidx/compose/ui/layout/MeasureScope$layout$1;->this$0:Landroidx/compose/ui/layout/MeasureScope;

    invoke-interface {v2}, Landroidx/compose/ui/layout/MeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v2

    .line 55
    iget-object v3, p0, Landroidx/compose/ui/layout/MeasureScope$layout$1;->this$0:Landroidx/compose/ui/layout/MeasureScope;

    instance-of v4, v3, Landroidx/compose/ui/node/LookaheadCapablePlaceable;

    if-eqz v4, :cond_0

    check-cast v3, Landroidx/compose/ui/node/LookaheadCapablePlaceable;

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 56
    :goto_0
    iget-object v4, p0, Landroidx/compose/ui/layout/MeasureScope$layout$1;->$placementBlock:Lkotlin/jvm/functions/Function1;

    .line 52
    nop

    .local v0, "this_$iv":Landroidx/compose/ui/layout/Placeable$PlacementScope$Companion;
    .local v1, "parentWidth$iv":I
    .local v2, "parentLayoutDirection$iv":Landroidx/compose/ui/unit/LayoutDirection;
    .local v3, "lookaheadCapablePlaceable$iv":Landroidx/compose/ui/node/LookaheadCapablePlaceable;
    .local v4, "block$iv":Lkotlin/jvm/functions/Function1;
    const/4 v5, 0x0

    .line 62
    .local v5, "$i$f$executeWithRtlMirroringValues":I
    invoke-static {}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->access$get_coordinates$cp()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v6

    .line 63
    .local v6, "previousLayoutCoordinates$iv":Landroidx/compose/ui/layout/LayoutCoordinates;
    sget-object v7, Landroidx/compose/ui/layout/Placeable$PlacementScope;->Companion:Landroidx/compose/ui/layout/Placeable$PlacementScope$Companion;

    invoke-static {v7}, Landroidx/compose/ui/layout/Placeable$PlacementScope$Companion;->access$getParentWidth(Landroidx/compose/ui/layout/Placeable$PlacementScope$Companion;)I

    move-result v7

    .line 64
    .local v7, "previousParentWidth$iv":I
    sget-object v8, Landroidx/compose/ui/layout/Placeable$PlacementScope;->Companion:Landroidx/compose/ui/layout/Placeable$PlacementScope$Companion;

    invoke-static {v8}, Landroidx/compose/ui/layout/Placeable$PlacementScope$Companion;->access$getParentLayoutDirection(Landroidx/compose/ui/layout/Placeable$PlacementScope$Companion;)Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v8

    .line 65
    .local v8, "previousParentLayoutDirection$iv":Landroidx/compose/ui/unit/LayoutDirection;
    invoke-static {}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->access$getLayoutDelegate$cp()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;

    move-result-object v9

    .line 66
    .local v9, "previousLayoutDelegate$iv":Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;
    sget-object v10, Landroidx/compose/ui/layout/Placeable$PlacementScope;->Companion:Landroidx/compose/ui/layout/Placeable$PlacementScope$Companion;

    invoke-static {v1}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->access$setParentWidth$cp(I)V

    .line 67
    sget-object v10, Landroidx/compose/ui/layout/Placeable$PlacementScope;->Companion:Landroidx/compose/ui/layout/Placeable$PlacementScope$Companion;

    invoke-static {v2}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->access$setParentLayoutDirection$cp(Landroidx/compose/ui/unit/LayoutDirection;)V

    .line 69
    invoke-static {v0, v3}, Landroidx/compose/ui/layout/Placeable$PlacementScope$Companion;->access$configureForPlacingForAlignment(Landroidx/compose/ui/layout/Placeable$PlacementScope$Companion;Landroidx/compose/ui/node/LookaheadCapablePlaceable;)Z

    move-result v10

    .line 68
    nop

    .line 70
    .local v10, "wasPlacingForAlignment$iv":Z
    invoke-interface {v4, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3, v10}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->setPlacingForAlignment$ui_release(Z)V

    .line 72
    :goto_1
    sget-object v11, Landroidx/compose/ui/layout/Placeable$PlacementScope;->Companion:Landroidx/compose/ui/layout/Placeable$PlacementScope$Companion;

    invoke-static {v7}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->access$setParentWidth$cp(I)V

    .line 73
    sget-object v11, Landroidx/compose/ui/layout/Placeable$PlacementScope;->Companion:Landroidx/compose/ui/layout/Placeable$PlacementScope$Companion;

    invoke-static {v8}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->access$setParentLayoutDirection$cp(Landroidx/compose/ui/unit/LayoutDirection;)V

    .line 74
    invoke-static {v6}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->access$set_coordinates$cp(Landroidx/compose/ui/layout/LayoutCoordinates;)V

    .line 75
    invoke-static {v9}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->access$setLayoutDelegate$cp(Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;)V

    .line 76
    nop

    .line 58
    .end local v0    # "this_$iv":Landroidx/compose/ui/layout/Placeable$PlacementScope$Companion;
    .end local v1    # "parentWidth$iv":I
    .end local v2    # "parentLayoutDirection$iv":Landroidx/compose/ui/unit/LayoutDirection;
    .end local v3    # "lookaheadCapablePlaceable$iv":Landroidx/compose/ui/node/LookaheadCapablePlaceable;
    .end local v4    # "block$iv":Lkotlin/jvm/functions/Function1;
    .end local v5    # "$i$f$executeWithRtlMirroringValues":I
    .end local v6    # "previousLayoutCoordinates$iv":Landroidx/compose/ui/layout/LayoutCoordinates;
    .end local v7    # "previousParentWidth$iv":I
    .end local v8    # "previousParentLayoutDirection$iv":Landroidx/compose/ui/unit/LayoutDirection;
    .end local v9    # "previousLayoutDelegate$iv":Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;
    .end local v10    # "wasPlacingForAlignment$iv":Z
    return-void
.end method
