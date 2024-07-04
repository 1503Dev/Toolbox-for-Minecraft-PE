package defpackage;

import java.util.regex.Pattern;

/* renamed from: m60  reason: default package */
public final class m60 {
    public static final Pattern a = Pattern.compile("[-+]?(\\d+\\.?\\d*|\\.\\d+)(?:e[-+]?\\d+)?[fd]?");
    public static final Pattern b = Pattern.compile("[-+]?([0-9]|[1-9][0-9]+)[bsl]?");

    public static l60 a(o60 o60Var, n60 n60Var) {
        char c;
        switch (n60Var.a) {
            case -1:
                return new l60("Unexpected end of text", o60Var.c);
            case 0:
            case 1:
                return new l60("Unexpected text", o60Var.c);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                StringBuilder b2 = e5.b("Unexpected character: ");
                switch (n60Var.a) {
                    case 2:
                        c = '{';
                        break;
                    case 3:
                        c = '}';
                        break;
                    case 4:
                        c = '[';
                        break;
                    case 5:
                        c = ']';
                        break;
                    case 6:
                        c = ':';
                        break;
                    case 7:
                        c = ';';
                        break;
                    case 8:
                        c = ',';
                        break;
                    default:
                        c = '?';
                        break;
                }
                b2.append(c);
                return new l60(b2.toString(), o60Var.c);
            default:
                return new l60("Unexpected token", o60Var.c);
        }
    }

    public static ze b(String str) {
        o60 o60Var = new o60(str);
        tv0 c = c(o60Var, null);
        if (o60Var.a() == n60.c) {
            if (c instanceof ze) {
                return (ze) c;
            }
            throw new l60("Root tag is not a compound", 0);
        }
        throw new l60("Expected end of text", o60Var.c);
    }

    public static tv0 c(o60 o60Var, n60 n60Var) {
        n60 b2;
        char charAt;
        n60 b3;
        if (n60Var == null) {
            n60Var = o60Var.b();
        }
        if (n60Var == n60.d) {
            ze zeVar = new ze();
            do {
                n60 b4 = o60Var.b();
                n60 n60Var2 = n60.e;
                if (b4 != n60Var2) {
                    int i = b4.a;
                    if (i != 0 && i != 1) {
                        throw a(o60Var, b4);
                    }
                    String str = b4.b;
                    n60 b5 = o60Var.b();
                    if (b5 == n60.h) {
                        zeVar.x(str, c(o60Var, null));
                        b3 = o60Var.b();
                        if (b3 == n60Var2) {
                        }
                    } else {
                        throw a(o60Var, b5);
                    }
                }
                return zeVar;
            } while (b3 == n60.j);
            throw a(o60Var, b3);
        }
        char c = 0;
        if (n60Var == n60.f) {
            int i2 = o60Var.c;
            n60 a2 = o60Var.a();
            if (a2.a == 0 && a2.b.length() == 1 && o60Var.a() == n60.i && ((charAt = a2.b.charAt(0)) == 'B' || charAt == 'I')) {
                c = charAt;
            }
            if (c == 0) {
                o60Var.c = i2;
            }
            b20 b20Var = new b20();
            do {
                n60 b6 = o60Var.b();
                n60 n60Var3 = n60.g;
                if (b6 != n60Var3) {
                    tv0 c2 = c(o60Var, b6);
                    if (b20Var.B() != wo.class && b20Var.B() != c2.getClass()) {
                        throw new l60("List tags must be of a single type", o60Var.c);
                    }
                    b20Var.w(c2);
                    b2 = o60Var.b();
                    if (b2 == n60Var3) {
                    }
                }
                if (c == 'B') {
                    if (b20Var.B() != wo.class && b20Var.B() != gb.class) {
                        throw new l60("Byte array can only contain bytes", o60Var.c);
                    }
                    byte[] bArr = new byte[b20Var.size()];
                    for (int size = b20Var.size() - 1; size >= 0; size--) {
                        bArr[size] = ((Number) ((gb) b20Var.z(size)).P).byteValue();
                    }
                    return new eb(bArr);
                } else if (c == 'I') {
                    if (b20Var.B() != wo.class && b20Var.B() != yx.class) {
                        throw new l60("Int array can only contain ints", o60Var.c);
                    }
                    int[] iArr = new int[b20Var.size()];
                    for (int size2 = b20Var.size() - 1; size2 >= 0; size2--) {
                        iArr[size2] = ((Number) ((yx) b20Var.z(size2)).P).intValue();
                    }
                    return new wx(iArr);
                } else {
                    return b20Var;
                }
            } while (b2 == n60.j);
            throw a(o60Var, b2);
        }
        if (n60Var.a == 0) {
            String str2 = n60Var.b;
            try {
                if (b.matcher(str2).matches()) {
                    if (str2.endsWith("b")) {
                        return new gb(Byte.parseByte(str2.substring(0, str2.length() - 1)));
                    }
                    if (str2.endsWith("s")) {
                        return new rr0(Short.parseShort(str2.substring(0, str2.length() - 1)));
                    }
                    if (str2.endsWith("l")) {
                        return new e30(Long.parseLong(str2.substring(0, str2.length() - 1)));
                    }
                    return new yx(Integer.parseInt(str2));
                } else if (a.matcher(str2).matches()) {
                    if (str2.endsWith("f")) {
                        return new jq(Float.parseFloat(str2.substring(0, str2.length() - 1)));
                    }
                    if (str2.endsWith("d")) {
                        return new am(Double.parseDouble(str2.substring(0, str2.length() - 1)));
                    }
                    return new am(Double.parseDouble(str2));
                } else if (str2.equals("true")) {
                    return new gb(true);
                } else {
                    if (str2.equals("false")) {
                        return new gb(false);
                    }
                }
            } catch (NumberFormatException unused) {
                throw new l60(k6.b("Invalid number: ", str2), o60Var.c);
            }
        }
        int i3 = n60Var.a;
        if (i3 != 0 && i3 != 1) {
            throw a(o60Var, n60Var);
        }
        return new gu0(n60Var.b);
    }
}