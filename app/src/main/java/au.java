package defpackage;

import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* renamed from: au  reason: default package */
public final class au<T> implements pg<T, vk0> {
    public static final e50 R = e50.a("application/json; charset=UTF-8");
    public static final Charset S = Charset.forName("UTF-8");
    public final xt P;
    public final l11<T> Q;

    public au(xt xtVar, l11<T> l11Var) {
        this.P = xtVar;
        this.Q = l11Var;
    }

    @Override // defpackage.pg
    public final vk0 b(Object obj) {
        za zaVar = new za();
        i00 h = this.P.h(new OutputStreamWriter(new ya(zaVar), S));
        this.Q.b(h, obj);
        h.close();
        return vk0.create(R, zaVar.K());
    }
}