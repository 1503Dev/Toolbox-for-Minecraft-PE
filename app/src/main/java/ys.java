package defpackage;

import defpackage.hn;
import java.math.BigInteger;
import java.util.Hashtable;

/* renamed from: ys  reason: default package */
public final class ys {
    public static a a = new a();
    public static b b = new b();
    public static final Hashtable c;
    public static final Hashtable d;
    public static final Hashtable e;

    /* renamed from: ys$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends h81 {
        @Override // defpackage.h81
        public final g81 a() {
            BigInteger a = ys.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF");
            BigInteger a2 = ys.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC");
            BigInteger a3 = ys.a("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93");
            BigInteger a4 = ys.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123");
            BigInteger valueOf = BigInteger.valueOf(1L);
            hn.d dVar = new hn.d(a, a2, a3, a4, valueOf);
            return new g81(dVar, new i81(dVar, qu.a("0432C4AE2C1F1981195F9904466A39C9948FE30BBFF2660BE1715A4589334C74C7BC3736A2F4F6779C59BDCEE36B692153D0A9877CC62A474002DF32E52139F0A0")), a4, valueOf, null);
        }
    }

    /* renamed from: ys$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b extends h81 {
        @Override // defpackage.h81
        public final g81 a() {
            BigInteger a = ys.a("BDB6F4FE3E8B1D9E0DA8C0D46F4C318CEFE4AFE3B6B8551F");
            BigInteger a2 = ys.a("BB8E5E8FBC115E139FE6A814FE48AAA6F0ADA1AA5DF91985");
            BigInteger a3 = ys.a("1854BEBDC31B21B7AEFC80AB0ECD10D5B1B3308E6DBF11C1");
            BigInteger a4 = ys.a("BDB6F4FE3E8B1D9E0DA8C0D40FC962195DFAE76F56564677");
            BigInteger valueOf = BigInteger.valueOf(1L);
            hn.d dVar = new hn.d(a, a2, a3, a4, valueOf);
            return new g81(dVar, new i81(dVar, qu.a("044AD5F7048DE709AD51236DE65E4D4B482C836DC6E410664002BB3A02D4AAADACAE24817A4CA3A1B014B5270432DB27D2")), a4, valueOf, null);
        }
    }

    static {
        Hashtable hashtable = new Hashtable();
        c = hashtable;
        Hashtable hashtable2 = new Hashtable();
        d = hashtable2;
        Hashtable hashtable3 = new Hashtable();
        e = hashtable3;
        o oVar = zs.b;
        b bVar = b;
        hashtable.put(hu0.b("wapip192v1"), oVar);
        hashtable3.put(oVar, "wapip192v1");
        hashtable2.put(oVar, bVar);
        o oVar2 = zs.a;
        a aVar = a;
        hashtable.put(hu0.b("sm2p256v1"), oVar2);
        hashtable3.put(oVar2, "sm2p256v1");
        hashtable2.put(oVar2, aVar);
    }

    public static BigInteger a(String str) {
        return new BigInteger(1, qu.a(str));
    }

    public static g81 b(o oVar) {
        h81 h81Var = (h81) d.get(oVar);
        if (h81Var == null) {
            return null;
        }
        return h81Var.b();
    }
}