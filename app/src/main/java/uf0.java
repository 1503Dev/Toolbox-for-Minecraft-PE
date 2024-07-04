package defpackage;

import android.os.Looper;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;
import org.json.JSONObject;

/* renamed from: uf0  reason: default package */
public final class uf0 implements ta0, wg3, bl4 {
    public static final /* synthetic */ uf0 P = new uf0();
    public static final a83 Q = new a83(1);
    public static final /* synthetic */ uf0 R = new uf0();
    public static final xk4 S = new xk4();

    public static void a(aj1 aj1Var) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != aj1Var.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = aj1Var.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 36 + String.valueOf(name).length());
            sb.append("Must be called on ");
            sb.append(name2);
            sb.append(" thread, but got ");
            sb.append(name);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    public static void b(String str) {
        boolean z;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalStateException(str);
    }

    public static void c(String str) {
        boolean z;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        throw new IllegalStateException(str);
    }

    @EnsuresNonNull({"#1"})
    public static void f(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    @EnsuresNonNull({"#1"})
    public static void g(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void h(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static void i(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    @Pure
    public static void j(String str, boolean z) {
        if (!z) {
            throw jy2.a(str, null);
        }
    }

    @Override // defpackage.ta0
    public Object d() {
        return new h10();
    }

    @Override // defpackage.bl4
    public Object e(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        vz3.k("GMS AdRequest Signals: ");
        vz3.k(jSONObject.toString(2));
        return jSONObject;
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public void mo0e(Object obj) {
        ((zp5) obj).c();
    }
}