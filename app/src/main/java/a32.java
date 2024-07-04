package defpackage;

import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: a32  reason: default package */
public final class a32 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final n32 e;
    public final y32 f;
    public int n;
    public final Object g = new Object();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public int k = 0;
    public int l = 0;
    public int m = 0;
    public String o = "";
    public String p = "";
    public String q = "";

    public a32(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = new n32(i4);
        this.f = new y32(i5, i6, i7);
    }

    public static final String d(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            sb.append((String) arrayList.get(i));
            sb.append(' ');
            i++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        return sb2.length() < 100 ? sb2 : sb2.substring(0, 100);
    }

    public final void a(String str, boolean z, float f, float f2, float f3, float f4) {
        c(str, z, f, f2, f3, f4);
        synchronized (this.g) {
            if (this.m < 0) {
                sv2.b("ActivityContent: negative number of WebViews.");
            }
            b();
        }
    }

    public final void b() {
        int i;
        synchronized (this.g) {
            try {
                int i2 = this.k;
                int i3 = this.l;
                if (this.d) {
                    i = this.b;
                } else {
                    i = (i2 * this.a) + (i3 * this.b);
                }
                if (i > this.n) {
                    this.n = i;
                    jv5 jv5Var = jv5.A;
                    if (!jv5Var.g.b().y()) {
                        this.o = this.e.a(this.h);
                        this.p = this.e.a(this.i);
                    }
                    if (!jv5Var.g.b().z()) {
                        this.q = this.f.a(this.i, this.j);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str, boolean z, float f, float f2, float f3, float f4) {
        if (str != null) {
            if (str.length() < this.c) {
                return;
            }
            synchronized (this.g) {
                this.h.add(str);
                this.k += str.length();
                if (z) {
                    this.i.add(str);
                    this.j.add(new k32(f, f2, f3, f4, this.i.size() - 1));
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a32) {
            if (obj == this) {
                return true;
            }
            String str = ((a32) obj).o;
            return str != null && str.equals(this.o);
        }
        return false;
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    public final String toString() {
        int i = this.l;
        int i2 = this.n;
        int i3 = this.k;
        String d = d(this.h);
        String d2 = d(this.i);
        String str = this.o;
        String str2 = this.p;
        String str3 = this.q;
        return "ActivityContent fetchId: " + i + " score:" + i2 + " total_length:" + i3 + "\n text: " + d + "\n viewableText" + d2 + "\n signture: " + str + "\n viewableSignture: " + str2 + "\n viewableSignatureForVertical: " + str3;
    }
}