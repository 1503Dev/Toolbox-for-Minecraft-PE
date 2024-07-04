package io.mrarm.yurai;

public class HookManager {
    public long a = nativeCreate();

    private static native void nativeAddLibrary(long j, String str, String str2);

    private static native void nativeApplyHooks(long j);

    private static native long nativeCreate();

    private static native void nativeDestroy(long j);

    private static native void nativeMakeActive(long j);

    public final void a() {
        nativeAddLibrary(this.a, "libminecraftpe.so", "JNI_OnLoad");
    }

    public final void b() {
        nativeApplyHooks(this.a);
    }

    public final void c() {
        nativeMakeActive(this.a);
    }

    public final void finalize() {
        nativeDestroy(this.a);
        super.finalize();
    }
}