package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.c;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.g;

public class ComponentActivity extends androidx.core.app.ComponentActivity implements p41, kn0, vb0 {
    public final e Q;
    public final androidx.savedstate.b R;
    public o41 S;
    public final OnBackPressedDispatcher T;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class b {
        public o41 a;
    }

    public ComponentActivity() {
        e eVar = new e(this);
        this.Q = eVar;
        this.R = new androidx.savedstate.b(this);
        this.T = new OnBackPressedDispatcher(new a());
        int i = Build.VERSION.SDK_INT;
        eVar.a(new d() { // from class: androidx.activity.ComponentActivity.2
            @Override // androidx.lifecycle.d
            public final void d(b10 b10Var, c.b bVar) {
                if (bVar == c.b.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        eVar.a(new d() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.d
            public final void d(b10 b10Var, c.b bVar) {
                if (bVar != c.b.ON_DESTROY || ComponentActivity.this.isChangingConfigurations()) {
                    return;
                }
                ComponentActivity.this.i().a();
            }
        });
        if (i <= 23) {
            eVar.a(new ImmLeaksCleaner(this));
        }
    }

    @Override // defpackage.vb0
    public final OnBackPressedDispatcher a() {
        return this.T;
    }

    @Override // defpackage.kn0
    public final androidx.savedstate.a b() {
        return this.R.b;
    }

    @Override // defpackage.p41
    public final o41 i() {
        if (getApplication() != null) {
            if (this.S == null) {
                b bVar = (b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.S = bVar.a;
                }
                if (this.S == null) {
                    this.S = new o41();
                }
            }
            return this.S;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // androidx.core.app.ComponentActivity, defpackage.b10
    public final e k() {
        return this.Q;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.T.b();
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.R.a(bundle);
        g.c(this);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        b bVar;
        o41 o41Var = this.S;
        if (o41Var == null && (bVar = (b) getLastNonConfigurationInstance()) != null) {
            o41Var = bVar.a;
        }
        if (o41Var == null) {
            return null;
        }
        b bVar2 = new b();
        bVar2.a = o41Var;
        return bVar2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        e eVar = this.Q;
        if (eVar instanceof e) {
            c.EnumC0007c enumC0007c = c.EnumC0007c.CREATED;
            eVar.c("setCurrentState");
            eVar.e(enumC0007c);
        }
        super.onSaveInstanceState(bundle);
        this.R.b(bundle);
    }
}