package defpackage;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: k51  reason: default package */
public class k51 extends i51 {
    public static boolean Y = true;

    @Override // defpackage.ja
    @SuppressLint({"NewApi"})
    public void l(View view, int i, int i2, int i3, int i4) {
        if (Y) {
            try {
                j51.a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                Y = false;
            }
        }
    }
}