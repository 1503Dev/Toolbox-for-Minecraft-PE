package defpackage;

/* renamed from: vi4  reason: default package */
public final class vi4 extends Exception {
    public vi4(Exception exc) {
        super("Could not obtain webview for the overlay.", exc);
    }

    public vi4(String str) {
        super(str);
    }
}