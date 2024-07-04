package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

/* renamed from: wm  reason: default package */
public class wm extends ListView {
    public final Rect P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public Field V;
    public a W;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public g20 d0;
    public b e0;

    /* renamed from: wm$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends vm {
        public boolean Q;

        public a(Drawable drawable) {
            super(drawable);
            this.Q = true;
        }

        @Override // defpackage.vm, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            if (this.Q) {
                super.draw(canvas);
            }
        }

        @Override // defpackage.vm, android.graphics.drawable.Drawable
        public final void setHotspot(float f, float f2) {
            if (this.Q) {
                super.setHotspot(f, f2);
            }
        }

        @Override // defpackage.vm, android.graphics.drawable.Drawable
        public final void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.Q) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // defpackage.vm, android.graphics.drawable.Drawable
        public final boolean setState(int[] iArr) {
            if (this.Q) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // defpackage.vm, android.graphics.drawable.Drawable
        public final boolean setVisible(boolean z, boolean z2) {
            if (this.Q) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: wm$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            wm wmVar = wm.this;
            wmVar.e0 = null;
            wmVar.drawableStateChanged();
        }
    }

    public wm(Context context, boolean z) {
        super(context, null, ih0.dropDownListViewStyle);
        this.P = new Rect();
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.b0 = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.V = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z) {
        a aVar = this.W;
        if (aVar != null) {
            aVar.Q = z;
        }
    }

    public final int a(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i3 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i3;
        }
        dividerHeight = (dividerHeight <= 0 || divider == null) ? 0 : 0;
        int count = adapter.getCount();
        View view = null;
        int i4 = 0;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = adapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = adapter.getView(i5, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i6 = layoutParams.height;
            view.measure(i, i6 > 0 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i5 > 0) {
                i3 += dividerHeight;
            }
            i3 += view.getMeasuredHeight();
            if (i3 >= i2) {
                return i2;
            }
        }
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r3 != 3) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z5 = true;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z = true;
            }
        } else {
            z = false;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex >= 0) {
            int x = (int) motionEvent.getX(findPointerIndex);
            int y = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x, y);
            if (pointToPosition != -1) {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.c0 = true;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 21) {
                    drawableHotspotChanged(f, f2);
                }
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i3 = this.U;
                if (i3 != -1 && (childAt = getChildAt(i3 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.U = pointToPosition;
                float left = f - childAt3.getLeft();
                float top = f2 - childAt3.getTop();
                if (i2 >= 21) {
                    dg.c(childAt3, left, top);
                }
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                if (selector != null && pointToPosition != -1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    selector.setVisible(false, false);
                }
                Rect rect = this.P;
                rect.set(childAt3.getLeft(), childAt3.getTop(), childAt3.getRight(), childAt3.getBottom());
                rect.left -= this.Q;
                rect.top -= this.R;
                rect.right += this.S;
                rect.bottom += this.T;
                try {
                    boolean z6 = this.V.getBoolean(this);
                    if (childAt3.isEnabled() != z6) {
                        Field field = this.V;
                        if (!z6) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        field.set(this, Boolean.valueOf(z4));
                        if (pointToPosition != -1) {
                            refreshDrawableState();
                        }
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                if (z2) {
                    Rect rect2 = this.P;
                    float exactCenterX = rect2.exactCenterX();
                    float exactCenterY = rect2.exactCenterY();
                    if (getVisibility() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    selector.setVisible(z3, false);
                    km.c(selector, exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    km.c(selector2, f, f2);
                }
                setSelectorEnabled(false);
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z = true;
                z5 = false;
            }
            if (z || z5) {
                this.c0 = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.U - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            if (!z) {
                if (this.d0 == null) {
                    this.d0 = new g20(this);
                }
                g20 g20Var = this.d0;
                boolean z7 = g20Var.e0;
                g20Var.e0 = true;
                g20Var.onTouch(this, motionEvent);
            } else {
                g20 g20Var2 = this.d0;
                if (g20Var2 != null) {
                    if (g20Var2.e0) {
                        g20Var2.d();
                    }
                    g20Var2.e0 = false;
                }
            }
            return z;
        }
        z = false;
        z5 = false;
        if (z) {
        }
        this.c0 = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.U - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (!z) {
        }
        return z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.P.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.P);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.e0 != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        Drawable selector = getSelector();
        if (selector != null && this.c0 && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.b0 || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.b0 || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.b0 || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.b0 && this.a0) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.e0 = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.e0 == null) {
            b bVar = new b();
            this.e0 = bVar;
            post(bVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
        } else {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                Drawable selector = getSelector();
                if (selector != null && this.c0 && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.U = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.e0;
        if (bVar != null) {
            wm wmVar = wm.this;
            wmVar.e0 = null;
            wmVar.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.a0 = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.W = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.Q = rect.left;
        this.R = rect.top;
        this.S = rect.right;
        this.T = rect.bottom;
    }
}