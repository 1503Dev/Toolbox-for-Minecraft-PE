package defpackage;

/* renamed from: n54  reason: default package */
public final class n54 {
    public boolean a = false;
    public final /* synthetic */ h14 b;
    public final /* synthetic */ bx2 c;

    public n54(h14 h14Var, bx2 bx2Var) {
        this.b = h14Var;
        this.c = bx2Var;
    }

    public final synchronized void a(int i) {
        if (this.a) {
            return;
        }
        this.a = true;
        String str = this.b.a;
        b(new tz3(i, "Error from: " + str + ", code: " + i, "undefined", null, null));
    }

    public final synchronized void b(tz3 tz3Var) {
        int i = 1;
        if (true == ((Boolean) w82.d.c.a(x92.u4)).booleanValue()) {
            i = 3;
        }
        this.c.c(new i14(i, tz3Var));
    }
}