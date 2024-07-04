package defpackage;

import defpackage.qb;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
/* renamed from: qe  reason: default package */
public final class qe extends qb.a {
    public static final qe a = new qe();

    @IgnoreJRERequirement
    /* renamed from: qe$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a<R> implements qb<R, CompletableFuture<R>> {
        public final Type a;

        public a(Type type) {
            this.a = type;
        }

        @Override // defpackage.qb
        public final Type a() {
            return this.a;
        }

        @Override // defpackage.qb
        public final Object b(mb0 mb0Var) {
            oe oeVar = new oe(mb0Var);
            mb0Var.g(new pe(oeVar));
            return oeVar;
        }
    }

    @IgnoreJRERequirement
    /* renamed from: qe$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class b<R> implements qb<R, CompletableFuture<ol0<R>>> {
        public final Type a;

        public b(Type type) {
            this.a = type;
        }

        @Override // defpackage.qb
        public final Type a() {
            return this.a;
        }

        @Override // defpackage.qb
        public final Object b(mb0 mb0Var) {
            re reVar = new re(mb0Var);
            mb0Var.g(new se(reVar));
            return reVar;
        }
    }

    @Override // defpackage.qb.a
    @Nullable
    public final qb a(Type type, Annotation[] annotationArr) {
        if (d31.e(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type d = d31.d(0, (ParameterizedType) type);
            if (d31.e(d) != ol0.class) {
                return new a(d);
            }
            if (d instanceof ParameterizedType) {
                return new b(d31.d(0, (ParameterizedType) d));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}