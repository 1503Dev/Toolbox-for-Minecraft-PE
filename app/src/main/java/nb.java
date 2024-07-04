package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.datepicker.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/* renamed from: nb  reason: default package */
public final class nb {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public /* synthetic */ nb(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(y30.b(gh0.materialCalendarStyle, context, b.class.getCanonicalName()), ij0.MaterialCalendar);
        this.a = mb.a(context, obtainStyledAttributes.getResourceId(ij0.MaterialCalendar_dayStyle, 0));
        this.g = mb.a(context, obtainStyledAttributes.getResourceId(ij0.MaterialCalendar_dayInvalidStyle, 0));
        this.b = mb.a(context, obtainStyledAttributes.getResourceId(ij0.MaterialCalendar_daySelectedStyle, 0));
        this.c = mb.a(context, obtainStyledAttributes.getResourceId(ij0.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList b = n40.b(context, obtainStyledAttributes, ij0.MaterialCalendar_rangeFillColor);
        this.d = mb.a(context, obtainStyledAttributes.getResourceId(ij0.MaterialCalendar_yearStyle, 0));
        this.e = mb.a(context, obtainStyledAttributes.getResourceId(ij0.MaterialCalendar_yearSelectedStyle, 0));
        this.f = mb.a(context, obtainStyledAttributes.getResourceId(ij0.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(b.getDefaultColor());
        obtainStyledAttributes.recycle();
    }

    public /* synthetic */ nb(wd0 wd0Var, ka1 ka1Var, String str, ArrayList arrayList, String str2, f3 f3Var) {
        ArrayList arrayList2 = new ArrayList();
        this.c = arrayList2;
        this.d = new HashMap();
        this.a = wd0Var;
        this.b = ka1Var;
        this.e = str;
        this.h = f3Var;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String uuid = UUID.randomUUID().toString();
                ((Map) this.d).put(uuid, (i31) it.next());
            }
        }
        this.g = str2;
        this.f = null;
    }

    public static nb a(wd0 wd0Var, String str, ArrayList arrayList) {
        vj.a("Partner is null", wd0Var);
        vj.a("OM SDK JS script content is null", str);
        vj.a("VerificationScriptResources is null", arrayList);
        return new nb(wd0Var, null, str, arrayList, null, f3.NATIVE);
    }
}