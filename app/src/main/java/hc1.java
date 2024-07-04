package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: hc1  reason: default package */
public final class hc1 {
    public static final SimpleDateFormat e = new SimpleDateFormat("yyyyMMdd'T'HHmmss.SSSZ", Locale.US);
    public Date a;
    public int b;
    public ja1 c;
    public String d;

    public final String a() {
        int i = this.b;
        return i != -1 ? i != 0 ? i != 1 ? i != 2 ? i != 3 ? "UNKNOWN LOG LEVEL" : "Debug" : "Info" : "Warn" : "Error" : "Fatal";
    }

    public final String toString() {
        return e.format(this.a) + " " + a() + "/" + ((String) this.c.R) + ": " + this.d;
    }
}