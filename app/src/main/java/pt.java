package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import javax.annotation.Nullable;

/* renamed from: pt  reason: default package */
public final class pt {
    @Nullable
    public static pt a;

    public pt(Context context) {
        context.getApplicationContext();
    }

    @Nullable
    public static final al5 a(PackageInfo packageInfo, al5... al5VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        pl5 pl5Var = new pl5(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < al5VarArr.length; i++) {
            if (al5VarArr[i].equals(pl5Var)) {
                return al5VarArr[i];
            }
        }
        return null;
    }

    public static final boolean b(PackageInfo packageInfo) {
        return (packageInfo == null || packageInfo.signatures == null || a(packageInfo, tn5.a) == null) ? false : true;
    }
}