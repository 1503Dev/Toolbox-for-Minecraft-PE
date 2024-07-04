package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: fo4  reason: default package */
public final class fo4 implements eo4 {
    public final int[] P = new int[2];

    @Override // defpackage.eo4
    public final void a(View view, JSONObject jSONObject, do4 do4Var, boolean z, boolean z2) {
        int i;
        float z3;
        float z4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || Build.VERSION.SDK_INT < 21) {
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    ((so4) do4Var).a(viewGroup.getChildAt(i2), this, jSONObject, z2);
                }
                return;
            }
            HashMap hashMap = new HashMap();
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                View childAt = viewGroup.getChildAt(i3);
                z3 = childAt.getZ();
                ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(z3));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    z4 = childAt.getZ();
                    hashMap.put(Float.valueOf(z4), arrayList);
                }
                arrayList.add(childAt);
            }
            ArrayList arrayList2 = new ArrayList(hashMap.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                ArrayList arrayList3 = (ArrayList) hashMap.get((Float) arrayList2.get(i4));
                int size2 = arrayList3.size();
                int i5 = 0;
                while (true) {
                    i = i4 + 1;
                    if (i5 < size2) {
                        ((so4) do4Var).a((View) arrayList3.get(i5), this, jSONObject, z2);
                        i5++;
                    }
                }
                i4 = i;
            }
        }
    }

    @Override // defpackage.eo4
    public final JSONObject g(View view) {
        if (view == null) {
            return jo4.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.P);
        int[] iArr = this.P;
        return jo4.a(iArr[0], iArr[1], width, height);
    }
}