package defpackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: cm2  reason: default package */
public final class cm2 implements i70 {
    public final Date a;
    public final int b;
    public final Set c;
    public final boolean d;
    public final int e;
    public final nc2 f;
    public final boolean h;
    public final ArrayList g = new ArrayList();
    public final HashMap i = new HashMap();

    public cm2(Date date, int i, HashSet hashSet, boolean z, int i2, nc2 nc2Var, ArrayList arrayList, boolean z2) {
        HashMap hashMap;
        String str;
        Boolean bool;
        this.a = date;
        this.b = i;
        this.c = hashSet;
        this.d = z;
        this.e = i2;
        this.f = nc2Var;
        this.h = z2;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.startsWith("custom:")) {
                    String[] split = str2.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            hashMap = this.i;
                            str = split[1];
                            bool = Boolean.TRUE;
                        } else if ("false".equals(split[2])) {
                            hashMap = this.i;
                            str = split[1];
                            bool = Boolean.FALSE;
                        }
                        hashMap.put(str, bool);
                    }
                } else {
                    this.g.add(str2);
                }
            }
        }
    }

    @Override // defpackage.j50
    @Deprecated
    public final boolean a() {
        return this.h;
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