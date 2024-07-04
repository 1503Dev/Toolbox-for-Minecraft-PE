package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import java.util.WeakHashMap;

/* renamed from: d6  reason: default package */
public final class d6 extends Spinner implements ix0 {
    public static final int[] a0 = {16843505};
    public final w4 P;
    public final Context Q;
    public c6 R;
    public SpinnerAdapter S;
    public final boolean T;
    public f U;
    public int V;
    public final Rect W;

    /* renamed from: d6$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (!d6.this.getInternalPopup().c()) {
                d6 d6Var = d6.this;
                d6Var.U.m(d6Var.getTextDirection(), d6Var.getTextAlignment());
            }
            ViewTreeObserver viewTreeObserver = d6.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* renamed from: d6$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements f, DialogInterface.OnClickListener {
        public androidx.appcompat.app.b P;
        public ListAdapter Q;
        public CharSequence R;

        public b() {
        }

        @Override // defpackage.d6.f
        public final boolean c() {
            androidx.appcompat.app.b bVar = this.P;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        @Override // defpackage.d6.f
        public final int d() {
            return 0;
        }

        @Override // defpackage.d6.f
        public final void dismiss() {
            androidx.appcompat.app.b bVar = this.P;
            if (bVar != null) {
                bVar.dismiss();
                this.P = null;
            }
        }

        @Override // defpackage.d6.f
        public final Drawable f() {
            return null;
        }

        @Override // defpackage.d6.f
        public final void h(CharSequence charSequence) {
            this.R = charSequence;
        }

        @Override // defpackage.d6.f
        public final void i(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // defpackage.d6.f
        public final void j(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // defpackage.d6.f
        public final void k(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // defpackage.d6.f
        public final void l(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // defpackage.d6.f
        public final void m(int i, int i2) {
            if (this.Q == null) {
                return;
            }
            b.a aVar = new b.a(d6.this.getPopupContext());
            CharSequence charSequence = this.R;
            if (charSequence != null) {
                aVar.a.d = charSequence;
            }
            ListAdapter listAdapter = this.Q;
            int selectedItemPosition = d6.this.getSelectedItemPosition();
            AlertController.b bVar = aVar.a;
            bVar.l = listAdapter;
            bVar.m = this;
            bVar.p = selectedItemPosition;
            bVar.o = true;
            androidx.appcompat.app.b a = aVar.a();
            this.P = a;
            AlertController.RecycleListView recycleListView = a.R.g;
            recycleListView.setTextDirection(i);
            recycleListView.setTextAlignment(i2);
            this.P.show();
        }

        @Override // defpackage.d6.f
        public final int n() {
            return 0;
        }

        @Override // defpackage.d6.f
        public final CharSequence o() {
            return this.R;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            d6.this.setSelection(i);
            if (d6.this.getOnItemClickListener() != null) {
                d6.this.performItemClick(null, i, this.Q.getItemId(i));
            }
            dismiss();
        }

        @Override // defpackage.d6.f
        public final void p(ListAdapter listAdapter) {
            this.Q = listAdapter;
        }
    }

    /* renamed from: d6$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class c implements ListAdapter, SpinnerAdapter {
        public SpinnerAdapter P;
        public ListAdapter Q;

        public c(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.P = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.Q = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                    }
                } else if (spinnerAdapter instanceof ax0) {
                    ax0 ax0Var = (ax0) spinnerAdapter;
                    if (ax0Var.getDropDownViewTheme() == null) {
                        ax0Var.a();
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.Q;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.P;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.P;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.P;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.P;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public final int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.P;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public final boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public final boolean isEnabled(int i) {
            ListAdapter listAdapter = this.Q;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.P;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.P;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: d6$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class d extends x10 implements f {
        public CharSequence r0;
        public ListAdapter s0;
        public final Rect t0;
        public int u0;

        /* renamed from: d6$d$a */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class a implements AdapterView.OnItemClickListener {
            public a() {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                d6.this.setSelection(i);
                if (d6.this.getOnItemClickListener() != null) {
                    d dVar = d.this;
                    d6.this.performItemClick(view, i, dVar.s0.getItemId(i));
                }
                d.this.dismiss();
            }
        }

        /* renamed from: d6$d$b */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                boolean z;
                d dVar = d.this;
                d6 d6Var = d6.this;
                dVar.getClass();
                WeakHashMap<View, String> weakHashMap = a41.a;
                if (d6Var.isAttachedToWindow() && d6Var.getGlobalVisibleRect(dVar.t0)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    d.this.dismiss();
                    return;
                }
                d.this.t();
                d.this.a();
            }
        }

        /* renamed from: d6$d$c */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class c implements PopupWindow.OnDismissListener {
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener P;

            public c(b bVar) {
                this.P = bVar;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = d6.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.P);
                }
            }
        }

        public d(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i, 0);
            this.t0 = new Rect();
            this.d0 = d6.this;
            s(true);
            this.e0 = new a();
        }

        @Override // defpackage.d6.f
        public final void h(CharSequence charSequence) {
            this.r0 = charSequence;
        }

        @Override // defpackage.d6.f
        public final void k(int i) {
            this.u0 = i;
        }

        @Override // defpackage.d6.f
        public final void m(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean c2 = c();
            t();
            this.n0.setInputMethodMode(2);
            a();
            wm wmVar = this.R;
            wmVar.setChoiceMode(1);
            wmVar.setTextDirection(i);
            wmVar.setTextAlignment(i2);
            int selectedItemPosition = d6.this.getSelectedItemPosition();
            wm wmVar2 = this.R;
            if (c() && wmVar2 != null) {
                wmVar2.setListSelectionHidden(false);
                wmVar2.setSelection(selectedItemPosition);
                if (wmVar2.getChoiceMode() != 0) {
                    wmVar2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!c2 && (viewTreeObserver = d6.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                this.n0.setOnDismissListener(new c(bVar));
            }
        }

        @Override // defpackage.d6.f
        public final CharSequence o() {
            return this.r0;
        }

        @Override // defpackage.x10, defpackage.d6.f
        public final void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.s0 = listAdapter;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void t() {
            int i;
            int i2;
            int i3;
            Drawable f = f();
            int i4 = 0;
            if (f != null) {
                f.getPadding(d6.this.W);
                if (c51.a(d6.this)) {
                    i3 = d6.this.W.right;
                } else {
                    i3 = -d6.this.W.left;
                }
                i4 = i3;
            } else {
                Rect rect = d6.this.W;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = d6.this.getPaddingLeft();
            int paddingRight = d6.this.getPaddingRight();
            int width = d6.this.getWidth();
            d6 d6Var = d6.this;
            int i5 = d6Var.V;
            if (i5 == -2) {
                int a2 = d6Var.a((SpinnerAdapter) this.s0, f());
                int i6 = d6.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = d6.this.W;
                int i7 = (i6 - rect2.left) - rect2.right;
                if (a2 > i7) {
                    a2 = i7;
                }
                i = Math.max(a2, (width - paddingLeft) - paddingRight);
            } else if (i5 == -1) {
                i = (width - paddingLeft) - paddingRight;
            } else {
                r(i5);
                if (!c51.a(d6.this)) {
                    i2 = (((width - paddingRight) - this.T) - this.u0) + i4;
                } else {
                    i2 = paddingLeft + this.u0 + i4;
                }
                this.U = i2;
            }
            r(i);
            if (!c51.a(d6.this)) {
            }
            this.U = i2;
        }
    }

    /* renamed from: d6$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();
        public boolean P;

        /* renamed from: d6$e$a */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public static class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i) {
                return new e[i];
            }
        }

        public e(Parcel parcel) {
            super(parcel);
            this.P = parcel.readByte() != 0;
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.P ? (byte) 1 : (byte) 0);
        }
    }

    /* renamed from: d6$f */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface f {
        boolean c();

        int d();

        void dismiss();

        Drawable f();

        void h(CharSequence charSequence);

        void i(Drawable drawable);

        void j(int i);

        void k(int i);

        void l(int i);

        void m(int i, int i2);

        int n();

        CharSequence o();

        void p(ListAdapter listAdapter);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (r4 == null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        this.W = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lj0.Spinner, i, 0);
        this.P = new w4(this);
        int resourceId = obtainStyledAttributes.getResourceId(lj0.Spinner_popupTheme, 0);
        if (resourceId != 0) {
            this.Q = new kg(context, resourceId);
        } else {
            this.Q = context;
        }
        TypedArray typedArray2 = null;
        int i2 = -1;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, a0, i, 0);
            try {
                try {
                    if (typedArray.hasValue(0)) {
                        i2 = typedArray.getInt(0, 0);
                    }
                } catch (Exception e2) {
                    e = e2;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                }
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArray;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            typedArray = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
            }
            throw th;
        }
        typedArray.recycle();
        if (i2 != 0) {
            if (i2 == 1) {
                d dVar = new d(this.Q, attributeSet, i);
                hx0 m = hx0.m(this.Q, attributeSet, lj0.Spinner, i);
                this.V = m.b.getLayoutDimension(lj0.Spinner_android_dropDownWidth, -2);
                dVar.i(m.e(lj0.Spinner_android_popupBackground));
                dVar.r0 = obtainStyledAttributes.getString(lj0.Spinner_android_prompt);
                m.n();
                this.U = dVar;
                this.R = new c6(this, this, dVar);
            }
        } else {
            b bVar = new b();
            this.U = bVar;
            bVar.R = obtainStyledAttributes.getString(lj0.Spinner_android_prompt);
        }
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(lj0.Spinner_android_entries);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367048, textArray);
            arrayAdapter.setDropDownViewResource(ni0.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        obtainStyledAttributes.recycle();
        this.T = true;
        SpinnerAdapter spinnerAdapter = this.S;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.S = null;
        }
        this.P.d(attributeSet, i);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.W);
            Rect rect = this.W;
            return i2 + rect.left + rect.right;
        }
        return i2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        w4 w4Var = this.P;
        if (w4Var != null) {
            w4Var.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        f fVar = this.U;
        return fVar != null ? fVar.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        f fVar = this.U;
        return fVar != null ? fVar.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.U != null ? this.V : super.getDropDownWidth();
    }

    public final f getInternalPopup() {
        return this.U;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        f fVar = this.U;
        return fVar != null ? fVar.f() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.Q;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        f fVar = this.U;
        return fVar != null ? fVar.o() : super.getPrompt();
    }

    @Override // defpackage.ix0
    public ColorStateList getSupportBackgroundTintList() {
        w4 w4Var = this.P;
        if (w4Var != null) {
            return w4Var.b();
        }
        return null;
    }

    @Override // defpackage.ix0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        w4 w4Var = this.P;
        if (w4Var != null) {
            return w4Var.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.U;
        if (fVar == null || !fVar.c()) {
            return;
        }
        this.U.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.U == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        if (!eVar.P || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new a());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        f fVar = this.U;
        eVar.P = fVar != null && fVar.c();
        return eVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c6 c6Var = this.R;
        if (c6Var == null || !c6Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        f fVar = this.U;
        if (fVar != null) {
            if (!fVar.c()) {
                this.U.m(getTextDirection(), getTextAlignment());
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.T) {
            this.S = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.U != null) {
            Context context = this.Q;
            if (context == null) {
                context = getContext();
            }
            this.U.p(new c(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        w4 w4Var = this.P;
        if (w4Var != null) {
            w4Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        w4 w4Var = this.P;
        if (w4Var != null) {
            w4Var.f(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        f fVar = this.U;
        if (fVar == null) {
            super.setDropDownHorizontalOffset(i);
            return;
        }
        fVar.k(i);
        this.U.l(i);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        f fVar = this.U;
        if (fVar != null) {
            fVar.j(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.U != null) {
            this.V = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        f fVar = this.U;
        if (fVar != null) {
            fVar.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(z5.b(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        f fVar = this.U;
        if (fVar != null) {
            fVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // defpackage.ix0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        w4 w4Var = this.P;
        if (w4Var != null) {
            w4Var.h(colorStateList);
        }
    }

    @Override // defpackage.ix0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        w4 w4Var = this.P;
        if (w4Var != null) {
            w4Var.i(mode);
        }
    }
}