package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* renamed from: qb  reason: default package */
public interface qb<R, T> {

    /* renamed from: qb$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class a {
        @Nullable
        public abstract qb a(Type type, Annotation[] annotationArr);
    }

    Type a();

    Object b(mb0 mb0Var);
}