package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: qs4  reason: default package */
public final class qs4 {
    public static final gs4 a = new gs4("PhoneskyVerificationUtils");

    public static boolean a(Context context) {
        String str;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr != null && (r0 = signatureArr.length) != 0) {
                    for (Signature signature : signatureArr) {
                        byte[] byteArray = signature.toByteArray();
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                            messageDigest.update(byteArray);
                            str = Base64.encodeToString(messageDigest.digest(), 11);
                        } catch (NoSuchAlgorithmException unused) {
                            str = "";
                        }
                        if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                            if ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                                return true;
                            }
                        } else {
                            return true;
                        }
                    }
                } else {
                    gs4 gs4Var = a;
                    Object[] objArr = new Object[0];
                    gs4Var.getClass();
                    if (Log.isLoggable("PlayCore", 5)) {
                        Log.w("PlayCore", gs4.d(gs4Var.a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return false;
    }
}