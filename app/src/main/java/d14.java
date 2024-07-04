package defpackage;

/* renamed from: d14 */
public final /* synthetic */ class d14 {
    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return "htmlDisplay";
        }
        if (i == 2) {
            return "nativeDisplay";
        }
        if (i == 3) {
            return "video";
        }
        throw null;
    }

    public static /* synthetic */ String b(int i) {
        return i == 1 ? "HTML_DISPLAY" : i == 2 ? "NATIVE_DISPLAY" : i == 3 ? "VIDEO" : "null";
    }
}