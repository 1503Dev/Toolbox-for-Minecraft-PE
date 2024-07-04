package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* renamed from: wf  reason: default package */
public final class wf implements ta0<Object> {
    public final /* synthetic */ Constructor P;

    public wf(Constructor constructor) {
        this.P = constructor;
    }

    @Override // defpackage.ta0
    public final Object d() {
        try {
            return this.P.newInstance(null);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InstantiationException e2) {
            StringBuilder b = e5.b("Failed to invoke ");
            b.append(this.P);
            b.append(" with no args");
            throw new RuntimeException(b.toString(), e2);
        } catch (InvocationTargetException e3) {
            StringBuilder b2 = e5.b("Failed to invoke ");
            b2.append(this.P);
            b2.append(" with no args");
            throw new RuntimeException(b2.toString(), e3.getTargetException());
        }
    }
}