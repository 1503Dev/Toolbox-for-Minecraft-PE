package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends androidx.appcompat.widget.c implements ld {
    public static final k Y0 = new k();
    public final Intent A0;
    public final CharSequence B0;
    public View.OnFocusChangeListener C0;
    public View.OnClickListener D0;
    public boolean E0;
    public boolean F0;
    public ah G0;
    public boolean H0;
    public CharSequence I0;
    public boolean J0;
    public boolean K0;
    public int L0;
    public boolean M0;
    public String N0;
    public CharSequence O0;
    public boolean P0;
    public int Q0;
    public SearchableInfo R0;
    public Bundle S0;
    public final b T0;
    public c U0;
    public final WeakHashMap<String, Drawable.ConstantState> V0;
    public g W0;
    public a X0;
    public final SearchAutoComplete h0;
    public final View i0;
    public final View j0;
    public final View k0;
    public final ImageView l0;
    public final ImageView m0;
    public final ImageView n0;
    public final ImageView o0;
    public final View p0;
    public p q0;
    public Rect r0;
    public Rect s0;
    public int[] t0;
    public int[] u0;
    public final ImageView v0;
    public final Drawable w0;
    public final int x0;
    public final int y0;
    public final Intent z0;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class SearchAutoComplete extends v4 {
        public int S;
        public SearchView T;
        public boolean U;
        public final a V;

        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.U) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.U = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, ih0.autoCompleteTextViewStyle);
            this.V = new a();
            this.S = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i < 960 || i2 < 720 || configuration.orientation != 2) {
                if (i < 600) {
                    return (i < 640 || i2 < 480) ? 160 : 192;
                }
                return 192;
            }
            return 256;
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.S <= 0 || super.enoughToFilter();
        }

        @Override // defpackage.v4, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.U) {
                removeCallbacks(this.V);
                post(this.V);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.T;
            searchView.w(searchView.F0);
            searchView.post(searchView.T0);
            if (searchView.h0.hasFocus()) {
                searchView.l();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.T.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            boolean z2;
            Method method;
            super.onWindowFocusChanged(z);
            if (z && this.T.hasFocus() && getVisibility() == 0) {
                this.U = true;
                Context context = getContext();
                k kVar = SearchView.Y0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && (method = SearchView.Y0.c) != null) {
                    try {
                        method.invoke(this, Boolean.TRUE);
                    } catch (Exception unused) {
                    }
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.U = false;
                removeCallbacks(this.V);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (!inputMethodManager.isActive(this)) {
                this.U = true;
            } else {
                this.U = false;
                removeCallbacks(this.V);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.T = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.S = i;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.h0.getText();
            searchView.O0 = text;
            boolean z = !TextUtils.isEmpty(text);
            searchView.v(z);
            boolean z2 = !z;
            int i4 = 8;
            if (searchView.M0 && !searchView.F0 && z2) {
                searchView.m0.setVisibility(8);
                i4 = 0;
            }
            searchView.o0.setVisibility(i4);
            searchView.r();
            searchView.u();
            searchView.getClass();
            searchView.N0 = charSequence.toString();
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SearchView.this.s();
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ah ahVar = SearchView.this.G0;
            if (ahVar instanceof ou0) {
                ahVar.c(null);
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.C0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9;
            int i10;
            SearchView searchView = SearchView.this;
            if (searchView.p0.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.j0.getPaddingLeft();
                Rect rect = new Rect();
                boolean a = c51.a(searchView);
                if (searchView.E0) {
                    i9 = resources.getDimensionPixelSize(sh0.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(sh0.abc_dropdownitem_icon_width);
                } else {
                    i9 = 0;
                }
                searchView.h0.getDropDownBackground().getPadding(rect);
                if (a) {
                    i10 = -rect.left;
                } else {
                    i10 = paddingLeft - (rect.left + i9);
                }
                searchView.h0.setDropDownHorizontalOffset(i10);
                searchView.h0.setDropDownWidth((((searchView.p0.getWidth() + rect.left) + rect.right) + i9) - paddingLeft);
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String flattenToShortString;
            SearchView searchView = SearchView.this;
            if (view == searchView.l0) {
                searchView.w(false);
                searchView.h0.requestFocus();
                searchView.h0.setImeVisibility(true);
                View.OnClickListener onClickListener = searchView.D0;
                if (onClickListener != null) {
                    onClickListener.onClick(searchView);
                }
            } else if (view == searchView.n0) {
                searchView.m();
            } else if (view == searchView.m0) {
                searchView.q();
            } else if (view == searchView.o0) {
                SearchableInfo searchableInfo = searchView.R0;
                if (searchableInfo != null) {
                    try {
                        if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                            Intent intent = new Intent(searchView.z0);
                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                            if (searchActivity == null) {
                                flattenToShortString = null;
                            } else {
                                flattenToShortString = searchActivity.flattenToShortString();
                            }
                            intent.putExtra("calling_package", flattenToShortString);
                            searchView.getContext().startActivity(intent);
                        } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.k(searchView.A0, searchableInfo));
                        }
                    } catch (ActivityNotFoundException unused) {
                        Log.w("SearchView", "Could not find voice search activity");
                    }
                }
            } else if (view == searchView.h0) {
                searchView.l();
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            boolean z;
            int length;
            SearchView searchView = SearchView.this;
            if (searchView.R0 == null) {
                return false;
            }
            if (searchView.h0.isPopupShowing() && SearchView.this.h0.getListSelection() != -1) {
                SearchView searchView2 = SearchView.this;
                if (searchView2.R0 == null || searchView2.G0 == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                    return false;
                }
                if (i != 66 && i != 84 && i != 61) {
                    if (i != 21 && i != 22) {
                        if (i != 19) {
                            return false;
                        }
                        searchView2.h0.getListSelection();
                        return false;
                    }
                    if (i == 21) {
                        length = 0;
                    } else {
                        length = searchView2.h0.length();
                    }
                    searchView2.h0.setSelection(length);
                    searchView2.h0.setListSelection(0);
                    searchView2.h0.clearListSelection();
                    k kVar = SearchView.Y0;
                    SearchAutoComplete searchAutoComplete = searchView2.h0;
                    Method method = kVar.c;
                    if (method != null) {
                        try {
                            method.invoke(searchAutoComplete, Boolean.TRUE);
                        } catch (Exception unused) {
                        }
                    }
                    return true;
                }
                return searchView2.n(searchView2.h0.getListSelection());
            }
            if (TextUtils.getTrimmedLength(SearchView.this.h0.getText()) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView3 = SearchView.this;
            searchView3.getContext().startActivity(searchView3.j("android.intent.action.SEARCH", null, null, searchView3.h0.getText().toString()));
            return true;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.q();
            return true;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.n(i);
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.o(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class k {
        public Method a;
        public Method b;
        public Method c;

        public k() {
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface l {
        boolean a();
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface m {
        boolean a();

        boolean b();
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface n {
        boolean a();

        boolean b();
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class o extends c0 {
        public static final Parcelable.Creator<o> CREATOR = new a();
        public boolean R;

        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public static class a implements Parcelable.ClassLoaderCreator<o> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new o(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new o[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.R = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public o(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder b = e5.b("SearchView.SavedState{");
            b.append(Integer.toHexString(System.identityHashCode(this)));
            b.append(" isIconified=");
            b.append(this.R);
            b.append("}");
            return b.toString();
        }

        @Override // defpackage.c0, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.P, i);
            parcel.writeValue(Boolean.valueOf(this.R));
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class p extends TouchDelegate {
        public final View a;
        public final Rect b;
        public final Rect c;
        public final Rect d;
        public final int e;
        public boolean f;

        public p(Rect rect, Rect rect2, SearchAutoComplete searchAutoComplete) {
            super(rect, searchAutoComplete);
            int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
            this.e = scaledTouchSlop;
            Rect rect3 = new Rect();
            this.b = rect3;
            Rect rect4 = new Rect();
            this.d = rect4;
            Rect rect5 = new Rect();
            this.c = rect5;
            rect3.set(rect);
            rect4.set(rect);
            int i = -scaledTouchSlop;
            rect4.inset(i, i);
            rect5.set(rect2);
            this.a = searchAutoComplete;
        }

        @Override // android.view.TouchDelegate
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            float f;
            int i;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f;
                    if (z2 && !this.d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.f;
                        this.f = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else {
                if (this.b.contains(x, y)) {
                    this.f = true;
                    z = true;
                }
                z = true;
                z3 = false;
            }
            if (z3) {
                if (!z || this.c.contains(x, y)) {
                    Rect rect = this.c;
                    f = x - rect.left;
                    i = y - rect.top;
                } else {
                    f = this.a.getWidth() / 2;
                    i = this.a.getHeight() / 2;
                }
                motionEvent.setLocation(f, i);
                return this.a.dispatchTouchEvent(motionEvent);
            }
            return false;
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ih0.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.r0 = new Rect();
        this.s0 = new Rect();
        this.t0 = new int[2];
        this.u0 = new int[2];
        this.T0 = new b();
        this.U0 = new c();
        this.V0 = new WeakHashMap<>();
        f fVar = new f();
        this.W0 = new g();
        h hVar = new h();
        i iVar = new i();
        j jVar = new j();
        this.X0 = new a();
        hx0 hx0Var = new hx0(context, context.obtainStyledAttributes(attributeSet, lj0.SearchView, i2, 0));
        LayoutInflater.from(context).inflate(hx0Var.i(lj0.SearchView_layout, ni0.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(hi0.search_src_text);
        this.h0 = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.i0 = findViewById(hi0.search_edit_frame);
        View findViewById = findViewById(hi0.search_plate);
        this.j0 = findViewById;
        View findViewById2 = findViewById(hi0.submit_area);
        this.k0 = findViewById2;
        ImageView imageView = (ImageView) findViewById(hi0.search_button);
        this.l0 = imageView;
        ImageView imageView2 = (ImageView) findViewById(hi0.search_go_btn);
        this.m0 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(hi0.search_close_btn);
        this.n0 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(hi0.search_voice_btn);
        this.o0 = imageView4;
        ImageView imageView5 = (ImageView) findViewById(hi0.search_mag_icon);
        this.v0 = imageView5;
        Drawable e2 = hx0Var.e(lj0.SearchView_queryBackground);
        WeakHashMap<View, String> weakHashMap = a41.a;
        findViewById.setBackground(e2);
        findViewById2.setBackground(hx0Var.e(lj0.SearchView_submitBackground));
        int i3 = lj0.SearchView_searchIcon;
        imageView.setImageDrawable(hx0Var.e(i3));
        imageView2.setImageDrawable(hx0Var.e(lj0.SearchView_goIcon));
        imageView3.setImageDrawable(hx0Var.e(lj0.SearchView_closeIcon));
        imageView4.setImageDrawable(hx0Var.e(lj0.SearchView_voiceIcon));
        imageView5.setImageDrawable(hx0Var.e(i3));
        this.w0 = hx0Var.e(lj0.SearchView_searchHintIcon);
        f01.a(getResources().getString(wi0.abc_searchview_description_search), imageView);
        this.x0 = hx0Var.i(lj0.SearchView_suggestionRowLayout, ni0.abc_search_dropdown_item_icons_2line);
        this.y0 = hx0Var.i(lj0.SearchView_commitIcon, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.X0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.W0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(hx0Var.a(lj0.SearchView_iconifiedByDefault, true));
        int d2 = hx0Var.d(lj0.SearchView_android_maxWidth, -1);
        if (d2 != -1) {
            setMaxWidth(d2);
        }
        this.B0 = hx0Var.k(lj0.SearchView_defaultQueryHint);
        this.I0 = hx0Var.k(lj0.SearchView_queryHint);
        int h2 = hx0Var.h(lj0.SearchView_android_imeOptions, -1);
        if (h2 != -1) {
            setImeOptions(h2);
        }
        int h3 = hx0Var.h(lj0.SearchView_android_inputType, -1);
        if (h3 != -1) {
            setInputType(h3);
        }
        setFocusable(hx0Var.a(lj0.SearchView_android_focusable, true));
        hx0Var.n();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.z0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.A0 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.p0 = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        w(this.E0);
        t();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(sh0.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(sh0.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.h0.setText(charSequence);
        this.h0.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.K0 = true;
        super.clearFocus();
        this.h0.clearFocus();
        this.h0.setImeVisibility(false);
        this.K0 = false;
    }

    public int getImeOptions() {
        return this.h0.getImeOptions();
    }

    public int getInputType() {
        return this.h0.getInputType();
    }

    public int getMaxWidth() {
        return this.L0;
    }

    public CharSequence getQuery() {
        return this.h0.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.I0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.R0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.B0 : getContext().getText(this.R0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.y0;
    }

    public int getSuggestionRowLayout() {
        return this.x0;
    }

    public ah getSuggestionsAdapter() {
        return this.G0;
    }

    public final Intent j(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.O0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.S0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.R0.getSearchActivity());
        return intent;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.S0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void l() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.h0.refreshAutoCompleteResults();
            return;
        }
        k kVar = Y0;
        SearchAutoComplete searchAutoComplete = this.h0;
        Method method = kVar.a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        k kVar2 = Y0;
        SearchAutoComplete searchAutoComplete2 = this.h0;
        Method method2 = kVar2.b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final void m() {
        if (!TextUtils.isEmpty(this.h0.getText())) {
            this.h0.setText("");
            this.h0.requestFocus();
            this.h0.setImeVisibility(true);
        } else if (this.E0) {
            clearFocus();
            w(true);
        }
    }

    public final boolean n(int i2) {
        int i3;
        Uri parse;
        String r;
        Cursor cursor = this.G0.R;
        if (cursor != null && cursor.moveToPosition(i2)) {
            Intent intent = null;
            try {
                int i4 = ou0.n0;
                String r2 = ou0.r(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (r2 == null) {
                    r2 = this.R0.getSuggestIntentAction();
                }
                if (r2 == null) {
                    r2 = "android.intent.action.SEARCH";
                }
                String r3 = ou0.r(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (r3 == null) {
                    r3 = this.R0.getSuggestIntentData();
                }
                if (r3 != null && (r = ou0.r(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    r3 = r3 + "/" + Uri.encode(r);
                }
                if (r3 == null) {
                    parse = null;
                } else {
                    parse = Uri.parse(r3);
                }
                intent = j(r2, parse, ou0.r(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), ou0.r(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e2) {
                try {
                    i3 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i3 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i3 + " returned exception.", e2);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e3) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e3);
                }
            }
        }
        this.h0.setImeVisibility(false);
        this.h0.dismissDropDown();
        return true;
    }

    public final void o(int i2) {
        String d2;
        Editable text = this.h0.getText();
        Cursor cursor = this.G0.R;
        if (cursor != null) {
            if (cursor.moveToPosition(i2) && (d2 = this.G0.d(cursor)) != null) {
                setQuery(d2);
            } else {
                setQuery(text);
            }
        }
    }

    @Override // defpackage.ld
    public final void onActionViewCollapsed() {
        this.h0.setText("");
        SearchAutoComplete searchAutoComplete = this.h0;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.O0 = "";
        clearFocus();
        w(true);
        this.h0.setImeOptions(this.Q0);
        this.P0 = false;
    }

    @Override // defpackage.ld
    public final void onActionViewExpanded() {
        if (this.P0) {
            return;
        }
        this.P0 = true;
        int imeOptions = this.h0.getImeOptions();
        this.Q0 = imeOptions;
        this.h0.setImeOptions(imeOptions | 33554432);
        this.h0.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.T0);
        post(this.U0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.c, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.h0;
            Rect rect = this.r0;
            searchAutoComplete.getLocationInWindow(this.t0);
            getLocationInWindow(this.u0);
            int[] iArr = this.t0;
            int i6 = iArr[1];
            int[] iArr2 = this.u0;
            int i7 = i6 - iArr2[1];
            int i8 = iArr[0] - iArr2[0];
            rect.set(i8, i7, searchAutoComplete.getWidth() + i8, searchAutoComplete.getHeight() + i7);
            Rect rect2 = this.s0;
            Rect rect3 = this.r0;
            rect2.set(rect3.left, 0, rect3.right, i5 - i3);
            p pVar = this.q0;
            if (pVar == null) {
                p pVar2 = new p(this.s0, this.r0, this.h0);
                this.q0 = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            Rect rect4 = this.s0;
            Rect rect5 = this.r0;
            pVar.b.set(rect4);
            pVar.d.set(rect4);
            Rect rect6 = pVar.d;
            int i9 = -pVar.e;
            rect6.inset(i9, i9);
            pVar.c.set(rect5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r0 <= 0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    @Override // androidx.appcompat.widget.c, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i2, int i3) {
        int i4;
        int mode;
        if (this.F0) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 == 1073741824) {
                    i4 = this.L0;
                }
            } else {
                size = this.L0;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
            mode = View.MeasureSpec.getMode(i3);
            int size2 = View.MeasureSpec.getSize(i3);
            if (mode == Integer.MIN_VALUE) {
                if (mode == 0) {
                    size2 = getPreferredHeight();
                }
            } else {
                size2 = Math.min(getPreferredHeight(), size2);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        i4 = this.L0;
        if (i4 <= 0) {
            i4 = getPreferredWidth();
        }
        size = Math.min(i4, size);
        mode = View.MeasureSpec.getMode(i3);
        int size22 = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size22, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.P);
        w(oVar.R);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.R = this.F0;
        return oVar;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.T0);
    }

    public final void p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void q() {
        Editable text = this.h0.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.R0 != null) {
                getContext().startActivity(j("android.intent.action.SEARCH", null, null, text.toString()));
            }
            this.h0.setImeVisibility(false);
            this.h0.dismissDropDown();
        }
    }

    public final void r() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.h0.getText());
        if (!z2 && (!this.E0 || this.P0)) {
            z = false;
        }
        this.n0.setVisibility(z ? 0 : 8);
        Drawable drawable = this.n0.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i2, Rect rect) {
        if (this.K0 || !isFocusable()) {
            return false;
        }
        if (!this.F0) {
            boolean requestFocus = this.h0.requestFocus(i2, rect);
            if (requestFocus) {
                w(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i2, rect);
    }

    public final void s() {
        int[] iArr = this.h0.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.j0.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.k0.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void setAppSearchData(Bundle bundle) {
        this.S0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m();
            return;
        }
        w(false);
        this.h0.requestFocus();
        this.h0.setImeVisibility(true);
        View.OnClickListener onClickListener = this.D0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.E0 == z) {
            return;
        }
        this.E0 = z;
        w(z);
        t();
    }

    public void setImeOptions(int i2) {
        this.h0.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.h0.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.L0 = i2;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.C0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.D0 = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.I0 = charSequence;
        t();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.J0 = z;
        ah ahVar = this.G0;
        if (ahVar instanceof ou0) {
            ((ou0) ahVar).f0 = z ? 2 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
        if (getContext().getPackageManager().resolveActivity(r2, 65536) != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        int i2;
        this.R0 = searchableInfo;
        boolean z = true;
        Intent intent = null;
        if (searchableInfo != null) {
            this.h0.setThreshold(searchableInfo.getSuggestThreshold());
            this.h0.setImeOptions(this.R0.getImeOptions());
            int inputType = this.R0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.R0.getSuggestAuthority() != null) {
                    inputType = inputType | 65536 | 524288;
                }
            }
            this.h0.setInputType(inputType);
            ah ahVar = this.G0;
            if (ahVar != null) {
                ahVar.c(null);
            }
            if (this.R0.getSuggestAuthority() != null) {
                ou0 ou0Var = new ou0(getContext(), this, this.R0, this.V0);
                this.G0 = ou0Var;
                this.h0.setAdapter(ou0Var);
                ou0 ou0Var2 = (ou0) this.G0;
                if (this.J0) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                ou0Var2.f0 = i2;
            }
            t();
        }
        SearchableInfo searchableInfo2 = this.R0;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.R0.getVoiceSearchLaunchWebSearch()) {
                intent = this.z0;
            } else if (this.R0.getVoiceSearchLaunchRecognizer()) {
                intent = this.A0;
            }
            if (intent != null) {
            }
        }
        z = false;
        this.M0 = z;
        if (z) {
            this.h0.setPrivateImeOptions("nm");
        }
        w(this.F0);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.H0 = z;
        w(this.F0);
    }

    public void setSuggestionsAdapter(ah ahVar) {
        this.G0 = ahVar;
        this.h0.setAdapter(ahVar);
    }

    public final void t() {
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.h0;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.E0 && this.w0 != null) {
            double textSize = searchAutoComplete.getTextSize();
            Double.isNaN(textSize);
            Double.isNaN(textSize);
            int i2 = (int) (textSize * 1.25d);
            this.w0.setBounds(0, 0, i2, i2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.w0), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void u() {
        boolean z;
        int i2 = 0;
        if ((this.H0 || this.M0) && !this.F0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || (this.m0.getVisibility() != 0 && this.o0.getVisibility() != 0)) {
            i2 = 8;
        }
        this.k0.setVisibility(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001e, code lost:
        if (r2.M0 == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(boolean z) {
        boolean z2;
        boolean z3 = this.H0;
        int i2 = 0;
        if (z3) {
            if ((z3 || this.M0) && !this.F0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (hasFocus()) {
                    if (!z) {
                    }
                    this.m0.setVisibility(i2);
                }
            }
        }
        i2 = 8;
        this.m0.setVisibility(i2);
    }

    public final void w(boolean z) {
        int i2;
        int i3;
        int i4;
        this.F0 = z;
        int i5 = 8;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        boolean z2 = !TextUtils.isEmpty(this.h0.getText());
        this.l0.setVisibility(i2);
        v(z2);
        View view = this.i0;
        if (z) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        view.setVisibility(i3);
        if (this.v0.getDrawable() != null && !this.E0) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        this.v0.setVisibility(i4);
        r();
        boolean z3 = !z2;
        if (this.M0 && !this.F0 && z3) {
            this.m0.setVisibility(8);
            i5 = 0;
        }
        this.o0.setVisibility(i5);
        u();
    }
}