package defpackage;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ul1  reason: default package */
public final class ul1 {
    public static yt2 a(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = zn4.a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                lb4.c("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(nn1.a(new kh4(Base64.decode(split[1], 0))));
                } catch (RuntimeException e) {
                    lb4.d("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new dp1(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new yt2(arrayList);
    }

    public static q65 b(kh4 kh4Var, boolean z, boolean z2) {
        if (z) {
            c(3, kh4Var, false);
        }
        String z3 = kh4Var.z((int) kh4Var.s(), zs4.c);
        long s = kh4Var.s();
        String[] strArr = new String[(int) s];
        for (int i = 0; i < s; i++) {
            strArr[i] = kh4Var.z((int) kh4Var.s(), zs4.c);
        }
        if (z2 && (kh4Var.n() & 1) == 0) {
            throw jy2.a("framing bit expected to be set", null);
        }
        return new q65(z3, strArr);
    }

    public static boolean c(int i, kh4 kh4Var, boolean z) {
        int i2 = kh4Var.c - kh4Var.b;
        if (i2 < 7) {
            if (z) {
                return false;
            }
            throw jy2.a("too short header: " + i2, null);
        } else if (kh4Var.n() != i) {
            if (z) {
                return false;
            }
            throw jy2.a("expected header type ".concat(String.valueOf(Integer.toHexString(i))), null);
        } else if (kh4Var.n() == 118 && kh4Var.n() == 111 && kh4Var.n() == 114 && kh4Var.n() == 98 && kh4Var.n() == 105 && kh4Var.n() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw jy2.a("expected characters 'vorbis'", null);
        }
    }
}