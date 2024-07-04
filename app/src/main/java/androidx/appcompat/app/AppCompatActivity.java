package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import defpackage.cg;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class AppCompatActivity extends FragmentActivity implements y4 {
    public f5 b0;

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        p().c(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        p().d();
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        q();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        q();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.y4
    public final void f() {
    }

    @Override // android.app.Activity
    public final <T extends View> T findViewById(int i) {
        return (T) p().e(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        return p().f();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = h31.a;
        return super.getResources();
    }

    @Override // defpackage.y4
    public final void h() {
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        p().h();
    }

    @Override // defpackage.y4
    public final void j() {
    }

    @Override // androidx.fragment.app.FragmentActivity
    public final void o() {
        p().h();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        p().i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        c5 p = p();
        p.g();
        p.j();
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        p().k();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent a;
        Intent component;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        b1 q = q();
        if (menuItem.getItemId() == 16908332 && q != null && (((k61) q).e.p() & 4) != 0 && (a = j70.a(this)) != null) {
            if (shouldUpRecreateTask(a)) {
                ArrayList arrayList = new ArrayList();
                Intent a2 = j70.a(this);
                if (a2 == null) {
                    a2 = j70.a(this);
                }
                if (a2 != null) {
                    ComponentName component2 = a2.getComponent();
                    if (component2 == null) {
                        component2 = a2.resolveActivity(getPackageManager());
                    }
                    int size = arrayList.size();
                    while (true) {
                        try {
                            String b = j70.b(this, component2);
                            if (b == null) {
                                component = null;
                            } else {
                                ComponentName componentName = new ComponentName(component2.getPackageName(), b);
                                if (j70.b(this, componentName) == null) {
                                    component = Intent.makeMainActivity(componentName);
                                } else {
                                    component = new Intent().setComponent(componentName);
                                }
                            }
                            if (component == null) {
                                break;
                            }
                            arrayList.add(size, component);
                            component2 = component.getComponent();
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                            throw new IllegalArgumentException(e);
                        }
                    }
                    arrayList.add(a2);
                }
                if (!arrayList.isEmpty()) {
                    Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                    Object obj = cg.a;
                    cg.a.a(this, intentArr, null);
                    try {
                        int i2 = j1.b;
                        finishAffinity();
                        return true;
                    } catch (IllegalStateException unused) {
                        finish();
                        return true;
                    }
                }
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            navigateUpTo(a);
            return true;
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((f5) p()).D();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        p().l();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        p().m();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        p().n();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        p().o();
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        p().v(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        q();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final c5 p() {
        if (this.b0 == null) {
            g7<WeakReference<c5>> g7Var = c5.P;
            this.b0 = new f5(this, null, this, this);
        }
        return this.b0;
    }

    public final b1 q() {
        f5 f5Var = (f5) p();
        f5Var.I();
        return f5Var.W;
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        p().r(i);
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        p().s(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        p().t(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        p().u(i);
    }
}