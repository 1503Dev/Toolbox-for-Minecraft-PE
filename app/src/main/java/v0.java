package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: v0  reason: default package */
public class v0 {
    public final Object a;

    /* renamed from: v0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends AccessibilityNodeProvider {
        public final v0 a;

        public a(v0 v0Var) {
            this.a = v0Var;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            s0 a = this.a.a(i);
            if (a == null) {
                return null;
            }
            return a.a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            this.a.getClass();
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int i, int i2, Bundle bundle) {
            return this.a.c(i, i2, bundle);
        }
    }

    /* renamed from: v0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b extends a {
        public b(v0 v0Var) {
            super(v0Var);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo findFocus(int i) {
            s0 b = this.a.b(i);
            if (b == null) {
                return null;
            }
            return b.a;
        }
    }

    /* renamed from: v0$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class c extends b {
        public c(v0 v0Var) {
            super(v0Var);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.a.getClass();
        }
    }

    public v0() {
        this.a = Build.VERSION.SDK_INT >= 26 ? new c(this) : new b(this);
    }

    public v0(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.a = accessibilityNodeProvider;
    }

    public s0 a(int i) {
        return null;
    }

    public s0 b(int i) {
        return null;
    }

    public boolean c(int i, int i2, Bundle bundle) {
        return false;
    }
}