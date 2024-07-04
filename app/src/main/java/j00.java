package defpackage;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import defpackage.a41;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: j00  reason: default package */
public final class j00 {
    public static boolean a = false;
    public static Method b = null;
    public static boolean c = false;
    public static Field d;

    /* renamed from: j00$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
        boolean e(KeyEvent keyEvent);
    }

    public static boolean a(View view, KeyEvent keyEvent) {
        int indexOfKey;
        WeakHashMap<View, String> weakHashMap = a41.a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList<WeakReference<View>> arrayList = a41.d.d;
            int i = ai0.tag_unhandled_key_event_manager;
            a41.d dVar = (a41.d) view.getTag(i);
            if (dVar == null) {
                dVar = new a41.d();
                view.setTag(i, dVar);
            }
            WeakReference<KeyEvent> weakReference = dVar.c;
            if (weakReference == null || weakReference.get() != keyEvent) {
                dVar.c = new WeakReference<>(keyEvent);
                WeakReference<View> weakReference2 = null;
                if (dVar.b == null) {
                    dVar.b = new SparseArray<>();
                }
                SparseArray<WeakReference<View>> sparseArray = dVar.b;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference2 = sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference2 == null) {
                    weakReference2 = sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference2 != null) {
                    View view2 = weakReference2.get();
                    if (view2 == null || !view2.isAttachedToWindow()) {
                        return true;
                    }
                    a41.d.b(view2, keyEvent);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z = false;
        if (aVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return aVar.e(keyEvent);
        }
        KeyEvent.DispatcherState dispatcherState = null;
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window2 = activity.getWindow();
            if (window2.hasFeature(8)) {
                ActionBar actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                    if (!a) {
                        try {
                            b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                        } catch (NoSuchMethodException unused) {
                        }
                        a = true;
                    }
                    Method method = b;
                    if (method != null) {
                        try {
                            z = ((Boolean) method.invoke(actionBar, keyEvent)).booleanValue();
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                    if (z) {
                        return true;
                    }
                }
            }
            if (window2.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window2.getDecorView();
            if (a41.b(decorView, keyEvent)) {
                return true;
            }
            if (decorView != null) {
                dispatcherState = decorView.getKeyDispatcherState();
            }
            return keyEvent.dispatch(activity, dispatcherState, activity);
        } else if (callback instanceof Dialog) {
            Dialog dialog = (Dialog) callback;
            if (!c) {
                try {
                    Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                    d = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused3) {
                }
                c = true;
            }
            Field field = d;
            if (field != null) {
                try {
                    onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                } catch (IllegalAccessException unused4) {
                }
                if (onKeyListener == null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                window = dialog.getWindow();
                if (!window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window.getDecorView();
                if (a41.b(decorView2, keyEvent)) {
                    return true;
                }
                if (decorView2 != null) {
                    dispatcherState = decorView2.getKeyDispatcherState();
                }
                return keyEvent.dispatch(dialog, dispatcherState, dialog);
            }
            onKeyListener = null;
            if (onKeyListener == null) {
            }
            window = dialog.getWindow();
            if (!window.superDispatchKeyEvent(keyEvent)) {
            }
        } else if ((view == null || !a41.b(view, keyEvent)) && !aVar.e(keyEvent)) {
            return false;
        } else {
            return true;
        }
    }
}