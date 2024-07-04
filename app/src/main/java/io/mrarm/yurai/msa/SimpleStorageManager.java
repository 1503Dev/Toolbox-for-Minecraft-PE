package io.mrarm.yurai.msa;

public class SimpleStorageManager extends StorageManager {
    public SimpleStorageManager(String str) {
        super(nativeCreate(str));
    }

    private static native long nativeCreate(String str);
}