package defpackage;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;

/* renamed from: pf2  reason: default package */
public final class pf2 implements mg2 {
    @Override // defpackage.mg2
    public final void b(Object obj, Map map) {
        y03 y03Var = (y03) obj;
        cu5 cu5Var = jv5.A.c;
        DisplayMetrics B = cu5.B((WindowManager) y03Var.getContext().getSystemService("window"));
        int i = B.widthPixels;
        int i2 = B.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) y03Var).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        y03Var.a("locationReady", hashMap);
        sv2.g("GET LOCATION COMPILED");
    }
}