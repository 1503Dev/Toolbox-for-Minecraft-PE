package defpackage;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: u74  reason: default package */
public final class u74 implements mc4 {
    public final li4 a;
    public final long b;

    public u74(li4 li4Var, long j) {
        if (li4Var == null) {
            throw new NullPointerException("the targeting must not be null");
        }
        this.a = li4Var;
        this.b = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.mc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Object obj) {
        String str;
        boolean z;
        Bundle bundle;
        int i;
        boolean z2;
        List list;
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        Location location;
        List list2;
        Bundle bundle2;
        List list3;
        boolean z6;
        Bundle bundle3 = (Bundle) obj;
        pn5 pn5Var = this.a.d;
        bundle3.putInt("http_timeout_millis", pn5Var.l0);
        bundle3.putString("slotname", this.a.f);
        int i3 = this.a.o.P;
        int i4 = i3 - 1;
        if (i3 != 0) {
            boolean z7 = true;
            if (i4 != 1) {
                if (i4 == 2) {
                    str = "is_rewarded_interstitial";
                }
                bundle3.putLong("start_signals_timestamp", this.b);
                String format = new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(pn5Var.Q));
                if (pn5Var.Q == -1) {
                    z = true;
                } else {
                    z = false;
                }
                hj4.c(bundle3, "cust_age", format, z);
                bundle = pn5Var.R;
                if (bundle != null) {
                    bundle3.putBundle("extras", bundle);
                }
                i = pn5Var.S;
                if (i == -1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    bundle3.putInt("cust_gender", i);
                }
                list = pn5Var.T;
                if (list != null) {
                    bundle3.putStringArrayList("kw", new ArrayList<>(list));
                }
                i2 = pn5Var.V;
                if (i2 == -1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    bundle3.putInt("tag_for_child_directed_treatment", i2);
                }
                if (pn5Var.U) {
                    bundle3.putBoolean("test_request", true);
                }
                if (pn5Var.P < 2 && pn5Var.W) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    bundle3.putInt("d_imp_hdr", 1);
                }
                String str2 = pn5Var.X;
                if (pn5Var.P < 2 && !TextUtils.isEmpty(str2)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                hj4.c(bundle3, "ppid", str2, z5);
                location = pn5Var.Z;
                if (location != null) {
                    Bundle bundle4 = new Bundle();
                    bundle4.putFloat("radius", location.getAccuracy() * 1000.0f);
                    bundle4.putLong("lat", (long) (location.getLatitude() * 1.0E7d));
                    bundle4.putLong("long", (long) (1.0E7d * location.getLongitude()));
                    bundle4.putLong("time", location.getTime() * 1000);
                    bundle3.putBundle("uule", bundle4);
                }
                hj4.b(bundle3, "url", pn5Var.a0);
                list2 = pn5Var.k0;
                if (list2 != null) {
                    bundle3.putStringArrayList("neighboring_content_urls", new ArrayList<>(list2));
                }
                bundle2 = pn5Var.c0;
                if (bundle2 != null) {
                    bundle3.putBundle("custom_targeting", bundle2);
                }
                list3 = pn5Var.d0;
                if (list3 != null) {
                    bundle3.putStringArrayList("category_exclusions", new ArrayList<>(list3));
                }
                hj4.b(bundle3, "request_agent", pn5Var.e0);
                hj4.b(bundle3, "request_pkg", pn5Var.f0);
                boolean z8 = pn5Var.g0;
                if (pn5Var.P < 7) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                hj4.d(bundle3, "is_designed_for_families", z8, z6);
                if (pn5Var.P < 8) {
                    int i5 = pn5Var.i0;
                    if (i5 == -1) {
                        z7 = false;
                    }
                    if (z7) {
                        bundle3.putInt("tag_for_under_age_of_consent", i5);
                    }
                    hj4.b(bundle3, "max_ad_content_rating", pn5Var.j0);
                    return;
                }
                return;
            }
            str = "is_new_rewarded";
            bundle3.putBoolean(str, true);
            bundle3.putLong("start_signals_timestamp", this.b);
            String format2 = new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(pn5Var.Q));
            if (pn5Var.Q == -1) {
            }
            hj4.c(bundle3, "cust_age", format2, z);
            bundle = pn5Var.R;
            if (bundle != null) {
            }
            i = pn5Var.S;
            if (i == -1) {
            }
            if (z2) {
            }
            list = pn5Var.T;
            if (list != null) {
            }
            i2 = pn5Var.V;
            if (i2 == -1) {
            }
            if (z3) {
            }
            if (pn5Var.U) {
            }
            if (pn5Var.P < 2) {
            }
            z4 = false;
            if (z4) {
            }
            String str22 = pn5Var.X;
            if (pn5Var.P < 2) {
            }
            z5 = false;
            hj4.c(bundle3, "ppid", str22, z5);
            location = pn5Var.Z;
            if (location != null) {
            }
            hj4.b(bundle3, "url", pn5Var.a0);
            list2 = pn5Var.k0;
            if (list2 != null) {
            }
            bundle2 = pn5Var.c0;
            if (bundle2 != null) {
            }
            list3 = pn5Var.d0;
            if (list3 != null) {
            }
            hj4.b(bundle3, "request_agent", pn5Var.e0);
            hj4.b(bundle3, "request_pkg", pn5Var.f0);
            boolean z82 = pn5Var.g0;
            if (pn5Var.P < 7) {
            }
            hj4.d(bundle3, "is_designed_for_families", z82, z6);
            if (pn5Var.P < 8) {
            }
        } else {
            throw null;
        }
    }
}