package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: wn5  reason: default package */
public final class wn5 implements y6 {
    public static wn5 d;
    public final Context a;
    public boolean b;
    public final ExecutorService c;

    public wn5(Context context) {
        this.b = false;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.c = Executors.newSingleThreadExecutor();
        this.a = context;
        if (this.b) {
            return;
        }
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(new sj4(this), 0L, 86400L, TimeUnit.SECONDS);
        this.b = true;
    }

    public static final void b(Context context) {
        String str;
        SharedPreferences sharedPreferences = context.getSharedPreferences("app_set_id_storage", 0);
        if (!sharedPreferences.edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            String valueOf = String.valueOf(context.getPackageName());
            if (valueOf.length() != 0) {
                str = "Failed to store app set ID last used time for App ".concat(valueOf);
            } else {
                str = new String("Failed to store app set ID last used time for App ");
            }
            Log.e("AppSet", str);
            throw new qm5("Failed to store the app set ID last used time.");
        }
    }

    @Override // defpackage.y6
    public final yv0<z6> a() {
        aw0 aw0Var = new aw0();
        this.c.execute(new yr1(3, this, aw0Var));
        return aw0Var.a;
    }
}