package android.app;

import android.annotation.NonNull;
import android.app.Notification;
import android.graphics.drawable.Icon;
import android.os.Bundle;

public final /* synthetic */ class Notification$Action$Builder {
    static {
        throw new NoClassDefFoundError();
    }

    @Deprecated
    public /* synthetic */ Notification$Action$Builder(int i, CharSequence charSequence, PendingIntent pendingIntent) {
    }

    public /* synthetic */ Notification$Action$Builder(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
    }

    @NonNull
    public native /* synthetic */ Notification$Action$Builder addExtras(Bundle bundle);

    @NonNull
    public native /* synthetic */ Notification$Action$Builder addRemoteInput(RemoteInput remoteInput);

    @NonNull
    public native /* synthetic */ Notification.Action build();

    @NonNull
    public native /* synthetic */ Notification$Action$Builder setAllowGeneratedReplies(boolean z);
}