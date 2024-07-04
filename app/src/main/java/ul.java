package defpackage;

/* renamed from: ul  reason: default package */
public abstract class ul extends v3 {
    public void addHMACAlgorithm(bf bfVar, String str, String str2, String str3) {
        String b = k6.b("HMAC", str);
        ua uaVar = (ua) bfVar;
        uaVar.a(k6.b("Mac.", b), str2);
        uaVar.a("Alg.Alias.Mac.HMAC-" + str, b);
        uaVar.a("Alg.Alias.Mac.HMAC/" + str, b);
        uaVar.a("KeyGenerator." + b, str3);
        uaVar.a("Alg.Alias.KeyGenerator.HMAC-" + str, b);
        uaVar.a("Alg.Alias.KeyGenerator.HMAC/" + str, b);
    }

    public void addHMACAlias(bf bfVar, String str, o oVar) {
        String b = k6.b("HMAC", str);
        ua uaVar = (ua) bfVar;
        uaVar.a("Alg.Alias.Mac." + oVar, b);
        uaVar.a("Alg.Alias.KeyGenerator." + oVar, b);
    }
}