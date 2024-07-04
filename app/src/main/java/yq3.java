package defpackage;

import java.util.HashMap;
import javax.annotation.Nullable;

/* renamed from: yq3  reason: default package */
public final class yq3 {
    public final HashMap a = new HashMap();

    @Nullable
    public final synchronized xq3 a(String str) {
        return (xq3) this.a.get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void b(String str, @Nullable mj4 mj4Var) {
        mn2 n;
        if (this.a.containsKey(str)) {
            return;
        }
        mn2 mn2Var = null;
        if (mj4Var != null) {
            try {
                n = mj4Var.a.n();
                if (mj4Var != null) {
                    try {
                        mn2Var = mj4Var.a.o();
                    } catch (Throwable th) {
                        try {
                            throw new ni4(th);
                        } catch (ni4 unused) {
                        }
                    }
                }
                boolean z = false;
                if (((Boolean) w82.d.c.a(x92.S7)).booleanValue()) {
                    if (mj4Var != null) {
                        try {
                            mj4Var.a();
                        } catch (ni4 unused2) {
                        }
                    }
                    this.a.put(str, new xq3(str, n, mn2Var, z));
                }
                z = true;
                this.a.put(str, new xq3(str, n, mn2Var, z));
            } catch (Throwable th2) {
                try {
                    throw new ni4(th2);
                } catch (ni4 unused3) {
                }
            }
        }
        n = null;
        if (mj4Var != null) {
        }
        boolean z2 = false;
        if (((Boolean) w82.d.c.a(x92.S7)).booleanValue()) {
        }
        z2 = true;
        this.a.put(str, new xq3(str, n, mn2Var, z2));
    }
}