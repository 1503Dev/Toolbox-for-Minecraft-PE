package defpackage;

import java.util.Hashtable;

/* renamed from: y60  reason: default package */
public final class y60 {
    public static final Hashtable a = new Hashtable();
    public static final Hashtable b = new Hashtable();

    static {
        a("B-571", sm0.E);
        a("B-409", sm0.C);
        a("B-283", sm0.m);
        a("B-233", sm0.s);
        a("B-163", sm0.k);
        a("K-571", sm0.D);
        a("K-409", sm0.B);
        a("K-283", sm0.l);
        a("K-233", sm0.r);
        a("K-163", sm0.a);
        a("P-521", sm0.A);
        a("P-384", sm0.z);
        a("P-256", sm0.G);
        a("P-224", sm0.y);
        a("P-192", sm0.F);
    }

    public static void a(String str, o oVar) {
        a.put(str, oVar);
        b.put(oVar, str);
    }
}