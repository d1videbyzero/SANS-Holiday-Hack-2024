.class public final Landroidx/compose/material3/TopAppBarState;
.super Ljava/lang/Object;
.source "AppBar.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/material3/TopAppBarState$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/TopAppBarState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1664:1\n76#2:1665\n102#2,2:1666\n76#2:1668\n102#2,2:1669\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/TopAppBarState\n*L\n833#1:1665\n833#1:1666,2\n860#1:1668\n860#1:1669,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0016\u0008\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR+\u0010\r\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u00038F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u000e\u0010\u000b\"\u0004\u0008\u000f\u0010\u0010R$\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00038F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0015\u0010\u000b\"\u0004\u0008\u0016\u0010\u0010R+\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u00038F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u001a\u0010\u0012\u001a\u0004\u0008\u0018\u0010\u000b\"\u0004\u0008\u0019\u0010\u0010R\u0011\u0010\u001b\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u000b\u00a8\u0006\u001e"
    }
    d2 = {
        "Landroidx/compose/material3/TopAppBarState;",
        "",
        "initialHeightOffsetLimit",
        "",
        "initialHeightOffset",
        "initialContentOffset",
        "(FFF)V",
        "_heightOffset",
        "Landroidx/compose/runtime/MutableState;",
        "collapsedFraction",
        "getCollapsedFraction",
        "()F",
        "<set-?>",
        "contentOffset",
        "getContentOffset",
        "setContentOffset",
        "(F)V",
        "contentOffset$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "newOffset",
        "heightOffset",
        "getHeightOffset",
        "setHeightOffset",
        "heightOffsetLimit",
        "getHeightOffsetLimit",
        "setHeightOffsetLimit",
        "heightOffsetLimit$delegate",
        "overlappedFraction",
        "getOverlappedFraction",
        "Companion",
        "material3_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Landroidx/compose/material3/TopAppBarState$Companion;

.field private static final Saver:Landroidx/compose/runtime/saveable/Saver;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/saveable/Saver<",
            "Landroidx/compose/material3/TopAppBarState;",
            "*>;"
        }
    .end annotation
.end field


# instance fields
.field private _heightOffset:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private final contentOffset$delegate:Landroidx/compose/runtime/MutableState;

.field private final heightOffsetLimit$delegate:Landroidx/compose/runtime/MutableState;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/material3/TopAppBarState$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/material3/TopAppBarState$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/material3/TopAppBarState;->Companion:Landroidx/compose/material3/TopAppBarState$Companion;

    .line 896
    sget-object v0, Landroidx/compose/material3/TopAppBarState$Companion$Saver$1;->INSTANCE:Landroidx/compose/material3/TopAppBarState$Companion$Saver$1;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    sget-object v1, Landroidx/compose/material3/TopAppBarState$Companion$Saver$2;->INSTANCE:Landroidx/compose/material3/TopAppBarState$Companion$Saver$2;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Landroidx/compose/runtime/saveable/ListSaverKt;->listSaver(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/saveable/Saver;

    move-result-object v0

    sput-object v0, Landroidx/compose/material3/TopAppBarState;->Saver:Landroidx/compose/runtime/saveable/Saver;

    return-void
.end method

.method public constructor <init>(FFF)V
    .locals 3
    .param p1, "initialHeightOffsetLimit"    # F
    .param p2, "initialHeightOffset"    # F
    .param p3, "initialContentOffset"    # F

    .line 819
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 833
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/material3/TopAppBarState;->heightOffsetLimit$delegate:Landroidx/compose/runtime/MutableState;

    .line 860
    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0, v1, v2, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/material3/TopAppBarState;->contentOffset$delegate:Landroidx/compose/runtime/MutableState;

    .line 908
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0, v1, v2, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/material3/TopAppBarState;->_heightOffset:Landroidx/compose/runtime/MutableState;

    .line 821
    return-void
.end method

.method public static final synthetic access$getSaver$cp()Landroidx/compose/runtime/saveable/Saver;
    .locals 1

    .line 819
    sget-object v0, Landroidx/compose/material3/TopAppBarState;->Saver:Landroidx/compose/runtime/saveable/Saver;

    return-object v0
.end method


# virtual methods
.method public final getCollapsedFraction()F
    .locals 2

    .line 869
    invoke-virtual {p0}, Landroidx/compose/material3/TopAppBarState;->getHeightOffsetLimit()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    .line 870
    invoke-virtual {p0}, Landroidx/compose/material3/TopAppBarState;->getHeightOffset()F

    move-result v0

    invoke-virtual {p0}, Landroidx/compose/material3/TopAppBarState;->getHeightOffsetLimit()F

    move-result v1

    div-float v1, v0, v1

    goto :goto_1

    .line 872
    :cond_1
    nop

    .line 873
    :goto_1
    return v1
.end method

.method public final getContentOffset()F
    .locals 3

    .line 860
    iget-object v0, p0, Landroidx/compose/material3/TopAppBarState;->contentOffset$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue$iv":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "property$iv":Lkotlin/reflect/KProperty;
    const/4 v2, 0x0

    .line 1668
    .local v2, "$i$f$getValue":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue$iv":Landroidx/compose/runtime/State;
    .end local v1    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v2    # "$i$f$getValue":I
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    .line 860
    return v0
.end method

.method public final getHeightOffset()F
    .locals 1

    .line 842
    iget-object v0, p0, Landroidx/compose/material3/TopAppBarState;->_heightOffset:Landroidx/compose/runtime/MutableState;

    invoke-interface {v0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0
.end method

.method public final getHeightOffsetLimit()F
    .locals 3

    .line 833
    iget-object v0, p0, Landroidx/compose/material3/TopAppBarState;->heightOffsetLimit$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue$iv":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "property$iv":Lkotlin/reflect/KProperty;
    const/4 v2, 0x0

    .line 1665
    .local v2, "$i$f$getValue":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue$iv":Landroidx/compose/runtime/State;
    .end local v1    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v2    # "$i$f$getValue":I
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    .line 833
    return v0
.end method

.method public final getOverlappedFraction()F
    .locals 4

    .line 883
    invoke-virtual {p0}, Landroidx/compose/material3/TopAppBarState;->getHeightOffsetLimit()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    const/4 v2, 0x1

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    .line 884
    int-to-float v0, v2

    invoke-virtual {p0}, Landroidx/compose/material3/TopAppBarState;->getHeightOffsetLimit()F

    move-result v2

    invoke-virtual {p0}, Landroidx/compose/material3/TopAppBarState;->getContentOffset()F

    move-result v3

    sub-float/2addr v2, v3

    .line 885
    invoke-virtual {p0}, Landroidx/compose/material3/TopAppBarState;->getHeightOffsetLimit()F

    move-result v3

    .line 886
    nop

    .line 884
    invoke-static {v2, v3, v1}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v1

    .line 887
    invoke-virtual {p0}, Landroidx/compose/material3/TopAppBarState;->getHeightOffsetLimit()F

    move-result v2

    .line 884
    div-float/2addr v1, v2

    sub-float v1, v0, v1

    goto :goto_1

    .line 889
    :cond_1
    nop

    .line 890
    :goto_1
    return v1
.end method

.method public final setContentOffset(F)V
    .locals 4
    .param p1, "<set-?>"    # F

    .line 860
    iget-object v0, p0, Landroidx/compose/material3/TopAppBarState;->contentOffset$delegate:Landroidx/compose/runtime/MutableState;

    .local v0, "$this$setValue$iv":Landroidx/compose/runtime/MutableState;
    const/4 v1, 0x0

    .local v1, "property$iv":Lkotlin/reflect/KProperty;
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    .local v2, "value$iv":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 1669
    .local v3, "$i$f$setValue":I
    invoke-interface {v0, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 1670
    nop

    .line 860
    .end local v0    # "$this$setValue$iv":Landroidx/compose/runtime/MutableState;
    .end local v1    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v2    # "value$iv":Ljava/lang/Object;
    .end local v3    # "$i$f$setValue":I
    return-void
.end method

.method public final setHeightOffset(F)V
    .locals 3
    .param p1, "newOffset"    # F

    .line 844
    iget-object v0, p0, Landroidx/compose/material3/TopAppBarState;->_heightOffset:Landroidx/compose/runtime/MutableState;

    .line 845
    invoke-virtual {p0}, Landroidx/compose/material3/TopAppBarState;->getHeightOffsetLimit()F

    move-result v1

    .line 846
    nop

    .line 844
    const/4 v2, 0x0

    invoke-static {p1, v1, v2}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 848
    return-void
.end method

.method public final setHeightOffsetLimit(F)V
    .locals 4
    .param p1, "<set-?>"    # F

    .line 833
    iget-object v0, p0, Landroidx/compose/material3/TopAppBarState;->heightOffsetLimit$delegate:Landroidx/compose/runtime/MutableState;

    .local v0, "$this$setValue$iv":Landroidx/compose/runtime/MutableState;
    const/4 v1, 0x0

    .local v1, "property$iv":Lkotlin/reflect/KProperty;
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    .local v2, "value$iv":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 1666
    .local v3, "$i$f$setValue":I
    invoke-interface {v0, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 1667
    nop

    .line 833
    .end local v0    # "$this$setValue$iv":Landroidx/compose/runtime/MutableState;
    .end local v1    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v2    # "value$iv":Ljava/lang/Object;
    .end local v3    # "$i$f$setValue":I
    return-void
.end method
