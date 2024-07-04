package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.work.a;
import androidx.work.b;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import defpackage.lc0;
import defpackage.sf;
import java.util.Collections;
import java.util.HashMap;

public class WorkManagerUtil extends hn2 {
    public static void t4(Context context) {
        try {
            a71.F1(context.getApplicationContext(), new a(new a.C0013a()));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // defpackage.co2
    public final void zze(hw hwVar) {
        Context context = (Context) va0.c0(hwVar);
        t4(context);
        try {
            a71 E1 = a71.E1(context);
            E1.getClass();
            ((b71) E1.i).a(new yb(E1));
            sf.a aVar = new sf.a();
            aVar.a = o90.CONNECTED;
            sf sfVar = new sf(aVar);
            lc0.a aVar2 = new lc0.a(OfflinePingSender.class);
            aVar2.b.j = sfVar;
            aVar2.c.add("offline_ping_sender_work");
            E1.D1(Collections.singletonList(aVar2.a()));
        } catch (IllegalStateException e) {
            sv2.h("Failed to instantiate WorkManager.", e);
        }
    }

    @Override // defpackage.co2
    public final boolean zzf(hw hwVar, String str, String str2) {
        Context context = (Context) va0.c0(hwVar);
        t4(context);
        sf.a aVar = new sf.a();
        aVar.a = o90.CONNECTED;
        sf sfVar = new sf(aVar);
        HashMap hashMap = new HashMap();
        hashMap.put("uri", str);
        hashMap.put("gws_query_id", str2);
        b bVar = new b(hashMap);
        b.b(bVar);
        lc0.a aVar2 = new lc0.a(OfflineNotificationPoster.class);
        l71 l71Var = aVar2.b;
        l71Var.j = sfVar;
        l71Var.e = bVar;
        aVar2.c.add("offline_notification_work");
        lc0 a = aVar2.a();
        try {
            a71 E1 = a71.E1(context);
            E1.getClass();
            E1.D1(Collections.singletonList(a));
            return true;
        } catch (IllegalStateException e) {
            sv2.h("Failed to instantiate WorkManager.", e);
            return false;
        }
    }
}