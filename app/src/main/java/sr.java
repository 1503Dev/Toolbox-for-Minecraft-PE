package defpackage;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.c;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: sr  reason: default package */
public final class sr implements Parcelable {
    public static final Parcelable.Creator<sr> CREATOR = new a();
    public final String P;
    public final String Q;
    public final boolean R;
    public final int S;
    public final int T;
    public final String U;
    public final boolean V;
    public final boolean W;
    public final boolean X;
    public final Bundle Y;
    public final boolean Z;
    public final int a0;
    public Bundle b0;
    public c c0;

    /* renamed from: sr$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements Parcelable.Creator<sr> {
        @Override // android.os.Parcelable.Creator
        public final sr createFromParcel(Parcel parcel) {
            return new sr(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final sr[] newArray(int i) {
            return new sr[i];
        }
    }

    public sr(Parcel parcel) {
        this.P = parcel.readString();
        this.Q = parcel.readString();
        this.R = parcel.readInt() != 0;
        this.S = parcel.readInt();
        this.T = parcel.readInt();
        this.U = parcel.readString();
        this.V = parcel.readInt() != 0;
        this.W = parcel.readInt() != 0;
        this.X = parcel.readInt() != 0;
        this.Y = parcel.readBundle();
        this.Z = parcel.readInt() != 0;
        this.b0 = parcel.readBundle();
        this.a0 = parcel.readInt();
    }

    public sr(c cVar) {
        this.P = cVar.getClass().getName();
        this.Q = cVar.S;
        this.R = cVar.a0;
        this.S = cVar.j0;
        this.T = cVar.k0;
        this.U = cVar.l0;
        this.V = cVar.o0;
        this.W = cVar.Z;
        this.X = cVar.n0;
        this.Y = cVar.T;
        this.Z = cVar.m0;
        this.a0 = cVar.B0.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.P);
        sb.append(" (");
        sb.append(this.Q);
        sb.append(")}:");
        if (this.R) {
            sb.append(" fromLayout");
        }
        if (this.T != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.T));
        }
        String str = this.U;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.U);
        }
        if (this.V) {
            sb.append(" retainInstance");
        }
        if (this.W) {
            sb.append(" removing");
        }
        if (this.X) {
            sb.append(" detached");
        }
        if (this.Z) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.P);
        parcel.writeString(this.Q);
        parcel.writeInt(this.R ? 1 : 0);
        parcel.writeInt(this.S);
        parcel.writeInt(this.T);
        parcel.writeString(this.U);
        parcel.writeInt(this.V ? 1 : 0);
        parcel.writeInt(this.W ? 1 : 0);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeBundle(this.Y);
        parcel.writeInt(this.Z ? 1 : 0);
        parcel.writeBundle(this.b0);
        parcel.writeInt(this.a0);
    }
}