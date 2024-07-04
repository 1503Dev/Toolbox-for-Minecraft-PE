package defpackage;

import android.content.Context;
import android.media.AudioManager;

/* renamed from: oy2  reason: default package */
public final class oy2 implements AudioManager.OnAudioFocusChangeListener {
    public final AudioManager a;
    public final ny2 b;
    public boolean c;
    public boolean d;
    public boolean e;
    public float f = 1.0f;

    public oy2(Context context, ny2 ny2Var) {
        this.a = (AudioManager) context.getSystemService("audio");
        this.b = ny2Var;
    }

    public final void a() {
        boolean z = false;
        if (!this.d || this.e || this.f <= 0.0f) {
            if (this.c) {
                AudioManager audioManager = this.a;
                if (audioManager != null) {
                    if (audioManager.abandonAudioFocus(this) == 0) {
                        z = true;
                    }
                    this.c = z;
                }
                this.b.k();
            }
        } else if (this.c) {
        } else {
            AudioManager audioManager2 = this.a;
            if (audioManager2 != null) {
                if (audioManager2.requestAudioFocus(this, 3, 2) == 1) {
                    z = true;
                }
                this.c = z;
            }
            this.b.k();
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.c = i > 0;
        this.b.k();
    }
}