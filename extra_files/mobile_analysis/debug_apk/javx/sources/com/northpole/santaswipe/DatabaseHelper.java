package com.northpole.santaswipe;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DatabaseHelper.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u000e"}, d2 = {"Lcom/northpole/santaswipe/DatabaseHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "onCreate", "", "db", "Landroid/database/sqlite/SQLiteDatabase;", "onUpgrade", "oldVersion", "", "newVersion", "Companion", "app_debug"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DatabaseHelper extends SQLiteOpenHelper {
    public static final int $stable = 0;
    private static final String DATABASE_NAME = "naughtynicelist.db";
    private static final int DATABASE_VERSION = 3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 3);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.execSQL("CREATE TABLE IF NOT EXISTS NiceList (Item TEXT);");
        db.execSQL("CREATE TABLE IF NOT EXISTS NaughtyList (Item TEXT);");
        db.execSQL("CREATE TABLE IF NOT EXISTS NormalList (Item TEXT);");
        db.execSQL("DELETE FROM NiceList;");
        db.execSQL("DELETE FROM NaughtyList;");
        db.execSQL("DELETE FROM NormalList;");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Carlos, Madrid, Spain');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Aiko, Tokyo, Japan');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Maria, Rio de Janeiro, Brazil');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Liam, Dublin, Ireland');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Emma, New York, USA');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Chen, Beijing, China');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Fatima, Casablanca, Morocco');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Hans, Berlin, Germany');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Olga, Moscow, Russia');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Ravi, Mumbai, India');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Amelia, Sydney, Australia');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Juan, Buenos Aires, Argentina');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Sofia, Rome, Italy');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Ahmed, Cairo, Egypt');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Yuna, Seoul, South Korea');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Ellie, Alabama, USA');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Lucas, Paris, France');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Mia, Toronto, Canada');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Sara, Stockholm, Sweden');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Ali, Tehran, Iran');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Nina, Lima, Peru');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Anna, Vienna, Austria');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Leo, Helsinki, Finland');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Elena, Athens, Greece');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Davi, Sao Paulo, Brazil');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Marta, Warsaw, Poland');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Noah, Zurich, Switzerland');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Ibrahim, Ankara, Turkey');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Emily, Wellington, New Zealand');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Omar, Oslo, Norway');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Fatou, Dakar, Senegal');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Olivia, Vancouver, Canada');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Ethan, Cape Town, South Africa');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Santiago, Bogota, Colombia');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Isabella, Barcelona, Spain');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Ming, Shanghai, China');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Chloe, Singapore, Singapore');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Mohammed, Dubai, UAE');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Ava, Melbourne, Australia');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Luca, Milan, Italy');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Sakura, Kyoto, Japan');");
        db.execSQL("INSERT INTO NormalList (Item) VALUES ('Edward, New Jersey, USA');");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.execSQL("DROP TABLE IF EXISTS NiceList");
        db.execSQL("DROP TABLE IF EXISTS NaughtyList");
        db.execSQL("DROP TABLE IF EXISTS NormalList");
        onCreate(db);
    }
}
