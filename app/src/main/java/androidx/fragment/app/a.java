package androidx.fragment.app;

import android.view.animation.DecelerateInterpolator;
import androidx.fragment.app.c;
import androidx.fragment.app.f;
import androidx.fragment.app.i;
import java.io.PrintWriter;
import java.util.ArrayList;

public final class a extends i implements f.h {
    public final f q;
    public boolean r;
    public int s = -1;

    public a(f fVar) {
        this.q = fVar;
    }

    @Override // androidx.fragment.app.f.h
    public final boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        DecelerateInterpolator decelerateInterpolator = f.u0;
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.h) {
            f fVar = this.q;
            if (fVar.W == null) {
                fVar.W = new ArrayList<>();
            }
            fVar.W.add(this);
            return true;
        }
        return true;
    }

    public final void c(int i) {
        if (this.h) {
            DecelerateInterpolator decelerateInterpolator = f.u0;
            int size = this.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                c cVar = this.a.get(i2).b;
                if (cVar != null) {
                    cVar.e0 += i;
                    DecelerateInterpolator decelerateInterpolator2 = f.u0;
                }
            }
        }
    }

    public final int d(boolean z) {
        if (!this.r) {
            DecelerateInterpolator decelerateInterpolator = f.u0;
            this.r = true;
            int i = -1;
            if (this.h) {
                f fVar = this.q;
                synchronized (fVar) {
                    ArrayList<Integer> arrayList = fVar.b0;
                    if (arrayList != null && arrayList.size() > 0) {
                        ArrayList<Integer> arrayList2 = fVar.b0;
                        i = arrayList2.remove(arrayList2.size() - 1).intValue();
                        fVar.a0.set(i, this);
                    }
                    if (fVar.a0 == null) {
                        fVar.a0 = new ArrayList<>();
                    }
                    i = fVar.a0.size();
                    fVar.a0.add(this);
                }
            }
            this.s = i;
            this.q.F(this, z);
            return this.s;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void e(String str, PrintWriter printWriter) {
        String str2;
        printWriter.print(str);
        printWriter.print("mName=");
        printWriter.print(this.i);
        printWriter.print(" mIndex=");
        printWriter.print(this.s);
        printWriter.print(" mCommitted=");
        printWriter.println(this.r);
        if (this.f != 0) {
            printWriter.print(str);
            printWriter.print("mTransition=#");
            printWriter.print(Integer.toHexString(this.f));
            printWriter.print(" mTransitionStyle=#");
            printWriter.println(Integer.toHexString(this.g));
        }
        if (this.b != 0 || this.c != 0) {
            printWriter.print(str);
            printWriter.print("mEnterAnim=#");
            printWriter.print(Integer.toHexString(this.b));
            printWriter.print(" mExitAnim=#");
            printWriter.println(Integer.toHexString(this.c));
        }
        if (this.d != 0 || this.e != 0) {
            printWriter.print(str);
            printWriter.print("mPopEnterAnim=#");
            printWriter.print(Integer.toHexString(this.d));
            printWriter.print(" mPopExitAnim=#");
            printWriter.println(Integer.toHexString(this.e));
        }
        if (this.j != 0 || this.k != null) {
            printWriter.print(str);
            printWriter.print("mBreadCrumbTitleRes=#");
            printWriter.print(Integer.toHexString(this.j));
            printWriter.print(" mBreadCrumbTitleText=");
            printWriter.println(this.k);
        }
        if (this.l != 0 || this.m != null) {
            printWriter.print(str);
            printWriter.print("mBreadCrumbShortTitleRes=#");
            printWriter.print(Integer.toHexString(this.l));
            printWriter.print(" mBreadCrumbShortTitleText=");
            printWriter.println(this.m);
        }
        if (!this.a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                i.a aVar = this.a.get(i);
                switch (aVar.a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder b = e5.b("cmd=");
                        b.append(aVar.a);
                        str2 = b.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.b);
                if (aVar.c != 0 || aVar.d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.d));
                }
                if (aVar.e != 0 || aVar.f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f));
                }
            }
        }
    }

    public final void f() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            i.a aVar = this.a.get(i);
            c cVar = aVar.b;
            if (cVar != null) {
                int i2 = this.f;
                int i3 = this.g;
                if (cVar.w0 != null || i2 != 0 || i3 != 0) {
                    cVar.e();
                    c.a aVar2 = cVar.w0;
                    aVar2.e = i2;
                    aVar2.f = i3;
                }
            }
            switch (aVar.a) {
                case 1:
                    cVar.H(aVar.c);
                    this.q.b(cVar, false);
                    break;
                case 2:
                default:
                    StringBuilder b = e5.b("Unknown cmd: ");
                    b.append(aVar.a);
                    throw new IllegalArgumentException(b.toString());
                case 3:
                    cVar.H(aVar.d);
                    this.q.Z(cVar);
                    break;
                case 4:
                    cVar.H(aVar.d);
                    this.q.getClass();
                    if (!cVar.m0) {
                        cVar.m0 = true;
                        cVar.y0 = !cVar.y0;
                        break;
                    }
                    break;
                case 5:
                    cVar.H(aVar.c);
                    this.q.getClass();
                    if (cVar.m0) {
                        cVar.m0 = false;
                        cVar.y0 = !cVar.y0;
                        break;
                    }
                    break;
                case 6:
                    cVar.H(aVar.d);
                    this.q.g(cVar);
                    break;
                case 7:
                    cVar.H(aVar.c);
                    this.q.d(cVar);
                    break;
                case 8:
                    this.q.g0(cVar);
                    break;
                case 9:
                    this.q.g0(null);
                    break;
                case 10:
                    this.q.f0(cVar, aVar.h);
                    break;
            }
            if (!this.p && aVar.a != 1 && cVar != null) {
                this.q.T(cVar);
            }
        }
        if (!this.p) {
            f fVar = this.q;
            fVar.U(fVar.d0, true);
        }
    }

    public final void g(boolean z) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            i.a aVar = this.a.get(size);
            c cVar = aVar.b;
            if (cVar != null) {
                int i = this.f;
                DecelerateInterpolator decelerateInterpolator = f.u0;
                int i2 = 8194;
                if (i != 4097) {
                    if (i != 4099) {
                        if (i != 8194) {
                            i2 = 0;
                        } else {
                            i2 = 4097;
                        }
                    } else {
                        i2 = 4099;
                    }
                }
                int i3 = this.g;
                if (cVar.w0 != null || i2 != 0 || i3 != 0) {
                    cVar.e();
                    c.a aVar2 = cVar.w0;
                    aVar2.e = i2;
                    aVar2.f = i3;
                }
            }
            switch (aVar.a) {
                case 1:
                    cVar.H(aVar.f);
                    this.q.Z(cVar);
                    break;
                case 2:
                default:
                    StringBuilder b = e5.b("Unknown cmd: ");
                    b.append(aVar.a);
                    throw new IllegalArgumentException(b.toString());
                case 3:
                    cVar.H(aVar.e);
                    this.q.b(cVar, false);
                    break;
                case 4:
                    cVar.H(aVar.e);
                    this.q.getClass();
                    if (cVar.m0) {
                        cVar.m0 = false;
                        cVar.y0 = !cVar.y0;
                        break;
                    }
                    break;
                case 5:
                    cVar.H(aVar.f);
                    this.q.getClass();
                    if (!cVar.m0) {
                        cVar.m0 = true;
                        cVar.y0 = !cVar.y0;
                        break;
                    }
                    break;
                case 6:
                    cVar.H(aVar.e);
                    this.q.d(cVar);
                    break;
                case 7:
                    cVar.H(aVar.f);
                    this.q.g(cVar);
                    break;
                case 8:
                    this.q.g0(null);
                    break;
                case 9:
                    this.q.g0(cVar);
                    break;
                case 10:
                    this.q.f0(cVar, aVar.g);
                    break;
            }
            if (!this.p && aVar.a != 3 && cVar != null) {
                this.q.T(cVar);
            }
        }
        if (!this.p && z) {
            f fVar = this.q;
            fVar.U(fVar.d0, true);
        }
    }

    public final boolean h(int i) {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            c cVar = this.a.get(i2).b;
            int i3 = cVar != null ? cVar.k0 : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(ArrayList<a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            c cVar = this.a.get(i4).b;
            int i5 = cVar != null ? cVar.k0 : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    a aVar = arrayList.get(i6);
                    int size2 = aVar.a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        c cVar2 = aVar.a.get(i7).b;
                        if ((cVar2 != null ? cVar2.k0 : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            sb.append(" #");
            sb.append(this.s);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }
}