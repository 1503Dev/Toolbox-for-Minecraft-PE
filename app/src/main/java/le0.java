package defpackage;

import android.app.job.JobParameters;
import android.net.Uri;
import java.lang.reflect.Method;

/* renamed from: le0 */
public final /* synthetic */ class le0 {
    public static /* bridge */ /* synthetic */ boolean a(Method method) {
        return method.isDefault();
    }

    public static /* bridge */ /* synthetic */ Uri[] b(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentUris();
    }
}