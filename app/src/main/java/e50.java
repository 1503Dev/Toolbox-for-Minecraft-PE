package defpackage;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* renamed from: e50  reason: default package */
public final class e50 {
    public static final Pattern d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String a;
    public final String b;
    @Nullable
    public final String c;

    public e50(String str, String str2, @Nullable String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static e50 a(String str) {
        Matcher matcher = d.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            Locale locale = Locale.US;
            String lowerCase = group.toLowerCase(locale);
            matcher.group(2).toLowerCase(locale);
            String str2 = null;
            Matcher matcher2 = e.matcher(str);
            for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group2 = matcher2.group(1);
                    if (group2 != null && group2.equalsIgnoreCase("charset")) {
                        String group3 = matcher2.group(2);
                        if (group3 != null) {
                            if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                                group3 = group3.substring(1, group3.length() - 1);
                            }
                        } else {
                            group3 = matcher2.group(3);
                        }
                        if (str2 != null && !group3.equalsIgnoreCase(str2)) {
                            StringBuilder b = sd1.b("Multiple charsets defined: \"", str2, "\" and: \"", group3, "\" for: \"");
                            b.append(str);
                            b.append('\"');
                            throw new IllegalArgumentException(b.toString());
                        }
                        str2 = group3;
                    }
                } else {
                    StringBuilder b2 = e5.b("Parameter is not formatted correctly: \"");
                    b2.append(str.substring(end));
                    b2.append("\" for: \"");
                    b2.append(str);
                    b2.append('\"');
                    throw new IllegalArgumentException(b2.toString());
                }
            }
            return new e50(str, lowerCase, str2);
        }
        throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof e50) && ((e50) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}