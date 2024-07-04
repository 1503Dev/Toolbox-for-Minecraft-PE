package defpackage;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import defpackage.hn0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: iy  reason: default package */
public final class iy {
    public static final String[] j = {"UPDATE", "DELETE", "INSERT"};
    public final String[] b;
    public final bm0 c;
    public volatile is f;
    public b g;
    public AtomicBoolean d = new AtomicBoolean(false);
    public volatile boolean e = false;
    @SuppressLint({"RestrictedApi"})
    public final hn0<c, d> h = new hn0<>();
    public a i = new a();
    public final HashMap<String, Integer> a = new HashMap<>();

    /* renamed from: iy$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public a() {
        }

        public final HashSet b() {
            HashSet hashSet = new HashSet();
            Cursor g = iy.this.c.g(new ys0("SELECT * FROM room_table_modification_log WHERE invalidated = 1;", (Object) null));
            while (g.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(g.getInt(0)));
                } catch (Throwable th) {
                    g.close();
                    throw th;
                }
            }
            g.close();
            if (!hashSet.isEmpty()) {
                iy.this.f.E();
            }
            return hashSet;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00ad A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            ReentrantReadWriteLock.ReadLock readLock = iy.this.c.h.readLock();
            HashSet hashSet = null;
            try {
                try {
                    readLock.lock();
                } finally {
                    readLock.unlock();
                }
            } catch (SQLiteException e) {
                e = e;
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                if (hashSet != null) {
                }
                return;
            } catch (IllegalStateException e2) {
                e = e2;
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                if (hashSet != null) {
                }
            }
            if (!iy.this.a()) {
                return;
            }
            if (!iy.this.d.compareAndSet(true, false)) {
                return;
            }
            if (((es) iy.this.c.c.x()).P.inTransaction()) {
                return;
            }
            bm0 bm0Var = iy.this.c;
            if (bm0Var.f) {
                es esVar = (es) bm0Var.c.x();
                esVar.a();
                try {
                    hashSet = b();
                    esVar.F();
                    esVar.d();
                } catch (Throwable th) {
                    esVar.d();
                    throw th;
                }
            } else {
                hashSet = b();
            }
            if (hashSet != null && !hashSet.isEmpty()) {
                synchronized (iy.this.h) {
                    hn0.e eVar = (hn0.e) iy.this.h.iterator();
                    if (eVar.hasNext()) {
                        ((d) ((Map.Entry) eVar.next()).getValue()).getClass();
                        throw null;
                    }
                }
            }
        }
    }

    /* renamed from: iy$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b {
        public final long[] a;
        public final boolean[] b;
        public final int[] c;
        public boolean d;
        public boolean e;

        public b(int i) {
            long[] jArr = new long[i];
            this.a = jArr;
            boolean[] zArr = new boolean[i];
            this.b = zArr;
            this.c = new int[i];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        public final int[] a() {
            synchronized (this) {
                if (this.d && !this.e) {
                    int length = this.a.length;
                    int i = 0;
                    while (true) {
                        int i2 = 1;
                        if (i >= length) {
                            this.e = true;
                            this.d = false;
                            return this.c;
                        }
                        boolean z = this.a[i] > 0;
                        boolean[] zArr = this.b;
                        if (z != zArr[i]) {
                            int[] iArr = this.c;
                            if (!z) {
                                i2 = 2;
                            }
                            iArr[i] = i2;
                        } else {
                            this.c[i] = 0;
                        }
                        zArr[i] = z;
                        i++;
                    }
                }
                return null;
            }
        }
    }

    /* renamed from: iy$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class c {
        public abstract void a(Set<String> set);
    }

    /* renamed from: iy$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class d {
    }

    public iy(bm0 bm0Var, HashMap hashMap, HashMap hashMap2, String... strArr) {
        this.c = bm0Var;
        this.g = new b(strArr.length);
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.b = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.a.put(lowerCase, Integer.valueOf(i));
            String str2 = (String) hashMap.get(strArr[i]);
            if (str2 != null) {
                this.b[i] = str2.toLowerCase(locale);
            } else {
                this.b[i] = lowerCase;
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(locale2);
            if (this.a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap<String, Integer> hashMap3 = this.a;
                hashMap3.put(lowerCase3, hashMap3.get(lowerCase2));
            }
        }
    }

    public final boolean a() {
        boolean z;
        vu0 vu0Var = this.c.a;
        if (vu0Var != null && ((es) vu0Var).P.isOpen()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (!this.e) {
            this.c.c.x();
        }
        if (this.e) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(vu0 vu0Var, int i) {
        es esVar = (es) vu0Var;
        esVar.g(bp.b("INSERT OR IGNORE INTO room_table_modification_log VALUES(", i, ", 0)"));
        String str = this.b[i];
        StringBuilder sb = new StringBuilder();
        String[] strArr = j;
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = strArr[i2];
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            sb.append("`");
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            esVar.g(sb.toString());
        }
    }

    public final void c(vu0 vu0Var) {
        es esVar = (es) vu0Var;
        if (esVar.P.inTransaction()) {
            return;
        }
        while (true) {
            try {
                ReentrantReadWriteLock.ReadLock readLock = this.c.h.readLock();
                readLock.lock();
                try {
                    int[] a2 = this.g.a();
                    if (a2 == null) {
                        return;
                    }
                    int length = a2.length;
                    esVar.a();
                    for (int i = 0; i < length; i++) {
                        int i2 = a2[i];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                String str = this.b[i];
                                StringBuilder sb = new StringBuilder();
                                String[] strArr = j;
                                for (int i3 = 0; i3 < 3; i3++) {
                                    String str2 = strArr[i3];
                                    sb.setLength(0);
                                    sb.append("DROP TRIGGER IF EXISTS ");
                                    sb.append("`");
                                    sb.append("room_table_modification_trigger_");
                                    sb.append(str);
                                    sb.append("_");
                                    sb.append(str2);
                                    sb.append("`");
                                    esVar.g(sb.toString());
                                }
                            }
                        } else {
                            b(esVar, i);
                        }
                    }
                    esVar.F();
                    esVar.d();
                    b bVar = this.g;
                    synchronized (bVar) {
                        bVar.e = false;
                    }
                } finally {
                    readLock.unlock();
                }
            } catch (SQLiteException | IllegalStateException e) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                return;
            }
        }
    }
}