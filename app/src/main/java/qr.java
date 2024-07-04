package defpackage;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.b;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: qr  reason: default package */
public final class qr implements Parcelable {
    public static final Parcelable.Creator<qr> CREATOR = new a();
    public ArrayList<sr> P;
    public ArrayList<String> Q;
    public b[] R;
    public String S;
    public int T;

    /* renamed from: qr$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements Parcelable.Creator<qr> {
        @Override // android.os.Parcelable.Creator
        public final qr createFromParcel(Parcel parcel) {
            return new qr(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final qr[] newArray(int i) {
            return new qr[i];
        }
    }

    public qr() {
        this.S = null;
    }

    public qr(Parcel parcel) {
        this.S = null;
        this.P = parcel.createTypedArrayList(sr.CREATOR);
        this.Q = parcel.createStringArrayList();
        this.R = (b[]) parcel.createTypedArray(b.CREATOR);
        this.S = parcel.readString();
        this.T = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.P);
        parcel.writeStringList(this.Q);
        parcel.writeTypedArray(this.R, i);
        parcel.writeString(this.S);
        parcel.writeInt(this.T);
    }
}