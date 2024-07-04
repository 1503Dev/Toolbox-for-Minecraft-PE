package defpackage;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: qm3  reason: default package */
public final class qm3 {
    public final qq3 a;
    public final kp3 b;
    public final t73 c;
    public final ul3 d;

    public qm3(qq3 qq3Var, kp3 kp3Var, t73 t73Var, rk3 rk3Var) {
        this.a = qq3Var;
        this.b = kp3Var;
        this.c = t73Var;
        this.d = rk3Var;
    }

    public final View a() {
        l13 a = this.a.a(zr5.d(), null, null);
        a.setVisibility(8);
        a.D0("/sendMessageToSdk", new mg2() { // from class: lm3
            @Override // defpackage.mg2
            public final void b(Object obj, Map map) {
                y03 y03Var = (y03) obj;
                qm3.this.b.b(map);
            }
        });
        a.D0("/adMuted", new mg2() { // from class: mm3
            @Override // defpackage.mg2
            public final void b(Object obj, Map map) {
                y03 y03Var = (y03) obj;
                qm3.this.d.h();
            }
        });
        this.b.d(new WeakReference(a), "/loadHtml", new mg2() { // from class: nm3
            @Override // defpackage.mg2
            public final void b(Object obj, Map map) {
                qm3 qm3Var = qm3.this;
                y03 y03Var = (y03) obj;
                y03Var.R().V = new en2(1, qm3Var, map);
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    y03Var.loadData(str, "text/html", "UTF-8");
                } else {
                    y03Var.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.b.d(new WeakReference(a), "/showOverlay", new mg2() { // from class: om3
            @Override // defpackage.mg2
            public final void b(Object obj, Map map) {
                qm3 qm3Var = qm3.this;
                qm3Var.getClass();
                sv2.f("Showing native ads overlay.");
                ((y03) obj).x().setVisibility(0);
                qm3Var.c.U = true;
            }
        });
        this.b.d(new WeakReference(a), "/hideOverlay", new mg2() { // from class: pm3
            @Override // defpackage.mg2
            public final void b(Object obj, Map map) {
                qm3 qm3Var = qm3.this;
                qm3Var.getClass();
                sv2.f("Hiding native ads overlay.");
                ((y03) obj).x().setVisibility(8);
                qm3Var.c.U = false;
            }
        });
        return a;
    }
}