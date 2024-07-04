package defpackage;

import java.math.BigInteger;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

/* renamed from: ju1  reason: default package */
public final class ju1 extends X509Certificate {
    public final X509Certificate P;
    public final byte[] Q;

    public ju1(X509Certificate x509Certificate, byte[] bArr) {
        this.P = x509Certificate;
        this.Q = bArr;
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: a */
    public final void checkValidity() {
        this.P.checkValidity();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: b */
    public final void checkValidity(Date date) {
        this.P.checkValidity(date);
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: c */
    public final int getBasicConstraints() {
        return this.P.getBasicConstraints();
    }

    @Override // java.security.cert.X509Extension
    /* renamed from: d */
    public final Set getCriticalExtensionOIDs() {
        return this.P.getCriticalExtensionOIDs();
    }

    @Override // java.security.cert.X509Extension
    /* renamed from: e */
    public final byte[] getExtensionValue(String str) {
        return this.P.getExtensionValue(str);
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: f */
    public final Principal getIssuerDN() {
        return this.P.getIssuerDN();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: g */
    public final boolean[] getIssuerUniqueID() {
        return this.P.getIssuerUniqueID();
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.Q;
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: h */
    public final boolean[] getKeyUsage() {
        return this.P.getKeyUsage();
    }

    @Override // java.security.cert.X509Extension
    /* renamed from: i */
    public final Set getNonCriticalExtensionOIDs() {
        return this.P.getNonCriticalExtensionOIDs();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: j */
    public final Date getNotAfter() {
        return this.P.getNotAfter();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: k */
    public final Date getNotBefore() {
        return this.P.getNotBefore();
    }

    @Override // java.security.cert.Certificate
    /* renamed from: l */
    public final PublicKey getPublicKey() {
        return this.P.getPublicKey();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: m */
    public final BigInteger getSerialNumber() {
        return this.P.getSerialNumber();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: n */
    public final String getSigAlgName() {
        return this.P.getSigAlgName();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: o */
    public final String getSigAlgOID() {
        return this.P.getSigAlgOID();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: p */
    public final byte[] getSigAlgParams() {
        return this.P.getSigAlgParams();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: q */
    public final byte[] getSignature() {
        return this.P.getSignature();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: r */
    public final Principal getSubjectDN() {
        return this.P.getSubjectDN();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: s */
    public final boolean[] getSubjectUniqueID() {
        return this.P.getSubjectUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: t */
    public final byte[] getTBSCertificate() {
        return this.P.getTBSCertificate();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: u */
    public final int getVersion() {
        return this.P.getVersion();
    }

    @Override // java.security.cert.X509Extension
    /* renamed from: v */
    public final boolean hasUnsupportedCriticalExtension() {
        return this.P.hasUnsupportedCriticalExtension();
    }

    @Override // java.security.cert.Certificate
    /* renamed from: w */
    public final String toString() {
        return this.P.toString();
    }

    @Override // java.security.cert.Certificate
    /* renamed from: y */
    public final void verify(PublicKey publicKey) {
        this.P.verify(publicKey);
    }

    @Override // java.security.cert.Certificate
    /* renamed from: z */
    public final void verify(PublicKey publicKey, String str) {
        this.P.verify(publicKey, str);
    }
}