package defpackage;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/* renamed from: h00  reason: default package */
public final class h00 extends i00 {
    public static final a d0 = new a();
    public static final b00 e0 = new b00("closed");
    public final ArrayList a0;
    public String b0;
    public wz c0;

    /* renamed from: h00$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public h00() {
        super(d0);
        this.a0 = new ArrayList();
        this.c0 = yz.P;
    }

    @Override // defpackage.i00
    public final void E() {
        if (this.a0.isEmpty() || this.b0 != null) {
            throw new IllegalStateException();
        }
        if (!(R() instanceof zz)) {
            throw new IllegalStateException();
        }
        ArrayList arrayList = this.a0;
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // defpackage.i00
    public final void F(String str) {
        if (this.a0.isEmpty() || this.b0 != null) {
            throw new IllegalStateException();
        }
        if (!(R() instanceof zz)) {
            throw new IllegalStateException();
        }
        this.b0 = str;
    }

    @Override // defpackage.i00
    public final i00 H() {
        S(yz.P);
        return this;
    }

    @Override // defpackage.i00
    public final void K(double d) {
        if (!this.U && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
        }
        S(new b00(Double.valueOf(d)));
    }

    @Override // defpackage.i00
    public final void L(long j) {
        S(new b00(Long.valueOf(j)));
    }

    @Override // defpackage.i00
    public final void M(Boolean bool) {
        if (bool == null) {
            S(yz.P);
        } else {
            S(new b00(bool));
        }
    }

    @Override // defpackage.i00
    public final void N(Number number) {
        if (number == null) {
            S(yz.P);
            return;
        }
        if (!this.U) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        S(new b00(number));
    }

    @Override // defpackage.i00
    public final void O(String str) {
        if (str == null) {
            S(yz.P);
        } else {
            S(new b00(str));
        }
    }

    @Override // defpackage.i00
    public final void P(boolean z) {
        S(new b00(Boolean.valueOf(z)));
    }

    public final wz R() {
        ArrayList arrayList = this.a0;
        return (wz) arrayList.get(arrayList.size() - 1);
    }

    public final void S(wz wzVar) {
        if (this.b0 != null) {
            wzVar.getClass();
            if (!(wzVar instanceof yz) || this.X) {
                ((zz) R()).P.put(this.b0, wzVar);
            }
            this.b0 = null;
        } else if (this.a0.isEmpty()) {
            this.c0 = wzVar;
        } else {
            wz R = R();
            if (R instanceof qz) {
                qz qzVar = (qz) R;
                if (wzVar == null) {
                    qzVar.getClass();
                    wzVar = yz.P;
                }
                qzVar.P.add(wzVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // defpackage.i00, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.a0.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.a0.add(e0);
    }

    @Override // defpackage.i00
    public final void d() {
        qz qzVar = new qz();
        S(qzVar);
        this.a0.add(qzVar);
    }

    @Override // defpackage.i00, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.i00
    public final void g() {
        zz zzVar = new zz();
        S(zzVar);
        this.a0.add(zzVar);
    }

    @Override // defpackage.i00
    public final void y() {
        if (this.a0.isEmpty() || this.b0 != null) {
            throw new IllegalStateException();
        }
        if (!(R() instanceof qz)) {
            throw new IllegalStateException();
        }
        ArrayList arrayList = this.a0;
        arrayList.remove(arrayList.size() - 1);
    }
}