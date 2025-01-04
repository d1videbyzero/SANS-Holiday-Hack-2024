.class public final Lcom/northpole/santaswipe/MainActivity;
.super Landroidx/activity/ComponentActivity;
.source "MainActivity.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/northpole/santaswipe/MainActivity$WebAppInterface;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\nH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/northpole/santaswipe/MainActivity;",
        "Landroidx/activity/ComponentActivity;",
        "()V",
        "database",
        "Landroid/database/sqlite/SQLiteDatabase;",
        "myWebView",
        "Landroid/webkit/WebView;",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "WebAppInterface",
        "app_debug"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private database:Landroid/database/sqlite/SQLiteDatabase;

.field private myWebView:Landroid/webkit/WebView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Lcom/northpole/santaswipe/MainActivity;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Landroidx/activity/ComponentActivity;-><init>()V

    return-void
.end method

.method public static final synthetic access$getDatabase$p(Lcom/northpole/santaswipe/MainActivity;)Landroid/database/sqlite/SQLiteDatabase;
    .locals 1
    .param p0, "$this"    # Lcom/northpole/santaswipe/MainActivity;

    .line 13
    iget-object v0, p0, Lcom/northpole/santaswipe/MainActivity;->database:Landroid/database/sqlite/SQLiteDatabase;

    return-object v0
.end method

.method public static final synthetic access$getMyWebView$p(Lcom/northpole/santaswipe/MainActivity;)Landroid/webkit/WebView;
    .locals 1
    .param p0, "$this"    # Lcom/northpole/santaswipe/MainActivity;

    .line 13
    iget-object v0, p0, Lcom/northpole/santaswipe/MainActivity;->myWebView:Landroid/webkit/WebView;

    return-object v0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 7
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 19
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 20
    sget v0, Lcom/northpole/santaswipe/R$layout;->activity_main:I

    invoke-virtual {p0, v0}, Lcom/northpole/santaswipe/MainActivity;->setContentView(I)V

    .line 23
    new-instance v0, Lcom/northpole/santaswipe/DatabaseHelper;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/northpole/santaswipe/DatabaseHelper;-><init>(Landroid/content/Context;)V

    .line 24
    .local v0, "dbHelper":Lcom/northpole/santaswipe/DatabaseHelper;
    invoke-virtual {v0}, Lcom/northpole/santaswipe/DatabaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "getWritableDatabase(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/northpole/santaswipe/MainActivity;->database:Landroid/database/sqlite/SQLiteDatabase;

    .line 27
    sget v1, Lcom/northpole/santaswipe/R$id;->webview:I

    invoke-virtual {p0, v1}, Lcom/northpole/santaswipe/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const-string v2, "findViewById(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/webkit/WebView;

    iput-object v1, p0, Lcom/northpole/santaswipe/MainActivity;->myWebView:Landroid/webkit/WebView;

    .line 28
    iget-object v1, p0, Lcom/northpole/santaswipe/MainActivity;->myWebView:Landroid/webkit/WebView;

    const/4 v2, 0x0

    const-string v3, "myWebView"

    if-nez v1, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v2

    :cond_0
    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    const/4 v4, 0x1

    invoke-virtual {v1, v4}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 31
    new-instance v1, Landroidx/webkit/WebViewAssetLoader$Builder;

    invoke-direct {v1}, Landroidx/webkit/WebViewAssetLoader$Builder;-><init>()V

    .line 32
    new-instance v4, Landroidx/webkit/WebViewAssetLoader$AssetsPathHandler;

    move-object v5, p0

    check-cast v5, Landroid/content/Context;

    invoke-direct {v4, v5}, Landroidx/webkit/WebViewAssetLoader$AssetsPathHandler;-><init>(Landroid/content/Context;)V

    check-cast v4, Landroidx/webkit/WebViewAssetLoader$PathHandler;

    const-string v5, "/assets/"

    invoke-virtual {v1, v5, v4}, Landroidx/webkit/WebViewAssetLoader$Builder;->addPathHandler(Ljava/lang/String;Landroidx/webkit/WebViewAssetLoader$PathHandler;)Landroidx/webkit/WebViewAssetLoader$Builder;

    move-result-object v1

    .line 33
    new-instance v4, Landroidx/webkit/WebViewAssetLoader$ResourcesPathHandler;

    move-object v5, p0

    check-cast v5, Landroid/content/Context;

    invoke-direct {v4, v5}, Landroidx/webkit/WebViewAssetLoader$ResourcesPathHandler;-><init>(Landroid/content/Context;)V

    check-cast v4, Landroidx/webkit/WebViewAssetLoader$PathHandler;

    const-string v5, "/res/"

    invoke-virtual {v1, v5, v4}, Landroidx/webkit/WebViewAssetLoader$Builder;->addPathHandler(Ljava/lang/String;Landroidx/webkit/WebViewAssetLoader$PathHandler;)Landroidx/webkit/WebViewAssetLoader$Builder;

    move-result-object v1

    .line 34
    invoke-virtual {v1}, Landroidx/webkit/WebViewAssetLoader$Builder;->build()Landroidx/webkit/WebViewAssetLoader;

    move-result-object v1

    const-string v4, "build(...)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    nop

    .line 37
    .local v1, "assetLoader":Landroidx/webkit/WebViewAssetLoader;
    iget-object v4, p0, Lcom/northpole/santaswipe/MainActivity;->myWebView:Landroid/webkit/WebView;

    if-nez v4, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v4, v2

    :cond_1
    new-instance v5, Lcom/northpole/santaswipe/MainActivity$onCreate$1;

    invoke-direct {v5, v1}, Lcom/northpole/santaswipe/MainActivity$onCreate$1;-><init>(Landroidx/webkit/WebViewAssetLoader;)V

    check-cast v5, Landroid/webkit/WebViewClient;

    invoke-virtual {v4, v5}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 42
    iget-object v4, p0, Lcom/northpole/santaswipe/MainActivity;->myWebView:Landroid/webkit/WebView;

    if-nez v4, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v4, v2

    :cond_2
    new-instance v5, Lcom/northpole/santaswipe/MainActivity$WebAppInterface;

    invoke-direct {v5, p0}, Lcom/northpole/santaswipe/MainActivity$WebAppInterface;-><init>(Lcom/northpole/santaswipe/MainActivity;)V

    const-string v6, "Android"

    invoke-virtual {v4, v5, v6}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    iget-object v4, p0, Lcom/northpole/santaswipe/MainActivity;->myWebView:Landroid/webkit/WebView;

    if-nez v4, :cond_3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object v2, v4

    :goto_0
    const-string v3, "https://appassets.androidplatform.net/assets/index.html"

    invoke-virtual {v2, v3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 46
    return-void
.end method
