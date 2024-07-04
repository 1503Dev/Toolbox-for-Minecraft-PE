package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* renamed from: i51  reason: default package */
public class i51 extends f51 {
    public static boolean W = true;
    public static boolean X = true;

    @Override // defpackage.ja
    @SuppressLint({"NewApi"})
    public void n(View view, Matrix matrix) {
        if (W) {
            try {
                h51.a(view, matrix);
            } catch (NoSuchMethodError unused) {
                W = false;
            }
        }
    }

    @Override // defpackage.ja
    @SuppressLint({"NewApi"})
    public void o(View view, Matrix matrix) {
        if (X) {
            try {
                g51.a(view, matrix);
            } catch (NoSuchMethodError unused) {
                X = false;
            }
        }
    }
}