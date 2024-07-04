package defpackage;

import android.util.Log;
import defpackage.z20;
import io.mrarm.yurai.msa.AccountManager;
import io.mrarm.yurai.msa.CompactToken;
import io.mrarm.yurai.msa.MSASingleton;
import io.mrarm.yurai.msa.SecurityScope;
import io.mrarm.yurai.msa.TokenResponse;

/* renamed from: s60  reason: default package */
public final class s60 extends z20 {
    public String b;

    public s60(String str) {
        this.b = str;
    }

    @Override // defpackage.z20
    public final void g() {
        MSASingleton mSASingleton = MSASingleton.getInstance(this.a);
        try {
            TokenResponse[] requestTokens = mSASingleton.getAccountManager().findAccount(this.b).requestTokens(mSASingleton.getLoginManager(), new SecurityScope[]{d91.b}, "android-app://com.mojang.minecraftpe.H62DKCBHJP6WXXIV7RBFOGOL4NAK4E6Y");
            if (requestTokens.length == 1) {
                if (requestTokens[0].getTokenErrorInfo() != null) {
                    Log.e("MsaTokenStage", "Has token error info");
                    String inlineAuthUrl = requestTokens[0].getTokenErrorInfo().getInlineAuthUrl();
                    if (inlineAuthUrl != null && !inlineAuthUrl.isEmpty()) {
                        e(new h61(this.b, inlineAuthUrl));
                        return;
                    }
                }
                if (requestTokens[0].getToken() != null && (requestTokens[0].getToken() instanceof CompactToken)) {
                    Log.i("MsaTokenStage", "Got token!");
                    e(new c91(this.b, ((CompactToken) requestTokens[0].getToken()).getBinaryToken()));
                    return;
                }
                throw new z20.a("Failed to get token: token is null or is not a CompactToken");
            }
            StringBuilder b = e5.b("Failed to get token: length is ");
            b.append(requestTokens.length);
            throw new z20.a(b.toString());
        } catch (AccountManager.NoSuchAccountException e) {
            throw new z20.a(e);
        }
    }
}