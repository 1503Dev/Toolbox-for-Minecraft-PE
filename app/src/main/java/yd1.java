package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import defpackage.ud1;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: yd1  reason: default package */
public final class yd1 {
    public static yd1 e;
    public ud1 a;
    public final ThreadPoolExecutor b = eg1.z();
    public wd1 c = null;
    public boolean d = false;

    /* renamed from: yd1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public final /* synthetic */ nf1 P;
        public final /* synthetic */ long Q;

        public a(nf1 nf1Var, long j) {
            this.P = nf1Var;
            this.Q = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            wd1 wd1Var;
            nf1 nf1Var = this.P;
            yd1 yd1Var = yd1.this;
            if (yd1Var.d) {
                wd1Var = yd1Var.c;
            } else {
                if1 a = if1.a();
                ud1 ud1Var = yd1.this.a;
                long j = this.Q;
                wd1 wd1Var2 = null;
                if (a.c) {
                    SQLiteDatabase sQLiteDatabase = a.b;
                    ExecutorService executorService = a.a;
                    wd1Var2 = new wd1(ud1Var.a);
                    try {
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        executorService.execute(new vd1(ud1Var, sQLiteDatabase, wd1Var2, countDownLatch));
                        if (j > 0) {
                            countDownLatch.await(j, TimeUnit.MILLISECONDS);
                        } else {
                            countDownLatch.await();
                        }
                    } catch (InterruptedException | RejectedExecutionException e) {
                        StringBuilder sb = new StringBuilder();
                        StringBuilder b = e5.b("ADCDbReader.calculateFeatureVectors failed with: ");
                        b.append(e.toString());
                        sb.append(b.toString());
                        t1.b(0, 0, sb.toString(), true);
                    }
                }
                wd1Var = wd1Var2;
            }
            nf1Var.a(wd1Var);
        }
    }

    public static ContentValues a(ic1 ic1Var, ud1.a aVar) {
        String str;
        Long l;
        String str2;
        Double d;
        ContentValues contentValues = new ContentValues();
        Iterator it = aVar.f.iterator();
        while (it.hasNext()) {
            ud1.b bVar = (ud1.b) it.next();
            Object p = ic1Var.p(bVar.a);
            if (p != null) {
                if (p instanceof Boolean) {
                    contentValues.put(bVar.a, (Boolean) p);
                } else {
                    if (p instanceof Long) {
                        str = bVar.a;
                        l = (Long) p;
                    } else {
                        if (p instanceof Double) {
                            str2 = bVar.a;
                            d = (Double) p;
                        } else if (p instanceof Number) {
                            Number number = (Number) p;
                            if (number.doubleValue() == number.longValue() && "INTEGER".equalsIgnoreCase(bVar.b)) {
                                str = bVar.a;
                                l = Long.valueOf(number.longValue());
                            } else {
                                str2 = bVar.a;
                                d = Double.valueOf(number.doubleValue());
                            }
                        } else if (p instanceof String) {
                            contentValues.put(bVar.a, (String) p);
                        }
                        contentValues.put(str2, d);
                    }
                    contentValues.put(str, l);
                }
            }
        }
        return contentValues;
    }

    public static yd1 c() {
        if (e == null) {
            synchronized (yd1.class) {
                if (e == null) {
                    e = new yd1();
                }
            }
        }
        return e;
    }

    public final void b(nf1<wd1> nf1Var, long j) {
        boolean z;
        wd1 wd1Var;
        if (this.a == null) {
            wd1Var = null;
        } else if (this.d) {
            wd1Var = this.c;
        } else {
            ThreadPoolExecutor threadPoolExecutor = this.b;
            a aVar = new a(nf1Var, j);
            ThreadPoolExecutor threadPoolExecutor2 = eg1.a;
            try {
                threadPoolExecutor.execute(aVar);
                z = true;
            } catch (RejectedExecutionException unused) {
                z = false;
            }
            if (!z) {
                t1.b(0, 0, "Execute ADCOdtEventsListener.calculateFeatureVectors failed", true);
                return;
            }
            return;
        }
        nf1Var.a(wd1Var);
    }
}