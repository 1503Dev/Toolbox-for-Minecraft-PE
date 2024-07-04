package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import defpackage.ba1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: ac1  reason: default package */
public final class ac1 implements ba1 {
    public final int[] a = new int[2];

    @Override // defpackage.ba1
    public final void a(View view, JSONObject jSONObject, ba1.a aVar, boolean z, boolean z2) {
        float z3;
        float z4;
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        if (z && Build.VERSION.SDK_INT >= 21) {
            HashMap hashMap = new HashMap();
            while (i < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i);
                z3 = childAt.getZ();
                ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(z3));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    z4 = childAt.getZ();
                    hashMap.put(Float.valueOf(z4), arrayList);
                }
                arrayList.add(childAt);
                i++;
            }
            ArrayList arrayList2 = new ArrayList(hashMap.keySet());
            Collections.sort(arrayList2);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
                while (it2.hasNext()) {
                    ((g11) aVar).b((View) it2.next(), this, jSONObject, z2);
                }
            }
            return;
        }
        while (i < viewGroup.getChildCount()) {
            ((g11) aVar).b(viewGroup.getChildAt(i), this, jSONObject, z2);
            i++;
        }
    }

    @Override // defpackage.ba1
    public final JSONObject b(View view) {
        if (view == null) {
            return sa1.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.a);
        int[] iArr = this.a;
        return sa1.a(iArr[0], iArr[1], width, height);
    }
}