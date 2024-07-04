package android.media;

import android.annotation.NonNull;
import android.os.Parcelable;

public final /* synthetic */ class AudioAttributes implements Parcelable {

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public /* synthetic */ class Builder {
        static {
            throw new NoClassDefFoundError();
        }

        public native /* synthetic */ AudioAttributes build();

        public native /* synthetic */ Builder setContentType(int i);

        public native /* synthetic */ Builder setFlags(int i);

        @NonNull
        public native /* synthetic */ Builder setSpatializationBehavior(int i);

        public native /* synthetic */ Builder setUsage(int i);
    }

    static {
        throw new NoClassDefFoundError();
    }
}