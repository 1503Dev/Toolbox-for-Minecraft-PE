package defpackage;

import defpackage.hn;
import java.math.BigInteger;
import java.util.Hashtable;

/* renamed from: b  reason: default package */
public final class b {
    public static a a = new a();
    public static final Hashtable b;
    public static final Hashtable c;
    public static final Hashtable d;

    /* renamed from: b$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends h81 {
        @Override // defpackage.h81
        public final g81 a() {
            BigInteger bigInteger = new BigInteger(1, qu.a("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C03"));
            BigInteger bigInteger2 = new BigInteger(1, qu.a("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C00"));
            BigInteger bigInteger3 = new BigInteger(1, qu.a("EE353FCA5428A9300D4ABA754A44C00FDFEC0C9AE4B1A1803075ED967B7BB73F"));
            BigInteger bigInteger4 = new BigInteger(1, qu.a("F1FD178C0B3AD58F10126DE8CE42435B53DC67E140D2BF941FFDD459C6D655E1"));
            BigInteger valueOf = BigInteger.valueOf(1L);
            hn.d dVar = new hn.d(bigInteger, bigInteger2, bigInteger3, bigInteger4, valueOf);
            return new g81(dVar, new i81(dVar, qu.a("04B6B3D4C356C139EB31183D4749D423958C27D2DCAF98B70164C97A2DD98F5CFF6142E0F7C8B204911F9271F0F3ECEF8C2701C307E8E4C9E183115A1554062CFB")), bigInteger4, valueOf, null);
        }
    }

    static {
        Hashtable hashtable = new Hashtable();
        b = hashtable;
        Hashtable hashtable2 = new Hashtable();
        c = hashtable2;
        Hashtable hashtable3 = new Hashtable();
        d = hashtable3;
        o oVar = c.a;
        a aVar = a;
        hashtable.put(hu0.b("FRP256v1"), oVar);
        hashtable3.put(oVar, "FRP256v1");
        hashtable2.put(oVar, aVar);
    }

    public static g81 a(o oVar) {
        h81 h81Var = (h81) c.get(oVar);
        if (h81Var == null) {
            return null;
        }
        return h81Var.b();
    }
}