package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import defpackage.wu0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: bm0  reason: default package */
public abstract class bm0 {
    @Deprecated
    public volatile vu0 a;
    public Executor b;
    public wu0 c;
    public final iy d;
    public boolean e;
    public boolean f;
    @Deprecated
    public List<b> g;
    public final ReentrantReadWriteLock h = new ReentrantReadWriteLock();
    public final ThreadLocal<Integer> i = new ThreadLocal<>();

    /* renamed from: bm0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a<T extends bm0> {
        public final String b;
        public final Context c;
        public ArrayList<b> d;
        public Executor e;
        public Executor f;
        public wu0.c g;
        public boolean h;
        public boolean j;
        public HashSet l;
        public final Class<T> a = WorkDatabase.class;
        public boolean i = true;
        public final c k = new c();

        public a(Context context, String str) {
            this.c = context;
            this.b = str;
        }

        public final void a(f60... f60VarArr) {
            if (this.l == null) {
                this.l = new HashSet();
            }
            for (f60 f60Var : f60VarArr) {
                this.l.add(Integer.valueOf(f60Var.a));
                this.l.add(Integer.valueOf(f60Var.b));
            }
            c cVar = this.k;
            cVar.getClass();
            for (f60 f60Var2 : f60VarArr) {
                int i = f60Var2.a;
                int i2 = f60Var2.b;
                TreeMap<Integer, f60> treeMap = cVar.a.get(Integer.valueOf(i));
                if (treeMap == null) {
                    treeMap = new TreeMap<>();
                    cVar.a.put(Integer.valueOf(i), treeMap);
                }
                f60 f60Var3 = treeMap.get(Integer.valueOf(i2));
                if (f60Var3 != null) {
                    Log.w("ROOM", "Overriding migration " + f60Var3 + " with " + f60Var2);
                }
                treeMap.put(Integer.valueOf(i2), f60Var2);
            }
        }
    }

    /* renamed from: bm0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class b {
        public void a(es esVar) {
        }
    }

    /* renamed from: bm0$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class c {
        public HashMap<Integer, TreeMap<Integer, f60>> a = new HashMap<>();
    }

    public bm0() {
        new ConcurrentHashMap();
        this.d = d();
    }

    public final void a() {
        boolean z;
        if (this.e) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
    }

    public final void b() {
        if (!((es) this.c.x()).P.inTransaction() && this.i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public final void c() {
        a();
        vu0 x = this.c.x();
        this.d.c(x);
        ((es) x).a();
    }

    public abstract iy d();

    public abstract wu0 e(pj pjVar);

    @Deprecated
    public final void f() {
        ((es) this.c.x()).d();
        if (!((es) this.c.x()).P.inTransaction()) {
            iy iyVar = this.d;
            if (iyVar.d.compareAndSet(false, true)) {
                iyVar.c.b.execute(iyVar.i);
            }
        }
    }

    public final Cursor g(xu0 xu0Var) {
        a();
        b();
        return ((es) this.c.x()).y(xu0Var);
    }

    @Deprecated
    public final void h() {
        ((es) this.c.x()).F();
    }
}