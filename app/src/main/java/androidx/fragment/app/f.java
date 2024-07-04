package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.c;
import androidx.fragment.app.i;
import androidx.lifecycle.c;
import defpackage.m20;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

public final class f extends androidx.fragment.app.e implements LayoutInflater.Factory2 {
    public static final DecelerateInterpolator u0 = new DecelerateInterpolator(2.5f);
    public static final DecelerateInterpolator v0 = new DecelerateInterpolator(1.5f);
    public ArrayList<h> R;
    public boolean S;
    public ArrayList<androidx.fragment.app.a> W;
    public ArrayList<androidx.fragment.app.c> X;
    public OnBackPressedDispatcher Y;
    public ArrayList<androidx.fragment.app.a> a0;
    public ArrayList<Integer> b0;
    public or e0;
    public z9 f0;
    public androidx.fragment.app.c g0;
    public androidx.fragment.app.c h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public ArrayList<androidx.fragment.app.a> n0;
    public ArrayList<Boolean> o0;
    public ArrayList<androidx.fragment.app.c> p0;
    public rr s0;
    public int T = 0;
    public final ArrayList<androidx.fragment.app.c> U = new ArrayList<>();
    public final HashMap<String, androidx.fragment.app.c> V = new HashMap<>();
    public final a Z = new a();
    public final CopyOnWriteArrayList<C0005f> c0 = new CopyOnWriteArrayList<>();
    public int d0 = 0;
    public Bundle q0 = null;
    public SparseArray<Parcelable> r0 = null;
    public b t0 = new b();

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends ub0 {
        public a() {
        }

        @Override // defpackage.ub0
        public final void a() {
            f fVar = f.this;
            fVar.H();
            if (fVar.Z.a) {
                fVar.X();
            } else {
                fVar.Y.b();
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            f.this.H();
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c extends androidx.fragment.app.d {
        public c() {
        }

        @Override // androidx.fragment.app.d
        public final androidx.fragment.app.c a(ClassLoader classLoader, String str) {
            or orVar = f.this.e0;
            Context context = orVar.Q;
            orVar.getClass();
            Object obj = androidx.fragment.app.c.G0;
            try {
                return androidx.fragment.app.d.b(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e) {
                throw new c.b(ij.c("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
            } catch (InstantiationException e2) {
                throw new c.b(ij.c("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
            } catch (NoSuchMethodException e3) {
                throw new c.b(ij.c("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
            } catch (InvocationTargetException e4) {
                throw new c.b(ij.c("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class d {
        public final Animation a;
        public final Animator b;

        public d(Animator animator) {
            this.a = null;
            this.b = animator;
        }

        public d(Animation animation) {
            this.a = animation;
            this.b = null;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class e extends AnimationSet implements Runnable {
        public final ViewGroup P;
        public final View Q;
        public boolean R;
        public boolean S;
        public boolean T;

        public e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.T = true;
            this.P = viewGroup;
            this.Q = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j, Transformation transformation) {
            this.T = true;
            if (this.R) {
                return !this.S;
            }
            if (!super.getTransformation(j, transformation)) {
                this.R = true;
                kc0.a(this.P, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j, Transformation transformation, float f) {
            this.T = true;
            if (this.R) {
                return !this.S;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.R = true;
                kc0.a(this.P, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.R || !this.T) {
                this.P.endViewTransition(this.Q);
                this.S = true;
                return;
            }
            this.T = false;
            this.P.post(this);
        }
    }

    /* renamed from: androidx.fragment.app.f$f  reason: collision with other inner class name */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class C0005f {
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class g {
        public static final int[] a = {16842755, 16842960, 16842961};
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface h {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class i implements h {
        public final int a;
        public final int b = 1;

        public i(int i) {
            this.a = i;
        }

        @Override // androidx.fragment.app.f.h
        public final boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            androidx.fragment.app.c cVar = f.this.h0;
            if (cVar == null || this.a >= 0 || !cVar.j().X()) {
                return f.this.Y(arrayList, arrayList2, null, this.a, this.b);
            }
            return false;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class j {
        public int a;

        public final void a() {
            throw null;
        }

        public final void b() {
            throw null;
        }
    }

    public static boolean N(androidx.fragment.app.c cVar) {
        cVar.getClass();
        boolean z = false;
        for (androidx.fragment.app.c cVar2 : cVar.h0.V.values()) {
            if (cVar2 != null) {
                z = N(cVar2);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean O(androidx.fragment.app.c cVar) {
        if (cVar == null) {
            return true;
        }
        f fVar = cVar.f0;
        if (cVar == fVar.h0 && O(fVar.g0)) {
            return true;
        }
        return false;
    }

    public static d S(float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(u0);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(v0);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new d(animationSet);
    }

    public final void A() {
        if (this.d0 < 1) {
            return;
        }
        for (int i2 = 0; i2 < this.U.size(); i2++) {
            androidx.fragment.app.c cVar = this.U.get(i2);
            if (cVar != null && !cVar.m0) {
                cVar.h0.A();
            }
        }
    }

    public final void B(androidx.fragment.app.c cVar) {
        if (cVar != null && this.V.get(cVar.S) == cVar) {
            cVar.f0.getClass();
            boolean O = O(cVar);
            Boolean bool = cVar.X;
            if (bool == null || bool.booleanValue() != O) {
                cVar.X = Boolean.valueOf(O);
                f fVar = cVar.h0;
                fVar.j0();
                fVar.B(fVar.h0);
            }
        }
    }

    public final boolean C() {
        if (this.d0 < 1) {
            return false;
        }
        boolean z = false;
        for (int i2 = 0; i2 < this.U.size(); i2++) {
            androidx.fragment.app.c cVar = this.U.get(i2);
            if (cVar != null && cVar.E()) {
                z = true;
            }
        }
        return z;
    }

    public final void D(int i2) {
        try {
            this.S = true;
            U(i2, false);
            this.S = false;
            H();
        } catch (Throwable th) {
            this.S = false;
            throw th;
        }
    }

    public final void E(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        String b2 = k6.b(str, "    ");
        if (!this.V.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (androidx.fragment.app.c cVar : this.V.values()) {
                printWriter.print(str);
                printWriter.println(cVar);
                if (cVar != null) {
                    cVar.d(b2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size5 = this.U.size();
        if (size5 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size5; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.U.get(i2).toString());
            }
        }
        ArrayList<androidx.fragment.app.c> arrayList = this.X;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size4; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.X.get(i3).toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.W;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size3; i4++) {
                androidx.fragment.app.a aVar = this.W.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.e(b2, printWriter);
            }
        }
        synchronized (this) {
            ArrayList<androidx.fragment.app.a> arrayList3 = this.a0;
            if (arrayList3 != null && (size2 = arrayList3.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i5 = 0; i5 < size2; i5++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println((androidx.fragment.app.a) this.a0.get(i5));
                }
            }
            ArrayList<Integer> arrayList4 = this.b0;
            if (arrayList4 != null && arrayList4.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.b0.toArray()));
            }
        }
        ArrayList<h> arrayList5 = this.R;
        if (arrayList5 != null && (size = arrayList5.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i6 = 0; i6 < size; i6++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println((h) this.R.get(i6));
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.e0);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f0);
        if (this.g0 != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.g0);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.d0);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.j0);
        printWriter.print(" mStopped=");
        printWriter.print(this.k0);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.l0);
        if (this.i0) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.i0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(h hVar, boolean z) {
        if (!z && P()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        synchronized (this) {
            if (!this.l0 && this.e0 != null) {
                if (this.R == null) {
                    this.R = new ArrayList<>();
                }
                this.R.add(hVar);
                e0();
                return;
            }
            throw new IllegalStateException("Activity has been destroyed");
        }
    }

    public final void G() {
        if (!this.S) {
            if (this.e0 != null) {
                if (Looper.myLooper() == this.e0.R.getLooper()) {
                    if (this.n0 == null) {
                        this.n0 = new ArrayList<>();
                        this.o0 = new ArrayList<>();
                    }
                    this.S = true;
                    try {
                        J(null, null);
                        return;
                    } finally {
                        this.S = false;
                    }
                }
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    public final boolean H() {
        boolean z;
        G();
        boolean z2 = false;
        while (true) {
            ArrayList<androidx.fragment.app.a> arrayList = this.n0;
            ArrayList<Boolean> arrayList2 = this.o0;
            synchronized (this) {
                ArrayList<h> arrayList3 = this.R;
                if (arrayList3 != null && arrayList3.size() != 0) {
                    int size = this.R.size();
                    z = false;
                    for (int i2 = 0; i2 < size; i2++) {
                        z |= this.R.get(i2).a(arrayList, arrayList2);
                    }
                    this.R.clear();
                    this.e0.R.removeCallbacks(this.t0);
                }
                z = false;
            }
            if (!z) {
                break;
            }
            this.S = true;
            try {
                a0(this.n0, this.o0);
                e();
                z2 = true;
            } catch (Throwable th) {
                e();
                throw th;
            }
        }
        j0();
        if (this.m0) {
            this.m0 = false;
            h0();
        }
        this.V.values().removeAll(Collections.singleton(null));
        return z2;
    }

    public final void I(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        ArrayList<Boolean> arrayList3 = arrayList2;
        boolean z2 = arrayList.get(i2).p;
        ArrayList<androidx.fragment.app.c> arrayList4 = this.p0;
        if (arrayList4 == null) {
            this.p0 = new ArrayList<>();
        } else {
            arrayList4.clear();
        }
        this.p0.addAll(this.U);
        androidx.fragment.app.c cVar = this.h0;
        int i8 = i2;
        boolean z3 = false;
        while (true) {
            int i9 = 1;
            if (i8 < i3) {
                androidx.fragment.app.a aVar = arrayList.get(i8);
                int i10 = 3;
                if (!arrayList3.get(i8).booleanValue()) {
                    ArrayList<androidx.fragment.app.c> arrayList5 = this.p0;
                    int i11 = 0;
                    while (i11 < aVar.a.size()) {
                        i.a aVar2 = aVar.a.get(i11);
                        int i12 = aVar2.a;
                        if (i12 != i9) {
                            if (i12 != 2) {
                                if (i12 != i10 && i12 != 6) {
                                    if (i12 != 7) {
                                        if (i12 == 8) {
                                            aVar.a.add(i11, new i.a(9, cVar));
                                            i11++;
                                            cVar = aVar2.b;
                                        }
                                    }
                                } else {
                                    arrayList5.remove(aVar2.b);
                                    androidx.fragment.app.c cVar2 = aVar2.b;
                                    if (cVar2 == cVar) {
                                        aVar.a.add(i11, new i.a(9, cVar2));
                                        i11++;
                                        cVar = null;
                                    }
                                }
                            } else {
                                androidx.fragment.app.c cVar3 = aVar2.b;
                                int i13 = cVar3.k0;
                                int size = arrayList5.size() - 1;
                                boolean z4 = false;
                                while (size >= 0) {
                                    androidx.fragment.app.c cVar4 = arrayList5.get(size);
                                    if (cVar4.k0 == i13) {
                                        if (cVar4 == cVar3) {
                                            i7 = i13;
                                            z4 = true;
                                        } else {
                                            if (cVar4 == cVar) {
                                                i7 = i13;
                                                aVar.a.add(i11, new i.a(9, cVar4));
                                                i11++;
                                                cVar = null;
                                            } else {
                                                i7 = i13;
                                            }
                                            i.a aVar3 = new i.a(3, cVar4);
                                            aVar3.c = aVar2.c;
                                            aVar3.e = aVar2.e;
                                            aVar3.d = aVar2.d;
                                            aVar3.f = aVar2.f;
                                            aVar.a.add(i11, aVar3);
                                            arrayList5.remove(cVar4);
                                            i11++;
                                        }
                                    } else {
                                        i7 = i13;
                                    }
                                    size--;
                                    i13 = i7;
                                }
                                if (z4) {
                                    aVar.a.remove(i11);
                                    i11--;
                                } else {
                                    i6 = 1;
                                    aVar2.a = 1;
                                    arrayList5.add(cVar3);
                                    i11 += i6;
                                    i10 = 3;
                                    i9 = 1;
                                }
                            }
                            i6 = 1;
                            i11 += i6;
                            i10 = 3;
                            i9 = 1;
                        }
                        i6 = 1;
                        arrayList5.add(aVar2.b);
                        i11 += i6;
                        i10 = 3;
                        i9 = 1;
                    }
                } else {
                    int i14 = 1;
                    ArrayList<androidx.fragment.app.c> arrayList6 = this.p0;
                    int size2 = aVar.a.size() - 1;
                    while (size2 >= 0) {
                        i.a aVar4 = aVar.a.get(size2);
                        int i15 = aVar4.a;
                        if (i15 != i14) {
                            if (i15 != 3) {
                                switch (i15) {
                                    case 8:
                                        cVar = null;
                                        break;
                                    case 9:
                                        cVar = aVar4.b;
                                        break;
                                    case 10:
                                        aVar4.h = aVar4.g;
                                        break;
                                }
                                size2--;
                                i14 = 1;
                            }
                            arrayList6.add(aVar4.b);
                            size2--;
                            i14 = 1;
                        }
                        arrayList6.remove(aVar4.b);
                        size2--;
                        i14 = 1;
                    }
                }
                if (!z3 && !aVar.h) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                i8++;
                arrayList3 = arrayList2;
            } else {
                this.p0.clear();
                if (!z2) {
                    l.j(this, arrayList, arrayList2, i2, i3, false);
                }
                for (int i16 = i2; i16 < i3; i16++) {
                    androidx.fragment.app.a aVar5 = arrayList.get(i16);
                    if (arrayList2.get(i16).booleanValue()) {
                        aVar5.c(-1);
                        if (i16 == i3 - 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        aVar5.g(z);
                    } else {
                        aVar5.c(1);
                        aVar5.f();
                    }
                }
                if (z2) {
                    g7<androidx.fragment.app.c> g7Var = new g7<>();
                    a(g7Var);
                    i4 = i2;
                    for (int i17 = i3 - 1; i17 >= i4; i17--) {
                        androidx.fragment.app.a aVar6 = arrayList.get(i17);
                        arrayList2.get(i17).booleanValue();
                        for (int i18 = 0; i18 < aVar6.a.size(); i18++) {
                            androidx.fragment.app.c cVar5 = aVar6.a.get(i18).b;
                        }
                    }
                    int i19 = g7Var.R;
                    for (int i20 = 0; i20 < i19; i20++) {
                        androidx.fragment.app.c cVar6 = (androidx.fragment.app.c) g7Var.Q[i20];
                        if (!cVar6.Y) {
                            View G = cVar6.G();
                            cVar6.z0 = G.getAlpha();
                            G.setAlpha(0.0f);
                        }
                    }
                } else {
                    i4 = i2;
                }
                if (i3 != i4 && z2) {
                    l.j(this, arrayList, arrayList2, i2, i3, true);
                    U(this.d0, true);
                }
                while (i4 < i3) {
                    androidx.fragment.app.a aVar7 = arrayList.get(i4);
                    if (arrayList2.get(i4).booleanValue() && (i5 = aVar7.s) >= 0) {
                        synchronized (this) {
                            this.a0.set(i5, null);
                            if (this.b0 == null) {
                                this.b0 = new ArrayList<>();
                            }
                            this.b0.add(Integer.valueOf(i5));
                        }
                        aVar7.s = -1;
                    }
                    aVar7.getClass();
                    i4++;
                }
                return;
            }
        }
    }

    public final void J(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
    }

    public final androidx.fragment.app.c K(int i2) {
        for (int size = this.U.size() - 1; size >= 0; size--) {
            androidx.fragment.app.c cVar = this.U.get(size);
            if (cVar != null && cVar.j0 == i2) {
                return cVar;
            }
        }
        for (androidx.fragment.app.c cVar2 : this.V.values()) {
            if (cVar2 != null && cVar2.j0 == i2) {
                return cVar2;
            }
        }
        return null;
    }

    public final androidx.fragment.app.c L(String str) {
        androidx.fragment.app.c f;
        for (androidx.fragment.app.c cVar : this.V.values()) {
            if (cVar != null && (f = cVar.f(str)) != null) {
                return f;
            }
        }
        return null;
    }

    public final androidx.fragment.app.d M() {
        if (this.P == null) {
            this.P = androidx.fragment.app.e.Q;
        }
        androidx.fragment.app.d dVar = this.P;
        androidx.fragment.app.d dVar2 = androidx.fragment.app.e.Q;
        if (dVar == dVar2) {
            androidx.fragment.app.c cVar = this.g0;
            if (cVar != null) {
                return cVar.f0.M();
            }
            this.P = new c();
        }
        if (this.P == null) {
            this.P = dVar2;
        }
        return this.P;
    }

    public final boolean P() {
        return this.j0 || this.k0;
    }

    public final d Q(androidx.fragment.app.c cVar, int i2, boolean z, int i3) {
        int i4;
        c.a aVar = cVar.w0;
        boolean z2 = false;
        if (aVar == null) {
            i4 = 0;
        } else {
            i4 = aVar.d;
        }
        cVar.H(0);
        ViewGroup viewGroup = cVar.r0;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        char c2 = 1;
        if (i4 != 0) {
            boolean equals = "anim".equals(this.e0.Q.getResources().getResourceTypeName(i4));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.e0.Q, i4);
                    if (loadAnimation != null) {
                        return new d(loadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.e0.Q, i4);
                    if (loadAnimator != null) {
                        return new d(loadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.e0.Q, i4);
                        if (loadAnimation2 != null) {
                            return new d(loadAnimation2);
                        }
                    } else {
                        throw e3;
                    }
                }
            }
        }
        if (i2 == 0) {
            return null;
        }
        if (i2 != 4097) {
            if (i2 != 4099) {
                if (i2 != 8194) {
                    c2 = 65535;
                } else if (z) {
                    c2 = 3;
                } else {
                    c2 = 4;
                }
            } else if (z) {
                c2 = 5;
            } else {
                c2 = 6;
            }
        } else if (!z) {
            c2 = 2;
        }
        if (c2 < 0) {
            return null;
        }
        switch (c2) {
            case 1:
                return S(1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return S(1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return S(0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return S(1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setInterpolator(v0);
                alphaAnimation.setDuration(220L);
                return new d(alphaAnimation);
            case 6:
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation2.setInterpolator(v0);
                alphaAnimation2.setDuration(220L);
                return new d(alphaAnimation2);
            default:
                if (i3 == 0 && this.e0.o()) {
                    this.e0.n();
                }
                return null;
        }
    }

    public final void R(androidx.fragment.app.c cVar) {
        if (this.V.get(cVar.S) != null) {
            return;
        }
        this.V.put(cVar.S, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(androidx.fragment.app.c cVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        c.a aVar;
        boolean z;
        boolean z2;
        Animator animator;
        boolean z3;
        int i7;
        int i8;
        boolean z4;
        if (cVar == null || !this.V.containsKey(cVar.S)) {
            return;
        }
        int i9 = this.d0;
        if (cVar.Z) {
            if (cVar.e0 > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                i9 = Math.min(i9, 1);
            } else {
                i9 = Math.min(i9, 0);
            }
        }
        int i10 = i9;
        c.a aVar2 = cVar.w0;
        if (aVar2 == null) {
            i2 = 0;
        } else {
            i2 = aVar2.e;
        }
        if (aVar2 == null) {
            i3 = 0;
        } else {
            i3 = aVar2.f;
        }
        V(cVar, i10, i2, i3, false);
        if (cVar.s0 != null) {
            ViewGroup viewGroup = cVar.r0;
            androidx.fragment.app.c cVar2 = null;
            if (viewGroup != null) {
                int indexOf = this.U.indexOf(cVar);
                while (true) {
                    indexOf--;
                    if (indexOf < 0) {
                        break;
                    }
                    androidx.fragment.app.c cVar3 = this.U.get(indexOf);
                    if (cVar3.r0 == viewGroup && cVar3.s0 != null) {
                        cVar2 = cVar3;
                        break;
                    }
                }
            }
            if (cVar2 != null) {
                View view = cVar2.s0;
                ViewGroup viewGroup2 = cVar.r0;
                int indexOfChild = viewGroup2.indexOfChild(view);
                int indexOfChild2 = viewGroup2.indexOfChild(cVar.s0);
                if (indexOfChild2 < indexOfChild) {
                    viewGroup2.removeViewAt(indexOfChild2);
                    viewGroup2.addView(cVar.s0, indexOfChild);
                }
            }
            if (cVar.x0 && cVar.r0 != null) {
                float f = cVar.z0;
                if (f > 0.0f) {
                    cVar.s0.setAlpha(f);
                }
                cVar.z0 = 0.0f;
                cVar.x0 = false;
                c.a aVar3 = cVar.w0;
                if (aVar3 == null) {
                    i7 = 0;
                } else {
                    i7 = aVar3.e;
                }
                if (aVar3 == null) {
                    i8 = 0;
                } else {
                    i8 = aVar3.f;
                }
                d Q = Q(cVar, i7, true, i8);
                if (Q != null) {
                    Animation animation = Q.a;
                    if (animation != null) {
                        cVar.s0.startAnimation(animation);
                    } else {
                        Q.b.setTarget(cVar.s0);
                        Q.b.start();
                    }
                }
            }
        }
        if (cVar.y0) {
            if (cVar.s0 != null) {
                c.a aVar4 = cVar.w0;
                if (aVar4 == null) {
                    i4 = 0;
                } else {
                    i4 = aVar4.e;
                }
                boolean z5 = !cVar.m0;
                if (aVar4 == null) {
                    i5 = 0;
                } else {
                    i5 = aVar4.f;
                }
                d Q2 = Q(cVar, i4, z5, i5);
                if (Q2 != null && (animator = Q2.b) != null) {
                    animator.setTarget(cVar.s0);
                    if (cVar.m0) {
                        c.a aVar5 = cVar.w0;
                        if (aVar5 == null) {
                            z3 = false;
                        } else {
                            z3 = aVar5.j;
                        }
                        if (z3) {
                            cVar.e().j = false;
                        } else {
                            ViewGroup viewGroup3 = cVar.r0;
                            View view2 = cVar.s0;
                            viewGroup3.startViewTransition(view2);
                            Q2.b.addListener(new pr(viewGroup3, view2, cVar));
                        }
                    } else {
                        cVar.s0.setVisibility(0);
                    }
                    Q2.b.start();
                } else {
                    if (Q2 != null) {
                        cVar.s0.startAnimation(Q2.a);
                        Q2.a.start();
                    }
                    if (cVar.m0) {
                        c.a aVar6 = cVar.w0;
                        if (aVar6 == null) {
                            z2 = false;
                        } else {
                            z2 = aVar6.j;
                        }
                        if (!z2) {
                            i6 = 8;
                            cVar.s0.setVisibility(i6);
                            aVar = cVar.w0;
                            if (aVar != null) {
                                z = false;
                            } else {
                                z = aVar.j;
                            }
                            if (z) {
                                cVar.e().j = false;
                            }
                        }
                    }
                    i6 = 0;
                    cVar.s0.setVisibility(i6);
                    aVar = cVar.w0;
                    if (aVar != null) {
                    }
                    if (z) {
                    }
                }
            }
            if (cVar.Y && N(cVar)) {
                this.i0 = true;
            }
            cVar.y0 = false;
        }
    }

    public final void U(int i2, boolean z) {
        or orVar;
        if (this.e0 == null && i2 != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.d0) {
            this.d0 = i2;
            int size = this.U.size();
            for (int i3 = 0; i3 < size; i3++) {
                T(this.U.get(i3));
            }
            for (androidx.fragment.app.c cVar : this.V.values()) {
                if (cVar != null && (cVar.Z || cVar.n0)) {
                    if (!cVar.x0) {
                        T(cVar);
                    }
                }
            }
            h0();
            if (this.i0 && (orVar = this.e0) != null && this.d0 == 4) {
                orVar.q();
                this.i0 = false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0092, code lost:
        if (r0 != 3) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:380:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(androidx.fragment.app.c cVar, int i2, int i3, int i4, boolean z) {
        int i5;
        boolean z2;
        or orVar;
        Context context;
        boolean z3;
        rr rrVar;
        o41 o41Var;
        androidx.fragment.app.c cVar2;
        ViewGroup viewGroup;
        Parcelable parcelable;
        androidx.fragment.app.c cVar3;
        ViewGroup viewGroup2;
        String str;
        int i6;
        int i7 = 1;
        r8 = true;
        boolean z4 = true;
        if (!cVar.Y || cVar.n0) {
            i5 = i2;
            if (i5 > 1) {
                i5 = 1;
            }
        } else {
            i5 = i2;
        }
        if (cVar.Z && i5 > (i6 = cVar.P)) {
            if (i6 == 0) {
                if (cVar.e0 > 0) {
                    i5 = 1;
                }
            }
            i5 = i6;
        }
        if (cVar.u0 && cVar.P < 3 && i5 > 2) {
            i5 = 2;
        }
        c.EnumC0007c enumC0007c = cVar.B0;
        int min = enumC0007c == c.EnumC0007c.CREATED ? Math.min(i5, 1) : Math.min(i5, enumC0007c.ordinal());
        int i8 = cVar.P;
        if (i8 <= min) {
            if (cVar.a0 && !cVar.b0) {
                return;
            }
            if (cVar.g() != null || cVar.h() != null) {
                cVar.e().a = null;
                cVar.e().b = null;
                c.a aVar = cVar.w0;
                V(cVar, aVar == null ? 0 : aVar.c, 0, 0, true);
            }
            int i9 = cVar.P;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 != 2) {
                    }
                    if (min > 2) {
                        cVar.h0.W();
                        cVar.h0.H();
                        cVar.P = 3;
                        cVar.q0 = false;
                        cVar.y();
                        if (cVar.q0) {
                            androidx.lifecycle.e eVar = cVar.C0;
                            c.b bVar = c.b.ON_START;
                            eVar.d(bVar);
                            if (cVar.s0 != null) {
                                cVar.D0.d(bVar);
                            }
                            f fVar = cVar.h0;
                            fVar.j0 = false;
                            fVar.k0 = false;
                            fVar.D(3);
                            v(false);
                        } else {
                            throw new pu0("Fragment " + cVar + " did not call through to super.onStart()");
                        }
                    }
                    if (min > 3) {
                        cVar.h0.W();
                        cVar.h0.H();
                        cVar.P = 4;
                        cVar.q0 = false;
                        cVar.w();
                        if (cVar.q0) {
                            androidx.lifecycle.e eVar2 = cVar.C0;
                            c.b bVar2 = c.b.ON_RESUME;
                            eVar2.d(bVar2);
                            if (cVar.s0 != null) {
                                cVar.D0.d(bVar2);
                            }
                            f fVar2 = cVar.h0;
                            fVar2.j0 = false;
                            fVar2.k0 = false;
                            fVar2.D(4);
                            cVar.h0.H();
                            t(false);
                            cVar.Q = null;
                            cVar.R = null;
                        } else {
                            throw new pu0("Fragment " + cVar + " did not call through to super.onResume()");
                        }
                    }
                }
            } else if (min > 0) {
                Bundle bundle = cVar.Q;
                if (bundle != null) {
                    bundle.setClassLoader(this.e0.Q.getClassLoader());
                    cVar.R = cVar.Q.getSparseParcelableArray("android:view_state");
                    String string = cVar.Q.getString("android:target_state");
                    if (string == null) {
                        cVar3 = null;
                    } else {
                        cVar3 = this.V.get(string);
                        if (cVar3 == null) {
                            i0(new IllegalStateException(ho.b("Fragment no longer exists for key ", "android:target_state", ": unique id ", string)));
                            throw null;
                        }
                    }
                    String str2 = cVar3 != null ? cVar3.S : null;
                    cVar.V = str2;
                    if (str2 != null) {
                        cVar.W = cVar.Q.getInt("android:target_req_state", 0);
                    }
                    boolean z5 = cVar.Q.getBoolean("android:user_visible_hint", true);
                    cVar.v0 = z5;
                    if (!z5) {
                        cVar.u0 = true;
                        if (min > 2) {
                            min = 2;
                        }
                    }
                }
                or orVar2 = this.e0;
                cVar.g0 = orVar2;
                androidx.fragment.app.c cVar4 = this.g0;
                cVar.i0 = cVar4;
                cVar.f0 = cVar4 != null ? cVar4.h0 : orVar2.S;
                androidx.fragment.app.c cVar5 = cVar.U;
                if (cVar5 != null) {
                    androidx.fragment.app.c cVar6 = this.V.get(cVar5.S);
                    androidx.fragment.app.c cVar7 = cVar.U;
                    if (cVar6 != cVar7) {
                        throw new IllegalStateException("Fragment " + cVar + " declared target fragment " + cVar.U + " that does not belong to this FragmentManager!");
                    }
                    if (cVar7.P < 1) {
                        V(cVar7, 1, 0, 0, true);
                    }
                    cVar.V = cVar.U.S;
                    cVar.U = null;
                }
                String str3 = cVar.V;
                if (str3 != null) {
                    androidx.fragment.app.c cVar8 = this.V.get(str3);
                    if (cVar8 == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Fragment ");
                        sb.append(cVar);
                        sb.append(" declared target fragment ");
                        throw new IllegalStateException(qq.d(sb, cVar.V, " that does not belong to this FragmentManager!"));
                    } else if (cVar8.P < 1) {
                        V(cVar8, 1, 0, 0, true);
                    }
                }
                Context context2 = this.e0.Q;
                r(false);
                cVar.h0.c(cVar.g0, new mr(cVar), cVar);
                cVar.q0 = false;
                cVar.p(cVar.g0.Q);
                if (cVar.q0) {
                    if (cVar.i0 == null) {
                        this.e0.h();
                    }
                    Context context3 = this.e0.Q;
                    m(false);
                    if (!cVar.A0) {
                        s(false);
                        Bundle bundle2 = cVar.Q;
                        cVar.h0.W();
                        cVar.P = 1;
                        cVar.q0 = false;
                        cVar.F0.a(bundle2);
                        cVar.q(bundle2);
                        cVar.A0 = true;
                        if (cVar.q0) {
                            cVar.C0.d(c.b.ON_CREATE);
                            n(false);
                        } else {
                            throw new pu0("Fragment " + cVar + " did not call through to super.onCreate()");
                        }
                    } else {
                        Bundle bundle3 = cVar.Q;
                        if (bundle3 != null && (parcelable = bundle3.getParcelable("android:support:fragments")) != null) {
                            cVar.h0.b0(parcelable);
                            f fVar3 = cVar.h0;
                            fVar3.j0 = false;
                            fVar3.k0 = false;
                            fVar3.D(1);
                        }
                        cVar.P = 1;
                    }
                } else {
                    throw new pu0("Fragment " + cVar + " did not call through to super.onAttach()");
                }
            }
            if (min > 0 && cVar.a0 && !cVar.d0) {
                cVar.A(cVar.v(cVar.Q), null, cVar.Q);
                View view = cVar.s0;
                if (view != null) {
                    cVar.t0 = view;
                    view.setSaveFromParentEnabled(false);
                    if (cVar.m0) {
                        cVar.s0.setVisibility(8);
                    }
                    x(false);
                } else {
                    cVar.t0 = null;
                }
            }
            if (min > 1) {
                if (!cVar.a0) {
                    int i10 = cVar.k0;
                    if (i10 == 0) {
                        viewGroup2 = null;
                    } else if (i10 == -1) {
                        i0(new IllegalArgumentException("Cannot create fragment " + cVar + " for a container view with no id"));
                        throw null;
                    } else {
                        viewGroup2 = (ViewGroup) this.f0.f(i10);
                        if (viewGroup2 == null && !cVar.c0) {
                            try {
                                str = cVar.l().getResourceName(cVar.k0);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            StringBuilder b2 = e5.b("No view found for id 0x");
                            b2.append(Integer.toHexString(cVar.k0));
                            b2.append(" (");
                            b2.append(str);
                            b2.append(") for fragment ");
                            b2.append(cVar);
                            i0(new IllegalArgumentException(b2.toString()));
                            throw null;
                        }
                    }
                    cVar.r0 = viewGroup2;
                    cVar.A(cVar.v(cVar.Q), viewGroup2, cVar.Q);
                    View view2 = cVar.s0;
                    if (view2 != null) {
                        cVar.t0 = view2;
                        view2.setSaveFromParentEnabled(false);
                        if (viewGroup2 != null) {
                            viewGroup2.addView(cVar.s0);
                        }
                        if (cVar.m0) {
                            cVar.s0.setVisibility(8);
                        }
                        x(false);
                        cVar.x0 = cVar.s0.getVisibility() == 0 && cVar.r0 != null;
                    } else {
                        cVar.t0 = null;
                    }
                }
                Bundle bundle4 = cVar.Q;
                cVar.h0.W();
                cVar.P = 2;
                cVar.q0 = false;
                cVar.n(bundle4);
                if (cVar.q0) {
                    f fVar4 = cVar.h0;
                    fVar4.j0 = false;
                    fVar4.k0 = false;
                    fVar4.D(2);
                    l(false);
                    if (cVar.s0 != null) {
                        SparseArray<Parcelable> sparseArray = cVar.R;
                        if (sparseArray != null) {
                            cVar.t0.restoreHierarchyState(sparseArray);
                            cVar.R = null;
                        }
                        cVar.q0 = true;
                        if (cVar.s0 != null) {
                            cVar.D0.d(c.b.ON_CREATE);
                        }
                    }
                    cVar.Q = null;
                } else {
                    throw new pu0("Fragment " + cVar + " did not call through to super.onActivityCreated()");
                }
            }
            if (min > 2) {
            }
            if (min > 3) {
            }
        } else if (i8 > min) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 == 4) {
                            if (min < 4) {
                                cVar.h0.D(3);
                                if (cVar.s0 != null) {
                                    cVar.D0.d(c.b.ON_PAUSE);
                                }
                                cVar.C0.d(c.b.ON_PAUSE);
                                cVar.P = 3;
                                cVar.q0 = true;
                                q(false);
                            }
                        }
                    }
                    if (min < 3) {
                        f fVar5 = cVar.h0;
                        fVar5.k0 = true;
                        fVar5.D(2);
                        if (cVar.s0 != null) {
                            cVar.D0.d(c.b.ON_STOP);
                        }
                        cVar.C0.d(c.b.ON_STOP);
                        cVar.P = 2;
                        cVar.q0 = false;
                        cVar.z();
                        if (cVar.q0) {
                            w(false);
                        } else {
                            throw new pu0("Fragment " + cVar + " did not call through to super.onStop()");
                        }
                    }
                }
                if (min < 2) {
                    if (cVar.s0 != null && this.e0.p() && cVar.R == null) {
                        d0(cVar);
                    }
                    cVar.h0.D(1);
                    if (cVar.s0 != null) {
                        cVar.D0.d(c.b.ON_DESTROY);
                    }
                    cVar.P = 1;
                    cVar.q0 = false;
                    cVar.t();
                    if (cVar.q0) {
                        m20.b bVar3 = (m20.b) new n41(cVar.i(), m20.b.c).a(m20.b.class);
                        int f = bVar3.b.f();
                        for (int i11 = 0; i11 < f; i11++) {
                            bVar3.b.h(i11).getClass();
                        }
                        cVar.d0 = false;
                        y(false);
                        View view3 = cVar.s0;
                        if (view3 != null && (viewGroup = cVar.r0) != null) {
                            viewGroup.endViewTransition(view3);
                            cVar.s0.clearAnimation();
                            androidx.fragment.app.c cVar9 = cVar.i0;
                            if (cVar9 == null || !cVar9.Z) {
                                d Q = (this.d0 <= 0 || this.l0 || cVar.s0.getVisibility() != 0 || cVar.z0 < 0.0f) ? null : Q(cVar, i3, false, i4);
                                cVar.z0 = 0.0f;
                                if (Q != null) {
                                    View view4 = cVar.s0;
                                    ViewGroup viewGroup3 = cVar.r0;
                                    viewGroup3.startViewTransition(view4);
                                    cVar.e().c = min;
                                    if (Q.a != null) {
                                        e eVar3 = new e(Q.a, viewGroup3, view4);
                                        cVar.e().a = cVar.s0;
                                        eVar3.setAnimationListener(new androidx.fragment.app.g(this, viewGroup3, cVar));
                                        cVar.s0.startAnimation(eVar3);
                                    } else {
                                        Animator animator = Q.b;
                                        cVar.e().b = animator;
                                        animator.addListener(new androidx.fragment.app.h(this, viewGroup3, view4, cVar));
                                        animator.setTarget(cVar.s0);
                                        animator.start();
                                    }
                                }
                                cVar.r0.removeView(cVar.s0);
                            }
                        }
                        cVar.r0 = null;
                        cVar.s0 = null;
                        cVar.D0 = null;
                        cVar.E0.g(null);
                        cVar.t0 = null;
                        cVar.b0 = false;
                    } else {
                        throw new pu0("Fragment " + cVar + " did not call through to super.onDestroyView()");
                    }
                }
            }
            if (min < 1) {
                if (this.l0) {
                    if (cVar.g() != null) {
                        View g2 = cVar.g();
                        cVar.e().a = null;
                        g2.clearAnimation();
                    } else if (cVar.h() != null) {
                        Animator h2 = cVar.h();
                        cVar.e().b = null;
                        h2.cancel();
                    }
                }
                if (cVar.g() == null && cVar.h() == null) {
                    if (cVar.Z) {
                        if (!(cVar.e0 > 0)) {
                            z2 = true;
                            if (!z2) {
                                rr rrVar2 = this.s0;
                                if (!((rrVar2.b.contains(cVar) && rrVar2.e) ? rrVar2.f : true)) {
                                    cVar.P = 0;
                                    cVar.q0 = false;
                                    cVar.u();
                                    if (!cVar.q0) {
                                        f fVar6 = cVar.h0;
                                        if (!fVar6.l0) {
                                            fVar6.k();
                                            cVar.h0 = new f();
                                        }
                                        p(false);
                                        if (!z) {
                                            if (!z2) {
                                                rr rrVar3 = this.s0;
                                                if (rrVar3.b.contains(cVar) && rrVar3.e) {
                                                    z4 = rrVar3.f;
                                                }
                                                if (!z4) {
                                                    cVar.g0 = null;
                                                    cVar.i0 = null;
                                                    cVar.f0 = null;
                                                    String str4 = cVar.V;
                                                    if (str4 != null && (cVar2 = this.V.get(str4)) != null && cVar2.o0) {
                                                        cVar.U = cVar2;
                                                    }
                                                }
                                            }
                                            if (this.V.get(cVar.S) != null) {
                                                for (androidx.fragment.app.c cVar10 : this.V.values()) {
                                                    if (cVar10 != null && cVar.S.equals(cVar10.V)) {
                                                        cVar10.U = cVar;
                                                        cVar10.V = null;
                                                    }
                                                }
                                                this.V.put(cVar.S, null);
                                                if (!P()) {
                                                    this.s0.b.remove(cVar);
                                                }
                                                String str5 = cVar.V;
                                                if (str5 != null) {
                                                    cVar.U = this.V.get(str5);
                                                }
                                                cVar.C0 = new androidx.lifecycle.e(cVar);
                                                cVar.F0 = new androidx.savedstate.b(cVar);
                                                cVar.C0.a(new Fragment$2(cVar));
                                                cVar.S = UUID.randomUUID().toString();
                                                cVar.Y = false;
                                                cVar.Z = false;
                                                cVar.a0 = false;
                                                cVar.b0 = false;
                                                cVar.c0 = false;
                                                cVar.e0 = 0;
                                                cVar.f0 = null;
                                                cVar.h0 = new f();
                                                cVar.g0 = null;
                                                cVar.j0 = 0;
                                                cVar.k0 = 0;
                                                cVar.l0 = null;
                                                cVar.m0 = false;
                                                cVar.n0 = false;
                                            }
                                        }
                                    } else {
                                        throw new pu0("Fragment " + cVar + " did not call through to super.onDetach()");
                                    }
                                }
                            }
                            orVar = this.e0;
                            if (!(orVar instanceof p41)) {
                                z3 = this.s0.f;
                            } else {
                                z3 = orVar.Q instanceof Activity ? !((Activity) context).isChangingConfigurations() : true;
                            }
                            if (!z2 || z3) {
                                rr rrVar4 = this.s0;
                                rrVar4.getClass();
                                rrVar = rrVar4.c.get(cVar.S);
                                if (rrVar != null) {
                                    rrVar.a();
                                    rrVar4.c.remove(cVar.S);
                                }
                                o41Var = rrVar4.d.get(cVar.S);
                                if (o41Var != null) {
                                    o41Var.a();
                                    rrVar4.d.remove(cVar.S);
                                }
                            }
                            cVar.h0.k();
                            cVar.C0.d(c.b.ON_DESTROY);
                            cVar.P = 0;
                            cVar.q0 = false;
                            cVar.A0 = false;
                            cVar.s();
                            if (!cVar.q0) {
                                o(false);
                                cVar.q0 = false;
                                cVar.u();
                                if (!cVar.q0) {
                                }
                            } else {
                                throw new pu0("Fragment " + cVar + " did not call through to super.onDestroy()");
                            }
                        }
                    }
                    z2 = false;
                    if (!z2) {
                    }
                    orVar = this.e0;
                    if (!(orVar instanceof p41)) {
                    }
                    if (!z2) {
                    }
                    rr rrVar42 = this.s0;
                    rrVar42.getClass();
                    rrVar = rrVar42.c.get(cVar.S);
                    if (rrVar != null) {
                    }
                    o41Var = rrVar42.d.get(cVar.S);
                    if (o41Var != null) {
                    }
                    cVar.h0.k();
                    cVar.C0.d(c.b.ON_DESTROY);
                    cVar.P = 0;
                    cVar.q0 = false;
                    cVar.A0 = false;
                    cVar.s();
                    if (!cVar.q0) {
                    }
                } else {
                    cVar.e().c = min;
                    if (cVar.P == i7) {
                        Log.w("FragmentManager", "moveToState: Fragment state for " + cVar + " not updated inline; expected state " + i7 + " found " + cVar.P);
                        cVar.P = i7;
                        return;
                    }
                    return;
                }
            }
        }
        i7 = min;
        if (cVar.P == i7) {
        }
    }

    public final void W() {
        this.j0 = false;
        this.k0 = false;
        int size = this.U.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.fragment.app.c cVar = this.U.get(i2);
            if (cVar != null) {
                cVar.h0.W();
            }
        }
    }

    public final boolean X() {
        if (!P()) {
            H();
            G();
            androidx.fragment.app.c cVar = this.h0;
            if (cVar != null && cVar.j().X()) {
                return true;
            }
            boolean Y = Y(this.n0, this.o0, null, -1, 0);
            if (Y) {
                this.S = true;
                try {
                    a0(this.n0, this.o0);
                } finally {
                    e();
                }
            }
            j0();
            if (this.m0) {
                this.m0 = false;
                h0();
            }
            this.V.values().removeAll(Collections.singleton(null));
            return Y;
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    public final boolean Y(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        ArrayList<androidx.fragment.app.a> arrayList3 = this.W;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.W.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str == null && i2 < 0) {
                i4 = -1;
            } else {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = this.W.get(size2);
                    if ((str != null && str.equals(aVar.i)) || (i2 >= 0 && i2 == aVar.s)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        androidx.fragment.app.a aVar2 = this.W.get(size2);
                        if (str == null || !str.equals(aVar2.i)) {
                            if (i2 < 0 || i2 != aVar2.s) {
                                break;
                            }
                        }
                    }
                }
                i4 = size2;
            }
            if (i4 == this.W.size() - 1) {
                return false;
            }
            for (int size3 = this.W.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.W.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public final void Z(androidx.fragment.app.c cVar) {
        boolean z;
        if (cVar.e0 > 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !z;
        if (!cVar.n0 || z2) {
            synchronized (this.U) {
                this.U.remove(cVar);
            }
            if (N(cVar)) {
                this.i0 = true;
            }
            cVar.Y = false;
            cVar.Z = true;
        }
    }

    public final void a(g7<androidx.fragment.app.c> g7Var) {
        int i2;
        int i3;
        int i4 = this.d0;
        if (i4 < 1) {
            return;
        }
        int min = Math.min(i4, 3);
        int size = this.U.size();
        for (int i5 = 0; i5 < size; i5++) {
            androidx.fragment.app.c cVar = this.U.get(i5);
            if (cVar.P < min) {
                c.a aVar = cVar.w0;
                if (aVar == null) {
                    i2 = 0;
                } else {
                    i2 = aVar.d;
                }
                if (aVar == null) {
                    i3 = 0;
                } else {
                    i3 = aVar.e;
                }
                V(cVar, min, i2, i3, false);
                if (cVar.s0 != null && !cVar.m0 && cVar.x0) {
                    g7Var.add(cVar);
                }
            }
        }
    }

    public final void a0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        J(arrayList, arrayList2);
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).p) {
                if (i3 != i2) {
                    I(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).p) {
                        i3++;
                    }
                }
                I(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            I(arrayList, arrayList2, i3, size);
        }
    }

    public final void b(androidx.fragment.app.c cVar, boolean z) {
        R(cVar);
        if (!cVar.n0) {
            if (!this.U.contains(cVar)) {
                synchronized (this.U) {
                    this.U.add(cVar);
                }
                cVar.Y = true;
                cVar.Z = false;
                if (cVar.s0 == null) {
                    cVar.y0 = false;
                }
                if (N(cVar)) {
                    this.i0 = true;
                }
                if (z) {
                    V(cVar, this.d0, 0, 0, false);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Fragment already added: " + cVar);
        }
    }

    public final void b0(Parcelable parcelable) {
        androidx.fragment.app.c cVar;
        androidx.fragment.app.c cVar2;
        Bundle bundle;
        sr srVar;
        String str;
        if (parcelable == null) {
            return;
        }
        qr qrVar = (qr) parcelable;
        if (qrVar.P == null) {
            return;
        }
        Iterator<androidx.fragment.app.c> it = this.s0.b.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.c next = it.next();
            Iterator<sr> it2 = qrVar.P.iterator();
            while (true) {
                if (it2.hasNext()) {
                    srVar = it2.next();
                    if (srVar.Q.equals(next.S)) {
                        break;
                    }
                } else {
                    srVar = null;
                    break;
                }
            }
            if (srVar == null) {
                V(next, 1, 0, 0, false);
                next.Z = true;
                V(next, 0, 0, 0, false);
            } else {
                srVar.c0 = next;
                next.R = null;
                next.e0 = 0;
                next.b0 = false;
                next.Y = false;
                androidx.fragment.app.c cVar3 = next.U;
                if (cVar3 != null) {
                    str = cVar3.S;
                } else {
                    str = null;
                }
                next.V = str;
                next.U = null;
                Bundle bundle2 = srVar.b0;
                if (bundle2 != null) {
                    bundle2.setClassLoader(this.e0.Q.getClassLoader());
                    next.R = srVar.b0.getSparseParcelableArray("android:view_state");
                    next.Q = srVar.b0;
                }
            }
        }
        this.V.clear();
        Iterator<sr> it3 = qrVar.P.iterator();
        while (it3.hasNext()) {
            sr next2 = it3.next();
            if (next2 != null) {
                ClassLoader classLoader = this.e0.Q.getClassLoader();
                androidx.fragment.app.d M = M();
                if (next2.c0 == null) {
                    Bundle bundle3 = next2.Y;
                    if (bundle3 != null) {
                        bundle3.setClassLoader(classLoader);
                    }
                    androidx.fragment.app.c a2 = M.a(classLoader, next2.P);
                    next2.c0 = a2;
                    Bundle bundle4 = next2.Y;
                    f fVar = a2.f0;
                    if (fVar != null && fVar.P()) {
                        throw new IllegalStateException("Fragment already added and state has been saved");
                    }
                    a2.T = bundle4;
                    Bundle bundle5 = next2.b0;
                    if (bundle5 != null) {
                        bundle5.setClassLoader(classLoader);
                        cVar2 = next2.c0;
                        bundle = next2.b0;
                    } else {
                        cVar2 = next2.c0;
                        bundle = new Bundle();
                    }
                    cVar2.Q = bundle;
                    androidx.fragment.app.c cVar4 = next2.c0;
                    cVar4.S = next2.Q;
                    cVar4.a0 = next2.R;
                    cVar4.c0 = true;
                    cVar4.j0 = next2.S;
                    cVar4.k0 = next2.T;
                    cVar4.l0 = next2.U;
                    cVar4.o0 = next2.V;
                    cVar4.Z = next2.W;
                    cVar4.n0 = next2.X;
                    cVar4.m0 = next2.Z;
                    cVar4.B0 = c.EnumC0007c.values()[next2.a0];
                }
                androidx.fragment.app.c cVar5 = next2.c0;
                cVar5.f0 = this;
                this.V.put(cVar5.S, cVar5);
                next2.c0 = null;
            }
        }
        this.U.clear();
        ArrayList<String> arrayList = qrVar.Q;
        if (arrayList != null) {
            Iterator<String> it4 = arrayList.iterator();
            while (it4.hasNext()) {
                String next3 = it4.next();
                androidx.fragment.app.c cVar6 = this.V.get(next3);
                if (cVar6 != null) {
                    cVar6.Y = true;
                    if (!this.U.contains(cVar6)) {
                        synchronized (this.U) {
                            this.U.add(cVar6);
                        }
                    } else {
                        throw new IllegalStateException("Already added " + cVar6);
                    }
                } else {
                    i0(new IllegalStateException(ij.c("No instantiated fragment for (", next3, ")")));
                    throw null;
                }
            }
        }
        if (qrVar.R != null) {
            this.W = new ArrayList<>(qrVar.R.length);
            int i2 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = qrVar.R;
                if (i2 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.b bVar = bVarArr[i2];
                bVar.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(this);
                int i3 = 0;
                int i4 = 0;
                while (i3 < bVar.P.length) {
                    i.a aVar2 = new i.a();
                    int i5 = i3 + 1;
                    aVar2.a = bVar.P[i3];
                    String str2 = bVar.Q.get(i4);
                    if (str2 != null) {
                        cVar = this.V.get(str2);
                    } else {
                        cVar = null;
                    }
                    aVar2.b = cVar;
                    aVar2.g = c.EnumC0007c.values()[bVar.R[i4]];
                    aVar2.h = c.EnumC0007c.values()[bVar.S[i4]];
                    int[] iArr = bVar.P;
                    int i6 = i5 + 1;
                    int i7 = iArr[i5];
                    aVar2.c = i7;
                    int i8 = i6 + 1;
                    int i9 = iArr[i6];
                    aVar2.d = i9;
                    int i10 = i8 + 1;
                    int i11 = iArr[i8];
                    aVar2.e = i11;
                    int i12 = iArr[i10];
                    aVar2.f = i12;
                    aVar.b = i7;
                    aVar.c = i9;
                    aVar.d = i11;
                    aVar.e = i12;
                    aVar.b(aVar2);
                    i4++;
                    i3 = i10 + 1;
                }
                aVar.f = bVar.T;
                aVar.g = bVar.U;
                aVar.i = bVar.V;
                aVar.s = bVar.W;
                aVar.h = true;
                aVar.j = bVar.X;
                aVar.k = bVar.Y;
                aVar.l = bVar.Z;
                aVar.m = bVar.a0;
                aVar.n = bVar.b0;
                aVar.o = bVar.c0;
                aVar.p = bVar.d0;
                aVar.c(1);
                this.W.add(aVar);
                int i13 = aVar.s;
                if (i13 >= 0) {
                    synchronized (this) {
                        if (this.a0 == null) {
                            this.a0 = new ArrayList<>();
                        }
                        int size = this.a0.size();
                        if (i13 < size) {
                            this.a0.set(i13, aVar);
                        } else {
                            while (size < i13) {
                                this.a0.add(null);
                                if (this.b0 == null) {
                                    this.b0 = new ArrayList<>();
                                }
                                this.b0.add(Integer.valueOf(size));
                                size++;
                            }
                            this.a0.add(aVar);
                        }
                    }
                }
                i2++;
            }
        } else {
            this.W = null;
        }
        String str3 = qrVar.S;
        if (str3 != null) {
            androidx.fragment.app.c cVar7 = this.V.get(str3);
            this.h0 = cVar7;
            B(cVar7);
        }
        this.T = qrVar.T;
    }

    public final void c(or orVar, z9 z9Var, androidx.fragment.app.c cVar) {
        rr rrVar;
        if (this.e0 == null) {
            this.e0 = orVar;
            this.f0 = z9Var;
            this.g0 = cVar;
            if (cVar != null) {
                j0();
            }
            if (orVar instanceof vb0) {
                vb0 vb0Var = (vb0) orVar;
                OnBackPressedDispatcher a2 = vb0Var.a();
                this.Y = a2;
                b10 b10Var = vb0Var;
                if (cVar != null) {
                    b10Var = cVar;
                }
                a2.a(b10Var, this.Z);
            }
            if (cVar != null) {
                rr rrVar2 = cVar.f0.s0;
                rr rrVar3 = rrVar2.c.get(cVar.S);
                if (rrVar3 == null) {
                    rrVar3 = new rr(rrVar2.e);
                    rrVar2.c.put(cVar.S, rrVar3);
                }
                this.s0 = rrVar3;
                return;
            }
            if (orVar instanceof p41) {
                rrVar = (rr) new n41(((p41) orVar).i(), rr.g).a(rr.class);
            } else {
                rrVar = new rr(false);
            }
            this.s0 = rrVar;
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public final qr c0() {
        androidx.fragment.app.b[] bVarArr;
        ArrayList<String> arrayList;
        int size;
        Bundle bundle;
        int i2;
        Iterator<androidx.fragment.app.c> it = this.V.values().iterator();
        while (true) {
            bVarArr = null;
            if (!it.hasNext()) {
                break;
            }
            androidx.fragment.app.c next = it.next();
            if (next != null) {
                if (next.g() != null) {
                    c.a aVar = next.w0;
                    if (aVar == null) {
                        i2 = 0;
                    } else {
                        i2 = aVar.c;
                    }
                    View g2 = next.g();
                    Animation animation = g2.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        g2.clearAnimation();
                    }
                    next.e().a = null;
                    V(next, i2, 0, 0, false);
                } else if (next.h() != null) {
                    next.h().end();
                }
            }
        }
        H();
        this.j0 = true;
        if (this.V.isEmpty()) {
            return null;
        }
        ArrayList<sr> arrayList2 = new ArrayList<>(this.V.size());
        boolean z = false;
        for (androidx.fragment.app.c cVar : this.V.values()) {
            if (cVar != null) {
                if (cVar.f0 == this) {
                    sr srVar = new sr(cVar);
                    arrayList2.add(srVar);
                    if (cVar.P > 0 && srVar.b0 == null) {
                        if (this.q0 == null) {
                            this.q0 = new Bundle();
                        }
                        Bundle bundle2 = this.q0;
                        cVar.x(bundle2);
                        cVar.F0.b(bundle2);
                        qr c0 = cVar.h0.c0();
                        if (c0 != null) {
                            bundle2.putParcelable("android:support:fragments", c0);
                        }
                        u(false);
                        if (!this.q0.isEmpty()) {
                            bundle = this.q0;
                            this.q0 = null;
                        } else {
                            bundle = null;
                        }
                        if (cVar.s0 != null) {
                            d0(cVar);
                        }
                        if (cVar.R != null) {
                            if (bundle == null) {
                                bundle = new Bundle();
                            }
                            bundle.putSparseParcelableArray("android:view_state", cVar.R);
                        }
                        if (!cVar.v0) {
                            if (bundle == null) {
                                bundle = new Bundle();
                            }
                            bundle.putBoolean("android:user_visible_hint", cVar.v0);
                        }
                        srVar.b0 = bundle;
                        String str = cVar.V;
                        if (str != null) {
                            androidx.fragment.app.c cVar2 = this.V.get(str);
                            if (cVar2 != null) {
                                if (srVar.b0 == null) {
                                    srVar.b0 = new Bundle();
                                }
                                Bundle bundle3 = srVar.b0;
                                if (cVar2.f0 == this) {
                                    bundle3.putString("android:target_state", cVar2.S);
                                    int i3 = cVar.W;
                                    if (i3 != 0) {
                                        srVar.b0.putInt("android:target_req_state", i3);
                                    }
                                } else {
                                    i0(new IllegalStateException("Fragment " + cVar2 + " is not currently in the FragmentManager"));
                                    throw null;
                                }
                            } else {
                                i0(new IllegalStateException("Failure saving state: " + cVar + " has target not in fragment manager: " + cVar.V));
                                throw null;
                            }
                        }
                    } else {
                        srVar.b0 = cVar.Q;
                    }
                    z = true;
                } else {
                    i0(new IllegalStateException("Failure saving state: active " + cVar + " was removed from the FragmentManager"));
                    throw null;
                }
            }
        }
        if (!z) {
            return null;
        }
        int size2 = this.U.size();
        if (size2 > 0) {
            arrayList = new ArrayList<>(size2);
            Iterator<androidx.fragment.app.c> it2 = this.U.iterator();
            while (it2.hasNext()) {
                androidx.fragment.app.c next2 = it2.next();
                arrayList.add(next2.S);
                if (next2.f0 != this) {
                    i0(new IllegalStateException("Failure saving state: active " + next2 + " was removed from the FragmentManager"));
                    throw null;
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList<androidx.fragment.app.a> arrayList3 = this.W;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            bVarArr = new androidx.fragment.app.b[size];
            for (int i4 = 0; i4 < size; i4++) {
                bVarArr[i4] = new androidx.fragment.app.b(this.W.get(i4));
            }
        }
        qr qrVar = new qr();
        qrVar.P = arrayList2;
        qrVar.Q = arrayList;
        qrVar.R = bVarArr;
        androidx.fragment.app.c cVar3 = this.h0;
        if (cVar3 != null) {
            qrVar.S = cVar3.S;
        }
        qrVar.T = this.T;
        return qrVar;
    }

    public final void d(androidx.fragment.app.c cVar) {
        if (cVar.n0) {
            cVar.n0 = false;
            if (cVar.Y) {
                return;
            }
            if (this.U.contains(cVar)) {
                throw new IllegalStateException("Fragment already added: " + cVar);
            }
            synchronized (this.U) {
                this.U.add(cVar);
            }
            cVar.Y = true;
            if (N(cVar)) {
                this.i0 = true;
            }
        }
    }

    public final void d0(androidx.fragment.app.c cVar) {
        if (cVar.t0 == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = this.r0;
        if (sparseArray == null) {
            this.r0 = new SparseArray<>();
        } else {
            sparseArray.clear();
        }
        cVar.t0.saveHierarchyState(this.r0);
        if (this.r0.size() > 0) {
            cVar.R = this.r0;
            this.r0 = null;
        }
    }

    public final void e() {
        this.S = false;
        this.o0.clear();
        this.n0.clear();
    }

    public final void e0() {
        synchronized (this) {
            boolean z = false;
            ArrayList<h> arrayList = this.R;
            if (arrayList != null && arrayList.size() == 1) {
                z = true;
            }
            if (z) {
                this.e0.R.removeCallbacks(this.t0);
                this.e0.R.post(this.t0);
                j0();
            }
        }
    }

    public final void f(androidx.fragment.app.a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.g(z3);
        } else {
            aVar.f();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            l.j(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            U(this.d0, true);
        }
        for (androidx.fragment.app.c cVar : this.V.values()) {
            if (cVar != null && cVar.s0 != null && cVar.x0 && aVar.h(cVar.k0)) {
                float f = cVar.z0;
                if (f > 0.0f) {
                    cVar.s0.setAlpha(f);
                }
                if (z3) {
                    cVar.z0 = 0.0f;
                } else {
                    cVar.z0 = -1.0f;
                    cVar.x0 = false;
                }
            }
        }
    }

    public final void f0(androidx.fragment.app.c cVar, c.EnumC0007c enumC0007c) {
        if (this.V.get(cVar.S) == cVar && (cVar.g0 == null || cVar.f0 == this)) {
            cVar.B0 = enumC0007c;
            return;
        }
        throw new IllegalArgumentException("Fragment " + cVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void g(androidx.fragment.app.c cVar) {
        if (cVar.n0) {
            return;
        }
        cVar.n0 = true;
        if (cVar.Y) {
            synchronized (this.U) {
                this.U.remove(cVar);
            }
            if (N(cVar)) {
                this.i0 = true;
            }
            cVar.Y = false;
        }
    }

    public final void g0(androidx.fragment.app.c cVar) {
        if (cVar != null && (this.V.get(cVar.S) != cVar || (cVar.g0 != null && cVar.f0 != this))) {
            throw new IllegalArgumentException("Fragment " + cVar + " is not an active fragment of FragmentManager " + this);
        }
        androidx.fragment.app.c cVar2 = this.h0;
        this.h0 = cVar;
        B(cVar2);
        B(this.h0);
    }

    public final void h() {
        for (int i2 = 0; i2 < this.U.size(); i2++) {
            androidx.fragment.app.c cVar = this.U.get(i2);
            if (cVar != null) {
                cVar.q0 = true;
                cVar.h0.h();
            }
        }
    }

    public final void h0() {
        for (androidx.fragment.app.c cVar : this.V.values()) {
            if (cVar != null && cVar.u0) {
                if (this.S) {
                    this.m0 = true;
                } else {
                    cVar.u0 = false;
                    V(cVar, this.d0, 0, 0, false);
                }
            }
        }
    }

    public final boolean i() {
        if (this.d0 < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.U.size(); i2++) {
            androidx.fragment.app.c cVar = this.U.get(i2);
            if (cVar != null) {
                if (!cVar.m0 && cVar.h0.i()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void i0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new x20());
        or orVar = this.e0;
        try {
            if (orVar != null) {
                orVar.j(printWriter, new String[0]);
            } else {
                E("  ", null, printWriter, new String[0]);
            }
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
        }
        throw runtimeException;
    }

    public final boolean j() {
        boolean z;
        if (this.d0 < 1) {
            return false;
        }
        ArrayList<androidx.fragment.app.c> arrayList = null;
        boolean z2 = false;
        for (int i2 = 0; i2 < this.U.size(); i2++) {
            androidx.fragment.app.c cVar = this.U.get(i2);
            if (cVar != null) {
                if (!cVar.m0) {
                    z = cVar.h0.j() | false;
                } else {
                    z = false;
                }
                if (z) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(cVar);
                    z2 = true;
                }
            }
        }
        if (this.X != null) {
            for (int i3 = 0; i3 < this.X.size(); i3++) {
                androidx.fragment.app.c cVar2 = this.X.get(i3);
                if (arrayList == null || !arrayList.contains(cVar2)) {
                    cVar2.getClass();
                }
            }
        }
        this.X = arrayList;
        return z2;
    }

    public final void j0() {
        int i2;
        ArrayList<h> arrayList = this.R;
        boolean z = true;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.Z.a = true;
            return;
        }
        a aVar = this.Z;
        ArrayList<androidx.fragment.app.a> arrayList2 = this.W;
        if (arrayList2 != null) {
            i2 = arrayList2.size();
        } else {
            i2 = 0;
        }
        aVar.a = (i2 <= 0 || !O(this.g0)) ? false : false;
    }

    public final void k() {
        this.l0 = true;
        H();
        D(0);
        this.e0 = null;
        this.f0 = null;
        this.g0 = null;
        if (this.Y != null) {
            Iterator<cc> it = this.Z.b.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.Y = null;
        }
    }

    public final void l(boolean z) {
        androidx.fragment.app.c cVar = this.g0;
        if (cVar != null) {
            f fVar = cVar.f0;
            if (fVar instanceof f) {
                fVar.l(true);
            }
        }
        Iterator<C0005f> it = this.c0.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            if (!z) {
                throw null;
            }
        }
    }

    public final void m(boolean z) {
        androidx.fragment.app.c cVar = this.g0;
        if (cVar != null) {
            f fVar = cVar.f0;
            if (fVar instanceof f) {
                fVar.m(true);
            }
        }
        Iterator<C0005f> it = this.c0.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            if (!z) {
                throw null;
            }
        }
    }

    public final void n(boolean z) {
        androidx.fragment.app.c cVar = this.g0;
        if (cVar != null) {
            f fVar = cVar.f0;
            if (fVar instanceof f) {
                fVar.n(true);
            }
        }
        Iterator<C0005f> it = this.c0.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            if (!z) {
                throw null;
            }
        }
    }

    public final void o(boolean z) {
        androidx.fragment.app.c cVar = this.g0;
        if (cVar != null) {
            f fVar = cVar.f0;
            if (fVar instanceof f) {
                fVar.o(true);
            }
        }
        Iterator<C0005f> it = this.c0.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            if (!z) {
                throw null;
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        androidx.fragment.app.c cVar;
        int i2;
        androidx.fragment.app.c next;
        Activity activity = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.a);
        int i3 = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (str2 != null) {
            ClassLoader classLoader = context.getClassLoader();
            try {
                os0<String, Class<?>> os0Var = androidx.fragment.app.d.a;
                Class<?> orDefault = os0Var.getOrDefault(str2, null);
                if (orDefault == null) {
                    orDefault = Class.forName(str2, false, classLoader);
                    os0Var.put(str2, orDefault);
                }
                z = androidx.fragment.app.c.class.isAssignableFrom(orDefault);
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (z) {
                if (view != null) {
                    i3 = view.getId();
                }
                if (i3 == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
                }
                if (resourceId != -1) {
                    cVar = K(resourceId);
                } else {
                    cVar = null;
                }
                if (cVar == null && string != null) {
                    int size = this.U.size();
                    while (true) {
                        size--;
                        if (size >= 0) {
                            next = this.U.get(size);
                            if (next != null && string.equals(next.l0)) {
                                break;
                            }
                        } else {
                            Iterator<androidx.fragment.app.c> it = this.V.values().iterator();
                            while (it.hasNext()) {
                                next = it.next();
                                if (next == null || !string.equals(next.l0)) {
                                }
                            }
                            cVar = null;
                        }
                    }
                    cVar = next;
                }
                if (cVar == null && i3 != -1) {
                    cVar = K(i3);
                }
                if (cVar == null) {
                    cVar = M().a(context.getClassLoader(), str2);
                    cVar.a0 = true;
                    if (resourceId != 0) {
                        i2 = resourceId;
                    } else {
                        i2 = i3;
                    }
                    cVar.j0 = i2;
                    cVar.k0 = i3;
                    cVar.l0 = string;
                    cVar.b0 = true;
                    cVar.f0 = this;
                    or orVar = this.e0;
                    cVar.g0 = orVar;
                    Context context2 = orVar.Q;
                    cVar.q0 = true;
                    if (orVar != null) {
                        activity = orVar.P;
                    }
                    if (activity != null) {
                        cVar.q0 = true;
                    }
                    b(cVar, true);
                } else if (!cVar.b0) {
                    cVar.b0 = true;
                    or orVar2 = this.e0;
                    cVar.g0 = orVar2;
                    Context context3 = orVar2.Q;
                    cVar.q0 = true;
                    if (orVar2 != null) {
                        activity = orVar2.P;
                    }
                    if (activity != null) {
                        cVar.q0 = true;
                    }
                } else {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i3) + " with another fragment for " + str2);
                }
                androidx.fragment.app.c cVar2 = cVar;
                int i4 = this.d0;
                if (i4 < 1 && cVar2.a0) {
                    V(cVar2, 1, 0, 0, false);
                } else {
                    V(cVar2, i4, 0, 0, false);
                }
                View view2 = cVar2.s0;
                if (view2 != null) {
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (cVar2.s0.getTag() == null) {
                        cVar2.s0.setTag(string);
                    }
                    return cVar2.s0;
                }
                throw new IllegalStateException(ij.c("Fragment ", str2, " did not create a view."));
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public final void p(boolean z) {
        androidx.fragment.app.c cVar = this.g0;
        if (cVar != null) {
            f fVar = cVar.f0;
            if (fVar instanceof f) {
                fVar.p(true);
            }
        }
        Iterator<C0005f> it = this.c0.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            if (!z) {
                throw null;
            }
        }
    }

    public final void q(boolean z) {
        androidx.fragment.app.c cVar = this.g0;
        if (cVar != null) {
            f fVar = cVar.f0;
            if (fVar instanceof f) {
                fVar.q(true);
            }
        }
        Iterator<C0005f> it = this.c0.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            if (!z) {
                throw null;
            }
        }
    }

    public final void r(boolean z) {
        androidx.fragment.app.c cVar = this.g0;
        if (cVar != null) {
            f fVar = cVar.f0;
            if (fVar instanceof f) {
                fVar.r(true);
            }
        }
        Iterator<C0005f> it = this.c0.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            if (!z) {
                throw null;
            }
        }
    }

    public final void s(boolean z) {
        androidx.fragment.app.c cVar = this.g0;
        if (cVar != null) {
            f fVar = cVar.f0;
            if (fVar instanceof f) {
                fVar.s(true);
            }
        }
        Iterator<C0005f> it = this.c0.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            if (!z) {
                throw null;
            }
        }
    }

    public final void t(boolean z) {
        androidx.fragment.app.c cVar = this.g0;
        if (cVar != null) {
            f fVar = cVar.f0;
            if (fVar instanceof f) {
                fVar.t(true);
            }
        }
        Iterator<C0005f> it = this.c0.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            if (!z) {
                throw null;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.g0;
        if (obj == null) {
            obj = this.e0;
        }
        vj.g(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    public final void u(boolean z) {
        androidx.fragment.app.c cVar = this.g0;
        if (cVar != null) {
            f fVar = cVar.f0;
            if (fVar instanceof f) {
                fVar.u(true);
            }
        }
        Iterator<C0005f> it = this.c0.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            if (!z) {
                throw null;
            }
        }
    }

    public final void v(boolean z) {
        androidx.fragment.app.c cVar = this.g0;
        if (cVar != null) {
            f fVar = cVar.f0;
            if (fVar instanceof f) {
                fVar.v(true);
            }
        }
        Iterator<C0005f> it = this.c0.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            if (!z) {
                throw null;
            }
        }
    }

    public final void w(boolean z) {
        androidx.fragment.app.c cVar = this.g0;
        if (cVar != null) {
            f fVar = cVar.f0;
            if (fVar instanceof f) {
                fVar.w(true);
            }
        }
        Iterator<C0005f> it = this.c0.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            if (!z) {
                throw null;
            }
        }
    }

    public final void x(boolean z) {
        androidx.fragment.app.c cVar = this.g0;
        if (cVar != null) {
            f fVar = cVar.f0;
            if (fVar instanceof f) {
                fVar.x(true);
            }
        }
        Iterator<C0005f> it = this.c0.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            if (!z) {
                throw null;
            }
        }
    }

    public final void y(boolean z) {
        androidx.fragment.app.c cVar = this.g0;
        if (cVar != null) {
            f fVar = cVar.f0;
            if (fVar instanceof f) {
                fVar.y(true);
            }
        }
        Iterator<C0005f> it = this.c0.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            if (!z) {
                throw null;
            }
        }
    }

    public final boolean z() {
        if (this.d0 < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.U.size(); i2++) {
            androidx.fragment.app.c cVar = this.U.get(i2);
            if (cVar != null) {
                if (!cVar.m0 && cVar.h0.z()) {
                    return true;
                }
            }
        }
        return false;
    }
}