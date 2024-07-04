package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public static final /* synthetic */ int Q = 0;
    public int P = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.P = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                lt e = lt.e(this);
                if (i2 != -1) {
                    if (i2 == 0) {
                        e.f(new gf(13, null), getIntent().getIntExtra("failing_client_id", -1));
                    }
                } else {
                    aj1 aj1Var = e.b0;
                    aj1Var.sendMessage(aj1Var.obtainMessage(3));
                }
            }
        } else if (i == 2) {
            this.P = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.P = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (bundle != null) {
            this.P = bundle.getInt("resolution");
        }
        if (this.P != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                str = "Activity started without extras";
            } else {
                PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
                Integer num = (Integer) extras.get("error_code");
                if (pendingIntent == null && num == null) {
                    str = "Activity started without resolution";
                } else if (pendingIntent == null) {
                    uf0.f(num);
                    ht.d.e(this, num.intValue(), this);
                    this.P = 1;
                    return;
                } else {
                    try {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                        this.P = 1;
                        return;
                    } catch (ActivityNotFoundException e) {
                        if (extras.getBoolean("notify_manager", true)) {
                            lt.e(this).f(new gf(22, null), getIntent().getIntExtra("failing_client_id", -1));
                        } else {
                            String obj = pendingIntent.toString();
                            StringBuilder sb = new StringBuilder(obj.length() + 36);
                            sb.append("Activity not found while launching ");
                            sb.append(obj);
                            sb.append(".");
                            String sb2 = sb.toString();
                            if (Build.FINGERPRINT.contains("generic")) {
                                sb2 = sb2.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                            }
                            Log.e("GoogleApiActivity", sb2, e);
                        }
                        this.P = 1;
                    } catch (IntentSender.SendIntentException e2) {
                        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e2);
                    }
                }
            }
            Log.e("GoogleApiActivity", str);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.P);
        super.onSaveInstanceState(bundle);
    }
}