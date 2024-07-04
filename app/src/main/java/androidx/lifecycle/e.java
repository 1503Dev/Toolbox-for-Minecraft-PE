package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.os.Looper;
import androidx.lifecycle.c;
import defpackage.hn0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class e extends c {
    public final WeakReference<b10> c;
    public vp<a10, a> a = new vp<>();
    public int d = 0;
    public boolean e = false;
    public boolean f = false;
    public ArrayList<c.EnumC0007c> g = new ArrayList<>();
    public c.EnumC0007c b = c.EnumC0007c.INITIALIZED;
    public final boolean h = true;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public c.EnumC0007c a;
        public d b;

        public a(a10 a10Var, c.EnumC0007c enumC0007c) {
            d reflectiveGenericLifecycleObserver;
            HashMap hashMap = e10.a;
            boolean z = a10Var instanceof d;
            boolean z2 = a10Var instanceof ks;
            if (z && z2) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((ks) a10Var, (d) a10Var);
            } else if (z2) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((ks) a10Var, null);
            } else if (z) {
                reflectiveGenericLifecycleObserver = (d) a10Var;
            } else {
                Class<?> cls = a10Var.getClass();
                if (e10.c(cls) == 2) {
                    List list = (List) e10.b.get(cls);
                    if (list.size() == 1) {
                        reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(e10.a((Constructor) list.get(0), a10Var));
                    } else {
                        b[] bVarArr = new b[list.size()];
                        for (int i = 0; i < list.size(); i++) {
                            bVarArr[i] = e10.a((Constructor) list.get(i), a10Var);
                        }
                        reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(bVarArr);
                    }
                } else {
                    reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(a10Var);
                }
            }
            this.b = reflectiveGenericLifecycleObserver;
            this.a = enumC0007c;
        }

        public final void a(b10 b10Var, c.b bVar) {
            c.EnumC0007c b = bVar.b();
            c.EnumC0007c enumC0007c = this.a;
            if (b.compareTo(enumC0007c) < 0) {
                enumC0007c = b;
            }
            this.a = enumC0007c;
            this.b.d(b10Var, bVar);
            this.a = b;
        }
    }

    public e(b10 b10Var) {
        this.c = new WeakReference<>(b10Var);
    }

    @Override // androidx.lifecycle.c
    public final void a(a10 a10Var) {
        b10 b10Var;
        boolean z;
        c.b bVar;
        ArrayList<c.EnumC0007c> arrayList;
        c("addObserver");
        c.EnumC0007c enumC0007c = this.b;
        c.EnumC0007c enumC0007c2 = c.EnumC0007c.DESTROYED;
        if (enumC0007c != enumC0007c2) {
            enumC0007c2 = c.EnumC0007c.INITIALIZED;
        }
        a aVar = new a(a10Var, enumC0007c2);
        if (this.a.m(a10Var, aVar) != null || (b10Var = this.c.get()) == null) {
            return;
        }
        if (this.d == 0 && !this.e) {
            z = false;
        } else {
            z = true;
        }
        c.EnumC0007c b = b(a10Var);
        this.d++;
        while (aVar.a.compareTo(b) < 0 && this.a.T.containsKey(a10Var)) {
            this.g.add(aVar.a);
            int ordinal = aVar.a.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        bVar = null;
                    } else {
                        bVar = c.b.ON_RESUME;
                    }
                } else {
                    bVar = c.b.ON_START;
                }
            } else {
                bVar = c.b.ON_CREATE;
            }
            if (bVar != null) {
                aVar.a(b10Var, bVar);
                this.g.remove(arrayList.size() - 1);
                b = b(a10Var);
            } else {
                StringBuilder b2 = e5.b("no event up from ");
                b2.append(aVar.a);
                throw new IllegalStateException(b2.toString());
            }
        }
        if (!z) {
            f();
        }
        this.d--;
    }

    public final c.EnumC0007c b(a10 a10Var) {
        hn0.c<a10, a> cVar;
        c.EnumC0007c enumC0007c;
        ArrayList<c.EnumC0007c> arrayList;
        vp<a10, a> vpVar = this.a;
        c.EnumC0007c enumC0007c2 = null;
        if (vpVar.T.containsKey(a10Var)) {
            cVar = vpVar.T.get(a10Var).S;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            enumC0007c = cVar.Q.a;
        } else {
            enumC0007c = null;
        }
        if (!this.g.isEmpty()) {
            enumC0007c2 = this.g.get(arrayList.size() - 1);
        }
        c.EnumC0007c enumC0007c3 = this.b;
        if (enumC0007c == null || enumC0007c.compareTo(enumC0007c3) >= 0) {
            enumC0007c = enumC0007c3;
        }
        if (enumC0007c2 == null || enumC0007c2.compareTo(enumC0007c) >= 0) {
            return enumC0007c;
        }
        return enumC0007c2;
    }

    @SuppressLint({"RestrictedApi"})
    public final void c(String str) {
        boolean z;
        if (this.h) {
            a7.D1().f.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException(ij.c("Method ", str, " must be called on the main thread"));
            }
        }
    }

    public final void d(c.b bVar) {
        c("handleLifecycleEvent");
        e(bVar.b());
    }

    public final void e(c.EnumC0007c enumC0007c) {
        if (this.b == enumC0007c) {
            return;
        }
        this.b = enumC0007c;
        if (this.e || this.d != 0) {
            this.f = true;
            return;
        }
        this.e = true;
        f();
        this.e = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0055, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00f8, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        boolean z;
        c.b bVar;
        ArrayList<c.EnumC0007c> arrayList;
        c.b bVar2;
        ArrayList<c.EnumC0007c> arrayList2;
        b10 b10Var = this.c.get();
        if (b10Var == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            vp<a10, a> vpVar = this.a;
            if (vpVar.S != 0) {
                c.EnumC0007c enumC0007c = vpVar.P.Q.a;
                c.EnumC0007c enumC0007c2 = vpVar.Q.Q.a;
                if (enumC0007c != enumC0007c2 || this.b != enumC0007c2) {
                    z = false;
                    this.f = false;
                    if (z) {
                        if (this.b.compareTo(vpVar.P.Q.a) < 0) {
                            vp<a10, a> vpVar2 = this.a;
                            hn0.b bVar3 = new hn0.b(vpVar2.Q, vpVar2.P);
                            vpVar2.R.put(bVar3, Boolean.FALSE);
                            while (bVar3.hasNext() && !this.f) {
                                Map.Entry entry = (Map.Entry) bVar3.next();
                                a aVar = (a) entry.getValue();
                                while (aVar.a.compareTo(this.b) > 0 && !this.f) {
                                    if (this.a.T.containsKey((a10) entry.getKey())) {
                                        int ordinal = aVar.a.ordinal();
                                        if (ordinal != 2) {
                                            if (ordinal != 3) {
                                                if (ordinal != 4) {
                                                    bVar2 = null;
                                                } else {
                                                    bVar2 = c.b.ON_PAUSE;
                                                }
                                            } else {
                                                bVar2 = c.b.ON_STOP;
                                            }
                                        } else {
                                            bVar2 = c.b.ON_DESTROY;
                                        }
                                        if (bVar2 != null) {
                                            this.g.add(bVar2.b());
                                            aVar.a(b10Var, bVar2);
                                            this.g.remove(arrayList2.size() - 1);
                                        } else {
                                            StringBuilder b = e5.b("no event down from ");
                                            b.append(aVar.a);
                                            throw new IllegalStateException(b.toString());
                                        }
                                    }
                                }
                            }
                        }
                        hn0.c<a10, a> cVar = this.a.Q;
                        if (!this.f && cVar != null && this.b.compareTo(cVar.Q.a) > 0) {
                            vp<a10, a> vpVar3 = this.a;
                            vpVar3.getClass();
                            hn0.d dVar = new hn0.d();
                            vpVar3.R.put(dVar, Boolean.FALSE);
                            while (dVar.hasNext() && !this.f) {
                                Map.Entry entry2 = (Map.Entry) dVar.next();
                                a aVar2 = (a) entry2.getValue();
                                while (aVar2.a.compareTo(this.b) < 0 && !this.f) {
                                    if (this.a.T.containsKey((a10) entry2.getKey())) {
                                        this.g.add(aVar2.a);
                                        int ordinal2 = aVar2.a.ordinal();
                                        if (ordinal2 != 1) {
                                            if (ordinal2 != 2) {
                                                if (ordinal2 != 3) {
                                                    bVar = null;
                                                } else {
                                                    bVar = c.b.ON_RESUME;
                                                }
                                            } else {
                                                bVar = c.b.ON_START;
                                            }
                                        } else {
                                            bVar = c.b.ON_CREATE;
                                        }
                                        if (bVar != null) {
                                            aVar2.a(b10Var, bVar);
                                            this.g.remove(arrayList.size() - 1);
                                        } else {
                                            StringBuilder b2 = e5.b("no event up from ");
                                            b2.append(aVar2.a);
                                            throw new IllegalStateException(b2.toString());
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
            z = true;
            this.f = false;
            if (z) {
            }
        }
    }
}