package androidx.work;

import android.content.Context;
import androidx.work.a;
import java.util.Collections;
import java.util.List;

public final class WorkManagerInitializer implements qx<z61> {
    public static final String a = y20.e("WrkMgrInitializer");

    @Override // defpackage.qx
    public final List<Class<? extends qx<?>>> a() {
        return Collections.emptyList();
    }

    @Override // defpackage.qx
    public final a71 b(Context context) {
        y20.c().a(a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        a71.F1(context, new a(new a.C0013a()));
        return a71.E1(context);
    }
}