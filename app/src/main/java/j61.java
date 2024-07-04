package defpackage;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: j61  reason: default package */
public class j61 implements Window.Callback {
    public final Window.Callback P;

    public j61(Window.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.P = callback;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.P.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.P.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.P.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.P.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.P.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.P.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.P.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.P.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.P.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.P.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.P.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.P.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.P.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return this.P.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        this.P.onPanelClosed(i, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        this.P.onPointerCaptureChanged(z);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.P.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        i61.a(this.P, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.P.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return tm.b(this.P, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.P.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.P.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.P.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return v6.a(this.P, callback, i);
    }
}