package com.northpole.santaswipe;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\u0012\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/northpole/santaswipe/MainActivity;", "Landroidx/activity/ComponentActivity;", "()V", "database", "Landroid/database/sqlite/SQLiteDatabase;", "myWebView", "Landroid/webkit/WebView;", "secretKey", "Ljavax/crypto/SecretKey;", "staticIv", "", "initializeDatabase", "", "initializeEncryption", "initializeWebView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "WebAppInterface", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MainActivity extends ComponentActivity {
    public static final int $stable = 8;
    private SQLiteDatabase database;
    private WebView myWebView;
    private SecretKey secretKey;
    private byte[] staticIv;

    private final void initializeEncryption() {
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            String string = getString(R.string.iv);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            byte[] decode = Base64.decode(StringsKt.trim((CharSequence) string).toString(), 0);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
            this.staticIv = decode;
            String string2 = getString(R.string.ek);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            byte[] decode2 = Base64.decode(StringsKt.trim((CharSequence) string2).toString(), 0);
            this.secretKey = new SecretKeySpec(decode2, 0, decode2.length, "AES");
            initializeDatabase();
            initializeWebView();
            initializeEncryption();
        } catch (IllegalArgumentException e) {
            Log.e("MainActivity", "Error during initialization: " + e.getMessage());
        }
    }

    private final void initializeDatabase() {
        SQLiteDatabase writableDatabase = new DatabaseHelper(this).getWritableDatabase();
        Intrinsics.checkNotNullExpressionValue(writableDatabase, "getWritableDatabase(...)");
        this.database = writableDatabase;
    }

    private final void initializeWebView() {
        View findViewById = findViewById(R.id.webview);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        WebView webView = (WebView) findViewById;
        this.myWebView = webView;
        WebView webView2 = null;
        if (webView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myWebView");
            webView = null;
        }
        webView.getSettings().setJavaScriptEnabled(true);
        MainActivity mainActivity = this;
        final WebViewAssetLoader build = new WebViewAssetLoader.Builder().addPathHandler("/assets/", new WebViewAssetLoader.AssetsPathHandler(mainActivity)).addPathHandler("/res/", new WebViewAssetLoader.ResourcesPathHandler(mainActivity)).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        WebView webView3 = this.myWebView;
        if (webView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myWebView");
            webView3 = null;
        }
        webView3.setWebViewClient(new WebViewClient() { // from class: com.northpole.santaswipe.MainActivity$initializeWebView$1
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
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0007J\b\u0010\r\u001a\u00020\u0004H\u0007J\b\u0010\u000e\u001a\u00020\u0004H\u0007J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0010"}, d2 = {"Lcom/northpole/santaswipe/MainActivity$WebAppInterface;", "", "(Lcom/northpole/santaswipe/MainActivity;)V", "addToNaughtyList", "", "item", "", "addToNiceList", "decryptData", "encryptedData", "encryptData", "data", "getNaughtyList", "getNiceList", "getNormalList", "removeFromAllLists", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class WebAppInterface {
        public WebAppInterface() {
        }

        @JavascriptInterface
        public final void addToNiceList(String item) {
            Intrinsics.checkNotNullParameter(item, "item");
            try {
                String encryptData = encryptData(item);
                removeFromAllLists(encryptData);
                String obj = StringsKt.trim((CharSequence) encryptData).toString();
                SQLiteDatabase sQLiteDatabase = MainActivity.this.database;
                if (sQLiteDatabase == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("database");
                    sQLiteDatabase = null;
                }
                sQLiteDatabase.execSQL("INSERT INTO NiceList (Item) VALUES ('" + obj + "');");
            } catch (Exception unused) {
            }
        }

        @JavascriptInterface
        public final void addToNaughtyList(String item) {
            Intrinsics.checkNotNullParameter(item, "item");
            try {
                String encryptData = encryptData(item);
                removeFromAllLists(encryptData);
                String obj = StringsKt.trim((CharSequence) encryptData).toString();
                SQLiteDatabase sQLiteDatabase = MainActivity.this.database;
                if (sQLiteDatabase == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("database");
                    sQLiteDatabase = null;
                }
                sQLiteDatabase.execSQL("INSERT INTO NaughtyList (Item) VALUES ('" + obj + "');");
            } catch (Exception unused) {
            }
        }

        @JavascriptInterface
        public final void getNormalList() {
            try {
                SQLiteDatabase sQLiteDatabase = MainActivity.this.database;
                if (sQLiteDatabase == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("database");
                    sQLiteDatabase = null;
                }
                Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT Item FROM NormalList", null);
                ArrayList arrayList = new ArrayList();
                while (rawQuery.moveToNext()) {
                    String string = rawQuery.getString(0);
                    Intrinsics.checkNotNull(string);
                    String decryptData = decryptData(string);
                    if (decryptData != null) {
                        arrayList.add(decryptData);
                    }
                }
                rawQuery.close();
                final String joinToString$default = arrayList.isEmpty() ? "[]" : CollectionsKt.joinToString$default(arrayList, "\",\"", "[\"", "\"]", 0, null, null, 56, null);
                final MainActivity mainActivity = MainActivity.this;
                mainActivity.runOnUiThread(new Runnable() { // from class: com.northpole.santaswipe.MainActivity$WebAppInterface$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        MainActivity.WebAppInterface.getNormalList$lambda$0(MainActivity.this, joinToString$default);
                    }
                });
            } catch (Exception unused) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void getNormalList$lambda$0(MainActivity this$0, String jsonItems) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(jsonItems, "$jsonItems");
            WebView webView = this$0.myWebView;
            if (webView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("myWebView");
                webView = null;
            }
            webView.evaluateJavascript("displayList(" + jsonItems + ");", null);
        }

        @JavascriptInterface
        public final void getNiceList() {
            try {
                SQLiteDatabase sQLiteDatabase = MainActivity.this.database;
                if (sQLiteDatabase == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("database");
                    sQLiteDatabase = null;
                }
                Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT Item FROM NiceList", null);
                ArrayList arrayList = new ArrayList();
                while (rawQuery.moveToNext()) {
                    String string = rawQuery.getString(0);
                    Intrinsics.checkNotNull(string);
                    String decryptData = decryptData(string);
                    if (decryptData != null) {
                        arrayList.add(decryptData);
                    }
                }
                rawQuery.close();
                final String joinToString$default = arrayList.isEmpty() ? "[]" : CollectionsKt.joinToString$default(arrayList, "\",\"", "[\"", "\"]", 0, null, null, 56, null);
                final MainActivity mainActivity = MainActivity.this;
                mainActivity.runOnUiThread(new Runnable() { // from class: com.northpole.santaswipe.MainActivity$WebAppInterface$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        MainActivity.WebAppInterface.getNiceList$lambda$1(MainActivity.this, joinToString$default);
                    }
                });
            } catch (Exception unused) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void getNiceList$lambda$1(MainActivity this$0, String jsonItems) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(jsonItems, "$jsonItems");
            WebView webView = this$0.myWebView;
            if (webView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("myWebView");
                webView = null;
            }
            webView.evaluateJavascript("displayList(" + jsonItems + ");", null);
        }

        @JavascriptInterface
        public final void getNaughtyList() {
            try {
                SQLiteDatabase sQLiteDatabase = MainActivity.this.database;
                if (sQLiteDatabase == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("database");
                    sQLiteDatabase = null;
                }
                Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT Item FROM NaughtyList", null);
                ArrayList arrayList = new ArrayList();
                while (rawQuery.moveToNext()) {
                    String string = rawQuery.getString(0);
                    Intrinsics.checkNotNull(string);
                    String decryptData = decryptData(string);
                    if (decryptData != null) {
                        arrayList.add(decryptData);
                    }
                }
                rawQuery.close();
                final String joinToString$default = arrayList.isEmpty() ? "[]" : CollectionsKt.joinToString$default(arrayList, "\",\"", "[\"", "\"]", 0, null, null, 56, null);
                final MainActivity mainActivity = MainActivity.this;
                mainActivity.runOnUiThread(new Runnable() { // from class: com.northpole.santaswipe.MainActivity$WebAppInterface$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        MainActivity.WebAppInterface.getNaughtyList$lambda$2(MainActivity.this, joinToString$default);
                    }
                });
            } catch (Exception unused) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void getNaughtyList$lambda$2(MainActivity this$0, String jsonItems) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(jsonItems, "$jsonItems");
            WebView webView = this$0.myWebView;
            if (webView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("myWebView");
                webView = null;
            }
            webView.evaluateJavascript("displayList(" + jsonItems + ");", null);
        }

        private final String encryptData(String data) {
            try {
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                byte[] bArr = MainActivity.this.staticIv;
                SecretKey secretKey = null;
                if (bArr == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("staticIv");
                    bArr = null;
                }
                GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr);
                SecretKey secretKey2 = MainActivity.this.secretKey;
                if (secretKey2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("secretKey");
                } else {
                    secretKey = secretKey2;
                }
                cipher.init(1, secretKey, gCMParameterSpec);
                byte[] bytes = data.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                String encodeToString = Base64.encodeToString(cipher.doFinal(bytes), 0);
                Intrinsics.checkNotNull(encodeToString);
                return encodeToString;
            } catch (Exception e) {
                Log.e("WebAppInterface", "Encryption failed: " + e.getMessage());
                return "";
            }
        }

        private final String decryptData(String encryptedData) {
            try {
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                byte[] bArr = MainActivity.this.staticIv;
                if (bArr == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("staticIv");
                    bArr = null;
                }
                GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr);
                SecretKey secretKey = MainActivity.this.secretKey;
                if (secretKey == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("secretKey");
                    secretKey = null;
                }
                cipher.init(2, secretKey, gCMParameterSpec);
                byte[] doFinal = cipher.doFinal(Base64.decode(encryptedData, 0));
                Intrinsics.checkNotNull(doFinal);
                return new String(doFinal, Charsets.UTF_8);
            } catch (Exception unused) {
                return null;
            }
        }

        private final void removeFromAllLists(String item) {
            try {
                String obj = StringsKt.trim((CharSequence) item).toString();
                SQLiteDatabase sQLiteDatabase = MainActivity.this.database;
                SQLiteDatabase sQLiteDatabase2 = null;
                if (sQLiteDatabase == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("database");
                    sQLiteDatabase = null;
                }
                SQLiteStatement compileStatement = sQLiteDatabase.compileStatement("DELETE FROM NiceList WHERE Item=?");
                compileStatement.bindString(1, obj);
                compileStatement.executeUpdateDelete();
                SQLiteDatabase sQLiteDatabase3 = MainActivity.this.database;
                if (sQLiteDatabase3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("database");
                    sQLiteDatabase3 = null;
                }
                SQLiteStatement compileStatement2 = sQLiteDatabase3.compileStatement("DELETE FROM NaughtyList WHERE Item=?");
                compileStatement2.bindString(1, obj);
                compileStatement2.executeUpdateDelete();
                SQLiteDatabase sQLiteDatabase4 = MainActivity.this.database;
                if (sQLiteDatabase4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("database");
                } else {
                    sQLiteDatabase2 = sQLiteDatabase4;
                }
                SQLiteStatement compileStatement3 = sQLiteDatabase2.compileStatement("DELETE FROM NormalList WHERE Item=?");
                compileStatement3.bindString(1, obj);
                compileStatement3.executeUpdateDelete();
            } catch (Exception e) {
                Log.e("WebAppInterface", "Error removing item from all lists: " + e.getMessage());
            }
        }
    }
}
