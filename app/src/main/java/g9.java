package defpackage;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Locale;

/* renamed from: g9  reason: default package */
public final class g9 implements hk1, kg4 {
    public static final byte[] P = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    public static final /* synthetic */ g9 Q = new g9();
    public static final byte[] R = {0, 0, 0, 1};
    public static final String[] S = {"", "A", "B", "C"};
    public static final /* synthetic */ g9 T = new g9();

    public static int b(InputStream inputStream, byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int read = inputStream.read(bArr, 0 + i, length - i);
            if (read < 0) {
                break;
            }
            i += read;
        }
        return i;
    }

    public static String c(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static String d(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = new Object[5];
        objArr[0] = S[i];
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Integer.valueOf(i3);
        objArr[3] = Character.valueOf(true != z ? 'L' : 'H');
        objArr[4] = Integer.valueOf(i4);
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i5 = 6;
        while (i5 > 0) {
            int i6 = i5 - 1;
            if (iArr[i6] != 0) {
                break;
            }
            i5 = i6;
        }
        for (int i7 = 0; i7 < i5; i7++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i7])));
        }
        return sb.toString();
    }

    @Override // defpackage.hk1
    public Constructor a() {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(lk1.class).getConstructor(new Class[0]);
    }

    @Override // defpackage.kg4, defpackage.v64
    /* renamed from: e */
    public void mo5e(Object obj) {
        ((q33) obj).d();
    }
}