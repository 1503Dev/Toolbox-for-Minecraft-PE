package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

/* renamed from: l04  reason: default package */
public final class l04 {
    public final j52 a;
    public final Context b;
    public final xv2 c;
    public final String d;
    public final wl4 e;
    public final nl5 f = jv5.A.g.b();

    public l04(Context context, xv2 xv2Var, j52 j52Var, ez3 ez3Var, String str, wl4 wl4Var) {
        this.b = context;
        this.c = xv2Var;
        this.a = j52Var;
        this.d = str;
        this.e = wl4Var;
    }

    public static final void a(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j72 j72Var = (j72) arrayList.get(i);
            if (j72Var.V() == 2 && j72Var.C() > j) {
                j = j72Var.C();
            }
        }
        if (j != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }
}