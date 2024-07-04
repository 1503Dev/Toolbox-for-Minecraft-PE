package org.spongycastle.jcajce.provider.asymmetric.ec;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.util.Collections;
import java.util.Hashtable;

public abstract class KeyPairGeneratorSpi extends KeyPairGenerator {

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class ECDSA extends a {
        public ECDSA() {
            super("ECDSA", ua.P);
        }
    }

    public KeyPairGeneratorSpi(String str) {
        super(str);
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends KeyPairGeneratorSpi {
        private static Hashtable ecParameters;
        public String algorithm;
        public int certainty;
        public jg0 configuration;
        public Object ecParams;
        public nn engine;
        public boolean initialised;
        public mn param;
        public SecureRandom random;
        public int strength;

        static {
            Hashtable hashtable = new Hashtable();
            ecParameters = hashtable;
            hashtable.put(192, new ECGenParameterSpec("prime192v1"));
            ecParameters.put(239, new ECGenParameterSpec("prime239v1"));
            ecParameters.put(256, new ECGenParameterSpec("prime256v1"));
            ecParameters.put(224, new ECGenParameterSpec("P-224"));
            ecParameters.put(384, new ECGenParameterSpec("P-384"));
            ecParameters.put(521, new ECGenParameterSpec("P-521"));
        }

        public a() {
            super("EC");
            this.engine = new nn();
            this.ecParams = null;
            this.strength = 239;
            this.certainty = 50;
            this.random = new SecureRandom();
            this.initialised = false;
            this.algorithm = "EC";
            this.configuration = ua.P;
        }

        public a(String str, jg0 jg0Var) {
            super(str);
            this.engine = new nn();
            this.ecParams = null;
            this.strength = 239;
            this.certainty = 50;
            this.random = new SecureRandom();
            this.initialised = false;
            this.algorithm = str;
            this.configuration = jg0Var;
        }

        public mn createKeyGenParamsBC(un unVar, SecureRandom secureRandom) {
            return new mn(new in(unVar.a, unVar.c, unVar.d, unVar.e), secureRandom);
        }

        public mn createKeyGenParamsJCE(ECParameterSpec eCParameterSpec, SecureRandom secureRandom) {
            hn a = en.a(eCParameterSpec.getCurve());
            return new mn(new in(a, en.c(a, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), secureRandom);
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public sn createNamedCurveSpec(String str) {
            String str2;
            g81 g;
            try {
                if (str.charAt(0) >= '0' && str.charAt(0) <= '2') {
                    g = h50.h(new o(str));
                } else {
                    if (str.indexOf(32) > 0) {
                        str2 = str.substring(str.indexOf(32) + 1);
                    } else {
                        str2 = str;
                    }
                    try {
                        g = h50.g(str2);
                    } catch (IllegalArgumentException unused) {
                        g = h50.g(str2);
                        if (g == null) {
                        }
                        return new sn(str, g.Q, g.p(), g.S, g.T);
                    }
                }
            } catch (IllegalArgumentException unused2) {
                str2 = str;
            }
            if (g == null) {
                try {
                    o oVar = new o(str);
                    g81 b = d81.b(oVar);
                    if (b == null) {
                        b = rm0.d(oVar);
                    }
                    if (b == null) {
                        b = ew0.b(oVar);
                    }
                    if (b == null) {
                        b = b.a(oVar);
                    }
                    if (b == null) {
                        g = ys.b(oVar);
                    } else {
                        g = b;
                    }
                    if (g == null && (g = (g81) Collections.unmodifiableMap(((va) this.configuration).c).get(new o(str))) == null) {
                        throw new InvalidAlgorithmParameterException("unknown curve OID: " + str);
                    }
                } catch (IllegalArgumentException unused3) {
                    throw new InvalidAlgorithmParameterException(k6.b("unknown curve name: ", str));
                }
            }
            return new sn(str, g.Q, g.p(), g.S, g.T);
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public KeyPair generateKeyPair() {
            BigInteger bigInteger;
            int bitCount;
            if (!this.initialised) {
                initialize(this.strength, new SecureRandom());
            }
            nn nnVar = this.engine;
            BigInteger bigInteger2 = nnVar.g.j;
            int bitLength = bigInteger2.bitLength();
            int i = bitLength >>> 2;
            while (true) {
                bigInteger = new BigInteger(bitLength, nnVar.h);
                if (bigInteger.compareTo(gn.c) >= 0 && bigInteger.compareTo(bigInteger2) < 0) {
                    if (bigInteger.signum() == 0) {
                        bitCount = 0;
                    } else {
                        bitCount = bigInteger.shiftLeft(1).add(bigInteger).xor(bigInteger).bitCount();
                    }
                    if (bitCount >= i) {
                        break;
                    }
                }
            }
            co coVar = new co(new eq().J0(nnVar.g.i, bigInteger), nnVar.g);
            zn znVar = new zn(bigInteger, nnVar.g);
            Object obj = this.ecParams;
            if (obj instanceof un) {
                un unVar = (un) obj;
                z7 z7Var = new z7(this.algorithm, coVar, unVar, this.configuration);
                return new KeyPair(z7Var, new y7(this.algorithm, znVar, z7Var, unVar, this.configuration));
            } else if (obj == null) {
                String str = this.algorithm;
                jg0 jg0Var = this.configuration;
                return new KeyPair(new z7(str, coVar, jg0Var), new y7(str, znVar, jg0Var));
            } else {
                ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
                z7 z7Var2 = new z7(this.algorithm, coVar, eCParameterSpec, this.configuration);
                return new KeyPair(z7Var2, new y7(this.algorithm, znVar, z7Var2, eCParameterSpec, this.configuration));
            }
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public void initialize(int i, SecureRandom secureRandom) {
            this.strength = i;
            this.random = secureRandom;
            ECGenParameterSpec eCGenParameterSpec = (ECGenParameterSpec) ecParameters.get(Integer.valueOf(i));
            if (eCGenParameterSpec == null) {
                throw new InvalidParameterException("unknown key size.");
            }
            try {
                initialize(eCGenParameterSpec, secureRandom);
            } catch (InvalidAlgorithmParameterException unused) {
                throw new InvalidParameterException("key size not configurable.");
            }
        }

        public void initializeNamedCurve(String str, SecureRandom secureRandom) {
            sn createNamedCurveSpec = createNamedCurveSpec(str);
            this.ecParams = createNamedCurveSpec;
            this.param = createKeyGenParamsJCE(createNamedCurveSpec, secureRandom);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            mn createKeyGenParamsJCE;
            un unVar;
            SecureRandom secureRandom2;
            if (algorithmParameterSpec == null) {
                unVar = ((va) this.configuration).a();
                if (unVar == null) {
                    throw new InvalidAlgorithmParameterException("null parameter passed but no implicitCA set");
                }
                this.ecParams = null;
            } else if (!(algorithmParameterSpec instanceof un)) {
                if (algorithmParameterSpec instanceof ECParameterSpec) {
                    this.ecParams = algorithmParameterSpec;
                    createKeyGenParamsJCE = createKeyGenParamsJCE((ECParameterSpec) algorithmParameterSpec, secureRandom);
                    this.param = createKeyGenParamsJCE;
                    nn nnVar = this.engine;
                    mn mnVar = this.param;
                    nnVar.getClass();
                    secureRandom2 = mnVar.a;
                    nnVar.h = secureRandom2;
                    nnVar.g = mnVar.b;
                    if (secureRandom2 == null) {
                        nnVar.h = new SecureRandom();
                    }
                    this.initialised = true;
                }
                if (algorithmParameterSpec instanceof ECGenParameterSpec) {
                    initializeNamedCurve(((ECGenParameterSpec) algorithmParameterSpec).getName(), secureRandom);
                } else if (!(algorithmParameterSpec instanceof qn)) {
                    throw new InvalidAlgorithmParameterException("parameter object not a ECParameterSpec");
                } else {
                    qn qnVar = (qn) algorithmParameterSpec;
                    initializeNamedCurve(null, secureRandom);
                }
                nn nnVar2 = this.engine;
                mn mnVar2 = this.param;
                nnVar2.getClass();
                secureRandom2 = mnVar2.a;
                nnVar2.h = secureRandom2;
                nnVar2.g = mnVar2.b;
                if (secureRandom2 == null) {
                }
                this.initialised = true;
            } else {
                this.ecParams = algorithmParameterSpec;
                unVar = (un) algorithmParameterSpec;
            }
            createKeyGenParamsJCE = createKeyGenParamsBC(unVar, secureRandom);
            this.param = createKeyGenParamsJCE;
            nn nnVar22 = this.engine;
            mn mnVar22 = this.param;
            nnVar22.getClass();
            secureRandom2 = mnVar22.a;
            nnVar22.h = secureRandom2;
            nnVar22.g = mnVar22.b;
            if (secureRandom2 == null) {
            }
            this.initialised = true;
        }
    }
}