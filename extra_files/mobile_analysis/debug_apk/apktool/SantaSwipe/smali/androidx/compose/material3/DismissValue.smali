.class public final enum Landroidx/compose/material3/DismissValue;
.super Ljava/lang/Enum;
.source "SwipeToDismiss.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/compose/material3/DismissValue;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0087\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Landroidx/compose/material3/DismissValue;",
        "",
        "(Ljava/lang/String;I)V",
        "Default",
        "DismissedToEnd",
        "DismissedToStart",
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
.field private static final synthetic $VALUES:[Landroidx/compose/material3/DismissValue;

.field public static final enum Default:Landroidx/compose/material3/DismissValue;

.field public static final enum DismissedToEnd:Landroidx/compose/material3/DismissValue;

.field public static final enum DismissedToStart:Landroidx/compose/material3/DismissValue;


# direct methods
.method private static final synthetic $values()[Landroidx/compose/material3/DismissValue;
    .locals 3

    sget-object v0, Landroidx/compose/material3/DismissValue;->Default:Landroidx/compose/material3/DismissValue;

    sget-object v1, Landroidx/compose/material3/DismissValue;->DismissedToEnd:Landroidx/compose/material3/DismissValue;

    sget-object v2, Landroidx/compose/material3/DismissValue;->DismissedToStart:Landroidx/compose/material3/DismissValue;

    filled-new-array {v0, v1, v2}, [Landroidx/compose/material3/DismissValue;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 66
    new-instance v0, Landroidx/compose/material3/DismissValue;

    const-string v1, "Default"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/compose/material3/DismissValue;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/compose/material3/DismissValue;->Default:Landroidx/compose/material3/DismissValue;

    .line 71
    new-instance v0, Landroidx/compose/material3/DismissValue;

    const-string v1, "DismissedToEnd"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/compose/material3/DismissValue;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/compose/material3/DismissValue;->DismissedToEnd:Landroidx/compose/material3/DismissValue;

    .line 76
    new-instance v0, Landroidx/compose/material3/DismissValue;

    const-string v1, "DismissedToStart"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Landroidx/compose/material3/DismissValue;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/compose/material3/DismissValue;->DismissedToStart:Landroidx/compose/material3/DismissValue;

    invoke-static {}, Landroidx/compose/material3/DismissValue;->$values()[Landroidx/compose/material3/DismissValue;

    move-result-object v0

    sput-object v0, Landroidx/compose/material3/DismissValue;->$VALUES:[Landroidx/compose/material3/DismissValue;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .param p1, "$enum$name"    # Ljava/lang/String;
    .param p2, "$enum$ordinal"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 61
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 62
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/compose/material3/DismissValue;
    .locals 1

    const-class v0, Landroidx/compose/material3/DismissValue;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Landroidx/compose/material3/DismissValue;

    return-object v0
.end method

.method public static values()[Landroidx/compose/material3/DismissValue;
    .locals 1

    sget-object v0, Landroidx/compose/material3/DismissValue;->$VALUES:[Landroidx/compose/material3/DismissValue;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/compose/material3/DismissValue;

    return-object v0
.end method
