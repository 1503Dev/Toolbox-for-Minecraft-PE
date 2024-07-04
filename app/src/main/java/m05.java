package defpackage;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: m05  reason: default package */
public final class m05 {
    public final ab5 a;
    public final List b;
    public final z75 c = z75.b;

    public m05(ab5 ab5Var, List list) {
        this.a = ab5Var;
        this.b = list;
    }

    public static final m05 a(ab5 ab5Var) {
        Integer valueOf;
        if (ab5Var.w() > 0) {
            ArrayList arrayList = new ArrayList(ab5Var.w());
            for (za5 za5Var : ab5Var.E()) {
                za5Var.w();
                int w = za5Var.w();
                if (za5Var.A() == 4) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(w);
                }
                try {
                    try {
                        ja a = b65.b.a(p65.a(za5Var.x().B(), za5Var.x().A(), za5Var.x().x(), za5Var.A(), valueOf));
                        int G = za5Var.G() - 2;
                        if (G != 1 && G != 2 && G != 3) {
                            throw new GeneralSecurityException("Unknown key status");
                            break;
                        }
                        ab5Var.x();
                        arrayList.add(new l05(a));
                    } catch (GeneralSecurityException unused) {
                        arrayList.add(null);
                    }
                } catch (GeneralSecurityException e) {
                    throw new x65("Creating a protokey serialization failed", e);
                }
            }
            return new m05(ab5Var, Collections.unmodifiableList(arrayList));
        }
        throw new GeneralSecurityException("empty keyset");
    }

    public static final m05 b(h05 h05Var) {
        int i;
        x55 x55Var = new x55(new q65(h05Var.a));
        k05 k05Var = new k05();
        j05 j05Var = new j05(x55Var);
        k05 k05Var2 = j05Var.d;
        if (k05Var2 != null) {
            Iterator it = k05Var2.a.iterator();
            while (it.hasNext()) {
                ((j05) it.next()).a = false;
            }
        }
        j05Var.a = true;
        j05Var.c = vx.f;
        if (j05Var.d == null) {
            Iterator it2 = k05Var.a.iterator();
            while (it2.hasNext()) {
                ((j05) it2.next()).a = false;
            }
            j05Var.d = k05Var;
            k05Var.a.add(j05Var);
            if (!k05Var.b) {
                k05Var.b = true;
                xa5 y = ab5.y();
                ArrayList arrayList = k05Var.a;
                for (int i2 = 0; i2 < arrayList.size() - 1; i2++) {
                    vx vxVar = ((j05) arrayList.get(i2)).c;
                    vx vxVar2 = vx.f;
                    if (vxVar == vxVar2 && ((j05) arrayList.get(i2 + 1)).c != vxVar2) {
                        throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = k05Var.a.iterator();
                Integer num = null;
                while (it3.hasNext()) {
                    j05 j05Var2 = (j05) it3.next();
                    j05Var2.getClass();
                    vx vxVar3 = j05Var2.c;
                    if (vxVar3 != null) {
                        int i3 = 3;
                        if (vxVar3 == vx.f) {
                            i = 0;
                            while (true) {
                                if (i != 0 && !hashSet.contains(Integer.valueOf(i))) {
                                    break;
                                }
                                SecureRandom secureRandom = new SecureRandom();
                                byte[] bArr = new byte[4];
                                int i4 = 0;
                                while (i4 == 0) {
                                    secureRandom.nextBytes(bArr);
                                    i4 = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                                }
                                i = i4;
                            }
                        } else {
                            i = 0;
                        }
                        Integer valueOf = Integer.valueOf(i);
                        if (!hashSet.contains(valueOf)) {
                            hashSet.add(valueOf);
                            o7 o7Var = j05Var2.b;
                            Object obj = g05.b;
                            if (!obj.equals(obj)) {
                                if (g05.c.equals(obj)) {
                                    i3 = 4;
                                } else if (g05.d.equals(obj)) {
                                    i3 = 5;
                                } else {
                                    throw new IllegalStateException("Unknown key status");
                                }
                            }
                            q65 q65Var = ((x55) o7Var).U;
                            ta5 a = x05.a((va5) q65Var.b);
                            ya5 y2 = za5.y();
                            y2.j();
                            ((za5) y2.Q).zzf = i;
                            y2.j();
                            za5.H((za5) y2.Q, i3);
                            y2.j();
                            ((za5) y2.Q).zzd = a;
                            int z = ((va5) q65Var.b).z();
                            y2.j();
                            ((za5) y2.Q).zzg = e1.a(z);
                            y.j();
                            ab5.G((ab5) y.Q, (za5) y2.h());
                            if (j05Var2.a) {
                                if (num == null) {
                                    num = valueOf;
                                } else {
                                    throw new GeneralSecurityException("Two primaries were set");
                                }
                            }
                        } else {
                            throw new GeneralSecurityException(bp.b("Id ", i, " is used twice in the keyset"));
                        }
                    } else {
                        throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
                    }
                }
                if (num != null) {
                    int intValue = num.intValue();
                    y.j();
                    ((ab5) y.Q).zzd = intValue;
                    return a((ab5) y.h());
                }
                throw new GeneralSecurityException("No primary was set");
            }
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Class cls) {
        Class cls2;
        Object obj;
        Object obj2;
        boolean z;
        AtomicReference atomicReference = x05.a;
        try {
            cls2 = a65.b.a(cls);
        } catch (GeneralSecurityException unused) {
            cls2 = null;
        }
        if (cls2 != null) {
            ab5 ab5Var = this.a;
            int i = y05.a;
            int x = ab5Var.x();
            int i2 = 0;
            boolean z2 = false;
            boolean z3 = true;
            for (za5 za5Var : ab5Var.E()) {
                if (za5Var.G() == 3) {
                    if (za5Var.F()) {
                        if (za5Var.A() != 1) {
                            if (za5Var.G() != 2) {
                                if (za5Var.w() == x) {
                                    if (!z2) {
                                        z2 = true;
                                    } else {
                                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                                    }
                                }
                                if (za5Var.x().x() != 4) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                z3 &= z;
                                i2++;
                            } else {
                                throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(za5Var.w())));
                            }
                        } else {
                            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(za5Var.w())));
                        }
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(za5Var.w())));
                    }
                }
            }
            if (i2 != 0) {
                if (!z2 && !z3) {
                    throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
                }
                vj2 vj2Var = new vj2(cls2);
                z75 z75Var = this.c;
                if (((ConcurrentMap) vj2Var.b) != null) {
                    vj2Var.d = z75Var;
                    for (int i3 = 0; i3 < this.a.w(); i3++) {
                        za5 z4 = this.a.z(i3);
                        if (z4.G() == 3) {
                            try {
                                ta5 x2 = z4.x();
                                AtomicReference atomicReference2 = x05.a;
                                obj = x05.c(x2.B(), x2.A(), cls2);
                            } catch (GeneralSecurityException e) {
                                if (!e.getMessage().contains("No key manager found for key type ") && !e.getMessage().contains(" not supported by key manager of type ")) {
                                    throw e;
                                }
                                obj = null;
                            }
                            if (this.b.get(i3) != null) {
                                ja jaVar = ((l05) this.b.get(i3)).a;
                                try {
                                    AtomicReference atomicReference3 = x05.a;
                                    obj2 = a65.b.b(jaVar, cls2);
                                } catch (GeneralSecurityException unused2) {
                                }
                                if (z4.w() != this.a.x()) {
                                    vj2Var.e(obj2, obj, z4, true);
                                } else {
                                    vj2Var.e(obj2, obj, z4, false);
                                }
                            }
                            obj2 = null;
                            if (z4.w() != this.a.x()) {
                            }
                        }
                    }
                    ConcurrentMap concurrentMap = (ConcurrentMap) vj2Var.b;
                    if (concurrentMap != null) {
                        Class cls3 = (Class) vj2Var.a;
                        u05 u05Var = new u05(concurrentMap, (r05) vj2Var.c, (z75) vj2Var.d, cls3);
                        vj2Var.b = null;
                        n65 n65Var = (n65) a65.b.a.get();
                        if (n65Var.b.containsKey(cls)) {
                            v05 v05Var = (v05) n65Var.b.get(cls);
                            if (cls3.equals(v05Var.a()) && v05Var.a().equals(cls3)) {
                                return v05Var.b(u05Var);
                            }
                            throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
                        }
                        throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
                    }
                    throw new IllegalStateException("build cannot be called twice");
                }
                throw new IllegalStateException("setAnnotations cannot be called after build");
            }
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
    }

    public final String toString() {
        ab5 ab5Var = this.a;
        int i = y05.a;
        bb5 w = eb5.w();
        int x = ab5Var.x();
        w.j();
        ((eb5) w.Q).zzd = x;
        for (za5 za5Var : ab5Var.E()) {
            cb5 w2 = db5.w();
            String B = za5Var.x().B();
            w2.j();
            db5.y((db5) w2.Q, B);
            int G = za5Var.G();
            w2.j();
            db5.B((db5) w2.Q, G);
            int A = za5Var.A();
            w2.j();
            ((db5) w2.Q).zzg = e1.a(A);
            int w3 = za5Var.w();
            w2.j();
            ((db5) w2.Q).zzf = w3;
            w.j();
            eb5.z((eb5) w.Q, (db5) w2.h());
        }
        return ((eb5) w.h()).toString();
    }
}