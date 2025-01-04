package com.northpole.santaswipe;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.activity.ComponentActivity;
import androidx.webkit.WebViewAssetLoader;
import com.northpole.santaswipe.MainActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/northpole/santaswipe/MainActivity;", "Landroidx/activity/ComponentActivity;", "()V", "database", "Landroid/database/sqlite/SQLiteDatabase;", "myWebView", "Landroid/webkit/WebView;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "WebAppInterface", "app_debug"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MainActivity extends ComponentActivity {
    public static final int $stable = 8;
    private SQLiteDatabase database;
    private WebView myWebView;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatabaseHelper dbHelper = new DatabaseHelper(this);
        SQLiteDatabase writableDatabase = dbHelper.getWritableDatabase();
        Intrinsics.checkNotNullExpressionValue(writableDatabase, "getWritableDatabase(...)");
        this.database = writableDatabase;
        View findViewById = findViewById(R.id.webview);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.myWebView = (WebView) findViewById;
        WebView webView = this.myWebView;
        WebView webView2 = null;
        if (webView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myWebView");
            webView = null;
        }
        webView.getSettings().setJavaScriptEnabled(true);
        final WebViewAssetLoader assetLoader = new WebViewAssetLoader.Builder().addPathHandler("/assets/", new WebViewAssetLoader.AssetsPathHandler(this)).addPathHandler("/res/", new WebViewAssetLoader.ResourcesPathHandler(this)).build();
        Intrinsics.checkNotNullExpressionValue(assetLoader, "build(...)");
        WebView webView3 = this.myWebView;
        if (webView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myWebView");
            webView3 = null;
        }
        webView3.setWebViewClient(new WebViewClient() { // from class: com.northpole.santaswipe.MainActivity$onCreate$1
            @Override // android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(url, "url");
                return WebViewAssetLoader.this.shouldInterceptRequest(Uri.parse(url));
            }
        });
        WebView webView4 = this.myWebView;
        if (webView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myWebView");
            webView4 = null;
        }
        webView4.addJavascriptInterface(new WebAppInterface(), "Android");
        WebView webView5 = this.myWebView;
        if (webView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myWebView");
        } else {
            webView2 = webView5;
        }
        webView2.loadUrl("https://appassets.androidplatform.net/assets/index.html");
    }

    /* compiled from: MainActivity.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\u0004H\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\f"}, d2 = {"Lcom/northpole/santaswipe/MainActivity$WebAppInterface;", "", "(Lcom/northpole/santaswipe/MainActivity;)V", "addToNaughtyList", "", "item", "", "addToNiceList", "getNaughtyList", "getNiceList", "getNormalList", "removeFromAllLists", "app_debug"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class WebAppInterface {
        public WebAppInterface() {
        }

        @JavascriptInterface
        public final void addToNiceList(String item) {
            Intrinsics.checkNotNullParameter(item, "item");
            try {
                removeFromAllLists(item);
                SQLiteDatabase sQLiteDatabase = MainActivity.this.database;
                if (sQLiteDatabase == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("database");
                    sQLiteDatabase = null;
                }
                sQLiteDatabase.execSQL("INSERT INTO NiceList (Item) VALUES ('" + item + "');");
            } catch (Exception e) {
                Log.e("WebAppInterface", "Error adding to NiceList: " + e.getMessage());
            }
        }

        @JavascriptInterface
        public final void addToNaughtyList(String item) {
            Intrinsics.checkNotNullParameter(item, "item");
            try {
                removeFromAllLists(item);
                SQLiteDatabase sQLiteDatabase = MainActivity.this.database;
                if (sQLiteDatabase == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("database");
                    sQLiteDatabase = null;
                }
                sQLiteDatabase.execSQL("INSERT INTO NaughtyList (Item) VALUES ('" + item + "');");
            } catch (Exception e) {
                Log.e("WebAppInterface", "Error adding to NaughtyList: " + e.getMessage());
            }
        }

        @JavascriptInterface
        public final void getNormalList() {
            final String jsonItems;
            try {
                SQLiteDatabase sQLiteDatabase = MainActivity.this.database;
                if (sQLiteDatabase == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("database");
                    sQLiteDatabase = null;
                }
                Cursor cursor = sQLiteDatabase.rawQuery("SELECT Item FROM NormalList WHERE Item NOT LIKE '%Ellie%'", null);
                List items = new ArrayList();
                Log.d("WebAppInterface", "Fetching items from NormalList table");
                while (cursor.moveToNext()) {
                    String item = cursor.getString(0);
                    Intrinsics.checkNotNull(item);
                    items.add(item);
                    Log.d("WebAppInterface", "Fetched item: " + item);
                }
                cursor.close();
                if (items.isEmpty()) {
                    jsonItems = "[]";
                } else {
                    jsonItems = CollectionsKt.joinToString$default(items, "\",\"", "[\"", "\"]", 0, null, null, 56, null);
                }
                MainActivity mainActivity = MainActivity.this;
                final MainActivity mainActivity2 = MainActivity.this;
                mainActivity.runOnUiThread(new Runnable() { // from class: com.northpole.santaswipe.MainActivity$WebAppInterface$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        MainActivity.WebAppInterface.getNormalList$lambda$0(jsonItems, mainActivity2);
                    }
                });
            } catch (Exception e) {
                Log.e("WebAppInterface", "Error fetching NormalList: " + e.getMessage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void getNormalList$lambda$0(String jsonItems, MainActivity this$0) {
            Intrinsics.checkNotNullParameter(jsonItems, "$jsonItems");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Log.d("WebAppInterface", "Passing items to JavaScript: " + jsonItems);
            WebView webView = this$0.myWebView;
            if (webView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("myWebView");
                webView = null;
            }
            webView.evaluateJavascript("displayList(" + jsonItems + ");", null);
        }

        @JavascriptInterface
        public final void getNiceList() {
            final String jsonItems;
            try {
                SQLiteDatabase sQLiteDatabase = MainActivity.this.database;
                if (sQLiteDatabase == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("database");
                    sQLiteDatabase = null;
                }
                Cursor cursor = sQLiteDatabase.rawQuery("SELECT Item FROM NiceList", null);
                List items = new ArrayList();
                while (cursor.moveToNext()) {
                    String string = cursor.getString(0);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    items.add(string);
                }
                cursor.close();
                if (items.isEmpty()) {
                    jsonItems = "[]";
                } else {
                    jsonItems = CollectionsKt.joinToString$default(items, "\",\"", "[\"", "\"]", 0, null, null, 56, null);
                }
                MainActivity mainActivity = MainActivity.this;
                final MainActivity mainActivity2 = MainActivity.this;
                mainActivity.runOnUiThread(new Runnable() { // from class: com.northpole.santaswipe.MainActivity$WebAppInterface$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        MainActivity.WebAppInterface.getNiceList$lambda$1(jsonItems, mainActivity2);
                    }
                });
            } catch (Exception e) {
                Log.e("WebAppInterface", "Error fetching NiceList: " + e.getMessage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void getNiceList$lambda$1(String jsonItems, MainActivity this$0) {
            Intrinsics.checkNotNullParameter(jsonItems, "$jsonItems");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Log.d("WebAppInterface", "Passing items to JavaScript: " + jsonItems);
            WebView webView = this$0.myWebView;
            if (webView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("myWebView");
                webView = null;
            }
            webView.evaluateJavascript("displayList(" + jsonItems + ");", null);
        }

        @JavascriptInterface
        public final void getNaughtyList() {
            final String jsonItems;
            try {
                SQLiteDatabase sQLiteDatabase = MainActivity.this.database;
                if (sQLiteDatabase == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("database");
                    sQLiteDatabase = null;
                }
                Cursor cursor = sQLiteDatabase.rawQuery("SELECT Item FROM NaughtyList", null);
                List items = new ArrayList();
                while (cursor.moveToNext()) {
                    String string = cursor.getString(0);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    items.add(string);
                }
                cursor.close();
                if (items.isEmpty()) {
                    jsonItems = "[]";
                } else {
                    jsonItems = CollectionsKt.joinToString$default(items, "\",\"", "[\"", "\"]", 0, null, null, 56, null);
                }
                MainActivity mainActivity = MainActivity.this;
                final MainActivity mainActivity2 = MainActivity.this;
                mainActivity.runOnUiThread(new Runnable() { // from class: com.northpole.santaswipe.MainActivity$WebAppInterface$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        MainActivity.WebAppInterface.getNaughtyList$lambda$2(jsonItems, mainActivity2);
                    }
                });
            } catch (Exception e) {
                Log.e("WebAppInterface", "Error fetching NaughtyList: " + e.getMessage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void getNaughtyList$lambda$2(String jsonItems, MainActivity this$0) {
            Intrinsics.checkNotNullParameter(jsonItems, "$jsonItems");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Log.d("WebAppInterface", "Passing items to JavaScript: " + jsonItems);
            WebView webView = this$0.myWebView;
            if (webView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("myWebView");
                webView = null;
            }
            webView.evaluateJavascript("displayList(" + jsonItems + ");", null);
        }

        private final void removeFromAllLists(String item) {
            try {
                SQLiteDatabase sQLiteDatabase = MainActivity.this.database;
                SQLiteDatabase sQLiteDatabase2 = null;
                if (sQLiteDatabase == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("database");
                    sQLiteDatabase = null;
                }
                sQLiteDatabase.execSQL("DELETE FROM NiceList WHERE Item = '" + item + "';");
                SQLiteDatabase sQLiteDatabase3 = MainActivity.this.database;
                if (sQLiteDatabase3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("database");
                    sQLiteDatabase3 = null;
                }
                sQLiteDatabase3.execSQL("DELETE FROM NaughtyList WHERE Item = '" + item + "';");
                SQLiteDatabase sQLiteDatabase4 = MainActivity.this.database;
                if (sQLiteDatabase4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("database");
                } else {
                    sQLiteDatabase2 = sQLiteDatabase4;
                }
                sQLiteDatabase2.execSQL("DELETE FROM NormalList WHERE Item = '" + item + "';");
            } catch (Exception e) {
                Log.e("WebAppInterface", "Error removing item from all lists: " + e.getMessage());
            }
        }
    }
}
