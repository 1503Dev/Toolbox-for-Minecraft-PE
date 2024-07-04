package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;

public final class j {
    public final Context a;
    public final f b;
    public View e;
    public n g;
    public PopupWindow.OnDismissListener h;
    public int f = 8388611;
    public final a i = new a();
    public final int c = 2130969135;
    public final int d = 0;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            j jVar = j.this;
            jVar.g = null;
            PopupWindow.OnDismissListener onDismissListener = jVar.h;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }
    }

    public j(Context context, View view, f fVar) {
        this.a = context;
        this.b = fVar;
        this.e = view;
    }
}