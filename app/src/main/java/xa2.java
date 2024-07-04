package defpackage;

import java.security.Provider;
import java.security.Signature;

/* renamed from: xa2  reason: default package */
public class xa2 implements hc5 {
    @Override // defpackage.hc5
    public final /* bridge */ /* synthetic */ Object c(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}