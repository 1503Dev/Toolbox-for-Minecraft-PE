package defpackage;

import java.io.IOException;

/* renamed from: uu  reason: default package */
public final class uu {
    public static final fb a = fb.h("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    public static final String[] b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    public static final String[] c = new String[64];
    public static final String[] d = new String[256];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = d;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = c31.j("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i3 = 0; i3 < 1; i3++) {
            int i4 = iArr[i3];
            String[] strArr3 = c;
            strArr3[i4 | 8] = qq.d(new StringBuilder(), strArr3[i4], "|PADDED");
        }
        String[] strArr4 = c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 < 1; i7++) {
                int i8 = iArr[i7];
                String[] strArr5 = c;
                int i9 = i8 | i6;
                strArr5[i9] = strArr5[i8] + '|' + strArr5[i6];
                StringBuilder sb = new StringBuilder();
                sb.append(strArr5[i8]);
                sb.append('|');
                strArr5[i9 | 8] = qq.d(sb, strArr5[i6], "|PADDED");
            }
        }
        while (true) {
            String[] strArr6 = c;
            if (i < strArr6.length) {
                if (strArr6[i] == null) {
                    strArr6[i] = d[i];
                }
                i++;
            } else {
                return;
            }
        }
    }

    public static String a(boolean z, int i, int i2, byte b2, byte b3) {
        String j;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String[] strArr = b;
        if (b2 < strArr.length) {
            j = strArr[b2];
        } else {
            j = c31.j("0x%02x", Byte.valueOf(b2));
        }
        if (b3 == 0) {
            str = "";
        } else {
            if (b2 != 2 && b2 != 3) {
                if (b2 != 4 && b2 != 6) {
                    if (b2 != 7 && b2 != 8) {
                        String[] strArr2 = c;
                        if (b3 < strArr2.length) {
                            str2 = strArr2[b3];
                        } else {
                            str2 = d[b3];
                        }
                        if (b2 == 5 && (b3 & 4) != 0) {
                            str3 = "HEADERS";
                            str4 = "PUSH_PROMISE";
                        } else if (b2 == 0 && (b3 & 32) != 0) {
                            str3 = "PRIORITY";
                            str4 = "COMPRESSED";
                        } else {
                            str = str2;
                        }
                        str = str2.replace(str3, str4);
                    }
                } else if (b3 == 1) {
                    str = "ACK";
                } else {
                    str = d[b3];
                }
            }
            str = d[b3];
        }
        Object[] objArr = new Object[5];
        if (z) {
            str5 = "<<";
        } else {
            str5 = ">>";
        }
        objArr[0] = str5;
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = j;
        objArr[4] = str;
        return c31.j("%s 0x%08x %5d %-13s %s", objArr);
    }

    public static void b(String str, Object... objArr) {
        throw new IOException(c31.j(str, objArr));
    }
}