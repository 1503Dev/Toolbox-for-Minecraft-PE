package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;

/* renamed from: h04  reason: default package */
public final class h04 implements pl4 {
    public final hz3 P;
    public final kz3 Q;

    public h04(hz3 hz3Var, kz3 kz3Var) {
        this.P = hz3Var;
        this.Q = kz3Var;
    }

    @Override // defpackage.pl4
    public final void b(ml4 ml4Var, String str) {
        if (((Boolean) w82.d.c.a(x92.f5)).booleanValue() && ml4.RENDERER == ml4Var && this.P.a() != 0) {
            hz3 hz3Var = this.P;
            jv5.A.j.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.P.a();
            synchronized (hz3Var) {
                synchronized (hz3Var.j) {
                    hz3Var.e = elapsedRealtime;
                }
            }
        }
    }

    @Override // defpackage.pl4
    public final void c(String str) {
    }

    @Override // defpackage.pl4
    public final void h(ml4 ml4Var, String str) {
        final long j;
        if (!((Boolean) w82.d.c.a(x92.f5)).booleanValue()) {
            return;
        }
        if (ml4.RENDERER == ml4Var) {
            hz3 hz3Var = this.P;
            jv5.A.j.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            synchronized (hz3Var) {
                synchronized (hz3Var.i) {
                    hz3Var.d = elapsedRealtime;
                }
            }
        } else if (ml4.PRELOADED_LOADER != ml4Var && ml4.SERVER_TRANSACTION != ml4Var) {
        } else {
            hz3 hz3Var2 = this.P;
            jv5.A.j.getClass();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            synchronized (hz3Var2) {
                synchronized (hz3Var2.f) {
                    hz3Var2.a = elapsedRealtime2;
                }
            }
            final kz3 kz3Var = this.Q;
            hz3 hz3Var3 = this.P;
            synchronized (hz3Var3) {
                synchronized (hz3Var3.f) {
                    j = hz3Var3.a;
                }
            }
            ((ez3) kz3Var.Q).a(new bl4() { // from class: jz3
                @Override // defpackage.bl4
                public final Object e(Object obj) {
                    kz3 kz3Var2 = kz3.this;
                    long j2 = j;
                    SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                    if (!((f25) kz3Var2.P).C()) {
                        i72 F = j72.F();
                        F.j();
                        j72.R((j72) F.Q, j2);
                        byte[] D = ((j72) F.h()).D();
                        p5.z(sQLiteDatabase, false, false);
                        p5.w(sQLiteDatabase, j2, D);
                        return null;
                    }
                    return null;
                }
            });
        }
    }

    @Override // defpackage.pl4
    public final void s(ml4 ml4Var, String str, Throwable th) {
        if (((Boolean) w82.d.c.a(x92.f5)).booleanValue() && ml4.RENDERER == ml4Var && this.P.a() != 0) {
            hz3 hz3Var = this.P;
            jv5.A.j.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.P.a();
            synchronized (hz3Var) {
                synchronized (hz3Var.j) {
                    hz3Var.e = elapsedRealtime;
                }
            }
        }
    }
}