package android.media;

import android.annotation.NonNull;

public /* synthetic */ class AudioFormat$Builder {
    static {
        throw new NoClassDefFoundError();
    }

    public native /* synthetic */ AudioFormat build();

    @NonNull
    public native /* synthetic */ AudioFormat$Builder setChannelMask(int i);

    public native /* synthetic */ AudioFormat$Builder setEncoding(int i) throws IllegalArgumentException;

    public native /* synthetic */ AudioFormat$Builder setSampleRate(int i) throws IllegalArgumentException;
}