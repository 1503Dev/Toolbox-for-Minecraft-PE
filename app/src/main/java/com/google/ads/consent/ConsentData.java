package com.google.ads.consent;

import java.util.HashSet;

class ConsentData {
    private static final String SDK_PLATFORM = "android";
    private static final String SDK_VERSION = "1.0.8";
    @wq0("consent_source")
    private String consentSource;
    @wq0("providers")
    private HashSet<AdProvider> adProviders = new HashSet<>();
    @wq0("consented_providers")
    private HashSet<AdProvider> consentedAdProviders = new HashSet<>();
    @wq0("pub_ids")
    private HashSet<String> publisherIds = new HashSet<>();
    @wq0("tag_for_under_age_of_consent")
    private Boolean underAgeOfConsent = Boolean.FALSE;
    @wq0("consent_state")
    private ConsentStatus consentStatus = ConsentStatus.UNKNOWN;
    @wq0("is_request_in_eea_or_unknown")
    private boolean isRequestLocationInEeaOrUnknown = false;
    @wq0("has_any_npa_pub_id")
    private boolean hasNonPersonalizedPublisherId = false;
    @wq0("version")
    private final String sdkVersionString = SDK_VERSION;
    @wq0("plat")
    private final String sdkPlatformString = SDK_PLATFORM;
    @wq0("raw_response")
    private String rawResponse = "";

    public final HashSet<AdProvider> a() {
        return this.adProviders;
    }

    public final ConsentStatus b() {
        return this.consentStatus;
    }

    public final HashSet<AdProvider> c() {
        return this.consentedAdProviders;
    }

    public final String d() {
        return this.sdkPlatformString;
    }

    public final String e() {
        return this.sdkVersionString;
    }

    public final boolean f() {
        return this.hasNonPersonalizedPublisherId;
    }

    public final boolean g() {
        return this.isRequestLocationInEeaOrUnknown;
    }

    public final boolean h() {
        return this.underAgeOfConsent.booleanValue();
    }

    public final void i(HashSet<AdProvider> hashSet) {
        this.adProviders = hashSet;
    }

    public final void j(String str) {
        this.consentSource = str;
    }

    public final void k(ConsentStatus consentStatus) {
        this.consentStatus = consentStatus;
    }

    public final void l(HashSet<AdProvider> hashSet) {
        this.consentedAdProviders = hashSet;
    }

    public final void m(boolean z) {
        this.hasNonPersonalizedPublisherId = z;
    }

    public final void n(HashSet<String> hashSet) {
        this.publisherIds = hashSet;
    }

    public final void o(String str) {
        this.rawResponse = str;
    }

    public final void p(boolean z) {
        this.isRequestLocationInEeaOrUnknown = z;
    }
}