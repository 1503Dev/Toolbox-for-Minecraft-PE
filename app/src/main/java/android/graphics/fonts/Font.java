package android.graphics.fonts;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.content.res.Resources;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

public final /* synthetic */ class Font {

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final /* synthetic */ class Builder {
        static {
            throw new NoClassDefFoundError();
        }

        public /* synthetic */ Builder(@NonNull Resources resources, int i) {
        }

        public /* synthetic */ Builder(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
        }

        @NonNull
        public native /* synthetic */ Font build() throws IOException;

        @NonNull
        public native /* synthetic */ Builder setFontVariationSettings(@Nullable String str);

        @NonNull
        public native /* synthetic */ Builder setSlant(int i);

        @NonNull
        public native /* synthetic */ Builder setTtcIndex(int i);

        @NonNull
        public native /* synthetic */ Builder setWeight(int i);
    }

    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public native /* synthetic */ FontStyle getStyle();
}