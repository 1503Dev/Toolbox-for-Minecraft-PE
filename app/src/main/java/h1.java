package defpackage;

import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.o;

/* renamed from: h1  reason: default package */
public abstract class h1 {
    public a a;

    /* renamed from: h1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(o oVar) {
    }

    public boolean g() {
        return false;
    }

    public void h(h.a aVar) {
        if (this.a != null) {
            StringBuilder b = e5.b("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            b.append(getClass().getSimpleName());
            b.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", b.toString());
        }
        this.a = aVar;
    }
}