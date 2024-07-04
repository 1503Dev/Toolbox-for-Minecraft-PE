package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

public final class AlertController {
    public TextView A;
    public TextView B;
    public View C;
    public ListAdapter D;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public boolean K;
    public c L;
    public final Context a;
    public final m5 b;
    public final Window c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public RecycleListView g;
    public View h;
    public int i;
    public Button k;
    public CharSequence l;
    public Message m;
    public Drawable n;
    public Button o;
    public CharSequence p;
    public Message q;
    public Drawable r;
    public Button s;
    public CharSequence t;
    public Message u;
    public Drawable v;
    public NestedScrollView w;
    public Drawable y;
    public ImageView z;
    public boolean j = false;
    public int x = 0;
    public int E = -1;
    public final a M = new a();

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class RecycleListView extends ListView {
        public final int P;
        public final int Q;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lj0.RecycleListView);
            this.Q = obtainStyledAttributes.getDimensionPixelOffset(lj0.RecycleListView_paddingBottomNoButtons, -1);
            this.P = obtainStyledAttributes.getDimensionPixelOffset(lj0.RecycleListView_paddingTopNoTitle, -1);
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            Message obtain = ((view != alertController.k || (message2 = alertController.m) == null) && (view != alertController.o || (message2 = alertController.q) == null)) ? (view != alertController.s || (message = alertController.u) == null) ? null : Message.obtain(message) : Message.obtain(message2);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.L.obtainMessage(1, alertController2.b).sendToTarget();
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b {
        public final Context a;
        public final LayoutInflater b;
        public Drawable c;
        public CharSequence d;
        public View e;
        public CharSequence f;
        public CharSequence g;
        public DialogInterface.OnClickListener h;
        public CharSequence i;
        public DialogInterface.OnClickListener j;
        public DialogInterface.OnKeyListener k;
        public ListAdapter l;
        public DialogInterface.OnClickListener m;
        public View n;
        public boolean o;
        public int p = -1;

        public b(ContextThemeWrapper contextThemeWrapper) {
            this.a = contextThemeWrapper;
            this.b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class c extends Handler {
        public WeakReference<DialogInterface> a;

        public c(DialogInterface dialogInterface) {
            this.a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.a.get(), message.what);
            } else if (i != 1) {
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i) {
            super(context, i, 16908308, (Object[]) null);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, m5 m5Var, Window window) {
        this.a = context;
        this.b = m5Var;
        this.c = window;
        this.L = new c(m5Var);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, lj0.AlertDialog, ih0.alertDialogStyle, 0);
        this.F = obtainStyledAttributes.getResourceId(lj0.AlertDialog_android_layout, 0);
        this.G = obtainStyledAttributes.getResourceId(lj0.AlertDialog_buttonPanelSideLayout, 0);
        this.H = obtainStyledAttributes.getResourceId(lj0.AlertDialog_listLayout, 0);
        obtainStyledAttributes.getResourceId(lj0.AlertDialog_multiChoiceItemLayout, 0);
        this.I = obtainStyledAttributes.getResourceId(lj0.AlertDialog_singleChoiceItemLayout, 0);
        this.J = obtainStyledAttributes.getResourceId(lj0.AlertDialog_listItemLayout, 0);
        this.K = obtainStyledAttributes.getBoolean(lj0.AlertDialog_showTitle, true);
        this.d = obtainStyledAttributes.getDimensionPixelSize(lj0.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        m5Var.a().q(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (a(viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static void b(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    public static ViewGroup c(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void d(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.L.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.t = charSequence;
            this.u = obtainMessage;
            this.v = null;
        } else if (i == -2) {
            this.p = charSequence;
            this.q = obtainMessage;
            this.r = null;
        } else if (i != -1) {
            throw new IllegalArgumentException("Button does not exist");
        } else {
            this.l = charSequence;
            this.m = obtainMessage;
            this.n = null;
        }
    }
}