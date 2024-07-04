package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.b;
import java.util.Iterator;

public final class e implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView P;
    public final /* synthetic */ f Q;

    public e(f fVar, MaterialCalendarGridView materialCalendarGridView) {
        this.Q = fVar;
        this.P = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        boolean z;
        d adapter2 = this.P.getAdapter2();
        if (i >= adapter2.b() && i <= adapter2.d()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            b.InterfaceC0026b interfaceC0026b = this.Q.e;
            this.P.getAdapter2().getItem(i).longValue();
            c cVar = (c) interfaceC0026b;
            if (cVar.a.K0.S.isValid()) {
                cVar.a.J0.b();
                Iterator it = cVar.a.H0.iterator();
                while (it.hasNext()) {
                    cVar.a.J0.p();
                    ((hc0) it.next()).a();
                }
                cVar.a.P0.getAdapter().a.b();
                RecyclerView recyclerView = cVar.a.O0;
                if (recyclerView != null) {
                    recyclerView.getAdapter().a.b();
                }
            }
        }
    }
}