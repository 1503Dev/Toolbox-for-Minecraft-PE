package defpackage;

import defpackage.fr;
import defpackage.lu;
import defpackage.pv;
import defpackage.u60;
import defpackage.uk0;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* renamed from: wk0  reason: default package */
public final class wk0 {
    public static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String a;
    public final pv b;
    @Nullable
    public String c;
    @Nullable
    public pv.a d;
    public final uk0.a e = new uk0.a();
    public final lu.a f;
    @Nullable
    public e50 g;
    public final boolean h;
    @Nullable
    public u60.a i;
    @Nullable
    public fr.a j;
    @Nullable
    public vk0 k;

    /* renamed from: wk0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends vk0 {
        public final vk0 a;
        public final e50 b;

        public a(vk0 vk0Var, e50 e50Var) {
            this.a = vk0Var;
            this.b = e50Var;
        }

        @Override // defpackage.vk0
        public final long contentLength() {
            return this.a.contentLength();
        }

        @Override // defpackage.vk0
        public final e50 contentType() {
            return this.b;
        }

        @Override // defpackage.vk0
        public final void writeTo(ab abVar) {
            this.a.writeTo(abVar);
        }
    }

    public wk0(String str, pv pvVar, @Nullable String str2, @Nullable lu luVar, @Nullable e50 e50Var, boolean z, boolean z2, boolean z3) {
        lu.a aVar;
        this.a = str;
        this.b = pvVar;
        this.c = str2;
        this.g = e50Var;
        this.h = z;
        if (luVar != null) {
            aVar = luVar.e();
        } else {
            aVar = new lu.a();
        }
        this.f = aVar;
        if (z2) {
            this.j = new fr.a();
        } else if (z3) {
            u60.a aVar2 = new u60.a();
            this.i = aVar2;
            e50 e50Var2 = u60.f;
            if (e50Var2 != null) {
                if (e50Var2.b.equals("multipart")) {
                    aVar2.b = e50Var2;
                    return;
                }
                throw new IllegalArgumentException("multipart != " + e50Var2);
            }
            throw new NullPointerException("type == null");
        }
    }

    public final void a(String str, boolean z, String str2) {
        fr.a aVar = this.j;
        aVar.getClass();
        if (z) {
            if (str != null) {
                aVar.a.add(pv.c(str, true));
                aVar.b.add(pv.c(str2, true));
                return;
            }
            throw new NullPointerException("name == null");
        } else if (str != null) {
            aVar.a.add(pv.c(str, false));
            aVar.b.add(pv.c(str2, false));
        } else {
            throw new NullPointerException("name == null");
        }
    }

    public final void b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.g = e50.a(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(k6.b("Malformed content type: ", str2), e);
            }
        }
        this.f.a(str, str2);
    }

    public final void c(lu luVar, vk0 vk0Var) {
        u60.a aVar = this.i;
        aVar.getClass();
        if (vk0Var != null) {
            if (luVar != null && luVar.c("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }
            if (luVar != null && luVar.c("Content-Length") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
            aVar.c.add(new u60.b(luVar, vk0Var));
            return;
        }
        throw new NullPointerException("body == null");
    }

    public final void d(String str, boolean z, @Nullable String str2) {
        pv.a aVar;
        String str3 = this.c;
        String str4 = null;
        if (str3 != null) {
            pv pvVar = this.b;
            pvVar.getClass();
            try {
                aVar = new pv.a();
                aVar.b(pvVar, str3);
            } catch (IllegalArgumentException unused) {
                aVar = null;
            }
            this.d = aVar;
            if (aVar != null) {
                this.c = null;
            } else {
                StringBuilder b = e5.b("Malformed URL. Base: ");
                b.append(this.b);
                b.append(", Relative: ");
                b.append(this.c);
                throw new IllegalArgumentException(b.toString());
            }
        }
        if (z) {
            pv.a aVar2 = this.d;
            if (str != null) {
                if (aVar2.g == null) {
                    aVar2.g = new ArrayList();
                }
                aVar2.g.add(pv.b(str, " \"'<>#&=", true, false, true, true));
                ArrayList arrayList = aVar2.g;
                if (str2 != null) {
                    str4 = pv.b(str2, " \"'<>#&=", true, false, true, true);
                }
                arrayList.add(str4);
                return;
            }
            aVar2.getClass();
            throw new NullPointerException("encodedName == null");
        }
        pv.a aVar3 = this.d;
        if (str != null) {
            if (aVar3.g == null) {
                aVar3.g = new ArrayList();
            }
            aVar3.g.add(pv.b(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            ArrayList arrayList2 = aVar3.g;
            if (str2 != null) {
                str4 = pv.b(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true);
            }
            arrayList2.add(str4);
            return;
        }
        aVar3.getClass();
        throw new NullPointerException("name == null");
    }
}