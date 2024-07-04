package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: mp5  reason: default package */
public final class mp5 extends BroadcastReceiver {
    public final ug0 a;
    public boolean b;
    public final /* synthetic */ eq5 c;

    public /* synthetic */ mp5(eq5 eq5Var, ug0 ug0Var) {
        this.c = eq5Var;
        this.a = ug0Var;
    }

    public static final void a(Bundle bundle, da daVar, int i) {
        if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
            try {
                byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
                hk2 hk2Var = hk2.b;
                if (hk2Var == null) {
                    synchronized (hk2.class) {
                        hk2Var = hk2.b;
                        if (hk2Var == null) {
                            hk2Var = mr2.b();
                            hk2.b = hk2Var;
                        }
                    }
                }
                rj4.q(byteArray, hk2Var);
                return;
            } catch (Throwable unused) {
                m82.e("BillingBroadcastManager", "Failed parsing Api failure.");
                return;
            }
        }
        tv2.u(23, i, daVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        ArrayList arrayList = null;
        if (extras == null) {
            m82.e("BillingBroadcastManager", "Bundle is null.");
            da daVar = qa2.g;
            tv2.u(11, 1, daVar);
            ug0 ug0Var = this.a;
            if (ug0Var != null) {
                ((ve0) ug0Var).c(daVar, null);
                return;
            }
            return;
        }
        da b = m82.b(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        String string = extras.getString("INTENT_SOURCE");
        int i = 2;
        if (string != "LAUNCH_BILLING_FLOW" && (string == null || !string.equals("LAUNCH_BILLING_FLOW"))) {
            i = 1;
        }
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            if (!extras.getBoolean("IS_FIRST_PARTY_PURCHASE", false) && this.a != null) {
                ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                ArrayList arrayList2 = new ArrayList();
                if (stringArrayList != null && stringArrayList2 != null) {
                    int size = stringArrayList.size();
                    m82.d("BillingHelper", "Found purchase list of " + size + " items");
                    for (int i2 = 0; i2 < stringArrayList.size() && i2 < stringArrayList2.size(); i2++) {
                        sg0 g = m82.g(stringArrayList.get(i2), stringArrayList2.get(i2));
                        if (g != null) {
                            arrayList2.add(g);
                        }
                    }
                } else {
                    sg0 g2 = m82.g(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"));
                    if (g2 == null) {
                        m82.d("BillingHelper", "Couldn't find single purchase data as well.");
                        if (b.a != 0) {
                            sl4 o = lm4.o();
                            o.d();
                            lm4.q((lm4) o.Q, i);
                            lm4 lm4Var = (lm4) o.a();
                        } else {
                            a(extras, b, i);
                        }
                        ((ve0) this.a).c(b, arrayList);
                        return;
                    }
                    arrayList2.add(g2);
                }
                arrayList = arrayList2;
                if (b.a != 0) {
                }
                ((ve0) this.a).c(b, arrayList);
                return;
            }
            m82.e("BillingBroadcastManager", "Received purchase and no valid listener registered.");
            tv2.u(12, i, qa2.g);
        } else if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (b.a != 0) {
                a(extras, b, i);
                ug0 ug0Var2 = this.a;
                fu5 fu5Var = ew5.Q;
                ((ve0) ug0Var2).c(b, fk1.T);
                return;
            }
            m82.e("BillingBroadcastManager", "AlternativeBillingListener is null.");
            da daVar2 = qa2.g;
            tv2.u(15, i, daVar2);
            ug0 ug0Var3 = this.a;
            fu5 fu5Var2 = ew5.Q;
            ((ve0) ug0Var3).c(daVar2, fk1.T);
        }
    }
}