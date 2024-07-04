package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.b;
import com.google.android.material.datepicker.f;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: e40  reason: default package */
public final class e40 extends RecyclerView.t {
    public final /* synthetic */ f a;
    public final /* synthetic */ MaterialButton b;
    public final /* synthetic */ b c;

    public e40(b bVar, f fVar, MaterialButton materialButton) {
        this.c = bVar;
        this.a = fVar;
        this.b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int U0;
        LinearLayoutManager J = this.c.J();
        if (i < 0) {
            U0 = J.T0();
        } else {
            U0 = J.U0();
        }
        b bVar = this.c;
        Calendar a = zf.a(this.a.c.P.P);
        a.add(2, U0);
        bVar.L0 = new p60(a);
        MaterialButton materialButton = this.b;
        Calendar a2 = zf.a(this.a.c.P.P);
        a2.add(2, U0);
        a2.set(5, 1);
        Calendar a3 = zf.a(a2);
        a3.get(2);
        a3.get(1);
        a3.getMaximum(7);
        a3.getActualMaximum(5);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM, yyyy", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(a3.getTime());
        a3.getTimeInMillis();
        materialButton.setText(format);
    }
}