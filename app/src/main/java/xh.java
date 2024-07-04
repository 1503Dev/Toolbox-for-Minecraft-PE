package defpackage;

/* renamed from: xh  reason: default package */
public final class xh extends d {
    public xh(int i, boolean z, byte[] bArr) {
        super(i, z, bArr);
    }

    @Override // defpackage.d, defpackage.t
    public final void q(r rVar) {
        int i;
        if (this.P) {
            i = 96;
        } else {
            i = 64;
        }
        int i2 = this.Q;
        byte[] bArr = this.R;
        rVar.h(i, i2);
        rVar.f(bArr.length);
        rVar.a.write(bArr);
    }

    public final String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        if (this.P) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("APPLICATION ");
        stringBuffer.append(Integer.toString(this.Q));
        stringBuffer.append("]");
        if (this.R != null) {
            stringBuffer.append(" #");
            byte[] bArr = this.R;
            jk3 jk3Var = qu.a;
            str = hu0.a(qu.b(bArr, bArr.length));
        } else {
            str = " #null";
        }
        stringBuffer.append(str);
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }
}