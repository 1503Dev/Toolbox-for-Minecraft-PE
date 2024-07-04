package defpackage;

import android.content.Context;

/* renamed from: xt2  reason: default package */
public final class xt2 extends r82 {
    public final wv2 b;
    public final String c;

    public xt2(Context context, String str, String str2) {
        this.b = new wv2(jv5.A.c.r(context, str));
        this.c = str2;
    }

    @Override // defpackage.r82
    public final void a() {
        this.b.m(this.c);
    }
}