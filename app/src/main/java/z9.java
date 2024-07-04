package defpackage;

import android.view.View;
import java.lang.reflect.Modifier;

/* renamed from: z9  reason: default package */
public abstract class z9 {
    public static void d(Class cls) {
        int modifiers = cls.getModifiers();
        if (!Modifier.isInterface(modifiers)) {
            if (!Modifier.isAbstract(modifiers)) {
                return;
            }
            StringBuilder b = e5.b("Abstract class can't be instantiated! Class name: ");
            b.append(cls.getName());
            throw new UnsupportedOperationException(b.toString());
        }
        StringBuilder b2 = e5.b("Interface can't be instantiated! Interface name: ");
        b2.append(cls.getName());
        throw new UnsupportedOperationException(b2.toString());
    }

    public abstract Object e(Class cls);

    public abstract View f(int i);

    public abstract boolean g();
}