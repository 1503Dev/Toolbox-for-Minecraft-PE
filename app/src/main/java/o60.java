package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: o60  reason: default package */
public final class o60 {
    public static final Pattern d = Pattern.compile("^[0-9a-zA-Z_\\-.+]+");
    public final Matcher a;
    public final String b;
    public int c = 0;

    public o60(String str) {
        this.b = str;
        this.a = d.matcher(str);
    }

    public final n60 a() {
        char charAt;
        if (this.c == this.b.length()) {
            return n60.c;
        }
        char charAt2 = this.b.charAt(this.c);
        if (Character.isWhitespace(charAt2)) {
            while (this.c < this.b.length() && Character.isWhitespace(this.b.charAt(this.c))) {
                this.c++;
            }
            return n60.k;
        } else if (charAt2 != '\"') {
            if (charAt2 != ',') {
                if (charAt2 != '[') {
                    if (charAt2 != ']') {
                        if (charAt2 != '{') {
                            if (charAt2 != '}') {
                                if (charAt2 != ':') {
                                    if (charAt2 != ';') {
                                        this.a.region(this.c, this.b.length());
                                        if (this.a.find()) {
                                            this.c = this.a.end();
                                            return new n60(0, this.b.substring(this.a.start(), this.a.end()));
                                        }
                                        StringBuilder b = e5.b("Invalid character in identifier: ");
                                        b.append(this.b.charAt(this.c));
                                        throw new l60(b.toString(), this.c);
                                    }
                                    this.c++;
                                    return n60.i;
                                }
                                this.c++;
                                return n60.h;
                            }
                            this.c++;
                            return n60.e;
                        }
                        this.c++;
                        return n60.d;
                    }
                    this.c++;
                    return n60.g;
                }
                this.c++;
                return n60.f;
            }
            this.c++;
            return n60.j;
        } else {
            this.c++;
            StringBuilder sb = new StringBuilder();
            int length = this.b.length();
            int i = this.c;
            while (true) {
                if (i >= length) {
                    break;
                }
                char charAt3 = this.b.charAt(i);
                if (charAt3 == '\\') {
                    i++;
                    if (i < length) {
                        char charAt4 = this.b.charAt(i);
                        if (charAt4 != '\"') {
                            if (charAt4 == 'n') {
                                charAt = '\n';
                            } else if (charAt4 == 't') {
                                charAt = '\t';
                            } else if (charAt4 == 'r') {
                                charAt = '\r';
                            } else if (charAt4 == '\\') {
                                sb.append('\\');
                                i++;
                            } else {
                                throw new l60("Unsupported escape: " + charAt4, this.c);
                            }
                            sb.append(charAt);
                            i++;
                        }
                    } else {
                        throw new l60("Unexpected end of text while parsing escape", this.c);
                    }
                } else if (charAt3 == '\"') {
                    i++;
                    break;
                }
                charAt = this.b.charAt(i);
                sb.append(charAt);
                i++;
            }
            this.c = i;
            return new n60(1, sb.toString());
        }
    }

    public final n60 b() {
        n60 a;
        do {
            a = a();
        } while (a == n60.k);
        return a;
    }
}