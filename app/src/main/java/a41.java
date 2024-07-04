package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.View$OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import defpackage.h0;
import defpackage.n61;
import defpackage.s0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: a41  reason: default package */
public final class a41 {
    public static WeakHashMap<View, String> a;
    public static WeakHashMap<View, w41> b;
    public static Field c;
    public static boolean d;
    public static ThreadLocal<Rect> e;

    /* renamed from: a41$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {

        /* renamed from: a41$a$a  reason: collision with other inner class name */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class View$OnApplyWindowInsetsListenerC0001a implements View$OnApplyWindowInsetsListener {
            public n61 a = null;
            public final /* synthetic */ View b;
            public final /* synthetic */ tb0 c;

            public View$OnApplyWindowInsetsListenerC0001a(View view, tb0 tb0Var) {
                this.b = view;
                this.c = tb0Var;
            }

            @Override // android.view.View$OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                n61 c = n61.c(view, windowInsets);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    a.a(windowInsets, this.b);
                    if (c.equals(this.a)) {
                        return this.c.a(view, c).b();
                    }
                }
                this.a = c;
                n61 a = this.c.a(view, c);
                if (i >= 30) {
                    return a.b();
                }
                a41.m(view);
                return a.b();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View$OnApplyWindowInsetsListener view$OnApplyWindowInsetsListener = (View$OnApplyWindowInsetsListener) view.getTag(ai0.tag_window_insets_animation_callback);
            if (view$OnApplyWindowInsetsListener != null) {
                view$OnApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static n61 b(View view) {
            n61.e eVar;
            if (n61.a.d && view.isAttachedToWindow()) {
                try {
                    Object obj = n61.a.a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) n61.a.b.get(obj);
                        Rect rect2 = (Rect) n61.a.c.get(obj);
                        if (rect != null && rect2 != null) {
                            int i = Build.VERSION.SDK_INT;
                            if (i >= 30) {
                                eVar = new n61.d();
                            } else if (i >= 29) {
                                eVar = new n61.c();
                            } else if (i >= 20) {
                                eVar = new n61.b();
                            } else {
                                eVar = new n61.e();
                            }
                            eVar.c(tx.a(rect.left, rect.top, rect.right, rect.bottom));
                            eVar.d(tx.a(rect2.left, rect2.top, rect2.right, rect2.bottom));
                            n61 b = eVar.b();
                            b.a.k(b);
                            b.a.d(view.getRootView());
                            return b;
                        }
                    }
                } catch (IllegalAccessException e) {
                    StringBuilder b2 = e5.b("Failed to get insets from AttachInfo. ");
                    b2.append(e.getMessage());
                    Log.w("WindowInsetsCompat", b2.toString(), e);
                }
            }
            return null;
        }

        public static void c(View view, tb0 tb0Var) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(ai0.tag_on_apply_window_listener, tb0Var);
            }
            if (tb0Var == null) {
                view.setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener) view.getTag(ai0.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC0001a(view, tb0Var));
            }
        }
    }

    /* renamed from: a41$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b {
        public static n61 a(View view) {
            WindowInsets rootWindowInsets;
            rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            n61 c = n61.c(null, rootWindowInsets);
            c.a.k(c);
            c.a.d(view.getRootView());
            return c;
        }
    }

    /* renamed from: a41$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface c {
        boolean a();
    }

    /* renamed from: a41$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class d {
        public static final ArrayList<WeakReference<View>> d = new ArrayList<>();
        public WeakHashMap<View, Boolean> a = null;
        public SparseArray<WeakReference<View>> b = null;
        public WeakReference<KeyEvent> c = null;

        public static boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(ai0.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((c) arrayList.get(size)).a()) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        public final View a(View view, KeyEvent keyEvent) {
            View a;
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                do {
                    childCount--;
                    if (childCount >= 0) {
                        a = a(viewGroup.getChildAt(childCount), keyEvent);
                    }
                } while (a == null);
                return a;
            }
            if (b(view, keyEvent)) {
                return view;
            }
            return null;
        }
    }

    static {
        new AtomicInteger(1);
        b = null;
        d = false;
        new WeakHashMap();
    }

    public static w41 a(View view) {
        if (b == null) {
            b = new WeakHashMap<>();
        }
        w41 w41Var = b.get(view);
        if (w41Var == null) {
            w41 w41Var2 = new w41(view);
            b.put(view, w41Var2);
            return w41Var2;
        }
        return w41Var;
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = d.d;
        int i = ai0.tag_unhandled_key_event_manager;
        d dVar = (d) view.getTag(i);
        if (dVar == null) {
            dVar = new d();
            view.setTag(i, dVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = dVar.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = d.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (dVar.a == null) {
                        dVar.a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = d.d;
                        View view2 = arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            dVar.a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                dVar.a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a2 = dVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (dVar.b == null) {
                    dVar.b = new SparseArray<>();
                }
                dVar.b.put(keyCode, new WeakReference<>(a2));
            }
        }
        if (a2 == null) {
            return false;
        }
        return true;
    }

    public static View.AccessibilityDelegate c(View view) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (Build.VERSION.SDK_INT >= 29) {
            accessibilityDelegate = view.getAccessibilityDelegate();
            return accessibilityDelegate;
        } else if (d) {
            return null;
        } else {
            if (c == null) {
                try {
                    Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                    c = declaredField;
                    declaredField.setAccessible(true);
                } catch (Throwable unused) {
                    d = true;
                    return null;
                }
            }
            Object obj = c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        }
    }

    public static CharSequence d(View view) {
        boolean z;
        Object tag;
        int i = ai0.tag_accessibility_pane_title;
        if (Build.VERSION.SDK_INT >= 28) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            tag = view.getAccessibilityPaneTitle();
        } else {
            tag = view.getTag(i);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static float e(View view) {
        float elevation;
        if (Build.VERSION.SDK_INT >= 21) {
            elevation = view.getElevation();
            return elevation;
        }
        return 0.0f;
    }

    public static Rect f() {
        if (e == null) {
            e = new ThreadLocal<>();
        }
        Rect rect = e.get();
        if (rect == null) {
            rect = new Rect();
            e.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static String g(View view) {
        String transitionName;
        if (Build.VERSION.SDK_INT >= 21) {
            transitionName = view.getTransitionName();
            return transitionName;
        }
        WeakHashMap<View, String> weakHashMap = a;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    public static void h(View view, int i) {
        boolean z;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        if (d(view) != null && view.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = 32;
        if (view.getAccessibilityLiveRegion() == 0 && !z) {
            if (i == 32) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain);
                obtain.setEventType(32);
                obtain.setContentChangeTypes(i);
                obtain.setSource(view);
                view.onPopulateAccessibilityEvent(obtain);
                obtain.getText().add(d(view));
                accessibilityManager.sendAccessibilityEvent(obtain);
                return;
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                    return;
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                    return;
                }
            } else {
                return;
            }
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
        if (!z) {
            i2 = 2048;
        }
        obtain2.setEventType(i2);
        obtain2.setContentChangeTypes(i);
        if (z) {
            obtain2.getText().add(d(view));
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (((View) parent).getImportantForAccessibility() == 4) {
                    view.setImportantForAccessibility(2);
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        view.sendAccessibilityEventUnchecked(obtain2);
    }

    public static void i(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetLeftAndRight(i);
        } else if (i2 >= 21) {
            Rect f = f();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                f.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !f.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            view.offsetLeftAndRight(i);
            if (view.getVisibility() == 0) {
                p(view);
                ViewParent parent2 = view.getParent();
                if (parent2 instanceof View) {
                    p((View) parent2);
                }
            }
            if (z && f.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(f);
            }
        } else {
            view.offsetLeftAndRight(i);
            if (view.getVisibility() == 0) {
                p(view);
                ViewParent parent3 = view.getParent();
                if (parent3 instanceof View) {
                    p((View) parent3);
                }
            }
        }
    }

    public static void j(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetTopAndBottom(i);
        } else if (i2 >= 21) {
            Rect f = f();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                f.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !f.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            view.offsetTopAndBottom(i);
            if (view.getVisibility() == 0) {
                p(view);
                ViewParent parent2 = view.getParent();
                if (parent2 instanceof View) {
                    p((View) parent2);
                }
            }
            if (z && f.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(f);
            }
        } else {
            view.offsetTopAndBottom(i);
            if (view.getVisibility() == 0) {
                p(view);
                ViewParent parent3 = view.getParent();
                if (parent3 instanceof View) {
                    p((View) parent3);
                }
            }
        }
    }

    public static n61 k(View view, n61 n61Var) {
        WindowInsets b2;
        if (Build.VERSION.SDK_INT >= 21 && (b2 = n61Var.b()) != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(b2);
            if (!onApplyWindowInsets.equals(b2)) {
                return n61.c(view, onApplyWindowInsets);
            }
        }
        return n61Var;
    }

    public static void l(View view, int i) {
        int i2 = ai0.tag_accessibility_actions;
        ArrayList arrayList = (ArrayList) view.getTag(i2);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(i2, arrayList);
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (((s0.a) arrayList.get(i3)).a() == i) {
                arrayList.remove(i3);
                return;
            }
        }
    }

    public static void m(View view) {
        if (Build.VERSION.SDK_INT >= 20) {
            view.requestApplyInsets();
        } else {
            view.requestFitSystemWindows();
        }
    }

    public static void n(View view, h0 h0Var) {
        h0.a aVar;
        if (h0Var == null && (c(view) instanceof h0.a)) {
            h0Var = new h0();
        }
        if (h0Var == null) {
            aVar = null;
        } else {
            aVar = h0Var.b;
        }
        view.setAccessibilityDelegate(aVar);
    }

    public static void o(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (a == null) {
            a = new WeakHashMap<>();
        }
        a.put(view, str);
    }

    public static void p(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
}