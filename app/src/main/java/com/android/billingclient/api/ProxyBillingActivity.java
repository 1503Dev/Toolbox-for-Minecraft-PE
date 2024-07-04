package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.io.IOException;
import java.util.logging.Logger;

@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivity extends Activity {
    public ResultReceiver P;
    public ResultReceiver Q;
    public boolean R;
    public boolean S;

    public final Intent a() {
        Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityResult(int i, int i2, Intent intent) {
        ResultReceiver resultReceiver;
        Intent a;
        Intent a2;
        int i3;
        ResultReceiver resultReceiver2;
        super.onActivityResult(i, i2, intent);
        Bundle bundle = null;
        if (i != 100 && i != 110) {
            if (i == 101) {
                if (intent == null) {
                    m82.e("ProxyBillingActivity", "Got null intent!");
                } else {
                    int i4 = m82.a;
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        m82.e("ProxyBillingActivity", "Unexpected null bundle received!");
                    } else {
                        i3 = extras.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
                        resultReceiver2 = this.Q;
                        if (resultReceiver2 != null) {
                            if (intent != null) {
                                bundle = intent.getExtras();
                            }
                            resultReceiver2.send(i3, bundle);
                        }
                    }
                }
                i3 = 0;
                resultReceiver2 = this.Q;
                if (resultReceiver2 != null) {
                }
            } else {
                m82.e("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i + "; skipping...");
            }
        } else {
            int i5 = m82.b(intent, "ProxyBillingActivity").a;
            if (i2 == -1) {
                if (i5 != 0) {
                    i2 = -1;
                } else {
                    i5 = 0;
                    resultReceiver = this.P;
                    if (resultReceiver == null) {
                        if (intent != null) {
                            bundle = intent.getExtras();
                        }
                        resultReceiver.send(i5, bundle);
                    } else {
                        if (intent != null) {
                            if (intent.getExtras() != null) {
                                String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                                if (string != null) {
                                    a2 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                                    a2.setPackage(getApplicationContext().getPackageName());
                                    a2.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                                } else {
                                    a = a();
                                    a.putExtras(intent.getExtras());
                                    a.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                                }
                            } else {
                                a2 = a();
                                m82.e("ProxyBillingActivity", "Got null bundle!");
                                a2.putExtra("RESPONSE_CODE", 6);
                                a2.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                                da daVar = new da();
                                daVar.a = 6;
                                daVar.b = "An internal error occurred.";
                                rj4 u = tv2.u(22, 2, daVar);
                                try {
                                    int i6 = u.i();
                                    byte[] bArr = new byte[i6];
                                    Logger logger = hg2.R;
                                    ld2 ld2Var = new ld2(bArr, i6);
                                    lr3 a3 = lq3.c.a(rj4.class);
                                    eh2 eh2Var = ld2Var.Q;
                                    if (eh2Var == null) {
                                        eh2Var = new eh2(ld2Var);
                                    }
                                    a3.h(u, eh2Var);
                                    if (i6 - ld2Var.V == 0) {
                                        a2.putExtra("FAILURE_LOGGING_PAYLOAD", bArr);
                                    } else {
                                        throw new IllegalStateException("Did not write as much data as expected.");
                                    }
                                } catch (IOException e) {
                                    throw new RuntimeException(ij.c("Serializing ", rj4.class.getName(), " to a byte array threw an IOException (should never happen)."), e);
                                }
                            }
                            a2.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                            a = a2;
                        } else {
                            a = a();
                        }
                        if (i == 110) {
                            a.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                        }
                        sendBroadcast(a);
                    }
                }
            }
            m82.e("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i5);
            resultReceiver = this.P;
            if (resultReceiver == null) {
            }
        }
        this.R = false;
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        int i;
        super.onCreate(bundle);
        if (bundle != null) {
            m82.d("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.R = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.P = (ResultReceiver) bundle.getParcelable("result_receiver");
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.Q = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.S = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            return;
        }
        m82.d("ProxyBillingActivity", "Launching Play Store billing flow");
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.S = true;
                i = 110;
            }
            i = 100;
        } else {
            if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                this.P = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                this.Q = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                i = 101;
            } else {
                pendingIntent = null;
            }
            i = 100;
        }
        try {
            this.R = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), i, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e) {
            m82.f("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
            ResultReceiver resultReceiver = this.P;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.Q;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent a = a();
                    if (this.S) {
                        a.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    a.putExtra("RESPONSE_CODE", 6);
                    a.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(a);
                }
            }
            this.R = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.R) {
            Intent a = a();
            a.putExtra("RESPONSE_CODE", 1);
            a.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(a);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        ResultReceiver resultReceiver = this.P;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.Q;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.R);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.S);
    }
}