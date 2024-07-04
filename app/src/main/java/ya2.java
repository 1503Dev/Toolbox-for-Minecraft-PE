package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ya2  reason: default package */
public class ya2 {
    public final String a;
    public final int b;
    public final Object c;

    public /* synthetic */ ya2(int i, Object obj, String str) {
        this.a = str;
        this.c = obj;
        this.b = i;
    }

    public /* synthetic */ ya2(l3 l3Var, String str, int i) {
        this.c = l3Var;
        this.a = str;
        this.b = i;
    }

    public static ya2 a(String str, long j) {
        return new ya2(2, Long.valueOf(j), str);
    }

    public static ya2 b(String str, String str2) {
        return new ya2(4, str2, str);
    }

    public static ya2 c(String str, boolean z) {
        return new ya2(1, Boolean.valueOf(z), str);
    }

    public final Object d() {
        dc2 dc2Var = (dc2) fc2.a.get();
        if (dc2Var == null) {
            AtomicReference atomicReference = fc2.b;
            if (((ec2) atomicReference.get()) != null) {
                ((ec2) atomicReference.get()).a();
            }
            return this.c;
        }
        int i = this.b - 1;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return dc2Var.b(this.a, (String) this.c);
                }
                return dc2Var.a(this.a, ((Double) this.c).doubleValue());
            }
            return dc2Var.c(this.a, ((Long) this.c).longValue());
        }
        return dc2Var.d(this.a, ((Boolean) this.c).booleanValue());
    }
}