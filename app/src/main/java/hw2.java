package defpackage;

import dalvik.system.PathClassLoader;

/* renamed from: hw2  reason: default package */
public final class hw2 extends PathClassLoader {
    public hw2(ClassLoader classLoader, String str) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    public final Class<?> loadClass(String str, boolean z) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}