.class public final Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;
.super Ljava/lang/Object;
.source "FlowLayout.kt"

# interfaces
.implements Landroidx/compose/ui/layout/MeasurePolicy;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/layout/FlowLayoutKt;->flowMeasurePolicy-bs7tm-s(Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function5;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;Lkotlin/jvm/functions/Function5;FI)Landroidx/compose/ui/layout/MeasurePolicy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,755:1\n523#2:756\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1\n*L\n245#1:756\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010 \n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J,\u0010\u000f\u001a\u00020\u00052\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005J$\u0010\u0015\u001a\u00020\u00052\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005J,\u0010\u0018\u001a\u00020\u00052\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005J\"\u0010\u001a\u001a\u00020\u0005*\u00020\u001b2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u001c\u001a\u00020\u0005H\u0016J\"\u0010\u001d\u001a\u00020\u0005*\u00020\u001b2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u0016\u001a\u00020\u0005H\u0016J/\u0010\u001e\u001a\u00020\u001f*\u00020 2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020!0\u00112\u0006\u0010\"\u001a\u00020#H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008$\u0010%J\"\u0010&\u001a\u00020\u0005*\u00020\u001b2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u001c\u001a\u00020\u0005H\u0016J\"\u0010\'\u001a\u00020\u0005*\u00020\u001b2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u0016\u001a\u00020\u0005H\u0016R.\u0010\u0002\u001a\u001f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0008\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R.\u0010\t\u001a\u001f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0008\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0008R.\u0010\u000b\u001a\u001f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0008\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u0008R.\u0010\r\u001a\u001f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0008\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u0008\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006("
    }
    d2 = {
        "androidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1",
        "Landroidx/compose/ui/layout/MeasurePolicy;",
        "maxCrossAxisIntrinsicItemSize",
        "Lkotlin/Function3;",
        "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "getMaxCrossAxisIntrinsicItemSize",
        "()Lkotlin/jvm/functions/Function3;",
        "maxMainAxisIntrinsicItemSize",
        "getMaxMainAxisIntrinsicItemSize",
        "minCrossAxisIntrinsicItemSize",
        "getMinCrossAxisIntrinsicItemSize",
        "minMainAxisIntrinsicItemSize",
        "getMinMainAxisIntrinsicItemSize",
        "intrinsicCrossAxisSize",
        "measurables",
        "",
        "mainAxisAvailable",
        "mainAxisSpacing",
        "crossAxisSpacing",
        "maxIntrinsicMainAxisSize",
        "height",
        "arrangementSpacing",
        "minIntrinsicMainAxisSize",
        "crossAxisAvailable",
        "maxIntrinsicHeight",
        "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
        "width",
        "maxIntrinsicWidth",
        "measure",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "Landroidx/compose/ui/layout/MeasureScope;",
        "Landroidx/compose/ui/layout/Measurable;",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "measure-3p2s80s",
        "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;",
        "minIntrinsicHeight",
        "minIntrinsicWidth",
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
.field final synthetic $crossAxisAlignment:Landroidx/compose/foundation/layout/CrossAxisAlignment;

.field final synthetic $crossAxisArrangement:Lkotlin/jvm/functions/Function5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function5<",
            "Ljava/lang/Integer;",
            "[I",
            "Landroidx/compose/ui/unit/LayoutDirection;",
            "Landroidx/compose/ui/unit/Density;",
            "[I",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $crossAxisArrangementSpacing:F

.field final synthetic $crossAxisSize:Landroidx/compose/foundation/layout/SizeMode;

.field final synthetic $mainAxisArrangement:Lkotlin/jvm/functions/Function5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function5<",
            "Ljava/lang/Integer;",
            "[I",
            "Landroidx/compose/ui/unit/LayoutDirection;",
            "Landroidx/compose/ui/unit/Density;",
            "[I",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $mainAxisArrangementSpacing:F

.field final synthetic $maxItemsInMainAxis:I

.field final synthetic $orientation:Landroidx/compose/foundation/layout/LayoutOrientation;

.field private final maxCrossAxisIntrinsicItemSize:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final maxMainAxisIntrinsicItemSize:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final minCrossAxisIntrinsicItemSize:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final minMainAxisIntrinsicItemSize:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function5;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;IFLkotlin/jvm/functions/Function5;)V
    .locals 1
    .param p1, "$orientation"    # Landroidx/compose/foundation/layout/LayoutOrientation;
    .param p2, "$mainAxisArrangement"    # Lkotlin/jvm/functions/Function5;
    .param p3, "$mainAxisArrangementSpacing"    # F
    .param p4, "$crossAxisSize"    # Landroidx/compose/foundation/layout/SizeMode;
    .param p5, "$crossAxisAlignment"    # Landroidx/compose/foundation/layout/CrossAxisAlignment;
    .param p6, "$maxItemsInMainAxis"    # I
    .param p7, "$crossAxisArrangementSpacing"    # F
    .param p8, "$crossAxisArrangement"    # Lkotlin/jvm/functions/Function5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/layout/LayoutOrientation;",
            "Lkotlin/jvm/functions/Function5<",
            "-",
            "Ljava/lang/Integer;",
            "-[I-",
            "Landroidx/compose/ui/unit/LayoutDirection;",
            "-",
            "Landroidx/compose/ui/unit/Density;",
            "-[I",
            "Lkotlin/Unit;",
            ">;F",
            "Landroidx/compose/foundation/layout/SizeMode;",
            "Landroidx/compose/foundation/layout/CrossAxisAlignment;",
            "IF",
            "Lkotlin/jvm/functions/Function5<",
            "-",
            "Ljava/lang/Integer;",
            "-[I-",
            "Landroidx/compose/ui/unit/LayoutDirection;",
            "-",
            "Landroidx/compose/ui/unit/Density;",
            "-[I",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$orientation:Landroidx/compose/foundation/layout/LayoutOrientation;

    iput-object p2, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$mainAxisArrangement:Lkotlin/jvm/functions/Function5;

    iput p3, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$mainAxisArrangementSpacing:F

    iput-object p4, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$crossAxisSize:Landroidx/compose/foundation/layout/SizeMode;

    iput-object p5, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$crossAxisAlignment:Landroidx/compose/foundation/layout/CrossAxisAlignment;

    iput p6, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$maxItemsInMainAxis:I

    iput p7, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$crossAxisArrangementSpacing:F

    iput-object p8, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$crossAxisArrangement:Lkotlin/jvm/functions/Function5;

    .line 218
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 403
    sget-object v0, Landroidx/compose/foundation/layout/LayoutOrientation;->Horizontal:Landroidx/compose/foundation/layout/LayoutOrientation;

    if-ne p1, v0, :cond_0

    sget-object v0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1$maxMainAxisIntrinsicItemSize$1;->INSTANCE:Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1$maxMainAxisIntrinsicItemSize$1;

    check-cast v0, Lkotlin/jvm/functions/Function3;

    goto :goto_0

    .line 406
    :cond_0
    sget-object v0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1$maxMainAxisIntrinsicItemSize$2;->INSTANCE:Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1$maxMainAxisIntrinsicItemSize$2;

    check-cast v0, Lkotlin/jvm/functions/Function3;

    .line 403
    :goto_0
    iput-object v0, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->maxMainAxisIntrinsicItemSize:Lkotlin/jvm/functions/Function3;

    .line 411
    sget-object v0, Landroidx/compose/foundation/layout/LayoutOrientation;->Horizontal:Landroidx/compose/foundation/layout/LayoutOrientation;

    if-ne p1, v0, :cond_1

    sget-object v0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1$maxCrossAxisIntrinsicItemSize$1;->INSTANCE:Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1$maxCrossAxisIntrinsicItemSize$1;

    check-cast v0, Lkotlin/jvm/functions/Function3;

    goto :goto_1

    .line 414
    :cond_1
    sget-object v0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1$maxCrossAxisIntrinsicItemSize$2;->INSTANCE:Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1$maxCrossAxisIntrinsicItemSize$2;

    check-cast v0, Lkotlin/jvm/functions/Function3;

    .line 411
    :goto_1
    iput-object v0, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->maxCrossAxisIntrinsicItemSize:Lkotlin/jvm/functions/Function3;

    .line 419
    sget-object v0, Landroidx/compose/foundation/layout/LayoutOrientation;->Horizontal:Landroidx/compose/foundation/layout/LayoutOrientation;

    if-ne p1, v0, :cond_2

    sget-object v0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1$minCrossAxisIntrinsicItemSize$1;->INSTANCE:Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1$minCrossAxisIntrinsicItemSize$1;

    check-cast v0, Lkotlin/jvm/functions/Function3;

    goto :goto_2

    .line 422
    :cond_2
    sget-object v0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1$minCrossAxisIntrinsicItemSize$2;->INSTANCE:Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1$minCrossAxisIntrinsicItemSize$2;

    check-cast v0, Lkotlin/jvm/functions/Function3;

    .line 419
    :goto_2
    iput-object v0, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->minCrossAxisIntrinsicItemSize:Lkotlin/jvm/functions/Function3;

    .line 427
    sget-object v0, Landroidx/compose/foundation/layout/LayoutOrientation;->Horizontal:Landroidx/compose/foundation/layout/LayoutOrientation;

    if-ne p1, v0, :cond_3

    sget-object v0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1$minMainAxisIntrinsicItemSize$1;->INSTANCE:Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1$minMainAxisIntrinsicItemSize$1;

    check-cast v0, Lkotlin/jvm/functions/Function3;

    goto :goto_3

    .line 430
    :cond_3
    sget-object v0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1$minMainAxisIntrinsicItemSize$2;->INSTANCE:Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1$minMainAxisIntrinsicItemSize$2;

    check-cast v0, Lkotlin/jvm/functions/Function3;

    .line 427
    :goto_3
    iput-object v0, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->minMainAxisIntrinsicItemSize:Lkotlin/jvm/functions/Function3;

    .line 218
    return-void
.end method


# virtual methods
.method public final getMaxCrossAxisIntrinsicItemSize()Lkotlin/jvm/functions/Function3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function3<",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 410
    iget-object v0, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->maxCrossAxisIntrinsicItemSize:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method

.method public final getMaxMainAxisIntrinsicItemSize()Lkotlin/jvm/functions/Function3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function3<",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 402
    iget-object v0, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->maxMainAxisIntrinsicItemSize:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method

.method public final getMinCrossAxisIntrinsicItemSize()Lkotlin/jvm/functions/Function3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function3<",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 418
    iget-object v0, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->minCrossAxisIntrinsicItemSize:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method

.method public final getMinMainAxisIntrinsicItemSize()Lkotlin/jvm/functions/Function3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function3<",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 426
    iget-object v0, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->minMainAxisIntrinsicItemSize:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method

.method public final intrinsicCrossAxisSize(Ljava/util/List;III)I
    .locals 8
    .param p1, "measurables"    # Ljava/util/List;
    .param p2, "mainAxisAvailable"    # I
    .param p3, "mainAxisSpacing"    # I
    .param p4, "crossAxisSpacing"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;III)I"
        }
    .end annotation

    const-string/jumbo v0, "measurables"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 393
    nop

    .line 394
    iget-object v2, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->minMainAxisIntrinsicItemSize:Lkotlin/jvm/functions/Function3;

    .line 395
    iget-object v3, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->minCrossAxisIntrinsicItemSize:Lkotlin/jvm/functions/Function3;

    .line 396
    nop

    .line 397
    nop

    .line 398
    nop

    .line 399
    iget v7, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$maxItemsInMainAxis:I

    .line 392
    move-object v1, p1

    move v4, p2

    move v5, p3

    move v6, p4

    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/layout/FlowLayoutKt;->access$intrinsicCrossAxisSize(Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;IIII)I

    move-result v0

    .line 400
    return v0
.end method

.method public maxIntrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 2
    .param p1, "$this$maxIntrinsicHeight"    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "width"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;I)I"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "measurables"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 327
    iget-object v0, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$orientation:Landroidx/compose/foundation/layout/LayoutOrientation;

    sget-object v1, Landroidx/compose/foundation/layout/LayoutOrientation;->Horizontal:Landroidx/compose/foundation/layout/LayoutOrientation;

    if-ne v0, v1, :cond_0

    .line 328
    nop

    .line 329
    nop

    .line 330
    nop

    .line 331
    iget v0, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$mainAxisArrangementSpacing:F

    invoke-interface {p1, v0}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->roundToPx-0680j_4(F)I

    move-result v0

    .line 332
    iget v1, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$crossAxisArrangementSpacing:F

    invoke-interface {p1, v1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->roundToPx-0680j_4(F)I

    move-result v1

    .line 328
    invoke-virtual {p0, p2, p3, v0, v1}, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->intrinsicCrossAxisSize(Ljava/util/List;III)I

    move-result v0

    goto :goto_0

    .line 335
    :cond_0
    nop

    .line 336
    nop

    .line 337
    nop

    .line 338
    iget v0, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$mainAxisArrangementSpacing:F

    invoke-interface {p1, v0}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->roundToPx-0680j_4(F)I

    move-result v0

    .line 335
    invoke-virtual {p0, p2, p3, v0}, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->maxIntrinsicMainAxisSize(Ljava/util/List;II)I

    move-result v0

    .line 340
    :goto_0
    return v0
.end method

.method public final maxIntrinsicMainAxisSize(Ljava/util/List;II)I
    .locals 2
    .param p1, "measurables"    # Ljava/util/List;
    .param p2, "height"    # I
    .param p3, "arrangementSpacing"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;II)I"
        }
    .end annotation

    const-string/jumbo v0, "measurables"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 380
    nop

    .line 381
    iget-object v0, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->maxMainAxisIntrinsicItemSize:Lkotlin/jvm/functions/Function3;

    .line 382
    nop

    .line 383
    nop

    .line 384
    iget v1, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$maxItemsInMainAxis:I

    .line 379
    invoke-static {p1, v0, p2, p3, v1}, Landroidx/compose/foundation/layout/FlowLayoutKt;->access$maxIntrinsicMainAxisSize(Ljava/util/List;Lkotlin/jvm/functions/Function3;III)I

    move-result v0

    .line 385
    return v0
.end method

.method public maxIntrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 2
    .param p1, "$this$maxIntrinsicWidth"    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "height"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;I)I"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "measurables"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 345
    iget-object v0, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$orientation:Landroidx/compose/foundation/layout/LayoutOrientation;

    sget-object v1, Landroidx/compose/foundation/layout/LayoutOrientation;->Horizontal:Landroidx/compose/foundation/layout/LayoutOrientation;

    if-ne v0, v1, :cond_0

    .line 346
    nop

    .line 347
    nop

    .line 348
    nop

    .line 349
    iget v0, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$mainAxisArrangementSpacing:F

    invoke-interface {p1, v0}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->roundToPx-0680j_4(F)I

    move-result v0

    .line 346
    invoke-virtual {p0, p2, p3, v0}, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->maxIntrinsicMainAxisSize(Ljava/util/List;II)I

    move-result v0

    goto :goto_0

    .line 352
    :cond_0
    nop

    .line 353
    nop

    .line 354
    nop

    .line 355
    iget v0, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$mainAxisArrangementSpacing:F

    invoke-interface {p1, v0}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->roundToPx-0680j_4(F)I

    move-result v0

    .line 356
    iget v1, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$crossAxisArrangementSpacing:F

    invoke-interface {p1, v1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->roundToPx-0680j_4(F)I

    move-result v1

    .line 352
    invoke-virtual {p0, p2, p3, v0, v1}, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->intrinsicCrossAxisSize(Ljava/util/List;III)I

    move-result v0

    .line 358
    :goto_0
    return v0
.end method

.method public measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 24
    .param p1, "$this$measure_u2d3p2s80s"    # Landroidx/compose/ui/layout/MeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "constraints"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/MeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;J)",
            "Landroidx/compose/ui/layout/MeasureResult;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v13, p1

    move-wide/from16 v14, p3

    const-string v1, "$this$measure"

    invoke-static {v13, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "measurables"

    move-object/from16 v12, p2

    invoke-static {v12, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 224
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1$measure$1;->INSTANCE:Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1$measure$1;

    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v1

    return-object v1

    .line 225
    :cond_0
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v1

    new-array v11, v1, [Landroidx/compose/ui/layout/Placeable;

    .line 226
    .local v11, "placeables":[Landroidx/compose/ui/layout/Placeable;
    new-instance v1, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;

    .line 227
    iget-object v3, v0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$orientation:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 228
    iget-object v4, v0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$mainAxisArrangement:Lkotlin/jvm/functions/Function5;

    .line 229
    iget v5, v0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$mainAxisArrangementSpacing:F

    .line 230
    iget-object v6, v0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$crossAxisSize:Landroidx/compose/foundation/layout/SizeMode;

    .line 231
    iget-object v7, v0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$crossAxisAlignment:Landroidx/compose/foundation/layout/CrossAxisAlignment;

    .line 232
    nop

    .line 233
    nop

    .line 226
    const/4 v10, 0x0

    move-object v2, v1

    move-object/from16 v8, p2

    move-object v9, v11

    invoke-direct/range {v2 .. v10}, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;-><init>(Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function5;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;Ljava/util/List;[Landroidx/compose/ui/layout/Placeable;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v10, v1

    .line 236
    .local v10, "measureHelper":Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;
    iget-object v1, v0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$orientation:Landroidx/compose/foundation/layout/LayoutOrientation;

    invoke-static {v14, v15, v1}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->constructor-impl(JLandroidx/compose/foundation/layout/LayoutOrientation;)J

    move-result-wide v4

    .line 235
    nop

    .line 237
    .local v4, "orientationIndependentConstraints":J
    nop

    .line 238
    nop

    .line 239
    iget-object v3, v0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$orientation:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 240
    nop

    .line 241
    iget v6, v0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$maxItemsInMainAxis:I

    .line 237
    move-object/from16 v1, p1

    move-object v2, v10

    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/layout/FlowLayoutKt;->breakDownItems-w1Onq5I(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;Landroidx/compose/foundation/layout/LayoutOrientation;JI)Landroidx/compose/foundation/layout/FlowResult;

    move-result-object v1

    .line 243
    .local v1, "flowResult":Landroidx/compose/foundation/layout/FlowResult;
    invoke-virtual {v1}, Landroidx/compose/foundation/layout/FlowResult;->getItems()Landroidx/compose/runtime/collection/MutableVector;

    move-result-object v2

    .line 244
    .local v2, "items":Landroidx/compose/runtime/collection/MutableVector;
    invoke-virtual {v2}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v3

    new-array v6, v3, [I

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v3, :cond_1

    .line 245
    move-object v8, v2

    .local v8, "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v9, 0x0

    .line 756
    .local v9, "$i$f$get":I
    invoke-virtual {v8}, Landroidx/compose/runtime/collection/MutableVector;->getContent()[Ljava/lang/Object;

    move-result-object v16

    aget-object v8, v16, v7

    .end local v8    # "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v9    # "$i$f$get":I
    check-cast v8, Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;

    .line 245
    invoke-virtual {v8}, Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;->getCrossAxisSize()I

    move-result v8

    aput v8, v6, v7

    add-int/lit8 v7, v7, 0x1

    .line 244
    goto :goto_0

    :cond_1
    move-object v3, v6

    .line 248
    .local v3, "crossAxisSizes":[I
    array-length v6, v3

    new-array v9, v6, [I

    .line 249
    .local v9, "outPosition":[I
    invoke-virtual {v1}, Landroidx/compose/foundation/layout/FlowResult;->getCrossAxisTotalSize()I

    move-result v6

    .line 251
    .local v6, "totalCrossAxisSize":I
    iget v7, v0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$crossAxisArrangementSpacing:F

    invoke-interface {v13, v7}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v7

    invoke-virtual {v2}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    mul-int/2addr v7, v8

    .line 250
    move/from16 v16, v7

    .line 252
    .local v16, "totalCrossAxisSpacing":I
    add-int v17, v6, v16

    .line 253
    .end local v6    # "totalCrossAxisSize":I
    .local v17, "totalCrossAxisSize":I
    iget-object v6, v0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$crossAxisArrangement:Lkotlin/jvm/functions/Function5;

    .line 254
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    .line 255
    nop

    .line 256
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/MeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v18

    .line 257
    nop

    .line 258
    nop

    .line 253
    move-object v8, v3

    move-object/from16 v19, v9

    .end local v9    # "outPosition":[I
    .local v19, "outPosition":[I
    move-object/from16 v9, v18

    move-object v12, v10

    .end local v10    # "measureHelper":Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;
    .local v12, "measureHelper":Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;
    move-object/from16 v10, p1

    move-object/from16 v18, v11

    .end local v11    # "placeables":[Landroidx/compose/ui/layout/Placeable;
    .local v18, "placeables":[Landroidx/compose/ui/layout/Placeable;
    move-object/from16 v11, v19

    invoke-interface/range {v6 .. v11}, Lkotlin/jvm/functions/Function5;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v6, 0x0

    .local v6, "layoutWidth":I
    const/4 v7, 0x0

    .line 263
    .local v7, "layoutHeight":I
    iget-object v8, v0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$orientation:Landroidx/compose/foundation/layout/LayoutOrientation;

    sget-object v9, Landroidx/compose/foundation/layout/LayoutOrientation;->Horizontal:Landroidx/compose/foundation/layout/LayoutOrientation;

    if-ne v8, v9, :cond_2

    .line 264
    invoke-virtual {v1}, Landroidx/compose/foundation/layout/FlowResult;->getMainAxisTotalSize()I

    move-result v6

    .line 265
    move/from16 v7, v17

    goto :goto_1

    .line 267
    :cond_2
    move/from16 v6, v17

    .line 268
    invoke-virtual {v1}, Landroidx/compose/foundation/layout/FlowResult;->getMainAxisTotalSize()I

    move-result v7

    .line 270
    :goto_1
    invoke-static {v14, v15, v6}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    move-result v20

    .line 271
    .end local v6    # "layoutWidth":I
    .local v20, "layoutWidth":I
    invoke-static {v14, v15, v7}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    move-result v21

    .line 273
    .end local v7    # "layoutHeight":I
    .local v21, "layoutHeight":I
    new-instance v6, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1$measure$2;

    move-object/from16 v11, v19

    .end local v19    # "outPosition":[I
    .local v11, "outPosition":[I
    invoke-direct {v6, v1, v12, v11, v13}, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1$measure$2;-><init>(Landroidx/compose/foundation/layout/FlowResult;Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;[ILandroidx/compose/ui/layout/MeasureScope;)V

    move-object v10, v6

    check-cast v10, Lkotlin/jvm/functions/Function1;

    const/16 v19, 0x4

    const/16 v22, 0x0

    const/4 v9, 0x0

    move-object/from16 v6, p1

    move/from16 v7, v20

    move/from16 v8, v21

    move-object/from16 v23, v11

    .end local v11    # "outPosition":[I
    .local v23, "outPosition":[I
    move/from16 v11, v19

    move-object/from16 v19, v12

    .end local v12    # "measureHelper":Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;
    .local v19, "measureHelper":Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;
    move-object/from16 v12, v22

    invoke-static/range {v6 .. v12}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v6

    return-object v6
.end method

.method public minIntrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 2
    .param p1, "$this$minIntrinsicHeight"    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "width"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;I)I"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "measurables"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 308
    iget-object v0, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$orientation:Landroidx/compose/foundation/layout/LayoutOrientation;

    sget-object v1, Landroidx/compose/foundation/layout/LayoutOrientation;->Horizontal:Landroidx/compose/foundation/layout/LayoutOrientation;

    if-ne v0, v1, :cond_0

    .line 309
    nop

    .line 310
    nop

    .line 311
    nop

    .line 312
    iget v0, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$mainAxisArrangementSpacing:F

    invoke-interface {p1, v0}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->roundToPx-0680j_4(F)I

    move-result v0

    .line 313
    iget v1, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$crossAxisArrangementSpacing:F

    invoke-interface {p1, v1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->roundToPx-0680j_4(F)I

    move-result v1

    .line 309
    invoke-virtual {p0, p2, p3, v0, v1}, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->intrinsicCrossAxisSize(Ljava/util/List;III)I

    move-result v0

    goto :goto_0

    .line 316
    :cond_0
    nop

    .line 317
    nop

    .line 318
    nop

    .line 319
    iget v0, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$mainAxisArrangementSpacing:F

    invoke-interface {p1, v0}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->roundToPx-0680j_4(F)I

    move-result v0

    .line 320
    iget v1, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$crossAxisArrangementSpacing:F

    invoke-interface {p1, v1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->roundToPx-0680j_4(F)I

    move-result v1

    .line 316
    invoke-virtual {p0, p2, p3, v0, v1}, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->minIntrinsicMainAxisSize(Ljava/util/List;III)I

    move-result v0

    .line 322
    :goto_0
    return v0
.end method

.method public final minIntrinsicMainAxisSize(Ljava/util/List;III)I
    .locals 8
    .param p1, "measurables"    # Ljava/util/List;
    .param p2, "crossAxisAvailable"    # I
    .param p3, "mainAxisSpacing"    # I
    .param p4, "crossAxisSpacing"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;III)I"
        }
    .end annotation

    const-string/jumbo v0, "measurables"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 366
    nop

    .line 367
    iget-object v2, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->minMainAxisIntrinsicItemSize:Lkotlin/jvm/functions/Function3;

    .line 368
    iget-object v3, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->minCrossAxisIntrinsicItemSize:Lkotlin/jvm/functions/Function3;

    .line 369
    nop

    .line 370
    nop

    .line 371
    nop

    .line 372
    iget v7, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$maxItemsInMainAxis:I

    .line 365
    move-object v1, p1

    move v4, p2

    move v5, p3

    move v6, p4

    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/layout/FlowLayoutKt;->access$minIntrinsicMainAxisSize(Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;IIII)I

    move-result v0

    .line 373
    return v0
.end method

.method public minIntrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 2
    .param p1, "$this$minIntrinsicWidth"    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "height"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;I)I"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "measurables"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 289
    iget-object v0, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$orientation:Landroidx/compose/foundation/layout/LayoutOrientation;

    sget-object v1, Landroidx/compose/foundation/layout/LayoutOrientation;->Horizontal:Landroidx/compose/foundation/layout/LayoutOrientation;

    if-ne v0, v1, :cond_0

    .line 290
    nop

    .line 291
    nop

    .line 292
    nop

    .line 293
    iget v0, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$mainAxisArrangementSpacing:F

    invoke-interface {p1, v0}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->roundToPx-0680j_4(F)I

    move-result v0

    .line 294
    iget v1, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$crossAxisArrangementSpacing:F

    invoke-interface {p1, v1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->roundToPx-0680j_4(F)I

    move-result v1

    .line 290
    invoke-virtual {p0, p2, p3, v0, v1}, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->minIntrinsicMainAxisSize(Ljava/util/List;III)I

    move-result v0

    goto :goto_0

    .line 297
    :cond_0
    nop

    .line 298
    nop

    .line 299
    nop

    .line 300
    iget v0, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$mainAxisArrangementSpacing:F

    invoke-interface {p1, v0}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->roundToPx-0680j_4(F)I

    move-result v0

    .line 301
    iget v1, p0, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->$crossAxisArrangementSpacing:F

    invoke-interface {p1, v1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->roundToPx-0680j_4(F)I

    move-result v1

    .line 297
    invoke-virtual {p0, p2, p3, v0, v1}, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;->intrinsicCrossAxisSize(Ljava/util/List;III)I

    move-result v0

    .line 303
    :goto_0
    return v0
.end method
