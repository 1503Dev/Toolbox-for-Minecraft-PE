package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.CalendarContract;

/* renamed from: pn2  reason: default package */
public final class pn2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ rn2 P;

    public pn2(rn2 rn2Var) {
        this.P = rn2Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        rn2 rn2Var = this.P;
        rn2Var.getClass();
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", rn2Var.T);
        data.putExtra("eventLocation", rn2Var.X);
        data.putExtra("description", rn2Var.W);
        long j = rn2Var.U;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = rn2Var.V;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        cu5 cu5Var = jv5.A.c;
        cu5.l(this.P.S, data);
    }
}