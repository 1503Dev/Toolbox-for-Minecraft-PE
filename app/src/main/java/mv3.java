package defpackage;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* renamed from: mv3  reason: default package */
public final class mv3 implements fw3 {
    public static final Pattern h = Pattern.compile("Received error HTTP response code: (.*)");
    public final yu3 a;
    public final ez4 b;
    public final li4 c;
    public final ScheduledExecutorService d;
    public final hz3 e;
    public final qm4 f;
    public final Context g;

    public mv3(Context context, li4 li4Var, yu3 yu3Var, yw2 yw2Var, ScheduledExecutorService scheduledExecutorService, hz3 hz3Var, qm4 qm4Var) {
        this.g = context;
        this.c = li4Var;
        this.a = yu3Var;
        this.b = yw2Var;
        this.d = scheduledExecutorService;
        this.e = hz3Var;
        this.f = qm4Var;
    }

    @Override // defpackage.fw3
    public final dz4 a(final rq2 rq2Var) {
        dz4 B;
        final yu3 yu3Var = this.a;
        yu3Var.getClass();
        String str = rq2Var.S;
        cu5 cu5Var = jv5.A.c;
        if (cu5.G(str)) {
            B = new yy4(new gw3(1));
        } else {
            B = zw4.B(yu3Var.a.b(new sc3(1, yu3Var, rq2Var)), ExecutionException.class, new ky4() { // from class: wu3
                @Override // defpackage.ky4
                public final dz4 e(Object obj) {
                    Throwable cause = ((ExecutionException) obj).getCause();
                    cause.getClass();
                    return new yy4(cause);
                }
            }, yu3Var.b);
        }
        final int callingUid = Binder.getCallingUid();
        hx4 B2 = zw4.B(B, gw3.class, new ky4() { // from class: xu3
            @Override // defpackage.ky4
            public final dz4 e(Object obj) {
                yu3 yu3Var2 = yu3.this;
                gw3 gw3Var = (gw3) obj;
                return ((cy3) yu3Var2.d.c()).u4(rq2Var, callingUid);
            }
        }, yu3Var.b);
        hm4 t = eb1.t(this.g, 11);
        pm4.a(B2, t);
        dz4 F = zw4.F(B2, new qh2(this), this.b);
        l92 l92Var = x92.x4;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            F = zw4.B(zw4.G(F, ((Integer) w82Var.c.a(x92.y4)).intValue(), TimeUnit.SECONDS, this.d), TimeoutException.class, new ky4() { // from class: lv3
                @Override // defpackage.ky4
                public final dz4 e(Object obj) {
                    TimeoutException timeoutException = (TimeoutException) obj;
                    return new yy4(new vu3(5));
                }
            }, zw2.f);
        }
        pm4.c(F, this.f, t, false);
        zw4.J(F, new fb3(3, this), zw2.f);
        return F;
    }
}