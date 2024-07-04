package defpackage;

import android.content.Context;

/* renamed from: et5  reason: default package */
public final class et5 implements y6 {
    public final dr5 a;
    public final wn5 b;

    public et5(Context context) {
        wn5 wn5Var;
        this.a = new dr5(context, jt.b);
        synchronized (wn5.class) {
            if (wn5.d == null) {
                wn5.d = new wn5(context.getApplicationContext());
            }
            wn5Var = wn5.d;
        }
        this.b = wn5Var;
    }

    @Override // defpackage.y6
    public final yv0<z6> a() {
        return this.a.a().g(new a53(this));
    }
}