package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: p60  reason: default package */
public final class p60 implements Comparable<p60>, Parcelable {
    public static final Parcelable.Creator<p60> CREATOR = new a();
    public final Calendar P;
    public final String Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;

    /* renamed from: p60$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements Parcelable.Creator<p60> {
        @Override // android.os.Parcelable.Creator
        public final p60 createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            Calendar b = zf.b(null);
            b.set(1, readInt);
            b.set(2, readInt2);
            return new p60(b);
        }

        @Override // android.os.Parcelable.Creator
        public final p60[] newArray(int i) {
            return new p60[i];
        }
    }

    public p60(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a2 = zf.a(calendar);
        this.P = a2;
        this.R = a2.get(2);
        this.S = a2.get(1);
        this.T = a2.getMaximum(7);
        this.U = a2.getActualMaximum(5);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM, yyyy", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.Q = simpleDateFormat.format(a2.getTime());
        a2.getTimeInMillis();
    }

    @Override // java.lang.Comparable
    public final int compareTo(p60 p60Var) {
        return this.P.compareTo(p60Var.P);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p60) {
            p60 p60Var = (p60) obj;
            return this.R == p60Var.R && this.S == p60Var.S;
        }
        return false;
    }

    public final int g() {
        int firstDayOfWeek = this.P.get(7) - this.P.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.T : firstDayOfWeek;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.R), Integer.valueOf(this.S)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.S);
        parcel.writeInt(this.R);
    }
}