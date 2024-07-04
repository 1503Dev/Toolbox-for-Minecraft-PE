package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* renamed from: pc1  reason: default package */
public final class pc1 {
    public static int a;
    public static int b;
    public static int c;
    public static int d;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
        return r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
        return r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0138, code lost:
        if (d(r9) == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0146, code lost:
        if (r14.isEmpty() == false) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0251 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static float a(View view, Rect rect, float f, boolean z) {
        View view2;
        float f2;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList;
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        LinkedList linkedList4 = new LinkedList();
        ArrayList arrayList2 = new ArrayList();
        linkedList3.add(rect);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        View rootView = view.getRootView();
        try {
            view2 = ((Activity) view.getContext()).findViewById(16908290);
        } catch (Exception unused) {
            view2 = null;
        }
        while (true) {
            f2 = 0.0f;
            if (viewGroup == null || viewGroup.getParent() == rootView) {
                break;
            } else if (viewGroup.getVisibility() != 0 || viewGroup.getAlpha() == 0.0f) {
                break;
            } else if (view2 == null || !z || viewGroup == view2 || (viewGroup.getLayoutParams().height != 0 && viewGroup.getLayoutParams().width != 0)) {
                linkedList.addFirst(viewGroup);
                viewGroup = (ViewGroup) viewGroup.getParent();
            }
        }
        if (viewGroup == null) {
            return f;
        }
        Iterator it = linkedList.iterator();
        while (true) {
            int i5 = 1;
            if (it.hasNext()) {
                View view3 = (View) it.next();
                ViewGroup viewGroup2 = (ViewGroup) view3.getParent();
                if (viewGroup2 == null) {
                    return f;
                }
                if (!"viewpager".equalsIgnoreCase(viewGroup2.getClass().getSimpleName()) && (r6 = viewGroup2.indexOfChild(view3)) < viewGroup2.getChildCount() - 1) {
                    while (true) {
                        int indexOfChild = indexOfChild + i5;
                        if (indexOfChild < viewGroup2.getChildCount()) {
                            View childAt = viewGroup2.getChildAt(indexOfChild);
                            if (!d(childAt)) {
                                if (childAt.getVisibility() == 0 && childAt.getAlpha() != f2) {
                                    linkedList4.addFirst(childAt);
                                }
                            } else {
                                if ((childAt instanceof ViewGroup) && childAt.getVisibility() == 0 && childAt.getAlpha() != f2) {
                                    LinkedList linkedList5 = new LinkedList();
                                    arrayList = new ArrayList();
                                    linkedList5.add((ViewGroup) childAt);
                                    ListIterator listIterator = linkedList5.listIterator();
                                    while (listIterator.hasNext()) {
                                        ViewGroup viewGroup3 = (ViewGroup) listIterator.next();
                                        listIterator.remove();
                                        int childCount = viewGroup3.getChildCount();
                                        int i6 = 0;
                                        while (i6 < childCount) {
                                            View childAt2 = viewGroup3.getChildAt(i6);
                                            if (childAt2.getVisibility() == 0 && childAt2.getAlpha() != f2) {
                                                if (childAt2 instanceof ViewGroup) {
                                                    if (d(childAt2)) {
                                                        listIterator.add((ViewGroup) childAt2);
                                                        listIterator.previous();
                                                    }
                                                    arrayList.add(childAt2);
                                                }
                                            }
                                            i6++;
                                            f2 = 0.0f;
                                        }
                                    }
                                }
                                arrayList = null;
                                if (arrayList != null) {
                                    linkedList4.addAll(0, arrayList);
                                }
                            }
                            i5 = 1;
                            f2 = 0.0f;
                        }
                    }
                } else {
                    f2 = 0.0f;
                }
            } else {
                Iterator it2 = linkedList4.iterator();
                float f3 = 0.0f;
                while (it2.hasNext()) {
                    View view4 = (View) it2.next();
                    if (f3 >= f) {
                        break;
                    }
                    if (view4 != null) {
                        if (view4.getTag() != null && ((String) view4.getTag()).contains("BTN_CLOSE")) {
                        }
                    }
                    Rect rect2 = new Rect();
                    if (view4.getGlobalVisibleRect(rect2)) {
                        if (z) {
                            rect2.top++;
                        }
                        if (rect2.intersect(rect)) {
                            linkedList2.add(rect2);
                            f3 = rect2.height() * rect2.width();
                            if (f3 >= f) {
                                z2 = true;
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                z2 = false;
                if (z2) {
                    return f;
                }
                if (!linkedList2.isEmpty()) {
                    if (linkedList2.size() == 1) {
                        return f3;
                    }
                    Iterator it3 = linkedList2.iterator();
                    while (it3.hasNext()) {
                        Rect rect3 = (Rect) it3.next();
                        arrayList2.clear();
                        arrayList2.addAll(linkedList3);
                        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                            Rect rect4 = (Rect) arrayList2.get(i7);
                            if (rect3.intersect(rect4)) {
                                linkedList3.remove(arrayList2.get(i7));
                                for (int i8 = 1; i8 < 9; i8++) {
                                    Rect rect5 = new Rect();
                                    switch (i8) {
                                        case 1:
                                            i = rect4.left;
                                            i2 = rect4.top;
                                            i3 = rect3.left;
                                            i4 = rect3.top;
                                            rect5.set(i, i2, i3, i4);
                                            if (rect5.height() <= 0 && rect5.width() > 0) {
                                                linkedList3.add(rect5);
                                            }
                                            break;
                                        case 2:
                                            i = rect3.left;
                                            i2 = rect4.top;
                                            i3 = rect3.right;
                                            i4 = rect3.top;
                                            rect5.set(i, i2, i3, i4);
                                            if (rect5.height() <= 0) {
                                                linkedList3.add(rect5);
                                                break;
                                            }
                                        case 3:
                                            i = rect3.right;
                                            i2 = rect4.top;
                                            i3 = rect4.right;
                                            i4 = rect3.top;
                                            rect5.set(i, i2, i3, i4);
                                            if (rect5.height() <= 0) {
                                            }
                                            break;
                                        case 4:
                                            i = rect3.right;
                                            i2 = rect3.top;
                                            i3 = rect4.right;
                                            i4 = rect3.bottom;
                                            rect5.set(i, i2, i3, i4);
                                            if (rect5.height() <= 0) {
                                            }
                                            break;
                                        case 5:
                                            i = rect3.right;
                                            i2 = rect3.bottom;
                                            i3 = rect4.right;
                                            i4 = rect4.bottom;
                                            rect5.set(i, i2, i3, i4);
                                            if (rect5.height() <= 0) {
                                            }
                                            break;
                                        case 6:
                                            i = rect3.left;
                                            i2 = rect3.bottom;
                                            i3 = rect3.right;
                                            i4 = rect4.bottom;
                                            rect5.set(i, i2, i3, i4);
                                            if (rect5.height() <= 0) {
                                            }
                                            break;
                                        case 7:
                                            i = rect4.left;
                                            i2 = rect3.bottom;
                                            i3 = rect3.left;
                                            i4 = rect4.bottom;
                                            rect5.set(i, i2, i3, i4);
                                            if (rect5.height() <= 0) {
                                            }
                                            break;
                                        case 8:
                                            i = rect4.left;
                                            i2 = rect3.top;
                                            i3 = rect3.left;
                                            i4 = rect3.bottom;
                                            rect5.set(i, i2, i3, i4);
                                            if (rect5.height() <= 0) {
                                            }
                                            break;
                                        default:
                                            if (rect5.height() <= 0) {
                                            }
                                            break;
                                    }
                                }
                            }
                        }
                    }
                    if (!linkedList3.isEmpty()) {
                        Iterator it4 = linkedList3.iterator();
                        float f4 = 0.0f;
                        while (it4.hasNext()) {
                            Rect rect6 = (Rect) it4.next();
                            f4 += rect6.height() * rect6.width();
                        }
                        if (f4 < f) {
                            return f - f4;
                        }
                    }
                }
                return f3;
            }
        }
    }

    public static int b(Context context) {
        int i;
        int i2;
        int i3 = context.getResources().getConfiguration().orientation;
        if (i3 == 2 && (i2 = a) > 0) {
            return i2;
        }
        if (i3 == 1 && (i = c) > 0) {
            return i;
        }
        try {
            Point point = new Point();
            ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getSize(point);
            int i4 = point.y;
            if (i3 == 2) {
                a = i4;
            } else if (i3 == 1) {
                c = i4;
            }
            return i4;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int c(Context context) {
        int i;
        int i2;
        int i3 = context.getResources().getConfiguration().orientation;
        if (i3 == 2 && (i2 = b) > 0) {
            return i2;
        }
        if (i3 == 1 && (i = d) > 0) {
            return i;
        }
        try {
            Point point = new Point();
            ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getSize(point);
            int i4 = point.x;
            if (i3 == 2) {
                b = i4;
            } else if (i3 == 1) {
                d = i4;
            }
            return i4;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static boolean d(View view) {
        if (view == null) {
            return false;
        }
        return view.getBackground() == null || view.getBackground().getAlpha() == 0;
    }
}