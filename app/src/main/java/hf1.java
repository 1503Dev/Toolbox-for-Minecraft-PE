package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import defpackage.ad1;
import org.json.JSONException;

/* renamed from: hf1  reason: default package */
public final class hf1 implements Runnable {
    public final /* synthetic */ ic1 P;
    public final /* synthetic */ nf1 Q;
    public final /* synthetic */ Context R;
    public final /* synthetic */ if1 S;

    public hf1(if1 if1Var, ic1 ic1Var, ad1.n nVar, Context context) {
        this.S = if1Var;
        this.P = ic1Var;
        this.Q = nVar;
        this.R = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ud1 ud1Var;
        boolean z;
        try {
            ud1Var = new ud1(this.P);
        } catch (JSONException unused) {
            ud1Var = null;
        }
        if (ud1Var != null) {
            if1 if1Var = this.S;
            nf1 nf1Var = this.Q;
            Context context = this.R;
            synchronized (if1Var) {
                try {
                    SQLiteDatabase sQLiteDatabase = if1Var.b;
                    if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                        if1Var.b = context.openOrCreateDatabase("adc_events_db", 0, null);
                    }
                    if (if1Var.b.needUpgrade(ud1Var.a)) {
                        if (if1Var.d(ud1Var) && if1Var.d != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if1Var.c = z;
                        if (z) {
                            ((ad1.l) if1Var.d).getClass();
                            yd1.c().d = false;
                        }
                    } else {
                        if1Var.c = true;
                    }
                    if (if1Var.c) {
                        nf1Var.a(ud1Var);
                    }
                } catch (SQLiteException e) {
                    ga1.h().n().d(0, 1, "Database cannot be opened" + e.toString(), true);
                }
            }
        }
    }
}