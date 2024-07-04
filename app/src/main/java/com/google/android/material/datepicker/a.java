package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.GregorianCalendar;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0025a();
    public final p60 P;
    public final p60 Q;
    public final p60 R;
    public final b S;
    public final int T;
    public final int U;

    /* renamed from: com.google.android.material.datepicker.a$a  reason: collision with other inner class name */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class C0025a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a((p60) parcel.readParcelable(p60.class.getClassLoader()), (p60) parcel.readParcelable(p60.class.getClassLoader()), (p60) parcel.readParcelable(p60.class.getClassLoader()), (b) parcel.readParcelable(b.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i) {
            return new a[i];
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface b extends Parcelable {
        boolean isValid();
    }

    public a(p60 p60Var, p60 p60Var2, p60 p60Var3, b bVar) {
        this.P = p60Var;
        this.Q = p60Var2;
        this.R = p60Var3;
        this.S = bVar;
        if (p60Var.P.compareTo(p60Var3.P) <= 0) {
            if (p60Var3.P.compareTo(p60Var2.P) <= 0) {
                if (p60Var.P instanceof GregorianCalendar) {
                    int i = p60Var2.S;
                    int i2 = p60Var.S;
                    this.U = (p60Var2.R - p60Var.R) + ((i - i2) * 12) + 1;
                    this.T = (i - i2) + 1;
                    return;
                }
                throw new IllegalArgumentException("Only Gregorian calendars are supported.");
            }
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        throw new IllegalArgumentException("start Month cannot be after current Month");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.P.equals(aVar.P) && this.Q.equals(aVar.Q) && this.R.equals(aVar.R) && this.S.equals(aVar.S);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.P, this.Q, this.R, this.S});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.P, 0);
        parcel.writeParcelable(this.Q, 0);
        parcel.writeParcelable(this.R, 0);
        parcel.writeParcelable(this.S, 0);
    }
}