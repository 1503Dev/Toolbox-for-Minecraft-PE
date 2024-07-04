package defpackage;

import defpackage.e11;
import io.mrarm.mctoolbox.bridge.a;
import java.io.Serializable;
import java.security.InvalidParameterException;
import java.util.HashSet;

/* renamed from: uz  reason: default package */
public final class uz extends fa {
    public final io.mrarm.mctoolbox.bridge.a R;
    public final b S;
    public final String[] T;
    private final a.InterfaceC0035a U = new a.InterfaceC0035a() { // from class: tz
        @Override // io.mrarm.mctoolbox.bridge.a.InterfaceC0035a
        public final void a() {
            uz.this.K();
        }
    };

    /* renamed from: uz$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends j {
        public a(b[] bVarArr) {
            super(bVarArr, i.Boolean);
        }

        @Override // defpackage.uz.b
        public final Object d(io.mrarm.mctoolbox.bridge.a aVar) {
            for (b bVar : this.b) {
                if (!((Boolean) bVar.d(aVar)).booleanValue()) {
                    return Boolean.FALSE;
                }
            }
            return Boolean.TRUE;
        }
    }

    /* renamed from: uz$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface b {
        void a(i iVar);

        void b();

        i c(boolean z);

        Object d(io.mrarm.mctoolbox.bridge.a aVar);

        void e(HashSet hashSet);
    }

    /* renamed from: uz$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class c extends f {
        public final Object b;

        public c(Object obj, i iVar) {
            super(iVar);
            this.b = obj;
        }

        @Override // defpackage.uz.b
        public final Object d(io.mrarm.mctoolbox.bridge.a aVar) {
            return this.b;
        }

        @Override // defpackage.uz.b
        public final void e(HashSet hashSet) {
        }
    }

    /* renamed from: uz$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class d implements vz<uz> {
        public io.mrarm.mctoolbox.bridge.a a;

        public d(io.mrarm.mctoolbox.bridge.b bVar) {
            this.a = bVar;
        }

        @Override // defpackage.vz
        public final Object a(wz wzVar, e11.a aVar) {
            io.mrarm.mctoolbox.bridge.a aVar2 = this.a;
            b I = uz.I(wzVar);
            I.a(i.Boolean);
            I.b();
            HashSet hashSet = new HashSet();
            I.e(hashSet);
            return new uz(aVar2, I, (String[]) hashSet.toArray(new String[0]));
        }
    }

    /* renamed from: uz$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class e extends j {
        public e(b[] bVarArr, i iVar) {
            super(bVarArr, iVar);
        }

        @Override // defpackage.uz.b
        public final Object d(io.mrarm.mctoolbox.bridge.a aVar) {
            b[] bVarArr = this.b;
            int length = bVarArr.length;
            Object obj = null;
            int i = 0;
            while (i < length) {
                Object d = bVarArr[i].d(aVar);
                if (d == null || !(obj == null || d.equals(obj))) {
                    return Boolean.FALSE;
                }
                i++;
                obj = d;
            }
            return Boolean.TRUE;
        }
    }

    /* renamed from: uz$f */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class f implements b {
        public i a;

        public f(i iVar) {
            this.a = iVar;
        }

        @Override // defpackage.uz.b
        public final void a(i iVar) {
            if (iVar != this.a) {
                throw new UnsupportedOperationException();
            }
        }

        @Override // defpackage.uz.b
        public /* synthetic */ void b() {
        }

        @Override // defpackage.uz.b
        public final i c(boolean z) {
            return this.a;
        }
    }

    /* renamed from: uz$g */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class g extends f {
        public final b b;

        public g(b bVar) {
            super(i.Boolean);
            this.b = bVar;
        }

        @Override // defpackage.uz.f, defpackage.uz.b
        public final void b() {
            this.b.a(i.Boolean);
        }

        @Override // defpackage.uz.b
        public final Object d(io.mrarm.mctoolbox.bridge.a aVar) {
            return Boolean.valueOf(!((Boolean) this.b.d(aVar)).booleanValue());
        }

        @Override // defpackage.uz.b
        public final void e(HashSet hashSet) {
            this.b.e(hashSet);
        }
    }

    /* renamed from: uz$h */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class h extends j {
        public h(b[] bVarArr) {
            super(bVarArr, i.Boolean);
        }

        @Override // defpackage.uz.b
        public final Object d(io.mrarm.mctoolbox.bridge.a aVar) {
            for (b bVar : this.b) {
                if (((Boolean) bVar.d(aVar)).booleanValue()) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        }
    }

    /* renamed from: uz$i */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public enum i {
        Boolean,
        Integer,
        String
    }

    /* renamed from: uz$j */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class j extends f {
        public final b[] b;
        public final i c;

        public j(b[] bVarArr, i iVar) {
            super(i.Boolean);
            this.b = bVarArr;
            this.c = iVar;
        }

        @Override // defpackage.uz.f, defpackage.uz.b
        public final void b() {
            b[] bVarArr;
            i iVar = this.c;
            if (iVar == null) {
                iVar = f(false);
            }
            if (iVar == null) {
                iVar = f(true);
            }
            if (iVar == null) {
                throw new RuntimeException("Type guessing failed");
            }
            for (b bVar : this.b) {
                bVar.a(iVar);
                bVar.b();
            }
        }

        @Override // defpackage.uz.b
        public final void e(HashSet hashSet) {
            for (b bVar : this.b) {
                bVar.e(hashSet);
            }
        }

        public final i f(boolean z) {
            i iVar = null;
            for (b bVar : this.b) {
                i c = bVar.c(z);
                if (c != null) {
                    if (iVar != null && iVar != c) {
                        throw new InvalidParameterException("Type guessing failed");
                    }
                    iVar = c;
                }
            }
            return iVar;
        }
    }

    /* renamed from: uz$k */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class k implements b {
        public final String a;
        public i b;

        public k(String str) {
            this.a = str;
        }

        @Override // defpackage.uz.b
        public final void a(i iVar) {
            this.b = iVar;
        }

        @Override // defpackage.uz.b
        public final /* synthetic */ void b() {
        }

        @Override // defpackage.uz.b
        public final i c(boolean z) {
            if (z) {
                return i.Boolean;
            }
            return null;
        }

        @Override // defpackage.uz.b
        public final Object d(io.mrarm.mctoolbox.bridge.a aVar) {
            int ordinal = this.b.ordinal();
            if (ordinal == 0) {
                return Boolean.valueOf(((io.mrarm.mctoolbox.bridge.b) aVar).j(this.a));
            } else if (ordinal == 1) {
                return Integer.valueOf(((io.mrarm.mctoolbox.bridge.b) aVar).p(this.a));
            } else if (ordinal == 2) {
                return ((io.mrarm.mctoolbox.bridge.b) aVar).r(this.a);
            } else {
                throw new IllegalStateException();
            }
        }

        @Override // defpackage.uz.b
        public final void e(HashSet hashSet) {
            hashSet.add(this.a);
        }
    }

    public uz(io.mrarm.mctoolbox.bridge.a aVar, b bVar, String[] strArr) {
        this.S = bVar;
        this.T = strArr;
        this.R = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b I(wz wzVar) {
        char c2;
        i iVar = i.Integer;
        i iVar2 = i.String;
        i iVar3 = i.Boolean;
        wzVar.getClass();
        if (wzVar instanceof zz) {
            zz o = wzVar.o();
            if (o.s("not")) {
                return new g(I(o.r("not")));
            }
            if (o.s("and")) {
                return new a(J(o.r("and")));
            }
            if (o.s("or")) {
                return new h(J(o.r("or")));
            }
            if (o.s("equals")) {
                b[] J = J(o.r("equals"));
                if (o.s("type")) {
                    String q = o.r("type").q();
                    q.getClass();
                    int hashCode = q.hashCode();
                    if (hashCode != -891985903) {
                        if (hashCode != 64711720) {
                            if (hashCode == 1958052158 && q.equals("integer")) {
                                c2 = 2;
                                if (c2 == 0) {
                                    if (c2 != 1) {
                                        if (c2 != 2) {
                                            throw new InvalidParameterException();
                                        }
                                    } else {
                                        iVar = iVar3;
                                    }
                                } else {
                                    iVar = iVar2;
                                }
                            }
                            c2 = 65535;
                            if (c2 == 0) {
                            }
                        } else {
                            if (q.equals("boolean")) {
                                c2 = 1;
                                if (c2 == 0) {
                                }
                            }
                            c2 = 65535;
                            if (c2 == 0) {
                            }
                        }
                    } else {
                        if (q.equals("string")) {
                            c2 = 0;
                            if (c2 == 0) {
                            }
                        }
                        c2 = 65535;
                        if (c2 == 0) {
                        }
                    }
                } else {
                    iVar = null;
                }
                return new e(J, iVar);
            }
        } else if (wzVar instanceof b00) {
            b00 p = wzVar.p();
            Serializable serializable = p.P;
            if (serializable instanceof String) {
                String q2 = p.q();
                if (q2.startsWith(":")) {
                    return new c(q2.substring(1), iVar2);
                }
                return new k(q2);
            } else if (serializable instanceof Boolean) {
                return new c(Boolean.valueOf(p.g()), iVar3);
            } else {
                if (serializable instanceof Number) {
                    return new c(Integer.valueOf(p.m()), iVar);
                }
            }
        }
        throw new InvalidParameterException(wzVar.toString());
    }

    public static b[] J(wz wzVar) {
        wzVar.getClass();
        if (wzVar instanceof qz) {
            qz n = wzVar.n();
            b[] bVarArr = new b[n.P.size()];
            for (int size = n.P.size() - 1; size >= 0; size--) {
                bVarArr[size] = I(n.r(size));
            }
            return bVarArr;
        }
        return new b[]{I(wzVar)};
    }

    @Override // defpackage.ya0
    public final void H(boolean z) {
        throw new UnsupportedOperationException();
    }

    public final void K() {
        super.H(((Boolean) this.S.d(this.R)).booleanValue());
    }

    @Override // defpackage.ea
    public final void g() {
        String[] strArr;
        for (String str : this.T) {
            ((io.mrarm.mctoolbox.bridge.b) this.R).W(str, this.U);
        }
    }

    @Override // defpackage.ea
    public final void h() {
        String[] strArr;
        for (String str : this.T) {
            ((io.mrarm.mctoolbox.bridge.b) this.R).P(str, this.U);
        }
        K();
    }
}