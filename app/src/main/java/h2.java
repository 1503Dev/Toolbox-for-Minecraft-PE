package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* renamed from: h2  reason: default package */
public final class h2 {
    public static final List<ic1> a = Collections.synchronizedList(new ArrayList());

    public static void a() {
        ad1 h = ga1.h();
        h.getClass();
        if (!ad1.Y.equals("") && h.D.a) {
            List<ic1> list = a;
            synchronized (list) {
                for (ic1 ic1Var : list) {
                    b(ic1Var);
                }
                a.clear();
            }
        }
    }

    public static void b(ic1 ic1Var) {
        String str;
        ad1 h = ga1.h();
        h.getClass();
        if (!ad1.Y.equals("") && h.D.a) {
            ic1 n = ic1Var.n("payload");
            if (kd1.x0) {
                str = "bb2cf0647ba654d7228dd3f9405bbc6a";
            } else {
                ga1.h().getClass();
                str = ad1.Y;
            }
            eb1.j(n, "api_key", str);
            try {
                ic1Var.r("payload");
                synchronized (ic1Var.a) {
                    ic1Var.a.put("payload", n.a);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            new rc1(1, ic1Var, "AdColony.log_event").b();
            return;
        }
        List<ic1> list = a;
        synchronized (list) {
            if (200 > list.size()) {
                list.add(ic1Var);
            }
        }
    }
}