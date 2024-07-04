package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.i;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final int[] P;
    public final ArrayList<String> Q;
    public final int[] R;
    public final int[] S;
    public final int T;
    public final int U;
    public final String V;
    public final int W;
    public final int X;
    public final CharSequence Y;
    public final int Z;
    public final CharSequence a0;
    public final ArrayList<String> b0;
    public final ArrayList<String> c0;
    public final boolean d0;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i) {
            return new b[i];
        }
    }

    public b(Parcel parcel) {
        this.P = parcel.createIntArray();
        this.Q = parcel.createStringArrayList();
        this.R = parcel.createIntArray();
        this.S = parcel.createIntArray();
        this.T = parcel.readInt();
        this.U = parcel.readInt();
        this.V = parcel.readString();
        this.W = parcel.readInt();
        this.X = parcel.readInt();
        this.Y = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.Z = parcel.readInt();
        this.a0 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.b0 = parcel.createStringArrayList();
        this.c0 = parcel.createStringArrayList();
        this.d0 = parcel.readInt() != 0;
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.a.size();
        this.P = new int[size * 5];
        if (!aVar.h) {
            throw new IllegalStateException("Not on back stack");
        }
        this.Q = new ArrayList<>(size);
        this.R = new int[size];
        this.S = new int[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            i.a aVar2 = aVar.a.get(i);
            int i3 = i2 + 1;
            this.P[i2] = aVar2.a;
            ArrayList<String> arrayList = this.Q;
            c cVar = aVar2.b;
            arrayList.add(cVar != null ? cVar.S : null);
            int[] iArr = this.P;
            int i4 = i3 + 1;
            iArr[i3] = aVar2.c;
            int i5 = i4 + 1;
            iArr[i4] = aVar2.d;
            int i6 = i5 + 1;
            iArr[i5] = aVar2.e;
            iArr[i6] = aVar2.f;
            this.R[i] = aVar2.g.ordinal();
            this.S[i] = aVar2.h.ordinal();
            i++;
            i2 = i6 + 1;
        }
        this.T = aVar.f;
        this.U = aVar.g;
        this.V = aVar.i;
        this.W = aVar.s;
        this.X = aVar.j;
        this.Y = aVar.k;
        this.Z = aVar.l;
        this.a0 = aVar.m;
        this.b0 = aVar.n;
        this.c0 = aVar.o;
        this.d0 = aVar.p;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.P);
        parcel.writeStringList(this.Q);
        parcel.writeIntArray(this.R);
        parcel.writeIntArray(this.S);
        parcel.writeInt(this.T);
        parcel.writeInt(this.U);
        parcel.writeString(this.V);
        parcel.writeInt(this.W);
        parcel.writeInt(this.X);
        TextUtils.writeToParcel(this.Y, parcel, 0);
        parcel.writeInt(this.Z);
        TextUtils.writeToParcel(this.a0, parcel, 0);
        parcel.writeStringList(this.b0);
        parcel.writeStringList(this.c0);
        parcel.writeInt(this.d0 ? 1 : 0);
    }
}