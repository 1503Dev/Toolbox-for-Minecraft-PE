package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.WeakHashMap;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    public HashMap i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public final FabTransformationBehavior.b A(Context context, boolean z) {
        int i = z ? bh0.mtrl_fab_transformation_sheet_expand_spec : bh0.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.b bVar = new FabTransformationBehavior.b();
        bVar.a = q60.a(context, i);
        bVar.b = new p5();
        return bVar;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public final void t(View view, View view2, boolean z, boolean z2) {
        boolean z3;
        int i;
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.i = new HashMap(childCount);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if ((childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).a instanceof FabTransformationScrimBehavior)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (childAt != view2 && !z3) {
                    HashMap hashMap = this.i;
                    if (!z) {
                        if (hashMap != null && hashMap.containsKey(childAt)) {
                            i = ((Integer) this.i.get(childAt)).intValue();
                        }
                    } else {
                        hashMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        i = 4;
                    }
                    WeakHashMap<View, String> weakHashMap = a41.a;
                    childAt.setImportantForAccessibility(i);
                }
            }
            if (!z) {
                this.i = null;
            }
        }
        super.t(view, view2, z, z2);
    }
}