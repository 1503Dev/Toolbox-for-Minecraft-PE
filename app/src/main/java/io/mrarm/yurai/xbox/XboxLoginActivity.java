package io.mrarm.yurai.xbox;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import defpackage.z20;

public class XboxLoginActivity extends AppCompatActivity {
    public static long g0;
    public static final /* synthetic */ int h0 = 0;
    public long c0;
    public z20 d0;
    public boolean e0;
    public boolean f0;

    public static void r(String str, boolean z) {
        long j;
        Bundle bundle = new Bundle();
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        bundle.putLong("success", j);
        bundle.putString("result", str);
        j91.b.a(bundle, "xbl_login");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.d0.f(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.d0.c()) {
            synchronized (this) {
                if (this.f0) {
                    return;
                }
                this.e0 = true;
                runOnUiThread(new no(3, this));
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(mi0.xbox_sign_in_progress);
        long longExtra = getIntent().getLongExtra("native_ptr", 0L);
        this.c0 = longExtra;
        if (longExtra != g0) {
            this.c0 = 0L;
        }
        if (this.c0 == 0) {
            Log.i(" XboxLoginActivity", "Native pointer is invalid");
            finish();
            return;
        }
        je0 je0Var = new je0();
        this.d0 = je0Var;
        je0Var.a = this;
        try {
            je0Var.h();
        } catch (z20.a e) {
            Log.e("LoginStage", "Task failed");
            e.printStackTrace();
            je0Var.d(e.getMessage());
        }
    }
}