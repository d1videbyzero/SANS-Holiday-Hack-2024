.class final Landroidx/compose/material/ExposedDropdownMenuDefaults$TrailingIcon$4;
.super Lkotlin/jvm/internal/Lambda;
.source "ExposedDropdownMenu.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/ExposedDropdownMenuDefaults;->TrailingIcon(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
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

.field final synthetic $expanded:Z

.field final synthetic $onIconClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $tmp0_rcvr:Landroidx/compose/material/ExposedDropdownMenuDefaults;


# direct methods
.method constructor <init>(Landroidx/compose/material/ExposedDropdownMenuDefaults;ZLkotlin/jvm/functions/Function0;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material/ExposedDropdownMenuDefaults;",
            "Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;II)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material/ExposedDropdownMenuDefaults$TrailingIcon$4;->$tmp0_rcvr:Landroidx/compose/material/ExposedDropdownMenuDefaults;

    iput-boolean p2, p0, Landroidx/compose/material/ExposedDropdownMenuDefaults$TrailingIcon$4;->$expanded:Z

    iput-object p3, p0, Landroidx/compose/material/ExposedDropdownMenuDefaults$TrailingIcon$4;->$onIconClick:Lkotlin/jvm/functions/Function0;

    iput p4, p0, Landroidx/compose/material/ExposedDropdownMenuDefaults$TrailingIcon$4;->$$changed:I

    iput p5, p0, Landroidx/compose/material/ExposedDropdownMenuDefaults$TrailingIcon$4;->$$default:I

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

    invoke-virtual {p0, v0, v1}, Landroidx/compose/material/ExposedDropdownMenuDefaults$TrailingIcon$4;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 6

    iget-object v0, p0, Landroidx/compose/material/ExposedDropdownMenuDefaults$TrailingIcon$4;->$tmp0_rcvr:Landroidx/compose/material/ExposedDropdownMenuDefaults;

    iget-boolean v1, p0, Landroidx/compose/material/ExposedDropdownMenuDefaults$TrailingIcon$4;->$expanded:Z

    iget-object v2, p0, Landroidx/compose/material/ExposedDropdownMenuDefaults$TrailingIcon$4;->$onIconClick:Lkotlin/jvm/functions/Function0;

    iget v3, p0, Landroidx/compose/material/ExposedDropdownMenuDefaults$TrailingIcon$4;->$$changed:I

    or-int/lit8 v3, v3, 0x1

    invoke-static {v3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v4

    iget v5, p0, Landroidx/compose/material/ExposedDropdownMenuDefaults$TrailingIcon$4;->$$default:I

    move-object v3, p1

    invoke-virtual/range {v0 .. v5}, Landroidx/compose/material/ExposedDropdownMenuDefaults;->TrailingIcon(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
