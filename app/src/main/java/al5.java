package defpackage;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: al5  reason: default package */
public abstract class al5 extends a06 {
    public final int P;

    public al5(byte[] bArr) {
        if (!(bArr.length == 25)) {
            throw new IllegalArgumentException();
        }
        this.P = Arrays.hashCode(bArr);
    }

    public static byte[] Z(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public abstract byte[] c0();

    @Override // defpackage.z06
    public final int d() {
        return this.P;
    }

    public final boolean equals(Object obj) {
        va0 i;
        if (obj != null && (obj instanceof z06)) {
            try {
                z06 z06Var = (z06) obj;
                if (z06Var.d() == this.P && (i = z06Var.i()) != null) {
                    return Arrays.equals(c0(), (byte[]) va0.c0(i));
                }
                return false;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.P;
    }

    @Override // defpackage.z06
    public final va0 i() {
        return new va0(c0());
    }
}