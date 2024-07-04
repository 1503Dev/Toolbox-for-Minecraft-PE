package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;

final class MaterialCalendarGridView extends GridView {
    public final Calendar P;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.P = zf.b(null);
        if (l40.J(getContext())) {
            setNextFocusLeftId(fi0.cancel_button);
            setNextFocusRightId(fi0.confirm_button);
        }
        a41.n(this, new i40());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: a */
    public final d getAdapter2() {
        return (d) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d adapter2 = getAdapter2();
        qj<?> qjVar = adapter2.Q;
        nb nbVar = adapter2.R;
        adapter2.getItem(adapter2.b());
        adapter2.getItem(adapter2.d());
        for (pd0<Long, Long> pd0Var : qjVar.j()) {
            pd0Var.getClass();
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int b;
        if (z) {
            if (i == 33) {
                b = getAdapter2().d();
            } else if (i == 130) {
                b = getAdapter2().b();
            } else {
                super.onFocusChanged(true, i, rect);
                return;
            }
            setSelection(b);
            return;
        }
        super.onFocusChanged(false, i, rect);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (super.onKeyDown(i, keyEvent)) {
            if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().b()) {
                return true;
            }
            if (19 == i) {
                setSelection(getAdapter2().b());
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof d)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), d.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < getAdapter2().b()) {
            i = getAdapter2().b();
        }
        super.setSelection(i);
    }
}