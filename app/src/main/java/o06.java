package defpackage;

import android.view.Surface;

/* renamed from: o06  reason: default package */
public final class o06 {
    public static void a(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            lb4.b("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}