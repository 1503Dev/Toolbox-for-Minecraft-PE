package defpackage;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* renamed from: kw  reason: default package */
public final class kw {
    public static final TimeZone a = TimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00e1 A[Catch: IllegalArgumentException -> 0x01d0, NumberFormatException -> 0x01d2, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d4, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d4, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0050, B:19:0x0060, B:20:0x0062, B:22:0x006e, B:23:0x0070, B:25:0x0076, B:29:0x0080, B:34:0x0090, B:36:0x0098, B:37:0x009c, B:39:0x00a2, B:44:0x00af, B:46:0x00b6, B:57:0x00db, B:59:0x00e1, B:61:0x00e8, B:86:0x0197, B:66:0x00f4, B:67:0x010f, B:68:0x0110, B:72:0x012c, B:74:0x0139, B:77:0x0142, B:79:0x0161, B:82:0x0170, B:83:0x0192, B:85:0x0195, B:71:0x011b, B:88:0x01c8, B:89:0x01cf, B:50:0x00c6, B:51:0x00c9, B:45:0x00b2), top: B:106:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c8 A[Catch: IllegalArgumentException -> 0x01d0, NumberFormatException -> 0x01d2, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d4, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d4, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0050, B:19:0x0060, B:20:0x0062, B:22:0x006e, B:23:0x0070, B:25:0x0076, B:29:0x0080, B:34:0x0090, B:36:0x0098, B:37:0x009c, B:39:0x00a2, B:44:0x00af, B:46:0x00b6, B:57:0x00db, B:59:0x00e1, B:61:0x00e8, B:86:0x0197, B:66:0x00f4, B:67:0x010f, B:68:0x0110, B:72:0x012c, B:74:0x0139, B:77:0x0142, B:79:0x0161, B:82:0x0170, B:83:0x0192, B:85:0x0195, B:71:0x011b, B:88:0x01c8, B:89:0x01cf, B:50:0x00c6, B:51:0x00c9, B:45:0x00b2), top: B:106:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date b(String str, ParsePosition parsePosition) {
        String str2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int length;
        TimeZone timeZone;
        char charAt;
        try {
            int index = parsePosition.getIndex();
            int i7 = index + 4;
            int c = c(index, i7, str);
            if (a(str, i7, '-')) {
                i7++;
            }
            int i8 = i7 + 2;
            int c2 = c(i7, i8, str);
            if (a(str, i8, '-')) {
                i8++;
            }
            int i9 = i8 + 2;
            int c3 = c(i8, i9, str);
            boolean a2 = a(str, i9, 'T');
            if (!a2 && str.length() <= i9) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(c, c2 - 1, c3);
                parsePosition.setIndex(i9);
                return gregorianCalendar.getTime();
            }
            if (a2) {
                int i10 = i9 + 1;
                int i11 = i10 + 2;
                i5 = c(i10, i11, str);
                if (a(str, i11, ':')) {
                    i11++;
                }
                int i12 = i11 + 2;
                i2 = c(i11, i12, str);
                if (a(str, i12, ':')) {
                    i12++;
                }
                if (str.length() > i12 && (charAt = str.charAt(i12)) != 'Z' && charAt != '+' && charAt != '-') {
                    i6 = i12 + 2;
                    i4 = c(i12, i6, str);
                    if (i4 > 59 && i4 < 63) {
                        i4 = 59;
                    }
                    if (a(str, i6, '.')) {
                        int i13 = i6 + 1;
                        int i14 = i13 + 1;
                        while (true) {
                            if (i14 < str.length()) {
                                char charAt2 = str.charAt(i14);
                                if (charAt2 < '0' || charAt2 > '9') {
                                    break;
                                }
                                i14++;
                            } else {
                                i14 = str.length();
                                break;
                            }
                        }
                        int min = Math.min(i14, i13 + 3);
                        i3 = c(i13, min, str);
                        int i15 = min - i13;
                        if (i15 != 1) {
                            if (i15 == 2) {
                                i3 *= 10;
                            }
                        } else {
                            i3 *= 100;
                        }
                        i6 = i14;
                    } else {
                        i3 = 0;
                    }
                    if (str.length() <= i6) {
                        char charAt3 = str.charAt(i6);
                        if (charAt3 == 'Z') {
                            timeZone = a;
                            length = i6 + 1;
                        } else {
                            if (charAt3 != '+' && charAt3 != '-') {
                                throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt3 + "'");
                            }
                            String substring = str.substring(i6);
                            if (substring.length() < 5) {
                                substring = substring + "00";
                            }
                            length = i6 + substring.length();
                            if (!"+0000".equals(substring) && !"+00:00".equals(substring)) {
                                String str3 = "GMT" + substring;
                                TimeZone timeZone2 = TimeZone.getTimeZone(str3);
                                String id = timeZone2.getID();
                                if (!id.equals(str3) && !id.replace(":", "").equals(str3)) {
                                    throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone2.getID());
                                }
                                timeZone = timeZone2;
                            }
                            timeZone = a;
                        }
                        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                        gregorianCalendar2.setLenient(false);
                        gregorianCalendar2.set(1, c);
                        gregorianCalendar2.set(2, c2 - 1);
                        gregorianCalendar2.set(5, c3);
                        gregorianCalendar2.set(11, i5);
                        gregorianCalendar2.set(12, i2);
                        gregorianCalendar2.set(13, i4);
                        gregorianCalendar2.set(14, i3);
                        parsePosition.setIndex(length);
                        return gregorianCalendar2.getTime();
                    }
                    throw new IllegalArgumentException("No time zone indicator");
                }
                i = i5;
                i9 = i12;
            } else {
                i = 0;
                i2 = 0;
            }
            i3 = 0;
            i4 = 0;
            int i16 = i9;
            i5 = i;
            i6 = i16;
            if (str.length() <= i6) {
            }
        } catch (IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException e) {
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            String message = e.getMessage();
            if (message == null || message.isEmpty()) {
                StringBuilder b = e5.b("(");
                b.append(e.getClass().getName());
                b.append(")");
                message = b.toString();
            }
            ParseException parseException = new ParseException(ho.b("Failed to parse date [", str2, "]: ", message), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        }
    }

    public static int c(int i, int i2, String str) {
        int i3;
        int i4;
        if (i >= 0 && i2 <= str.length() && i <= i2) {
            if (i < i2) {
                i4 = i + 1;
                int digit = Character.digit(str.charAt(i), 10);
                if (digit >= 0) {
                    i3 = -digit;
                } else {
                    StringBuilder b = e5.b("Invalid number: ");
                    b.append(str.substring(i, i2));
                    throw new NumberFormatException(b.toString());
                }
            } else {
                i3 = 0;
                i4 = i;
            }
            while (i4 < i2) {
                int i5 = i4 + 1;
                int digit2 = Character.digit(str.charAt(i4), 10);
                if (digit2 >= 0) {
                    i3 = (i3 * 10) - digit2;
                    i4 = i5;
                } else {
                    StringBuilder b2 = e5.b("Invalid number: ");
                    b2.append(str.substring(i, i2));
                    throw new NumberFormatException(b2.toString());
                }
            }
            return -i3;
        }
        throw new NumberFormatException(str);
    }
}