package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.h;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: tu0  reason: default package */
public final class tu0 extends MenuInflater {
    public static final Class<?>[] e;
    public static final Class<?>[] f;
    public final Object[] a;
    public final Object[] b;
    public Context c;
    public Object d;

    /* renamed from: tu0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {
        public static final Class<?>[] c = {MenuItem.class};
        public Object a;
        public Method b;

        public a(String str, Object obj) {
            this.a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.b = cls.getMethod(str, c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.b.invoke(this.a, menuItem)).booleanValue();
                }
                this.b.invoke(this.a, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: tu0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b {
        public CharSequence A;
        public CharSequence B;
        public Menu a;
        public boolean h;
        public int i;
        public int j;
        public CharSequence k;
        public CharSequence l;
        public int m;
        public char n;
        public int o;
        public char p;
        public int q;
        public int r;
        public boolean s;
        public boolean t;
        public boolean u;
        public int v;
        public int w;
        public String x;
        public String y;
        public h1 z;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;
        public int b = 0;
        public int c = 0;
        public int d = 0;
        public int e = 0;
        public boolean f = true;
        public boolean g = true;

        public b(Menu menu) {
            this.a = menu;
        }

        public final <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, tu0.this.c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        public final void b(MenuItem menuItem) {
            boolean z;
            MenuItem enabled = menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
            boolean z2 = false;
            if (this.r >= 1) {
                z = true;
            } else {
                z = false;
            }
            enabled.setCheckable(z).setTitleCondensed(this.l).setIcon(this.m);
            int i = this.v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.y != null) {
                if (!tu0.this.c.isRestricted()) {
                    tu0 tu0Var = tu0.this;
                    if (tu0Var.d == null) {
                        tu0Var.d = tu0.a(tu0Var.c);
                    }
                    menuItem.setOnMenuItemClickListener(new a(this.y, tu0Var.d));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            boolean z3 = menuItem instanceof h;
            if (z3) {
                h hVar = (h) menuItem;
            }
            if (this.r >= 2) {
                if (z3) {
                    h hVar2 = (h) menuItem;
                    hVar2.x = (hVar2.x & (-5)) | 4;
                } else if (menuItem instanceof w50) {
                    w50 w50Var = (w50) menuItem;
                    try {
                        if (w50Var.e == null) {
                            w50Var.e = w50Var.d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        w50Var.e.invoke(w50Var.d, Boolean.TRUE);
                    } catch (Exception e) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                    }
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) a(str, tu0.e, tu0.this.a));
                z2 = true;
            }
            int i2 = this.w;
            if (i2 > 0) {
                if (!z2) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            h1 h1Var = this.z;
            if (h1Var != null) {
                if (menuItem instanceof uu0) {
                    ((uu0) menuItem).b(h1Var);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.A;
            boolean z4 = menuItem instanceof uu0;
            if (z4) {
                ((uu0) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                u50.a(menuItem, charSequence);
            }
            CharSequence charSequence2 = this.B;
            if (z4) {
                ((uu0) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                t50.c(menuItem, charSequence2);
            }
            char c = this.n;
            int i3 = this.o;
            if (z4) {
                ((uu0) menuItem).setAlphabeticShortcut(c, i3);
            } else if (Build.VERSION.SDK_INT >= 26) {
                j0.b(menuItem, c, i3);
            }
            char c2 = this.p;
            int i4 = this.q;
            if (z4) {
                ((uu0) menuItem).setNumericShortcut(c2, i4);
            } else if (Build.VERSION.SDK_INT >= 26) {
                i0.b(menuItem, c2, i4);
            }
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                if (z4) {
                    ((uu0) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    h30.b(menuItem, mode);
                }
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList != null) {
                if (z4) {
                    ((uu0) menuItem).setIconTintList(colorStateList);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    i30.a(menuItem, colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public tu0(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? a(((ContextWrapper) context).getBaseContext()) : context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        char charAt;
        char charAt2;
        int i;
        boolean z;
        b bVar = new b(menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException(k6.b("Expecting menu, got ", name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        while (!z2) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z3 && name2.equals(str)) {
                            str = null;
                            z3 = false;
                        } else if (name2.equals("group")) {
                            bVar.b = 0;
                            bVar.c = 0;
                            bVar.d = 0;
                            bVar.e = 0;
                            bVar.f = true;
                            bVar.g = true;
                        } else if (name2.equals("item")) {
                            if (!bVar.h) {
                                h1 h1Var = bVar.z;
                                if (h1Var != null && h1Var.a()) {
                                    bVar.h = true;
                                    bVar.b(bVar.a.addSubMenu(bVar.b, bVar.i, bVar.j, bVar.k).getItem());
                                } else {
                                    bVar.h = true;
                                    bVar.b(bVar.a.add(bVar.b, bVar.i, bVar.j, bVar.k));
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z2 = true;
                        }
                    }
                } else if (!z3) {
                    String name3 = xmlResourceParser.getName();
                    if (name3.equals("group")) {
                        TypedArray obtainStyledAttributes = tu0.this.c.obtainStyledAttributes(attributeSet, lj0.MenuGroup);
                        bVar.b = obtainStyledAttributes.getResourceId(lj0.MenuGroup_android_id, 0);
                        bVar.c = obtainStyledAttributes.getInt(lj0.MenuGroup_android_menuCategory, 0);
                        bVar.d = obtainStyledAttributes.getInt(lj0.MenuGroup_android_orderInCategory, 0);
                        bVar.e = obtainStyledAttributes.getInt(lj0.MenuGroup_android_checkableBehavior, 0);
                        bVar.f = obtainStyledAttributes.getBoolean(lj0.MenuGroup_android_visible, true);
                        bVar.g = obtainStyledAttributes.getBoolean(lj0.MenuGroup_android_enabled, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        Context context = tu0.this.c;
                        hx0 hx0Var = new hx0(context, context.obtainStyledAttributes(attributeSet, lj0.MenuItem));
                        bVar.i = hx0Var.i(lj0.MenuItem_android_id, 0);
                        bVar.j = (hx0Var.h(lj0.MenuItem_android_menuCategory, bVar.c) & (-65536)) | (hx0Var.h(lj0.MenuItem_android_orderInCategory, bVar.d) & 65535);
                        bVar.k = hx0Var.k(lj0.MenuItem_android_title);
                        bVar.l = hx0Var.k(lj0.MenuItem_android_titleCondensed);
                        bVar.m = hx0Var.i(lj0.MenuItem_android_icon, 0);
                        String j = hx0Var.j(lj0.MenuItem_android_alphabeticShortcut);
                        if (j == null) {
                            charAt = 0;
                        } else {
                            charAt = j.charAt(0);
                        }
                        bVar.n = charAt;
                        bVar.o = hx0Var.h(lj0.MenuItem_alphabeticModifiers, 4096);
                        String j2 = hx0Var.j(lj0.MenuItem_android_numericShortcut);
                        if (j2 == null) {
                            charAt2 = 0;
                        } else {
                            charAt2 = j2.charAt(0);
                        }
                        bVar.p = charAt2;
                        bVar.q = hx0Var.h(lj0.MenuItem_numericModifiers, 4096);
                        int i2 = lj0.MenuItem_android_checkable;
                        if (hx0Var.l(i2)) {
                            i = hx0Var.a(i2, false);
                        } else {
                            i = bVar.e;
                        }
                        bVar.r = i;
                        bVar.s = hx0Var.a(lj0.MenuItem_android_checked, false);
                        bVar.t = hx0Var.a(lj0.MenuItem_android_visible, bVar.f);
                        bVar.u = hx0Var.a(lj0.MenuItem_android_enabled, bVar.g);
                        bVar.v = hx0Var.h(lj0.MenuItem_showAsAction, -1);
                        bVar.y = hx0Var.j(lj0.MenuItem_android_onClick);
                        bVar.w = hx0Var.i(lj0.MenuItem_actionLayout, 0);
                        bVar.x = hx0Var.j(lj0.MenuItem_actionViewClass);
                        String j3 = hx0Var.j(lj0.MenuItem_actionProviderClass);
                        if (j3 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z && bVar.w == 0 && bVar.x == null) {
                            bVar.z = (h1) bVar.a(j3, f, tu0.this.b);
                        } else {
                            if (z) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            bVar.z = null;
                        }
                        bVar.A = hx0Var.k(lj0.MenuItem_contentDescription);
                        bVar.B = hx0Var.k(lj0.MenuItem_tooltipText);
                        int i3 = lj0.MenuItem_iconTintMode;
                        if (hx0Var.l(i3)) {
                            bVar.D = um.d(hx0Var.h(i3, -1), bVar.D);
                        } else {
                            bVar.D = null;
                        }
                        int i4 = lj0.MenuItem_iconTint;
                        if (hx0Var.l(i4)) {
                            bVar.C = hx0Var.b(i4);
                        } else {
                            bVar.C = null;
                        }
                        hx0Var.n();
                        bVar.h = false;
                    } else if (name3.equals("menu")) {
                        bVar.h = true;
                        SubMenu addSubMenu = bVar.a.addSubMenu(bVar.b, bVar.i, bVar.j, bVar.k);
                        bVar.b(addSubMenu.getItem());
                        b(xmlResourceParser, attributeSet, addSubMenu);
                    } else {
                        z3 = true;
                        str = name3;
                    }
                }
                eventType = xmlResourceParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof su0)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.c.getResources().getLayout(i);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (XmlPullParserException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (IOException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}