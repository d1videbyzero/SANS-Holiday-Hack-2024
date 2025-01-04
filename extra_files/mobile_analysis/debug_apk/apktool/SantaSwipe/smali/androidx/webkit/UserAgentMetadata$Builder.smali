.class public final Landroidx/webkit/UserAgentMetadata$Builder;
.super Ljava/lang/Object;
.source "UserAgentMetadata.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/webkit/UserAgentMetadata;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private mArchitecture:Ljava/lang/String;

.field private mBitness:I

.field private mBrandVersionList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/webkit/UserAgentMetadata$BrandVersion;",
            ">;"
        }
    .end annotation
.end field

.field private mFullVersion:Ljava/lang/String;

.field private mMobile:Z

.field private mModel:Ljava/lang/String;

.field private mPlatform:Ljava/lang/String;

.field private mPlatformVersion:Ljava/lang/String;

.field private mWow64:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 411
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 398
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mBrandVersionList:Ljava/util/List;

    .line 404
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mMobile:Z

    .line 405
    const/4 v0, 0x0

    iput v0, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mBitness:I

    .line 406
    iput-boolean v0, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mWow64:Z

    .line 412
    return-void
.end method

.method public constructor <init>(Landroidx/webkit/UserAgentMetadata;)V
    .locals 1
    .param p1, "uaMetadata"    # Landroidx/webkit/UserAgentMetadata;

    .line 417
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 398
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mBrandVersionList:Ljava/util/List;

    .line 404
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mMobile:Z

    .line 405
    const/4 v0, 0x0

    iput v0, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mBitness:I

    .line 406
    iput-boolean v0, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mWow64:Z

    .line 418
    invoke-virtual {p1}, Landroidx/webkit/UserAgentMetadata;->getBrandVersionList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mBrandVersionList:Ljava/util/List;

    .line 419
    invoke-virtual {p1}, Landroidx/webkit/UserAgentMetadata;->getFullVersion()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mFullVersion:Ljava/lang/String;

    .line 420
    invoke-virtual {p1}, Landroidx/webkit/UserAgentMetadata;->getPlatform()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mPlatform:Ljava/lang/String;

    .line 421
    invoke-virtual {p1}, Landroidx/webkit/UserAgentMetadata;->getPlatformVersion()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mPlatformVersion:Ljava/lang/String;

    .line 422
    invoke-virtual {p1}, Landroidx/webkit/UserAgentMetadata;->getArchitecture()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mArchitecture:Ljava/lang/String;

    .line 423
    invoke-virtual {p1}, Landroidx/webkit/UserAgentMetadata;->getModel()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mModel:Ljava/lang/String;

    .line 424
    invoke-virtual {p1}, Landroidx/webkit/UserAgentMetadata;->isMobile()Z

    move-result v0

    iput-boolean v0, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mMobile:Z

    .line 425
    invoke-virtual {p1}, Landroidx/webkit/UserAgentMetadata;->getBitness()I

    move-result v0

    iput v0, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mBitness:I

    .line 426
    invoke-virtual {p1}, Landroidx/webkit/UserAgentMetadata;->isWow64()Z

    move-result v0

    iput-boolean v0, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mWow64:Z

    .line 427
    return-void
.end method


# virtual methods
.method public build()Landroidx/webkit/UserAgentMetadata;
    .locals 12

    .line 436
    new-instance v11, Landroidx/webkit/UserAgentMetadata;

    iget-object v1, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mBrandVersionList:Ljava/util/List;

    iget-object v2, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mFullVersion:Ljava/lang/String;

    iget-object v3, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mPlatform:Ljava/lang/String;

    iget-object v4, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mPlatformVersion:Ljava/lang/String;

    iget-object v5, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mArchitecture:Ljava/lang/String;

    iget-object v6, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mModel:Ljava/lang/String;

    iget-boolean v7, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mMobile:Z

    iget v8, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mBitness:I

    iget-boolean v9, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mWow64:Z

    const/4 v10, 0x0

    move-object v0, v11

    invoke-direct/range {v0 .. v10}, Landroidx/webkit/UserAgentMetadata;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIZLandroidx/webkit/UserAgentMetadata$1;)V

    return-object v11
.end method

.method public setArchitecture(Ljava/lang/String;)Landroidx/webkit/UserAgentMetadata$Builder;
    .locals 0
    .param p1, "architecture"    # Ljava/lang/String;

    .line 526
    iput-object p1, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mArchitecture:Ljava/lang/String;

    .line 527
    return-object p0
.end method

.method public setBitness(I)Landroidx/webkit/UserAgentMetadata$Builder;
    .locals 0
    .param p1, "bitness"    # I

    .line 568
    iput p1, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mBitness:I

    .line 569
    return-object p0
.end method

.method public setBrandVersionList(Ljava/util/List;)Landroidx/webkit/UserAgentMetadata$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/webkit/UserAgentMetadata$BrandVersion;",
            ">;)",
            "Landroidx/webkit/UserAgentMetadata$Builder;"
        }
    .end annotation

    .line 452
    .local p1, "brandVersions":Ljava/util/List;, "Ljava/util/List<Landroidx/webkit/UserAgentMetadata$BrandVersion;>;"
    iput-object p1, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mBrandVersionList:Ljava/util/List;

    .line 453
    return-object p0
.end method

.method public setFullVersion(Ljava/lang/String;)Landroidx/webkit/UserAgentMetadata$Builder;
    .locals 2
    .param p1, "fullVersion"    # Ljava/lang/String;

    .line 470
    if-nez p1, :cond_0

    .line 471
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mFullVersion:Ljava/lang/String;

    .line 472
    return-object p0

    .line 474
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 477
    iput-object p1, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mFullVersion:Ljava/lang/String;

    .line 478
    return-object p0

    .line 475
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Full version should not be blank."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setMobile(Z)Landroidx/webkit/UserAgentMetadata$Builder;
    .locals 0
    .param p1, "mobile"    # Z

    .line 553
    iput-boolean p1, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mMobile:Z

    .line 554
    return-object p0
.end method

.method public setModel(Ljava/lang/String;)Landroidx/webkit/UserAgentMetadata$Builder;
    .locals 0
    .param p1, "model"    # Ljava/lang/String;

    .line 540
    iput-object p1, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mModel:Ljava/lang/String;

    .line 541
    return-object p0
.end method

.method public setPlatform(Ljava/lang/String;)Landroidx/webkit/UserAgentMetadata$Builder;
    .locals 2
    .param p1, "platform"    # Ljava/lang/String;

    .line 491
    if-nez p1, :cond_0

    .line 492
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mPlatform:Ljava/lang/String;

    .line 493
    return-object p0

    .line 495
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 498
    iput-object p1, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mPlatform:Ljava/lang/String;

    .line 499
    return-object p0

    .line 496
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Platform should not be blank."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setPlatformVersion(Ljava/lang/String;)Landroidx/webkit/UserAgentMetadata$Builder;
    .locals 0
    .param p1, "platformVersion"    # Ljava/lang/String;

    .line 512
    iput-object p1, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mPlatformVersion:Ljava/lang/String;

    .line 513
    return-object p0
.end method

.method public setWow64(Z)Landroidx/webkit/UserAgentMetadata$Builder;
    .locals 0
    .param p1, "wow64"    # Z

    .line 581
    iput-boolean p1, p0, Landroidx/webkit/UserAgentMetadata$Builder;->mWow64:Z

    .line 582
    return-object p0
.end method
