package defpackage;

/* renamed from: ze4  reason: default package */
public final class ze4 extends IllegalArgumentException {
    public ze4(int i, int i2) {
        super(dp.b("Unpaired surrogate at index ", i, " of ", i2));
    }
}