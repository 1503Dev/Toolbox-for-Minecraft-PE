package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: h84  reason: default package */
public final /* synthetic */ class h84 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nc4 b;

    public /* synthetic */ h84(nc4 nc4Var, int i) {
        this.a = i;
        this.b = nc4Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                i84 i84Var = (i84) this.b;
                i84Var.getClass();
                List<String> asList = Arrays.asList(((String) w82.d.c.a(x92.b1)).split(";"));
                Bundle bundle = new Bundle();
                for (String str : asList) {
                    try {
                        mj4 b = i84Var.b.b(str, new JSONObject());
                        b.a();
                        Bundle bundle2 = new Bundle();
                        mn2 o = b.a.o();
                        if (o != null) {
                            try {
                                bundle2.putString("sdk_version", o.toString());
                            } catch (ni4 unused) {
                            }
                        }
                        mn2 n = b.a.n();
                        if (n != null) {
                            try {
                                bundle2.putString("adapter_version", n.toString());
                            } catch (ni4 unused2) {
                            }
                        }
                        bundle.putBundle(str, bundle2);
                    } catch (ni4 unused3) {
                    }
                }
                return new j84(bundle);
            default:
                bb4 bb4Var = (bb4) this.b;
                bb4Var.getClass();
                l92 l92Var = x92.i4;
                w82 w82Var = w82.d;
                String str2 = null;
                if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                    Set set = bb4Var.b;
                    if (set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner")) {
                        c14 c14Var = jv5.A.v;
                        if (true == ((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                            str2 = "a.1.3.37-google_20220829";
                        }
                        return new cb4(str2);
                    }
                }
                return new cb4(null);
        }
    }
}