package defpackage;

import android.media.MediaPlayer;
import android.os.PersistableBundle;
import android.widget.TextView;

/* renamed from: f6  reason: default package */
public final /* synthetic */ class f6 {
    public static /* bridge */ /* synthetic */ PersistableBundle a(MediaPlayer mediaPlayer) {
        return mediaPlayer.getMetrics();
    }

    public static /* bridge */ /* synthetic */ void b(TextView textView, String str) {
        textView.setFontVariationSettings(str);
    }
}