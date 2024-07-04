package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* renamed from: i00  reason: default package */
public class i00 implements Closeable, Flushable {
    public static final String[] Y = new String[128];
    public static final String[] Z;
    public final Writer P;
    public int[] Q;
    public int R;
    public String S;
    public String T;
    public boolean U;
    public boolean V;
    public String W;
    public boolean X;

    static {
        for (int i = 0; i <= 31; i++) {
            Y[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = Y;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        Z = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public i00(Writer writer) {
        int[] iArr = new int[32];
        this.Q = iArr;
        this.R = 0;
        if (iArr.length == 0) {
            this.Q = Arrays.copyOf(iArr, 0 * 2);
        }
        int[] iArr2 = this.Q;
        int i = this.R;
        this.R = i + 1;
        iArr2[i] = 6;
        this.T = ":";
        this.X = true;
        if (writer != null) {
            this.P = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    public void E() {
        t(3, 5, '}');
    }

    public void F(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.W != null) {
            throw new IllegalStateException();
        }
        if (this.R == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.W = str;
    }

    public final void G() {
        if (this.S == null) {
            return;
        }
        this.P.write(10);
        int i = this.R;
        for (int i2 = 1; i2 < i; i2++) {
            this.P.write(this.S);
        }
    }

    public i00 H() {
        if (this.W != null) {
            if (!this.X) {
                this.W = null;
                return this;
            }
            Q();
        }
        a();
        this.P.write("null");
        return this;
    }

    public final int I() {
        int i = this.R;
        if (i != 0) {
            return this.Q[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(String str) {
        int i;
        String str2;
        String[] strArr = this.V ? Z : Y;
        this.P.write(34);
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i = str2 == null ? i + 1 : 0;
                if (i2 < i) {
                    this.P.write(str, i2, i - i2);
                }
                this.P.write(str2);
                i2 = i + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i) {
                }
                this.P.write(str2);
                i2 = i + 1;
            }
        }
        if (i2 < length) {
            this.P.write(str, i2, length - i2);
        }
        this.P.write(34);
    }

    public void K(double d) {
        Q();
        if (this.U || !(Double.isNaN(d) || Double.isInfinite(d))) {
            a();
            this.P.append((CharSequence) Double.toString(d));
            return;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
    }

    public void L(long j) {
        Q();
        a();
        this.P.write(Long.toString(j));
    }

    public void M(Boolean bool) {
        if (bool == null) {
            H();
            return;
        }
        Q();
        a();
        this.P.write(bool.booleanValue() ? "true" : "false");
    }

    public void N(Number number) {
        if (number == null) {
            H();
            return;
        }
        Q();
        String obj = number.toString();
        if (this.U || !(obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            a();
            this.P.append((CharSequence) obj);
            return;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public void O(String str) {
        if (str == null) {
            H();
            return;
        }
        Q();
        a();
        J(str);
    }

    public void P(boolean z) {
        Q();
        a();
        this.P.write(z ? "true" : "false");
    }

    public final void Q() {
        if (this.W != null) {
            int I = I();
            if (I == 5) {
                this.P.write(44);
            } else if (I != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            G();
            this.Q[this.R - 1] = 4;
            J(this.W);
            this.W = null;
        }
    }

    public final void a() {
        int I = I();
        if (I != 1) {
            if (I != 2) {
                if (I != 4) {
                    if (I != 6) {
                        if (I == 7) {
                            if (!this.U) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    this.Q[this.R - 1] = 7;
                    return;
                }
                this.P.append((CharSequence) this.T);
                this.Q[this.R - 1] = 5;
                return;
            }
            this.P.append(',');
        } else {
            this.Q[this.R - 1] = 2;
        }
        G();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.P.close();
        int i = this.R;
        if (i > 1 || (i == 1 && this.Q[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.R = 0;
    }

    public void d() {
        Q();
        a();
        int i = this.R;
        int[] iArr = this.Q;
        if (i == iArr.length) {
            this.Q = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.Q;
        int i2 = this.R;
        this.R = i2 + 1;
        iArr2[i2] = 1;
        this.P.write(91);
    }

    public void flush() {
        if (this.R == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.P.flush();
    }

    public void g() {
        Q();
        a();
        int i = this.R;
        int[] iArr = this.Q;
        if (i == iArr.length) {
            this.Q = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.Q;
        int i2 = this.R;
        this.R = i2 + 1;
        iArr2[i2] = 3;
        this.P.write(123);
    }

    public final void t(int i, int i2, char c) {
        int I = I();
        if (I != i2 && I != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.W == null) {
            this.R--;
            if (I == i2) {
                G();
            }
            this.P.write(c);
            return;
        }
        StringBuilder b = e5.b("Dangling name: ");
        b.append(this.W);
        throw new IllegalStateException(b.toString());
    }

    public void y() {
        t(1, 2, ']');
    }
}