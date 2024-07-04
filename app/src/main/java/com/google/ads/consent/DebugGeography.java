package com.google.ads.consent;

public enum DebugGeography {
    DEBUG_GEOGRAPHY_DISABLED("DEBUG_GEOGRAPHY_DISABLED"),
    DEBUG_GEOGRAPHY_EEA("DEBUG_GEOGRAPHY_EEA"),
    DEBUG_GEOGRAPHY_NOT_EEA("DEBUG_GEOGRAPHY_NOT_EEA");
    
    private final int value;

    DebugGeography(String str) {
        this.value = r2;
    }

    public final Integer b() {
        return Integer.valueOf(this.value);
    }
}