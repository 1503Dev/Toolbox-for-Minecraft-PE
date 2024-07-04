package io.mrarm.yurai.xbox;

import android.util.Log;
import com.microsoft.xbox.idp.interop.Interop;
import io.mrarm.yurai.msa.AccountManager;
import io.mrarm.yurai.msa.CompactToken;
import io.mrarm.yurai.msa.MSASingleton;
import io.mrarm.yurai.msa.SecurityScope;
import io.mrarm.yurai.msa.TokenResponse;

public class CLLAuthProvider {
    public static final SecurityScope a = new SecurityScope("vortex.data.microsoft.com", "mbi_ssl");

    public static String refreshCllMsaToken(String str) {
        MSASingleton mSASingleton = MSASingleton.getInstance(null);
        if (mSASingleton == null) {
            return null;
        }
        try {
            try {
                TokenResponse[] requestTokens = mSASingleton.getAccountManager().findAccount(str).requestTokens(mSASingleton.getLoginManager(), new SecurityScope[]{a}, "android-app://com.mojang.minecraftpe.H62DKCBHJP6WXXIV7RBFOGOL4NAK4E6Y");
                if (requestTokens.length == 1 && requestTokens[0].getToken() != null && (requestTokens[0].getToken() instanceof CompactToken)) {
                    return ((CompactToken) requestTokens[0].getToken()).getBinaryToken();
                }
                Log.e("CLLAuthProvider", "Failed to get token: no token found");
                return null;
            } catch (Exception e) {
                Log.e("CLLAuthProvider", "Failed to get token");
                e.printStackTrace();
                return null;
            }
        } catch (AccountManager.NoSuchAccountException unused) {
            Log.e("CLLAuthProvider", "Account not found: " + str);
            return null;
        }
    }

    public static String refreshCllXTicket(String str) {
        return Interop.GetXTokenCallback(str);
    }

    public static String refreshCllXToken(boolean z) {
        return Interop.GetLiveXTokenCallback(z);
    }
}