package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.s0;
import defpackage.w0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: h0  reason: default package */
public class h0 {
    public static final View.AccessibilityDelegate c = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate a;
    public final a b;

    /* renamed from: h0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a extends View.AccessibilityDelegate {
        public final h0 a;

        public a(h0 h0Var) {
            this.a = h0Var;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            v0 b = this.a.b(view);
            if (b != null) {
                return (AccessibilityNodeProvider) b.a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.c(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            boolean z;
            Object tag;
            boolean booleanValue;
            boolean z2;
            Object obj;
            boolean booleanValue2;
            boolean z3;
            Object tag2;
            int i;
            s0 s0Var = new s0(accessibilityNodeInfo);
            WeakHashMap<View, String> weakHashMap = a41.a;
            int i2 = ai0.tag_screen_reader_focusable;
            int i3 = Build.VERSION.SDK_INT;
            boolean z4 = true;
            if (i3 >= 28) {
                z = true;
            } else {
                z = false;
            }
            ClickableSpan[] clickableSpanArr = null;
            if (z) {
                tag = Boolean.valueOf(v31.a(view));
            } else {
                tag = view.getTag(i2);
                if (!Boolean.class.isInstance(tag)) {
                    tag = null;
                }
            }
            Boolean bool = (Boolean) tag;
            if (bool == null) {
                booleanValue = false;
            } else {
                booleanValue = bool.booleanValue();
            }
            if (i3 >= 28) {
                l0.a(accessibilityNodeInfo, booleanValue);
            } else {
                s0Var.g(1, booleanValue);
            }
            int i4 = ai0.tag_accessibility_heading;
            if (i3 >= 28) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                obj = Boolean.valueOf(j6.c(view));
            } else {
                Object tag3 = view.getTag(i4);
                if (Boolean.class.isInstance(tag3)) {
                    obj = tag3;
                } else {
                    obj = null;
                }
            }
            Boolean bool2 = (Boolean) obj;
            if (bool2 == null) {
                booleanValue2 = false;
            } else {
                booleanValue2 = bool2.booleanValue();
            }
            if (i3 >= 28) {
                r0.a(accessibilityNodeInfo, booleanValue2);
            } else {
                s0Var.g(2, booleanValue2);
            }
            CharSequence d = a41.d(view);
            if (i3 >= 28) {
                m0.c(accessibilityNodeInfo, d);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", d);
            }
            int i5 = ai0.tag_state_description;
            if (i3 >= 30) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                tag2 = x31.a(view);
            } else {
                tag2 = view.getTag(i5);
                if (!CharSequence.class.isInstance(tag2)) {
                    tag2 = null;
                }
            }
            CharSequence charSequence = (CharSequence) tag2;
            if (i3 < 30) {
                z4 = false;
            }
            if (z4) {
                o0.a(accessibilityNodeInfo, charSequence);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
            }
            this.a.d(view, s0Var);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i3 < 26) {
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view.getTag(ai0.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i6 = 0; i6 < sparseArray.size(); i6++) {
                        if (((WeakReference) sparseArray.valueAt(i6)).get() == null) {
                            arrayList.add(Integer.valueOf(i6));
                        }
                    }
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        sparseArray.remove(((Integer) arrayList.get(i7)).intValue());
                    }
                }
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                }
                if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                    s0Var.a.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", ai0.accessibility_action_clickable_span);
                    int i8 = ai0.tag_accessibility_clickable_spans;
                    SparseArray sparseArray2 = (SparseArray) view.getTag(i8);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(i8, sparseArray2);
                    }
                    for (int i9 = 0; i9 < clickableSpanArr.length; i9++) {
                        ClickableSpan clickableSpan = clickableSpanArr[i9];
                        int i10 = 0;
                        while (true) {
                            if (i10 < sparseArray2.size()) {
                                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i10)).get())) {
                                    i = sparseArray2.keyAt(i10);
                                    break;
                                }
                                i10++;
                            } else {
                                i = s0.d;
                                s0.d = i + 1;
                                break;
                            }
                        }
                        sparseArray2.put(i, new WeakReference(clickableSpanArr[i9]));
                        ClickableSpan clickableSpan2 = clickableSpanArr[i9];
                        Spanned spanned = (Spanned) text;
                        s0Var.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        s0Var.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        s0Var.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        s0Var.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
                    }
                }
            }
            List list = (List) view.getTag(ai0.tag_accessibility_actions);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (int i11 = 0; i11 < list.size(); i11++) {
                s0Var.b((s0.a) list.get(i11));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.e(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.a.f(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.a.g(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEvent(View view, int i) {
            this.a.h(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.a.i(view, accessibilityEvent);
        }
    }

    public h0() {
        this(c);
    }

    public h0(View.AccessibilityDelegate accessibilityDelegate) {
        this.a = accessibilityDelegate;
        this.b = new a(this);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public v0 b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new v0(accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, s0 s0Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, s0Var.a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i, Bundle bundle) {
        boolean z;
        WeakReference weakReference;
        boolean z2;
        ClickableSpan[] clickableSpanArr;
        String name;
        List list = (List) view.getTag(ai0.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z3 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                break;
            }
            s0.a aVar = (s0.a) list.get(i2);
            if (aVar.a() == i) {
                if (aVar.d != null) {
                    Class<? extends w0.a> cls = aVar.c;
                    if (cls != null) {
                        try {
                            cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]).getClass();
                        } catch (Exception e) {
                            Class<? extends w0.a> cls2 = aVar.c;
                            if (cls2 == null) {
                                name = "null";
                            } else {
                                name = cls2.getName();
                            }
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + name, e);
                        }
                    }
                    BottomSheetBehavior.c cVar = (BottomSheetBehavior.c) aVar.d;
                    BottomSheetBehavior.this.B(cVar.a);
                    z = true;
                }
            } else {
                i2++;
            }
        }
        z = false;
        if (!z) {
            z = this.a.performAccessibilityAction(view, i, bundle);
        }
        if (!z && i == ai0.accessibility_action_clickable_span) {
            int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(ai0.tag_accessibility_clickable_spans);
            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null) {
                ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
                if (clickableSpan != null) {
                    CharSequence text = view.createAccessibilityNodeInfo().getText();
                    if (text instanceof Spanned) {
                        clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                    } else {
                        clickableSpanArr = null;
                    }
                    for (int i4 = 0; clickableSpanArr != null && i4 < clickableSpanArr.length; i4++) {
                        if (clickableSpan.equals(clickableSpanArr[i4])) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                if (z2) {
                    clickableSpan.onClick(view);
                    z3 = true;
                }
            }
            return z3;
        }
        return z;
    }

    public void h(View view, int i) {
        this.a.sendAccessibilityEvent(view, i);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}