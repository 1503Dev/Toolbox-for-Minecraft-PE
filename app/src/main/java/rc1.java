package defpackage;

import org.json.JSONException;

/* renamed from: rc1  reason: default package */
public final class rc1 {
    public String a;
    public ic1 b;

    public rc1(int i, ic1 ic1Var, String str) {
        try {
            this.a = str;
            ic1Var = ic1Var == null ? new ic1() : ic1Var;
            this.b = ic1Var;
            ic1Var.e(i, "m_target");
        } catch (JSONException e) {
            StringBuilder b = e5.b("JSON Error in ADCMessage constructor: ");
            b.append(e.toString());
            t1.b(0, 0, b.toString(), true);
        }
    }

    public final rc1 a(ic1 ic1Var) {
        try {
            rc1 rc1Var = new rc1(this.b.d("m_origin"), ic1Var, "reply");
            rc1Var.b.e(this.b.d("m_id"), "m_id");
            return rc1Var;
        } catch (JSONException e) {
            StringBuilder b = e5.b("JSON error in ADCMessage's createReply(): ");
            b.append(e.toString());
            ga1.h().n().d(0, 0, b.toString(), true);
            return new rc1("JSONException", 0);
        }
    }

    public final void b() {
        String str = this.a;
        ic1 ic1Var = this.b;
        if (ic1Var == null) {
            ic1Var = new ic1();
        }
        eb1.j(ic1Var, "m_type", str);
        ga1.h().o().e(ic1Var);
    }

    public rc1(ic1 ic1Var) {
        if (ic1Var == null) {
            try {
                ic1Var = new ic1();
            } catch (JSONException e) {
                StringBuilder b = e5.b("JSON Error in ADCMessage constructor: ");
                b.append(e.toString());
                t1.b(0, 0, b.toString(), true);
                return;
            }
        }
        this.b = ic1Var;
        this.a = ic1Var.h("m_type");
    }

    public rc1(String str, int i) {
        try {
            this.a = str;
            ic1 ic1Var = new ic1();
            this.b = ic1Var;
            ic1Var.e(i, "m_target");
        } catch (JSONException e) {
            StringBuilder b = e5.b("JSON Error in ADCMessage constructor: ");
            b.append(e.toString());
            t1.b(0, 0, b.toString(), true);
        }
    }
}