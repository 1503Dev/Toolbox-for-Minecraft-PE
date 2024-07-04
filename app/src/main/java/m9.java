package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: m9  reason: default package */
public abstract class m9 {
    public final Context a;
    public e7 b;
    public e7 c;

    public m9(Context context) {
        this.a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (menuItem instanceof uu0) {
            uu0 uu0Var = (uu0) menuItem;
            if (this.b == null) {
                this.b = new e7();
            }
            MenuItem menuItem2 = (MenuItem) this.b.getOrDefault(menuItem, null);
            if (menuItem2 == null) {
                w50 w50Var = new w50(this.a, uu0Var);
                this.b.put(uu0Var, w50Var);
                return w50Var;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (subMenu instanceof yu0) {
            yu0 yu0Var = (yu0) subMenu;
            if (this.c == null) {
                this.c = new e7();
            }
            SubMenu subMenu2 = (SubMenu) this.c.getOrDefault(yu0Var, null);
            if (subMenu2 == null) {
                mu0 mu0Var = new mu0(this.a, yu0Var);
                this.c.put(yu0Var, mu0Var);
                return mu0Var;
            }
            return subMenu2;
        }
        return subMenu;
    }
}