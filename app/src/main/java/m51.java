package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* renamed from: m51  reason: default package */
public class m51 extends k51 {
    public static boolean Z = true;

    @Override // defpackage.ja
    @SuppressLint({"NewApi"})
    public void m(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.m(view, i);
        } else if (Z) {
            try {
                l51.a(view, i);
            } catch (NoSuchMethodError unused) {
                Z = false;
            }
        }
    }
}