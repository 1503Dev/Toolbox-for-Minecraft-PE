package android.app.job;

import android.annotation.NonNull;
import android.content.ComponentName;
import android.os.Parcelable;
import android.os.PersistableBundle;

public /* synthetic */ class JobInfo implements Parcelable {
    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public native /* synthetic */ PersistableBundle getExtras();

    public native /* synthetic */ int getId();

    @NonNull
    public native /* synthetic */ ComponentName getService();
}