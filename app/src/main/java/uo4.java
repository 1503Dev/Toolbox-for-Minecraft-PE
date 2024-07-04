package defpackage;

import android.os.AsyncTask;
import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: uo4  reason: default package */
public abstract class uo4 extends AsyncTask {
    public h43 a;
    public final no4 b;

    public uo4(no4 no4Var) {
        this.b = no4Var;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        h43 h43Var = this.a;
        if (h43Var != null) {
            h43Var.d = null;
            uo4 uo4Var = (uo4) ((ArrayDeque) h43Var.c).poll();
            h43Var.d = uo4Var;
            if (uo4Var != null) {
                uo4Var.executeOnExecutor((ThreadPoolExecutor) h43Var.b, new Object[0]);
            }
        }
    }
}