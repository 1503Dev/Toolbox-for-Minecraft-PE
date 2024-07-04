package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: o04  reason: default package */
public final /* synthetic */ class o04 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object S;

    public /* synthetic */ o04(int i, Object obj, Object obj2, Object obj3) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
        this.S = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.Q;
                ContentValues contentValues = new ContentValues();
                contentValues.put("event_state", (Integer) 1);
                sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{(String) this.R});
                r04.g(sQLiteDatabase, (wv2) this.S);
                return;
            default:
                c16 c16Var = (c16) this.Q;
                c16Var.getClass();
                int i = zn4.a;
                xl5 xl5Var = (xl5) c16Var.b;
                bm5 bm5Var = xl5Var.P;
                int i2 = bm5.X;
                bm5Var.getClass();
                pp5 pp5Var = xl5Var.P.p;
                io5 G = pp5Var.G();
                pp5Var.D(G, 1017, new ja1(G, (cu1) this.R, (ok5) this.S));
                return;
        }
    }
}