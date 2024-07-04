package defpackage;

import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: xe4  reason: default package */
public final class xe4 implements nc4 {
    public final ez4 a;

    public xe4(yw2 yw2Var) {
        this.a = yw2Var;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 51;
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        return this.a.b(new Callable() { // from class: we4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String[] split;
                HashMap hashMap = new HashMap();
                p92 p92Var = x92.E;
                w82 w82Var = w82.d;
                String str = (String) w82Var.c.a(p92Var);
                if (str != null && !str.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) w82Var.c.a(x92.F)).intValue()) {
                        for (String str2 : str.split(",", -1)) {
                            hashMap.put(str2, x23.a(str2));
                        }
                    }
                }
                return new ye4(hashMap);
            }
        });
    }
}