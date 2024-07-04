package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.b;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: i91  reason: default package */
public final class i91 extends RecyclerView.g<a> {
    public final b<?> c;

    /* renamed from: i91$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends RecyclerView.d0 {
        public final TextView i0;

        public a(TextView textView) {
            super(textView);
            this.i0 = textView;
        }
    }

    public i91(b<?> bVar) {
        this.c = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int d() {
        return this.c.K0.T;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void i(a aVar, int i) {
        Object obj;
        a aVar2 = aVar;
        int i2 = this.c.K0.P.S + i;
        String string = aVar2.i0.getContext().getString(ui0.mtrl_picker_navigate_to_year_description);
        aVar2.i0.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        aVar2.i0.setContentDescription(String.format(string, Integer.valueOf(i2)));
        nb nbVar = this.c.N0;
        Calendar a2 = zf.a(Calendar.getInstance());
        if (a2.get(1) == i2) {
            obj = nbVar.f;
        } else {
            obj = nbVar.d;
        }
        mb mbVar = (mb) obj;
        for (Long l : this.c.J0.n()) {
            a2.setTimeInMillis(l.longValue());
            if (a2.get(1) == i2) {
                mbVar = (mb) nbVar.e;
            }
        }
        mbVar.b(aVar2.i0);
        aVar2.i0.setOnClickListener(new h91(this, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final RecyclerView.d0 j(RecyclerView recyclerView, int i) {
        return new a((TextView) LayoutInflater.from(recyclerView.getContext()).inflate(ki0.mtrl_calendar_year, (ViewGroup) recyclerView, false));
    }
}