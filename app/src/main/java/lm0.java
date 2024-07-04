package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;
import javax.annotation.Nullable;

/* renamed from: lm0  reason: default package */
public final class lm0 {
    public final m3 a;
    public final Proxy b;
    public final InetSocketAddress c;

    public lm0(m3 m3Var, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (m3Var == null) {
            throw new NullPointerException("address == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.a = m3Var;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof lm0) {
            lm0 lm0Var = (lm0) obj;
            if (lm0Var.a.equals(this.a) && lm0Var.b.equals(this.b) && lm0Var.c.equals(this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder b = e5.b("Route{");
        b.append(this.c);
        b.append("}");
        return b.toString();
    }
}