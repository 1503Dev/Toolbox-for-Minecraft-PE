package defpackage;

import android.view.View;
import com.google.android.material.datepicker.b;

/* renamed from: f40  reason: default package */
public final class f40 implements View.OnClickListener {
    public final /* synthetic */ b P;

    public f40(b bVar) {
        this.P = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b bVar = this.P;
        int i = bVar.M0;
        if (i == 2) {
            bVar.M(1);
        } else if (i == 1) {
            bVar.M(2);
        }
    }
}