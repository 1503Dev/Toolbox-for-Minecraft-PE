package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

/* renamed from: xf  reason: default package */
public final class xf implements ta0<Object> {
    public final /* synthetic */ Type P;

    public xf(Type type) {
        this.P = type;
    }

    @Override // defpackage.ta0
    public final Object d() {
        Type type = this.P;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            StringBuilder b = e5.b("Invalid EnumSet type: ");
            b.append(this.P.toString());
            throw new xz(b.toString());
        }
        StringBuilder b2 = e5.b("Invalid EnumSet type: ");
        b2.append(this.P.toString());
        throw new xz(b2.toString());
    }
}