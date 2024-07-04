package io.mrarm.yurai.msa;

public final class CompactToken extends Token {
    private CompactToken(long j) {
        super(j);
    }

    private static native String nativeGetBinaryToken(long j);

    public String getBinaryToken() {
        return nativeGetBinaryToken(this.sharedHandle);
    }
}