package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;

/* renamed from: m00  reason: default package */
public final class m00 {

    /* renamed from: m00$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a extends s00 implements ps<Throwable, j21> {
        public final /* synthetic */ pb P;

        public a(pb pbVar) {
            this.P = pbVar;
        }
    }

    /* renamed from: m00$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class b extends s00 implements ps<Throwable, j21> {
        public final /* synthetic */ pb P;

        public b(pb pbVar) {
            this.P = pbVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: m00$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class c<T> implements sb<T> {
        public final /* synthetic */ CancellableContinuation a;

        public c(CancellableContinuation cancellableContinuation) {
            this.a = cancellableContinuation;
        }

        @Override // defpackage.sb
        public final void a(pb<T> pbVar, Throwable th) {
            hy.f("call", pbVar);
            hy.f("t", th);
            this.a.a(eg4.a(th));
        }

        @Override // defpackage.sb
        public final void b(pb<T> pbVar, ol0<T> ol0Var) {
            boolean z;
            lg lgVar;
            Object a;
            hy.f("call", pbVar);
            hy.f("response", ol0Var);
            int i = ol0Var.a.R;
            if (i >= 200 && i < 300) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                a = ol0Var.b;
                if (a == null) {
                    Object cast = ky.class.cast(pbVar.t().e.get(ky.class));
                    if (cast != null) {
                        Method method = ((ky) cast).a;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Response from ");
                        hy.b("method", method);
                        Class<?> declaringClass = method.getDeclaringClass();
                        hy.b("method.declaringClass", declaringClass);
                        sb.append(declaringClass.getName());
                        sb.append('.');
                        sb.append(method.getName());
                        sb.append(" was null but response body type was declared as non-null");
                        n00 n00Var = new n00(sb.toString());
                        lgVar = (lg) this.a;
                        a = eg4.a(n00Var);
                    } else {
                        n00 n00Var2 = new n00();
                        hy.h(n00Var2);
                        throw n00Var2;
                    }
                } else {
                    lgVar = (lg) this.a;
                }
            } else {
                lgVar = this.a;
                a = eg4.a(new lv(ol0Var));
            }
            lgVar.a(a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: m00$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class d<T> implements sb<T> {
        public final /* synthetic */ CancellableContinuation a;

        public d(CancellableContinuation cancellableContinuation) {
            this.a = cancellableContinuation;
        }

        @Override // defpackage.sb
        public final void a(pb<T> pbVar, Throwable th) {
            hy.f("call", pbVar);
            hy.f("t", th);
            this.a.a(eg4.a(th));
        }

        @Override // defpackage.sb
        public final void b(pb<T> pbVar, ol0<T> ol0Var) {
            boolean z;
            lg lgVar;
            Object a;
            hy.f("call", pbVar);
            hy.f("response", ol0Var);
            int i = ol0Var.a.R;
            if (i >= 200 && i < 300) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                lgVar = (lg) this.a;
                a = ol0Var.b;
            } else {
                lgVar = this.a;
                a = eg4.a(new lv(ol0Var));
            }
            lgVar.a(a);
        }
    }

    /* renamed from: m00$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class e extends s00 implements ps<Throwable, j21> {
        public final /* synthetic */ pb P;

        public e(pb pbVar) {
            this.P = pbVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: m00$f */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class f<T> implements sb<T> {
        public final /* synthetic */ CancellableContinuation a;

        public f(CancellableContinuation cancellableContinuation) {
            this.a = cancellableContinuation;
        }

        @Override // defpackage.sb
        public final void a(pb<T> pbVar, Throwable th) {
            hy.f("call", pbVar);
            hy.f("t", th);
            this.a.a(eg4.a(th));
        }

        @Override // defpackage.sb
        public final void b(pb<T> pbVar, ol0<T> ol0Var) {
            hy.f("call", pbVar);
            hy.f("response", ol0Var);
            this.a.a(ol0Var);
        }
    }

    /* renamed from: m00$g */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class g implements Runnable {
        public final /* synthetic */ lg P;
        public final /* synthetic */ Exception Q;

        public g(Exception exc, h hVar) {
            this.P = hVar;
            this.Q = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            eb1.p(this.P).a(eg4.a(this.Q));
        }
    }

    @uj(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {113}, m = "suspendAndThrow")
    /* renamed from: m00$h */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class h extends ng {
        public /* synthetic */ Object S;
        public int T;

        public h(lg lgVar) {
            super(lgVar);
        }

        @Override // defpackage.i9
        public final Object b(Object obj) {
            this.S = obj;
            this.T |= RecyclerView.UNDEFINED_DURATION;
            return m00.d(null, this);
        }
    }

    public static final <T> Object a(pb<T> pbVar, lg<? super T> lgVar) {
        CancellableContinuation cancellableContinuationImpl = new CancellableContinuationImpl(eb1.p(lgVar), 1);
        CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
        cancellableContinuation.invokeOnCancellation(new a(pbVar));
        pbVar.g(new c(cancellableContinuation));
        Object result = cancellableContinuationImpl.getResult();
        if (result == vg.COROUTINE_SUSPENDED) {
            eb1.s(lgVar);
        }
        return result;
    }

    public static final <T> Object b(pb<T> pbVar, lg<? super T> lgVar) {
        CancellableContinuation cancellableContinuationImpl = new CancellableContinuationImpl(eb1.p(lgVar), 1);
        CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
        cancellableContinuation.invokeOnCancellation(new b(pbVar));
        pbVar.g(new d(cancellableContinuation));
        Object result = cancellableContinuationImpl.getResult();
        if (result == vg.COROUTINE_SUSPENDED) {
            eb1.s(lgVar);
        }
        return result;
    }

    public static final <T> Object c(pb<T> pbVar, lg<? super ol0<T>> lgVar) {
        CancellableContinuation cancellableContinuationImpl = new CancellableContinuationImpl(eb1.p(lgVar), 1);
        CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
        cancellableContinuation.invokeOnCancellation(new e(pbVar));
        pbVar.g(new f(cancellableContinuation));
        Object result = cancellableContinuationImpl.getResult();
        if (result == vg.COROUTINE_SUSPENDED) {
            eb1.s(lgVar);
        }
        return result;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(Exception exc, lg<?> lgVar) {
        h hVar;
        int i;
        if (lgVar instanceof h) {
            hVar = (h) lgVar;
            int i2 = hVar.T;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                hVar.T = i2 - RecyclerView.UNDEFINED_DURATION;
                Object obj = hVar.S;
                vg vgVar = vg.COROUTINE_SUSPENDED;
                i = hVar.T;
                if (i == 0) {
                    if (i == 1) {
                        eg4.k(obj);
                        return j21.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eg4.k(obj);
                hVar.getClass();
                hVar.T = 1;
                Dispatchers.getDefault().dispatch(hVar.getContext(), new g(exc, hVar));
                eb1.s(hVar);
                return vgVar;
            }
        }
        hVar = new h(lgVar);
        Object obj2 = hVar.S;
        vg vgVar2 = vg.COROUTINE_SUSPENDED;
        i = hVar.T;
        if (i == 0) {
        }
    }
}