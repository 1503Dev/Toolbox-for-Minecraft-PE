package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;

public class CheckableImageButton extends q5 implements Checkable {
    public static final int[] U = {16842912};
    public boolean R;
    public boolean S;
    public boolean T;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends c0 {
        public static final Parcelable.Creator<a> CREATOR = new C0028a();
        public boolean R;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$a$a  reason: collision with other inner class name */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public static class C0028a implements Parcelable.ClassLoaderCreator<a> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new a(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new a[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.R = parcel.readInt() == 1;
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // defpackage.c0, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.P, i);
            parcel.writeInt(this.R ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ih0.imageButtonStyle);
        this.S = true;
        this.T = true;
        a41.n(this, new rc(this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.R;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.R) {
            return View.mergeDrawableStates(super.onCreateDrawableState(i + 1), U);
        }
        return super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.P);
        setChecked(aVar.R);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.R = this.R;
        return aVar;
    }

    public void setCheckable(boolean z) {
        if (this.S != z) {
            this.S = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.S || this.R == z) {
            return;
        }
        this.R = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.T = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.T) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.R);
    }
}