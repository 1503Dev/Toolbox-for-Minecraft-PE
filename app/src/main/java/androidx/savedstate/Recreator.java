package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.c;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.savedstate.a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"RestrictedApi"})
public final class Recreator implements d {
    public final kn0 a;

    public Recreator(kn0 kn0Var) {
        this.a = kn0Var;
    }

    @Override // androidx.lifecycle.d
    public final void d(b10 b10Var, c.b bVar) {
        Class cls;
        if (bVar == c.b.ON_CREATE) {
            e k = b10Var.k();
            k.c("removeObserver");
            k.a.h(this);
            a b = this.a.b();
            if (b.c) {
                Bundle bundle = b.b;
                Bundle bundle2 = null;
                if (bundle != null) {
                    Bundle bundle3 = bundle.getBundle("androidx.savedstate.Restarter");
                    b.b.remove("androidx.savedstate.Restarter");
                    if (b.b.isEmpty()) {
                        b.b = null;
                    }
                    bundle2 = bundle3;
                }
                if (bundle2 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundle2.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        try {
                            try {
                                Constructor declaredConstructor = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(a.InterfaceC0011a.class).getDeclaredConstructor(new Class[0]);
                                declaredConstructor.setAccessible(true);
                                try {
                                    ((a.InterfaceC0011a) declaredConstructor.newInstance(new Object[0])).a();
                                } catch (Exception e) {
                                    throw new RuntimeException(k6.b("Failed to instantiate ", next), e);
                                }
                            } catch (NoSuchMethodException e2) {
                                StringBuilder b2 = e5.b("Class");
                                b2.append(cls.getSimpleName());
                                b2.append(" must have default constructor in order to be automatically recreated");
                                throw new IllegalStateException(b2.toString(), e2);
                            }
                        } catch (ClassNotFoundException e3) {
                            throw new RuntimeException(ij.c("Class ", next, " wasn't found"), e3);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}