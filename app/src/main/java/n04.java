package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.view.Window;
import defpackage.o3;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;

/* renamed from: n04  reason: default package */
public final /* synthetic */ class n04 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n04(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return ((r04) this.b).getWritableDatabase();
            case 1:
                n74 n74Var = (n74) this.b;
                return new r74(n74Var.c, n74Var.d.e, n74Var.b());
            case 2:
                ja4 ja4Var = (ja4) this.b;
                ja4Var.getClass();
                l92 l92Var = x92.Q4;
                w82 w82Var = w82.d;
                if (((Boolean) w82Var.c.a(l92Var)).booleanValue() && ja4Var.b != null && ja4Var.d.contains("banner")) {
                    return new ka4(Boolean.valueOf(ja4Var.b.isHardwareAccelerated()));
                }
                boolean booleanValue = ((Boolean) w82Var.c.a(x92.R4)).booleanValue();
                Boolean bool = null;
                if (booleanValue && ja4Var.d.contains("native")) {
                    Context context = ja4Var.c;
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        Window window = activity.getWindow();
                        if (window != null && (window.getAttributes().flags & 16777216) != 0) {
                            bool = Boolean.TRUE;
                        } else {
                            try {
                                boolean z = false;
                                if ((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0) {
                                    z = true;
                                }
                                bool = Boolean.valueOf(z);
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                        }
                        return new ka4(bool);
                    }
                }
                return new ka4(null);
            default:
                Context context2 = ((op4) this.b).a;
                gx1 X = ey1.X();
                o3.a a = o3.a(context2);
                String str = a.a;
                if (str != null && str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                    UUID fromString = UUID.fromString(str);
                    byte[] bArr = new byte[16];
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    wrap.putLong(fromString.getMostSignificantBits());
                    wrap.putLong(fromString.getLeastSignificantBits());
                    str = Base64.encodeToString(bArr, 11);
                }
                if (str != null) {
                    X.j();
                    ey1.d0((ey1) X.Q, str);
                    boolean z2 = a.b;
                    X.j();
                    ey1.e0((ey1) X.Q, z2);
                    X.j();
                    ey1.q0((ey1) X.Q);
                }
                return (ey1) X.h();
        }
    }
}