package defpackage;

import android.content.Context;
import android.view.View;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: ji3  reason: default package */
public final class ji3 extends xg3 implements s22 {
    public final WeakHashMap Q;
    public final Context R;
    public final yh4 S;

    public ji3(Context context, Set set, yh4 yh4Var) {
        super(set);
        this.Q = new WeakHashMap(1);
        this.R = context;
        this.S = yh4Var;
    }

    public final synchronized void S0(View view) {
        t22 t22Var = (t22) this.Q.get(view);
        if (t22Var == null) {
            t22Var = new t22(this.R, view);
            t22Var.a0.add(this);
            t22Var.c(3);
            this.Q.put(view, t22Var);
        }
        if (this.S.X) {
            l92 l92Var = x92.Z0;
            w82 w82Var = w82.d;
            if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                long longValue = ((Long) w82Var.c.a(x92.Y0)).longValue();
                bv2 bv2Var = t22Var.X;
                synchronized (bv2Var.c) {
                    bv2Var.a = longValue;
                }
                return;
            }
        }
        bv2 bv2Var2 = t22Var.X;
        long j = t22.d0;
        synchronized (bv2Var2.c) {
            bv2Var2.a = j;
        }
    }

    @Override // defpackage.s22
    public final synchronized void h0(r22 r22Var) {
        R0(new ee4(5, r22Var));
    }
}