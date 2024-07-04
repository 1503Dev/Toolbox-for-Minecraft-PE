package defpackage;

import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: rp5  reason: default package */
public final class rp5 {
    public static final Random g = new Random();
    public up5 d;
    public String f;
    public final lc3 a = new lc3();
    public final ya3 b = new ya3();
    public final HashMap c = new HashMap();
    public kd3 e = kd3.a;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
        if (r1.d < r2) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(io5 io5Var) {
        this.d.getClass();
        if (io5Var.b.o()) {
            return;
        }
        qp5 qp5Var = (qp5) this.c.get(this.f);
        ov5 ov5Var = io5Var.d;
        if (ov5Var != null && qp5Var != null) {
            long j = qp5Var.c;
            if (j == -1) {
                if (qp5Var.b == io5Var.c) {
                }
                return;
            }
        }
        qp5 b = b(io5Var.c, ov5Var);
        if (this.f == null) {
            this.f = b.a;
        }
        ov5 ov5Var2 = io5Var.d;
        if (ov5Var2 != null && ov5Var2.a()) {
            Object obj = ov5Var2.a;
            qp5 b2 = b(io5Var.c, new ov5(ov5Var2.b, ov5Var2.d, obj));
            if (!b2.e) {
                b2.e = true;
                io5Var.b.n(io5Var.d.a, this.b);
                ya3 ya3Var = this.b;
                ya3Var.f.a(io5Var.d.b).getClass();
                Math.max(0L, zn4.s(0L) + zn4.s(0L));
            }
        }
        if (!b.e) {
            b.e = true;
        }
        if (b.a.equals(this.f) && !b.f) {
            b.f = true;
            ((tp5) this.d).d(io5Var, b.a);
        }
    }

    public final qp5 b(int i, ov5 ov5Var) {
        ov5 ov5Var2;
        boolean z;
        long j = RecyclerView.FOREVER_NS;
        qp5 qp5Var = null;
        for (qp5 qp5Var2 : this.c.values()) {
            if (qp5Var2.c == -1 && i == qp5Var2.b && ov5Var != null) {
                qp5Var2.c = ov5Var.d;
            }
            if (ov5Var != null ? !((ov5Var2 = qp5Var2.d) != null ? ov5Var.d != ov5Var2.d || ov5Var.b != ov5Var2.b || ov5Var.c != ov5Var2.c : ov5Var.a() || ov5Var.d != qp5Var2.c) : i == qp5Var2.b) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                long j2 = qp5Var2.c;
                if (j2 != -1 && j2 >= j) {
                    if (j2 == j) {
                        int i2 = zn4.a;
                        if (qp5Var.d != null && qp5Var2.d != null) {
                            qp5Var = qp5Var2;
                        }
                    }
                } else {
                    qp5Var = qp5Var2;
                    j = j2;
                }
            }
        }
        if (qp5Var == null) {
            byte[] bArr = new byte[12];
            g.nextBytes(bArr);
            String encodeToString = Base64.encodeToString(bArr, 10);
            qp5 qp5Var3 = new qp5(this, encodeToString, i, ov5Var);
            this.c.put(encodeToString, qp5Var3);
            return qp5Var3;
        }
        return qp5Var;
    }

    @RequiresNonNull({"listener"})
    public final void c(io5 io5Var) {
        ov5 ov5Var;
        if (io5Var.b.o()) {
            this.f = null;
            return;
        }
        qp5 qp5Var = (qp5) this.c.get(this.f);
        this.f = b(io5Var.c, io5Var.d).a;
        a(io5Var);
        ov5 ov5Var2 = io5Var.d;
        if (ov5Var2 != null && ov5Var2.a()) {
            if (qp5Var != null) {
                long j = qp5Var.c;
                ov5 ov5Var3 = io5Var.d;
                if (j == ov5Var3.d && (ov5Var = qp5Var.d) != null && ov5Var.b == ov5Var3.b && ov5Var.c == ov5Var3.c) {
                    return;
                }
            }
            ov5 ov5Var4 = io5Var.d;
            b(io5Var.c, new ov5(ov5Var4.d, ov5Var4.a));
        }
    }
}