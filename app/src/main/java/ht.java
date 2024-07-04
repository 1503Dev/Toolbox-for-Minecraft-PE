package defpackage;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.a;
import androidx.fragment.app.f;
import androidx.fragment.app.i;
import java.lang.reflect.Modifier;

/* renamed from: ht  reason: default package */
public final class ht extends jt {
    public static final Object c = new Object();
    public static final ht d = new ht();

    public static AlertDialog f(Context context, int i, ci1 ci1Var, DialogInterface.OnCancelListener onCancelListener) {
        int i2;
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(gh1.b(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = context.getResources();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    i2 = 17039370;
                } else {
                    i2 = si0.common_google_play_services_enable_button;
                }
            } else {
                i2 = si0.common_google_play_services_update_button;
            }
        } else {
            i2 = si0.common_google_play_services_install_button;
        }
        String string = resources.getString(i2);
        if (string != null) {
            builder.setPositiveButton(string, ci1Var);
        }
        String c2 = gh1.c(context, i);
        if (c2 != null) {
            builder.setTitle(c2);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i)), new IllegalArgumentException());
        return builder.create();
    }

    public static void g(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                f fVar = ((or) ((FragmentActivity) activity).U.b).S;
                ru0 ru0Var = new ru0();
                if (alertDialog != null) {
                    alertDialog.setOnCancelListener(null);
                    alertDialog.setOnDismissListener(null);
                    ru0Var.Q0 = alertDialog;
                    if (onCancelListener != null) {
                        ru0Var.R0 = onCancelListener;
                    }
                    ru0Var.O0 = false;
                    ru0Var.P0 = true;
                    fVar.getClass();
                    a aVar = new a(fVar);
                    int modifiers = ru0.class.getModifiers();
                    if (!ru0.class.isAnonymousClass() && Modifier.isPublic(modifiers) && (!ru0.class.isMemberClass() || Modifier.isStatic(modifiers))) {
                        String str2 = ru0Var.l0;
                        if (str2 != null && !str.equals(str2)) {
                            throw new IllegalStateException("Can't change tag of fragment " + ru0Var + ": was " + ru0Var.l0 + " now " + str);
                        }
                        ru0Var.l0 = str;
                        aVar.b(new i.a(1, ru0Var));
                        ru0Var.f0 = aVar.q;
                        aVar.d(false);
                        return;
                    }
                    StringBuilder b = e5.b("Fragment ");
                    b.append(ru0.class.getCanonicalName());
                    b.append(" must be a public static class to be  properly recreated from instance state.");
                    throw new IllegalStateException(b.toString());
                }
                throw new NullPointerException("Cannot display null dialog");
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        cp cpVar = new cp();
        if (alertDialog != null) {
            alertDialog.setOnCancelListener(null);
            alertDialog.setOnDismissListener(null);
            cpVar.P = alertDialog;
            if (onCancelListener != null) {
                cpVar.Q = onCancelListener;
            }
            cpVar.show(fragmentManager, str);
            return;
        }
        throw new NullPointerException("Cannot display null dialog");
    }

    @Override // defpackage.jt
    public final Intent b(int i, Context context, String str) {
        return super.b(i, context, str);
    }

    @Override // defpackage.jt
    public final int c(Context context, int i) {
        return super.c(context, i);
    }

    public final int d(Context context) {
        return c(context, jt.a);
    }

    public final void e(Activity activity, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog f = f(activity, i, new uh1(activity, super.b(i, activity, "d")), onCancelListener);
        if (f == null) {
            return;
        }
        g(activity, f, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    @TargetApi(20)
    public final void h(Context context, int i, PendingIntent pendingIntent) {
        String c2;
        String d2;
        int i2;
        boolean z;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null), new IllegalArgumentException());
        if (i == 18) {
            new kh1(this, context).sendEmptyMessageDelayed(1, 120000L);
        } else if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        } else {
            if (i == 6) {
                c2 = gh1.e(context, "common_google_play_services_resolution_required_title");
            } else {
                c2 = gh1.c(context, i);
            }
            if (c2 == null) {
                c2 = context.getResources().getString(si0.common_google_play_services_notification_ticker);
            }
            if (i != 6 && i != 19) {
                d2 = gh1.b(context, i);
            } else {
                d2 = gh1.d(context, "common_google_play_services_resolution_required_text", gh1.a(context));
            }
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            uf0.f(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            y90 y90Var = new y90(context, null);
            y90Var.k = true;
            y90Var.o.flags |= 16;
            y90Var.e = y90.a(c2);
            x90 x90Var = new x90();
            x90Var.b = y90.a(d2);
            y90Var.b(x90Var);
            if (sk.b(context)) {
                if (Build.VERSION.SDK_INT >= 20) {
                    z = true;
                } else {
                    z = false;
                }
                uf0.i(z);
                y90Var.o.icon = context.getApplicationInfo().icon;
                y90Var.h = 2;
                if (sk.c(context)) {
                    y90Var.b.add(new w90(vh0.common_full_open_on_phone, resources.getString(si0.common_open_on_phone), pendingIntent));
                } else {
                    y90Var.g = pendingIntent;
                }
            } else {
                y90Var.o.icon = 17301642;
                y90Var.o.tickerText = y90.a(resources.getString(si0.common_google_play_services_notification_ticker));
                y90Var.o.when = System.currentTimeMillis();
                y90Var.g = pendingIntent;
                y90Var.f = y90.a(d2);
            }
            if (qe0.a()) {
                uf0.i(qe0.a());
                synchronized (c) {
                }
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(si0.common_google_play_services_notification_channel_name);
                if (notificationChannel == null) {
                    notificationChannel = new NotificationChannel("com.google.android.gms.availability", string, 4);
                } else {
                    if (!string.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(string);
                    }
                    y90Var.m = "com.google.android.gms.availability";
                }
                notificationManager.createNotificationChannel(notificationChannel);
                y90Var.m = "com.google.android.gms.availability";
            }
            Notification a = new ea0(y90Var).a();
            if (i != 1 && i != 2 && i != 3) {
                i2 = 39789;
            } else {
                ot.a.set(false);
                i2 = 10436;
            }
            notificationManager.notify(i2, a);
        }
    }

    public final void i(Activity activity, z00 z00Var, int i, zi1 zi1Var) {
        AlertDialog f = f(activity, i, new bi1(super.b(i, activity, "d"), z00Var), zi1Var);
        if (f == null) {
            return;
        }
        g(activity, f, "GooglePlayServicesErrorDialog", zi1Var);
    }
}