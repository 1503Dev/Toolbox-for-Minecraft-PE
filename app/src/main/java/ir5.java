package defpackage;

import android.annotation.NonNull;
import android.media.AudioAttributes;
import android.media.AudioFormat$Builder;
import android.media.AudioTrack;
import android.media.AudioTrack$Builder;

/* renamed from: ir5  reason: default package */
public final class ir5 {
    public final cu1 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final qp3 i;

    public ir5(cu1 cu1Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, qp3 qp3Var) {
        this.a = cu1Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = qp3Var;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [android.media.AudioTrack$Builder] */
    public final AudioTrack a(pm5 pm5Var, int i) {
        boolean z;
        AudioTrack audioTrack;
        boolean z2;
        boolean z3;
        AudioTrack$Builder offloadedPlayback;
        try {
            int i2 = zn4.a;
            if (i2 >= 29) {
                int i3 = this.e;
                int i4 = this.f;
                AudioTrack$Builder sessionId = new Object() { // from class: android.media.AudioTrack$Builder
                    static {
                        throw new NoClassDefFoundError();
                    }

                    @NonNull
                    public native /* synthetic */ AudioTrack build() throws UnsupportedOperationException;

                    @NonNull
                    public native /* synthetic */ AudioTrack$Builder setAudioAttributes(@NonNull AudioAttributes audioAttributes) throws IllegalArgumentException;

                    @NonNull
                    public native /* synthetic */ AudioTrack$Builder setAudioFormat(@NonNull AudioFormat audioFormat) throws IllegalArgumentException;

                    @NonNull
                    public native /* synthetic */ AudioTrack$Builder setBufferSizeInBytes(int i5) throws IllegalArgumentException;

                    @NonNull
                    public native /* synthetic */ AudioTrack$Builder setSessionId(int i5) throws IllegalArgumentException;

                    @NonNull
                    public native /* synthetic */ AudioTrack$Builder setTransferMode(int i5) throws IllegalArgumentException;
                }.setAudioAttributes(pm5Var.a().a).setAudioFormat(new AudioFormat$Builder().setSampleRate(i3).setChannelMask(i4).setEncoding(this.g).build()).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i);
                if (this.c == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                offloadedPlayback = sessionId.setOffloadedPlayback(z3);
                audioTrack = offloadedPlayback.build();
            } else if (i2 < 21) {
                pm5Var.getClass();
                if (i == 0) {
                    audioTrack = new AudioTrack(3, this.e, this.f, this.g, this.h, 1);
                } else {
                    audioTrack = new AudioTrack(3, this.e, this.f, this.g, this.h, 1, i);
                }
            } else {
                AudioAttributes audioAttributes = pm5Var.a().a;
                int i5 = this.e;
                int i6 = this.f;
                audioTrack = new AudioTrack(audioAttributes, new AudioFormat$Builder().setSampleRate(i5).setChannelMask(i6).setEncoding(this.g).build(), this.h, 1, i);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            int i7 = this.e;
            int i8 = this.f;
            int i9 = this.h;
            cu1 cu1Var = this.a;
            if (this.c == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            throw new qq5(state, i7, i8, i9, cu1Var, z2, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            int i10 = this.e;
            int i11 = this.f;
            int i12 = this.h;
            cu1 cu1Var2 = this.a;
            if (this.c == 1) {
                z = true;
            } else {
                z = false;
            }
            throw new qq5(0, i10, i11, i12, cu1Var2, z, e);
        }
    }
}