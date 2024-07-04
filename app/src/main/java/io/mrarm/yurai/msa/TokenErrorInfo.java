package io.mrarm.yurai.msa;

public final class TokenErrorInfo {
    public long sharedHandle;

    public TokenErrorInfo(long j) {
        this.sharedHandle = j;
    }

    private static native void nativeDestroy(long j);

    private static native String nativeGetInlineAuthUrl(long j);

    public void finalize() {
        nativeDestroy(this.sharedHandle);
        super.finalize();
    }

    public String getInlineAuthUrl() {
        return nativeGetInlineAuthUrl(this.sharedHandle);
    }
}