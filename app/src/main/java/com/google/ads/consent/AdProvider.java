package com.google.ads.consent;

public final class AdProvider {
    @wq0("company_id")
    private String id;
    @wq0("company_name")
    private String name;
    @wq0("policy_url")
    private String privacyPolicyUrlString;

    public final String a() {
        return this.id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdProvider.class != obj.getClass()) {
            return false;
        }
        return this.id.equals(((AdProvider) obj).id);
    }

    public final int hashCode() {
        return this.id.hashCode();
    }
}