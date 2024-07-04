package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {
    public int P;
    public int Q;
    public WeakReference<View> R;
    public LayoutInflater S;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
        void a();
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.P = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lj0.ViewStubCompat, 0, 0);
        this.Q = obtainStyledAttributes.getResourceId(lj0.ViewStubCompat_android_inflatedId, -1);
        this.P = obtainStyledAttributes.getResourceId(lj0.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(lj0.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.P != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.S;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                View inflate = layoutInflater.inflate(this.P, viewGroup, false);
                int i = this.Q;
                if (i != -1) {
                    inflate.setId(i);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.R = new WeakReference<>(inflate);
                return inflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.Q;
    }

    public LayoutInflater getLayoutInflater() {
        return this.S;
    }

    public int getLayoutResource() {
        return this.P;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.Q = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.S = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.P = i;
    }

    public void setOnInflateListener(a aVar) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.R;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            a();
        }
    }
}