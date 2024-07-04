package defpackage;

import java.io.ByteArrayOutputStream;

/* renamed from: vi2  reason: default package */
public final /* synthetic */ class vi2 implements kg4, v64, tl {
    public final /* synthetic */ int P;
    public Object Q;

    public vi2() {
        this.P = 3;
        this.Q = new ByteArrayOutputStream();
    }

    @Override // defpackage.tl
    public final String b() {
        return "NULL";
    }

    @Override // defpackage.tl
    public final int c() {
        return ((ByteArrayOutputStream) this.Q).size();
    }

    @Override // defpackage.tl
    public final int d(byte[] bArr) {
        byte[] byteArray = ((ByteArrayOutputStream) this.Q).toByteArray();
        System.arraycopy(byteArray, 0, bArr, 0, byteArray.length);
        reset();
        return byteArray.length;
    }

    @Override // defpackage.kg4, defpackage.v64
    /* renamed from: e */
    public final void mo5e(Object obj) {
        switch (this.P) {
            case 1:
                ((zr2) obj).u0(((tz3) this.Q).P);
                return;
            default:
                jo5 jo5Var = (jo5) obj;
                return;
        }
    }

    @Override // defpackage.tl
    public final void f(byte b) {
        ((ByteArrayOutputStream) this.Q).write(b);
    }

    @Override // defpackage.tl
    public final void reset() {
        ((ByteArrayOutputStream) this.Q).reset();
    }

    @Override // defpackage.tl
    public final void update(byte[] bArr, int i, int i2) {
        ((ByteArrayOutputStream) this.Q).write(bArr, i, i2);
    }

    public /* synthetic */ vi2(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    public /* synthetic */ vi2(io5 io5Var) {
        this.P = 2;
        this.Q = io5Var;
    }
}