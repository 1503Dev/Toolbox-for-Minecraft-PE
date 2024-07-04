package defpackage;

import android.os.Build;

/* renamed from: sf  reason: default package */
public final class sf {
    public static final sf i = new sf(new a());
    public o90 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public long g;
    public bg h;

    /* renamed from: sf$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a {
        public o90 a = o90.NOT_REQUIRED;
        public bg b = new bg();
    }

    public sf() {
        this.a = o90.NOT_REQUIRED;
        this.f = -1L;
        this.g = -1L;
        this.h = new bg();
    }

    public sf(a aVar) {
        this.a = o90.NOT_REQUIRED;
        this.f = -1L;
        this.g = -1L;
        this.h = new bg();
        this.b = false;
        int i2 = Build.VERSION.SDK_INT;
        this.c = false;
        this.a = aVar.a;
        this.d = false;
        this.e = false;
        if (i2 >= 24) {
            this.h = aVar.b;
            this.f = -1L;
            this.g = -1L;
        }
    }

    public sf(sf sfVar) {
        this.a = o90.NOT_REQUIRED;
        this.f = -1L;
        this.g = -1L;
        this.h = new bg();
        this.b = sfVar.b;
        this.c = sfVar.c;
        this.a = sfVar.a;
        this.d = sfVar.d;
        this.e = sfVar.e;
        this.h = sfVar.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sf.class != obj.getClass()) {
            return false;
        }
        sf sfVar = (sf) obj;
        if (this.b == sfVar.b && this.c == sfVar.c && this.d == sfVar.d && this.e == sfVar.e && this.f == sfVar.f && this.g == sfVar.g && this.a == sfVar.a) {
            return this.h.equals(sfVar.h);
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f;
        long j2 = this.g;
        return this.h.hashCode() + (((((((((((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }
}