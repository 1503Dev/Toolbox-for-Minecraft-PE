package defpackage;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* renamed from: rl2  reason: default package */
public final class rl2 implements j50 {
    public final Date a;
    public final int b;
    public final Set c;
    public final boolean d;
    public final int e;
    public final boolean f;

    public rl2(Date date, int i, HashSet hashSet, boolean z, int i2, boolean z2) {
        this.a = date;
        this.b = i;
        this.c = hashSet;
        this.d = z;
        this.e = i2;
        this.f = z2;
    }

    @Override // defpackage.j50
    @Deprecated
    public final boolean a() {
        return this.f;
    }

    @Override // defpackage.j50
    @Deprecated
    public final Date b() {
        return this.a;
    }

    @Override // defpackage.j50
    public final boolean c() {
        return this.d;
    }

    @Override // defpackage.j50
    public final Set<String> d() {
        return this.c;
    }

    @Override // defpackage.j50
    public final int e() {
        return this.e;
    }

    @Override // defpackage.j50
    @Deprecated
    public final int f() {
        return this.b;
    }
}