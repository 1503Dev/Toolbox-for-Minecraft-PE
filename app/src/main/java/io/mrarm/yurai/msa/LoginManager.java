package io.mrarm.yurai.msa;

public class LoginManager {
    public long handle;

    public LoginManager(StorageManager storageManager) {
        this.handle = nativeCreate(storageManager != null ? storageManager.handle : 0L);
    }

    private static native long nativeCreate(long j);

    private static native void nativeDestroy(long j);

    public void finalize() {
        nativeDestroy(this.handle);
        super.finalize();
    }
}