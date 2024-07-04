package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* renamed from: mw3  reason: default package */
public final /* synthetic */ class mw3 implements ky4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mw3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
        r1.Y = new java.lang.String(r2, defpackage.zs4.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
        return defpackage.zw4.C(r1);
     */
    @Override // defpackage.ky4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dz4 e(Object obj) {
        byte[] a;
        int i;
        switch (this.a) {
            case 0:
                rq2 rq2Var = (rq2) this.b;
                InputStream inputStream = (InputStream) obj;
                int i2 = ex4.a;
                inputStream.getClass();
                ArrayDeque arrayDeque = new ArrayDeque(20);
                int highestOneBit = Integer.highestOneBit(0);
                int min = Math.min(8192, Math.max(128, highestOneBit + highestOneBit));
                int i3 = 0;
                while (true) {
                    if (i3 < 2147483639) {
                        int min2 = Math.min(min, 2147483639 - i3);
                        byte[] bArr = new byte[min2];
                        arrayDeque.add(bArr);
                        int i4 = 0;
                        while (i4 < min2) {
                            int read = inputStream.read(bArr, i4, min2 - i4);
                            if (read == -1) {
                                a = ex4.a(arrayDeque, i3);
                                break;
                            } else {
                                i4 += read;
                                i3 += read;
                            }
                        }
                        if (min < 4096) {
                            i = 4;
                        } else {
                            i = 2;
                        }
                        min = tv2.D(min * i);
                    } else if (inputStream.read() == -1) {
                        a = ex4.a(arrayDeque, 2147483639);
                        break;
                    } else {
                        throw new OutOfMemoryError("input is too large to fit in a byte array");
                    }
                }
            default:
                t33 t33Var = (t33) this.b;
                Void r5 = (Void) obj;
                Context context = t33Var.b.b.b;
                tv2.C(context);
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                tv2.C(((sp2) t33Var.a.Q).Q);
                eb4 eb4Var = new eb4(new za4(), 0L, (ScheduledExecutorService) t33Var.b.k.c());
                tv2.C(t33Var.b.b.b);
                eb4 eb4Var2 = new eb4(new ge4((ScheduledExecutorService) t33Var.b.k.c()), ((Long) w82.d.c.a(x92.t3)).longValue(), (ScheduledExecutorService) t33Var.b.k.c());
                pu2 pu2Var = new pu2();
                Context context2 = t33Var.b.b.b;
                tv2.C(context2);
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) t33Var.b.k.c();
                id4 id4Var = t33Var.a;
                int i5 = id4Var.P;
                sp2 sp2Var = (sp2) id4Var.Q;
                eb4 eb4Var3 = new eb4(new zc4(pu2Var, context2, scheduledExecutorService, yw2Var, i5, sp2Var.X, sp2Var.W), 0L, (ScheduledExecutorService) t33Var.b.k.c());
                eb4 eb4Var4 = new eb4(new xe4(yw2Var), 0L, (ScheduledExecutorService) t33Var.b.k.c());
                tv2.C(t33Var.b.b.b);
                tv2.C(((sp2) t33Var.a.Q).Q);
                kd4 kd4Var = new kd4(yw2Var);
                tv2.C(t33Var.b.b.b);
                List list = ((sp2) t33Var.a.Q).V;
                tv2.C(list);
                String str = ((sp2) t33Var.a.Q).S;
                tv2.C(str);
                PackageInfo packageInfo = ((sp2) t33Var.a.Q).R;
                tv2.C(t33Var.b.b.b);
                tv2.C(((sp2) t33Var.a.Q).Q);
                tv2.C(((sp2) t33Var.a.Q).Q);
                return new qc4(context, yw2Var, sv4.t(eb4Var, eb4Var2, eb4Var3, eb4Var4, kd4Var, new vd4(yw2Var), new ce4(yw2Var, list), new gd4(yw2Var, str), new td4((yu2) t33Var.b.Y.c(), (ScheduledExecutorService) t33Var.b.k.c(), yw2Var), (nc4) t33Var.b.y0.c(), new od4((yu2) t33Var.b.Y.c(), (ScheduledExecutorService) t33Var.b.k.c(), yw2Var)), (qm4) t33Var.c.c(), (zr3) t33Var.b.R.c()).a(new JSONObject());
        }
    }
}