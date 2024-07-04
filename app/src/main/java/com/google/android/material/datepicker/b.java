package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class b<S> extends ke0<S> {
    public static final /* synthetic */ int S0 = 0;
    public int I0;
    public qj<S> J0;
    public com.google.android.material.datepicker.a K0;
    public p60 L0;
    public int M0;
    public nb N0;
    public RecyclerView O0;
    public RecyclerView P0;
    public View Q0;
    public View R0;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public final /* synthetic */ int P;

        public a(int i) {
            this.P = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b.this.P0.smoothScrollToPosition(this.P);
        }
    }

    /* renamed from: com.google.android.material.datepicker.b$b  reason: collision with other inner class name */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface InterfaceC0026b {
    }

    public final LinearLayoutManager J() {
        return (LinearLayoutManager) this.P0.getLayoutManager();
    }

    public final void K(int i) {
        this.P0.post(new a(i));
    }

    public final void L(p60 p60Var) {
        boolean z;
        RecyclerView recyclerView;
        int i;
        p60 p60Var2 = ((f) this.P0.getAdapter()).c.P;
        Calendar calendar = p60Var2.P;
        if (calendar instanceof GregorianCalendar) {
            int i2 = p60Var.S;
            int i3 = p60Var2.S;
            int i4 = p60Var.R;
            int i5 = p60Var2.R;
            int i6 = (i4 - i5) + ((i2 - i3) * 12);
            p60 p60Var3 = this.L0;
            if (calendar instanceof GregorianCalendar) {
                int i7 = i6 - ((p60Var3.R - i5) + ((p60Var3.S - i3) * 12));
                boolean z2 = false;
                if (Math.abs(i7) > 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (i7 > 0) {
                    z2 = true;
                }
                this.L0 = p60Var;
                if (z && z2) {
                    recyclerView = this.P0;
                    i = i6 - 3;
                } else {
                    if (z) {
                        recyclerView = this.P0;
                        i = i6 + 3;
                    }
                    K(i6);
                    return;
                }
                recyclerView.scrollToPosition(i);
                K(i6);
                return;
            }
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final void M(int i) {
        this.M0 = i;
        if (i == 2) {
            this.O0.getLayoutManager().w0(this.L0.S - ((i91) this.O0.getAdapter()).c.K0.P.S);
            this.Q0.setVisibility(0);
            this.R0.setVisibility(8);
        } else if (i == 1) {
            this.Q0.setVisibility(8);
            this.R0.setVisibility(0);
            L(this.L0);
        }
    }

    @Override // androidx.fragment.app.c
    public final void q(Bundle bundle) {
        super.q(bundle);
        if (bundle == null) {
            bundle = this.T;
        }
        this.I0 = bundle.getInt("THEME_RES_ID_KEY");
        this.J0 = (qj) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.K0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.L0 = (p60) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.c
    public final View r(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Context context;
        int i;
        int i2;
        p pVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        or orVar = this.g0;
        if (orVar == null) {
            context = null;
        } else {
            context = orVar.Q;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.I0);
        this.N0 = new nb(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        p60 p60Var = this.K0.P;
        if (l40.J(contextThemeWrapper)) {
            i = ki0.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = ki0.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(fi0.mtrl_calendar_days_of_week);
        a41.n(gridView, new a40());
        gridView.setAdapter((ListAdapter) new tj());
        gridView.setNumColumns(p60Var.T);
        gridView.setEnabled(false);
        this.P0 = (RecyclerView) inflate.findViewById(fi0.mtrl_calendar_months);
        this.P0.setLayoutManager(new b40(this, i2, i2));
        this.P0.setTag("MONTHS_VIEW_GROUP_TAG");
        f fVar = new f(contextThemeWrapper, this.J0, this.K0, new c(this));
        this.P0.setAdapter(fVar);
        int integer = contextThemeWrapper.getResources().getInteger(ii0.mtrl_calendar_year_selector_span);
        int i3 = fi0.mtrl_calendar_year_selector_frame;
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(i3);
        this.O0 = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.O0.setLayoutManager(new GridLayoutManager(integer));
            this.O0.setAdapter(new i91(this));
            this.O0.addItemDecoration(new c40(this));
        }
        int i4 = fi0.month_navigation_fragment_toggle;
        if (inflate.findViewById(i4) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(i4);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            a41.n(materialButton, new d40(this));
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(fi0.month_navigation_previous);
            materialButton2.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButton3 = (MaterialButton) inflate.findViewById(fi0.month_navigation_next);
            materialButton3.setTag("NAVIGATION_NEXT_TAG");
            this.Q0 = inflate.findViewById(i3);
            this.R0 = inflate.findViewById(fi0.mtrl_calendar_day_selector_frame);
            M(1);
            materialButton.setText(this.L0.Q);
            this.P0.addOnScrollListener(new e40(this, fVar, materialButton));
            materialButton.setOnClickListener(new f40(this));
            materialButton3.setOnClickListener(new g40(this, fVar));
            materialButton2.setOnClickListener(new h40(this, fVar));
        }
        if (!l40.J(contextThemeWrapper) && (recyclerView2 = (pVar = new p()).a) != (recyclerView = this.P0)) {
            if (recyclerView2 != null) {
                recyclerView2.removeOnScrollListener(pVar.c);
                pVar.a.setOnFlingListener(null);
            }
            pVar.a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() == null) {
                    pVar.a.addOnScrollListener(pVar.c);
                    pVar.a.setOnFlingListener(pVar);
                    pVar.b = new Scroller(pVar.a.getContext(), new DecelerateInterpolator());
                    pVar.b();
                } else {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
            }
        }
        RecyclerView recyclerView4 = this.P0;
        p60 p60Var2 = this.L0;
        p60 p60Var3 = fVar.c.P;
        if (p60Var3.P instanceof GregorianCalendar) {
            recyclerView4.scrollToPosition((p60Var2.R - p60Var3.R) + ((p60Var2.S - p60Var3.S) * 12));
            return inflate;
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // androidx.fragment.app.c
    public final void x(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.I0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.J0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.K0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.L0);
    }
}