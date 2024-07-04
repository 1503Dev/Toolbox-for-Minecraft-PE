package defpackage;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.mojang.minecraftpe.MainActivity;
import io.mrarm.mctoolbox.MinecraftActivity;
import io.mrarm.mctoolbox.bridge.b;

/* renamed from: d70 */
public class d70 {
    public static void b(MinecraftActivity minecraftActivity) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(minecraftActivity);
        minecraftActivity.getClass();
        if (!b.o().c.Q) {
            if (System.currentTimeMillis() - defaultSharedPreferences.getLong("last_play_clicked_ad", 0L) < 3600000) {
                return;
            }
            minecraftActivity.U.b().a();
            defaultSharedPreferences.edit().putLong("last_play_clicked_ad", System.currentTimeMillis()).apply();
        }
    }

    public static void c() {
        MinecraftActivity minecraftActivity = (MinecraftActivity) MainActivity.currentMainActivity.get();
        minecraftActivity.runOnUiThread(new ap(minecraftActivity, 1));
    }
}