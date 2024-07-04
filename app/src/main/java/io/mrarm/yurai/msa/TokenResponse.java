package io.mrarm.yurai.msa;

public class TokenResponse {
    private SecurityScope securityScope;
    private Token token;
    private TokenErrorInfo tokenErrorInfo;

    private TokenResponse(String str, String str2, Token token, long j) {
        this.securityScope = new SecurityScope(str, str2);
        this.token = token;
        if (j != 0) {
            this.tokenErrorInfo = new TokenErrorInfo(j);
        }
    }

    public SecurityScope getSecurityScope() {
        return this.securityScope;
    }

    public Token getToken() {
        return this.token;
    }

    public TokenErrorInfo getTokenErrorInfo() {
        return this.tokenErrorInfo;
    }
}