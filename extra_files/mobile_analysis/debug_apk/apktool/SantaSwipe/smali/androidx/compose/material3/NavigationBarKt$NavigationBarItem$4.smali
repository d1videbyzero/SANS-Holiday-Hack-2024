.class final Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$4;
.super Lkotlin/jvm/internal/Lambda;
.source "NavigationBar.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/NavigationBarKt;->NavigationBarItem(Landroidx/compose/foundation/layout/RowScope;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/NavigationBarItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
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
.field final synthetic $$changed:I

.field final synthetic $$default:I

.field final synthetic $alwaysShowLabel:Z

.field final synthetic $colors:Landroidx/compose/material3/NavigationBarItemColors;

.field final synthetic $enabled:Z

.field final synthetic $icon:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

.field final synthetic $label:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $modifier:Landroidx/compose/ui/Modifier;

.field final synthetic $onClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $selected:Z

.field final synthetic $this_NavigationBarItem:Landroidx/compose/foundation/layout/RowScope;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/layout/RowScope;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/NavigationBarItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/layout/RowScope;",
            "Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;Z",
            "Landroidx/compose/material3/NavigationBarItemColors;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "II)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$4;->$this_NavigationBarItem:Landroidx/compose/foundation/layout/RowScope;

    iput-boolean p2, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$4;->$selected:Z

    iput-object p3, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$4;->$onClick:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$4;->$icon:Lkotlin/jvm/functions/Function2;

    iput-object p5, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$4;->$modifier:Landroidx/compose/ui/Modifier;

    iput-boolean p6, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$4;->$enabled:Z

    iput-object p7, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$4;->$label:Lkotlin/jvm/functions/Function2;

    iput-boolean p8, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$4;->$alwaysShowLabel:Z

    iput-object p9, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$4;->$colors:Landroidx/compose/material3/NavigationBarItemColors;

    iput-object p10, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$4;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iput p11, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$4;->$$changed:I

    iput p12, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$4;->$$default:I

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    move-object v0, p1

    check-cast v0, Landroidx/compose/runtime/Composer;

    move-object v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$4;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 13

    iget-object v0, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$4;->$this_NavigationBarItem:Landroidx/compose/foundation/layout/RowScope;

    iget-boolean v1, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$4;->$selected:Z

    iget-object v2, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$4;->$onClick:Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$4;->$icon:Lkotlin/jvm/functions/Function2;

    iget-object v4, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$4;->$modifier:Landroidx/compose/ui/Modifier;

    iget-boolean v5, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$4;->$enabled:Z

    iget-object v6, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$4;->$label:Lkotlin/jvm/functions/Function2;

    iget-boolean v7, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$4;->$alwaysShowLabel:Z

    iget-object v8, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$4;->$colors:Landroidx/compose/material3/NavigationBarItemColors;

    iget-object v9, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$4;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iget v10, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$4;->$$changed:I

    or-int/lit8 v10, v10, 0x1

    invoke-static {v10}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v11

    iget v12, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$4;->$$default:I

    move-object v10, p1

    invoke-static/range {v0 .. v12}, Landroidx/compose/material3/NavigationBarKt;->NavigationBarItem(Landroidx/compose/foundation/layout/RowScope;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/NavigationBarItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
