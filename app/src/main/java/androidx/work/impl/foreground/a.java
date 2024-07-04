package androidx.work.impl.foreground;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class a implements p61, mp {
    public static final String Z = y20.e("SystemFgDispatcher");
    public Context P;
    public a71 Q;
    public final bw0 R;
    public final Object S = new Object();
    public String T;
    public final LinkedHashMap U;
    public final HashMap V;
    public final HashSet W;
    public final q61 X;
    public InterfaceC0016a Y;

    /* renamed from: androidx.work.impl.foreground.a$a  reason: collision with other inner class name */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface InterfaceC0016a {
    }

    public a(Context context) {
        this.P = context;
        a71 E1 = a71.E1(context);
        this.Q = E1;
        bw0 bw0Var = E1.i;
        this.R = bw0Var;
        this.T = null;
        this.U = new LinkedHashMap();
        this.W = new HashSet();
        this.V = new HashMap();
        this.X = new q61(this.P, bw0Var, this);
        this.Q.k.b(this);
    }

    public static Intent b(Context context, String str, br brVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", brVar.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", brVar.b);
        intent.putExtra("KEY_NOTIFICATION", brVar.c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent d(Context context, String str, br brVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", brVar.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", brVar.b);
        intent.putExtra("KEY_NOTIFICATION", brVar.c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // defpackage.mp
    public final void a(String str, boolean z) {
        boolean z2;
        Map.Entry entry;
        synchronized (this.S) {
            try {
                l71 l71Var = (l71) this.V.remove(str);
                if (l71Var != null) {
                    z2 = this.W.remove(l71Var);
                } else {
                    z2 = false;
                }
                if (z2) {
                    this.X.b(this.W);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        br brVar = (br) this.U.remove(str);
        if (str.equals(this.T) && this.U.size() > 0) {
            Iterator it = this.U.entrySet().iterator();
            do {
                entry = (Map.Entry) it.next();
            } while (it.hasNext());
            this.T = (String) entry.getKey();
            if (this.Y != null) {
                br brVar2 = (br) entry.getValue();
                InterfaceC0016a interfaceC0016a = this.Y;
                SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC0016a;
                systemForegroundService.Q.post(new cv0(systemForegroundService, brVar2.a, brVar2.c, brVar2.b));
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.Y;
                systemForegroundService2.Q.post(new ev0(systemForegroundService2, brVar2.a));
            }
        }
        InterfaceC0016a interfaceC0016a2 = this.Y;
        if (brVar != null && interfaceC0016a2 != null) {
            y20.c().a(Z, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(brVar.a), str, Integer.valueOf(brVar.b)), new Throwable[0]);
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) interfaceC0016a2;
            systemForegroundService3.Q.post(new ev0(systemForegroundService3, brVar.a));
        }
    }

    @Override // defpackage.p61
    public final void c(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                y20.c().a(Z, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
                a71 a71Var = this.Q;
                ((b71) a71Var.i).a(new zt0(a71Var, str, true));
            }
        }
    }

    @Override // defpackage.p61
    public final void e(List<String> list) {
    }
}