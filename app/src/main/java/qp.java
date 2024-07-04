package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: qp  reason: default package */
public final class qp extends c0 {
    public static final Parcelable.Creator<qp> CREATOR = new a();
    public final os0<String, Bundle> R;

    /* renamed from: qp$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements Parcelable.ClassLoaderCreator<qp> {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new qp(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new qp[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final qp createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new qp(parcel, classLoader);
        }
    }

    public qp() {
        throw null;
    }

    public qp(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.R = new os0<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.R.put(strArr[i], bundleArr[i]);
        }
    }

    public final String toString() {
        StringBuilder b = e5.b("ExtendableSavedState{");
        b.append(Integer.toHexString(System.identityHashCode(this)));
        b.append(" states=");
        b.append(this.R);
        b.append("}");
        return b.toString();
    }

    @Override // defpackage.c0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.P, i);
        int i2 = this.R.R;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = this.R.h(i3);
            bundleArr[i3] = this.R.j(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}