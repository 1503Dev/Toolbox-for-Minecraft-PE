package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: gt2  reason: default package */
public final class gt2 {
    public static WindowManager.LayoutParams a() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) w82.d.c.a(x92.J6)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static JSONObject b(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (Exception e) {
            e = e;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                int i = point2.x;
                n62 n62Var = n62.f;
                jSONObject3.put("x", n62Var.a.d(context, i));
                jSONObject3.put("y", n62Var.a.d(context, point2.y));
                jSONObject3.put("start_x", n62Var.a.d(context, point.x));
                jSONObject3.put("start_y", n62Var.a.d(context, point.y));
                jSONObject2 = jSONObject3;
            } catch (JSONException e2) {
                sv2.e("Error occurred while putting signals into JSON object.", e2);
            }
            jSONObject.put("click_point", jSONObject2);
            jSONObject.put("asset_id", str);
            return jSONObject;
        } catch (Exception e3) {
            e = e3;
            jSONObject2 = jSONObject;
            sv2.e("Error occurred while grabbing click signals.", e);
            return jSONObject2;
        }
    }

    public static JSONObject c(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) {
        Iterator it;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        boolean z;
        int i;
        Context context2 = context;
        JSONObject jSONObject3 = new JSONObject();
        if (map != null && view != null) {
            int i2 = 2;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] iArr2 = new int[i2];
                    view2.getLocationOnScreen(iArr2);
                    JSONObject jSONObject4 = new JSONObject();
                    JSONObject jSONObject5 = new JSONObject();
                    it = it2;
                    try {
                        int measuredWidth = view2.getMeasuredWidth();
                        JSONObject jSONObject6 = jSONObject3;
                        try {
                            n62 n62Var = n62.f;
                            try {
                                jSONObject5.put("width", n62Var.a.d(context2, measuredWidth));
                                jSONObject5.put("height", n62Var.a.d(context2, view2.getMeasuredHeight()));
                                jSONObject5.put("x", n62Var.a.d(context2, iArr2[0] - iArr[0]));
                                jSONObject5.put("y", n62Var.a.d(context2, iArr2[1] - iArr[1]));
                                jSONObject5.put("relative_to", "ad_view");
                                jSONObject4.put("frame", jSONObject5);
                                Rect rect = new Rect();
                                if (view2.getLocalVisibleRect(rect)) {
                                    jSONObject2 = i(context2, rect);
                                } else {
                                    jSONObject2 = new JSONObject();
                                    jSONObject2.put("width", 0);
                                    jSONObject2.put("height", 0);
                                    jSONObject2.put("x", n62Var.a.d(context2, iArr2[0] - iArr[0]));
                                    jSONObject2.put("y", n62Var.a.d(context2, iArr2[1] - iArr[1]));
                                    jSONObject2.put("relative_to", "ad_view");
                                }
                                jSONObject4.put("visible_bounds", jSONObject2);
                                if (((String) entry.getKey()).equals("3010")) {
                                    l92 l92Var = x92.D6;
                                    w82 w82Var = w82.d;
                                    if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                                        jSONObject4.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                    }
                                    if (((Boolean) w82Var.c.a(x92.E6)).booleanValue()) {
                                        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                        int i3 = layoutParams.width;
                                        int i4 = 3;
                                        if (i3 != -2) {
                                            if (i3 != -1) {
                                                i = 2;
                                            } else {
                                                i = 3;
                                            }
                                        } else {
                                            i = 4;
                                        }
                                        jSONObject4.put("view_width_layout_type", i - 1);
                                        int i5 = layoutParams.height;
                                        if (i5 != -2) {
                                            if (i5 != -1) {
                                                i4 = 2;
                                            }
                                        } else {
                                            i4 = 4;
                                        }
                                        jSONObject4.put("view_height_layout_type", i4 - 1);
                                    }
                                    if (((Boolean) w82Var.c.a(x92.F6)).booleanValue()) {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(Integer.valueOf(view2.getId()));
                                        for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                            arrayList.add(Integer.valueOf(((View) parent).getId()));
                                        }
                                        jSONObject4.put("view_path", TextUtils.join("/", arrayList));
                                    }
                                    if (((Boolean) w82.d.c.a(x92.G6)).booleanValue() && scaleType != null) {
                                        jSONObject4.put("mediaview_scale_type", scaleType.ordinal());
                                    }
                                }
                                if (view2 instanceof TextView) {
                                    TextView textView = (TextView) view2;
                                    jSONObject4.put("text_color", textView.getCurrentTextColor());
                                    jSONObject4.put("font_size", textView.getTextSize());
                                    jSONObject4.put("text", textView.getText());
                                }
                                if (map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                jSONObject4.put("is_clickable", z);
                                jSONObject = jSONObject6;
                            } catch (JSONException unused) {
                                jSONObject = jSONObject6;
                                sv2.g("Unable to get asset views information");
                                context2 = context;
                                jSONObject3 = jSONObject;
                                i2 = 2;
                                it2 = it;
                            }
                        } catch (JSONException unused2) {
                        }
                    } catch (JSONException unused3) {
                        jSONObject = jSONObject3;
                    }
                    try {
                        jSONObject.put((String) entry.getKey(), jSONObject4);
                    } catch (JSONException unused4) {
                        sv2.g("Unable to get asset views information");
                        context2 = context;
                        jSONObject3 = jSONObject;
                        i2 = 2;
                        it2 = it;
                    }
                } else {
                    it = it2;
                    jSONObject = jSONObject3;
                }
                context2 = context;
                jSONObject3 = jSONObject;
                i2 = 2;
                it2 = it;
            }
            return jSONObject3;
        }
        return jSONObject3;
    }

    public static JSONObject d(Context context, View view) {
        KeyguardManager keyguardManager;
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            cu5 cu5Var = jv5.A.c;
            jSONObject.put("can_show_on_lock_screen", cu5.w(view));
            boolean z = false;
            if (context != null) {
                Object systemService = context.getSystemService("keyguard");
                if (systemService != null && (systemService instanceof KeyguardManager)) {
                    keyguardManager = (KeyguardManager) systemService;
                } else {
                    keyguardManager = null;
                }
                if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
                    z = true;
                }
            }
            jSONObject.put("is_keyguard_locked", z);
        } catch (JSONException unused) {
            sv2.g("Unable to get lock screen information");
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
        if (r5 != (-1)) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject e(View view) {
        boolean z;
        int positionForView;
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            z = false;
        } catch (Exception unused) {
        }
        if (((Boolean) w82.d.c.a(x92.C6)).booleanValue()) {
            cu5 cu5Var = jv5.A.c;
            ViewParent parent = view.getParent();
            while (parent != null && !(parent instanceof ScrollView)) {
                parent = parent.getParent();
            }
            if (parent == null) {
                jSONObject.put("contained_in_scroll_view", z);
                return jSONObject;
            }
            z = true;
            jSONObject.put("contained_in_scroll_view", z);
            return jSONObject;
        }
        cu5 cu5Var2 = jv5.A.c;
        ViewParent parent2 = view.getParent();
        while (parent2 != null && !(parent2 instanceof AdapterView)) {
            parent2 = parent2.getParent();
        }
        if (parent2 == null) {
            positionForView = -1;
        } else {
            positionForView = ((AdapterView) parent2).getPositionForView(view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject f(Context context, View view) {
        int i;
        int i2;
        String str;
        int hashCode;
        char c;
        int i3;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (view == null) {
            return jSONObject2;
        }
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int[] iArr2 = {view.getMeasuredWidth(), view.getMeasuredHeight()};
            for (ViewParent parent = view.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                iArr2[0] = Math.min(viewGroup.getMeasuredWidth(), iArr2[0]);
                iArr2[1] = Math.min(viewGroup.getMeasuredHeight(), iArr2[1]);
            }
            JSONObject jSONObject3 = new JSONObject();
            int measuredWidth = view.getMeasuredWidth();
            n62 n62Var = n62.f;
            jSONObject3.put("width", n62Var.a.d(context, measuredWidth));
            jSONObject3.put("height", n62Var.a.d(context, view.getMeasuredHeight()));
            jSONObject3.put("x", n62Var.a.d(context, iArr[0]));
            jSONObject3.put("y", n62Var.a.d(context, iArr[1]));
            jSONObject3.put("maximum_visible_width", n62Var.a.d(context, iArr2[0]));
            jSONObject3.put("maximum_visible_height", n62Var.a.d(context, iArr2[1]));
            jSONObject3.put("relative_to", "window");
            jSONObject2.put("frame", jSONObject3);
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                jSONObject = i(context, rect);
            } else {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("width", 0);
                jSONObject4.put("height", 0);
                jSONObject4.put("x", n62Var.a.d(context, iArr[0]));
                jSONObject4.put("y", n62Var.a.d(context, iArr[1]));
                jSONObject4.put("relative_to", "window");
                jSONObject = jSONObject4;
            }
            jSONObject2.put("visible_bounds", jSONObject);
        } catch (Exception unused) {
            sv2.g("Unable to get native ad view bounding box");
        }
        if (((Boolean) w82.d.c.a(x92.h5)).booleanValue()) {
            ViewParent parent2 = view.getParent();
            try {
                if (parent2 != null) {
                    try {
                        try {
                            str = (String) parent2.getClass().getMethod("getTemplateTypeName", new Class[0]).invoke(parent2, new Object[0]);
                        } catch (IllegalAccessException e) {
                            e = e;
                            sv2.e("Cannot access method getTemplateTypeName: ", e);
                            str = "";
                            hashCode = str.hashCode();
                            if (hashCode == -2066603854) {
                            }
                        } catch (NoSuchMethodException unused2) {
                        } catch (SecurityException e2) {
                            e = e2;
                            sv2.e("Cannot access method getTemplateTypeName: ", e);
                            str = "";
                            hashCode = str.hashCode();
                            if (hashCode == -2066603854) {
                            }
                        } catch (InvocationTargetException e3) {
                            e = e3;
                            sv2.e("Cannot access method getTemplateTypeName: ", e);
                            str = "";
                            hashCode = str.hashCode();
                            if (hashCode == -2066603854) {
                            }
                        }
                    } catch (IllegalAccessException e4) {
                        e = e4;
                        sv2.e("Cannot access method getTemplateTypeName: ", e);
                        str = "";
                        hashCode = str.hashCode();
                        if (hashCode == -2066603854) {
                        }
                    } catch (NoSuchMethodException unused3) {
                    } catch (SecurityException e5) {
                        e = e5;
                        sv2.e("Cannot access method getTemplateTypeName: ", e);
                        str = "";
                        hashCode = str.hashCode();
                        if (hashCode == -2066603854) {
                        }
                    } catch (InvocationTargetException e6) {
                        e = e6;
                        sv2.e("Cannot access method getTemplateTypeName: ", e);
                        str = "";
                        hashCode = str.hashCode();
                        if (hashCode == -2066603854) {
                        }
                    }
                    hashCode = str.hashCode();
                    if (hashCode == -2066603854) {
                        if (hashCode == 2019754500 && str.equals("medium_template")) {
                            c = 1;
                            if (c == 0) {
                                if (c != 1) {
                                    i3 = 0;
                                } else {
                                    i3 = 2;
                                }
                            } else {
                                i3 = 1;
                            }
                            jSONObject2.put("native_template_type", i3);
                        }
                        c = 65535;
                        if (c == 0) {
                        }
                        jSONObject2.put("native_template_type", i3);
                    } else {
                        if (str.equals("small_template")) {
                            c = 0;
                            if (c == 0) {
                            }
                            jSONObject2.put("native_template_type", i3);
                        }
                        c = 65535;
                        if (c == 0) {
                        }
                        jSONObject2.put("native_template_type", i3);
                    }
                }
                hashCode = str.hashCode();
                if (hashCode == -2066603854) {
                }
            } catch (JSONException e7) {
                sv2.e("Could not log native template signal to JSON", e7);
            }
            str = "";
        }
        if (((Boolean) w82.d.c.a(x92.E6)).booleanValue()) {
            try {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                int i4 = layoutParams.width;
                if (i4 != -2) {
                    if (i4 != -1) {
                        i = 2;
                    } else {
                        i = 3;
                    }
                } else {
                    i = 4;
                }
                jSONObject2.put("view_width_layout_type", i - 1);
                int i5 = layoutParams.height;
                if (i5 != -2) {
                    if (i5 != -1) {
                        i2 = 2;
                    } else {
                        i2 = 3;
                    }
                } else {
                    i2 = 4;
                }
                jSONObject2.put("view_height_layout_type", i2 - 1);
            } catch (Exception unused4) {
                vz3.k("Unable to get native ad view layout types");
            }
        }
        return jSONObject2;
    }

    public static boolean g(Context context, yh4 yh4Var) {
        if (!yh4Var.N) {
            return false;
        }
        l92 l92Var = x92.H6;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            return ((Boolean) w82Var.c.a(x92.K6)).booleanValue();
        }
        String str = (String) w82Var.c.a(x92.I6);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            Iterator b = vw2.a(new ts4(';')).b(str);
            while (b.hasNext()) {
                if (((String) b.next()).equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean h(int i) {
        l92 l92Var = x92.M2;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            if (!((Boolean) w82Var.c.a(x92.N2)).booleanValue() && i > 15299999) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static JSONObject i(Context context, Rect rect) {
        JSONObject jSONObject = new JSONObject();
        int i = rect.right - rect.left;
        n62 n62Var = n62.f;
        jSONObject.put("width", n62Var.a.d(context, i));
        jSONObject.put("height", n62Var.a.d(context, rect.bottom - rect.top));
        jSONObject.put("x", n62Var.a.d(context, rect.left));
        jSONObject.put("y", n62Var.a.d(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }
}