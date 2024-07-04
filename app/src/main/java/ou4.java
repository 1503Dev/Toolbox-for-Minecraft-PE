package defpackage;

/* renamed from: ou4  reason: default package */
public final class ou4 {
    public static void a(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }
}