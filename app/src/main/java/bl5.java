package defpackage;

import android.media.AudioAttributes;

/* renamed from: bl5  reason: default package */
public final class bl5 {
    public final AudioAttributes a;

    public /* synthetic */ bl5() {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i = zn4.a;
        if (i >= 29) {
            aj4.a(usage, 1);
        }
        if (i >= 32) {
            i25.a(usage, 0);
        }
        this.a = usage.build();
    }
}