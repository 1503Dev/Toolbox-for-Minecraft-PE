package defpackage;

import android.os.Environment;
import java.util.concurrent.Callable;

/* renamed from: j92  reason: default package */
public final /* synthetic */ class j92 implements Callable {
    public static final /* synthetic */ j92 a = new j92();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
    }
}