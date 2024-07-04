package defpackage;

import defpackage.lu;
import defpackage.pv;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: uk0  reason: default package */
public final class uk0 {
    public final pv a;
    public final String b;
    public final lu c;
    @Nullable
    public final vk0 d;
    public final Map<Class<?>, Object> e;
    @Nullable
    public volatile hb f;

    /* renamed from: uk0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        @Nullable
        public pv a;
        public String b;
        public lu.a c;
        @Nullable
        public vk0 d;
        public Map<Class<?>, Object> e;

        public a() {
            this.e = Collections.emptyMap();
            this.b = "GET";
            this.c = new lu.a();
        }

        public a(uk0 uk0Var) {
            this.e = Collections.emptyMap();
            this.a = uk0Var.a;
            this.b = uk0Var.b;
            this.d = uk0Var.d;
            this.e = uk0Var.e.isEmpty() ? Collections.emptyMap() : new LinkedHashMap<>(uk0Var.e);
            this.c = uk0Var.c.e();
        }

        public final uk0 a() {
            if (this.a != null) {
                return new uk0(this);
            }
            throw new IllegalStateException("url == null");
        }

        public final void b(String str, @Nullable vk0 vk0Var) {
            boolean z;
            if (str != null) {
                if (str.length() != 0) {
                    if (vk0Var != null && !vj.x(str)) {
                        throw new IllegalArgumentException(ij.c("method ", str, " must not have a request body."));
                    }
                    if (vk0Var == null) {
                        if (!str.equals("POST") && !str.equals("PUT") && !str.equals("PATCH") && !str.equals("PROPPATCH") && !str.equals("REPORT")) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            throw new IllegalArgumentException(ij.c("method ", str, " must have a request body."));
                        }
                    }
                    this.b = str;
                    this.d = vk0Var;
                    return;
                }
                throw new IllegalArgumentException("method.length() == 0");
            }
            throw new NullPointerException("method == null");
        }

        public final void c(String str) {
            this.c.c(str);
        }

        public final void d(Class cls, @Nullable Object obj) {
            if (cls == null) {
                throw new NullPointerException("type == null");
            }
            if (obj == null) {
                this.e.remove(cls);
                return;
            }
            if (this.e.isEmpty()) {
                this.e = new LinkedHashMap();
            }
            this.e.put(cls, cls.cast(obj));
        }

        public final void e(pv pvVar) {
            if (pvVar == null) {
                throw new NullPointerException("url == null");
            }
            this.a = pvVar;
        }

        public final void f(String str) {
            StringBuilder b;
            int i;
            if (str != null) {
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    b = e5.b("http:");
                    i = 3;
                } else {
                    if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                        b = e5.b("https:");
                        i = 4;
                    }
                    pv.a aVar = new pv.a();
                    aVar.b(null, str);
                    e(aVar.a());
                    return;
                }
                b.append(str.substring(i));
                str = b.toString();
                pv.a aVar2 = new pv.a();
                aVar2.b(null, str);
                e(aVar2.a());
                return;
            }
            throw new NullPointerException("url == null");
        }
    }

    public uk0(a aVar) {
        Map<Class<?>, Object> unmodifiableMap;
        this.a = aVar.a;
        this.b = aVar.b;
        lu.a aVar2 = aVar.c;
        aVar2.getClass();
        this.c = new lu(aVar2);
        this.d = aVar.d;
        Map<Class<?>, Object> map = aVar.e;
        byte[] bArr = c31.a;
        if (map.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        this.e = unmodifiableMap;
    }

    @Nullable
    public final String a(String str) {
        return this.c.c(str);
    }

    public final String toString() {
        StringBuilder b = e5.b("Request{method=");
        b.append(this.b);
        b.append(", url=");
        b.append(this.a);
        b.append(", tags=");
        b.append(this.e);
        b.append('}');
        return b.toString();
    }
}