.class final Landroidx/compose/material3/SliderKt$Slider$3;
.super Lkotlin/jvm/internal/Lambda;
.source "Slider.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/SliderKt;->Slider(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Landroidx/compose/material3/SliderPositions;",
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
.field final synthetic $$dirty:I

.field final synthetic $colors:Landroidx/compose/material3/SliderColors;

.field final synthetic $enabled:Z

.field final synthetic $interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material3/SliderColors;ZI)V
    .locals 1

    iput-object p1, p0, Landroidx/compose/material3/SliderKt$Slider$3;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iput-object p2, p0, Landroidx/compose/material3/SliderKt$Slider$3;->$colors:Landroidx/compose/material3/SliderColors;

    iput-boolean p3, p0, Landroidx/compose/material3/SliderKt$Slider$3;->$enabled:Z

    iput p4, p0, Landroidx/compose/material3/SliderKt$Slider$3;->$$dirty:I

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p1, "p1"    # Ljava/lang/Object;
    .param p2, "p2"    # Ljava/lang/Object;
    .param p3, "p3"    # Ljava/lang/Object;

    .line 170
    move-object v0, p1

    check-cast v0, Landroidx/compose/material3/SliderPositions;

    move-object v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {p0, v0, v1, v2}, Landroidx/compose/material3/SliderKt$Slider$3;->invoke(Landroidx/compose/material3/SliderPositions;Landroidx/compose/runtime/Composer;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/material3/SliderPositions;Landroidx/compose/runtime/Composer;I)V
    .locals 15
    .param p1, "it"    # Landroidx/compose/material3/SliderPositions;
    .param p2, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p3, "$changed"    # I

    move-object v0, p0

    move/from16 v1, p3

    const-string/jumbo v2, "it"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "C170@7936L142:Slider.kt#uh7d8r"

    move-object/from16 v14, p2

    invoke-static {v14, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 171
    and-int/lit8 v2, v1, 0x51

    const/16 v4, 0x10

    if-ne v2, v4, :cond_1

    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 175
    :cond_0
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_1

    .line 171
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v4, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:169)"

    const v5, -0x5abec978

    invoke-static {v5, v1, v2, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    sget-object v4, Landroidx/compose/material3/SliderDefaults;->INSTANCE:Landroidx/compose/material3/SliderDefaults;

    .line 172
    iget-object v5, v0, Landroidx/compose/material3/SliderKt$Slider$3;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 173
    iget-object v7, v0, Landroidx/compose/material3/SliderKt$Slider$3;->$colors:Landroidx/compose/material3/SliderColors;

    .line 174
    iget-boolean v8, v0, Landroidx/compose/material3/SliderKt$Slider$3;->$enabled:Z

    iget v2, v0, Landroidx/compose/material3/SliderKt$Slider$3;->$$dirty:I

    shr-int/lit8 v2, v2, 0x18

    and-int/lit8 v2, v2, 0xe

    const/high16 v6, 0x30000

    or-int/2addr v2, v6

    iget v6, v0, Landroidx/compose/material3/SliderKt$Slider$3;->$$dirty:I

    shr-int/lit8 v6, v6, 0xf

    and-int/lit16 v6, v6, 0x380

    or-int/2addr v2, v6

    iget v6, v0, Landroidx/compose/material3/SliderKt$Slider$3;->$$dirty:I

    and-int/lit16 v6, v6, 0x1c00

    or-int v12, v2, v6

    .line 171
    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/16 v13, 0x12

    move-object/from16 v11, p2

    invoke-virtual/range {v4 .. v13}, Landroidx/compose/material3/SliderDefaults;->Thumb-9LiSoMs(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZJLandroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 176
    :cond_3
    :goto_1
    return-void
.end method
