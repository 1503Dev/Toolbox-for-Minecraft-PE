package androidx.databinding;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.e;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.c;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

public abstract class ViewDataBinding extends androidx.databinding.a {
    public static final boolean a0 = true;
    public final c Q;
    public boolean R;
    public a61[] S;
    public final View T;
    public boolean U;
    public Choreographer V;
    public final f41 W;
    public Handler X;
    public final hj Y;
    public static int Z = Build.VERSION.SDK_INT;
    public static final a b0 = new a();
    public static final ReferenceQueue<ViewDataBinding> c0 = new ReferenceQueue<>();
    public static final b d0 = new b();

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class OnStartListener implements a10 {
        @androidx.lifecycle.f(c.b.ON_START)
        public void onStart() {
            throw null;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a {
        public final a61 a(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new e(viewDataBinding, i, referenceQueue).a;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        @TargetApi(19)
        public final void onViewAttachedToWindow(View view) {
            ViewDataBinding viewDataBinding;
            if (view != null) {
                viewDataBinding = (ViewDataBinding) view.getTag(bi0.dataBinding);
            } else {
                viewDataBinding = null;
            }
            viewDataBinding.Q.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this) {
                ViewDataBinding.this.R = false;
            }
            while (true) {
                Reference<? extends ViewDataBinding> poll = ViewDataBinding.c0.poll();
                if (poll == null) {
                    break;
                } else if (poll instanceof a61) {
                    ((a61) poll).a();
                }
            }
            if (!ViewDataBinding.this.T.isAttachedToWindow()) {
                View view = ViewDataBinding.this.T;
                b bVar = ViewDataBinding.d0;
                view.removeOnAttachStateChangeListener(bVar);
                ViewDataBinding.this.T.addOnAttachStateChangeListener(bVar);
                return;
            }
            ViewDataBinding viewDataBinding = ViewDataBinding.this;
            if (viewDataBinding.U) {
                viewDataBinding.O();
            } else if (viewDataBinding.J()) {
                viewDataBinding.U = true;
                viewDataBinding.I();
                viewDataBinding.U = false;
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class d implements kb0, gb0<LiveData<?>> {
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class e extends e.a implements gb0<androidx.databinding.e> {
        public final a61<androidx.databinding.e> a;

        public e(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.a = new a61<>(viewDataBinding, i, this, referenceQueue);
        }

        @Override // defpackage.gb0
        public final void d(androidx.databinding.e eVar) {
            eVar.z(this);
        }

        @Override // defpackage.gb0
        public final void f(androidx.databinding.e eVar) {
            eVar.a(this);
        }

        @Override // androidx.databinding.e.a
        public final void g(int i, androidx.databinding.e eVar) {
            a61<androidx.databinding.e> a61Var = this.a;
            ViewDataBinding viewDataBinding = (ViewDataBinding) a61Var.get();
            if (viewDataBinding == null) {
                a61Var.a();
            }
            if (viewDataBinding == null) {
                return;
            }
            a61<androidx.databinding.e> a61Var2 = this.a;
            if (a61Var2.c == eVar && viewDataBinding.M(a61Var2.b, i, eVar)) {
                viewDataBinding.O();
            }
        }
    }

    public ViewDataBinding(int i, View view, Object obj) {
        hj H = H(obj);
        this.Q = new c();
        this.R = false;
        this.Y = H;
        this.S = new a61[i];
        this.T = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (a0) {
            this.V = Choreographer.getInstance();
            this.W = new f41(this);
            return;
        }
        this.W = null;
        this.X = new Handler(Looper.myLooper());
    }

    public static hj H(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof hj) {
            return (hj) obj;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void K(View view, Object[] objArr, SparseIntArray sparseIntArray, boolean z) {
        ViewDataBinding viewDataBinding;
        int id;
        int i;
        boolean z2;
        String str = null;
        if (view != null) {
            viewDataBinding = (ViewDataBinding) view.getTag(bi0.dataBinding);
        } else {
            viewDataBinding = null;
        }
        if (viewDataBinding != null) {
            return;
        }
        Object tag = view.getTag();
        if (tag instanceof String) {
            str = (String) tag;
        }
        boolean z3 = true;
        if (z && str != null && str.startsWith("layout")) {
            int lastIndexOf = str.lastIndexOf(95);
            if (lastIndexOf > 0) {
                int i2 = lastIndexOf + 1;
                int length = str.length();
                if (length != i2) {
                    for (int i3 = i2; i3 < length; i3++) {
                        if (Character.isDigit(str.charAt(i3))) {
                        }
                    }
                    z2 = true;
                    if (z2) {
                        int i4 = 0;
                        while (i2 < str.length()) {
                            i4 = (i4 * 10) + (str.charAt(i2) - '0');
                            i2++;
                        }
                        if (objArr[i4] == null) {
                            objArr[i4] = view;
                        }
                    }
                }
                z2 = false;
                if (z2) {
                }
            }
            z3 = false;
        } else {
            if (str != null && str.startsWith("binding_")) {
                int i5 = 0;
                for (int i6 = 8; i6 < str.length(); i6++) {
                    i5 = (i5 * 10) + (str.charAt(i6) - '0');
                }
                if (objArr[i5] == null) {
                    objArr[i5] = view;
                }
            }
            z3 = false;
        }
        if (!z3 && (id = view.getId()) > 0 && sparseIntArray != null && (i = sparseIntArray.get(id, -1)) >= 0 && objArr[i] == null) {
            objArr[i] = view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                K(viewGroup.getChildAt(i7), objArr, sparseIntArray, false);
            }
        }
    }

    public static Object[] L(View view, int i, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        K(view, objArr, sparseIntArray, true);
        return objArr;
    }

    public abstract void I();

    public abstract boolean J();

    public abstract boolean M(int i, int i2, Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    public final void N(int i, Object obj, a aVar) {
        if (obj == 0) {
            return;
        }
        a61 a61Var = this.S[i];
        if (a61Var == null) {
            a61Var = aVar.a(this, i, c0);
            this.S[i] = a61Var;
        }
        a61Var.a();
        a61Var.c = obj;
        a61Var.a.f(obj);
    }

    public final void O() {
        synchronized (this) {
            if (this.R) {
                return;
            }
            this.R = true;
            if (a0) {
                this.V.postFrameCallback(this.W);
            } else {
                this.X.post(this.Q);
            }
        }
    }

    public abstract boolean P(int i, Object obj);

    public final void Q(int i, androidx.databinding.e eVar) {
        a aVar = b0;
        if (eVar == null) {
            a61 a61Var = this.S[i];
            if (a61Var != null) {
                a61Var.a();
                return;
            }
            return;
        }
        a61 a61Var2 = this.S[i];
        if (a61Var2 != null) {
            if (a61Var2.c != eVar) {
                if (a61Var2 != null) {
                    a61Var2.a();
                }
            } else {
                return;
            }
        }
        N(i, eVar, aVar);
    }
}