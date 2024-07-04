package defpackage;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import defpackage.k9;

/* renamed from: h82  reason: default package */
public final class h82 extends cl5 {
    public final /* synthetic */ k9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h82(k9 k9Var, Looper looper) {
        super(looper);
        this.a = k9Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
        if (r0 == 5) goto L152;
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) {
        TListener tlistener;
        boolean z = false;
        PendingIntent pendingIntent = null;
        if (this.a.w.get() != message.arg1) {
            int i = message.what;
            if ((i == 2 || i == 1 || i == 7) ? true : true) {
                gw2 gw2Var = (gw2) message.obj;
                gw2Var.b();
                synchronized (gw2Var) {
                    gw2Var.a = null;
                }
                synchronized (gw2Var.c.l) {
                    gw2Var.c.l.remove(gw2Var);
                }
                return;
            }
            return;
        }
        int i2 = message.what;
        if (i2 != 1 && i2 != 7) {
            if (i2 == 4) {
                this.a.getClass();
            }
        }
        if (!this.a.g()) {
            gw2 gw2Var2 = (gw2) message.obj;
            gw2Var2.b();
            synchronized (gw2Var2) {
                gw2Var2.a = null;
            }
            synchronized (gw2Var2.c.l) {
                gw2Var2.c.l.remove(gw2Var2);
            }
            return;
        }
        int i3 = message.what;
        if (i3 == 4) {
            this.a.t = new gf(message.arg2);
            k9 k9Var = this.a;
            if (!k9Var.u && !TextUtils.isEmpty(k9Var.w()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(k9Var.w());
                    z = true;
                } catch (ClassNotFoundException unused) {
                }
            }
            if (z) {
                k9 k9Var2 = this.a;
                if (!k9Var2.u) {
                    k9Var2.A(3, null);
                    return;
                }
            }
            gf gfVar = this.a.t;
            if (gfVar == null) {
                gfVar = new gf(8);
            }
            this.a.j.a(gfVar);
            this.a.getClass();
            System.currentTimeMillis();
        } else if (i3 == 5) {
            gf gfVar2 = this.a.t;
            if (gfVar2 == null) {
                gfVar2 = new gf(8);
            }
            this.a.j.a(gfVar2);
            this.a.getClass();
            System.currentTimeMillis();
        } else if (i3 == 3) {
            Object obj = message.obj;
            if (obj instanceof PendingIntent) {
                pendingIntent = (PendingIntent) obj;
            }
            this.a.j.a(new gf(message.arg2, pendingIntent));
            this.a.getClass();
            System.currentTimeMillis();
        } else if (i3 == 6) {
            this.a.A(5, null);
            k9.a aVar = this.a.o;
            if (aVar != null) {
                aVar.A(message.arg2);
            }
            this.a.getClass();
            System.currentTimeMillis();
            k9.z(this.a, 5, 1, null);
        } else if (i3 == 2 && !this.a.a()) {
            gw2 gw2Var3 = (gw2) message.obj;
            gw2Var3.b();
            synchronized (gw2Var3) {
                gw2Var3.a = null;
            }
            synchronized (gw2Var3.c.l) {
                gw2Var3.c.l.remove(gw2Var3);
            }
        } else {
            int i4 = message.what;
            if ((i4 == 2 || i4 == 1 || i4 == 7) ? true : true) {
                gw2 gw2Var4 = (gw2) message.obj;
                synchronized (gw2Var4) {
                    tlistener = gw2Var4.a;
                    if (gw2Var4.b) {
                        String obj2 = gw2Var4.toString();
                        StringBuilder sb = new StringBuilder(obj2.length() + 47);
                        sb.append("Callback proxy ");
                        sb.append(obj2);
                        sb.append(" being reused. This is not safe.");
                        Log.w("GmsClient", sb.toString());
                    }
                }
                if (tlistener != 0) {
                    try {
                        gw2Var4.a();
                    } catch (RuntimeException e) {
                        throw e;
                    }
                }
                synchronized (gw2Var4) {
                    gw2Var4.b = true;
                }
                synchronized (gw2Var4) {
                    gw2Var4.a = null;
                }
                synchronized (gw2Var4.c.l) {
                    gw2Var4.c.l.remove(gw2Var4);
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder(45);
            sb2.append("Don't know how to handle message: ");
            sb2.append(i4);
            Log.wtf("GmsClient", sb2.toString(), new Exception());
        }
    }
}