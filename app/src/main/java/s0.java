package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.w0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: s0  reason: default package */
public final class s0 {
    public static int d;
    public final AccessibilityNodeInfo a;
    public int b = -1;
    public int c = -1;

    /* renamed from: s0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        public static final a k;
        public static final a l;
        public final Object a;
        public final int b;
        public final Class<? extends w0.a> c;
        public final w0 d;

        static {
            AccessibilityNodeInfo$AccessibilityAction accessibilityNodeInfo$AccessibilityAction;
            AccessibilityNodeInfo$AccessibilityAction accessibilityNodeInfo$AccessibilityAction2;
            AccessibilityNodeInfo$AccessibilityAction accessibilityNodeInfo$AccessibilityAction3;
            AccessibilityNodeInfo$AccessibilityAction accessibilityNodeInfo$AccessibilityAction4;
            AccessibilityNodeInfo$AccessibilityAction accessibilityNodeInfo$AccessibilityAction5;
            AccessibilityNodeInfo$AccessibilityAction accessibilityNodeInfo$AccessibilityAction6;
            AccessibilityNodeInfo$AccessibilityAction accessibilityNodeInfo$AccessibilityAction7;
            AccessibilityNodeInfo$AccessibilityAction accessibilityNodeInfo$AccessibilityAction8;
            AccessibilityNodeInfo$AccessibilityAction accessibilityNodeInfo$AccessibilityAction9;
            AccessibilityNodeInfo$AccessibilityAction accessibilityNodeInfo$AccessibilityAction10;
            AccessibilityNodeInfo$AccessibilityAction accessibilityNodeInfo$AccessibilityAction11;
            AccessibilityNodeInfo$AccessibilityAction accessibilityNodeInfo$AccessibilityAction12;
            AccessibilityNodeInfo$AccessibilityAction accessibilityNodeInfo$AccessibilityAction13;
            AccessibilityNodeInfo$AccessibilityAction accessibilityNodeInfo$AccessibilityAction14;
            AccessibilityNodeInfo$AccessibilityAction accessibilityNodeInfo$AccessibilityAction15;
            AccessibilityNodeInfo$AccessibilityAction accessibilityNodeInfo$AccessibilityAction16;
            AccessibilityNodeInfo$AccessibilityAction accessibilityNodeInfo$AccessibilityAction17;
            new a(null, 1, null, null);
            new a(null, 2, null, null);
            new a(null, 4, null, null);
            new a(null, 8, null, null);
            e = new a(null, 16, null, null);
            new a(null, 32, null, null);
            new a(null, 64, null, null);
            new a(null, 128, null, null);
            new a(null, 256, null, w0.b.class);
            new a(null, 512, null, w0.b.class);
            new a(null, 1024, null, w0.c.class);
            new a(null, 2048, null, w0.c.class);
            f = new a(null, 4096, null, null);
            g = new a(null, 8192, null, null);
            new a(null, 16384, null, null);
            new a(null, 32768, null, null);
            new a(null, 65536, null, null);
            new a(null, 131072, null, w0.g.class);
            h = new a(null, 262144, null, null);
            i = new a(null, 524288, null, null);
            j = new a(null, 1048576, null, null);
            new a(null, 2097152, null, w0.h.class);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
                accessibilityNodeInfo$AccessibilityAction = AccessibilityNodeInfo$AccessibilityAction.ACTION_SHOW_ON_SCREEN;
            } else {
                accessibilityNodeInfo$AccessibilityAction = null;
            }
            new a(accessibilityNodeInfo$AccessibilityAction, 16908342, null, null);
            if (i2 >= 23) {
                accessibilityNodeInfo$AccessibilityAction2 = AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_TO_POSITION;
            } else {
                accessibilityNodeInfo$AccessibilityAction2 = null;
            }
            new a(accessibilityNodeInfo$AccessibilityAction2, 16908343, null, w0.e.class);
            if (i2 >= 23) {
                accessibilityNodeInfo$AccessibilityAction3 = AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_UP;
            } else {
                accessibilityNodeInfo$AccessibilityAction3 = null;
            }
            k = new a(accessibilityNodeInfo$AccessibilityAction3, 16908344, null, null);
            if (i2 >= 23) {
                accessibilityNodeInfo$AccessibilityAction4 = AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_LEFT;
            } else {
                accessibilityNodeInfo$AccessibilityAction4 = null;
            }
            new a(accessibilityNodeInfo$AccessibilityAction4, 16908345, null, null);
            if (i2 >= 23) {
                accessibilityNodeInfo$AccessibilityAction5 = AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_DOWN;
            } else {
                accessibilityNodeInfo$AccessibilityAction5 = null;
            }
            l = new a(accessibilityNodeInfo$AccessibilityAction5, 16908346, null, null);
            if (i2 >= 23) {
                accessibilityNodeInfo$AccessibilityAction6 = AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_RIGHT;
            } else {
                accessibilityNodeInfo$AccessibilityAction6 = null;
            }
            new a(accessibilityNodeInfo$AccessibilityAction6, 16908347, null, null);
            if (i2 >= 29) {
                accessibilityNodeInfo$AccessibilityAction7 = AccessibilityNodeInfo$AccessibilityAction.ACTION_PAGE_UP;
            } else {
                accessibilityNodeInfo$AccessibilityAction7 = null;
            }
            new a(accessibilityNodeInfo$AccessibilityAction7, 16908358, null, null);
            if (i2 >= 29) {
                accessibilityNodeInfo$AccessibilityAction8 = AccessibilityNodeInfo$AccessibilityAction.ACTION_PAGE_DOWN;
            } else {
                accessibilityNodeInfo$AccessibilityAction8 = null;
            }
            new a(accessibilityNodeInfo$AccessibilityAction8, 16908359, null, null);
            if (i2 >= 29) {
                accessibilityNodeInfo$AccessibilityAction9 = AccessibilityNodeInfo$AccessibilityAction.ACTION_PAGE_LEFT;
            } else {
                accessibilityNodeInfo$AccessibilityAction9 = null;
            }
            new a(accessibilityNodeInfo$AccessibilityAction9, 16908360, null, null);
            if (i2 >= 29) {
                accessibilityNodeInfo$AccessibilityAction10 = AccessibilityNodeInfo$AccessibilityAction.ACTION_PAGE_RIGHT;
            } else {
                accessibilityNodeInfo$AccessibilityAction10 = null;
            }
            new a(accessibilityNodeInfo$AccessibilityAction10, 16908361, null, null);
            if (i2 >= 23) {
                accessibilityNodeInfo$AccessibilityAction11 = AccessibilityNodeInfo$AccessibilityAction.ACTION_CONTEXT_CLICK;
            } else {
                accessibilityNodeInfo$AccessibilityAction11 = null;
            }
            new a(accessibilityNodeInfo$AccessibilityAction11, 16908348, null, null);
            if (i2 >= 24) {
                accessibilityNodeInfo$AccessibilityAction12 = AccessibilityNodeInfo$AccessibilityAction.ACTION_SET_PROGRESS;
            } else {
                accessibilityNodeInfo$AccessibilityAction12 = null;
            }
            new a(accessibilityNodeInfo$AccessibilityAction12, 16908349, null, w0.f.class);
            if (i2 >= 26) {
                accessibilityNodeInfo$AccessibilityAction13 = AccessibilityNodeInfo$AccessibilityAction.ACTION_MOVE_WINDOW;
            } else {
                accessibilityNodeInfo$AccessibilityAction13 = null;
            }
            new a(accessibilityNodeInfo$AccessibilityAction13, 16908354, null, w0.d.class);
            if (i2 >= 28) {
                accessibilityNodeInfo$AccessibilityAction14 = AccessibilityNodeInfo$AccessibilityAction.ACTION_SHOW_TOOLTIP;
            } else {
                accessibilityNodeInfo$AccessibilityAction14 = null;
            }
            new a(accessibilityNodeInfo$AccessibilityAction14, 16908356, null, null);
            if (i2 >= 28) {
                accessibilityNodeInfo$AccessibilityAction15 = AccessibilityNodeInfo$AccessibilityAction.ACTION_HIDE_TOOLTIP;
            } else {
                accessibilityNodeInfo$AccessibilityAction15 = null;
            }
            new a(accessibilityNodeInfo$AccessibilityAction15, 16908357, null, null);
            if (i2 >= 30) {
                accessibilityNodeInfo$AccessibilityAction16 = AccessibilityNodeInfo$AccessibilityAction.ACTION_PRESS_AND_HOLD;
            } else {
                accessibilityNodeInfo$AccessibilityAction16 = null;
            }
            new a(accessibilityNodeInfo$AccessibilityAction16, 16908362, null, null);
            if (i2 >= 30) {
                accessibilityNodeInfo$AccessibilityAction17 = AccessibilityNodeInfo$AccessibilityAction.ACTION_IME_ENTER;
            } else {
                accessibilityNodeInfo$AccessibilityAction17 = null;
            }
            new a(accessibilityNodeInfo$AccessibilityAction17, 16908372, null, null);
        }

        public a(Object obj, int i2, BottomSheetBehavior.c cVar, Class cls) {
            this.b = i2;
            this.d = cVar;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                obj = new AccessibilityNodeInfo$AccessibilityAction(i2, null);
            }
            this.a = obj;
            this.c = cls;
        }

        public final int a() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo$AccessibilityAction) this.a).getId();
            }
            return 0;
        }

        public final CharSequence b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo$AccessibilityAction) this.a).getLabel();
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof a)) {
                Object obj2 = this.a;
                Object obj3 = ((a) obj).a;
                return obj2 == null ? obj3 == null : obj2.equals(obj3);
            }
            return false;
        }

        public final int hashCode() {
            Object obj = this.a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    /* renamed from: s0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b {
        public final Object a;

        public b(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
            this.a = collectionInfo;
        }
    }

    /* renamed from: s0$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class c {
        public final Object a;

        public c(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
            this.a = collectionItemInfo;
        }

        public static c a(int i, int i2, int i3, int i4) {
            return Build.VERSION.SDK_INT >= 21 ? new c(u0.a(i, i2, i3, i4)) : new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false));
        }
    }

    public s0(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    public static String d(int i) {
        if (i != 1) {
            if (i != 2) {
                switch (i) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case 32:
                        return "ACTION_LONG_CLICK";
                    case 64:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case 256:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case 512:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case 1024:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case 2048:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case 4096:
                        return "ACTION_SCROLL_FORWARD";
                    case 8192:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case 32768:
                        return "ACTION_PASTE";
                    case 65536:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case 524288:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case 16908354:
                        return "ACTION_MOVE_WINDOW";
                    case 16908372:
                        return "ACTION_IME_ENTER";
                    default:
                        switch (i) {
                            case 16908342:
                                return "ACTION_SHOW_ON_SCREEN";
                            case 16908343:
                                return "ACTION_SCROLL_TO_POSITION";
                            case 16908344:
                                return "ACTION_SCROLL_UP";
                            case 16908345:
                                return "ACTION_SCROLL_LEFT";
                            case 16908346:
                                return "ACTION_SCROLL_DOWN";
                            case 16908347:
                                return "ACTION_SCROLL_RIGHT";
                            case 16908348:
                                return "ACTION_CONTEXT_CLICK";
                            case 16908349:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i) {
                                    case 16908356:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case 16908357:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case 16908358:
                                        return "ACTION_PAGE_UP";
                                    case 16908359:
                                        return "ACTION_PAGE_DOWN";
                                    case 16908360:
                                        return "ACTION_PAGE_LEFT";
                                    case 16908361:
                                        return "ACTION_PAGE_RIGHT";
                                    case 16908362:
                                        return "ACTION_PRESS_AND_HOLD";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    public final void a(int i) {
        this.a.addAction(i);
    }

    public final void b(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            n0.c(this.a, (AccessibilityNodeInfo$AccessibilityAction) aVar.a);
        }
    }

    public final ArrayList c(String str) {
        ArrayList<Integer> integerArrayList = this.a.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.a.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    @Deprecated
    public final void e(Rect rect) {
        this.a.getBoundsInParent(rect);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof s0)) {
            s0 s0Var = (s0) obj;
            AccessibilityNodeInfo accessibilityNodeInfo = this.a;
            if (accessibilityNodeInfo == null) {
                if (s0Var.a != null) {
                    return false;
                }
            } else if (!accessibilityNodeInfo.equals(s0Var.a)) {
                return false;
            }
            return this.c == s0Var.c && this.b == s0Var.b;
        }
        return false;
    }

    public final CharSequence f() {
        if (!c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            ArrayList c2 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            ArrayList c3 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            ArrayList c4 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            ArrayList c5 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.a.getText(), 0, this.a.getText().length()));
            for (int i = 0; i < c2.size(); i++) {
                spannableString.setSpan(new g0(((Integer) c5.get(i)).intValue(), this, this.a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) c2.get(i)).intValue(), ((Integer) c3.get(i)).intValue(), ((Integer) c4.get(i)).intValue());
            }
            return spannableString;
        }
        return this.a.getText();
    }

    public final void g(int i, boolean z) {
        Bundle extras = this.a.getExtras();
        if (extras != null) {
            int i2 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i ^ (-1));
            if (!z) {
                i = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public final void h(String str) {
        this.a.setClassName(str);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final void i(c cVar) {
        this.a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) cVar.a);
    }

    public final void j(CharSequence charSequence) {
        this.a.setContentDescription(charSequence);
    }

    public final void k(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            i0.c(this.a, charSequence);
        } else {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    public final String toString() {
        List list;
        ?? emptyList;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        e(rect);
        sb.append("; boundsInParent: " + rect);
        this.a.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(this.a.getPackageName());
        sb.append("; className: ");
        sb.append(this.a.getClassName());
        sb.append("; text: ");
        sb.append(f());
        sb.append("; contentDescription: ");
        sb.append(this.a.getContentDescription());
        sb.append("; viewId: ");
        sb.append(this.a.getViewIdResourceName());
        sb.append("; checkable: ");
        sb.append(this.a.isCheckable());
        sb.append("; checked: ");
        sb.append(this.a.isChecked());
        sb.append("; focusable: ");
        sb.append(this.a.isFocusable());
        sb.append("; focused: ");
        sb.append(this.a.isFocused());
        sb.append("; selected: ");
        sb.append(this.a.isSelected());
        sb.append("; clickable: ");
        sb.append(this.a.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.a.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.a.isEnabled());
        sb.append("; password: ");
        sb.append(this.a.isPassword());
        sb.append("; scrollable: " + this.a.isScrollable());
        sb.append("; [");
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            if (i >= 21) {
                list = p0.c(this.a);
            } else {
                list = null;
            }
            if (list != null) {
                emptyList = new ArrayList();
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    emptyList.add(new a(list.get(i2), 0, null, null));
                }
            } else {
                emptyList = Collections.emptyList();
            }
            for (int i3 = 0; i3 < emptyList.size(); i3++) {
                a aVar = (a) emptyList.get(i3);
                String d2 = d(aVar.a());
                if (d2.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                    d2 = aVar.b().toString();
                }
                sb.append(d2);
                if (i3 != emptyList.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int actions = this.a.getActions();
            while (actions != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(actions);
                actions &= numberOfTrailingZeros ^ (-1);
                sb.append(d(numberOfTrailingZeros));
                if (actions != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }
}