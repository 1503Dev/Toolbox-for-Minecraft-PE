package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: g01  reason: default package */
public final class g01 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static g01 Y;
    public static g01 Z;
    public final View P;
    public final CharSequence Q;
    public final int R;
    public final a S = new a();
    public final b T = new b();
    public int U;
    public int V;
    public h01 W;
    public boolean X;

    /* renamed from: g01$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g01.this.c(false);
        }
    }

    /* renamed from: g01$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g01.this.a();
        }
    }

    public g01(CharSequence charSequence, View view) {
        int scaledTouchSlop;
        this.P = view;
        this.Q = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = e41.a;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = viewConfiguration.getScaledHoverSlop();
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.R = scaledTouchSlop;
        this.U = Integer.MAX_VALUE;
        this.V = Integer.MAX_VALUE;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(g01 g01Var) {
        g01 g01Var2 = Y;
        if (g01Var2 != null) {
            g01Var2.P.removeCallbacks(g01Var2.S);
        }
        Y = g01Var;
        if (g01Var != null) {
            g01Var.P.postDelayed(g01Var.S, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        boolean z;
        if (Z == this) {
            Z = null;
            h01 h01Var = this.W;
            if (h01Var != null) {
                if (h01Var.b.getParent() != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    ((WindowManager) h01Var.a.getSystemService("window")).removeView(h01Var.b);
                }
                this.W = null;
                this.U = Integer.MAX_VALUE;
                this.V = Integer.MAX_VALUE;
                this.P.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (Y == this) {
            b(null);
        }
        this.P.removeCallbacks(this.T);
    }

    public final void c(boolean z) {
        boolean z2;
        int height;
        int i;
        int i2;
        int i3;
        long j;
        long longPressTimeout;
        boolean z3;
        View view = this.P;
        WeakHashMap<View, String> weakHashMap = a41.a;
        if (!view.isAttachedToWindow()) {
            return;
        }
        b(null);
        g01 g01Var = Z;
        if (g01Var != null) {
            g01Var.a();
        }
        Z = this;
        this.X = z;
        h01 h01Var = new h01(this.P.getContext());
        this.W = h01Var;
        View view2 = this.P;
        int i4 = this.U;
        int i5 = this.V;
        boolean z4 = this.X;
        CharSequence charSequence = this.Q;
        if (h01Var.b.getParent() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (h01Var.b.getParent() != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                ((WindowManager) h01Var.a.getSystemService("window")).removeView(h01Var.b);
            }
        }
        h01Var.c.setText(charSequence);
        WindowManager.LayoutParams layoutParams = h01Var.d;
        layoutParams.token = view2.getApplicationWindowToken();
        int dimensionPixelOffset = h01Var.a.getResources().getDimensionPixelOffset(sh0.tooltip_precise_anchor_threshold);
        if (view2.getWidth() < dimensionPixelOffset) {
            i4 = view2.getWidth() / 2;
        }
        if (view2.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = h01Var.a.getResources().getDimensionPixelOffset(sh0.tooltip_precise_anchor_extra_offset);
            height = i5 + dimensionPixelOffset2;
            i = i5 - dimensionPixelOffset2;
        } else {
            height = view2.getHeight();
            i = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = h01Var.a.getResources();
        if (z4) {
            i2 = sh0.tooltip_y_offset_touch;
        } else {
            i2 = sh0.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i2);
        View rootView = view2.getRootView();
        ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
        if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
            Context context = view2.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof Activity) {
                    rootView = ((Activity) context).getWindow().getDecorView();
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
        }
        if (rootView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
        } else {
            rootView.getWindowVisibleDisplayFrame(h01Var.e);
            Rect rect = h01Var.e;
            if (rect.left < 0 && rect.top < 0) {
                Resources resources2 = h01Var.a.getResources();
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i3 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i3 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                h01Var.e.set(0, i3, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            rootView.getLocationOnScreen(h01Var.g);
            view2.getLocationOnScreen(h01Var.f);
            int[] iArr = h01Var.f;
            int i6 = iArr[0];
            int[] iArr2 = h01Var.g;
            int i7 = i6 - iArr2[0];
            iArr[0] = i7;
            iArr[1] = iArr[1] - iArr2[1];
            layoutParams.x = (i7 + i4) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            h01Var.b.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = h01Var.b.getMeasuredHeight();
            int i8 = h01Var.f[1];
            int i9 = ((i + i8) - dimensionPixelOffset3) - measuredHeight;
            int i10 = i8 + height + dimensionPixelOffset3;
            if (!z4 ? measuredHeight + i10 <= h01Var.e.height() : i9 < 0) {
                layoutParams.y = i10;
            } else {
                layoutParams.y = i9;
            }
        }
        ((WindowManager) h01Var.a.getSystemService("window")).addView(h01Var.b, h01Var.d);
        this.P.addOnAttachStateChangeListener(this);
        if (this.X) {
            longPressTimeout = 2500;
        } else {
            if ((this.P.getWindowSystemUiVisibility() & 1) == 1) {
                j = 3000;
            } else {
                j = 15000;
            }
            longPressTimeout = j - ViewConfiguration.getLongPressTimeout();
        }
        this.P.removeCallbacks(this.T);
        this.P.postDelayed(this.T, longPressTimeout);
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        boolean z;
        if (this.W != null && this.X) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.P.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.U = Integer.MAX_VALUE;
                this.V = Integer.MAX_VALUE;
                a();
            }
        } else if (this.P.isEnabled() && this.W == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(x - this.U) <= this.R && Math.abs(y - this.V) <= this.R) {
                z = false;
            } else {
                this.U = x;
                this.V = y;
                z = true;
            }
            if (z) {
                b(this);
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.U = view.getWidth() / 2;
        this.V = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}