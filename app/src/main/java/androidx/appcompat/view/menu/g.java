package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.k;

public final class g implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, k.a {
    public f P;
    public androidx.appcompat.app.b Q;
    public d R;

    public g(f fVar) {
        this.P = fVar;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void b(f fVar, boolean z) {
        androidx.appcompat.app.b bVar;
        if ((z || fVar == this.P) && (bVar = this.Q) != null) {
            bVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final boolean c(f fVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        f fVar = this.P;
        d dVar = this.R;
        if (dVar.V == null) {
            dVar.V = new d.a();
        }
        fVar.q(dVar.V.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.R.b(this.P, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.Q.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.Q.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.P.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.P.performShortcut(i, keyEvent, 0);
    }
}