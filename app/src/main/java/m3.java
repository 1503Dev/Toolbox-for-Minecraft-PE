package defpackage;

import defpackage.pv;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: m3  reason: default package */
public final class m3 {
    public final pv a;
    public final zl b;
    public final SocketFactory c;
    public final u7 d;
    public final List<ig0> e;
    public final List<Cif> f;
    public final ProxySelector g;
    @Nullable
    public final Proxy h;
    @Nullable
    public final SSLSocketFactory i;
    @Nullable
    public final HostnameVerifier j;
    @Nullable
    public final oc k;

    public m3(String str, int i, zl zlVar, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable oc ocVar, u7 u7Var, @Nullable Proxy proxy, List<ig0> list, List<Cif> list2, ProxySelector proxySelector) {
        pv.a aVar = new pv.a();
        String str2 = "https";
        String str3 = sSLSocketFactory != null ? "https" : "http";
        if (str3.equalsIgnoreCase("http")) {
            str2 = "http";
        } else if (!str3.equalsIgnoreCase("https")) {
            throw new IllegalArgumentException(k6.b("unexpected scheme: ", str3));
        }
        aVar.a = str2;
        if (str == null) {
            throw new NullPointerException("host == null");
        }
        String b = c31.b(pv.k(0, str.length(), str, false));
        if (b != null) {
            aVar.d = b;
            if (i > 0 && i <= 65535) {
                aVar.e = i;
                this.a = aVar.a();
                if (zlVar == null) {
                    throw new NullPointerException("dns == null");
                }
                this.b = zlVar;
                if (socketFactory == null) {
                    throw new NullPointerException("socketFactory == null");
                }
                this.c = socketFactory;
                if (u7Var == null) {
                    throw new NullPointerException("proxyAuthenticator == null");
                }
                this.d = u7Var;
                if (list == null) {
                    throw new NullPointerException("protocols == null");
                }
                this.e = c31.l(list);
                if (list2 == null) {
                    throw new NullPointerException("connectionSpecs == null");
                }
                this.f = c31.l(list2);
                if (proxySelector == null) {
                    throw new NullPointerException("proxySelector == null");
                }
                this.g = proxySelector;
                this.h = proxy;
                this.i = sSLSocketFactory;
                this.j = hostnameVerifier;
                this.k = ocVar;
                return;
            }
            throw new IllegalArgumentException(k6.a("unexpected port: ", i));
        }
        throw new IllegalArgumentException(k6.b("unexpected host: ", str));
    }

    public final boolean a(m3 m3Var) {
        if (this.b.equals(m3Var.b) && this.d.equals(m3Var.d) && this.e.equals(m3Var.e) && this.f.equals(m3Var.f) && this.g.equals(m3Var.g) && Objects.equals(this.h, m3Var.h) && Objects.equals(this.i, m3Var.i) && Objects.equals(this.j, m3Var.j) && Objects.equals(this.k, m3Var.k) && this.a.e == m3Var.a.e) {
            return true;
        }
        return false;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof m3) {
            m3 m3Var = (m3) obj;
            if (this.a.equals(m3Var.a) && a(m3Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.d.hashCode();
        int hashCode3 = this.e.hashCode();
        int hashCode4 = this.f.hashCode();
        int hashCode5 = this.g.hashCode();
        int hashCode6 = Objects.hashCode(this.h);
        int hashCode7 = Objects.hashCode(this.i);
        int hashCode8 = Objects.hashCode(this.j);
        return Objects.hashCode(this.k) + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object obj;
        StringBuilder b = e5.b("Address{");
        b.append(this.a.d);
        b.append(":");
        b.append(this.a.e);
        if (this.h != null) {
            b.append(", proxy=");
            obj = this.h;
        } else {
            b.append(", proxySelector=");
            obj = this.g;
        }
        b.append(obj);
        b.append("}");
        return b.toString();
    }
}