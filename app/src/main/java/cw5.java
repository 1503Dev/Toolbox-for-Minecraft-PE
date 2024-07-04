package defpackage;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;

@TargetApi(24)
/* renamed from: cw5  reason: default package */
public class cw5 extends dv5 {
    @Override // defpackage.ck1
    public final boolean e(Activity activity, Configuration configuration) {
        int i;
        boolean z;
        boolean z2;
        l92 l92Var = x92.Y3;
        w82 w82Var = w82.d;
        if (!((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            return false;
        }
        if (((Boolean) w82Var.c.a(x92.a4)).booleanValue()) {
            return cg1.a(activity);
        }
        mv2 mv2Var = n62.f.a;
        int k = mv2.k(activity, configuration.screenHeightDp);
        int k2 = mv2.k(activity, configuration.screenWidthDp);
        cu5 cu5Var = jv5.A.c;
        DisplayMetrics B = cu5.B((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i2 = B.heightPixels;
        int i3 = B.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = activity.getResources().getDimensionPixelSize(identifier);
        } else {
            i = 0;
        }
        double d = activity.getResources().getDisplayMetrics().density;
        Double.isNaN(d);
        Double.isNaN(d);
        int intValue = ((Integer) w82Var.c.a(x92.W3)).intValue() * ((int) Math.round(d + 0.5d));
        if (Math.abs(i2 - (k + i)) <= intValue) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (Math.abs(i3 - k2) <= intValue) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return false;
            }
            return true;
        }
        return true;
    }
}