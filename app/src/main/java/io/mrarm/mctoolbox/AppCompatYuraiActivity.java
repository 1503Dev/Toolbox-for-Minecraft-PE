package io.mrarm.mctoolbox;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import io.mrarm.yurai.YuraiActivity;
import java.lang.ref.WeakReference;

public abstract class AppCompatYuraiActivity extends YuraiActivity implements y4 {
    public f5 T;

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        p().c(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        p().d();
    }

    @Override // defpackage.y4
    public final void f() {
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

    @Override // android.app.NativeActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        p().i();
    }

    @Override // io.mrarm.yurai.YuraiActivity, com.mojang.minecraftpe.MainActivity, android.app.NativeActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        c5 p = p();
        p.g();
        p.j();
        super.onCreate(bundle);
    }

    @Override // com.mojang.minecraftpe.MainActivity, android.app.NativeActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        p().k();
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((f5) p()).D();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        p().l();
    }

    @Override // android.app.NativeActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        p().m();
    }

    @Override // android.app.NativeActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        p().n();
    }

    @Override // com.mojang.minecraftpe.MainActivity, android.app.NativeActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        p().o();
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        p().v(charSequence);
    }

    public final c5 p() {
        if (this.T == null) {
            g7<WeakReference<c5>> g7Var = c5.P;
            this.T = new f5(this, null, this, this);
        }
        return this.T;
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