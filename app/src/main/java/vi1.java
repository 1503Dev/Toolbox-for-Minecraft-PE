package defpackage;

import android.app.AlertDialog;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.RemoteException;

/* renamed from: vi1  reason: default package */
public final class vi1 implements wy4, bl4, h23, v64 {
    public final /* synthetic */ int P;
    public Object Q;
    public Object R;

    public vi1() {
        this.P = 5;
    }

    @Override // defpackage.h23
    public final void d(boolean z) {
        y03 y03Var = (y03) this.R;
        ((uq3) this.Q).b();
        y03Var.l0();
        y03Var.R().n();
    }

    @Override // defpackage.bl4
    public final Object e(Object obj) {
        r04 r04Var = (r04) this.Q;
        s04 s04Var = (s04) this.R;
        r04Var.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(s04Var.a));
        contentValues.put("gws_query_id", s04Var.b);
        contentValues.put("url", s04Var.c);
        contentValues.put("event_state", Integer.valueOf(s04Var.d - 1));
        ((SQLiteDatabase) obj).insert("offline_buffered_pings", null, contentValues);
        cu5 cu5Var = jv5.A.c;
        co2 D = cu5.D(r04Var.P);
        if (D != null) {
            try {
                D.zze(new va0(r04Var.P));
            } catch (RemoteException e) {
                vz3.l("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }

    @Override // defpackage.v64
    /* renamed from: e */
    public final void mo5e(Object obj) {
        jo5 jo5Var = (jo5) obj;
    }

    @Override // defpackage.wy4
    public final void f(Object obj) {
        switch (this.P) {
            case 1:
                y03 y03Var = (y03) obj;
                nl3 nl3Var = ((jl3) this.R).j;
                synchronized (nl3Var) {
                    nl3Var.k = y03Var;
                }
                ((jl3) this.R).s((String) this.Q, true);
                ((jl3) this.R).F.h(Boolean.TRUE);
                return;
            default:
                ((ut3) obj).Y = true;
                ((qu3) this.R).R.e((String) this.Q);
                return;
        }
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
    }

    public /* synthetic */ vi1(int i, Object obj, Object obj2) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
    }

    public vi1(xi1 xi1Var, AlertDialog alertDialog) {
        this.P = 0;
        this.R = xi1Var;
        this.Q = alertDialog;
    }

    public vi1(jl3 jl3Var) {
        this.P = 1;
        this.R = jl3Var;
        this.Q = "Google";
    }

    public vi1(qu3 qu3Var, String str) {
        this.P = 2;
        this.R = qu3Var;
        this.Q = str;
    }
}