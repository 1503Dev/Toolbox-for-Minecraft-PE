package defpackage;

import android.text.TextUtils;
import java.util.LinkedHashMap;

/* renamed from: lz1  reason: default package */
public final class lz1 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ lz1(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        LinkedHashMap linkedHashMap;
        switch (this.P) {
            case 0:
                if (((mz1) this.Q).b == null) {
                    synchronized (mz1.c) {
                        if (((mz1) this.Q).b == null) {
                            boolean z2 = false;
                            try {
                                z = ((Boolean) x92.U1.d()).booleanValue();
                            } catch (IllegalStateException unused) {
                                z = false;
                            }
                            if (z) {
                                try {
                                    mz1.d = qq4.a(((mz1) this.Q).a.a, "ADSHIELD");
                                } catch (Throwable unused2) {
                                }
                            }
                            z2 = z;
                            ((mz1) this.Q).b = Boolean.valueOf(z2);
                            mz1.c.open();
                        }
                    }
                    return;
                }
                return;
            case 1:
                ca2 ca2Var = (ca2) this.Q;
                while (true) {
                    try {
                        la2 la2Var = (la2) ca2Var.a.take();
                        kt1 a = la2Var.a();
                        if (!TextUtils.isEmpty((String) a.a)) {
                            LinkedHashMap linkedHashMap2 = ca2Var.b;
                            synchronized (la2Var.c) {
                                synchronized (jv5.A.g.a) {
                                }
                                linkedHashMap = la2Var.b;
                            }
                            ca2Var.b(ca2Var.a(linkedHashMap2, linkedHashMap), a);
                        }
                    } catch (InterruptedException e) {
                        sv2.h("CsiReporter:reporter interrupted", e);
                        return;
                    }
                }
            case 2:
                hw hwVar = (hw) this.Q;
                c14 c14Var = jv5.A.v;
                if (((Boolean) w82.d.c.a(x92.i4)).booleanValue() && mu2.Q.P) {
                    Object c0 = va0.c0(hwVar);
                    if (c0 instanceof jn4) {
                        ((jn4) c0).b();
                        return;
                    }
                    return;
                }
                return;
            default:
                no4 no4Var = ((so4) this.Q).e;
                ((h43) no4Var.Q).a(new xo4(no4Var));
                return;
        }
    }
}