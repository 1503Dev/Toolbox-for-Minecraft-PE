package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.f;
import androidx.lifecycle.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.UUID;

public class c implements ComponentCallbacks, View.OnCreateContextMenuListener, b10, p41, kn0 {
    public static final Object G0 = new Object();
    public boolean A0;
    public ds D0;
    public Bundle Q;
    public SparseArray<Parcelable> R;
    public Bundle T;
    public c U;
    public int W;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;
    public int e0;
    public f f0;
    public or g0;
    public c i0;
    public int j0;
    public int k0;
    public String l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public boolean q0;
    public ViewGroup r0;
    public View s0;
    public View t0;
    public boolean u0;
    public a w0;
    public boolean x0;
    public boolean y0;
    public float z0;
    public int P = 0;
    public String S = UUID.randomUUID().toString();
    public String V = null;
    public Boolean X = null;
    public f h0 = new f();
    public boolean p0 = true;
    public boolean v0 = true;
    public c.EnumC0007c B0 = c.EnumC0007c.RESUMED;
    public v60<b10> E0 = new v60<>();
    public androidx.lifecycle.e C0 = new androidx.lifecycle.e(this);
    public androidx.savedstate.b F0 = new androidx.savedstate.b(this);

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public View a;
        public Animator b;
        public int c;
        public int d;
        public int e;
        public int f;
        public Object g;
        public Object h;
        public Object i;
        public boolean j;

        public a() {
            Object obj = c.G0;
            this.g = obj;
            this.h = obj;
            this.i = obj;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b extends RuntimeException {
        public b(String str, Exception exc) {
            super(str, exc);
        }
    }

    public c() {
        this.C0.a(new Fragment$2(this));
    }

    public final void A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.h0.W();
        boolean z = true;
        this.d0 = true;
        this.D0 = new ds();
        View r = r(layoutInflater, viewGroup);
        this.s0 = r;
        if (r != null) {
            ds dsVar = this.D0;
            if (dsVar.P == null) {
                dsVar.P = new androidx.lifecycle.e(dsVar);
            }
            this.E0.g(this.D0);
            return;
        }
        if (this.D0.P == null) {
            z = false;
        }
        if (!z) {
            this.D0 = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public final void B() {
        this.q0 = true;
        f fVar = this.h0;
        for (int i = 0; i < fVar.U.size(); i++) {
            c cVar = fVar.U.get(i);
            if (cVar != null) {
                cVar.B();
            }
        }
    }

    public final void C(boolean z) {
        f fVar = this.h0;
        int size = fVar.U.size();
        while (true) {
            size--;
            if (size >= 0) {
                c cVar = fVar.U.get(size);
                if (cVar != null) {
                    cVar.C(z);
                }
            } else {
                return;
            }
        }
    }

    public final void D(boolean z) {
        f fVar = this.h0;
        int size = fVar.U.size();
        while (true) {
            size--;
            if (size >= 0) {
                c cVar = fVar.U.get(size);
                if (cVar != null) {
                    cVar.D(z);
                }
            } else {
                return;
            }
        }
    }

    public final boolean E() {
        if (this.m0) {
            return false;
        }
        return false | this.h0.C();
    }

    public final f F() {
        f fVar = this.f0;
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final View G() {
        View view = this.s0;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void H(int i) {
        if (this.w0 == null && i == 0) {
            return;
        }
        e().d = i;
    }

    public final void I(f.j jVar) {
        e();
        this.w0.getClass();
        if (jVar == null || jVar == null) {
            return;
        }
        jVar.a++;
    }

    @Override // defpackage.kn0
    public final androidx.savedstate.a b() {
        return this.F0.b;
    }

    public void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        int i2;
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.j0));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.k0));
        printWriter.print(" mTag=");
        printWriter.println(this.l0);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.P);
        printWriter.print(" mWho=");
        printWriter.print(this.S);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.e0);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.Y);
        printWriter.print(" mRemoving=");
        printWriter.print(this.Z);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.a0);
        printWriter.print(" mInLayout=");
        printWriter.println(this.b0);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.m0);
        printWriter.print(" mDetached=");
        printWriter.print(this.n0);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.p0);
        printWriter.print(" mHasMenu=");
        int i3 = 0;
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.o0);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.v0);
        if (this.f0 != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f0);
        }
        if (this.g0 != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.g0);
        }
        if (this.i0 != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.i0);
        }
        if (this.T != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.T);
        }
        if (this.Q != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.Q);
        }
        if (this.R != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.R);
        }
        c cVar = this.U;
        Context context = null;
        if (cVar == null) {
            f fVar = this.f0;
            if (fVar != null && (str2 = this.V) != null) {
                cVar = fVar.V.get(str2);
            } else {
                cVar = null;
            }
        }
        if (cVar != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(cVar);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.W);
        }
        a aVar = this.w0;
        if (aVar == null) {
            i = 0;
        } else {
            i = aVar.d;
        }
        if (i != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            a aVar2 = this.w0;
            if (aVar2 == null) {
                i2 = 0;
            } else {
                i2 = aVar2.d;
            }
            printWriter.println(i2);
        }
        if (this.r0 != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.r0);
        }
        if (this.s0 != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.s0);
        }
        if (this.t0 != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.s0);
        }
        if (g() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(g());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            a aVar3 = this.w0;
            if (aVar3 != null) {
                i3 = aVar3.c;
            }
            printWriter.println(i3);
        }
        or orVar = this.g0;
        if (orVar != null) {
            context = orVar.Q;
        }
        if (context != null) {
            new m20(this, i()).D1(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.h0 + ":");
        this.h0.E(k6.b(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final a e() {
        if (this.w0 == null) {
            this.w0 = new a();
        }
        return this.w0;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final c f(String str) {
        return str.equals(this.S) ? this : this.h0.L(str);
    }

    public final View g() {
        a aVar = this.w0;
        if (aVar == null) {
            return null;
        }
        return aVar.a;
    }

    public final Animator h() {
        a aVar = this.w0;
        if (aVar == null) {
            return null;
        }
        return aVar.b;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    @Override // defpackage.p41
    public final o41 i() {
        f fVar = this.f0;
        if (fVar != null) {
            rr rrVar = fVar.s0;
            o41 o41Var = rrVar.d.get(this.S);
            if (o41Var == null) {
                o41 o41Var2 = new o41();
                rrVar.d.put(this.S, o41Var2);
                return o41Var2;
            }
            return o41Var;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final f j() {
        if (this.g0 != null) {
            return this.h0;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    @Override // defpackage.b10
    public final androidx.lifecycle.e k() {
        return this.C0;
    }

    public final Resources l() {
        Context context;
        or orVar = this.g0;
        if (orVar == null) {
            context = null;
        } else {
            context = orVar.Q;
        }
        if (context != null) {
            return context.getResources();
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final String m(int i) {
        return l().getString(i);
    }

    public void n(Bundle bundle) {
        this.q0 = true;
    }

    public void o(int i, int i2, Intent intent) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.q0 = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        FragmentActivity fragmentActivity;
        or orVar = this.g0;
        if (orVar == null) {
            fragmentActivity = null;
        } else {
            fragmentActivity = (FragmentActivity) orVar.P;
        }
        if (fragmentActivity != null) {
            fragmentActivity.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.q0 = true;
    }

    public void p(Context context) {
        Activity activity;
        this.q0 = true;
        or orVar = this.g0;
        if (orVar == null) {
            activity = null;
        } else {
            activity = orVar.P;
        }
        if (activity != null) {
            this.q0 = true;
        }
    }

    public void q(Bundle bundle) {
        boolean z;
        Parcelable parcelable;
        this.q0 = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.h0.b0(parcelable);
            f fVar = this.h0;
            fVar.j0 = false;
            fVar.k0 = false;
            fVar.D(1);
        }
        f fVar2 = this.h0;
        if (fVar2.d0 >= 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            fVar2.j0 = false;
            fVar2.k0 = false;
            fVar2.D(1);
        }
    }

    public View r(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void s() {
        this.q0 = true;
    }

    public void t() {
        this.q0 = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        vj.g(this, sb);
        sb.append(" (");
        sb.append(this.S);
        sb.append(")");
        if (this.j0 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.j0));
        }
        if (this.l0 != null) {
            sb.append(" ");
            sb.append(this.l0);
        }
        sb.append('}');
        return sb.toString();
    }

    public void u() {
        this.q0 = true;
    }

    public LayoutInflater v(Bundle bundle) {
        or orVar = this.g0;
        if (orVar != null) {
            LayoutInflater m = orVar.m();
            f fVar = this.h0;
            fVar.getClass();
            m.setFactory2(fVar);
            if (Build.VERSION.SDK_INT < 21) {
                LayoutInflater.Factory factory = m.getFactory();
                if (factory instanceof LayoutInflater.Factory2) {
                    u00.a(m, (LayoutInflater.Factory2) factory);
                } else {
                    u00.a(m, fVar);
                }
            }
            return m;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void w() {
        this.q0 = true;
    }

    public void x(Bundle bundle) {
    }

    public void y() {
        this.q0 = true;
    }

    public void z() {
        this.q0 = true;
    }
}