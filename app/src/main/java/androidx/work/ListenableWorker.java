package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public abstract class ListenableWorker {
    public Context P;
    public WorkerParameters Q;
    public volatile boolean R;
    public boolean S;
    public boolean T;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class a {

        /* renamed from: androidx.work.ListenableWorker$a$a  reason: collision with other inner class name */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public static final class C0012a extends a {
            public final androidx.work.b a = androidx.work.b.c;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0012a.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((C0012a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode() + (C0012a.class.getName().hashCode() * 31);
            }

            public final String toString() {
                StringBuilder b = e5.b("Failure {mOutputData=");
                b.append(this.a);
                b.append('}');
                return b.toString();
            }
        }

        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public static final class b extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public final int hashCode() {
                return b.class.getName().hashCode();
            }

            public final String toString() {
                return "Retry";
            }
        }

        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public static final class c extends a {
            public final androidx.work.b a;

            public c() {
                this(androidx.work.b.c);
            }

            public c(androidx.work.b bVar) {
                this.a = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode() + (c.class.getName().hashCode() * 31);
            }

            public final String toString() {
                StringBuilder b = e5.b("Success {mOutputData=");
                b.append(this.a);
                b.append('}');
                return b.toString();
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.P = context;
        this.Q = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.P;
    }

    public Executor getBackgroundExecutor() {
        return this.Q.f;
    }

    public i20<br> getForegroundInfoAsync() {
        yq0 yq0Var = new yq0();
        yq0Var.k(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return yq0Var;
    }

    public final UUID getId() {
        return this.Q.a;
    }

    public final b getInputData() {
        return this.Q.b;
    }

    public final Network getNetwork() {
        return this.Q.d.c;
    }

    public final int getRunAttemptCount() {
        return this.Q.e;
    }

    public final Set<String> getTags() {
        return this.Q.c;
    }

    public bw0 getTaskExecutor() {
        return this.Q.g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.Q.d.a;
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.Q.d.b;
    }

    public u71 getWorkerFactory() {
        return this.Q.h;
    }

    public boolean isRunInForeground() {
        return this.T;
    }

    public final boolean isStopped() {
        return this.R;
    }

    public final boolean isUsed() {
        return this.S;
    }

    public void onStopped() {
    }

    public final i20<Void> setForegroundAsync(br brVar) {
        this.T = true;
        er erVar = this.Q.j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        x61 x61Var = (x61) erVar;
        x61Var.getClass();
        yq0 yq0Var = new yq0();
        ((b71) x61Var.a).a(new w61(x61Var, yq0Var, id, brVar, applicationContext));
        return yq0Var;
    }

    public i20<Void> setProgressAsync(b bVar) {
        fg0 fg0Var = this.Q.i;
        getApplicationContext();
        UUID id = getId();
        j71 j71Var = (j71) fg0Var;
        j71Var.getClass();
        yq0 yq0Var = new yq0();
        ((b71) j71Var.b).a(new i71(j71Var, id, bVar, yq0Var));
        return yq0Var;
    }

    public void setRunInForeground(boolean z) {
        this.T = z;
    }

    public final void setUsed() {
        this.S = true;
    }

    public abstract i20<a> startWork();

    public final void stop() {
        this.R = true;
        onStopped();
    }
}