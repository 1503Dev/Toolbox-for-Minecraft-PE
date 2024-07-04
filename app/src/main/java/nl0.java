package defpackage;

import defpackage.lu;
import java.io.Closeable;
import javax.annotation.Nullable;

/* renamed from: nl0  reason: default package */
public final class nl0 implements Closeable {
    public final uk0 P;
    public final ig0 Q;
    public final int R;
    public final String S;
    @Nullable
    public final eu T;
    public final lu U;
    @Nullable
    public final ql0 V;
    @Nullable
    public final nl0 W;
    @Nullable
    public final nl0 X;
    @Nullable
    public final nl0 Y;
    public final long Z;
    public final long a0;
    @Nullable
    public final hp b0;
    @Nullable
    public volatile hb c0;

    /* renamed from: nl0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        @Nullable
        public uk0 a;
        @Nullable
        public ig0 b;
        public int c;
        public String d;
        @Nullable
        public eu e;
        public lu.a f;
        @Nullable
        public ql0 g;
        @Nullable
        public nl0 h;
        @Nullable
        public nl0 i;
        @Nullable
        public nl0 j;
        public long k;
        public long l;
        @Nullable
        public hp m;

        public a() {
            this.c = -1;
            this.f = new lu.a();
        }

        public a(nl0 nl0Var) {
            this.c = -1;
            this.a = nl0Var.P;
            this.b = nl0Var.Q;
            this.c = nl0Var.R;
            this.d = nl0Var.S;
            this.e = nl0Var.T;
            this.f = nl0Var.U.e();
            this.g = nl0Var.V;
            this.h = nl0Var.W;
            this.i = nl0Var.X;
            this.j = nl0Var.Y;
            this.k = nl0Var.Z;
            this.l = nl0Var.a0;
            this.m = nl0Var.b0;
        }

        public static void b(String str, nl0 nl0Var) {
            if (nl0Var.V == null) {
                if (nl0Var.W == null) {
                    if (nl0Var.X == null) {
                        if (nl0Var.Y == null) {
                            return;
                        }
                        throw new IllegalArgumentException(k6.b(str, ".priorResponse != null"));
                    }
                    throw new IllegalArgumentException(k6.b(str, ".cacheResponse != null"));
                }
                throw new IllegalArgumentException(k6.b(str, ".networkResponse != null"));
            }
            throw new IllegalArgumentException(k6.b(str, ".body != null"));
        }

        public final nl0 a() {
            if (this.a != null) {
                if (this.b != null) {
                    if (this.c >= 0) {
                        if (this.d != null) {
                            return new nl0(this);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    StringBuilder b = e5.b("code < 0: ");
                    b.append(this.c);
                    throw new IllegalStateException(b.toString());
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }
    }

    public nl0(a aVar) {
        this.P = aVar.a;
        this.Q = aVar.b;
        this.R = aVar.c;
        this.S = aVar.d;
        this.T = aVar.e;
        lu.a aVar2 = aVar.f;
        aVar2.getClass();
        this.U = new lu(aVar2);
        this.V = aVar.g;
        this.W = aVar.h;
        this.X = aVar.i;
        this.Y = aVar.j;
        this.Z = aVar.k;
        this.a0 = aVar.l;
        this.b0 = aVar.m;
    }

    public final hb a() {
        hb hbVar = this.c0;
        if (hbVar != null) {
            return hbVar;
        }
        hb a2 = hb.a(this.U);
        this.c0 = a2;
        return a2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ql0 ql0Var = this.V;
        if (ql0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        ql0Var.close();
    }

    @Nullable
    public final String d(String str) {
        String c = this.U.c(str);
        if (c != null) {
            return c;
        }
        return null;
    }

    public final String toString() {
        StringBuilder b = e5.b("Response{protocol=");
        b.append(this.Q);
        b.append(", code=");
        b.append(this.R);
        b.append(", message=");
        b.append(this.S);
        b.append(", url=");
        b.append(this.P.a);
        b.append('}');
        return b.toString();
    }
}