package io.mrarm.yurai.msa;

public class AccountManager {
    private long handle;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class AccountAlreadyExistsException extends Exception {
        public AccountAlreadyExistsException(String str) {
            super(str);
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class NoSuchAccountException extends Exception {
        public NoSuchAccountException(String str) {
            super(str);
        }
    }

    public AccountManager(StorageManager storageManager) {
        this.handle = nativeCreate(storageManager.handle);
    }

    private static native void nativeAddAccount(long j, String str, String str2, String str3, long j2);

    private static native long nativeCreate(long j);

    private static native void nativeDestroy(long j);

    private static native long nativeFindAccount(long j, String str);

    private static native AccountList nativeGetAccounts(long j);

    public void addAccount(String str, String str2, String str3, LegacyToken legacyToken) {
        nativeAddAccount(this.handle, str, str2, str3, legacyToken.sharedHandle);
    }

    public void finalize() {
        nativeDestroy(this.handle);
        super.finalize();
    }

    public Account findAccount(String str) {
        return new Account(nativeFindAccount(this.handle, str));
    }

    public AccountList getAccounts() {
        return nativeGetAccounts(this.handle);
    }
}