package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: hh2  reason: default package */
public abstract class hh2 extends j22 {
    public hh2() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c3, code lost:
        if (r5.equals("create_interstitial_ad") != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    @Override // defpackage.j22
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        char c;
        String concat;
        String str;
        StringBuilder sb;
        String str2;
        ps3 ps3Var;
        ps3 ps3Var2;
        String str3;
        String sb2;
        char c2 = 0;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            ((xs3) this).R.clear();
        } else {
            String readString = parcel.readString();
            k22.b(parcel);
            xs3 xs3Var = (xs3) this;
            l92 l92Var = x92.e8;
            w82 w82Var = w82.d;
            if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                vz3.k("Received H5 gmsg: ".concat(String.valueOf(readString)));
                Uri parse = Uri.parse(readString);
                cu5 cu5Var = jv5.A.c;
                HashMap h = cu5.h(parse);
                String str4 = (String) h.get("action");
                if (TextUtils.isEmpty(str4)) {
                    concat = "H5 gmsg did not contain an action";
                } else {
                    int hashCode = str4.hashCode();
                    if (hashCode != 579053441) {
                        if (hashCode == 871091088 && str4.equals("initialize")) {
                            c = 0;
                            if (c == 0) {
                                if (c != 1) {
                                    String str5 = (String) h.get("obj_id");
                                    try {
                                        str5.getClass();
                                        long parseLong = Long.parseLong(str5);
                                        switch (str4.hashCode()) {
                                            case -1790951212:
                                                if (str4.equals("show_interstitial_ad")) {
                                                    c2 = 2;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case -1266374734:
                                                if (str4.equals("show_rewarded_ad")) {
                                                    c2 = 5;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case -257098725:
                                                if (str4.equals("load_rewarded_ad")) {
                                                    c2 = 4;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 393881811:
                                                break;
                                            case 585513149:
                                                if (str4.equals("load_interstitial_ad")) {
                                                    c2 = 1;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 1671767583:
                                                if (str4.equals("dispose")) {
                                                    c2 = 6;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 2109237041:
                                                if (str4.equals("create_rewarded_ad")) {
                                                    c2 = 3;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            default:
                                                c2 = 65535;
                                                break;
                                        }
                                        switch (c2) {
                                            case 0:
                                                if (xs3Var.R.size() < ((Integer) w82Var.c.a(x92.f8)).intValue()) {
                                                    HashMap hashMap = xs3Var.R;
                                                    Long valueOf = Long.valueOf(parseLong);
                                                    if (!hashMap.containsKey(valueOf)) {
                                                        str = (String) h.get("ad_unit");
                                                        if (!TextUtils.isEmpty(str)) {
                                                            ak2 c3 = xs3Var.P.c();
                                                            c3.R = Long.valueOf(parseLong);
                                                            str.getClass();
                                                            c3.S = str;
                                                            m43 b = c3.b();
                                                            long longValue = b.a.longValue();
                                                            n43 n43Var = b.d;
                                                            xs3Var.R.put(valueOf, new at3(longValue, n43Var.a, new vs3(n43Var.b), b.c, b.b));
                                                            vs3 vs3Var = xs3Var.Q;
                                                            vs3Var.getClass();
                                                            us3 us3Var = new us3("creation");
                                                            us3Var.a = Long.valueOf(parseLong);
                                                            us3Var.c = "nativeObjectCreated";
                                                            vs3Var.d(us3Var);
                                                            sb = new StringBuilder();
                                                            str2 = "Created H5 interstitial #";
                                                            sb.append(str2);
                                                            sb.append(parseLong);
                                                            sb.append(" with ad unit ");
                                                            sb.append(str);
                                                            sb2 = sb.toString();
                                                            vz3.k(sb2);
                                                            break;
                                                        }
                                                        str3 = "Could not create H5 ad, missing ad unit id";
                                                        sv2.g(str3);
                                                        xs3Var.Q.b(parseLong);
                                                        break;
                                                    }
                                                    sv2.b("Could not create H5 ad, object ID already exists");
                                                    xs3Var.Q.b(parseLong);
                                                }
                                                str3 = "Could not create H5 ad, too many existing objects";
                                                sv2.g(str3);
                                                xs3Var.Q.b(parseLong);
                                            case 1:
                                                ps3Var = (ps3) xs3Var.R.get(Long.valueOf(parseLong));
                                                if (ps3Var == null) {
                                                    sv2.b("Could not load H5 ad, object ID does not exist");
                                                    xs3Var.Q.a(parseLong);
                                                    break;
                                                }
                                                ps3Var.b(xs3.t4(h));
                                                break;
                                            case 2:
                                                ps3Var2 = (ps3) xs3Var.R.get(Long.valueOf(parseLong));
                                                if (ps3Var2 == null) {
                                                    sv2.b("Could not show H5 ad, object ID does not exist");
                                                    xs3Var.Q.a(parseLong);
                                                    break;
                                                }
                                                ps3Var2.d();
                                                break;
                                            case 3:
                                                if (xs3Var.R.size() < ((Integer) w82Var.c.a(x92.f8)).intValue()) {
                                                    HashMap hashMap2 = xs3Var.R;
                                                    Long valueOf2 = Long.valueOf(parseLong);
                                                    if (!hashMap2.containsKey(valueOf2)) {
                                                        str = (String) h.get("ad_unit");
                                                        if (!TextUtils.isEmpty(str)) {
                                                            ak2 c4 = xs3Var.P.c();
                                                            c4.R = Long.valueOf(parseLong);
                                                            str.getClass();
                                                            c4.S = str;
                                                            m43 b2 = c4.b();
                                                            long longValue2 = b2.a.longValue();
                                                            n43 n43Var2 = b2.d;
                                                            xs3Var.R.put(valueOf2, new dt3(longValue2, n43Var2.a, new vs3(n43Var2.b), b2.c, b2.b));
                                                            vs3 vs3Var2 = xs3Var.Q;
                                                            vs3Var2.getClass();
                                                            us3 us3Var2 = new us3("creation");
                                                            us3Var2.a = Long.valueOf(parseLong);
                                                            us3Var2.c = "nativeObjectCreated";
                                                            vs3Var2.d(us3Var2);
                                                            sb = new StringBuilder();
                                                            str2 = "Created H5 rewarded #";
                                                            sb.append(str2);
                                                            sb.append(parseLong);
                                                            sb.append(" with ad unit ");
                                                            sb.append(str);
                                                            sb2 = sb.toString();
                                                            vz3.k(sb2);
                                                            break;
                                                        }
                                                        str3 = "Could not create H5 ad, missing ad unit id";
                                                        sv2.g(str3);
                                                        xs3Var.Q.b(parseLong);
                                                        break;
                                                    }
                                                    sv2.b("Could not create H5 ad, object ID already exists");
                                                    xs3Var.Q.b(parseLong);
                                                }
                                                str3 = "Could not create H5 ad, too many existing objects";
                                                sv2.g(str3);
                                                xs3Var.Q.b(parseLong);
                                            case 4:
                                                ps3Var = (ps3) xs3Var.R.get(Long.valueOf(parseLong));
                                                if (ps3Var == null) {
                                                    sv2.b("Could not load H5 ad, object ID does not exist");
                                                    xs3Var.Q.c(parseLong);
                                                    break;
                                                }
                                                ps3Var.b(xs3.t4(h));
                                                break;
                                            case 5:
                                                ps3Var2 = (ps3) xs3Var.R.get(Long.valueOf(parseLong));
                                                if (ps3Var2 == null) {
                                                    sv2.b("Could not show H5 ad, object ID does not exist");
                                                    xs3Var.Q.c(parseLong);
                                                    break;
                                                }
                                                ps3Var2.d();
                                                break;
                                            case 6:
                                                HashMap hashMap3 = xs3Var.R;
                                                Long valueOf3 = Long.valueOf(parseLong);
                                                ps3 ps3Var3 = (ps3) hashMap3.get(valueOf3);
                                                if (ps3Var3 == null) {
                                                    concat = "Could not dispose H5 ad, object ID does not exist";
                                                    break;
                                                } else {
                                                    ps3Var3.a();
                                                    xs3Var.R.remove(valueOf3);
                                                    sb2 = "Disposed H5 ad #" + parseLong;
                                                    vz3.k(sb2);
                                                    break;
                                                }
                                            default:
                                                concat = "H5 gmsg contained invalid action: ".concat(str4);
                                                break;
                                        }
                                    } catch (NullPointerException | NumberFormatException unused) {
                                        concat = "H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str5));
                                    }
                                } else {
                                    for (ps3 ps3Var4 : xs3Var.R.values()) {
                                        ps3Var4.a();
                                    }
                                    xs3Var.R.clear();
                                }
                            } else {
                                xs3Var.R.clear();
                                vs3 vs3Var3 = xs3Var.Q;
                                vs3Var3.getClass();
                                vs3Var3.d(new us3("initialize"));
                            }
                        }
                        c = 65535;
                        if (c == 0) {
                        }
                    } else {
                        if (str4.equals("dispose_all")) {
                            c = 1;
                            if (c == 0) {
                            }
                        }
                        c = 65535;
                        if (c == 0) {
                        }
                    }
                }
                sv2.b(concat);
            }
        }
        parcel2.writeNoException();
        return true;
    }
}