package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.c;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import defpackage.j00;

public class ComponentActivity extends Activity implements b10, j00.a {
    public e P;

    public ComponentActivity() {
        new os0();
        this.P = new e(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !j00.a(decorView, keyEvent)) {
            return j00.b(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !j00.a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // defpackage.j00.a
    public final boolean e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public e k() {
        return this.P;
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        g.c(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        e eVar = this.P;
        eVar.c("markState");
        c.EnumC0007c enumC0007c = c.EnumC0007c.CREATED;
        eVar.c("setCurrentState");
        eVar.e(enumC0007c);
        super.onSaveInstanceState(bundle);
    }
}