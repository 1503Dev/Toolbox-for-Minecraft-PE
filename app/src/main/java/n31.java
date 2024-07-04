package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* renamed from: n31  reason: default package */
public final class n31 extends m31 {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    public n31(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new e7(), new e7(), new e7());
    }

    public n31(Parcel parcel, int i, int i2, String str, e7<String, Method> e7Var, e7<String, Method> e7Var2, e7<String, Class> e7Var3) {
        super(e7Var, e7Var2, e7Var3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }

    @Override // defpackage.m31
    public final n31 a() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        return new n31(parcel, dataPosition, i, qq.d(new StringBuilder(), this.h, "  "), this.a, this.b, this.c);
    }

    @Override // defpackage.m31
    public final boolean e() {
        return this.e.readInt() != 0;
    }

    @Override // defpackage.m31
    public final byte[] g() {
        int readInt = this.e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.e.readByteArray(bArr);
        return bArr;
    }

    @Override // defpackage.m31
    public final CharSequence h() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
    }

    @Override // defpackage.m31
    public final boolean i(int i) {
        while (this.j < this.g) {
            int i2 = this.k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.e.setDataPosition(this.j);
            int readInt = this.e.readInt();
            this.k = this.e.readInt();
            this.j += readInt;
        }
        return this.k == i;
    }

    @Override // defpackage.m31
    public final int j() {
        return this.e.readInt();
    }

    @Override // defpackage.m31
    public final <T extends Parcelable> T k() {
        return (T) this.e.readParcelable(n31.class.getClassLoader());
    }

    @Override // defpackage.m31
    public final String l() {
        return this.e.readString();
    }

    @Override // defpackage.m31
    public final void n(int i) {
        v();
        this.i = i;
        this.d.put(i, this.e.dataPosition());
        r(0);
        r(i);
    }

    @Override // defpackage.m31
    public final void o(boolean z) {
        this.e.writeInt(z ? 1 : 0);
    }

    @Override // defpackage.m31
    public final void p(byte[] bArr) {
        if (bArr == null) {
            this.e.writeInt(-1);
            return;
        }
        this.e.writeInt(bArr.length);
        this.e.writeByteArray(bArr);
    }

    @Override // defpackage.m31
    public final void q(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.e, 0);
    }

    @Override // defpackage.m31
    public final void r(int i) {
        this.e.writeInt(i);
    }

    @Override // defpackage.m31
    public final void s(Parcelable parcelable) {
        this.e.writeParcelable(parcelable, 0);
    }

    @Override // defpackage.m31
    public final void t(String str) {
        this.e.writeString(str);
    }

    public final void v() {
        int i = this.i;
        if (i >= 0) {
            int i2 = this.d.get(i);
            int dataPosition = this.e.dataPosition();
            this.e.setDataPosition(i2);
            this.e.writeInt(dataPosition - i2);
            this.e.setDataPosition(dataPosition);
        }
    }
}