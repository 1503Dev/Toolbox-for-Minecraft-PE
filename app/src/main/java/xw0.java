package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import defpackage.tf0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: xw0  reason: default package */
public final class xw0 {

    /* renamed from: xw0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements ActionMode.Callback {
        public final ActionMode.Callback a;
        public final TextView b;
        public Class<?> c;
        public Method d;
        public boolean e;
        public boolean f = false;

        public a(ActionMode.Callback callback, TextView textView) {
            this.a = callback;
            this.b = textView;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
            this.a.onDestroyActionMode(actionMode);
        }

        /* JADX WARN: Removed duplicated region for block: B:69:0x00d1 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x009f A[SYNTHETIC] */
        @Override // android.view.ActionMode.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            Method declaredMethod;
            boolean z;
            boolean z2;
            String str;
            Context context = this.b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f) {
                this.f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.c = cls;
                    this.d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.c = null;
                    this.d = null;
                    this.e = false;
                }
            }
            try {
                if (this.e && this.c.isInstance(menu)) {
                    declaredMethod = this.d;
                } else {
                    declaredMethod = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (context instanceof Activity) {
                    for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                        if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                            ActivityInfo activityInfo = resolveInfo.activityInfo;
                            if (!activityInfo.exported || ((str = activityInfo.permission) != null && ww0.a(context, str) != 0)) {
                                z2 = false;
                                if (!z2) {
                                    arrayList.add(resolveInfo);
                                }
                            }
                        }
                        z2 = true;
                        if (!z2) {
                        }
                    }
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i);
                    MenuItem add = menu.add(0, 0, i + 100, resolveInfo2.loadLabel(packageManager));
                    TextView textView = this.b;
                    Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
                    if ((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Intent putExtra = type.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !z);
                    ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                    add.setIntent(putExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
            return this.a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
        if (r9 != 2) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
        if (r4 != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static tf0.a a(TextView textView) {
        int i;
        int i2;
        TextDirectionHeuristic textDirectionHeuristic;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            return new tf0.a(sw0.a(textView));
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 23) {
            i = 1;
            i2 = 1;
        } else {
            i = 0;
            i2 = 0;
        }
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (i3 >= 23) {
            i = tw0.a(textView);
            i2 = uw0.a(textView);
        }
        if (!(textView.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            if (i3 >= 28 && (textView.getInputType() & 15) == 3) {
                byte directionality = Character.getDirectionality(qw.c(DecimalFormatSymbols.getInstance(textView.getTextLocale()))[0].codePointAt(0));
                if (directionality != 1) {
                }
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else {
                if (textView.getLayoutDirection() == 1) {
                    z = true;
                }
                switch (textView.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                }
            }
            return new tf0.a(textPaint, textDirectionHeuristic, i, i2);
        }
        textDirectionHeuristic = TextDirectionHeuristics.LTR;
        return new tf0.a(textPaint, textDirectionHeuristic, i, i2);
    }

    public static void b(TextView textView, int i) {
        ja.a(i);
        if (Build.VERSION.SDK_INT >= 28) {
            rw0.a(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void c(TextView textView, int i) {
        ja.a(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void d(TextView textView, tf0 tf0Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            tf0Var.getClass();
            textView.setText((CharSequence) null);
            return;
        }
        tf0.a a2 = a(textView);
        tf0Var.getClass();
        if (!a2.a(null)) {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
        textView.setText(tf0Var);
    }

    public static void e(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            vw0.b(textView, i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    public static ActionMode.Callback f(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof a) || callback == null) ? callback : new a(callback, textView);
    }
}