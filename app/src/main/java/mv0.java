package defpackage;

import android.annotation.NonNull;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest$Builder;
import android.os.Build;
import android.os.Parcelable;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import defpackage.bg;
import java.util.Iterator;

/* renamed from: mv0  reason: default package */
public final class mv0 {
    public static final String b = y20.e("SystemJobInfoConverter");
    public final ComponentName a;

    public mv0(Context context) {
        this.a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
        if (r2 < 26) goto L56;
     */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.app.job.JobInfo$Builder] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.app.job.JobInfo$TriggerContentUri] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JobInfo a(l71 l71Var, int i) {
        boolean z;
        int i2;
        sf sfVar = l71Var.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", l71Var.a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", l71Var.c());
        JobInfo.Builder extras = new Object(i, this.a) { // from class: android.app.job.JobInfo.Builder
            static {
                throw new NoClassDefFoundError();
            }

            public native /* synthetic */ Builder addTriggerContentUri(@NonNull TriggerContentUri triggerContentUri);

            public native /* synthetic */ JobInfo build();

            public native /* synthetic */ Builder setBackoffCriteria(long j, int i3);

            public native /* synthetic */ Builder setExtras(@NonNull PersistableBundle persistableBundle2);

            public native /* synthetic */ Builder setMinimumLatency(long j);

            public native /* synthetic */ Builder setPersisted(boolean z2);

            public native /* synthetic */ Builder setRequiredNetworkType(int i3);

            public native /* synthetic */ Builder setRequiresCharging(boolean z2);

            public native /* synthetic */ Builder setRequiresDeviceIdle(boolean z2);

            public native /* synthetic */ Builder setTriggerContentMaxDelay(long j);

            public native /* synthetic */ Builder setTriggerContentUpdateDelay(long j);
        }.setRequiresCharging(sfVar.b).setRequiresDeviceIdle(sfVar.c).setExtras(persistableBundle);
        o90 o90Var = sfVar.a;
        int i3 = Build.VERSION.SDK_INT;
        boolean z2 = false;
        if (i3 >= 30 && o90Var == o90.TEMPORARILY_UNMETERED) {
            extras.setRequiredNetwork(new NetworkRequest$Builder().addCapability(25).build());
        } else {
            int ordinal = o90Var.ordinal();
            int i4 = 4;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal == 4) {
                            }
                            y20.c().a(b, String.format("API version too low. Cannot convert network type value %s", o90Var), new Throwable[0]);
                        } else {
                            if (i3 >= 24) {
                                i4 = 3;
                            }
                            y20.c().a(b, String.format("API version too low. Cannot convert network type value %s", o90Var), new Throwable[0]);
                        }
                    } else {
                        i4 = 2;
                    }
                }
                i4 = 1;
            } else {
                i4 = 0;
            }
            extras.setRequiredNetworkType(i4);
        }
        if (!sfVar.c) {
            if (l71Var.l == 2) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            extras.setBackoffCriteria(l71Var.m, i2);
        }
        long max = Math.max(l71Var.a() - System.currentTimeMillis(), 0L);
        if (i3 <= 28 || max > 0) {
            extras.setMinimumLatency(max);
        } else if (!l71Var.q) {
            extras.setImportantWhileForeground(true);
        }
        if (i3 >= 24) {
            if (sfVar.h.a.size() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Iterator it = sfVar.h.a.iterator();
                while (it.hasNext()) {
                    bg.a aVar = (bg.a) it.next();
                    extras.addTriggerContentUri(new Parcelable(aVar.a, aVar.b ? 1 : 0) { // from class: android.app.job.JobInfo.TriggerContentUri
                        static {
                            throw new NoClassDefFoundError();
                        }
                    });
                }
                extras.setTriggerContentUpdateDelay(sfVar.f);
                extras.setTriggerContentMaxDelay(sfVar.g);
            }
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(sfVar.d);
            extras.setRequiresStorageNotLow(sfVar.e);
        }
        if (l71Var.k > 0) {
            z2 = true;
        }
        if (cb.a() && l71Var.q && !z2) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}