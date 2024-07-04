package defpackage;

import android.util.Pair;
import java.io.IOException;

/* renamed from: en5  reason: default package */
public final class en5 implements tv5, ks5 {
    public final gn5 P;
    public final /* synthetic */ in5 Q;

    public en5(in5 in5Var, gn5 gn5Var) {
        this.Q = in5Var;
        this.P = gn5Var;
    }

    @Override // defpackage.tv5
    public final void a(int i, ov5 ov5Var, xu5 xu5Var, lv5 lv5Var, IOException iOException, boolean z) {
        Pair b = b(ov5Var);
        if (b != null) {
            ((dl4) this.Q.i).b(new an5(this, b, xu5Var, lv5Var, iOException, z, 0));
        }
    }

    public final Pair b(ov5 ov5Var) {
        ov5 ov5Var2;
        ov5 ov5Var3 = null;
        if (ov5Var != null) {
            gn5 gn5Var = this.P;
            int i = 0;
            while (true) {
                if (i >= gn5Var.c.size()) {
                    ov5Var2 = null;
                    break;
                } else if (((ov5) gn5Var.c.get(i)).d == ov5Var.d) {
                    ov5Var2 = ov5Var.b(Pair.create(gn5Var.b, ov5Var.a));
                    break;
                } else {
                    i++;
                }
            }
            if (ov5Var2 == null) {
                return null;
            }
            ov5Var3 = ov5Var2;
        }
        return Pair.create(Integer.valueOf(this.P.d), ov5Var3);
    }

    @Override // defpackage.tv5
    public final void j(int i, ov5 ov5Var, xu5 xu5Var, lv5 lv5Var) {
        Pair b = b(ov5Var);
        if (b != null) {
            ((dl4) this.Q.i).b(new bn5(this, b, xu5Var, lv5Var, 0));
        }
    }

    @Override // defpackage.tv5
    public final void k(int i, ov5 ov5Var, lv5 lv5Var) {
        Pair b = b(ov5Var);
        if (b != null) {
            ((dl4) this.Q.i).b(new bw5(2, this, b, lv5Var));
        }
    }

    @Override // defpackage.tv5
    public final void p(int i, ov5 ov5Var, xu5 xu5Var, lv5 lv5Var) {
        Pair b = b(ov5Var);
        if (b != null) {
            ((dl4) this.Q.i).b(new cn5(this, b, xu5Var, lv5Var, 0));
        }
    }

    @Override // defpackage.tv5
    public final void y(int i, ov5 ov5Var, final xu5 xu5Var, final lv5 lv5Var) {
        final Pair b = b(ov5Var);
        if (b != null) {
            ((dl4) this.Q.i).b(new Runnable() { // from class: dn5
                @Override // java.lang.Runnable
                public final void run() {
                    en5 en5Var = en5.this;
                    Pair pair = b;
                    xu5 xu5Var2 = xu5Var;
                    lv5 lv5Var2 = lv5Var;
                    ((pp5) en5Var.Q.h).y(((Integer) pair.first).intValue(), (ov5) pair.second, xu5Var2, lv5Var2);
                }
            });
        }
    }
}