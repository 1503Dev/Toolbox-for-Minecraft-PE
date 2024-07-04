package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.IOException;

/* renamed from: lq2  reason: default package */
public final class lq2 extends f0 {
    public static final Parcelable.Creator<lq2> CREATOR = new qq2();
    public ParcelFileDescriptor P;
    public Parcelable Q = null;
    public boolean R = true;

    public lq2(ParcelFileDescriptor parcelFileDescriptor) {
        this.P = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        ParcelFileDescriptor[] createPipe;
        if (this.P == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.Q.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    createPipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                } catch (IOException e) {
                    e = e;
                    autoCloseOutputStream = null;
                }
                try {
                    zw2.a.execute(new qh1(autoCloseOutputStream, marshall, 3));
                    parcelFileDescriptor = createPipe[0];
                } catch (IOException e2) {
                    e = e2;
                    sv2.e("Error transporting the ad response", e);
                    jv5.A.g.f("LargeParcelTeleporter.pipeData.2", e);
                    gw.j(autoCloseOutputStream);
                    this.P = parcelFileDescriptor;
                    int s = tv2.s(parcel, 20293);
                    tv2.i(parcel, 2, this.P, i);
                    tv2.A(parcel, s);
                }
                this.P = parcelFileDescriptor;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        int s2 = tv2.s(parcel, 20293);
        tv2.i(parcel, 2, this.P, i);
        tv2.A(parcel, s2);
    }
}