package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"UnknownNullness"})
/* renamed from: as  reason: default package */
public abstract class as {
    public static void d(List<View> list, View view) {
        boolean z;
        boolean z2;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (list.get(i) == view) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        list.add(view);
        for (int i2 = size; i2 < list.size(); i2++) {
            View view2 = list.get(i2);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    int i4 = 0;
                    while (true) {
                        if (i4 < size) {
                            if (list.get(i4) == childAt) {
                                z2 = true;
                                break;
                            }
                            i4++;
                        } else {
                            z2 = false;
                            break;
                        }
                    }
                    if (!z2) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.view.View, android.view.ViewGroup] */
    public static void f(ArrayList arrayList, View view) {
        boolean z;
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                view = (ViewGroup) view;
                if (Build.VERSION.SDK_INT >= 21) {
                    z = ng0.c(view);
                } else {
                    Boolean bool = (Boolean) view.getTag(ai0.tag_transition_group);
                    if ((bool == null || !bool.booleanValue()) && view.getBackground() == null && a41.g(view) == null) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                if (!z) {
                    int childCount = view.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        f(arrayList, view.getChildAt(i));
                    }
                    return;
                }
            }
            arrayList.add(view);
        }
    }

    public static void h(View view, e7 e7Var) {
        if (view.getVisibility() == 0) {
            String g = a41.g(view);
            if (g != null) {
                e7Var.put(g, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    h(viewGroup.getChildAt(i), e7Var);
                }
            }
        }
    }

    public static void i(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        rect.set(i, iArr[1], view.getWidth() + i, view.getHeight() + iArr[1]);
    }

    public static boolean j(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void a(View view, Object obj);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public abstract Object g(Object obj);

    public abstract Object k(Object obj, Object obj2, Object obj3);

    public abstract void l(View view, Object obj);

    public abstract void m(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void n(Object obj, View view, ArrayList<View> arrayList);

    public abstract void o(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void p(View view, Object obj);

    public abstract void q(Object obj, Rect rect);

    public abstract void r(Object obj, View view, ArrayList<View> arrayList);

    public abstract void s(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object t(Object obj);
}