package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: nm0  reason: default package */
public final class nm0 {
    public final m3 a;
    public final ij2 b;
    public final fp c;
    public List<Proxy> d;
    public int e;
    public List<InetSocketAddress> f = Collections.emptyList();
    public final ArrayList g = new ArrayList();

    /* renamed from: nm0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a {
        public final List<lm0> a;
        public int b = 0;

        public a(ArrayList arrayList) {
            this.a = arrayList;
        }
    }

    public nm0(m3 m3Var, ij2 ij2Var, ob obVar, fp fpVar) {
        List<Proxy> m;
        this.d = Collections.emptyList();
        this.a = m3Var;
        this.b = ij2Var;
        this.c = fpVar;
        pv pvVar = m3Var.a;
        Proxy proxy = m3Var.h;
        if (proxy != null) {
            m = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = m3Var.g.select(pvVar.p());
            if (select != null && !select.isEmpty()) {
                m = c31.l(select);
            } else {
                m = c31.m(Proxy.NO_PROXY);
            }
        }
        this.d = m;
        this.e = 0;
    }
}