package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: q04  reason: default package */
public final class q04 implements wy4 {
    public final /* synthetic */ bl4 P;

    public q04(bl4 bl4Var) {
        this.P = bl4Var;
    }

    @Override // defpackage.wy4
    public final /* bridge */ /* synthetic */ void f(Object obj) {
        try {
            this.P.e((SQLiteDatabase) obj);
        } catch (Exception e) {
            sv2.d("Error executing function on offline buffered ping database: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
        sv2.d("Failed to get offline buffered ping database: ".concat(String.valueOf(th.getMessage())));
    }
}