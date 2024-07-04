package com.microsoft.xal.crypto;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class ShaHasher {
    private final MessageDigest digest;

    public ShaHasher() {
        try {
            this.digest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public void AddBytes(byte[] bArr) {
        this.digest.update(bArr);
    }

    public byte[] SignHash() {
        return this.digest.digest();
    }
}