package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.Callable;

/* renamed from: o84  reason: default package */
public final /* synthetic */ class o84 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nc4 b;

    public /* synthetic */ o84(nc4 nc4Var, int i) {
        this.a = i;
        this.b = nc4Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        a32 a32Var;
        int i;
        String str;
        String F;
        String str2;
        String str3;
        switch (this.a) {
            case 0:
                p84 p84Var = (p84) this.b;
                return new q84(p84Var.b.j, p84Var.c, p84Var.d.g);
            case 1:
                jv5 jv5Var = jv5.A;
                cu5 cu5Var = jv5Var.c;
                j32 E = jv5Var.g.b().E();
                Bundle bundle = null;
                if (E != null && (!jv5Var.g.b().y() || !jv5Var.g.b().z())) {
                    if (E.Q) {
                        synchronized (E.R) {
                            E.Q = false;
                            E.R.notifyAll();
                            sv2.b("ContentFetchThread: wakeup");
                        }
                    }
                    b32 b32Var = E.S;
                    boolean z = E.e0;
                    synchronized (b32Var.a) {
                        if (b32Var.c.isEmpty()) {
                            sv2.b("Queue empty");
                            a32Var = null;
                        } else if (b32Var.c.size() >= 2) {
                            int i2 = RecyclerView.UNDEFINED_DURATION;
                            a32Var = null;
                            int i3 = 0;
                            int i4 = 0;
                            for (a32 a32Var2 : b32Var.c) {
                                int i5 = a32Var2.n;
                                if (i5 > i2) {
                                    i3 = i4;
                                }
                                if (i5 > i2) {
                                    i = i5;
                                } else {
                                    i = i2;
                                }
                                if (i5 > i2) {
                                    a32Var = a32Var2;
                                }
                                i4++;
                                i2 = i;
                            }
                            b32Var.c.remove(i3);
                        } else {
                            a32Var = (a32) b32Var.c.get(0);
                            if (z) {
                                b32Var.c.remove(0);
                            } else {
                                synchronized (a32Var.g) {
                                    a32Var.n -= 100;
                                }
                            }
                        }
                    }
                    if (a32Var != null) {
                        str2 = a32Var.o;
                        str3 = a32Var.p;
                        F = a32Var.q;
                        if (str2 != null) {
                            jv5.A.g.b().H(str2);
                        }
                        if (F != null) {
                            jv5.A.g.b().I(F);
                        }
                    } else {
                        jv5 jv5Var2 = jv5.A;
                        nl5 b = jv5Var2.g.b();
                        b.B();
                        synchronized (b.a) {
                            str = b.i;
                        }
                        F = jv5Var2.g.b().F();
                        str2 = str;
                        str3 = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    jv5 jv5Var3 = jv5.A;
                    if (!jv5Var3.g.b().z()) {
                        if (F != null && !TextUtils.isEmpty(F)) {
                            bundle2.putString("v_fp_vertical", F);
                        } else {
                            bundle2.putString("v_fp_vertical", "no_hash");
                        }
                    }
                    if (str2 != null && !jv5Var3.g.b().y()) {
                        bundle2.putString("fingerprint", str2);
                        if (!str2.equals(str3)) {
                            bundle2.putString("v_fp", str3);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new ba4(0, bundle);
            default:
                return new ba4(1, ((gb4) this.b).b);
        }
    }
}