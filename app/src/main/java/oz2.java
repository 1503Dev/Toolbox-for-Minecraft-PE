package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: oz2  reason: default package */
public abstract class oz2 implements qk0 {
    public final Context P;
    public final String Q;
    public final WeakReference R;

    public oz2(gy2 gy2Var) {
        Context context = gy2Var.getContext();
        this.P = context;
        this.Q = jv5.A.c.r(context, gy2Var.k().P);
        this.R = new WeakReference(gy2Var);
    }

    public static /* bridge */ /* synthetic */ void k(oz2 oz2Var, HashMap hashMap) {
        gy2 gy2Var = (gy2) oz2Var.R.get();
        if (gy2Var != null) {
            gy2Var.a("onPrecacheEvent", hashMap);
        }
    }

    @Override // defpackage.qk0
    public void b() {
    }

    public abstract void l();

    public final void m(String str, String str2, String str3, String str4) {
        mv2.b.post(new nz2(this, str, str2, str3, str4));
    }

    public final void n(String str, String str2, long j, long j2, boolean z, long j3, long j4, long j5, int i, int i2) {
        mv2.b.post(new jz2(this, str, str2, j, j2, j3, j4, j5, z, i, i2));
    }

    public void o(int i) {
    }

    public void p(int i) {
    }

    public void q(int i) {
    }

    public void s(int i) {
    }

    public abstract boolean t(String str);

    public boolean u(String str, String[] strArr) {
        return t(str);
    }

    public boolean v(String str, String[] strArr, gz2 gz2Var) {
        return t(str);
    }
}