package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

/* renamed from: if  reason: invalid class name and default package */
public final class Cif {
    public static final Cif e;
    public static final Cif f;
    public final boolean a;
    public final boolean b;
    @Nullable
    public final String[] c;
    @Nullable
    public final String[] d;

    /* renamed from: if$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a {
        public boolean a;
        @Nullable
        public String[] b;
        @Nullable
        public String[] c;
        public boolean d;

        public a(Cif cif) {
            this.a = cif.a;
            this.b = cif.c;
            this.c = cif.d;
            this.d = cif.b;
        }

        public a(boolean z) {
            this.a = z;
        }

        public final void a(wc... wcVarArr) {
            if (!this.a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[wcVarArr.length];
            for (int i = 0; i < wcVarArr.length; i++) {
                strArr[i] = wcVarArr[i].a;
            }
            b(strArr);
        }

        public final void b(String... strArr) {
            if (!this.a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.b = (String[]) strArr.clone();
        }

        public final void c(mx0... mx0VarArr) {
            if (!this.a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            String[] strArr = new String[mx0VarArr.length];
            for (int i = 0; i < mx0VarArr.length; i++) {
                strArr[i] = mx0VarArr[i].P;
            }
            d(strArr);
        }

        public final void d(String... strArr) {
            if (!this.a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.c = (String[]) strArr.clone();
        }
    }

    static {
        wc wcVar = wc.q;
        wc wcVar2 = wc.r;
        wc wcVar3 = wc.s;
        wc wcVar4 = wc.k;
        wc wcVar5 = wc.m;
        wc wcVar6 = wc.l;
        wc wcVar7 = wc.n;
        wc wcVar8 = wc.p;
        wc wcVar9 = wc.o;
        wc[] wcVarArr = {wcVar, wcVar2, wcVar3, wcVar4, wcVar5, wcVar6, wcVar7, wcVar8, wcVar9};
        wc[] wcVarArr2 = {wcVar, wcVar2, wcVar3, wcVar4, wcVar5, wcVar6, wcVar7, wcVar8, wcVar9, wc.i, wc.j, wc.g, wc.h, wc.e, wc.f, wc.d};
        a aVar = new a(true);
        aVar.a(wcVarArr);
        mx0 mx0Var = mx0.TLS_1_3;
        mx0 mx0Var2 = mx0.TLS_1_2;
        aVar.c(mx0Var, mx0Var2);
        if (aVar.a) {
            aVar.d = true;
            new Cif(aVar);
            a aVar2 = new a(true);
            aVar2.a(wcVarArr2);
            aVar2.c(mx0Var, mx0Var2);
            if (aVar2.a) {
                aVar2.d = true;
                e = new Cif(aVar2);
                a aVar3 = new a(true);
                aVar3.a(wcVarArr2);
                aVar3.c(mx0Var, mx0Var2, mx0.TLS_1_1, mx0.TLS_1_0);
                if (aVar3.a) {
                    aVar3.d = true;
                    new Cif(aVar3);
                    f = new Cif(new a(false));
                    return;
                }
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        throw new IllegalStateException("no TLS extensions for cleartext connections");
    }

    public Cif(a aVar) {
        this.a = aVar.a;
        this.c = aVar.b;
        this.d = aVar.c;
        this.b = aVar.d;
    }

    public final boolean a(SSLSocket sSLSocket) {
        if (this.a) {
            String[] strArr = this.d;
            if (strArr == null || c31.p(c31.i, strArr, sSLSocket.getEnabledProtocols())) {
                String[] strArr2 = this.c;
                return strArr2 == null || c31.p(wc.b, strArr2, sSLSocket.getEnabledCipherSuites());
            }
            return false;
        }
        return false;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof Cif) {
            if (obj == this) {
                return true;
            }
            Cif cif = (Cif) obj;
            boolean z = this.a;
            if (z != cif.a) {
                return false;
            }
            return !z || (Arrays.equals(this.c, cif.c) && Arrays.equals(this.d, cif.d) && this.b == cif.b);
        }
        return false;
    }

    public final int hashCode() {
        if (this.a) {
            return ((((527 + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d)) * 31) + (!this.b ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List list;
        if (!this.a) {
            return "ConnectionSpec()";
        }
        StringBuilder b = e5.b("ConnectionSpec(cipherSuites=");
        String[] strArr = this.c;
        List list2 = null;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(wc.a(str));
            }
            list = Collections.unmodifiableList(arrayList);
        } else {
            list = null;
        }
        b.append(Objects.toString(list, "[all enabled]"));
        b.append(", tlsVersions=");
        String[] strArr2 = this.d;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            for (String str2 : strArr2) {
                arrayList2.add(mx0.b(str2));
            }
            list2 = Collections.unmodifiableList(arrayList2);
        }
        b.append(Objects.toString(list2, "[all enabled]"));
        b.append(", supportsTlsExtensions=");
        b.append(this.b);
        b.append(")");
        return b.toString();
    }
}