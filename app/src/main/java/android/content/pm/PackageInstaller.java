package android.content.pm;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.os.Parcelable;
import java.util.List;

public /* synthetic */ class PackageInstaller {

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public /* synthetic */ class SessionInfo implements Parcelable {
        static {
            throw new NoClassDefFoundError();
        }

        @Nullable
        public native /* synthetic */ String getAppPackageName();
    }

    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public native /* synthetic */ List<SessionInfo> getAllSessions();
}