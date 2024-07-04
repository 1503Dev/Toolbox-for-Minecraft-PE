package defpackage;

import defpackage.pg;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
/* renamed from: bd0  reason: default package */
public final class bd0 extends pg.a {
    public static final bd0 a = new bd0();

    @IgnoreJRERequirement
    /* renamed from: bd0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a<T> implements pg<ql0, Optional<T>> {
        public final pg<ql0, T> P;

        public a(pg<ql0, T> pgVar) {
            this.P = pgVar;
        }

        @Override // defpackage.pg
        public final Object b(ql0 ql0Var) {
            return Optional.ofNullable(this.P.b(ql0Var));
        }
    }

    @Override // defpackage.pg.a
    @Nullable
    public final pg<ql0, ?> b(Type type, Annotation[] annotationArr, vl0 vl0Var) {
        if (d31.e(type) != Optional.class) {
            return null;
        }
        return new a(vl0Var.e(d31.d(0, (ParameterizedType) type), annotationArr));
    }
}