package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* renamed from: r06  reason: default package */
public final class r06 implements Choreographer.FrameCallback, Handler.Callback {
    public static final r06 T = new r06();
    public volatile long P = -9223372036854775807L;
    public final Handler Q;
    public Choreographer R;
    public int S;

    public r06() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.Q = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.P = j;
        Choreographer choreographer = this.R;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            try {
                this.R = Choreographer.getInstance();
            } catch (RuntimeException e) {
                lb4.d("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
            return true;
        } else if (i == 1) {
            Choreographer choreographer = this.R;
            if (choreographer != null) {
                int i2 = this.S + 1;
                this.S = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            Choreographer choreographer2 = this.R;
            if (choreographer2 != null) {
                int i3 = this.S - 1;
                this.S = i3;
                if (i3 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.P = -9223372036854775807L;
                }
            }
            return true;
        }
    }
}