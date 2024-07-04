package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.f;

public final class ExpandedMenuView extends ListView implements f.b, l, AdapterView.OnItemClickListener {
    public static final int[] Q = {16842964, 16843049};
    public f P;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Drawable drawable;
        int resourceId;
        Drawable drawable2;
        int resourceId2;
        setOnItemClickListener(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q, 16842868, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            if (obtainStyledAttributes.hasValue(0) && (resourceId2 = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                drawable2 = z5.b(context, resourceId2);
            } else {
                drawable2 = obtainStyledAttributes.getDrawable(0);
            }
            setBackgroundDrawable(drawable2);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            if (obtainStyledAttributes.hasValue(1) && (resourceId = obtainStyledAttributes.getResourceId(1, 0)) != 0) {
                drawable = z5.b(context, resourceId);
            } else {
                drawable = obtainStyledAttributes.getDrawable(1);
            }
            setDivider(drawable);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.appcompat.view.menu.f.b
    public final boolean a(h hVar) {
        return this.P.q(hVar, null, 0);
    }

    @Override // androidx.appcompat.view.menu.l
    public final void b(f fVar) {
        this.P = fVar;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((h) getAdapter().getItem(i));
    }
}