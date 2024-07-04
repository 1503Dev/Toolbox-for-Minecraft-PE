package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: tv0  reason: default package */
public abstract class tv0<T> implements Cloneable {
    public static final Map<String, String> Q;
    public static final Pattern R;
    public static final Pattern S;
    public static final Pattern T;
    public static final Pattern U;
    public T P;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("\\", "\\\\\\\\");
        hashMap.put("\n", "\\\\n");
        hashMap.put("\t", "\\\\t");
        hashMap.put("\r", "\\\\r");
        hashMap.put("\"", "\\\\\"");
        Q = Collections.unmodifiableMap(hashMap);
        R = Pattern.compile("[\\\\\n\t\r\"]");
        S = Pattern.compile("[a-zA-Z0-9_\\-+]+");
        T = Pattern.compile("[-+]?(\\d+\\.?\\d*|\\.\\d+)(?:e[-+]?\\d+)?[fd]?");
        U = Pattern.compile("[-+]?([0-9]|[1-9][0-9]+)[bsl]?");
    }

    public tv0(T t) {
        r(t);
    }

    public static int n(int i) {
        if (i >= 0) {
            if (i != 0) {
                return i - 1;
            }
            throw new q40();
        }
        throw new IllegalArgumentException("negative maximum depth is not allowed");
    }

    public static String p(String str, boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = R.matcher(str);
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, Q.get(matcher.group()));
        }
        matcher.appendTail(stringBuffer);
        boolean matches = S.matcher(str).matches();
        if (matches) {
            matches = !T.matcher(str).matches();
        }
        if (matches) {
            matches = !U.matcher(str).matches();
        }
        if (!z || !matches) {
            stringBuffer.insert(0, "\"").append("\"");
        }
        return stringBuffer.toString();
    }

    public boolean equals(Object obj) {
        return obj != null && getClass() == obj.getClass();
    }

    public T h(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public int hashCode() {
        return this.P.hashCode();
    }

    @Override // 
    /* renamed from: m */
    public abstract tv0<T> clone();

    public abstract void o(o00 o00Var, int i);

    public abstract void q(p00 p00Var, int i);

    public void r(T t) {
        this.P = h(t);
    }

    public final String s(int i) {
        StringBuilder b = e5.b("{\"type\":\"");
        b.append(getClass().getSimpleName());
        b.append("\",\"value\":");
        b.append(u(i));
        b.append("}");
        return b.toString();
    }

    public final String toString() {
        return s(512);
    }

    public abstract String u(int i);

    public abstract String v(int i);
}