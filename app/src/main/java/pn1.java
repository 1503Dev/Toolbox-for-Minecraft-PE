package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* renamed from: pn1  reason: default package */
public class pn1 implements et2 {
    public static final Parcelable.Creator<pn1> CREATOR = new on1();
    public final String P;
    public final String Q;

    public pn1(Parcel parcel) {
        String readString = parcel.readString();
        int i = zn4.a;
        this.P = readString;
        this.Q = parcel.readString();
    }

    public pn1(String str, String str2) {
        this.P = str;
        this.Q = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            pn1 pn1Var = (pn1) obj;
            if (this.P.equals(pn1Var.P) && this.Q.equals(pn1Var.Q)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.P.hashCode() + 527) * 31) + this.Q.hashCode();
    }

    public final String toString() {
        return ho.b("VC: ", this.P, "=", this.Q);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.et2
    public final void w(vo2 vo2Var) {
        char c;
        String str = this.P;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            return;
                        }
                        vo2Var.e = this.Q;
                        return;
                    }
                    vo2Var.d = this.Q;
                    return;
                }
                vo2Var.c = this.Q;
                return;
            }
            vo2Var.b = this.Q;
            return;
        }
        vo2Var.a = this.Q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.P);
        parcel.writeString(this.Q);
    }
}