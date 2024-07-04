package defpackage;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.util.HashMap;

/* renamed from: ua  reason: default package */
public final class ua extends Provider implements bf {
    public static final va P = new va();
    public static final HashMap Q = new HashMap();
    public static final String[] R = {"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF"};
    public static final String[] S = {"SipHash", "Poly1305"};
    public static final String[] T = {"AES", "ARC4", "ARIA", "Blowfish", "Camellia", "CAST5", "CAST6", "ChaCha", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Shacal2", "Skipjack", "SM4", "TEA", "Twofish", "Threefish", "VMPC", "VMPCKSA3", "XTEA", "XSalsa20", "OpenSSLPBKDF", "DSTU7624"};
    public static final String[] U = {"X509", "IES"};
    public static final String[] V = {"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM"};
    public static final String[] W = {"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "DSTU7564"};
    public static final String[] X = {"BC", "BCFKS", "PKCS12"};
    public static final String[] Y = {"DRBG"};

    /* renamed from: ua$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements PrivilegedAction {
        public a() {
        }

        @Override // java.security.PrivilegedAction
        public final Object run() {
            ua uaVar = ua.this;
            uaVar.d("org.spongycastle.jcajce.provider.digest.", ua.W);
            uaVar.d("org.spongycastle.jcajce.provider.symmetric.", ua.R);
            uaVar.d("org.spongycastle.jcajce.provider.symmetric.", ua.S);
            uaVar.d("org.spongycastle.jcajce.provider.symmetric.", ua.T);
            uaVar.d("org.spongycastle.jcajce.provider.asymmetric.", ua.U);
            uaVar.d("org.spongycastle.jcajce.provider.asymmetric.", ua.V);
            uaVar.d("org.spongycastle.jcajce.provider.keystore.", ua.X);
            uaVar.d("org.spongycastle.jcajce.provider.drbg.", ua.Y);
            uaVar.c(hd0.d, new ot0());
            uaVar.c(hd0.e, new w60());
            uaVar.c(hd0.f, new n81());
            uaVar.c(hd0.g, new p81());
            uaVar.c(hd0.b, new x40());
            uaVar.c(hd0.c, new r40());
            uaVar.c(hd0.a, new mj0());
            uaVar.put("X509Store.CERTIFICATE/COLLECTION", "org.spongycastle.jce.provider.X509StoreCertCollection");
            uaVar.put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.spongycastle.jce.provider.X509StoreAttrCertCollection");
            uaVar.put("X509Store.CRL/COLLECTION", "org.spongycastle.jce.provider.X509StoreCRLCollection");
            uaVar.put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.spongycastle.jce.provider.X509StoreCertPairCollection");
            uaVar.put("X509Store.CERTIFICATE/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPCerts");
            uaVar.put("X509Store.CRL/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPCRLs");
            uaVar.put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPAttrCerts");
            uaVar.put("X509Store.CERTIFICATEPAIR/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPCertPairs");
            uaVar.put("X509StreamParser.CERTIFICATE", "org.spongycastle.jce.provider.X509CertParser");
            uaVar.put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.spongycastle.jce.provider.X509AttrCertParser");
            uaVar.put("X509StreamParser.CRL", "org.spongycastle.jce.provider.X509CRLParser");
            uaVar.put("X509StreamParser.CERTIFICATEPAIR", "org.spongycastle.jce.provider.X509CertPairParser");
            uaVar.put("Cipher.BROKENPBEWITHMD5ANDDES", "org.spongycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
            uaVar.put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.spongycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
            uaVar.put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.spongycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
            uaVar.put("CertPathValidator.RFC3281", "org.spongycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
            uaVar.put("CertPathBuilder.RFC3281", "org.spongycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
            uaVar.put("CertPathValidator.RFC3280", "org.spongycastle.jce.provider.PKIXCertPathValidatorSpi");
            uaVar.put("CertPathBuilder.RFC3280", "org.spongycastle.jce.provider.PKIXCertPathBuilderSpi");
            uaVar.put("CertPathValidator.PKIX", "org.spongycastle.jce.provider.PKIXCertPathValidatorSpi");
            uaVar.put("CertPathBuilder.PKIX", "org.spongycastle.jce.provider.PKIXCertPathBuilderSpi");
            uaVar.put("CertStore.Collection", "org.spongycastle.jce.provider.CertStoreCollectionSpi");
            uaVar.put("CertStore.LDAP", "org.spongycastle.jce.provider.X509LDAPCertStoreSpi");
            uaVar.put("CertStore.Multi", "org.spongycastle.jce.provider.MultiCertStoreSpi");
            uaVar.put("Alg.Alias.CertStore.X509LDAP", "LDAP");
            return null;
        }
    }

    public ua() {
        super("SC", 1.58d, "BouncyCastle Security Provider v1.58");
        AccessController.doPrivileged(new a());
    }

    public final void a(String str, String str2) {
        if (!containsKey(str)) {
            put(str, str2);
            return;
        }
        throw new IllegalStateException(ij.c("duplicate provider key (", str, ") found"));
    }

    public final void b(String str, HashMap hashMap) {
        for (String str2 : hashMap.keySet()) {
            String c = ij.c(str, " ", str2);
            if (!containsKey(c)) {
                put(c, hashMap.get(str2));
            } else {
                throw new IllegalStateException(ij.c("duplicate provider attribute key (", c, ") found"));
            }
        }
    }

    public final void c(o oVar, n7 n7Var) {
        HashMap hashMap = Q;
        synchronized (hashMap) {
            hashMap.put(oVar, n7Var);
        }
    }

    public final void d(String str, String[] strArr) {
        Class<?> cls;
        for (int i = 0; i != strArr.length; i++) {
            String d = qq.d(e5.b(str), strArr[i], "$Mappings");
            try {
                ClassLoader classLoader = ua.class.getClassLoader();
                if (classLoader != null) {
                    cls = classLoader.loadClass(d);
                } else {
                    cls = (Class) AccessController.doPrivileged(new ed(d));
                }
            } catch (ClassNotFoundException unused) {
                cls = null;
            }
            if (cls != null) {
                try {
                    ((v3) cls.newInstance()).configure(this);
                } catch (Exception e) {
                    StringBuilder c = yg.c("cannot create instance of ", str);
                    c.append(strArr[i]);
                    c.append("$Mappings : ");
                    c.append(e);
                    throw new InternalError(c.toString());
                }
            }
        }
    }
}