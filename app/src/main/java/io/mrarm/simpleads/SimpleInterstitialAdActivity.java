package io.mrarm.simpleads;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.b;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import defpackage.rs0;
import defpackage.tv;
import io.mrarm.simpleads.SimpleInterstitialAdActivity;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.UUID;

public class SimpleInterstitialAdActivity extends AppCompatActivity {
    public static final /* synthetic */ int f0 = 0;
    public vs0 c0;
    public fs0 d0;
    public boolean e0;

    @Override // android.app.Activity
    public final void finish() {
        if (!this.c0.a()) {
            return;
        }
        vs0 vs0Var = this.c0;
        int i = 2;
        if (vs0Var.c == 2 && !vs0Var.b() && !this.e0) {
            b.a aVar = new b.a(this);
            AlertController.b bVar = aVar.a;
            bVar.d = bVar.a.getText(2131755287);
            AlertController.b bVar2 = aVar.a;
            bVar2.f = bVar2.a.getText(2131755286);
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: ss0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    SimpleInterstitialAdActivity simpleInterstitialAdActivity = SimpleInterstitialAdActivity.this;
                    simpleInterstitialAdActivity.e0 = true;
                    simpleInterstitialAdActivity.finish();
                }
            };
            AlertController.b bVar3 = aVar.a;
            bVar3.g = bVar3.a.getText(2131755040);
            AlertController.b bVar4 = aVar.a;
            bVar4.h = onClickListener;
            DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: ts0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    int i3 = SimpleInterstitialAdActivity.f0;
                }
            };
            bVar4.i = bVar4.a.getText(2131755039);
            aVar.a.j = onClickListener2;
            aVar.a().show();
            return;
        }
        vs0 vs0Var2 = this.c0;
        if (vs0Var2.c == 2 && vs0Var2.b()) {
            vs0 vs0Var3 = this.c0;
            if (!vs0Var3.j) {
                vs0Var3.j = true;
                rs0.b bVar5 = vs0Var3.h;
                if (bVar5 != null) {
                    ((tv.a) ((yd0) bVar5).a).d();
                }
            }
        }
        vs0 vs0Var4 = this.c0;
        if (!vs0Var4.j) {
            i = 1;
        }
        vs0Var4.e.c(vs0Var4.f, r1.b(i)).g(new qs0());
        rs0.a aVar2 = vs0Var4.g;
        if (aVar2 != null) {
            zd0.this.a.a();
        }
        super.finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
        if (r2.exists() != false) goto L15;
     */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        String str;
        File file;
        super.onCreate(bundle);
        try {
            this.c0 = (vs0) vs0.l.get(UUID.fromString(getIntent().getStringExtra("uuid")));
        } catch (IllegalArgumentException unused) {
        }
        vs0 vs0Var = this.c0;
        if (vs0Var == null) {
            finish();
            return;
        }
        el0 el0Var = vs0Var.d;
        String str2 = vs0Var.b.c;
        el0Var.getClass();
        try {
            str = Base64.encodeToString(MessageDigest.getInstance("MD5").digest(str2.getBytes(StandardCharsets.UTF_8)), 0);
        } catch (Exception unused2) {
            str = null;
        }
        if (str != null) {
            file = new File(el0Var.c, str);
        }
        file = null;
        if (file == null) {
            finish();
            rs0.a aVar = this.c0.g;
            if (aVar != null) {
                zd0.this.a.b();
                return;
            }
            return;
        }
        vs0 vs0Var2 = this.c0;
        vs0Var2.getClass();
        vs0Var2.i = System.currentTimeMillis();
        vs0Var2.e.e(vs0Var2.f).g(new qs0());
        LayoutInflater layoutInflater = getLayoutInflater();
        int i = fs0.k0;
        DataBinderMapperImpl dataBinderMapperImpl = jj.a;
        fs0 fs0Var = (fs0) jj.c(layoutInflater, 2131492988, null, ViewDataBinding.H(null));
        this.d0 = fs0Var;
        setContentView(fs0Var.T);
        this.d0.g0.setImageURI(Uri.fromFile(file));
        this.d0.e0.setOnClickListener(new View.OnClickListener() { // from class: us0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleInterstitialAdActivity simpleInterstitialAdActivity = SimpleInterstitialAdActivity.this;
                int i2 = SimpleInterstitialAdActivity.f0;
                simpleInterstitialAdActivity.finish();
            }
        });
        this.d0.g0.setOnClickListener(new iz0(2, this));
        r();
    }

    public final void r() {
        vs0 vs0Var = this.c0;
        if (vs0Var.c == 1) {
            if (vs0Var.a()) {
                this.d0.R(null);
            } else {
                fs0 fs0Var = this.d0;
                vs0 vs0Var2 = this.c0;
                fs0Var.R(getString(2131755289, String.valueOf((int) (((Math.min(Math.max((vs0Var2.i + (vs0Var2.b.f * 1000.0f)) - System.currentTimeMillis(), 0L), vs0Var2.b.f * 1000.0f) + 1000) - 1) / 1000))));
            }
        }
        vs0 vs0Var3 = this.c0;
        if (vs0Var3.c == 2) {
            if (vs0Var3.b()) {
                this.d0.S(null);
            } else {
                fs0 fs0Var2 = this.d0;
                vs0 vs0Var4 = this.c0;
                fs0Var2.S(getString(2131755288, String.valueOf((int) (((Math.min(Math.max((vs0Var4.i + (vs0Var4.b.g * 1000.0f)) - System.currentTimeMillis(), 0L), vs0Var4.b.g * 1000.0f) + 1000) - 1) / 1000))));
            }
        }
        this.d0.T.postDelayed(new dy0(2, this), 100L);
    }
}