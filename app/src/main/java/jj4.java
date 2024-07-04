package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: jj4  reason: default package */
public final class jj4 {
    public final Pattern a;

    public jj4() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) w82.d.c.a(x92.P5));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.a = pattern;
    }

    public final String a(String str) {
        Pattern pattern = this.a;
        if (pattern != null && str != null) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
        }
        return null;
    }
}