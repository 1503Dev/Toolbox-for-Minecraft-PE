package defpackage;

import android.media.AudioManager;
import android.os.Handler;

/* renamed from: jk5  reason: default package */
public final class jk5 implements AudioManager.OnAudioFocusChangeListener {
    public final Handler a;
    public final /* synthetic */ lk5 b;

    public jk5(lk5 lk5Var, Handler handler) {
        this.b = lk5Var;
        this.a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        this.a.post(new Runnable() { // from class: ik5
            @Override // java.lang.Runnable
            public final void run() {
                int i2;
                jk5 jk5Var = jk5.this;
                int i3 = i;
                lk5 lk5Var = jk5Var.b;
                if (i3 == -3 || i3 == -2) {
                    if (i3 != -2) {
                        i2 = 3;
                    } else {
                        lk5Var.b(0);
                        i2 = 2;
                    }
                    lk5Var.c(i2);
                } else if (i3 == -1) {
                    lk5Var.b(-1);
                    lk5Var.a();
                } else if (i3 == 1) {
                    lk5Var.c(1);
                    lk5Var.b(1);
                } else {
                    lb4.c("AudioFocusManager", "Unknown focus change type: " + i3);
                }
            }
        });
    }
}