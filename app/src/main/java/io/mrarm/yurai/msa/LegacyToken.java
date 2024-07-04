package io.mrarm.yurai.msa;

import io.mrarm.yurai.msa.Token;

public final class LegacyToken extends Token {
    private LegacyToken(long j) {
        super(j);
    }

    public LegacyToken(SecurityScope securityScope, Token.TimePoint timePoint, Token.TimePoint timePoint2, String str, String str2) {
        super(nativeCreate(securityScope != null ? securityScope.getAddress() : null, securityScope != null ? securityScope.getPolicyRef() : null, timePoint.value, timePoint2.value, str, str2));
    }

    private static native long nativeCreate(String str, String str2, long j, long j2, String str3, String str4);
}