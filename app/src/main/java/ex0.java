package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: ex0  reason: default package */
public final class ex0 extends ContextWrapper {
    public static final Object b = new Object();
    public static ArrayList<WeakReference<ex0>> c;
    public final gx0 a;

    public ex0(Context context) {
        super(context);
        int i = h31.a;
        this.a = new gx0(this, context.getResources());
    }

    public static Context a(Context context) {
        ex0 ex0Var;
        boolean z = false;
        if (!(context instanceof ex0) && !(context.getResources() instanceof gx0)) {
            context.getResources();
            if (Build.VERSION.SDK_INT >= 21) {
                int i = h31.a;
            } else {
                z = true;
            }
        }
        if (z) {
            synchronized (b) {
                ArrayList<WeakReference<ex0>> arrayList = c;
                if (arrayList == null) {
                    c = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<ex0> weakReference = c.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            c.remove(size);
                        }
                    }
                    for (int size2 = c.size() - 1; size2 >= 0; size2--) {
                        WeakReference<ex0> weakReference2 = c.get(size2);
                        if (weakReference2 != null) {
                            ex0Var = weakReference2.get();
                        } else {
                            ex0Var = null;
                        }
                        if (ex0Var != null && ex0Var.getBaseContext() == context) {
                            return ex0Var;
                        }
                    }
                }
                ex0 ex0Var2 = new ex0(context);
                c.add(new WeakReference<>(ex0Var2));
                return ex0Var2;
            }
        }
        return context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return this.a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return this.a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        return super.getTheme();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
    }
}