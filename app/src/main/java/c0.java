package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c0  reason: default package */
public abstract class c0 implements Parcelable {
    public final Parcelable P;
    public static final a Q = new a();
    public static final Parcelable.Creator<c0> CREATOR = new b();

    /* renamed from: c0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends c0 {
    }

    public c0() {
        this.P = null;
    }

    public c0(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.P = readParcelable == null ? Q : readParcelable;
    }

    public c0(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.P = parcelable == Q ? null : parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.P, i);
    }

    /* renamed from: c0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b implements Parcelable.ClassLoaderCreator<c0> {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return c0.Q;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new c0[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final c0 createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return c0.Q;
            }
            throw new IllegalStateException("superState must be null");
        }
    }
}