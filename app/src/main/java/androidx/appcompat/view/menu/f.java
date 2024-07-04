package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class f implements su0 {
    public static final int[] y = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public final Resources b;
    public boolean c;
    public boolean d;
    public a e;
    public ArrayList<h> f;
    public ArrayList<h> g;
    public boolean h;
    public ArrayList<h> i;
    public ArrayList<h> j;
    public boolean k;
    public CharSequence m;
    public Drawable n;
    public View o;
    public h v;
    public boolean x;
    public int l = 0;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public ArrayList<h> t = new ArrayList<>();
    public CopyOnWriteArrayList<WeakReference<k>> u = new CopyOnWriteArrayList<>();
    public boolean w = false;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
        boolean a(f fVar, MenuItem menuItem);

        void b(f fVar);
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface b {
        boolean a(h hVar);
    }

    public f(Context context) {
        boolean z;
        boolean z2 = false;
        this.a = context;
        Resources resources = context.getResources();
        this.b = resources;
        this.f = new ArrayList<>();
        this.g = new ArrayList<>();
        this.h = true;
        this.i = new ArrayList<>();
        this.j = new ArrayList<>();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = e41.a;
            if (Build.VERSION.SDK_INT >= 28) {
                z = d41.a(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier != 0 && resources2.getBoolean(identifier)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                z2 = true;
            }
        }
        this.d = z2;
    }

    public final h a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 >= 0) {
            int[] iArr = y;
            if (i5 < 6) {
                int i6 = (iArr[i5] << 16) | (65535 & i3);
                h hVar = new h(this, i, i2, i3, i6, charSequence, this.l);
                ArrayList<h> arrayList = this.f;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        if (arrayList.get(size).d <= i6) {
                            i4 = size + 1;
                            break;
                        }
                    } else {
                        i4 = 0;
                        break;
                    }
                }
                arrayList.add(i4, hVar);
                p(true);
                return hVar;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.b.getString(i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        Intent intent2;
        int i6;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i5 = queryIntentActivityOptions.size();
        } else {
            i5 = 0;
        }
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i7 = 0; i7 < i5; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            if (i8 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i8];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            h a2 = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            a2.setIcon(resolveInfo.loadIcon(packageManager));
            a2.g = intent3;
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = a2;
            }
        }
        return i5;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        h a2 = a(i, i2, i3, charSequence);
        o oVar = new o(this.a, this, a2);
        a2.o = oVar;
        oVar.setHeaderTitle(a2.e);
        return oVar;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(k kVar, Context context) {
        this.u.add(new WeakReference<>(kVar));
        kVar.e(context, this);
        this.k = true;
    }

    public final void c(boolean z) {
        if (this.s) {
            return;
        }
        this.s = true;
        Iterator<WeakReference<k>> it = this.u.iterator();
        while (it.hasNext()) {
            WeakReference<k> next = it.next();
            k kVar = next.get();
            if (kVar == null) {
                this.u.remove(next);
            } else {
                kVar.b(this, z);
            }
        }
        this.s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        h hVar = this.v;
        if (hVar != null) {
            d(hVar);
        }
        this.f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.n = null;
        this.m = null;
        this.o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(h hVar) {
        boolean z = false;
        if (!this.u.isEmpty() && this.v == hVar) {
            w();
            Iterator<WeakReference<k>> it = this.u.iterator();
            while (it.hasNext()) {
                WeakReference<k> next = it.next();
                k kVar = next.get();
                if (kVar == null) {
                    this.u.remove(next);
                } else {
                    z = kVar.d(hVar);
                    if (z) {
                        break;
                    }
                }
            }
            v();
            if (z) {
                this.v = null;
            }
        }
        return z;
    }

    public boolean e(f fVar, MenuItem menuItem) {
        a aVar = this.e;
        return aVar != null && aVar.a(fVar, menuItem);
    }

    public boolean f(h hVar) {
        boolean z = false;
        if (this.u.isEmpty()) {
            return false;
        }
        w();
        Iterator<WeakReference<k>> it = this.u.iterator();
        while (it.hasNext()) {
            WeakReference<k> next = it.next();
            k kVar = next.get();
            if (kVar == null) {
                this.u.remove(next);
            } else {
                z = kVar.k(hVar);
                if (z) {
                    break;
                }
            }
        }
        v();
        if (z) {
            this.v = hVar;
        }
        return z;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            h hVar = this.f.get(i2);
            if (hVar.a == i) {
                return hVar;
            }
            if (hVar.hasSubMenu() && (findItem = hVar.o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final h g(int i, KeyEvent keyEvent) {
        char c;
        ArrayList<h> arrayList = this.t;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean n = n();
        for (int i2 = 0; i2 < size; i2++) {
            h hVar = arrayList.get(i2);
            if (n) {
                c = hVar.j;
            } else {
                c = hVar.h;
            }
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (n && c == '\b' && i == 67))) {
                return hVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return this.f.get(i);
    }

    public final void h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        char c;
        int i2;
        boolean z;
        boolean n = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && i != 67) {
            return;
        }
        int size = this.f.size();
        for (int i3 = 0; i3 < size; i3++) {
            h hVar = this.f.get(i3);
            if (hVar.hasSubMenu()) {
                hVar.o.h(arrayList, i, keyEvent);
            }
            if (n) {
                c = hVar.j;
            } else {
                c = hVar.h;
            }
            if (n) {
                i2 = hVar.k;
            } else {
                i2 = hVar.i;
            }
            if ((modifiers & 69647) == (i2 & 69647)) {
                z = true;
            } else {
                z = false;
            }
            if (z && c != 0) {
                char[] cArr = keyData.meta;
                if ((c == cArr[0] || c == cArr[2] || (n && c == '\b' && i == 67)) && hVar.isEnabled()) {
                    arrayList.add(hVar);
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.x) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        boolean z;
        ArrayList<h> arrayList;
        ArrayList<h> l = l();
        if (!this.k) {
            return;
        }
        Iterator<WeakReference<k>> it = this.u.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            WeakReference<k> next = it.next();
            k kVar = next.get();
            if (kVar == null) {
                this.u.remove(next);
            } else {
                z2 |= kVar.i();
            }
        }
        if (z2) {
            this.i.clear();
            this.j.clear();
            int size = l.size();
            for (int i = 0; i < size; i++) {
                h hVar = l.get(i);
                if ((hVar.x & 32) == 32) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList = this.i;
                } else {
                    arrayList = this.j;
                }
                arrayList.add(hVar);
            }
        } else {
            this.i.clear();
            this.j.clear();
            this.j.addAll(l());
        }
        this.k = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public f k() {
        return this;
    }

    public final ArrayList<h> l() {
        if (this.h) {
            this.g.clear();
            int size = this.f.size();
            for (int i = 0; i < size; i++) {
                h hVar = this.f.get(i);
                if (hVar.isVisible()) {
                    this.g.add(hVar);
                }
            }
            this.h = false;
            this.k = true;
            return this.g;
        }
        return this.g;
    }

    public boolean m() {
        return this.w;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z) {
        if (!this.p) {
            if (z) {
                this.h = true;
                this.k = true;
            }
            if (!this.u.isEmpty()) {
                w();
                Iterator<WeakReference<k>> it = this.u.iterator();
                while (it.hasNext()) {
                    WeakReference<k> next = it.next();
                    k kVar = next.get();
                    if (kVar == null) {
                        this.u.remove(next);
                    } else {
                        kVar.f();
                    }
                }
                v();
                return;
            }
            return;
        }
        this.q = true;
        if (z) {
            this.r = true;
        }
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return q(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        h g = g(i, keyEvent);
        if (g != null) {
            z = q(g, null, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            c(true);
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x005b, code lost:
        if (r1 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006a, code lost:
        if ((r9 & 1) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c6, code lost:
        if (r1 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c8, code lost:
        c(true);
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(MenuItem menuItem, k kVar, int i) {
        boolean z;
        h1 h1Var;
        boolean z2;
        h hVar = (h) menuItem;
        boolean z3 = false;
        if (hVar == null || !hVar.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = hVar.p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(hVar)) {
            f fVar = hVar.n;
            if (!fVar.e(fVar, hVar)) {
                Intent intent = hVar.g;
                if (intent != null) {
                    try {
                        hVar.n.a.startActivity(intent);
                    } catch (ActivityNotFoundException e) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                    }
                }
                h1 h1Var2 = hVar.A;
                if (h1Var2 == null || !h1Var2.e()) {
                    z = false;
                    h1Var = hVar.A;
                    if (h1Var == null && h1Var.a()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!hVar.e()) {
                        z |= hVar.expandActionView();
                    } else if (hVar.hasSubMenu() || z2) {
                        if ((i & 4) == 0) {
                            c(false);
                        }
                        if (!hVar.hasSubMenu()) {
                            o oVar = new o(this.a, this, hVar);
                            hVar.o = oVar;
                            oVar.setHeaderTitle(hVar.e);
                        }
                        o oVar2 = hVar.o;
                        if (z2) {
                            h1Var.f(oVar2);
                        }
                        if (!this.u.isEmpty()) {
                            if (kVar != null) {
                                z3 = kVar.h(oVar2);
                            }
                            Iterator<WeakReference<k>> it = this.u.iterator();
                            while (it.hasNext()) {
                                WeakReference<k> next = it.next();
                                k kVar2 = next.get();
                                if (kVar2 == null) {
                                    this.u.remove(next);
                                } else if (!z3) {
                                    z3 = kVar2.h(oVar2);
                                }
                            }
                        }
                        z |= z3;
                    }
                    return z;
                }
            }
        }
        z = true;
        h1Var = hVar.A;
        if (h1Var == null) {
        }
        z2 = false;
        if (!hVar.e()) {
        }
        return z;
    }

    public final void r(k kVar) {
        Iterator<WeakReference<k>> it = this.u.iterator();
        while (it.hasNext()) {
            WeakReference<k> next = it.next();
            k kVar2 = next.get();
            if (kVar2 == null || kVar2 == kVar) {
                this.u.remove(next);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                if (this.f.get(i3).b == i) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 >= 0) {
            int size2 = this.f.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || this.f.get(i3).b != i) {
                    break;
                }
                if (i3 >= 0 && i3 < this.f.size()) {
                    this.f.remove(i3);
                }
                i2 = i4;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (this.f.get(i2).a == i) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0 && i2 < this.f.size()) {
            this.f.remove(i2);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((o) item.getSubMenu()).s(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        int i2;
        int size = this.f.size();
        for (int i3 = 0; i3 < size; i3++) {
            h hVar = this.f.get(i3);
            if (hVar.b == i) {
                int i4 = hVar.x & (-5);
                if (z2) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                hVar.x = i4 | i2;
                hVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.w = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            h hVar = this.f.get(i2);
            if (hVar.b == i) {
                hVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        int i2;
        boolean z2;
        int size = this.f.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            h hVar = this.f.get(i3);
            if (hVar.b == i) {
                int i4 = hVar.x;
                int i5 = i4 & (-9);
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                int i6 = i5 | i2;
                hVar.x = i6;
                if (i4 != i6) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    public final void t(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((o) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.b;
        if (view != null) {
            this.o = view;
            this.m = null;
            this.n = null;
        } else {
            if (i > 0) {
                this.m = resources.getText(i);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i2 > 0) {
                this.n = cg.b(this.a, i2);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.o = null;
        }
        p(false);
    }

    public final void v() {
        this.p = false;
        if (this.q) {
            this.q = false;
            p(this.r);
        }
    }

    public final void w() {
        if (this.p) {
            return;
        }
        this.p = true;
        this.q = false;
        this.r = false;
    }
}