.class public Landroidx/webkit/WebResourceRequestCompat;
.super Ljava/lang/Object;
.source "WebResourceRequestCompat.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static getAdapter(Landroid/webkit/WebResourceRequest;)Landroidx/webkit/internal/WebResourceRequestAdapter;
    .locals 1
    .param p0, "request"    # Landroid/webkit/WebResourceRequest;

    .line 61
    invoke-static {}, Landroidx/webkit/internal/WebViewGlueCommunicator;->getCompatConverter()Landroidx/webkit/internal/WebkitToCompatConverter;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/webkit/internal/WebkitToCompatConverter;->convertWebResourceRequest(Landroid/webkit/WebResourceRequest;)Landroidx/webkit/internal/WebResourceRequestAdapter;

    move-result-object v0

    return-object v0
.end method

.method public static isRedirect(Landroid/webkit/WebResourceRequest;)Z
    .locals 2
    .param p0, "request"    # Landroid/webkit/WebResourceRequest;

    .line 50
    sget-object v0, Landroidx/webkit/internal/WebViewFeatureInternal;->WEB_RESOURCE_REQUEST_IS_REDIRECT:Landroidx/webkit/internal/ApiFeature$N;

    .line 51
    .local v0, "feature":Landroidx/webkit/internal/ApiFeature$N;
    invoke-virtual {v0}, Landroidx/webkit/internal/ApiFeature$N;->isSupportedByFramework()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 52
    invoke-static {p0}, Landroidx/webkit/internal/ApiHelperForN;->isRedirect(Landroid/webkit/WebResourceRequest;)Z

    move-result v1

    return v1

    .line 53
    :cond_0
    invoke-virtual {v0}, Landroidx/webkit/internal/ApiFeature$N;->isSupportedByWebView()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 54
    invoke-static {p0}, Landroidx/webkit/WebResourceRequestCompat;->getAdapter(Landroid/webkit/WebResourceRequest;)Landroidx/webkit/internal/WebResourceRequestAdapter;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/webkit/internal/WebResourceRequestAdapter;->isRedirect()Z

    move-result v1

    return v1

    .line 56
    :cond_1
    invoke-static {}, Landroidx/webkit/internal/WebViewFeatureInternal;->getUnsupportedOperationException()Ljava/lang/UnsupportedOperationException;

    move-result-object v1

    throw v1
.end method
