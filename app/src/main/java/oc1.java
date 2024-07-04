package defpackage;

import android.util.Log;
import java.util.Date;

/* renamed from: oc1  reason: default package */
public final class oc1 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ String Q;
    public final /* synthetic */ int R;
    public final /* synthetic */ boolean S;
    public final /* synthetic */ nc1 T;

    public oc1(nc1 nc1Var, int i, String str, int i2, boolean z) {
        this.T = nc1Var;
        this.P = i;
        this.Q = str;
        this.R = i2;
        this.S = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String substring;
        String str;
        nc1 nc1Var = this.T;
        int i = this.P;
        String str2 = this.Q;
        int i2 = this.R;
        if (nc1Var.e != null) {
            if (i2 == 3 && nc1.a(nc1Var.a.n(Integer.toString(i)), 3)) {
                me1 me1Var = nc1Var.e;
                synchronized (me1Var) {
                    hc1 hc1Var = new hc1();
                    hc1Var.b = 3;
                    hc1Var.c = me1Var.e;
                    hc1Var.d = str2;
                    if (hc1Var.a == null) {
                        hc1Var.a = new Date(System.currentTimeMillis());
                    }
                    me1Var.c(hc1Var);
                }
            } else if (i2 == 2 && nc1.a(nc1Var.a.n(Integer.toString(i)), 2)) {
                me1 me1Var2 = nc1Var.e;
                synchronized (me1Var2) {
                    hc1 hc1Var2 = new hc1();
                    hc1Var2.b = 2;
                    hc1Var2.c = me1Var2.e;
                    hc1Var2.d = str2;
                    if (hc1Var2.a == null) {
                        hc1Var2.a = new Date(System.currentTimeMillis());
                    }
                    me1Var2.c(hc1Var2);
                }
            } else if (i2 == 1 && nc1.a(nc1Var.a.n(Integer.toString(i)), 1)) {
                me1 me1Var3 = nc1Var.e;
                synchronized (me1Var3) {
                    hc1 hc1Var3 = new hc1();
                    hc1Var3.b = 1;
                    hc1Var3.c = me1Var3.e;
                    hc1Var3.d = str2;
                    if (hc1Var3.a == null) {
                        hc1Var3.a = new Date(System.currentTimeMillis());
                    }
                    me1Var3.c(hc1Var3);
                }
            } else if (i2 == 0 && nc1.a(nc1Var.a.n(Integer.toString(i)), 0)) {
                me1 me1Var4 = nc1Var.e;
                synchronized (me1Var4) {
                    hc1 hc1Var4 = new hc1();
                    hc1Var4.b = 0;
                    hc1Var4.c = me1Var4.e;
                    hc1Var4.d = str2;
                    if (hc1Var4.a == null) {
                        hc1Var4.a = new Date(System.currentTimeMillis());
                    }
                    me1Var4.c(hc1Var4);
                }
            }
        }
        int i3 = 0;
        while (i3 <= this.Q.length() / 4000) {
            int i4 = i3 * 4000;
            i3++;
            int min = Math.min(i3 * 4000, this.Q.length());
            if (this.R == 3 && nc1.b(this.T.a.n(Integer.toString(this.P)), 3, this.S)) {
                Log.d("AdColony [TRACE]", this.Q.substring(i4, min));
            } else if (this.R == 2 && nc1.b(this.T.a.n(Integer.toString(this.P)), 2, this.S)) {
                Log.i("AdColony [INFO]", this.Q.substring(i4, min));
            } else if (this.R == 1 && nc1.b(this.T.a.n(Integer.toString(this.P)), 1, this.S)) {
                Log.w("AdColony [WARNING]", this.Q.substring(i4, min));
            } else {
                if (this.R == 0 && nc1.b(this.T.a.n(Integer.toString(this.P)), 0, this.S)) {
                    substring = this.Q.substring(i4, min);
                    str = "AdColony [ERROR]";
                } else if (this.R == -1 && nc1.g >= -1) {
                    substring = this.Q.substring(i4, min);
                    str = "AdColony [FATAL]";
                }
                Log.e(str, substring);
            }
        }
    }
}