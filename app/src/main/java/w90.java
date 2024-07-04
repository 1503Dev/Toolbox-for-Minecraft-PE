package defpackage;

import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

/* renamed from: w90  reason: default package */
public final class w90 {
    public final Bundle a;
    public IconCompat b;
    public final tk0[] c;
    public final tk0[] d;
    public boolean e;
    public boolean f;
    public final int g;
    public final boolean h;
    @Deprecated
    public int i;
    public CharSequence j;
    public PendingIntent k;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w90(int i, String str, PendingIntent pendingIntent) {
        IconCompat a;
        int i2;
        StringBuilder sb;
        if (i == 0) {
            a = null;
        } else {
            a = IconCompat.a(i);
        }
        Bundle bundle = new Bundle();
        this.f = true;
        this.b = a;
        if (a != null) {
            int i3 = a.a;
            if (i3 == -1 && (i2 = Build.VERSION.SDK_INT) >= 23) {
                Icon icon = (Icon) a.b;
                if (i2 >= 28) {
                    i3 = icon.getType();
                } else {
                    try {
                        i3 = ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
                    } catch (IllegalAccessException e) {
                        e = e;
                        sb = new StringBuilder();
                        sb.append("Unable to get icon type ");
                        sb.append(icon);
                        Log.e("IconCompat", sb.toString(), e);
                        i3 = -1;
                        if (i3 == 2) {
                        }
                        this.j = y90.a(str);
                        this.k = pendingIntent;
                        this.a = bundle;
                        this.c = null;
                        this.d = null;
                        this.e = true;
                        this.g = 0;
                        this.f = true;
                        this.h = false;
                    } catch (NoSuchMethodException e2) {
                        e = e2;
                        sb = new StringBuilder();
                        sb.append("Unable to get icon type ");
                        sb.append(icon);
                        Log.e("IconCompat", sb.toString(), e);
                        i3 = -1;
                        if (i3 == 2) {
                        }
                        this.j = y90.a(str);
                        this.k = pendingIntent;
                        this.a = bundle;
                        this.c = null;
                        this.d = null;
                        this.e = true;
                        this.g = 0;
                        this.f = true;
                        this.h = false;
                    } catch (InvocationTargetException e3) {
                        e = e3;
                        sb = new StringBuilder();
                        sb.append("Unable to get icon type ");
                        sb.append(icon);
                        Log.e("IconCompat", sb.toString(), e);
                        i3 = -1;
                        if (i3 == 2) {
                        }
                        this.j = y90.a(str);
                        this.k = pendingIntent;
                        this.a = bundle;
                        this.c = null;
                        this.d = null;
                        this.e = true;
                        this.g = 0;
                        this.f = true;
                        this.h = false;
                    }
                }
            }
            if (i3 == 2) {
                this.i = a.b();
            }
        }
        this.j = y90.a(str);
        this.k = pendingIntent;
        this.a = bundle;
        this.c = null;
        this.d = null;
        this.e = true;
        this.g = 0;
        this.f = true;
        this.h = false;
    }

    public final IconCompat a() {
        int i;
        if (this.b == null && (i = this.i) != 0) {
            this.b = IconCompat.a(i);
        }
        return this.b;
    }
}