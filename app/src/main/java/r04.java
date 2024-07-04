package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: r04  reason: default package */
public final class r04 extends SQLiteOpenHelper {
    public static final /* synthetic */ int R = 0;
    public final Context P;
    public final ez4 Q;

    public r04(Context context, yw2 yw2Var) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) w82.d.c.a(x92.a7)).intValue());
        this.P = context;
        this.Q = yw2Var;
    }

    public static void g(SQLiteDatabase sQLiteDatabase, wv2 wv2Var) {
        sQLiteDatabase.beginTransaction();
        try {
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{"url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex("url");
                if (columnIndex != -1) {
                    strArr[i] = query.getString(columnIndex);
                }
                i++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            for (int i2 = 0; i2 < count; i2++) {
                wv2Var.m(strArr[i2]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public final void a(s04 s04Var) {
        d(new vi1(3, this, s04Var));
    }

    public final void d(bl4 bl4Var) {
        zw4.J(this.Q.b(new n04(0, this)), new q04(bl4Var), this.Q);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }
}