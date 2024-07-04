package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* renamed from: uf  reason: default package */
public final class uf implements ta0<Object> {
    public final z9 P;
    public final /* synthetic */ Class Q;
    public final /* synthetic */ Type R;

    public uf(Class cls, Type type) {
        z9 r21Var;
        this.Q = cls;
        this.R = type;
        try {
            Class<?> cls2 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            r21Var = new o21(declaredField.get(null), cls2.getMethod("allocateInstance", Class.class));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    r21Var = new p21(intValue, declaredMethod2);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    r21Var = new q21(declaredMethod3);
                }
            } catch (Exception unused3) {
                r21Var = new r21();
            }
        }
        this.P = r21Var;
    }

    @Override // defpackage.ta0
    public final Object d() {
        try {
            return this.P.e(this.Q);
        } catch (Exception e) {
            StringBuilder b = e5.b("Unable to invoke no-args constructor for ");
            b.append(this.R);
            b.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
            throw new RuntimeException(b.toString(), e);
        }
    }
}