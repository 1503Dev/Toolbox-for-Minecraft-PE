package org.spongycastle.jcajce.provider.digest;

public final class SHA256 {

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class Mappings extends ul {
        private static final String PREFIX = SHA256.class.getName();

        @Override // defpackage.v3
        public void configure(bf bfVar) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            ua uaVar = (ua) bfVar;
            uaVar.a("MessageDigest.SHA-256", qq.d(sb, str, "$Digest"));
            uaVar.a("Alg.Alias.MessageDigest.SHA256", "SHA-256");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Alg.Alias.MessageDigest.");
            o oVar = z60.a;
            sb2.append(oVar);
            uaVar.a(sb2.toString(), "SHA-256");
            uaVar.a("SecretKeyFactory.PBEWITHHMACSHA256", str + "$PBEWithMacKeyFactory");
            uaVar.a("Alg.Alias.SecretKeyFactory.PBEWITHHMACSHA-256", "PBEWITHHMACSHA256");
            uaVar.a("Alg.Alias.SecretKeyFactory." + oVar, "PBEWITHHMACSHA256");
            uaVar.a("Mac.PBEWITHHMACSHA256", str + "$HashMac");
            addHMACAlgorithm(uaVar, "SHA256", str + "$HashMac", k6.b(str, "$KeyGenerator"));
            addHMACAlias(uaVar, "SHA256", fd0.a);
            addHMACAlias(uaVar, "SHA256", oVar);
        }
    }
}