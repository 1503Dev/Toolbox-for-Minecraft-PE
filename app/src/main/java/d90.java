package defpackage;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;

/* renamed from: d90  reason: default package */
public final class d90 {
    public ViewParent a;
    public ViewParent b;
    public final View c;
    public boolean d;
    public int[] e;

    public d90(View view) {
        this.c = view;
    }

    public final boolean a(float f, float f2, boolean z) {
        ViewParent f3;
        if (!this.d || (f3 = f(0)) == null) {
            return false;
        }
        View view = this.c;
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return h4.f(f3, view, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + f3 + " does not implement interface method onNestedFling", e);
                return false;
            }
        } else if (!(f3 instanceof g90)) {
            return false;
        } else {
            return ((g90) f3).onNestedFling(view, f, f2, z);
        }
    }

    public final boolean b(float f, float f2) {
        ViewParent f3;
        boolean onNestedPreFling;
        if (!this.d || (f3 = f(0)) == null) {
            return false;
        }
        View view = this.c;
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                onNestedPreFling = f3.onNestedPreFling(view, f, f2);
                return onNestedPreFling;
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + f3 + " does not implement interface method onNestedPreFling", e);
                return false;
            }
        } else if (!(f3 instanceof g90)) {
            return false;
        } else {
            return ((g90) f3).onNestedPreFling(view, f, f2);
        }
    }

    public final boolean c(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent f;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.d || (f = f(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        } else {
            if (iArr2 != null) {
                this.c.getLocationInWindow(iArr2);
                i4 = iArr2[0];
                i5 = iArr2[1];
            } else {
                i4 = 0;
                i5 = 0;
            }
            if (iArr == null) {
                if (this.e == null) {
                    this.e = new int[2];
                }
                iArr3 = this.e;
            } else {
                iArr3 = iArr;
            }
            iArr3[0] = 0;
            iArr3[1] = 0;
            View view = this.c;
            if (f instanceof e90) {
                ((e90) f).j(view, i, i2, iArr3, i3);
            } else if (i3 == 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        n0.b(f, view, i, i2, iArr3);
                    } catch (AbstractMethodError e) {
                        Log.e("ViewParentCompat", "ViewParent " + f + " does not implement interface method onNestedPreScroll", e);
                    }
                } else if (f instanceof g90) {
                    ((g90) f).onNestedPreScroll(view, i, i2, iArr3);
                }
            }
            if (iArr2 != null) {
                this.c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i4;
                iArr2[1] = iArr2[1] - i5;
            }
            if (iArr3[0] != 0 || iArr3[1] != 0) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i, int i2, int i3, int[] iArr) {
        e(0, i, 0, i2, null, i3, iArr);
    }

    public final boolean e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent f;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.d || (f = f(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.c.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            int[] iArr4 = this.e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view = this.c;
        if (f instanceof f90) {
            ((f90) f).m(view, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (f instanceof e90) {
                ((e90) f).n(view, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        ra0.b(f, view, i, i2, i3, i4);
                    } catch (AbstractMethodError e) {
                        Log.e("ViewParentCompat", "ViewParent " + f + " does not implement interface method onNestedScroll", e);
                    }
                } else if (f instanceof g90) {
                    ((g90) f).onNestedScroll(view, i, i2, i3, i4);
                }
            }
        }
        if (iArr != null) {
            this.c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    public final ViewParent f(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return this.b;
        }
        return this.a;
    }

    public final void g(boolean z) {
        if (this.d) {
            View view = this.c;
            WeakHashMap<View, String> weakHashMap = a41.a;
            if (Build.VERSION.SDK_INT >= 21) {
                n0.a(view);
            } else if (view instanceof c90) {
                ((c90) view).stopNestedScroll();
            }
        }
        this.d = z;
    }

    public final boolean h(int i, int i2) {
        boolean z;
        boolean z2;
        if (f(i2) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        if (this.d) {
            View view = this.c;
            for (ViewParent parent = this.c.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.c;
                boolean z3 = parent instanceof e90;
                if (z3) {
                    z2 = ((e90) parent).o(view, view2, i, i2);
                } else {
                    if (i2 == 0) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            try {
                                z2 = fc.d(parent, view, view2, i);
                            } catch (AbstractMethodError e) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                            }
                        } else if (parent instanceof g90) {
                            z2 = ((g90) parent).onStartNestedScroll(view, view2, i);
                        }
                    }
                    z2 = false;
                }
                if (z2) {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            this.b = parent;
                        }
                    } else {
                        this.a = parent;
                    }
                    View view3 = this.c;
                    if (z3) {
                        ((e90) parent).h(view, view3, i, i2);
                    } else if (i2 == 0) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            try {
                                parent.onNestedScrollAccepted(view, view3, i);
                            } catch (AbstractMethodError e2) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                            }
                        } else if (parent instanceof g90) {
                            ((g90) parent).onNestedScrollAccepted(view, view3, i);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public final void i(int i) {
        ViewParent f = f(i);
        if (f != null) {
            View view = this.c;
            if (f instanceof e90) {
                ((e90) f).i(view, i);
            } else if (i == 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        dc.b(f, view);
                    } catch (AbstractMethodError e) {
                        Log.e("ViewParentCompat", "ViewParent " + f + " does not implement interface method onStopNestedScroll", e);
                    }
                } else if (f instanceof g90) {
                    ((g90) f).onStopNestedScroll(view);
                }
            }
            if (i != 0) {
                if (i == 1) {
                    this.b = null;
                    return;
                }
                return;
            }
            this.a = null;
        }
    }
}