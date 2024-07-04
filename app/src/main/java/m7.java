package defpackage;

/* renamed from: m7  reason: default package */
public abstract class m7 extends v3 {
    public void addSignatureAlgorithm(bf bfVar, String str, String str2, String str3, o oVar) {
        String c = ij.c(str, "WITH", str2);
        String c2 = ij.c(str, "with", str2);
        String c3 = ij.c(str, "With", str2);
        String c4 = ij.c(str, "/", str2);
        ua uaVar = (ua) bfVar;
        uaVar.a(k6.b("Signature.", c), str3);
        uaVar.a("Alg.Alias.Signature." + c2, c);
        uaVar.a("Alg.Alias.Signature." + c3, c);
        uaVar.a("Alg.Alias.Signature." + c4, c);
        uaVar.a("Alg.Alias.Signature." + oVar, c);
        uaVar.a("Alg.Alias.Signature.OID." + oVar, c);
    }

    public void registerOid(bf bfVar, o oVar, String str, n7 n7Var) {
        ua uaVar = (ua) bfVar;
        uaVar.a("Alg.Alias.KeyFactory." + oVar, str);
        uaVar.a("Alg.Alias.KeyPairGenerator." + oVar, str);
        uaVar.c(oVar, n7Var);
    }

    public void registerOidAlgorithmParameterGenerator(bf bfVar, o oVar, String str) {
        ua uaVar = (ua) bfVar;
        uaVar.a("Alg.Alias.AlgorithmParameterGenerator." + oVar, str);
        uaVar.a("Alg.Alias.AlgorithmParameters." + oVar, str);
    }

    public void registerOidAlgorithmParameters(bf bfVar, o oVar, String str) {
        ((ua) bfVar).a("Alg.Alias.AlgorithmParameters." + oVar, str);
    }
}