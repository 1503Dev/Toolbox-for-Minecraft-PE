package defpackage;

/* renamed from: lu0  reason: default package */
public class lu0 extends ku0 {
    public static boolean D(String str, String str2) {
        hy.e("$this$contains", str);
        if (str.indexOf(str2, 0) < 0) {
            return false;
        }
        return true;
    }

    public static boolean E(String str) {
        hy.e("$this$endsWith", str);
        return str.endsWith("mraid.js");
    }

    public static int F(String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return str.indexOf(46, i);
    }

    public static boolean G(String str, String str2) {
        hy.e("$this$startsWith", str);
        return str.startsWith(str2);
    }
}