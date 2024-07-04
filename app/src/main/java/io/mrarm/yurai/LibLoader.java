package io.mrarm.yurai;

public class LibLoader {
    public static void a(String str) {
        if (nativePreloadAtAddress(str, 4294967296L)) {
            return;
        }
        nativePreload(str);
    }

    private static native String nativeCopyLibraryToMemory(String str);

    private static native void nativeDeleteLibraryCopy(String str);

    private static native boolean nativePreload(String str);

    private static native boolean nativePreloadAtAddress(String str, long j);
}