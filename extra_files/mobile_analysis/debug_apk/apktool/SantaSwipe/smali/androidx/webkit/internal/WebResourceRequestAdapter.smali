.class public Landroidx/webkit/internal/WebResourceRequestAdapter;
.super Ljava/lang/Object;
.source "WebResourceRequestAdapter.java"


# instance fields
.field private final mBoundaryInterface:Lorg/chromium/support_lib_boundary/WebResourceRequestBoundaryInterface;


# direct methods
.method public constructor <init>(Lorg/chromium/support_lib_boundary/WebResourceRequestBoundaryInterface;)V
    .locals 0
    .param p1, "boundaryInterface"    # Lorg/chromium/support_lib_boundary/WebResourceRequestBoundaryInterface;

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Landroidx/webkit/internal/WebResourceRequestAdapter;->mBoundaryInterface:Lorg/chromium/support_lib_boundary/WebResourceRequestBoundaryInterface;

    .line 35
    return-void
.end method


# virtual methods
.method public isRedirect()Z
    .locals 1

    .line 42
    iget-object v0, p0, Landroidx/webkit/internal/WebResourceRequestAdapter;->mBoundaryInterface:Lorg/chromium/support_lib_boundary/WebResourceRequestBoundaryInterface;

    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/WebResourceRequestBoundaryInterface;->isRedirect()Z

    move-result v0

    return v0
.end method
