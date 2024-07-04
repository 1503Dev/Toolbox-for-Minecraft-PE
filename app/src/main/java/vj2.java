package defpackage;

import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: vj2  reason: default package */
public final class vj2 {
    public final Object a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ vj2() {
        this.a = new Object();
        this.b = new Object();
    }

    public /* synthetic */ vj2(Class cls) {
        this.b = new ConcurrentHashMap();
        this.a = cls;
        this.d = z75.b;
    }

    public /* synthetic */ vj2(Object obj, fq4 fq4Var, g02 g02Var, dp4 dp4Var) {
        this.a = obj;
        this.b = fq4Var;
        this.c = g02Var;
        this.d = dp4Var;
    }

    public static String h(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        qy1 w = ry1.w();
        w.j();
        ry1.A((ry1) w.Q, 5);
        ed5 G = gd5.G(bArr, 0, bArr.length);
        w.j();
        ry1.y((ry1) w.Q, G);
        return Base64.encodeToString(((ry1) w.h()).D(), 11);
    }

    public final zj2 a(Context context, xv2 xv2Var, rm4 rm4Var) {
        zj2 zj2Var;
        synchronized (this.a) {
            if (((zj2) this.c) == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                this.c = new zj2(context, xv2Var, (String) w82.d.c.a(x92.a), rm4Var);
            }
            zj2Var = (zj2) this.c;
        }
        return zj2Var;
    }

    public final zj2 b(Context context, xv2 xv2Var, rm4 rm4Var) {
        zj2 zj2Var;
        synchronized (this.b) {
            if (((zj2) this.d) == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                this.d = new zj2(context, xv2Var, (String) xb2.a.d(), rm4Var);
            }
            zj2Var = (zj2) this.d;
        }
        return zj2Var;
    }

    public final synchronized void c(MotionEvent motionEvent) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put("aid", null);
            hashMap.put("evt", motionEvent);
            this.a.getClass().getDeclaredMethod("he", Map.class).invoke(this.a, hashMap);
            ((dp4) this.d).d(System.currentTimeMillis() - currentTimeMillis, 3003);
        } catch (Exception e) {
            throw new oq4(2005, e);
        }
    }

    public final synchronized int d() {
        try {
        } catch (Exception e) {
            throw new oq4(2006, e);
        }
        return ((Integer) this.a.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.a, new Object[0])).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f2 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(@Nullable Object obj, @Nullable Object obj2, za5 za5Var, boolean z) {
        ByteBuffer put;
        byte[] array;
        List list;
        if (((ConcurrentMap) this.b) != null) {
            if (obj == null && obj2 == null) {
                throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
            }
            if (za5Var.G() == 3) {
                ConcurrentMap concurrentMap = (ConcurrentMap) this.b;
                Integer valueOf = Integer.valueOf(za5Var.w());
                if (za5Var.A() == 4) {
                    valueOf = null;
                }
                ja a = b65.b.a(p65.a(za5Var.x().B(), za5Var.x().A(), za5Var.x().x(), za5Var.A(), valueOf));
                int b = cm0.b(za5Var.A());
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b != 4) {
                                throw new GeneralSecurityException("unknown output prefix type");
                            }
                        } else {
                            array = ar.U;
                            r05 r05Var = new r05(obj, obj2, array, za5Var.G(), za5Var.A(), za5Var.w(), za5Var.x().B(), a);
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(r05Var);
                            s05 s05Var = new s05(r05Var.a());
                            list = (List) concurrentMap.put(s05Var, Collections.unmodifiableList(arrayList));
                            if (list != null) {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.addAll(list);
                                arrayList2.add(r05Var);
                                concurrentMap.put(s05Var, Collections.unmodifiableList(arrayList2));
                            }
                            if (!z) {
                                if (((r05) this.c) == null) {
                                    this.c = r05Var;
                                    return;
                                }
                                throw new IllegalStateException("you cannot set two primary primitives");
                            }
                            return;
                        }
                    }
                    put = ByteBuffer.allocate(5).put((byte) 0);
                } else {
                    put = ByteBuffer.allocate(5).put((byte) 1);
                }
                array = put.putInt(za5Var.w()).array();
                r05 r05Var2 = new r05(obj, obj2, array, za5Var.G(), za5Var.A(), za5Var.w(), za5Var.x().B(), a);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(r05Var2);
                s05 s05Var2 = new s05(r05Var2.a());
                list = (List) concurrentMap.put(s05Var2, Collections.unmodifiableList(arrayList3));
                if (list != null) {
                }
                if (!z) {
                }
            } else {
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
        } else {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        }
    }

    public final synchronized void f() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.a.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.a, new Object[0]);
            ((dp4) this.d).d(System.currentTimeMillis() - currentTimeMillis, 3001);
        } catch (Exception e) {
            throw new oq4(2003, e);
        }
    }

    public final synchronized boolean g() {
        try {
        } catch (Exception e) {
            throw new oq4(2001, e);
        }
        return ((Boolean) this.a.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.a, new Object[0])).booleanValue();
    }

    public final synchronized byte[] i(HashMap hashMap) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            ((dp4) this.d).c(2007, System.currentTimeMillis() - currentTimeMillis, e);
            return null;
        }
        return (byte[]) this.a.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.a, null, hashMap);
    }
}