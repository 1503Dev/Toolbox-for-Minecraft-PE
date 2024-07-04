package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;
    public int a;
    public Object b;
    public byte[] c;
    public Parcelable d;
    public int e;
    public int f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public String i;
    public String j;

    public IconCompat() {
        this.a = -1;
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = k;
        this.i = null;
    }

    public IconCompat(int i) {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = k;
        this.i = null;
        this.a = 2;
    }

    public static IconCompat a(int i) {
        if (i != 0) {
            IconCompat iconCompat = new IconCompat(0);
            iconCompat.e = i;
            iconCompat.b = "";
            iconCompat.j = "";
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public final int b() {
        int i;
        int i2 = this.a;
        if (i2 == -1 && (i = Build.VERSION.SDK_INT) >= 23) {
            Icon icon = (Icon) this.b;
            if (i >= 28) {
                return qw.a(icon);
            }
            try {
                return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                Log.e("IconCompat", "Unable to get icon resource", e);
                return 0;
            }
        } else if (i2 == 2) {
            return this.e;
        } else {
            throw new IllegalStateException("called getResId() on " + this);
        }
    }

    public final Uri c() {
        int i;
        int i2 = this.a;
        if (i2 == -1 && (i = Build.VERSION.SDK_INT) >= 23) {
            Icon icon = (Icon) this.b;
            if (i >= 28) {
                return uw.a(icon);
            }
            try {
                return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                Log.e("IconCompat", "Unable to get icon uri", e);
                return null;
            }
        } else if (i2 != 4 && i2 != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        } else {
            return Uri.parse((String) this.b);
        }
    }

    public final String toString() {
        String str;
        int height;
        if (this.a == -1) {
            return String.valueOf(this.b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.b).getWidth());
                sb.append("x");
                height = ((Bitmap) this.b).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(b())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.e);
                if (this.f != 0) {
                    sb.append(" off=");
                    height = this.f;
                    sb.append(height);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.b);
                break;
        }
        if (this.g != null) {
            sb.append(" tint=");
            sb.append(this.g);
        }
        if (this.h != k) {
            sb.append(" mode=");
            sb.append(this.h);
        }
        sb.append(")");
        return sb.toString();
    }
}