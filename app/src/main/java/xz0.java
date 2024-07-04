package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.widget.PopupWindow;
import androidx.databinding.f;
import defpackage.mz0;
import defpackage.yz0;
import io.mrarm.mctoolbox.bridge.b;
import io.mrarm.mctoolbox.ui.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;

/* renamed from: xz0  reason: default package */
public final class xz0 implements mw, wv, SharedPreferences.OnSharedPreferenceChangeListener {
    public final Activity a;
    public final zv b;
    public final g21 d;
    public final yz0 e;
    public final ky0 f;
    public final mz0 g;
    public final az0 h;
    public final ya0 n;
    public final ya0 o;
    public final br0 p;
    public final s01 q;
    public final s01 r;
    public final s01 s;
    public final br0 t;
    public final br0 u;
    public final ya0 v;
    public final ya0 w;
    public final ya0 x;
    public final w20 y;
    public final ab0 z;
    public final Handler c = new Handler();
    public final f i = new f();
    public final HashMap j = new HashMap();
    public final f k = new f();
    public final HashSet l = new HashSet();
    public final ArrayList m = new ArrayList();

    public xz0(final Activity activity, ve0 ve0Var, tv tvVar, by0 by0Var, iy0 iy0Var, b bVar) {
        ya0 ya0Var = new ya0();
        this.n = ya0Var;
        ya0 ya0Var2 = new ya0();
        this.o = ya0Var2;
        this.w = new ya0();
        this.x = new ya0();
        ab0 ab0Var = new ab0(1.0f);
        this.z = ab0Var;
        this.a = activity;
        this.b = iy0Var;
        br0 br0Var = new br0(bVar, "android/native/in_menu");
        this.p = br0Var;
        br0 br0Var2 = new br0(bVar, "minimap/enabled");
        this.t = br0Var2;
        s01 a = jb0.a(new we0(this), ya0Var, ya0Var2);
        this.q = a;
        s01 a2 = jb0.a(new ey0(0, this), ya0Var, ya0Var2, br0Var);
        this.r = a2;
        s01 a3 = jb0.a(new yd(this), br0Var2, a2);
        this.s = a3;
        a.h();
        a2.h();
        a3.h();
        final ny0 ny0Var = new ny0(activity, ve0Var, tvVar, by0Var, iy0Var, bVar);
        final no noVar = new no(2, ny0Var);
        ny0Var.b("enchant", new Runnable() { // from class: my0
            public final /* synthetic */ boolean Q = true;

            @Override // java.lang.Runnable
            public final void run() {
                ny0 ny0Var2 = ny0.this;
                boolean z = this.Q;
                Runnable runnable = noVar;
                if (!((b) ny0Var2.b).c.Q && (!z || ((iy0) ny0Var2.c).O())) {
                    new n21(new ContextThemeWrapper(ny0Var2.a, 2131820553), ny0Var2.b, ny0Var2.e, ny0Var2.d, false).show();
                } else {
                    runnable.run();
                }
            }
        });
        final mk0 mk0Var = new mk0(1, ny0Var);
        ny0Var.b("add_item", new Runnable() { // from class: my0
            public final /* synthetic */ boolean Q = true;

            @Override // java.lang.Runnable
            public final void run() {
                ny0 ny0Var2 = ny0.this;
                boolean z = this.Q;
                Runnable runnable = mk0Var;
                if (!((b) ny0Var2.b).c.Q && (!z || ((iy0) ny0Var2.c).O())) {
                    new n21(new ContextThemeWrapper(ny0Var2.a, 2131820553), ny0Var2.b, ny0Var2.e, ny0Var2.d, false).show();
                } else {
                    runnable.run();
                }
            }
        });
        ny0Var.b("tp_player", new nk0(1, ny0Var));
        ny0Var.b("spawn_exp", new ok0(1, ny0Var));
        g21 g21Var = new g21(activity, bVar, ny0Var, this, this, iy0Var, tvVar, ve0Var);
        this.d = g21Var;
        this.f = new ky0(activity, this);
        mz0 mz0Var = new mz0(activity, new mz0.a());
        this.g = mz0Var;
        mz0Var.e().setBackground(new zf0(bVar, activity.getResources().getDrawable(2131231012)));
        mz0Var.g(a);
        mz0Var.f(ab0Var);
        az0 az0Var = new az0(activity, g21Var, bVar, tvVar, ve0Var);
        this.h = az0Var;
        ny0Var.h = az0Var;
        mz0Var.getContentView().setOnClickListener(new iz0(0, new Runnable() { // from class: vz0
            @Override // java.lang.Runnable
            public final void run() {
                xz0 xz0Var = this;
                Activity activity2 = activity;
                az0 az0Var2 = xz0Var.h;
                az0Var2.getClass();
                az0Var2.showAtLocation(activity2.getWindow().getDecorView(), 119, 0, 0);
                xz0Var.n.H(true);
            }
        }));
        az0Var.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: wz0
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                xz0.this.n.H(false);
            }
        });
        Iterator it = g21Var.c.iterator();
        while (it.hasNext()) {
            this.m.add(new uz0(activity, (ow) it.next(), this.r));
        }
        new qy0(activity, this.s, bVar);
        br0 br0Var3 = new br0(bVar, "nbt_editor/enabled");
        this.u = br0Var3;
        ya0 ya0Var3 = new ya0(false);
        this.v = ya0Var3;
        s01 a4 = jb0.a(new q10(this), this.r, br0Var3, ya0Var3);
        s01 a5 = jb0.a(new r10(this), this.r, br0Var3, ya0Var3);
        a4.h();
        a5.h();
        d dVar = new d(activity, bVar, iy0Var);
        xa0 xa0Var = dVar.p;
        ya0 ya0Var4 = xa0Var.c;
        if (ya0Var4 != null) {
            ya0Var4.z(xa0Var.d);
        }
        xa0Var.c = a4;
        a4.a(xa0Var.d);
        xa0Var.d.g(0, null);
        dVar.q = ya0Var3;
        new b01(activity, new d.a(), a5, this.z, this.f).a(true);
        yz0 yz0Var = new yz0(activity, this);
        this.e = yz0Var;
        try {
            FileReader fileReader = new FileReader(new File(yz0Var.a.getFilesDir(), "toolbox_ui.json"));
            mz0.a aVar = yz0Var.c.g.b;
            mz0.a aVar2 = ((yz0.a) yz0Var.b.d(fileReader, yz0.a.class)).a;
            aVar.getClass();
            if (aVar2 != null) {
                aVar.a = aVar2.a;
                aVar.b = aVar2.b;
            }
            fileReader.close();
        } catch (FileNotFoundException unused) {
        } catch (Exception e) {
            Log.e("ToolboxUIStorage", "Error during UI config loading");
            e.printStackTrace();
        }
        mz0.a aVar3 = this.g.b;
        yz0 yz0Var2 = this.e;
        Objects.requireNonNull(yz0Var2);
        aVar3.c.add(new iz(2, yz0Var2));
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(activity);
        this.z.H(defaultSharedPreferences.getFloat("shortcut_alpha", 1.0f));
        ab0 ab0Var2 = this.z;
        if (ab0Var2.Q < 0.5f) {
            ab0Var2.H(1.0f);
            defaultSharedPreferences.edit().putFloat("shortcut_alpha", 1.0f).apply();
        }
        this.w.H(defaultSharedPreferences.getBoolean("log_overlay_enabled", false));
        s01 a6 = jb0.a(new yd0(this), this.w, this.o);
        a6.h();
        xa0 xa0Var2 = new v20(activity).b;
        ya0 ya0Var5 = xa0Var2.c;
        if (ya0Var5 != null) {
            ya0Var5.z(xa0Var2.d);
        }
        xa0Var2.c = a6;
        a6.a(xa0Var2.d);
        xa0Var2.d.g(0, null);
        w20 w20Var = new w20(activity);
        this.y = w20Var;
        w20Var.a(defaultSharedPreferences.getBoolean("logcat_record_active", false));
        this.x.H(defaultSharedPreferences.getBoolean("show_premium_expire_popup", true));
        fz0 fz0Var = new fz0(activity, bVar, tvVar, ve0Var);
        s01 a7 = jb0.a(new vd(1, this), this.x, this.q);
        a7.h();
        ya0 ya0Var6 = fz0Var.e;
        if (ya0Var6 != null) {
            ya0Var6.z(fz0Var.f);
        }
        fz0Var.e = a7;
        a7.a(fz0Var.f);
        fz0Var.f.g(0, null);
        fz0Var.b();
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
    }

    public final hy0 a(UUID uuid) {
        if (!this.l.contains(uuid)) {
            hy0 hy0Var = new hy0(this.a, this.c, this.b, this.r, this.z, this.f, uuid);
            this.l.add(uuid);
            this.k.add(hy0Var);
            yz0 yz0Var = this.e;
            Objects.requireNonNull(yz0Var);
            hy0Var.o.add(new t20(2, yz0Var));
            return hy0Var;
        }
        throw new InvalidParameterException("Duplicate UUID");
    }

    public final y21 b(lw lwVar) {
        if (this.j.containsKey(lwVar)) {
            return (y21) this.j.get(lwVar);
        }
        b01 b01Var = new b01(this.a, lwVar, this.r, this.z, this.f);
        b01Var.a(true);
        this.i.add(b01Var);
        this.j.put(lwVar, b01Var);
        mz0.a aVar = b01Var.f;
        yz0 yz0Var = this.e;
        Objects.requireNonNull(yz0Var);
        aVar.c.add(new l80(1, yz0Var));
        this.e.a();
        return b01Var;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals("shortcut_alpha")) {
            this.z.H(sharedPreferences.getFloat("shortcut_alpha", 1.0f));
        }
        if (str.equals("log_overlay_enabled")) {
            this.w.H(sharedPreferences.getBoolean("log_overlay_enabled", false));
        }
        if (str.equals("logcat_record_active")) {
            this.y.a(sharedPreferences.getBoolean("logcat_record_active", false));
        }
        if (str.equals("show_premium_expire_popup")) {
            this.x.H(sharedPreferences.getBoolean("show_premium_expire_popup", false));
        }
    }
}