package defpackage;

import org.json.JSONObject;

/* renamed from: qv3  reason: default package */
public final /* synthetic */ class qv3 implements ky4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qv3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ky4
    public final dz4 e(Object obj) {
        switch (this.a) {
            case 0:
                return ((ck2) this.b).a((JSONObject) obj);
            default:
                po3 po3Var = (po3) this.b;
                l13 a = po3Var.c.a(zr5.d(), null, null);
                ax2 ax2Var = new ax2(a);
                po3Var.a(a);
                a.R().W = new wk1(ax2Var);
                p92 p92Var = x92.a3;
                a.P.loadUrl((String) w82.d.c.a(p92Var));
                return ax2Var;
        }
    }
}