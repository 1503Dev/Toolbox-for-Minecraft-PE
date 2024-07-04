package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: yv  reason: default package */
public interface yv extends IInterface {

    /* renamed from: yv$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class a extends Binder implements yv {
        public static final /* synthetic */ int P = 0;

        /* renamed from: yv$a$a  reason: collision with other inner class name */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public static class C0049a implements yv {
            public IBinder P;

            public C0049a(IBinder iBinder) {
                this.P = iBinder;
            }

            @Override // defpackage.yv
            public final boolean U1(nh nhVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(nhVar);
                    if (!this.P.transact(3, obtain, obtain2, 0)) {
                        int i = a.P;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // defpackage.yv
            public final boolean V3() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(0L);
                    if (!this.P.transact(2, obtain, obtain2, 0)) {
                        int i = a.P;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.P;
            }
        }
    }

    boolean U1(nh nhVar);

    boolean V3();
}