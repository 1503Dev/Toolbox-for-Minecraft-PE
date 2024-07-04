package defpackage;

import defpackage.ck;
import defpackage.qb;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* renamed from: ck  reason: default package */
public final class ck extends qb.a {
    @Nullable
    public final Executor a;

    /* renamed from: ck$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a<T> implements pb<T> {
        public final Executor P;
        public final pb<T> Q;

        /* renamed from: ck$a$a  reason: collision with other inner class name */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class C0018a implements sb<T> {
            public final /* synthetic */ sb a;

            public C0018a(sb sbVar) {
                this.a = sbVar;
            }

            @Override // defpackage.sb
            public final void a(pb<T> pbVar, final Throwable th) {
                Executor executor = a.this.P;
                final sb sbVar = this.a;
                executor.execute(new Runnable() { // from class: bk
                    @Override // java.lang.Runnable
                    public final void run() {
                        ck.a.C0018a c0018a = ck.a.C0018a.this;
                        sbVar.a(ck.a.this, th);
                    }
                });
            }

            @Override // defpackage.sb
            public final void b(pb<T> pbVar, final ol0<T> ol0Var) {
                Executor executor = a.this.P;
                final sb sbVar = this.a;
                executor.execute(new Runnable() { // from class: ak
                    @Override // java.lang.Runnable
                    public final void run() {
                        ck.a.C0018a c0018a = ck.a.C0018a.this;
                        sb sbVar2 = sbVar;
                        ol0 ol0Var2 = ol0Var;
                        boolean y = ck.a.this.Q.y();
                        ck.a aVar = ck.a.this;
                        if (y) {
                            sbVar2.a(aVar, new IOException("Canceled"));
                        } else {
                            sbVar2.b(aVar, ol0Var2);
                        }
                    }
                });
            }
        }

        public a(Executor executor, pb<T> pbVar) {
            this.P = executor;
            this.Q = pbVar;
        }

        @Override // defpackage.pb
        public final void cancel() {
            this.Q.cancel();
        }

        @Override // defpackage.pb
        public final pb<T> clone() {
            return new a(this.P, this.Q.mo2clone());
        }

        @Override // defpackage.pb
        public final void g(sb<T> sbVar) {
            this.Q.g(new C0018a(sbVar));
        }

        @Override // defpackage.pb
        public final uk0 t() {
            return this.Q.t();
        }

        @Override // defpackage.pb
        public final boolean y() {
            return this.Q.y();
        }
    }

    public ck(@Nullable Executor executor) {
        this.a = executor;
    }

    @Override // defpackage.qb.a
    @Nullable
    public final qb a(Type type, Annotation[] annotationArr) {
        Executor executor = null;
        if (d31.e(type) != pb.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type d = d31.d(0, (ParameterizedType) type);
            if (!d31.h(annotationArr, et0.class)) {
                executor = this.a;
            }
            return new zj(d, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}