package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: hw  reason: default package */
public interface hw extends IInterface {

    /* renamed from: hw$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class a extends l82 implements hw {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static hw Z(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof hw ? (hw) queryLocalInterface : new i82(iBinder);
        }
    }
}