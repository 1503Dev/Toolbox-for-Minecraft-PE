package io.mrarm.yurai.msa;

public class SecurityScope {
    private String address;
    private String policyRef;

    public SecurityScope(String str) {
        this.address = str;
    }

    public SecurityScope(String str, String str2) {
        this.address = str;
        this.policyRef = str2;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPolicyRef() {
        return this.policyRef;
    }
}