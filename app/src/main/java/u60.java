package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

/* renamed from: u60  reason: default package */
public final class u60 extends vk0 {
    public static final e50 e = e50.a("multipart/mixed");
    public static final e50 f;
    public static final byte[] g;
    public static final byte[] h;
    public static final byte[] i;
    public final fb a;
    public final e50 b;
    public final List<b> c;
    public long d = -1;

    /* renamed from: u60$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a {
        public final fb a;
        public e50 b;
        public final ArrayList c;

        public a() {
            String uuid = UUID.randomUUID().toString();
            this.b = u60.e;
            this.c = new ArrayList();
            this.a = fb.h(uuid);
        }
    }

    /* renamed from: u60$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class b {
        @Nullable
        public final lu a;
        public final vk0 b;

        public b(@Nullable lu luVar, vk0 vk0Var) {
            this.a = luVar;
            this.b = vk0Var;
        }
    }

    static {
        e50.a("multipart/alternative");
        e50.a("multipart/digest");
        e50.a("multipart/parallel");
        f = e50.a("multipart/form-data");
        g = new byte[]{58, 32};
        h = new byte[]{13, 10};
        i = new byte[]{45, 45};
    }

    public u60(fb fbVar, e50 e50Var, ArrayList arrayList) {
        this.a = fbVar;
        this.b = e50.a(e50Var + "; boundary=" + fbVar.q());
        this.c = c31.l(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a(@Nullable ab abVar, boolean z) {
        za zaVar;
        if (z) {
            abVar = new za();
            zaVar = abVar;
        } else {
            zaVar = 0;
        }
        int size = this.c.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.c.get(i2);
            lu luVar = bVar.a;
            vk0 vk0Var = bVar.b;
            abVar.write(i);
            abVar.A(this.a);
            abVar.write(h);
            if (luVar != null) {
                int length = luVar.a.length / 2;
                for (int i3 = 0; i3 < length; i3++) {
                    abVar.v(luVar.d(i3)).write(g).v(luVar.g(i3)).write(h);
                }
            }
            e50 contentType = vk0Var.contentType();
            if (contentType != null) {
                abVar.v("Content-Type: ").v(contentType.a).write(h);
            }
            long contentLength = vk0Var.contentLength();
            if (contentLength != -1) {
                abVar.v("Content-Length: ").w(contentLength).write(h);
            } else if (z) {
                zaVar.a();
                return -1L;
            }
            byte[] bArr = h;
            abVar.write(bArr);
            if (z) {
                j += contentLength;
            } else {
                vk0Var.writeTo(abVar);
            }
            abVar.write(bArr);
        }
        byte[] bArr2 = i;
        abVar.write(bArr2);
        abVar.A(this.a);
        abVar.write(bArr2);
        abVar.write(h);
        if (z) {
            long j2 = j + zaVar.Q;
            zaVar.a();
            return j2;
        }
        return j;
    }

    @Override // defpackage.vk0
    public final long contentLength() {
        long j = this.d;
        if (j != -1) {
            return j;
        }
        long a2 = a(null, true);
        this.d = a2;
        return a2;
    }

    @Override // defpackage.vk0
    public final e50 contentType() {
        return this.b;
    }

    @Override // defpackage.vk0
    public final void writeTo(ab abVar) {
        a(abVar, false);
    }
}