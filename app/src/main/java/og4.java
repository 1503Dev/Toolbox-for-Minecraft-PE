package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: og4  reason: default package */
public final class og4 implements at4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ og4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.at4
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                sv2.e("", (gw3) obj);
                vz3.k("Failed to get a cache key, reverting to legacy flow.");
                rg4 rg4Var = (rg4) this.b;
                rg4Var.d = new qg4(null, rg4Var.a());
                return ((rg4) this.b).d;
            case 1:
                String str = (String) this.b;
                String str2 = (String) obj;
                zf2 zf2Var = lg2.a;
                if (str2 != null) {
                    if (((Boolean) lb2.f.d()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(str).getHost();
                        for (int i = 0; i < 3; i++) {
                            if (!host.endsWith(strArr[i])) {
                            }
                        }
                        return str;
                    }
                    String str3 = (String) lb2.a.d();
                    String str4 = (String) lb2.b.d();
                    if (!TextUtils.isEmpty(str3)) {
                        str = str.replace(str3, str2);
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        Uri parse = Uri.parse(str);
                        if (TextUtils.isEmpty(parse.getQueryParameter(str4))) {
                            return parse.buildUpon().appendQueryParameter(str4, str2).toString();
                        }
                        return str;
                    }
                    return str;
                }
                return str;
            default:
                kp3 kp3Var = (kp3) this.b;
                y03 y03Var = (y03) obj;
                y03Var.D0("/result", kp3Var.i);
                g13 R = y03Var.R();
                ep3 ep3Var = kp3Var.a;
                R.a(null, ep3Var, ep3Var, ep3Var, ep3Var, false, null, new o82(kp3Var.c, null), null, null, kp3Var.j, kp3Var.k, kp3Var.d, kp3Var.e, null, null, null, null);
                return y03Var;
        }
    }
}