package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* renamed from: c00  reason: default package */
public class c00 implements Closeable {
    public static final char[] e0 = ")]}'\n".toCharArray();
    public final Reader P;
    public long X;
    public int Y;
    public String Z;
    public int[] a0;
    public String[] c0;
    public int[] d0;
    public boolean Q = false;
    public final char[] R = new char[1024];
    public int S = 0;
    public int T = 0;
    public int U = 0;
    public int V = 0;
    public int W = 0;
    public int b0 = 0 + 1;

    /* renamed from: c00$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends z61 {
        public final void D1(c00 c00Var) {
            int i;
            if (c00Var instanceof g00) {
                g00 g00Var = (g00) c00Var;
                g00Var.b0(5);
                Map.Entry entry = (Map.Entry) ((Iterator) g00Var.c0()).next();
                g00Var.e0(entry.getValue());
                g00Var.e0(new b00((String) entry.getKey()));
                return;
            }
            int i2 = c00Var.W;
            if (i2 == 0) {
                i2 = c00Var.t();
            }
            if (i2 == 13) {
                i = 9;
            } else if (i2 == 12) {
                i = 8;
            } else if (i2 == 14) {
                i = 10;
            } else {
                StringBuilder b = e5.b("Expected a name but was ");
                b.append(ik.b(c00Var.U()));
                b.append(c00Var.J());
                throw new IllegalStateException(b.toString());
            }
            c00Var.W = i;
        }
    }

    static {
        z61.a = new a();
    }

    public c00(Reader reader) {
        int[] iArr = new int[32];
        this.a0 = iArr;
        iArr[0] = 6;
        this.c0 = new String[32];
        this.d0 = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.P = reader;
    }

    public void E() {
        int i = this.W;
        if (i == 0) {
            i = t();
        }
        if (i == 2) {
            int i2 = this.b0 - 1;
            this.b0 = i2;
            this.c0[i2] = null;
            int[] iArr = this.d0;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.W = 0;
            return;
        }
        StringBuilder b = e5.b("Expected END_OBJECT but was ");
        b.append(ik.b(U()));
        b.append(J());
        throw new IllegalStateException(b.toString());
    }

    public final boolean F(int i) {
        int i2;
        int i3;
        char[] cArr = this.R;
        int i4 = this.V;
        int i5 = this.S;
        this.V = i4 - i5;
        int i6 = this.T;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.T = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.T = 0;
        }
        this.S = 0;
        do {
            Reader reader = this.P;
            int i8 = this.T;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.T + read;
            this.T = i2;
            if (this.U == 0 && (i3 = this.V) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.S++;
                this.V = i3 + 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    public String G() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = this.b0;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.a0[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.d0[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = this.c0[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public boolean H() {
        int i = this.W;
        if (i == 0) {
            i = t();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    public final boolean I(char c) {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        g();
        return false;
    }

    public final String J() {
        return " at line " + (this.U + 1) + " column " + ((this.S - this.V) + 1) + " path " + G();
    }

    public boolean K() {
        int i = this.W;
        if (i == 0) {
            i = t();
        }
        if (i == 5) {
            this.W = 0;
            int[] iArr = this.d0;
            int i2 = this.b0 - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.W = 0;
            int[] iArr2 = this.d0;
            int i3 = this.b0 - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            StringBuilder b = e5.b("Expected a boolean but was ");
            b.append(ik.b(U()));
            b.append(J());
            throw new IllegalStateException(b.toString());
        }
    }

    public double L() {
        char c;
        String R;
        int i = this.W;
        if (i == 0) {
            i = t();
        }
        if (i == 15) {
            this.W = 0;
            int[] iArr = this.d0;
            int i2 = this.b0 - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.X;
        }
        if (i == 16) {
            this.Z = new String(this.R, this.S, this.Y);
            this.S += this.Y;
        } else {
            if (i != 8 && i != 9) {
                if (i == 10) {
                    R = T();
                } else if (i != 11) {
                    StringBuilder b = e5.b("Expected a double but was ");
                    b.append(ik.b(U()));
                    b.append(J());
                    throw new IllegalStateException(b.toString());
                }
            } else {
                if (i == 8) {
                    c = '\'';
                } else {
                    c = '\"';
                }
                R = R(c);
            }
            this.Z = R;
        }
        this.W = 11;
        double parseDouble = Double.parseDouble(this.Z);
        if (!this.Q && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new v30("JSON forbids NaN and infinities: " + parseDouble + J());
        }
        this.Z = null;
        this.W = 0;
        int[] iArr2 = this.d0;
        int i3 = this.b0 - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    public int M() {
        char c;
        String R;
        int i = this.W;
        if (i == 0) {
            i = t();
        }
        if (i == 15) {
            long j = this.X;
            int i2 = (int) j;
            if (j == i2) {
                this.W = 0;
                int[] iArr = this.d0;
                int i3 = this.b0 - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            StringBuilder b = e5.b("Expected an int but was ");
            b.append(this.X);
            b.append(J());
            throw new NumberFormatException(b.toString());
        }
        if (i == 16) {
            this.Z = new String(this.R, this.S, this.Y);
            this.S += this.Y;
        } else if (i != 8 && i != 9 && i != 10) {
            StringBuilder b2 = e5.b("Expected an int but was ");
            b2.append(ik.b(U()));
            b2.append(J());
            throw new IllegalStateException(b2.toString());
        } else {
            if (i == 10) {
                R = T();
            } else {
                if (i == 8) {
                    c = '\'';
                } else {
                    c = '\"';
                }
                R = R(c);
            }
            this.Z = R;
            try {
                int parseInt = Integer.parseInt(this.Z);
                this.W = 0;
                int[] iArr2 = this.d0;
                int i4 = this.b0 - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.W = 11;
        double parseDouble = Double.parseDouble(this.Z);
        int i5 = (int) parseDouble;
        if (i5 == parseDouble) {
            this.Z = null;
            this.W = 0;
            int[] iArr3 = this.d0;
            int i6 = this.b0 - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        StringBuilder b3 = e5.b("Expected an int but was ");
        b3.append(this.Z);
        b3.append(J());
        throw new NumberFormatException(b3.toString());
    }

    public long N() {
        char c;
        String R;
        int i = this.W;
        if (i == 0) {
            i = t();
        }
        if (i == 15) {
            this.W = 0;
            int[] iArr = this.d0;
            int i2 = this.b0 - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.X;
        }
        if (i == 16) {
            this.Z = new String(this.R, this.S, this.Y);
            this.S += this.Y;
        } else if (i != 8 && i != 9 && i != 10) {
            StringBuilder b = e5.b("Expected a long but was ");
            b.append(ik.b(U()));
            b.append(J());
            throw new IllegalStateException(b.toString());
        } else {
            if (i == 10) {
                R = T();
            } else {
                if (i == 8) {
                    c = '\'';
                } else {
                    c = '\"';
                }
                R = R(c);
            }
            this.Z = R;
            try {
                long parseLong = Long.parseLong(this.Z);
                this.W = 0;
                int[] iArr2 = this.d0;
                int i3 = this.b0 - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.W = 11;
        double parseDouble = Double.parseDouble(this.Z);
        long j = (long) parseDouble;
        if (j == parseDouble) {
            this.Z = null;
            this.W = 0;
            int[] iArr3 = this.d0;
            int i4 = this.b0 - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        StringBuilder b2 = e5.b("Expected a long but was ");
        b2.append(this.Z);
        b2.append(J());
        throw new NumberFormatException(b2.toString());
    }

    public String O() {
        char c;
        String R;
        int i = this.W;
        if (i == 0) {
            i = t();
        }
        if (i == 14) {
            R = T();
        } else {
            if (i == 12) {
                c = '\'';
            } else if (i == 13) {
                c = '\"';
            } else {
                StringBuilder b = e5.b("Expected a name but was ");
                b.append(ik.b(U()));
                b.append(J());
                throw new IllegalStateException(b.toString());
            }
            R = R(c);
        }
        this.W = 0;
        this.c0[this.b0 - 1] = R;
        return R;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
        if (r1 != '/') goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
        r9.S = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r4 != r2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
        r9.S = r4 - 1;
        r2 = F(2);
        r9.S++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
        if (r2 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
        g();
        r2 = r9.S;
        r4 = r0[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
        if (r4 == '*') goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
        if (r4 == '/') goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0075, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0076, code lost:
        r9.S = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
        r9.S = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007f, code lost:
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
        if ((r9.S + 2) <= r9.T) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
        if (F(2) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0090, code lost:
        r1 = r9.R;
        r2 = r9.S;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0096, code lost:
        if (r1[r2] != '\n') goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0098, code lost:
        r9.U++;
        r9.V = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a2, code lost:
        if (r4 >= 2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b1, code lost:
        if (r9.R[r9.S + r4] == "*\/".charAt(r4)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
        r9.S++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b9, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bc, code lost:
        if (r3 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c3, code lost:
        a0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c9, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ca, code lost:
        r9.S = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ce, code lost:
        if (r1 != '#') goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d0, code lost:
        g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d8, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int P(boolean z) {
        char[] cArr = this.R;
        while (true) {
            int i = this.S;
            while (true) {
                int i2 = this.T;
                while (true) {
                    boolean z2 = true;
                    if (i == i2) {
                        this.S = i;
                        if (!F(1)) {
                            if (!z) {
                                return -1;
                            }
                            StringBuilder b = e5.b("End of input");
                            b.append(J());
                            throw new EOFException(b.toString());
                        }
                        i = this.S;
                        i2 = this.T;
                    }
                    int i3 = i + 1;
                    char c = cArr[i];
                    if (c == '\n') {
                        this.U++;
                        this.V = i3;
                    } else if (c != ' ' && c != '\r' && c != '\t') {
                        break;
                    }
                    i = i3;
                }
                i = this.S + 2;
            }
            Y();
        }
    }

    public void Q() {
        int i = this.W;
        if (i == 0) {
            i = t();
        }
        if (i == 7) {
            this.W = 0;
            int[] iArr = this.d0;
            int i2 = this.b0 - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        StringBuilder b = e5.b("Expected null but was ");
        b.append(ik.b(U()));
        b.append(J());
        throw new IllegalStateException(b.toString());
    }

    public final String R(char c) {
        char[] cArr = this.R;
        StringBuilder sb = null;
        while (true) {
            int i = this.S;
            int i2 = this.T;
            int i3 = i;
            while (true) {
                if (i3 < i2) {
                    int i4 = i3 + 1;
                    char c2 = cArr[i3];
                    if (c2 == c) {
                        this.S = i4;
                        int i5 = (i4 - i) - 1;
                        if (sb == null) {
                            return new String(cArr, i, i5);
                        }
                        sb.append(cArr, i, i5);
                        return sb.toString();
                    } else if (c2 == '\\') {
                        this.S = i4;
                        int i6 = (i4 - i) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i6 + 1) * 2, 16));
                        }
                        sb.append(cArr, i, i6);
                        sb.append(W());
                    } else {
                        if (c2 == '\n') {
                            this.U++;
                            this.V = i4;
                        }
                        i3 = i4;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i3 - i) * 2, 16));
                    }
                    sb.append(cArr, i, i3 - i);
                    this.S = i3;
                    if (!F(1)) {
                        a0("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    public String S() {
        String str;
        char c;
        int i = this.W;
        if (i == 0) {
            i = t();
        }
        if (i == 10) {
            str = T();
        } else {
            if (i == 8) {
                c = '\'';
            } else if (i == 9) {
                c = '\"';
            } else if (i == 11) {
                str = this.Z;
                this.Z = null;
            } else if (i == 15) {
                str = Long.toString(this.X);
            } else if (i == 16) {
                str = new String(this.R, this.S, this.Y);
                this.S += this.Y;
            } else {
                StringBuilder b = e5.b("Expected a string but was ");
                b.append(ik.b(U()));
                b.append(J());
                throw new IllegalStateException(b.toString());
            }
            str = R(c);
        }
        this.W = 0;
        int[] iArr = this.d0;
        int i2 = this.b0 - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
        g();
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String T() {
        String sb;
        int i = 0;
        StringBuilder sb2 = null;
        do {
            int i2 = 0;
            while (true) {
                int i3 = this.S;
                if (i3 + i2 < this.T) {
                    char c = this.R[i3 + i2];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i2 >= this.R.length) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i2, 16));
                    }
                    sb2.append(this.R, this.S, i2);
                    this.S += i2;
                } else if (F(i2 + 1)) {
                }
            }
            i = i2;
            if (sb2 != null) {
                sb = new String(this.R, this.S, i);
            } else {
                sb2.append(this.R, this.S, i);
                sb = sb2.toString();
            }
            this.S += i;
            return sb;
        } while (F(1));
        if (sb2 != null) {
        }
        this.S += i;
        return sb;
    }

    public int U() {
        int i = this.W;
        if (i == 0) {
            i = t();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void V(int i) {
        int i2 = this.b0;
        int[] iArr = this.a0;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.a0 = Arrays.copyOf(iArr, i3);
            this.d0 = Arrays.copyOf(this.d0, i3);
            this.c0 = (String[]) Arrays.copyOf(this.c0, i3);
        }
        int[] iArr2 = this.a0;
        int i4 = this.b0;
        this.b0 = i4 + 1;
        iArr2[i4] = i;
    }

    public final char W() {
        int i;
        int i2;
        if (this.S == this.T && !F(1)) {
            a0("Unterminated escape sequence");
            throw null;
        }
        char[] cArr = this.R;
        int i3 = this.S;
        int i4 = i3 + 1;
        this.S = i4;
        char c = cArr[i3];
        if (c != '\n') {
            if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
                if (c != 'b') {
                    if (c != 'f') {
                        if (c == 'n') {
                            return '\n';
                        }
                        if (c != 'r') {
                            if (c != 't') {
                                if (c == 'u') {
                                    if (i4 + 4 > this.T && !F(4)) {
                                        a0("Unterminated escape sequence");
                                        throw null;
                                    }
                                    char c2 = 0;
                                    int i5 = this.S;
                                    int i6 = i5 + 4;
                                    while (i5 < i6) {
                                        char c3 = this.R[i5];
                                        char c4 = (char) (c2 << 4);
                                        if (c3 >= '0' && c3 <= '9') {
                                            i2 = c3 - '0';
                                        } else {
                                            if (c3 >= 'a' && c3 <= 'f') {
                                                i = c3 - 'a';
                                            } else if (c3 >= 'A' && c3 <= 'F') {
                                                i = c3 - 'A';
                                            } else {
                                                StringBuilder b = e5.b("\\u");
                                                b.append(new String(this.R, this.S, 4));
                                                throw new NumberFormatException(b.toString());
                                            }
                                            i2 = i + 10;
                                        }
                                        c2 = (char) (i2 + c4);
                                        i5++;
                                    }
                                    this.S += 4;
                                    return c2;
                                }
                                a0("Invalid escape sequence");
                                throw null;
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
        } else {
            this.U++;
            this.V = i4;
        }
        return c;
    }

    public final void X(char c) {
        char[] cArr = this.R;
        while (true) {
            int i = this.S;
            int i2 = this.T;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.S = i3;
                        return;
                    } else if (c2 == '\\') {
                        this.S = i3;
                        W();
                        break;
                    } else {
                        if (c2 == '\n') {
                            this.U++;
                            this.V = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.S = i;
                    if (!F(1)) {
                        a0("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    public final void Y() {
        char c;
        do {
            if (this.S >= this.T && !F(1)) {
                return;
            }
            char[] cArr = this.R;
            int i = this.S;
            int i2 = i + 1;
            this.S = i2;
            c = cArr[i];
            if (c == '\n') {
                this.U++;
                this.V = i2;
                return;
            }
        } while (c != '\r');
    }

    public void Z() {
        char c;
        int i = 0;
        do {
            int i2 = this.W;
            if (i2 == 0) {
                i2 = t();
            }
            if (i2 == 3) {
                V(1);
            } else if (i2 == 1) {
                V(3);
            } else {
                if (i2 == 4 || i2 == 2) {
                    this.b0--;
                    i--;
                } else if (i2 != 14 && i2 != 10) {
                    if (i2 != 8 && i2 != 12) {
                        if (i2 != 9 && i2 != 13) {
                            if (i2 == 16) {
                                this.S += this.Y;
                            }
                        } else {
                            c = '\"';
                        }
                    } else {
                        c = '\'';
                    }
                    X(c);
                } else {
                    do {
                        int i3 = 0;
                        while (true) {
                            int i4 = this.S + i3;
                            if (i4 < this.T) {
                                char c2 = this.R[i4];
                                if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                                    if (c2 != '#') {
                                        if (c2 != ',') {
                                            if (c2 != '/' && c2 != '=') {
                                                if (c2 != '{' && c2 != '}' && c2 != ':') {
                                                    if (c2 != ';') {
                                                        switch (c2) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
                                                                i3++;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                this.S = i4;
                            }
                        }
                        g();
                        this.S += i3;
                    } while (F(1));
                }
                this.W = 0;
            }
            i++;
            this.W = 0;
        } while (i != 0);
        int[] iArr = this.d0;
        int i5 = this.b0;
        int i6 = i5 - 1;
        iArr[i6] = iArr[i6] + 1;
        this.c0[i5 - 1] = "null";
    }

    public void a() {
        int i = this.W;
        if (i == 0) {
            i = t();
        }
        if (i == 3) {
            V(1);
            this.d0[this.b0 - 1] = 0;
            this.W = 0;
            return;
        }
        StringBuilder b = e5.b("Expected BEGIN_ARRAY but was ");
        b.append(ik.b(U()));
        b.append(J());
        throw new IllegalStateException(b.toString());
    }

    public final void a0(String str) {
        StringBuilder b = e5.b(str);
        b.append(J());
        throw new v30(b.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.W = 0;
        this.a0[0] = 8;
        this.b0 = 1;
        this.P.close();
    }

    public void d() {
        int i = this.W;
        if (i == 0) {
            i = t();
        }
        if (i == 1) {
            V(3);
            this.W = 0;
            return;
        }
        StringBuilder b = e5.b("Expected BEGIN_OBJECT but was ");
        b.append(ik.b(U()));
        b.append(J());
        throw new IllegalStateException(b.toString());
    }

    public final void g() {
        if (this.Q) {
            return;
        }
        a0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x01f9, code lost:
        if (r12 != 6) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x020e, code lost:
        if (I(r14) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0210, code lost:
        if (r12 != 2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0212, code lost:
        if (r16 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0218, code lost:
        if (r10 != Long.MIN_VALUE) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x021a, code lost:
        if (r13 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0220, code lost:
        if (r10 != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0222, code lost:
        if (r13 != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0224, code lost:
        if (r13 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0227, code lost:
        r10 = -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0228, code lost:
        r19.X = r10;
        r19.S += r6;
        r14 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0234, code lost:
        if (r12 == 2) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0237, code lost:
        if (r12 == 4) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x023a, code lost:
        if (r12 != 7) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x023c, code lost:
        r19.Y = r6;
        r14 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0242, code lost:
        r19.W = r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0176 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0278 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int t() {
        int i;
        int P;
        int P2;
        String str;
        String str2;
        int i2;
        char c;
        long j;
        boolean z;
        int i3;
        int[] iArr = this.a0;
        int i4 = this.b0;
        int i5 = iArr[i4 - 1];
        if (i5 == 1) {
            iArr[i4 - 1] = 2;
        } else if (i5 == 2) {
            int P3 = P(true);
            if (P3 != 44) {
                if (P3 != 59) {
                    if (P3 == 93) {
                        this.W = 4;
                        return 4;
                    }
                    a0("Unterminated array");
                    throw null;
                }
                g();
            }
        } else {
            if (i5 != 3 && i5 != 5) {
                if (i5 == 4) {
                    iArr[i4 - 1] = 5;
                    int P4 = P(true);
                    if (P4 != 58) {
                        if (P4 == 61) {
                            g();
                            if (this.S < this.T || F(1)) {
                                char[] cArr = this.R;
                                int i6 = this.S;
                                if (cArr[i6] == '>') {
                                    this.S = i6 + 1;
                                }
                            }
                        } else {
                            a0("Expected ':'");
                            throw null;
                        }
                    }
                } else if (i5 == 6) {
                    if (this.Q) {
                        P(true);
                        int i7 = this.S - 1;
                        this.S = i7;
                        char[] cArr2 = e0;
                        if (i7 + cArr2.length <= this.T || F(cArr2.length)) {
                            int i8 = 0;
                            while (true) {
                                char[] cArr3 = e0;
                                if (i8 < cArr3.length) {
                                    if (this.R[this.S + i8] != cArr3[i8]) {
                                        break;
                                    }
                                    i8++;
                                } else {
                                    this.S += cArr3.length;
                                    break;
                                }
                            }
                        }
                    }
                    this.a0[this.b0 - 1] = 7;
                } else if (i5 == 7) {
                    if (P(false) == -1) {
                        i = 17;
                    } else {
                        g();
                        this.S--;
                    }
                } else {
                    if (i5 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                    P2 = P(true);
                    if (P2 == 34) {
                        if (P2 != 39) {
                            if (P2 != 44 && P2 != 59) {
                                if (P2 != 91) {
                                    if (P2 != 93) {
                                        if (P2 != 123) {
                                            int i9 = this.S - 1;
                                            this.S = i9;
                                            char c2 = this.R[i9];
                                            if (c2 != 't' && c2 != 'T') {
                                                if (c2 != 'f' && c2 != 'F') {
                                                    if (c2 == 'n' || c2 == 'N') {
                                                        str = "null";
                                                        str2 = "NULL";
                                                        i2 = 7;
                                                    }
                                                    i2 = 0;
                                                    if (i2 == 0) {
                                                        return i2;
                                                    }
                                                    char[] cArr4 = this.R;
                                                    int i10 = this.S;
                                                    int i11 = this.T;
                                                    long j2 = 0;
                                                    long j3 = 0;
                                                    int i12 = 0;
                                                    char c3 = 0;
                                                    boolean z2 = false;
                                                    boolean z3 = true;
                                                    while (true) {
                                                        if (i10 + i12 == i11) {
                                                            if (i12 == cArr4.length) {
                                                                break;
                                                            } else if (!F(i12 + 1)) {
                                                                break;
                                                            } else {
                                                                i10 = this.S;
                                                                i11 = this.T;
                                                            }
                                                        }
                                                        char c4 = cArr4[i10 + i12];
                                                        if (c4 != '+') {
                                                            if (c4 != 'E' && c4 != 'e') {
                                                                if (c4 != '-') {
                                                                    if (c4 != '.') {
                                                                        if (c4 < '0' || c4 > '9') {
                                                                            break;
                                                                        }
                                                                        if (c3 != 1 && c3 != 0) {
                                                                            if (c3 == 2) {
                                                                                if (j3 == j2) {
                                                                                    break;
                                                                                }
                                                                                long j4 = (10 * j3) - (c4 - '0');
                                                                                if (j3 <= -922337203685477580L && (j3 != -922337203685477580L || j4 >= j3)) {
                                                                                    z = false;
                                                                                } else {
                                                                                    z = true;
                                                                                }
                                                                                z3 &= z;
                                                                                j3 = j4;
                                                                            } else if (c3 == 3) {
                                                                                c3 = 4;
                                                                            } else {
                                                                                if (c3 == 5) {
                                                                                }
                                                                                c3 = 7;
                                                                            }
                                                                        } else {
                                                                            j3 = -(c4 - '0');
                                                                            c3 = 2;
                                                                        }
                                                                        j = 0;
                                                                        i12++;
                                                                        j2 = j;
                                                                    } else {
                                                                        j = j2;
                                                                        if (c3 != 2) {
                                                                            break;
                                                                        }
                                                                        c3 = 3;
                                                                        i12++;
                                                                        j2 = j;
                                                                    }
                                                                } else {
                                                                    j = j2;
                                                                    if (c3 == 0) {
                                                                        c3 = 1;
                                                                        z2 = true;
                                                                        i12++;
                                                                        j2 = j;
                                                                    } else {
                                                                        if (c3 != 5) {
                                                                            break;
                                                                        }
                                                                        c3 = 6;
                                                                        i12++;
                                                                        j2 = j;
                                                                    }
                                                                }
                                                            } else {
                                                                j = j2;
                                                                if (c3 != 2 && c3 != 4) {
                                                                    break;
                                                                }
                                                                c3 = 5;
                                                                i12++;
                                                                j2 = j;
                                                            }
                                                            if (i3 == 0) {
                                                                return i3;
                                                            }
                                                            if (I(this.R[this.S])) {
                                                                g();
                                                                i = 10;
                                                            } else {
                                                                a0("Expected value");
                                                                throw null;
                                                            }
                                                        } else {
                                                            j = j2;
                                                            if (c3 != 5) {
                                                                break;
                                                            }
                                                            c3 = 6;
                                                            i12++;
                                                            j2 = j;
                                                        }
                                                    }
                                                    i3 = 0;
                                                    if (i3 == 0) {
                                                    }
                                                } else {
                                                    str = "false";
                                                    str2 = "FALSE";
                                                    i2 = 6;
                                                }
                                            } else {
                                                str = "true";
                                                str2 = "TRUE";
                                                i2 = 5;
                                            }
                                            int length = str.length();
                                            int i13 = 1;
                                            while (true) {
                                                if (i13 < length) {
                                                    if ((this.S + i13 >= this.T && !F(i13 + 1)) || ((c = this.R[this.S + i13]) != str.charAt(i13) && c != str2.charAt(i13))) {
                                                        break;
                                                    }
                                                    i13++;
                                                } else if ((this.S + length >= this.T && !F(length + 1)) || !I(this.R[this.S + length])) {
                                                    this.S += length;
                                                    this.W = i2;
                                                }
                                            }
                                            i2 = 0;
                                            if (i2 == 0) {
                                            }
                                        } else {
                                            this.W = 1;
                                            return 1;
                                        }
                                    } else if (i5 == 1) {
                                        i = 4;
                                    }
                                } else {
                                    i = 3;
                                }
                            }
                            if (i5 != 1 && i5 != 2) {
                                a0("Unexpected value");
                                throw null;
                            }
                            g();
                            this.S--;
                            i = 7;
                        } else {
                            g();
                            i = 8;
                        }
                    } else {
                        i = 9;
                    }
                }
            } else {
                iArr[i4 - 1] = 4;
                if (i5 == 5 && (P = P(true)) != 44) {
                    if (P != 59) {
                        if (P == 125) {
                            this.W = 2;
                            return 2;
                        }
                        a0("Unterminated object");
                        throw null;
                    }
                    g();
                }
                int P5 = P(true);
                if (P5 != 34) {
                    if (P5 != 39) {
                        if (P5 != 125) {
                            g();
                            this.S--;
                            if (I((char) P5)) {
                                i = 14;
                            } else {
                                a0("Expected name");
                                throw null;
                            }
                        } else if (i5 != 5) {
                            this.W = 2;
                            return 2;
                        } else {
                            a0("Expected name");
                            throw null;
                        }
                    } else {
                        g();
                        i = 12;
                    }
                } else {
                    i = 13;
                }
            }
            this.W = i;
            return i;
        }
        P2 = P(true);
        if (P2 == 34) {
        }
        this.W = i;
        return i;
    }

    public String toString() {
        return getClass().getSimpleName() + J();
    }

    public void y() {
        int i = this.W;
        if (i == 0) {
            i = t();
        }
        if (i == 4) {
            int i2 = this.b0 - 1;
            this.b0 = i2;
            int[] iArr = this.d0;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.W = 0;
            return;
        }
        StringBuilder b = e5.b("Expected END_ARRAY but was ");
        b.append(ik.b(U()));
        b.append(J());
        throw new IllegalStateException(b.toString());
    }
}