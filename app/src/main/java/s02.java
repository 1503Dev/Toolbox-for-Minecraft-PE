package defpackage;

import android.app.AppOpsManager;
import java.util.concurrent.ExecutorService;

/* renamed from: s02  reason: default package */
public final /* synthetic */ class s02 {
    public static /* bridge */ /* synthetic */ void a(AppOpsManager appOpsManager, String[] strArr, ExecutorService executorService, r02 r02Var) {
        appOpsManager.startWatchingActive(strArr, executorService, r02Var);
    }
}