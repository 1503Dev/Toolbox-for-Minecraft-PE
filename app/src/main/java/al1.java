package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* renamed from: al1  reason: default package */
public final class al1 implements Comparator<ek1>, Parcelable {
    public static final Parcelable.Creator<al1> CREATOR = new b06();
    public final ek1[] P;
    public int Q;
    public final String R;
    public final int S;

    public al1(Parcel parcel) {
        this.R = parcel.readString();
        ek1[] ek1VarArr = (ek1[]) parcel.createTypedArray(ek1.CREATOR);
        int i = zn4.a;
        this.P = ek1VarArr;
        this.S = ek1VarArr.length;
    }

    public al1(String str, boolean z, ek1... ek1VarArr) {
        this.R = str;
        ek1VarArr = z ? (ek1[]) ek1VarArr.clone() : ek1VarArr;
        this.P = ek1VarArr;
        this.S = ek1VarArr.length;
        Arrays.sort(ek1VarArr, this);
    }

    public final al1 a(String str) {
        return zn4.b(this.R, str) ? this : new al1(str, false, this.P);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(ek1 ek1Var, ek1 ek1Var2) {
        ek1 ek1Var3 = ek1Var;
        ek1 ek1Var4 = ek1Var2;
        UUID uuid = cq5.a;
        return uuid.equals(ek1Var3.Q) ? !uuid.equals(ek1Var4.Q) ? 1 : 0 : ek1Var3.Q.compareTo(ek1Var4.Q);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && al1.class == obj.getClass()) {
            al1 al1Var = (al1) obj;
            if (zn4.b(this.R, al1Var.R) && Arrays.equals(this.P, al1Var.P)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.Q;
        if (i == 0) {
            String str = this.R;
            int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.P);
            this.Q = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.R);
        parcel.writeTypedArray(this.P, 0);
    }
}