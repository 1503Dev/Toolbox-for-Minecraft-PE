package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: nm5  reason: default package */
public abstract class nm5 extends al5 {
    public static final WeakReference<byte[]> R = new WeakReference<>(null);
    public WeakReference<byte[]> Q;

    public nm5(byte[] bArr) {
        super(bArr);
        this.Q = R;
    }

    public abstract byte[] b2();

    @Override // defpackage.al5
    public final byte[] c0() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.Q.get();
            if (bArr == null) {
                bArr = b2();
                this.Q = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }
}