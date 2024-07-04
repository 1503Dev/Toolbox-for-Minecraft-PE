package defpackage;

import java.net.ProtocolException;

/* renamed from: yt0  reason: default package */
public final class yt0 {
    public final ig0 a;
    public final int b;
    public final String c;

    public yt0(ig0 ig0Var, int i, String str) {
        this.a = ig0Var;
        this.b = i;
        this.c = str;
    }

    public static yt0 a(String str) {
        String str2;
        ig0 ig0Var = ig0.HTTP_1_0;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() >= 9 && str.charAt(8) == ' ') {
                int charAt = str.charAt(7) - '0';
                if (charAt != 0) {
                    if (charAt == 1) {
                        ig0Var = ig0.HTTP_1_1;
                    } else {
                        throw new ProtocolException(k6.b("Unexpected status line: ", str));
                    }
                }
            } else {
                throw new ProtocolException(k6.b("Unexpected status line: ", str));
            }
        } else if (str.startsWith("ICY ")) {
            i = 4;
        } else {
            throw new ProtocolException(k6.b("Unexpected status line: ", str));
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                int parseInt = Integer.parseInt(str.substring(i, i2));
                if (str.length() > i2) {
                    if (str.charAt(i2) == ' ') {
                        str2 = str.substring(i + 4);
                    } else {
                        throw new ProtocolException(k6.b("Unexpected status line: ", str));
                    }
                } else {
                    str2 = "";
                }
                return new yt0(ig0Var, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(k6.b("Unexpected status line: ", str));
            }
        }
        throw new ProtocolException(k6.b("Unexpected status line: ", str));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a == ig0.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.b);
        if (this.c != null) {
            sb.append(' ');
            sb.append(this.c);
        }
        return sb.toString();
    }
}