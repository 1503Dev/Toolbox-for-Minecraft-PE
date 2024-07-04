package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: xs3  reason: default package */
public final class xs3 extends hh2 {
    public final ys3 P;
    public final vs3 Q;
    public final HashMap R = new HashMap();

    public xs3(ys3 ys3Var, vs3 vs3Var) {
        this.P = ys3Var;
        this.Q = vs3Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static pn5 t4(HashMap hashMap) {
        char c;
        mo5 mo5Var = new mo5();
        String str = (String) hashMap.get("ad_request");
        if (str == null) {
            return mo5Var.a();
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                switch (nextName.hashCode()) {
                    case -1289032093:
                        if (nextName.equals("extras")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -839117230:
                        if (nextName.equals("isTestDevice")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -733436947:
                        if (nextName.equals("tagForUnderAgeOfConsent")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -99890337:
                        if (nextName.equals("httpTimeoutMillis")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 523149226:
                        if (nextName.equals("keywords")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 597632527:
                        if (nextName.equals("maxAdContentRating")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1411582723:
                        if (nextName.equals("tagForChildDirectedTreatment")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        jsonReader.beginObject();
                        Bundle bundle = new Bundle();
                        while (jsonReader.hasNext()) {
                            bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        mo5Var.a = bundle;
                        break;
                    case 1:
                        jsonReader.beginArray();
                        ArrayList arrayList = new ArrayList();
                        while (jsonReader.hasNext()) {
                            arrayList.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                        mo5Var.b = arrayList;
                        break;
                    case 2:
                        mo5Var.c = jsonReader.nextBoolean();
                        break;
                    case 3:
                        if (jsonReader.nextBoolean()) {
                            mo5Var.d = 1;
                            break;
                        } else {
                            mo5Var.d = 0;
                            break;
                        }
                    case 4:
                        if (jsonReader.nextBoolean()) {
                            mo5Var.h = 1;
                            break;
                        } else {
                            mo5Var.h = 0;
                            break;
                        }
                    case 5:
                        String nextString = jsonReader.nextString();
                        if (!xk0.b.contains(nextString)) {
                            break;
                        } else {
                            mo5Var.i = nextString;
                            break;
                        }
                    case 6:
                        mo5Var.k = jsonReader.nextInt();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
            sv2.b("Ad Request json was malformed, parsing ended early.");
        }
        pn5 a = mo5Var.a();
        Bundle bundle2 = a.b0.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 == null) {
            bundle2 = a.R;
            a.b0.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle2);
        }
        return new pn5(a.P, a.Q, bundle2, a.S, a.T, a.U, a.V, a.W, a.X, a.Y, a.Z, a.a0, a.b0, a.c0, a.d0, a.e0, a.f0, a.g0, a.h0, a.i0, a.j0, a.k0, a.l0, a.m0);
    }
}