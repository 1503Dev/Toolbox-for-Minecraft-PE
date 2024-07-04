package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* renamed from: i7  reason: default package */
public final class i7<E> extends l11<Object> {
    public static final a c = new a();
    public final Class<E> a;
    public final n11 b;

    /* renamed from: i7$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements m11 {
        @Override // defpackage.m11
        public final <T> l11<T> a(xt xtVar, u11<T> u11Var) {
            Type componentType;
            Type type = u11Var.b;
            boolean z = type instanceof GenericArrayType;
            if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            if (z) {
                componentType = ((GenericArrayType) type).getGenericComponentType();
            } else {
                componentType = ((Class) type).getComponentType();
            }
            return new i7(xtVar, xtVar.f(new u11<>(componentType)), defpackage.a.e(componentType));
        }
    }

    public i7(xt xtVar, l11<E> l11Var, Class<E> cls) {
        this.b = new n11(xtVar, l11Var, cls);
        this.a = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.l11
    public final Object a(c00 c00Var) {
        if (c00Var.U() == 9) {
            c00Var.Q();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c00Var.a();
        while (c00Var.H()) {
            arrayList.add(this.b.a(c00Var));
        }
        c00Var.y();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    @Override // defpackage.l11
    public final void b(i00 i00Var, Object obj) {
        if (obj == null) {
            i00Var.H();
            return;
        }
        i00Var.d();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.b.b(i00Var, Array.get(obj, i));
        }
        i00Var.y();
    }
}