package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* renamed from: a14  reason: default package */
public final class a14 extends ho2 {
    public final Context Q;
    public final zr3 R;
    public final wv2 S;
    public final r04 T;
    public final wl4 U;

    public a14(Context context, r04 r04Var, wv2 wv2Var, zr3 zr3Var, wl4 wl4Var) {
        this.Q = context;
        this.R = zr3Var;
        this.S = wv2Var;
        this.T = r04Var;
        this.U = wl4Var;
    }

    public static void t4(Context context, zr3 zr3Var, wl4 wl4Var, r04 r04Var, String str, String str2) {
        u4(context, zr3Var, wl4Var, r04Var, str, str2, new HashMap());
    }

    public static void u4(Context context, zr3 zr3Var, wl4 wl4Var, r04 r04Var, String str, String str2, HashMap hashMap) {
        String str3;
        String b;
        jv5 jv5Var = jv5.A;
        if (true != jv5Var.g.g(context)) {
            str3 = "offline";
        } else {
            str3 = "online";
        }
        if (!((Boolean) w82.d.c.a(x92.k7)).booleanValue() && zr3Var != null) {
            yr3 a = zr3Var.a();
            a.a("gqi", str);
            a.a("action", str2);
            a.a("device_connectivity", str3);
            jv5Var.j.getClass();
            a.a("event_timestamp", String.valueOf(System.currentTimeMillis()));
            for (Map.Entry entry : hashMap.entrySet()) {
                a.a((String) entry.getKey(), (String) entry.getValue());
            }
            fs3 fs3Var = a.b.a;
            b = fs3Var.e.a(a.a);
        } else {
            vl4 b2 = vl4.b(str2);
            b2.a("gqi", str);
            b2.a("device_connectivity", str3);
            jv5Var.j.getClass();
            b2.a("event_timestamp", String.valueOf(System.currentTimeMillis()));
            for (Map.Entry entry2 : hashMap.entrySet()) {
                b2.a((String) entry2.getKey(), (String) entry2.getValue());
            }
            b = wl4Var.b(b2);
        }
        jv5.A.j.getClass();
        r04Var.a(new s04(System.currentTimeMillis(), str, b, 2));
    }

    public static void v4(final Activity activity, final qn5 qn5Var, final co2 co2Var, final zr3 zr3Var, final r04 r04Var, final wl4 wl4Var, final String str, final String str2, final boolean z) {
        cu5 cu5Var = jv5.A.c;
        AlertDialog.Builder e = cu5.e(activity);
        e.setTitle(w4(ri0.offline_opt_in_title, "Open ad when you're back online.")).setMessage(w4(ri0.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(w4(ri0.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: w04
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Activity activity2 = activity;
                zr3 zr3Var2 = zr3Var;
                wl4 wl4Var2 = wl4Var;
                r04 r04Var2 = r04Var;
                String str3 = str;
                co2 co2Var2 = co2Var;
                String str4 = str2;
                qn5 qn5Var2 = qn5Var;
                boolean z2 = z;
                HashMap hashMap = new HashMap();
                hashMap.put("dialog_action", "confirm");
                a14.u4(activity2, zr3Var2, wl4Var2, r04Var2, str3, "dialog_click", hashMap);
                cu5 cu5Var2 = jv5.A.c;
                if (!new ha0(activity2).a()) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        b41.b(activity2, new String[]{"android.permission.POST_NOTIFICATIONS"});
                        a14.t4(activity2, zr3Var2, wl4Var2, r04Var2, str3, "asnpdi");
                        if (z2) {
                            a14.x4(activity2, co2Var2, r04Var2, zr3Var2, wl4Var2, str3, str4);
                            return;
                        }
                        return;
                    }
                    return;
                }
                a14.x4(activity2, co2Var2, r04Var2, zr3Var2, wl4Var2, str3, str4);
                a14.y4(activity2, qn5Var2);
            }
        }).setNegativeButton(w4(ri0.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: x04
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                r04 r04Var2 = r04.this;
                String str3 = str;
                Activity activity2 = activity;
                zr3 zr3Var2 = zr3Var;
                wl4 wl4Var2 = wl4Var;
                qn5 qn5Var2 = qn5Var;
                r04Var2.getClass();
                r04Var2.d(new yn2(r04Var2, str3));
                HashMap hashMap = new HashMap();
                hashMap.put("dialog_action", "dismiss");
                a14.u4(activity2, zr3Var2, wl4Var2, r04Var2, str3, "dialog_click", hashMap);
                if (qn5Var2 != null) {
                    qn5Var2.c();
                }
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: y04
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                r04 r04Var2 = r04.this;
                String str3 = str;
                Activity activity2 = activity;
                zr3 zr3Var2 = zr3Var;
                wl4 wl4Var2 = wl4Var;
                qn5 qn5Var2 = qn5Var;
                r04Var2.getClass();
                r04Var2.d(new yn2(r04Var2, str3));
                HashMap hashMap = new HashMap();
                hashMap.put("dialog_action", "dismiss");
                a14.u4(activity2, zr3Var2, wl4Var2, r04Var2, str3, "dialog_click", hashMap);
                if (qn5Var2 != null) {
                    qn5Var2.c();
                }
            }
        });
        e.create().show();
    }

    public static String w4(int i, String str) {
        Resources a = jv5.A.g.a();
        if (a == null) {
            return str;
        }
        return a.getString(i);
    }

    public static void x4(Activity activity, co2 co2Var, r04 r04Var, zr3 zr3Var, wl4 wl4Var, String str, String str2) {
        try {
            if (co2Var.zzf(new va0(activity), str2, str)) {
                return;
            }
        } catch (RemoteException e) {
            sv2.e("Failed to schedule offline notification poster.", e);
        }
        r04Var.getClass();
        r04Var.d(new yn2(r04Var, str));
        t4(activity, zr3Var, wl4Var, r04Var, str, "offline_notification_worker_not_scheduled");
    }

    public static void y4(Activity activity, final qn5 qn5Var) {
        String w4 = w4(ri0.offline_opt_in_confirmation, "You'll get a notification with the link when you're back online");
        cu5 cu5Var = jv5.A.c;
        AlertDialog.Builder e = cu5.e(activity);
        e.setMessage(w4).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: v04
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                qn5 qn5Var2 = qn5.this;
                if (qn5Var2 != null) {
                    qn5Var2.c();
                }
            }
        });
        AlertDialog create = e.create();
        create.show();
        Timer timer = new Timer();
        timer.schedule(new z04(create, timer, qn5Var), 3000L);
    }

    public static final PendingIntent z4(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdService");
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        int i = jr4.a | 1073741824;
        boolean z = true;
        gt4.e("Cannot set any dangerous parts of intent to be mutable.", (i & 88) == 0);
        gt4.e("Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.", (i & 1) == 0 || jr4.a(0, 3));
        gt4.e("Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.", (i & 2) == 0 || jr4.a(0, 5));
        gt4.e("Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.", (i & 4) == 0 || jr4.a(0, 9));
        gt4.e("Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.", (i & 128) == 0 || jr4.a(0, 17));
        gt4.e("Must set component on Intent.", intent.getComponent() != null);
        if (jr4.a(0, 1)) {
            gt4.e("Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.", !jr4.a(i, 67108864));
        } else {
            if (Build.VERSION.SDK_INT >= 23 && !jr4.a(i, 67108864)) {
                z = false;
            }
            gt4.e("Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.", z);
        }
        Intent intent2 = new Intent(intent);
        if (Build.VERSION.SDK_INT < 23 || !jr4.a(i, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!jr4.a(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!jr4.a(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!jr4.a(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!jr4.a(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(jr4.b);
            }
        }
        return PendingIntent.getService(context, 0, intent2, i);
    }

    @Override // defpackage.io2
    public final void e() {
        this.T.d(new d60(6, this.S));
    }

    @Override // defpackage.io2
    public final void q4(hw hwVar, String str, String str2) {
        String str3;
        Context context = (Context) va0.c0(hwVar);
        jv5.A.e.f(context);
        PendingIntent z4 = z4(context, "offline_notification_clicked", str2, str);
        PendingIntent z42 = z4(context, "offline_notification_dismissed", str2, str);
        y90 y90Var = new y90(context, "offline_notification_channel");
        y90Var.e = y90.a(w4(ri0.offline_notification_title, "View the ad you saved when you were offline"));
        y90Var.f = y90.a(w4(ri0.offline_notification_text, "Tap to open ad"));
        Notification notification = y90Var.o;
        notification.flags |= 16;
        notification.deleteIntent = z42;
        y90Var.g = z4;
        y90Var.o.icon = context.getApplicationInfo().icon;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap hashMap = new HashMap();
        try {
            notificationManager.notify(str2, 54321, new ea0(y90Var).a());
            str3 = "offline_notification_impression";
        } catch (IllegalArgumentException e) {
            hashMap.put("notification_not_shown_reason", e.getMessage());
            str3 = "offline_notification_failed";
        }
        u4(this.Q, this.R, this.U, this.T, str2, str3, hashMap);
    }

    @Override // defpackage.io2
    public final void v0(Intent intent) {
        char c;
        char c2;
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (!stringExtra.equals("offline_notification_clicked") && !stringExtra.equals("offline_notification_dismissed")) {
            return;
        }
        String stringExtra2 = intent.getStringExtra("gws_query_id");
        String stringExtra3 = intent.getStringExtra("uri");
        boolean g = jv5.A.g.g(this.Q);
        HashMap hashMap = new HashMap();
        if (stringExtra.equals("offline_notification_clicked")) {
            hashMap.put("offline_notification_action", "offline_notification_clicked");
            if (true != g) {
                c2 = 2;
            } else {
                c2 = 1;
            }
            hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
            hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
            try {
                Context context = this.Q;
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                if (launchIntentForPackage == null) {
                    launchIntentForPackage = new Intent("android.intent.action.VIEW");
                    launchIntentForPackage.setData(Uri.parse(stringExtra3));
                }
                launchIntentForPackage.addFlags(268435456);
                context.startActivity(launchIntentForPackage);
                hashMap.put("olaa", "olas");
            } catch (ActivityNotFoundException unused) {
                hashMap.put("olaa", "olaf");
            }
            c = c2;
        } else {
            hashMap.put("offline_notification_action", "offline_notification_dismissed");
            c = 2;
        }
        u4(this.Q, this.R, this.U, this.T, stringExtra2, "offline_notification_action", hashMap);
        try {
            SQLiteDatabase writableDatabase = this.T.getWritableDatabase();
            if (c == 1) {
                this.T.Q.execute(new o04(0, writableDatabase, stringExtra2, this.S));
            } else {
                writableDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{stringExtra2, Integer.toString(0)});
            }
        } catch (SQLiteException e) {
            sv2.d("Failed to get writable offline buffering database: ".concat(e.toString()));
        }
    }
}