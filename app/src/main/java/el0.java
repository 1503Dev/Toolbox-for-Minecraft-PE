package defpackage;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: el0  reason: default package */
public final class el0 {
    public static el0 e;
    public final File c;
    public final ThreadPoolExecutor b = new ThreadPoolExecutor(0, 2, 1, TimeUnit.SECONDS, new SynchronousQueue());
    public final HashMap<String, b> d = new HashMap<>();
    public final nb0 a = new nb0();

    /* renamed from: el0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
        void a();

        void b();
    }

    /* renamed from: el0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b {
        public final String a;
        public final String b;
        public final File c;
        public final ArrayList d = new ArrayList();

        public b(String str, String str2, File file) {
            this.a = str;
            this.b = str2;
            this.c = file;
        }
    }

    /* renamed from: el0$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class c implements a {
        public final String[] a;
        public final String[] b;
        public final a c;
        public int d = 0;
        public int e = 0;

        public c(String[] strArr, String[] strArr2, ms0 ms0Var) {
            this.a = strArr;
            this.b = strArr2;
            this.c = ms0Var;
        }

        @Override // defpackage.el0.a
        public final void a() {
            int i = this.d + 1;
            this.d = i;
            if (i == this.a.length && this.e == 0) {
                a aVar = this.c;
                Objects.requireNonNull(aVar);
                h21.a(new l80(2, aVar));
            }
        }

        @Override // defpackage.el0.a
        public final void b() {
            if (this.e == 0) {
                a aVar = this.c;
                Objects.requireNonNull(aVar);
                h21.a(new t20(3, aVar));
            }
            this.e++;
        }
    }

    public el0(Context context) {
        this.c = context.getCacheDir();
    }
}