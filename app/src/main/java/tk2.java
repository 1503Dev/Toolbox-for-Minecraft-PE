package defpackage;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* renamed from: tk2  reason: default package */
public final class tk2 extends vk2 {
    static {
        new dn2();
    }

    @Override // defpackage.wk2
    public final boolean D(String str) {
        try {
            return gh.class.isAssignableFrom(Class.forName(str, false, tk2.class.getClassLoader()));
        } catch (Throwable unused) {
            sv2.g("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }

    @Override // defpackage.wk2
    public final zm2 H(String str) {
        return new ln2((RtbAdapter) Class.forName(str, false, dn2.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
    }

    @Override // defpackage.wk2
    public final boolean P(String str) {
        try {
            return j3.class.isAssignableFrom(Class.forName(str, false, tk2.class.getClassLoader()));
        } catch (Throwable unused) {
            sv2.g("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // defpackage.wk2
    public final zk2 z(String str) {
        zl2 zl2Var;
        try {
            try {
                Class<?> cls = Class.forName(str, false, tk2.class.getClassLoader());
                if (k50.class.isAssignableFrom(cls)) {
                    return new zl2((k50) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                if (j3.class.isAssignableFrom(cls)) {
                    return new zl2((j3) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                sv2.g("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            } catch (Throwable unused) {
                sv2.b("Reflection failed, retrying using direct instantiation");
                if (!"com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                    if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                        zl2Var = new zl2(new CustomEventAdapter());
                    }
                    throw new RemoteException();
                }
                zl2Var = new zl2(new AdMobAdapter());
                return zl2Var;
            }
        } catch (Throwable th) {
            sv2.h("Could not instantiate mediation adapter: " + str + ". ", th);
            throw new RemoteException();
        }
    }
}