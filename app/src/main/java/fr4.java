package defpackage;

import android.content.Context;

/* renamed from: fr4  reason: default package */
public final class fr4 extends dr4 {
    public static fr4 h;

    public fr4(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final fr4 f(Context context) {
        fr4 fr4Var;
        synchronized (fr4.class) {
            if (h == null) {
                h = new fr4(context);
            }
            fr4Var = h;
        }
        return fr4Var;
    }
}