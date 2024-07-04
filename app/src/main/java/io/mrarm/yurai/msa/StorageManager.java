package io.mrarm.yurai.msa;

public abstract class StorageManager {
    public long handle;

    public StorageManager(long j) {
        this.handle = j;
    }

    private static native void nativeDestroy(long j);

    public void finalize() {
        nativeDestroy(this.handle);
        super.finalize();
    }
}