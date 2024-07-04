package io.mrarm.yurai.msa;

public class Account {
    public long sharedHandle;

    public Account(long j) {
        this.sharedHandle = j;
    }

    private static native void nativeDestroy(long j);

    private static native String nativeGetPUID(long j);

    private static native TokenResponse[] nativeRequestTokens(long j, long j2, String[] strArr, String[] strArr2, String str);

    private static native void nativeUpdateDetails(long j, String str, long j2);

    public void finalize() {
        nativeDestroy(this.sharedHandle);
        super.finalize();
    }

    public String getPUID() {
        return nativeGetPUID(this.sharedHandle);
    }

    public TokenResponse[] requestTokens(LoginManager loginManager, SecurityScope[] securityScopeArr, String str) {
        String[] strArr = new String[securityScopeArr.length];
        String[] strArr2 = new String[securityScopeArr.length];
        for (int i = 0; i < securityScopeArr.length; i++) {
            strArr[i] = securityScopeArr[i].getAddress();
            strArr2[i] = securityScopeArr[i].getPolicyRef();
        }
        return nativeRequestTokens(this.sharedHandle, loginManager.handle, strArr, strArr2, str);
    }

    public void updateDetails(String str, Token token) {
        nativeUpdateDetails(this.sharedHandle, str, token.sharedHandle);
    }
}