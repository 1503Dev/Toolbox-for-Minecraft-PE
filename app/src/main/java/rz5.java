package defpackage;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: rz5  reason: default package */
public final class rz5 {
    public static final nz5 d = new nz5(2, -9223372036854775807L);
    public static final nz5 e = new nz5(3, -9223372036854775807L);
    public final ExecutorService a;
    public oz5 b;
    public IOException c;

    public rz5() {
        int i = zn4.a;
        this.a = Executors.newSingleThreadExecutor(new en4("ExoPlayer:Loader:ProgressiveMediaPeriod"));
    }
}