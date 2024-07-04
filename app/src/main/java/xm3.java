package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: xm3  reason: default package */
public final class xm3 {
    public final qq3 a;
    public final kp3 b;
    public sm3 c = null;

    public xm3(qq3 qq3Var, kp3 kp3Var) {
        this.a = qq3Var;
        this.b = kp3Var;
    }

    public static final int b(int i, Context context, String str) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        mv2 mv2Var = n62.f.a;
        return mv2.k(context, i);
    }

    public final View a(final FrameLayout frameLayout, final WindowManager windowManager) {
        l13 a = this.a.a(zr5.d(), null, null);
        a.setVisibility(4);
        a.setContentDescription("policy_validator");
        a.D0("/sendMessageToSdk", new mg2() { // from class: tm3
            @Override // defpackage.mg2
            public final void b(Object obj, Map map) {
                y03 y03Var = (y03) obj;
                xm3.this.b.b(map);
            }
        });
        a.D0("/hideValidatorOverlay", new mg2() { // from class: um3
            @Override // defpackage.mg2
            public final void b(Object obj, Map map) {
                xm3 xm3Var = this;
                WindowManager windowManager2 = windowManager;
                View view = frameLayout;
                y03 y03Var = (y03) obj;
                xm3Var.getClass();
                sv2.b("Hide native ad policy validator overlay.");
                y03Var.x().setVisibility(8);
                if (y03Var.x().getWindowToken() != null) {
                    windowManager2.removeView(y03Var.x());
                }
                y03Var.destroy();
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (xm3Var.c == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                    return;
                }
                viewTreeObserver.removeOnScrollChangedListener(xm3Var.c);
            }
        });
        a.D0("/open", new vg2(null, null, null, null, null));
        this.b.d(new WeakReference(a), "/loadNativeAdPolicyViolations", new mg2() { // from class: vm3
            /* JADX WARN: Type inference failed for: r9v3, types: [sm3] */
            @Override // defpackage.mg2
            public final void b(Object obj, Map map) {
                int i;
                xm3 xm3Var = this;
                final View view = frameLayout;
                final WindowManager windowManager2 = windowManager;
                final y03 y03Var = (y03) obj;
                xm3Var.getClass();
                y03Var.R().V = new te3(1, xm3Var, map);
                if (map != null) {
                    Context context = view.getContext();
                    m92 m92Var = x92.L6;
                    w82 w82Var = w82.d;
                    int b = xm3.b(((Integer) w82Var.c.a(m92Var)).intValue(), context, (String) map.get("validator_width"));
                    int b2 = xm3.b(((Integer) w82Var.c.a(x92.M6)).intValue(), context, (String) map.get("validator_height"));
                    int b3 = xm3.b(0, context, (String) map.get("validator_x"));
                    int b4 = xm3.b(0, context, (String) map.get("validator_y"));
                    y03Var.A0(new k23(1, b, b2));
                    try {
                        y03Var.m0().getSettings().setUseWideViewPort(((Boolean) w82Var.c.a(x92.N6)).booleanValue());
                        y03Var.m0().getSettings().setLoadWithOverviewMode(((Boolean) w82Var.c.a(x92.O6)).booleanValue());
                    } catch (NullPointerException unused) {
                    }
                    final WindowManager.LayoutParams a2 = gt2.a();
                    a2.x = b3;
                    a2.y = b4;
                    windowManager2.updateViewLayout(y03Var.x(), a2);
                    final String str = (String) map.get("orientation");
                    Rect rect = new Rect();
                    if (view.getGlobalVisibleRect(rect)) {
                        if (!"1".equals(str) && !"2".equals(str)) {
                            i = rect.top;
                        } else {
                            i = rect.bottom;
                        }
                        final int i2 = i - b4;
                        xm3Var.c = new ViewTreeObserver.OnScrollChangedListener() { // from class: sm3
                            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                            public final void onScrollChanged() {
                                View view2 = view;
                                y03 y03Var2 = y03Var;
                                String str2 = str;
                                WindowManager.LayoutParams layoutParams = a2;
                                int i3 = i2;
                                WindowManager windowManager3 = windowManager2;
                                Rect rect2 = new Rect();
                                if (!view2.getGlobalVisibleRect(rect2) || y03Var2.x().getWindowToken() == null) {
                                    return;
                                }
                                layoutParams.y = (("1".equals(str2) || "2".equals(str2)) ? rect2.bottom : rect2.top) - i3;
                                windowManager3.updateViewLayout(y03Var2.x(), layoutParams);
                            }
                        };
                        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                            viewTreeObserver.addOnScrollChangedListener(xm3Var.c);
                        }
                    }
                    String str2 = (String) map.get("overlay_url");
                    if (!TextUtils.isEmpty(str2)) {
                        y03Var.loadUrl(str2);
                    }
                }
            }
        });
        this.b.d(new WeakReference(a), "/showValidatorOverlay", new mg2() { // from class: wm3
            @Override // defpackage.mg2
            public final void b(Object obj, Map map) {
                sv2.b("Show native ad policy validator overlay.");
                ((y03) obj).x().setVisibility(0);
            }
        });
        return a;
    }
}