package io.mrarm.mctoolbox;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;

public class ErrorActivity extends AppCompatActivity {
    public static final /* synthetic */ int d0 = 0;
    public m1 c0;

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.databinding.DataBinderMapperImpl dataBinderMapperImpl = jj.a;
        setContentView(2131492893);
        this.c0 = (m1) jj.b(null, (ViewGroup) getWindow().getDecorView().findViewById(16908290), 0, 2131492893);
        ((k61) q()).e.n(16);
        k61 k61Var = (k61) q();
        k61Var.e.s(LayoutInflater.from(k61Var.c()).inflate(2131492894, (ViewGroup) k61Var.e.l(), false));
        this.c0.V(new zo(0, this));
        this.c0.W(new ap(this, 0));
        s(getIntent().getStringExtra("error"));
    }

    public final void r(String str) {
        try {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)));
            } catch (Throwable unused) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + str)));
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(String str) {
        boolean z;
        m1 m1Var;
        String string;
        char c;
        m1 m1Var2;
        int i;
        m1 m1Var3;
        int i2;
        if (str == null) {
            finish();
            return;
        }
        if (str.equals("not_installed")) {
            this.c0.U(2131755105);
            m1Var = this.c0;
            string = getString(2131755104);
        } else {
            if (str.equals("not_supported")) {
                try {
                    PackageInfo packageInfo = getPackageManager().getPackageInfo("com.mojang.minecraftpe", 0);
                    i60 a = i60.a(this);
                    if (a.c(packageInfo.versionName, true) || a.c(packageInfo.versionName, false)) {
                        finish();
                    }
                    String str2 = a.a.b;
                    String str3 = packageInfo.versionName;
                    int[] d = i60.d(str2);
                    int[] d2 = i60.d(str3);
                    int i3 = 0;
                    while (true) {
                        if (i3 < 4) {
                            int i4 = d[i3];
                            int i5 = d2[i3];
                            if (i4 > i5) {
                                c = 65535;
                                break;
                            } else if (i4 < i5) {
                                c = 1;
                                break;
                            } else {
                                i3++;
                            }
                        } else {
                            c = 0;
                            break;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    s("not_installed");
                    return;
                } catch (IllegalArgumentException unused2) {
                }
                if (c < 0) {
                    z = true;
                    if (!z) {
                        this.c0.U(2131755117);
                        m1Var = this.c0;
                        string = getString(2131755116, i60.a(this).b());
                    } else {
                        this.c0.U(2131755113);
                        this.c0.T(getString(2131755112, i60.a(this).b()));
                        this.c0.R(true);
                    }
                }
                z = false;
                if (!z) {
                }
            } else {
                if (str.equals("not_supported_64bit")) {
                    this.c0.U(2131755111);
                    m1Var3 = this.c0;
                    i2 = 2131755110;
                } else {
                    if (str.equals("not_supported_64bit_on_32bit")) {
                        this.c0.U(2131755108);
                        m1Var2 = this.c0;
                        i = 2131755107;
                    } else if (str.equals("not_supported_32bit")) {
                        this.c0.U(2131755109);
                        m1Var3 = this.c0;
                        i2 = 2131755106;
                    } else if (str.equals("test")) {
                        this.c0.U(2131755114);
                        m1Var2 = this.c0;
                        i = 2131755115;
                    } else {
                        finish();
                        return;
                    }
                    m1Var2.T(getString(i));
                    this.c0.R(true);
                    this.c0.S(false);
                    return;
                }
                m1Var3.T(getString(i2));
                this.c0.R(false);
            }
            this.c0.S(true);
            return;
        }
        m1Var.T(string);
        this.c0.R(true);
    }
}