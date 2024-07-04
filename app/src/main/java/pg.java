package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* renamed from: pg  reason: default package */
public interface pg<F, T> {

    /* renamed from: pg$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class a {
        @Nullable
        public pg a(Type type) {
            return null;
        }

        @Nullable
        public pg<ql0, ?> b(Type type, Annotation[] annotationArr, vl0 vl0Var) {
            return null;
        }
    }

    @Nullable
    T b(F f);
}