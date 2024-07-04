package defpackage;

import io.mrarm.yurai.msa.LegacyToken;
import io.mrarm.yurai.msa.Token;
import java.util.HashMap;

/* renamed from: kz  reason: default package */
public final class kz {
    public HashMap a = new HashMap();

    public final String a(String str) {
        return (String) this.a.get(str);
    }

    public final LegacyToken b() {
        String a = a("DAToken");
        String a2 = a("DASessionKey");
        if (a == null || a2 == null) {
            return null;
        }
        return new LegacyToken(null, Token.TimePoint.fromString(a("DAStartTime")), Token.TimePoint.fromString(a("DAExpires")), a, a2);
    }
}