package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: f70  reason: default package */
public final class f70 extends FrameLayout {
    @NotOnlyInitialized
    public final FrameLayout P;
    @NotOnlyInitialized
    public final ed2 Q;

    public f70(Context context) {
        super(context);
        ed2 ed2Var;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.P = frameLayout;
        if (isInEditMode()) {
            ed2Var = null;
        } else {
            t42 t42Var = n62.f.b;
            Context context2 = frameLayout.getContext();
            t42Var.getClass();
            ed2Var = (ed2) new z02(t42Var, this, frameLayout, context2).d(context2, false);
        }
        this.Q = ed2Var;
    }

    public final View a(String str) {
        ed2 ed2Var = this.Q;
        if (ed2Var != null) {
            try {
                hw z = ed2Var.z(str);
                if (z != null) {
                    return (View) va0.c0(z);
                }
                return null;
            } catch (RemoteException e) {
                sv2.e("Unable to call getAssetView on delegate", e);
                return null;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.P);
    }

    public final /* synthetic */ void b(d50 d50Var) {
        ed2 ed2Var = this.Q;
        if (ed2Var == null) {
            return;
        }
        try {
            if (d50Var instanceof nb4) {
                ((nb4) d50Var).getClass();
                ed2Var.p2(null);
            } else if (d50Var == null) {
                ed2Var.p2(null);
            } else {
                sv2.b("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e) {
            sv2.e("Unable to call setMediaContent on delegate", e);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.P;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public final void c(View view, String str) {
        ed2 ed2Var = this.Q;
        if (ed2Var != null) {
            try {
                ed2Var.K0(new va0(view), str);
            } catch (RemoteException e) {
                sv2.e("Unable to call setAssetView on delegate", e);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.Q != null) {
            if (((Boolean) w82.d.c.a(x92.T8)).booleanValue()) {
                try {
                    this.Q.b1(new va0(motionEvent));
                } catch (RemoteException e) {
                    sv2.e("Unable to call handleTouchEvent on delegate", e);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public q1 getAdChoicesView() {
        View a = a("3011");
        if (a instanceof q1) {
            return (q1) a;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return a("3005");
    }

    public final View getBodyView() {
        return a("3004");
    }

    public final View getCallToActionView() {
        return a("3002");
    }

    public final View getHeadlineView() {
        return a("3001");
    }

    public final View getIconView() {
        return a("3003");
    }

    public final View getImageView() {
        return a("3008");
    }

    public final f50 getMediaView() {
        View a = a("3010");
        if (a instanceof f50) {
            return (f50) a;
        }
        if (a != null) {
            sv2.b("View is not an instance of MediaView");
            return null;
        }
        return null;
    }

    public final View getPriceView() {
        return a("3007");
    }

    public final View getStarRatingView() {
        return a("3009");
    }

    public final View getStoreView() {
        return a("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        ed2 ed2Var = this.Q;
        if (ed2Var != null) {
            try {
                ed2Var.B0(new va0(view), i);
            } catch (RemoteException e) {
                sv2.e("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        addView(this.P);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.P == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(q1 q1Var) {
        c(q1Var, "3011");
    }

    public final void setAdvertiserView(View view) {
        c(view, "3005");
    }

    public final void setBodyView(View view) {
        c(view, "3004");
    }

    public final void setCallToActionView(View view) {
        c(view, "3002");
    }

    public final void setClickConfirmingView(View view) {
        ed2 ed2Var = this.Q;
        if (ed2Var != null) {
            try {
                ed2Var.X1(new va0(view));
            } catch (RemoteException e) {
                sv2.e("Unable to call setClickConfirmingView on delegate", e);
            }
        }
    }

    public final void setHeadlineView(View view) {
        c(view, "3001");
    }

    public final void setIconView(View view) {
        c(view, "3003");
    }

    public final void setImageView(View view) {
        c(view, "3008");
    }

    public final void setMediaView(f50 f50Var) {
        c(f50Var, "3010");
        if (f50Var == null) {
            return;
        }
        s82 s82Var = new s82(0, this);
        synchronized (f50Var) {
            f50Var.T = s82Var;
            if (f50Var.Q) {
                b(f50Var.P);
            }
        }
        d60 d60Var = new d60(1, this);
        synchronized (f50Var) {
            f50Var.U = d60Var;
            if (f50Var.S) {
                ImageView.ScaleType scaleType = f50Var.R;
                ed2 ed2Var = ((f70) d60Var.Q).Q;
                if (ed2Var != null && scaleType != null) {
                    try {
                        ed2Var.N3(new va0(scaleType));
                    } catch (RemoteException e) {
                        sv2.e("Unable to call setMediaViewImageScaleType on delegate", e);
                    }
                }
            }
        }
    }

    public void setNativeAd(b70 b70Var) {
        ed2 ed2Var = this.Q;
        if (ed2Var != null) {
            try {
                ed2Var.z2(b70Var.d());
            } catch (RemoteException e) {
                sv2.e("Unable to call setNativeAd on delegate", e);
            }
        }
    }

    public final void setPriceView(View view) {
        c(view, "3007");
    }

    public final void setStarRatingView(View view) {
        c(view, "3009");
    }

    public final void setStoreView(View view) {
        c(view, "3006");
    }
}