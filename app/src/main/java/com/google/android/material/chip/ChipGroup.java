package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;

public class ChipGroup extends nq {
    public int S;
    public int T;
    public boolean U;
    public final a V;
    public d W;
    public int a0;
    public boolean b0;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (ChipGroup.this.b0) {
                return;
            }
            int id = compoundButton.getId();
            if (z) {
                ChipGroup chipGroup = ChipGroup.this;
                int i = chipGroup.a0;
                if (i != -1 && i != id && chipGroup.U) {
                    chipGroup.c(i, false);
                }
                ChipGroup.this.setCheckedId(id);
                return;
            }
            ChipGroup chipGroup2 = ChipGroup.this;
            if (chipGroup2.a0 == id) {
                chipGroup2.setCheckedId(-1);
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b extends ViewGroup.MarginLayoutParams {
        public b() {
            super(-2, -2);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface c {
        void a();
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class d implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroup.OnHierarchyChangeListener P;

        public d() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(View.generateViewId());
                }
                ((Chip) view2).setOnCheckedChangeListenerInternal(ChipGroup.this.V);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.P;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.P;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChipGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r3);
        int i = gh0.chipGroupStyle;
        this.V = new a();
        this.W = new d();
        this.a0 = -1;
        this.b0 = false;
        TypedArray e = yw0.e(context, attributeSet, ij0.ChipGroup, i, zi0.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = e.getDimensionPixelOffset(ij0.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(e.getDimensionPixelOffset(ij0.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(e.getDimensionPixelOffset(ij0.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(e.getBoolean(ij0.ChipGroup_singleLine, false));
        setSingleSelection(e.getBoolean(ij0.ChipGroup_singleSelection, false));
        int resourceId = e.getResourceId(ij0.ChipGroup_checkedChip, -1);
        if (resourceId != -1) {
            this.a0 = resourceId;
        }
        e.recycle();
        super.setOnHierarchyChangeListener(this.W);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i) {
        this.a0 = i;
    }

    @Override // defpackage.nq
    public final boolean a() {
        return this.R;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.a0;
                if (i2 != -1 && this.U) {
                    c(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void c(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.b0 = true;
            ((Chip) findViewById).setChecked(z);
            this.b0 = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof b);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public int getCheckedChipId() {
        if (this.U) {
            return this.a0;
        }
        return -1;
    }

    public int getChipSpacingHorizontal() {
        return this.S;
    }

    public int getChipSpacingVertical() {
        return this.T;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.a0;
        if (i != -1) {
            c(i, true);
            setCheckedId(this.a0);
        }
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.S != i) {
            this.S = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.T != i) {
            this.T = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(c cVar) {
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.W.P = onHierarchyChangeListener;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    @Override // defpackage.nq
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.U != z) {
            this.U = z;
            this.b0 = true;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.b0 = false;
            setCheckedId(-1);
        }
    }
}