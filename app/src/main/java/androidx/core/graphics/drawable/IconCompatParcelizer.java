package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import java.nio.charset.Charset;

public class IconCompatParcelizer {
    public static IconCompat read(m31 m31Var) {
        Parcelable parcelable;
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.a;
        if (m31Var.i(1)) {
            i = m31Var.j();
        }
        iconCompat.a = i;
        byte[] bArr = iconCompat.c;
        if (m31Var.i(2)) {
            bArr = m31Var.g();
        }
        iconCompat.c = bArr;
        Parcelable parcelable2 = iconCompat.d;
        if (m31Var.i(3)) {
            parcelable2 = m31Var.k();
        }
        iconCompat.d = parcelable2;
        int i2 = iconCompat.e;
        if (m31Var.i(4)) {
            i2 = m31Var.j();
        }
        iconCompat.e = i2;
        int i3 = iconCompat.f;
        if (m31Var.i(5)) {
            i3 = m31Var.j();
        }
        iconCompat.f = i3;
        Parcelable parcelable3 = iconCompat.g;
        if (m31Var.i(6)) {
            parcelable3 = m31Var.k();
        }
        iconCompat.g = (ColorStateList) parcelable3;
        String str = iconCompat.i;
        if (m31Var.i(7)) {
            str = m31Var.l();
        }
        iconCompat.i = str;
        String str2 = iconCompat.j;
        if (m31Var.i(8)) {
            str2 = m31Var.l();
        }
        iconCompat.j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                parcelable = iconCompat.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.b = parcelable;
                break;
            case 1:
            case 5:
                parcelable = iconCompat.d;
                if (parcelable == null) {
                    byte[] bArr2 = iconCompat.c;
                    iconCompat.b = bArr2;
                    iconCompat.a = 3;
                    iconCompat.e = 0;
                    iconCompat.f = bArr2.length;
                    break;
                }
                iconCompat.b = parcelable;
                break;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.b = str3;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str3.split(":", -1)[0];
                    break;
                }
                break;
            case 3:
                iconCompat.b = iconCompat.c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, m31 m31Var) {
        m31Var.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            m31Var.n(1);
            m31Var.r(i);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            m31Var.n(2);
            m31Var.p(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            m31Var.n(3);
            m31Var.s(parcelable);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            m31Var.n(4);
            m31Var.r(i2);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            m31Var.n(5);
            m31Var.r(i3);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            m31Var.n(6);
            m31Var.s(colorStateList);
        }
        String str = iconCompat.i;
        if (str != null) {
            m31Var.n(7);
            m31Var.t(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            m31Var.n(8);
            m31Var.t(str2);
        }
    }
}