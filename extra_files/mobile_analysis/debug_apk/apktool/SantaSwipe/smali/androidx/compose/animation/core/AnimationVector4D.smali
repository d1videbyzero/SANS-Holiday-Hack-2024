.class public final Landroidx/compose/animation/core/AnimationVector4D;
.super Landroidx/compose/animation/core/AnimationVector;
.source "AnimationVectors.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\u0013\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\u0016\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\tH\u0090\u0002\u00a2\u0006\u0002\u0008\u001dJ\u0008\u0010\u001e\u001a\u00020\tH\u0016J\r\u0010\u001f\u001a\u00020\u0000H\u0010\u00a2\u0006\u0002\u0008 J\r\u0010!\u001a\u00020\"H\u0010\u00a2\u0006\u0002\u0008#J\u001e\u0010$\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u0003H\u0090\u0002\u00a2\u0006\u0002\u0008&J\u0008\u0010\'\u001a\u00020(H\u0016R\u0014\u0010\u0008\u001a\u00020\tX\u0090D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u0003@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u0003@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0011\u0010\u000e\"\u0004\u0008\u0012\u0010\u0010R$\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u0003@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0013\u0010\u000e\"\u0004\u0008\u0014\u0010\u0010R$\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u0003@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0015\u0010\u000e\"\u0004\u0008\u0016\u0010\u0010\u00a8\u0006)"
    }
    d2 = {
        "Landroidx/compose/animation/core/AnimationVector4D;",
        "Landroidx/compose/animation/core/AnimationVector;",
        "v1",
        "",
        "v2",
        "v3",
        "v4",
        "(FFFF)V",
        "size",
        "",
        "getSize$animation_core_release",
        "()I",
        "<set-?>",
        "getV1",
        "()F",
        "setV1$animation_core_release",
        "(F)V",
        "getV2",
        "setV2$animation_core_release",
        "getV3",
        "setV3$animation_core_release",
        "getV4",
        "setV4$animation_core_release",
        "equals",
        "",
        "other",
        "",
        "get",
        "index",
        "get$animation_core_release",
        "hashCode",
        "newVector",
        "newVector$animation_core_release",
        "reset",
        "",
        "reset$animation_core_release",
        "set",
        "value",
        "set$animation_core_release",
        "toString",
        "",
        "animation-core_release"
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


# instance fields
.field private final size:I

.field private v1:F

.field private v2:F

.field private v3:F

.field private v4:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Landroidx/compose/animation/core/AnimationVector4D;->$stable:I

    return-void
.end method

.method public constructor <init>(FFFF)V
    .locals 1
    .param p1, "v1"    # F
    .param p2, "v2"    # F
    .param p3, "v3"    # F
    .param p4, "v4"    # F

    .line 266
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroidx/compose/animation/core/AnimationVector;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 271
    iput p1, p0, Landroidx/compose/animation/core/AnimationVector4D;->v1:F

    .line 277
    iput p2, p0, Landroidx/compose/animation/core/AnimationVector4D;->v2:F

    .line 283
    iput p3, p0, Landroidx/compose/animation/core/AnimationVector4D;->v3:F

    .line 289
    iput p4, p0, Landroidx/compose/animation/core/AnimationVector4D;->v4:F

    .line 320
    const/4 v0, 0x4

    iput v0, p0, Landroidx/compose/animation/core/AnimationVector4D;->size:I

    .line 266
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1, "other"    # Ljava/lang/Object;

    .line 327
    instance-of v0, p1, Landroidx/compose/animation/core/AnimationVector4D;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    .line 328
    move-object v0, p1

    check-cast v0, Landroidx/compose/animation/core/AnimationVector4D;

    iget v0, v0, Landroidx/compose/animation/core/AnimationVector4D;->v1:F

    iget v2, p0, Landroidx/compose/animation/core/AnimationVector4D;->v1:F

    cmpg-float v0, v0, v2

    const/4 v2, 0x1

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_4

    .line 329
    move-object v0, p1

    check-cast v0, Landroidx/compose/animation/core/AnimationVector4D;

    iget v0, v0, Landroidx/compose/animation/core/AnimationVector4D;->v2:F

    iget v3, p0, Landroidx/compose/animation/core/AnimationVector4D;->v2:F

    cmpg-float v0, v0, v3

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    if-eqz v0, :cond_4

    .line 330
    move-object v0, p1

    check-cast v0, Landroidx/compose/animation/core/AnimationVector4D;

    iget v0, v0, Landroidx/compose/animation/core/AnimationVector4D;->v3:F

    iget v3, p0, Landroidx/compose/animation/core/AnimationVector4D;->v3:F

    cmpg-float v0, v0, v3

    if-nez v0, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    if-eqz v0, :cond_4

    .line 331
    move-object v0, p1

    check-cast v0, Landroidx/compose/animation/core/AnimationVector4D;

    iget v0, v0, Landroidx/compose/animation/core/AnimationVector4D;->v4:F

    iget v3, p0, Landroidx/compose/animation/core/AnimationVector4D;->v4:F

    cmpg-float v0, v0, v3

    if-nez v0, :cond_3

    move v0, v2

    goto :goto_3

    :cond_3
    move v0, v1

    :goto_3
    if-eqz v0, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    nop

    :goto_4
    return v1
.end method

.method public get$animation_core_release(I)F
    .locals 1
    .param p1, "index"    # I

    .line 302
    packed-switch p1, :pswitch_data_0

    .line 307
    const/4 v0, 0x0

    goto :goto_0

    .line 306
    :pswitch_0
    iget v0, p0, Landroidx/compose/animation/core/AnimationVector4D;->v4:F

    goto :goto_0

    .line 305
    :pswitch_1
    iget v0, p0, Landroidx/compose/animation/core/AnimationVector4D;->v3:F

    goto :goto_0

    .line 304
    :pswitch_2
    iget v0, p0, Landroidx/compose/animation/core/AnimationVector4D;->v2:F

    goto :goto_0

    .line 303
    :pswitch_3
    iget v0, p0, Landroidx/compose/animation/core/AnimationVector4D;->v1:F

    .line 302
    :goto_0
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getSize$animation_core_release()I
    .locals 1

    .line 320
    iget v0, p0, Landroidx/compose/animation/core/AnimationVector4D;->size:I

    return v0
.end method

.method public final getV1()F
    .locals 1

    .line 271
    iget v0, p0, Landroidx/compose/animation/core/AnimationVector4D;->v1:F

    return v0
.end method

.method public final getV2()F
    .locals 1

    .line 277
    iget v0, p0, Landroidx/compose/animation/core/AnimationVector4D;->v2:F

    return v0
.end method

.method public final getV3()F
    .locals 1

    .line 283
    iget v0, p0, Landroidx/compose/animation/core/AnimationVector4D;->v3:F

    return v0
.end method

.method public final getV4()F
    .locals 1

    .line 289
    iget v0, p0, Landroidx/compose/animation/core/AnimationVector4D;->v4:F

    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 334
    iget v0, p0, Landroidx/compose/animation/core/AnimationVector4D;->v1:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroidx/compose/animation/core/AnimationVector4D;->v2:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroidx/compose/animation/core/AnimationVector4D;->v3:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroidx/compose/animation/core/AnimationVector4D;->v4:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public newVector$animation_core_release()Landroidx/compose/animation/core/AnimationVector4D;
    .locals 2

    .line 299
    new-instance v0, Landroidx/compose/animation/core/AnimationVector4D;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1, v1}, Landroidx/compose/animation/core/AnimationVector4D;-><init>(FFFF)V

    return-object v0
.end method

.method public bridge synthetic newVector$animation_core_release()Landroidx/compose/animation/core/AnimationVector;
    .locals 1

    .line 266
    invoke-virtual {p0}, Landroidx/compose/animation/core/AnimationVector4D;->newVector$animation_core_release()Landroidx/compose/animation/core/AnimationVector4D;

    move-result-object v0

    check-cast v0, Landroidx/compose/animation/core/AnimationVector;

    return-object v0
.end method

.method public reset$animation_core_release()V
    .locals 1

    .line 293
    const/4 v0, 0x0

    iput v0, p0, Landroidx/compose/animation/core/AnimationVector4D;->v1:F

    .line 294
    iput v0, p0, Landroidx/compose/animation/core/AnimationVector4D;->v2:F

    .line 295
    iput v0, p0, Landroidx/compose/animation/core/AnimationVector4D;->v3:F

    .line 296
    iput v0, p0, Landroidx/compose/animation/core/AnimationVector4D;->v4:F

    .line 297
    return-void
.end method

.method public set$animation_core_release(IF)V
    .locals 0
    .param p1, "index"    # I
    .param p2, "value"    # F

    .line 312
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 316
    :pswitch_0
    iput p2, p0, Landroidx/compose/animation/core/AnimationVector4D;->v4:F

    goto :goto_0

    .line 315
    :pswitch_1
    iput p2, p0, Landroidx/compose/animation/core/AnimationVector4D;->v3:F

    goto :goto_0

    .line 314
    :pswitch_2
    iput p2, p0, Landroidx/compose/animation/core/AnimationVector4D;->v2:F

    goto :goto_0

    .line 313
    :pswitch_3
    iput p2, p0, Landroidx/compose/animation/core/AnimationVector4D;->v1:F

    .line 318
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final setV1$animation_core_release(F)V
    .locals 0
    .param p1, "<set-?>"    # F

    .line 272
    iput p1, p0, Landroidx/compose/animation/core/AnimationVector4D;->v1:F

    return-void
.end method

.method public final setV2$animation_core_release(F)V
    .locals 0
    .param p1, "<set-?>"    # F

    .line 278
    iput p1, p0, Landroidx/compose/animation/core/AnimationVector4D;->v2:F

    return-void
.end method

.method public final setV3$animation_core_release(F)V
    .locals 0
    .param p1, "<set-?>"    # F

    .line 284
    iput p1, p0, Landroidx/compose/animation/core/AnimationVector4D;->v3:F

    return-void
.end method

.method public final setV4$animation_core_release(F)V
    .locals 0
    .param p1, "<set-?>"    # F

    .line 290
    iput p1, p0, Landroidx/compose/animation/core/AnimationVector4D;->v4:F

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 323
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AnimationVector4D: v1 = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroidx/compose/animation/core/AnimationVector4D;->v1:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", v2 = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroidx/compose/animation/core/AnimationVector4D;->v2:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", v3 = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroidx/compose/animation/core/AnimationVector4D;->v3:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", v4 = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroidx/compose/animation/core/AnimationVector4D;->v4:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
