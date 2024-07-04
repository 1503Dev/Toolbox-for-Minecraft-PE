package defpackage;

/* renamed from: lo1  reason: default package */
public abstract class lo1 implements et2 {
    public final String P;

    public lo1(String str) {
        this.P = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.P;
    }

    @Override // defpackage.et2
    public /* synthetic */ void w(vo2 vo2Var) {
    }
}