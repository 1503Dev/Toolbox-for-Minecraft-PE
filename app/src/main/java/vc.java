package defpackage;

import java.util.Comparator;

/* renamed from: vc  reason: default package */
public final /* synthetic */ class vc implements Comparator {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        return 1;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        int min = Math.min(str.length(), str2.length());
        int i = 4;
        while (true) {
            if (i < min) {
                char charAt = str.charAt(i);
                char charAt2 = str2.charAt(i);
                if (charAt == charAt2) {
                    i++;
                } else if (charAt < charAt2) {
                    return -1;
                }
            } else {
                int length = str.length();
                int length2 = str2.length();
                if (length == length2) {
                    return 0;
                }
                if (length < length2) {
                    return -1;
                }
            }
        }
    }
}