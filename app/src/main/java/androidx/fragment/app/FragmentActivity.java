package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;

public class FragmentActivity extends ComponentActivity {
    public boolean W;
    public boolean X;
    public int Z;
    public nt0<String> a0;
    public final nr U = new nr(new a());
    public final androidx.lifecycle.e V = new androidx.lifecycle.e(this);
    public boolean Y = true;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends or<FragmentActivity> implements p41, vb0 {
        public a() {
            super(FragmentActivity.this);
        }

        @Override // defpackage.vb0
        public final OnBackPressedDispatcher a() {
            return FragmentActivity.this.T;
        }

        @Override // defpackage.z9
        public final View f(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        @Override // defpackage.z9
        public final boolean g() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // defpackage.or
        public final void h() {
            FragmentActivity.this.getClass();
        }

        @Override // defpackage.p41
        public final o41 i() {
            return FragmentActivity.this.i();
        }

        @Override // defpackage.or
        public final void j(PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump("  ", null, printWriter, strArr);
        }

        @Override // defpackage.b10
        public final androidx.lifecycle.e k() {
            return FragmentActivity.this.V;
        }

        @Override // defpackage.or
        public final FragmentActivity l() {
            return FragmentActivity.this;
        }

        @Override // defpackage.or
        public final LayoutInflater m() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override // defpackage.or
        public final void n() {
            Window window = FragmentActivity.this.getWindow();
            if (window == null) {
                return;
            }
            int i = window.getAttributes().windowAnimations;
        }

        @Override // defpackage.or
        public final boolean o() {
            return FragmentActivity.this.getWindow() != null;
        }

        @Override // defpackage.or
        public final boolean p() {
            return !FragmentActivity.this.isFinishing();
        }

        @Override // defpackage.or
        public final void q() {
            FragmentActivity.this.o();
        }
    }

    public static void m(int i) {
        if ((i & (-65536)) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    public static boolean n(f fVar) {
        List<c> list;
        boolean z;
        FragmentActivity l;
        if (fVar.U.isEmpty()) {
            list = Collections.emptyList();
        } else {
            synchronized (fVar.U) {
                list = (List) fVar.U.clone();
            }
        }
        boolean z2 = false;
        for (c cVar : list) {
            if (cVar != null) {
                if (cVar.C0.b.compareTo(c.EnumC0007c.STARTED) >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    androidx.lifecycle.e eVar = cVar.C0;
                    c.EnumC0007c enumC0007c = c.EnumC0007c.CREATED;
                    eVar.c("setCurrentState");
                    eVar.e(enumC0007c);
                    z2 = true;
                }
                or orVar = cVar.g0;
                if (orVar == null) {
                    l = null;
                } else {
                    l = orVar.l();
                }
                if (l != null) {
                    z2 |= n(cVar.j());
                }
            }
        }
        return z2;
    }

    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.W);
        printWriter.print(" mResumed=");
        printWriter.print(this.X);
        printWriter.print(" mStopped=");
        printWriter.print(this.Y);
        if (getApplication() != null) {
            new m20(this, i()).D1(str2, printWriter);
        }
        ((or) this.U.b).S.E(str, fileDescriptor, printWriter, strArr);
    }

    @Deprecated
    public void o() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.U.i();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String str = (String) this.a0.d(i4, null);
            nt0<String> nt0Var = this.a0;
            int h = gw.h(nt0Var.S, i4, nt0Var.Q);
            if (h >= 0) {
                Object[] objArr = nt0Var.R;
                Object obj = objArr[h];
                Object obj2 = nt0.T;
                if (obj != obj2) {
                    objArr[h] = obj2;
                    nt0Var.P = true;
                }
            }
            if (str == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            c L = ((or) this.U.b).S.L(str);
            if (L == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + str);
                return;
            }
            L.o(i & 65535, i2, intent);
            return;
        }
        int i5 = j1.b;
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.U.i();
        ((or) this.U.b).S.h();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        or orVar = (or) this.U.b;
        orVar.S.c(orVar, orVar, null);
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            or orVar2 = (or) this.U.b;
            if (orVar2 instanceof p41) {
                orVar2.S.b0(parcelable);
                if (bundle.containsKey("android:support:next_request_index")) {
                    this.Z = bundle.getInt("android:support:next_request_index");
                    int[] intArray = bundle.getIntArray("android:support:request_indicies");
                    String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                    if (intArray != null && stringArray != null && intArray.length == stringArray.length) {
                        this.a0 = new nt0<>(intArray.length);
                        for (int i = 0; i < intArray.length; i++) {
                            this.a0.e(intArray[i], stringArray[i]);
                        }
                    } else {
                        Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                    }
                }
            } else {
                throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
        }
        if (this.a0 == null) {
            this.a0 = new nt0<>();
            this.Z = 0;
        }
        super.onCreate(bundle);
        this.V.d(c.b.ON_CREATE);
        f fVar = ((or) this.U.b).S;
        fVar.j0 = false;
        fVar.k0 = false;
        fVar.D(1);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            nr nrVar = this.U;
            getMenuInflater();
            return onCreatePanelMenu | ((or) nrVar.b).S.j();
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((or) this.U.b).S.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((or) this.U.b).S.k();
        this.V.d(c.b.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        f fVar = ((or) this.U.b).S;
        for (int i = 0; i < fVar.U.size(); i++) {
            c cVar = fVar.U.get(i);
            if (cVar != null) {
                cVar.B();
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            if (i != 6) {
                return false;
            }
            return ((or) this.U.b).S.i();
        }
        return ((or) this.U.b).S.z();
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        f fVar = ((or) this.U.b).S;
        int size = fVar.U.size();
        while (true) {
            size--;
            if (size >= 0) {
                c cVar = fVar.U.get(size);
                if (cVar != null) {
                    cVar.C(z);
                }
            } else {
                return;
            }
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.U.i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            ((or) this.U.b).S.A();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.X = false;
        ((or) this.U.b).S.D(3);
        this.V.d(c.b.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        f fVar = ((or) this.U.b).S;
        int size = fVar.U.size();
        while (true) {
            size--;
            if (size >= 0) {
                c cVar = fVar.U.get(size);
                if (cVar != null) {
                    cVar.D(z);
                }
            } else {
                return;
            }
        }
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.V.d(c.b.ON_RESUME);
        f fVar = ((or) this.U.b).S;
        fVar.j0 = false;
        fVar.k0 = false;
        fVar.D(4);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return super.onPreparePanel(0, view, menu) | ((or) this.U.b).S.C();
        }
        return super.onPreparePanel(i, view, menu);
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.U.i();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String str = (String) this.a0.d(i3, null);
            nt0<String> nt0Var = this.a0;
            int h = gw.h(nt0Var.S, i3, nt0Var.Q);
            if (h >= 0) {
                Object[] objArr = nt0Var.R;
                Object obj = objArr[h];
                Object obj2 = nt0.T;
                if (obj != obj2) {
                    objArr[h] = obj2;
                    nt0Var.P = true;
                }
            }
            if (str == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            } else if (((or) this.U.b).S.L(str) == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + str);
            }
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        this.X = true;
        this.U.i();
        ((or) this.U.b).S.H();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        do {
        } while (n(((or) this.U.b).S));
        this.V.d(c.b.ON_STOP);
        qr c0 = ((or) this.U.b).S.c0();
        if (c0 != null) {
            bundle.putParcelable("android:support:fragments", c0);
        }
        if (this.a0.f() > 0) {
            bundle.putInt("android:support:next_request_index", this.Z);
            int[] iArr = new int[this.a0.f()];
            String[] strArr = new String[this.a0.f()];
            for (int i = 0; i < this.a0.f(); i++) {
                nt0<String> nt0Var = this.a0;
                if (nt0Var.P) {
                    nt0Var.c();
                }
                iArr[i] = nt0Var.Q[i];
                strArr[i] = this.a0.h(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.Y = false;
        if (!this.W) {
            this.W = true;
            f fVar = ((or) this.U.b).S;
            fVar.j0 = false;
            fVar.k0 = false;
            fVar.D(2);
        }
        this.U.i();
        ((or) this.U.b).S.H();
        this.V.d(c.b.ON_START);
        f fVar2 = ((or) this.U.b).S;
        fVar2.j0 = false;
        fVar2.k0 = false;
        fVar2.D(3);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.U.i();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.Y = true;
        do {
        } while (n(((or) this.U.b).S));
        f fVar = ((or) this.U.b).S;
        fVar.k0 = true;
        fVar.D(2);
        this.V.d(c.b.ON_STOP);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        if (i != -1) {
            m(i);
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            m(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (i != -1) {
            m(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i != -1) {
            m(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((or) this.U.b).S.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}