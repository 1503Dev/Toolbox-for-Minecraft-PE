package defpackage;

/* renamed from: az2  reason: default package */
public final class az2 extends mw1 {
    public static final az2 c = new az2();

    @Override // defpackage.mw1
    public final pw1 a(String str) {
        return "moov".equals(str) ? new rw1() : "mvhd".equals(str) ? new sw1() : new tw1(str);
    }
}