package io.mrarm.yurai.xbox;

public class CLLInstance {
    public long a;

    public CLLInstance(String str, String str2, String str3, String str4) {
        this.a = nativeCreate(str, str2, str3, "com.mojang.minecraftpe", str4);
    }

    private static native long nativeCreate(String str, String str2, String str3, String str4, String str5);

    private static native void nativeDestroy(long j);

    private static native void nativeLog(long j, String str, String str2, String str3);

    private static native void nativeSetAccount(long j, String str);

    public final void a(String str, String str2, String str3) {
        nativeLog(this.a, str, str2, str3);
    }

    public final void b(String str) {
        nativeSetAccount(this.a, str);
    }

    public final void finalize() {
        nativeDestroy(this.a);
        super.finalize();
    }
}