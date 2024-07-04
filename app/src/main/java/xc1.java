package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: xc1  reason: default package */
public final class xc1 extends ContentObserver {
    public AudioManager a;
    public i2 b;

    public xc1(Handler handler, i2 i2Var) {
        super(handler);
        Context context = ga1.P;
        if (context != null) {
            this.a = (AudioManager) context.getSystemService("audio");
            this.b = i2Var;
            context.getApplicationContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
        }
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AudioManager audioManager;
        i2 i2Var;
        if (this.a != null && (i2Var = this.b) != null && i2Var.c != null) {
            double streamVolume = (audioManager.getStreamVolume(3) / 15.0f) * 100.0f;
            ic1 ic1Var = new ic1();
            eb1.g(ic1Var, "audio_percentage", streamVolume);
            eb1.j(ic1Var, "ad_session_id", this.b.c.d0);
            eb1.l(this.b.c.b0, ic1Var, "id");
            new rc1(this.b.c.c0, ic1Var, "AdContainer.on_audio_change").b();
        }
    }
}