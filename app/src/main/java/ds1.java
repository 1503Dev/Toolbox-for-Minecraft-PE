package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ds1  reason: default package */
public final class ds1 implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ tg0 b;
    public final /* synthetic */ aa c;

    public ds1(aa aaVar, String str, tg0 tg0Var) {
        this.c = aaVar;
        this.a = str;
        this.b = tg0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010b A[SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        f2 f2Var;
        Bundle m4;
        String format;
        int i;
        aa aaVar = this.c;
        String str = this.a;
        m82.d("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z = aaVar.Z;
        boolean z2 = aaVar.f0;
        boolean z3 = aaVar.g0;
        boolean z4 = aaVar.h0;
        String str2 = aaVar.Q;
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str2);
        int i2 = 1;
        if (z && z3) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z2 && z4) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        String str3 = null;
        while (true) {
            try {
                if (aaVar.Z) {
                    pz3 pz3Var = aaVar.U;
                    if (i2 != aaVar.f0) {
                        i = 9;
                    } else {
                        i = 19;
                    }
                    m4 = pz3Var.v3(i, aaVar.T.getPackageName(), str, str3, bundle);
                } else {
                    m4 = aaVar.U.m4(aaVar.T.getPackageName(), str, str3);
                }
                da daVar = qa2.g;
                if (m4 == null) {
                    Object[] objArr = new Object[i2];
                    objArr[0] = "getPurchase()";
                    format = String.format("%s got null owned items list", objArr);
                } else {
                    int a = m82.a(m4, "BillingClient");
                    String c = m82.c(m4, "BillingClient");
                    da daVar2 = new da();
                    daVar2.a = a;
                    daVar2.b = c;
                    if (a != 0) {
                        m82.e("BillingClient", String.format("%s failed. Response code: %s", "getPurchase()", Integer.valueOf(a)));
                        daVar = daVar2;
                        i2 = 1;
                    } else if (m4.containsKey("INAPP_PURCHASE_ITEM_LIST") && m4.containsKey("INAPP_PURCHASE_DATA_LIST") && m4.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                        ArrayList<String> stringArrayList = m4.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList2 = m4.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList3 = m4.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        if (stringArrayList == null) {
                            i2 = 1;
                            format = String.format("Bundle returned from %s contains null SKUs list.", "getPurchase()");
                        } else {
                            i2 = 1;
                            if (stringArrayList2 == null) {
                                format = String.format("Bundle returned from %s contains null purchases list.", "getPurchase()");
                            } else if (stringArrayList3 == null) {
                                format = String.format("Bundle returned from %s contains null signatures list.", "getPurchase()");
                            } else {
                                daVar = qa2.h;
                            }
                        }
                    } else {
                        i2 = 1;
                        format = String.format("Bundle returned from %s doesn't contain required fields.", "getPurchase()");
                    }
                    if (daVar == qa2.h) {
                        f2Var = new f2(daVar, (Object) null);
                        break;
                    }
                    ArrayList<String> stringArrayList4 = m4.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayList5 = m4.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    ArrayList<String> stringArrayList6 = m4.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    for (int i3 = 0; i3 < stringArrayList5.size(); i3++) {
                        String str4 = stringArrayList5.get(i3);
                        String str5 = stringArrayList6.get(i3);
                        m82.d("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList4.get(i3))));
                        try {
                            sg0 sg0Var = new sg0(str4, str5);
                            JSONObject jSONObject = sg0Var.c;
                            if (TextUtils.isEmpty(jSONObject.optString("token", jSONObject.optString("purchaseToken")))) {
                                m82.e("BillingClient", "BUG: empty/null token!");
                            }
                            arrayList.add(sg0Var);
                        } catch (JSONException e) {
                            m82.f("BillingClient", "Got an exception trying to decode the purchase!", e);
                            f2Var = new f2(qa2.g, (Object) null);
                        }
                    }
                    str3 = m4.getString("INAPP_CONTINUATION_TOKEN");
                    m82.d("BillingClient", "Continuation token: ".concat(String.valueOf(str3)));
                    if (TextUtils.isEmpty(str3)) {
                        f2Var = new f2(qa2.h, arrayList);
                        break;
                    }
                }
                m82.e("BillingClient", format);
                if (daVar == qa2.h) {
                }
            } catch (Exception e2) {
                m82.f("BillingClient", "Got exception trying to get purchasesm try to reconnect", e2);
                f2Var = new f2(qa2.i, (Object) null);
            }
        }
        List<sg0> list = (List) f2Var.P;
        if (list != null) {
            this.b.c((da) f2Var.Q, list);
            return null;
        }
        fu5 fu5Var = ew5.Q;
        this.b.c((da) f2Var.Q, fk1.T);
        return null;
    }
}