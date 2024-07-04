package android.app.job;

import android.annotation.NonNull;
import java.util.List;

public /* synthetic */ class JobScheduler {
    static {
        throw new NoClassDefFoundError();
    }

    public abstract /* synthetic */ void cancel(int i);

    @NonNull
    public abstract /* synthetic */ List<JobInfo> getAllPendingJobs();

    public abstract /* synthetic */ int schedule(@NonNull JobInfo jobInfo);
}