package defpackage;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: kv  reason: default package */
public final class kv {
    public static final a a = new a();
    public static final String[] b = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
    public static final DateFormat[] c = new DateFormat[15];

    /* renamed from: kv$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends ThreadLocal<DateFormat> {
        @Override // java.lang.ThreadLocal
        public final DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(c31.h);
            return simpleDateFormat;
        }
    }

    public static Date a(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = a.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = b;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                DateFormat[] dateFormatArr = c;
                DateFormat dateFormat = dateFormatArr[i];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(b[i], Locale.US);
                    dateFormat.setTimeZone(c31.h);
                    dateFormatArr[i] = dateFormat;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            return null;
        }
    }
}