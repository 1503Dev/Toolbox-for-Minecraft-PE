package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: y02  reason: default package */
public final class y02 {
    public final Context a;
    public final cu3 b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int h;
    public PointF i;
    public PointF j;
    public br4 k;
    public int g = 0;
    public b02 l = new b02(0, this);

    public y02(Context context) {
        this.a = context;
        this.h = ViewConfiguration.get(context).getScaledTouchSlop();
        jv5 jv5Var = jv5.A;
        jv5Var.r.a();
        this.k = jv5Var.r.b;
        this.b = jv5Var.m.g;
    }

    public static final int e(String str, ArrayList arrayList, boolean z) {
        if (z) {
            arrayList.add(str);
            return arrayList.size() - 1;
        }
        return -1;
    }

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.g = 0;
            this.i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.g;
        if (i == -1) {
            return;
        }
        if (i == 0) {
            if (actionMasked == 5) {
                this.g = 5;
                this.j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.k.postDelayed(this.l, ((Long) w82.d.c.a(x92.Q3)).longValue());
            }
        } else if (i == 5) {
            if (pointerCount == 2) {
                if (actionMasked == 2) {
                    boolean z = false;
                    for (int i2 = 0; i2 < historySize; i2++) {
                        z |= !d(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2));
                    }
                    if (d(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.g = -1;
            this.k.removeCallbacks(this.l);
        }
    }

    public final void b() {
        String str;
        boolean z;
        try {
            if (!(this.a instanceof Activity)) {
                sv2.f("Can not create dialog without Activity Context");
                return;
            }
            jv5 jv5Var = jv5.A;
            r42 r42Var = jv5Var.m;
            synchronized (r42Var.a) {
                str = r42Var.c;
            }
            String str2 = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(str)) {
                str2 = "Creative preview";
            }
            r42 r42Var2 = jv5Var.m;
            synchronized (r42Var2.a) {
                z = r42Var2.d;
            }
            String str3 = "Troubleshooting (enabled)";
            if (true != z) {
                str3 = "Troubleshooting";
            }
            ArrayList arrayList = new ArrayList();
            final int e = e("Ad information", arrayList, true);
            final int e2 = e(str2, arrayList, true);
            final int e3 = e(str3, arrayList, true);
            boolean booleanValue = ((Boolean) w82.d.c.a(x92.M7)).booleanValue();
            final int e4 = e("Open ad inspector", arrayList, booleanValue);
            final int e5 = e("Ad inspector settings", arrayList, booleanValue);
            AlertDialog.Builder e6 = cu5.e(this.a);
            e6.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: xy1
                /* JADX WARN: Code restructure failed: missing block: B:15:0x007d, code lost:
                    if (android.text.TextUtils.isEmpty(r7) != false) goto L19;
                 */
                @Override // android.content.DialogInterface.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onClick(DialogInterface dialogInterface, int i) {
                    yw2 yw2Var;
                    yw2 yw2Var2;
                    Runnable yr1Var;
                    Runnable runnable;
                    yw2 yw2Var3;
                    Runnable zw1Var;
                    final String str4;
                    final y02 y02Var = y02.this;
                    int i2 = e;
                    int i3 = e2;
                    int i4 = e3;
                    int i5 = e4;
                    int i6 = e5;
                    if (i == i2) {
                        if (!(y02Var.a instanceof Activity)) {
                            sv2.f("Can not create dialog without Activity Context");
                            return;
                        }
                        String str5 = y02Var.c;
                        if (!TextUtils.isEmpty(str5)) {
                            Uri build = new Uri.Builder().encodedQuery(str5.replaceAll("\\+", "%20")).build();
                            StringBuilder sb = new StringBuilder();
                            cu5 cu5Var = jv5.A.c;
                            HashMap h = cu5.h(build);
                            for (String str6 : h.keySet()) {
                                sb.append(str6);
                                sb.append(" = ");
                                sb.append((String) h.get(str6));
                                sb.append("\n\n");
                            }
                            str4 = sb.toString().trim();
                        }
                        str4 = "No debug information";
                        cu5 cu5Var2 = jv5.A.c;
                        AlertDialog.Builder e7 = cu5.e(y02Var.a);
                        e7.setMessage(str4);
                        e7.setTitle("Ad Information");
                        e7.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: cn1
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface2, int i7) {
                                y02 y02Var2 = y02.this;
                                String str7 = str4;
                                y02Var2.getClass();
                                cu5 cu5Var3 = jv5.A.c;
                                cu5.l(y02Var2.a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str7), "Share via"));
                            }
                        });
                        e7.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: fo1
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface2, int i7) {
                            }
                        });
                        e7.create().show();
                        return;
                    }
                    y02Var.getClass();
                    if (i == i3) {
                        sv2.b("Debug mode [Creative Preview] selected.");
                        yw2Var3 = zw2.a;
                        zw1Var = new am1(0, y02Var);
                    } else {
                        if (i == i4) {
                            sv2.b("Debug mode [Troubleshooting] selected.");
                            yw2Var = zw2.a;
                            runnable = new of4(1, y02Var);
                        } else {
                            if (i == i5) {
                                yw2Var3 = zw2.e;
                                yw2Var2 = zw2.a;
                                if (y02Var.b.f()) {
                                    zw1Var = new zw1(0, y02Var);
                                } else {
                                    yr1Var = new tx1(0, y02Var, yw2Var3);
                                }
                            } else if (i == i6) {
                                yw2Var = zw2.e;
                                yw2Var2 = zw2.a;
                                if (y02Var.b.f()) {
                                    runnable = new Runnable() { // from class: dr1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            y02 y02Var2 = y02.this;
                                            y02Var2.c(y02Var2.a);
                                        }
                                    };
                                } else {
                                    yr1Var = new yr1(0, y02Var, yw2Var);
                                }
                            } else {
                                return;
                            }
                            yw2Var2.execute(yr1Var);
                            return;
                        }
                        yw2Var.execute(runnable);
                        return;
                    }
                    yw2Var3.execute(zw1Var);
                }
            });
            e6.create().show();
        } catch (WindowManager.BadTokenException e7) {
            vz3.l("", e7);
        }
    }

    public final void c(Context context) {
        final int i;
        ArrayList arrayList = new ArrayList();
        int e = e("None", arrayList, true);
        final int e2 = e("Shake", arrayList, true);
        final int e3 = e("Flick", arrayList, true);
        int ordinal = this.b.o.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                i = e;
            } else {
                i = e3;
            }
        } else {
            i = e2;
        }
        cu5 cu5Var = jv5.A.c;
        AlertDialog.Builder e4 = cu5.e(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i);
        e4.setTitle("Setup gesture");
        e4.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new DialogInterface.OnClickListener() { // from class: at1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                atomicInteger.set(i2);
            }
        });
        e4.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: au1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                y02.this.b();
            }
        });
        e4.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: bv1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                cu3 cu3Var;
                yt3 yt3Var;
                y02 y02Var = y02.this;
                AtomicInteger atomicInteger2 = atomicInteger;
                int i3 = i;
                int i4 = e2;
                int i5 = e3;
                y02Var.getClass();
                if (atomicInteger2.get() != i3) {
                    if (atomicInteger2.get() == i4) {
                        cu3Var = y02Var.b;
                        yt3Var = yt3.SHAKE;
                    } else if (atomicInteger2.get() == i5) {
                        cu3Var = y02Var.b;
                        yt3Var = yt3.FLICK;
                    } else {
                        cu3Var = y02Var.b;
                        yt3Var = yt3.NONE;
                    }
                    cu3Var.j(yt3Var, true);
                }
                y02Var.b();
            }
        });
        e4.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: dw1
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                y02.this.b();
            }
        });
        e4.create().show();
    }

    public final boolean d(float f, float f2, float f3, float f4) {
        return Math.abs(this.i.x - f) < ((float) this.h) && Math.abs(this.i.y - f2) < ((float) this.h) && Math.abs(this.j.x - f3) < ((float) this.h) && Math.abs(this.j.y - f4) < ((float) this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.c);
        sb.append(",DebugSignal: ");
        sb.append(this.f);
        sb.append(",AFMA Version: ");
        sb.append(this.e);
        sb.append(",Ad Unit ID: ");
        return qq.d(sb, this.d, "}");
    }
}