package defpackage;

import android.os.Parcel;

/* renamed from: nt3  reason: default package */
public abstract class nt3 extends j22 implements iu3 {
    public nt3() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        boolean z = false;
                        if (i != 5) {
                            return false;
                        }
                        ClassLoader classLoader = k22.a;
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        k22.b(parcel);
                        ((iq4) this).k0(z);
                    } else {
                        ((iq4) this).b();
                    }
                } else {
                    ((iq4) this).h();
                }
            } else {
                ((iq4) this).f();
            }
        } else {
            ((iq4) this).g();
        }
        parcel2.writeNoException();
        return true;
    }
}