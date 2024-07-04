package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.b;
import defpackage.h0;
import java.util.Calendar;
import java.util.WeakHashMap;

public final class f extends RecyclerView.g<a> {
    public final com.google.android.material.datepicker.a c;
    public final qj<?> d;
    public final b.InterfaceC0026b e;
    public final int f;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends RecyclerView.d0 {
        public final TextView i0;
        public final MaterialCalendarGridView j0;

        public a(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            boolean z2;
            boolean z3;
            Boolean bool;
            boolean booleanValue;
            boolean booleanValue2;
            boolean z4;
            TextView textView = (TextView) linearLayout.findViewById(fi0.month_title);
            this.i0 = textView;
            WeakHashMap<View, String> weakHashMap = a41.a;
            int i = ai0.tag_accessibility_heading;
            Boolean bool2 = Boolean.TRUE;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 28) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                textView.setAccessibilityHeading(bool2.booleanValue());
            } else {
                if (i2 >= 28) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                h0 h0Var = null;
                if (z3) {
                    bool = Boolean.valueOf(j6.c(textView));
                } else {
                    Object tag = textView.getTag(i);
                    if (Boolean.class.isInstance(tag)) {
                        bool = tag;
                    } else {
                        bool = null;
                    }
                }
                Boolean bool3 = bool;
                if (bool3 == null) {
                    booleanValue = false;
                } else {
                    booleanValue = bool3.booleanValue();
                }
                if (bool2 == null) {
                    booleanValue2 = false;
                } else {
                    booleanValue2 = bool2.booleanValue();
                }
                if (booleanValue == booleanValue2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    View.AccessibilityDelegate c = a41.c(textView);
                    if (c != null) {
                        if (c instanceof h0.a) {
                            h0Var = ((h0.a) c).a;
                        } else {
                            h0Var = new h0(c);
                        }
                    }
                    a41.n(textView, h0Var == null ? new h0() : h0Var);
                    textView.setTag(i, bool2);
                    a41.h(textView, 0);
                }
            }
            this.j0 = (MaterialCalendarGridView) linearLayout.findViewById(fi0.month_grid);
            if (!z) {
                textView.setVisibility(8);
            }
        }
    }

    public f(ContextThemeWrapper contextThemeWrapper, qj qjVar, com.google.android.material.datepicker.a aVar, c cVar) {
        int i;
        p60 p60Var = aVar.P;
        p60 p60Var2 = aVar.Q;
        p60 p60Var3 = aVar.R;
        if (p60Var.P.compareTo(p60Var3.P) <= 0) {
            if (p60Var3.P.compareTo(p60Var2.P) <= 0) {
                int i2 = d.T;
                int i3 = b.S0;
                Resources resources = contextThemeWrapper.getResources();
                int i4 = rh0.mtrl_calendar_day_height;
                int dimensionPixelSize = resources.getDimensionPixelSize(i4) * i2;
                if (l40.J(contextThemeWrapper)) {
                    i = contextThemeWrapper.getResources().getDimensionPixelSize(i4);
                } else {
                    i = 0;
                }
                this.f = dimensionPixelSize + i;
                this.c = aVar;
                this.d = qjVar;
                this.e = cVar;
                if (!this.a.a()) {
                    this.b = true;
                    return;
                }
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int d() {
        return this.c.U;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final long f(int i) {
        Calendar a2 = zf.a(this.c.P.P);
        a2.add(2, i);
        return new p60(a2).P.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void i(a aVar, int i) {
        a aVar2 = aVar;
        Calendar a2 = zf.a(this.c.P.P);
        a2.add(2, i);
        p60 p60Var = new p60(a2);
        aVar2.i0.setText(p60Var.Q);
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar2.j0.findViewById(fi0.month_grid);
        if (materialCalendarGridView.getAdapter2() != null && p60Var.equals(materialCalendarGridView.getAdapter2().P)) {
            materialCalendarGridView.getAdapter2().notifyDataSetChanged();
        } else {
            d dVar = new d(p60Var, this.d, this.c);
            materialCalendarGridView.setNumColumns(p60Var.T);
            materialCalendarGridView.setAdapter((ListAdapter) dVar);
        }
        materialCalendarGridView.setOnItemClickListener(new e(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final RecyclerView.d0 j(RecyclerView recyclerView, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(recyclerView.getContext()).inflate(ki0.mtrl_calendar_month_labeled, (ViewGroup) recyclerView, false);
        if (l40.J(recyclerView.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.p(-1, this.f));
            return new a(linearLayout, true);
        }
        return new a(linearLayout, false);
    }
}