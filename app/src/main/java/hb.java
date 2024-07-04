package defpackage;

import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* renamed from: hb  reason: default package */
public final class hb {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    @Nullable
    public String m;

    /* renamed from: hb$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a {
        public boolean a;
        public int b = -1;
        public boolean c;
    }

    static {
        a aVar = new a();
        aVar.a = true;
        new hb(aVar);
        a aVar2 = new a();
        aVar2.c = true;
        int i = Integer.MAX_VALUE;
        long seconds = TimeUnit.SECONDS.toSeconds(Integer.MAX_VALUE);
        if (seconds <= 2147483647L) {
            i = (int) seconds;
        }
        aVar2.b = i;
        new hb(aVar2);
    }

    public hb(a aVar) {
        this.a = aVar.a;
        this.b = false;
        this.c = -1;
        this.d = -1;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = aVar.b;
        this.i = -1;
        this.j = aVar.c;
        this.k = false;
        this.l = false;
    }

    public hb(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, @Nullable String str) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = i3;
        this.i = i4;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static hb a(lu luVar) {
        String str;
        int i;
        int i2;
        String str2;
        char charAt;
        lu luVar2 = luVar;
        int length = luVar2.a.length / 2;
        int i3 = 0;
        boolean z = true;
        String str3 = null;
        boolean z2 = false;
        boolean z3 = false;
        int i4 = -1;
        int i5 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i6 = -1;
        int i7 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (i3 < length) {
            String d = luVar2.d(i3);
            String g = luVar2.g(i3);
            if (d.equalsIgnoreCase("Cache-Control")) {
                if (str3 == null) {
                    str3 = g;
                    for (i = 0; i < g.length(); i = i2) {
                        int e = mv.e(g, "=,;", i);
                        String trim = g.substring(i, e).trim();
                        if (e != g.length() && g.charAt(e) != ',' && g.charAt(e) != ';') {
                            while (true) {
                                e++;
                                if (e >= g.length() || ((charAt = g.charAt(e)) != ' ' && charAt != '\t')) {
                                    break;
                                }
                            }
                            if (e < g.length() && g.charAt(e) == '\"') {
                                int i8 = e + 1;
                                int e2 = mv.e(g, "\"", i8);
                                str2 = g.substring(i8, e2);
                                i2 = e2 + 1;
                            } else {
                                i2 = mv.e(g, ",;", e);
                                str2 = g.substring(e, i2).trim();
                            }
                        } else {
                            i2 = e + 1;
                            str2 = null;
                        }
                        if ("no-cache".equalsIgnoreCase(trim)) {
                            z2 = true;
                        } else if ("no-store".equalsIgnoreCase(trim)) {
                            z3 = true;
                        } else if ("max-age".equalsIgnoreCase(trim)) {
                            i4 = mv.c(-1, str2);
                        } else if ("s-maxage".equalsIgnoreCase(trim)) {
                            i5 = mv.c(-1, str2);
                        } else if ("private".equalsIgnoreCase(trim)) {
                            z4 = true;
                        } else if ("public".equalsIgnoreCase(trim)) {
                            z5 = true;
                        } else if ("must-revalidate".equalsIgnoreCase(trim)) {
                            z6 = true;
                        } else if ("max-stale".equalsIgnoreCase(trim)) {
                            i6 = mv.c(Integer.MAX_VALUE, str2);
                        } else if ("min-fresh".equalsIgnoreCase(trim)) {
                            i7 = mv.c(-1, str2);
                        } else if ("only-if-cached".equalsIgnoreCase(trim)) {
                            z7 = true;
                        } else if ("no-transform".equalsIgnoreCase(trim)) {
                            z8 = true;
                        } else if ("immutable".equalsIgnoreCase(trim)) {
                            z9 = true;
                        }
                    }
                    i3++;
                    luVar2 = luVar;
                }
            } else if (!d.equalsIgnoreCase("Pragma")) {
                i3++;
                luVar2 = luVar;
            }
            z = false;
            while (i < g.length()) {
            }
            i3++;
            luVar2 = luVar;
        }
        if (!z) {
            str = null;
        } else {
            str = str3;
        }
        return new hb(z2, z3, i4, i5, z4, z5, z6, i6, i7, z7, z8, z9, str);
    }

    public final String toString() {
        String str = this.m;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a) {
                sb.append("no-cache, ");
            }
            if (this.b) {
                sb.append("no-store, ");
            }
            if (this.c != -1) {
                sb.append("max-age=");
                sb.append(this.c);
                sb.append(", ");
            }
            if (this.d != -1) {
                sb.append("s-maxage=");
                sb.append(this.d);
                sb.append(", ");
            }
            if (this.e) {
                sb.append("private, ");
            }
            if (this.f) {
                sb.append("public, ");
            }
            if (this.g) {
                sb.append("must-revalidate, ");
            }
            if (this.h != -1) {
                sb.append("max-stale=");
                sb.append(this.h);
                sb.append(", ");
            }
            if (this.i != -1) {
                sb.append("min-fresh=");
                sb.append(this.i);
                sb.append(", ");
            }
            if (this.j) {
                sb.append("only-if-cached, ");
            }
            if (this.k) {
                sb.append("no-transform, ");
            }
            if (this.l) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                str = "";
            } else {
                sb.delete(sb.length() - 2, sb.length());
                str = sb.toString();
            }
            this.m = str;
        }
        return str;
    }
}