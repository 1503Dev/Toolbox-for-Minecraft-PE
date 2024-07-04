package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

@Deprecated
/* renamed from: s45  reason: default package */
public final class s45 implements ta0, wg3, jc0 {
    public static String P;
    public static final /* synthetic */ s45 Q = new s45();
    public static final i33 R = new i33(0);
    public static final /* synthetic */ s45 S = new s45();
    public static final z73 T = new z73(1);
    public static final /* synthetic */ s45 U = new s45();
    public static final tj3 V = new tj3(1);

    public static void b(String str, Exception exc) {
        if (y91.a.booleanValue()) {
            TextUtils.isEmpty(str);
        }
        Log.e("OMIDLIB", str, exc);
    }

    public static u3 c(String str) {
        if (str.equals("SHA-1")) {
            return new u3(oa0.a, gi.P);
        }
        if (str.equals("SHA-224")) {
            return new u3(z60.d, gi.P);
        }
        if (str.equals("SHA-256")) {
            return new u3(z60.a, gi.P);
        }
        if (str.equals("SHA-384")) {
            return new u3(z60.b, gi.P);
        }
        if (str.equals("SHA-512")) {
            return new u3(z60.c, gi.P);
        }
        throw new IllegalArgumentException(k6.b("unrecognised digest algorithm: ", str));
    }

    public static tl f(u3 u3Var) {
        if (u3Var.P.equals(oa0.a)) {
            return new tm0();
        }
        if (u3Var.P.equals(z60.d)) {
            return new um0();
        }
        if (u3Var.P.equals(z60.a)) {
            return new vm0();
        }
        if (u3Var.P.equals(z60.b)) {
            return new wm0();
        }
        if (u3Var.P.equals(z60.c)) {
            return new xm0();
        }
        StringBuilder b = e5.b("unrecognised OID in digest algorithm identifier: ");
        b.append(u3Var.P);
        throw new IllegalArgumentException(b.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e6, code lost:
        if (r6.contains("com.google.android.apps.chrome") != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String g(Context context) {
        String str;
        String str2 = P;
        if (str2 != null) {
            return str2;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        String str3 = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction("android.support.customtabs.action.CustomTabsService");
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            P = null;
        } else {
            if (arrayList.size() == 1) {
                str = (String) arrayList.get(0);
            } else {
                if (!TextUtils.isEmpty(str3)) {
                    try {
                        List<ResolveInfo> queryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent, 64);
                        if (queryIntentActivities2 != null && queryIntentActivities2.size() != 0) {
                            for (ResolveInfo resolveInfo2 : queryIntentActivities2) {
                                IntentFilter intentFilter = resolveInfo2.filter;
                                if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo2.activityInfo != null) {
                                    break;
                                }
                            }
                        }
                    } catch (RuntimeException unused) {
                        Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
                    }
                    if (arrayList.contains(str3)) {
                        P = str3;
                    }
                }
                str = "com.android.chrome";
                if (!arrayList.contains("com.android.chrome")) {
                    str = "com.chrome.beta";
                    if (!arrayList.contains("com.chrome.beta")) {
                        str = "com.chrome.dev";
                        if (!arrayList.contains("com.chrome.dev")) {
                            str = "com.google.android.apps.chrome";
                        }
                    }
                }
            }
            P = str;
        }
        return P;
    }

    @Deprecated
    public static void h() {
        String valueOf;
        String str;
        for (wa5 wa5Var : p45.a.y()) {
            if (!wa5Var.z().isEmpty()) {
                if (!wa5Var.y().isEmpty()) {
                    if (!wa5Var.x().isEmpty()) {
                        if (!wa5Var.x().equals("TinkAead") && !wa5Var.x().equals("TinkMac") && !wa5Var.x().equals("TinkHybridDecrypt") && !wa5Var.x().equals("TinkHybridEncrypt") && !wa5Var.x().equals("TinkPublicKeySign") && !wa5Var.x().equals("TinkPublicKeyVerify") && !wa5Var.x().equals("TinkStreamingAead") && !wa5Var.x().equals("TinkDeterministicAead")) {
                            String x = wa5Var.x();
                            if (x != null) {
                                ConcurrentHashMap concurrentHashMap = x05.d;
                                Locale locale = Locale.US;
                                vz4 vz4Var = (vz4) concurrentHashMap.get(x.toLowerCase(locale));
                                if (vz4Var == null) {
                                    String format = String.format("no catalogue found for %s. ", x);
                                    if (x.toLowerCase(locale).startsWith("tinkaead")) {
                                        format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
                                    }
                                    if (!x.toLowerCase(locale).startsWith("tinkdeterministicaead")) {
                                        if (!x.toLowerCase(locale).startsWith("tinkstreamingaead")) {
                                            if (!x.toLowerCase(locale).startsWith("tinkhybriddecrypt") && !x.toLowerCase(locale).startsWith("tinkhybridencrypt")) {
                                                if (!x.toLowerCase(locale).startsWith("tinkmac")) {
                                                    if (!x.toLowerCase(locale).startsWith("tinkpublickeysign") && !x.toLowerCase(locale).startsWith("tinkpublickeyverify")) {
                                                        if (x.toLowerCase(locale).startsWith("tink")) {
                                                            valueOf = String.valueOf(format);
                                                            str = "Maybe call TinkConfig.register().";
                                                        }
                                                        throw new GeneralSecurityException(format);
                                                    }
                                                    valueOf = String.valueOf(format);
                                                    str = "Maybe call SignatureConfig.register().";
                                                } else {
                                                    valueOf = String.valueOf(format);
                                                    str = "Maybe call MacConfig.register().";
                                                }
                                            } else {
                                                valueOf = String.valueOf(format);
                                                str = "Maybe call HybridConfig.register().";
                                            }
                                        } else {
                                            valueOf = String.valueOf(format);
                                            str = "Maybe call StreamingAeadConfig.register().";
                                        }
                                    } else {
                                        valueOf = String.valueOf(format);
                                        str = "Maybe call DeterministicAeadConfig.register().";
                                    }
                                    format = valueOf.concat(str);
                                    throw new GeneralSecurityException(format);
                                }
                                x05.g(vz4Var.a());
                                zz4 c = vz4Var.c();
                                boolean A = wa5Var.A();
                                synchronized (x05.class) {
                                    if (c != null) {
                                        AtomicReference atomicReference = x05.a;
                                        f05 f05Var = new f05((f05) atomicReference.get());
                                        synchronized (f05Var) {
                                            if (ea2.C(1)) {
                                                f05Var.e(new b05(c), false);
                                            } else {
                                                throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
                                            }
                                        }
                                        if (ea2.C(1)) {
                                            String d = ((a05) c).a.d();
                                            x05.h(d, Collections.emptyMap(), A);
                                            x05.c.put(d, Boolean.valueOf(A));
                                            atomicReference.set(f05Var);
                                        } else {
                                            throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
                                        }
                                    } else {
                                        throw new IllegalArgumentException("key manager must be non-null.");
                                    }
                                }
                            } else {
                                AtomicReference atomicReference2 = x05.a;
                                throw new IllegalArgumentException("catalogueName must be non-null.");
                            }
                        }
                    } else {
                        throw new GeneralSecurityException("Missing catalogue_name.");
                    }
                } else {
                    throw new GeneralSecurityException("Missing primitive_name.");
                }
            } else {
                throw new GeneralSecurityException("Missing type_url.");
            }
        }
    }

    public static void i(AtomicReference atomicReference, kg4 kg4Var) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            kg4Var.mo5e(obj);
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        r2.append((java.lang.CharSequence) r4);
        r0 = r3.next();
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
        if ((r0 instanceof java.lang.CharSequence) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
        r0 = r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
        if ((r0 instanceof java.lang.CharSequence) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        r0 = (java.lang.CharSequence) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        r2.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r3.hasNext() == false) goto L13;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002e -> B:7:0x0015). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x002f -> B:8:0x0017). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(StringBuilder sb, Iterable iterable, String str) {
        Iterator it = iterable.iterator();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public static Executor k(Executor executor, ry4 ry4Var) {
        executor.getClass();
        return executor == py4.P ? executor : new fz4(executor, ry4Var);
    }

    @Override // defpackage.jc0
    public void a() {
    }

    @Override // defpackage.ta0
    public Object d() {
        return new TreeSet();
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public void mo0e(Object obj) {
        ((zp5) obj).d3();
    }
}