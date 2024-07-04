package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* renamed from: me0  reason: default package */
public class me0 {
    public static final me0 b;
    public final boolean a;

    /* renamed from: me0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a extends me0 {

        /* renamed from: me0$a$a  reason: collision with other inner class name */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public static class ExecutorC0045a implements Executor {
            public final Handler P = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.P.post(runnable);
            }
        }

        public a() {
            super(Build.VERSION.SDK_INT >= 24);
        }

        @Override // defpackage.me0
        public final Executor a() {
            return new ExecutorC0045a();
        }
    }

    static {
        me0 me0Var;
        try {
            Class.forName("android.os.Build");
            me0Var = new a();
        } catch (ClassNotFoundException unused) {
            me0Var = new me0(true);
        }
        b = me0Var;
    }

    public me0(boolean z) {
        this.a = z;
    }

    @Nullable
    public static Object b(Method method, Class cls, Object obj, @Nullable Object... objArr) {
        Constructor declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
        declaredConstructor.setAccessible(true);
        return ((MethodHandles.Lookup) declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    @Nullable
    public Executor a() {
        return null;
    }
}