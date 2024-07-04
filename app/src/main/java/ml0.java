package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;

/* renamed from: ml0  reason: default package */
public class ml0 extends Resources {
    public final Resources a;

    public ml0(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.a = resources;
    }

    @Override // android.content.res.Resources
    public final XmlResourceParser getAnimation(int i) {
        return this.a.getAnimation(i);
    }

    @Override // android.content.res.Resources
    public final boolean getBoolean(int i) {
        return this.a.getBoolean(i);
    }

    @Override // android.content.res.Resources
    public final int getColor(int i) {
        return this.a.getColor(i);
    }

    @Override // android.content.res.Resources
    public final ColorStateList getColorStateList(int i) {
        return this.a.getColorStateList(i);
    }

    @Override // android.content.res.Resources
    public final Configuration getConfiguration() {
        return this.a.getConfiguration();
    }

    @Override // android.content.res.Resources
    public final float getDimension(int i) {
        return this.a.getDimension(i);
    }

    @Override // android.content.res.Resources
    public final int getDimensionPixelOffset(int i) {
        return this.a.getDimensionPixelOffset(i);
    }

    @Override // android.content.res.Resources
    public final int getDimensionPixelSize(int i) {
        return this.a.getDimensionPixelSize(i);
    }

    @Override // android.content.res.Resources
    public final DisplayMetrics getDisplayMetrics() {
        return this.a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        return this.a.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawable(int i, Resources.Theme theme) {
        Drawable drawable;
        drawable = this.a.getDrawable(i, theme);
        return drawable;
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawableForDensity(int i, int i2) {
        return this.a.getDrawableForDensity(i, i2);
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        Drawable drawableForDensity;
        drawableForDensity = this.a.getDrawableForDensity(i, i2, theme);
        return drawableForDensity;
    }

    @Override // android.content.res.Resources
    public final float getFraction(int i, int i2, int i3) {
        return this.a.getFraction(i, i2, i3);
    }

    @Override // android.content.res.Resources
    public final int getIdentifier(String str, String str2, String str3) {
        return this.a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public final int[] getIntArray(int i) {
        return this.a.getIntArray(i);
    }

    @Override // android.content.res.Resources
    public final int getInteger(int i) {
        return this.a.getInteger(i);
    }

    @Override // android.content.res.Resources
    public final XmlResourceParser getLayout(int i) {
        return this.a.getLayout(i);
    }

    @Override // android.content.res.Resources
    public final Movie getMovie(int i) {
        return this.a.getMovie(i);
    }

    @Override // android.content.res.Resources
    public final String getQuantityString(int i, int i2) {
        return this.a.getQuantityString(i, i2);
    }

    @Override // android.content.res.Resources
    public final String getQuantityString(int i, int i2, Object... objArr) {
        return this.a.getQuantityString(i, i2, objArr);
    }

    @Override // android.content.res.Resources
    public final CharSequence getQuantityText(int i, int i2) {
        return this.a.getQuantityText(i, i2);
    }

    @Override // android.content.res.Resources
    public final String getResourceEntryName(int i) {
        return this.a.getResourceEntryName(i);
    }

    @Override // android.content.res.Resources
    public final String getResourceName(int i) {
        return this.a.getResourceName(i);
    }

    @Override // android.content.res.Resources
    public final String getResourcePackageName(int i) {
        return this.a.getResourcePackageName(i);
    }

    @Override // android.content.res.Resources
    public final String getResourceTypeName(int i) {
        return this.a.getResourceTypeName(i);
    }

    @Override // android.content.res.Resources
    public final String getString(int i) {
        return this.a.getString(i);
    }

    @Override // android.content.res.Resources
    public final String getString(int i, Object... objArr) {
        return this.a.getString(i, objArr);
    }

    @Override // android.content.res.Resources
    public final String[] getStringArray(int i) {
        return this.a.getStringArray(i);
    }

    @Override // android.content.res.Resources
    public final CharSequence getText(int i) {
        return this.a.getText(i);
    }

    @Override // android.content.res.Resources
    public final CharSequence getText(int i, CharSequence charSequence) {
        return this.a.getText(i, charSequence);
    }

    @Override // android.content.res.Resources
    public final CharSequence[] getTextArray(int i) {
        return this.a.getTextArray(i);
    }

    @Override // android.content.res.Resources
    public final void getValue(int i, TypedValue typedValue, boolean z) {
        this.a.getValue(i, typedValue, z);
    }

    @Override // android.content.res.Resources
    public final void getValue(String str, TypedValue typedValue, boolean z) {
        this.a.getValue(str, typedValue, z);
    }

    @Override // android.content.res.Resources
    public final void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) {
        this.a.getValueForDensity(i, i2, typedValue, z);
    }

    @Override // android.content.res.Resources
    public final XmlResourceParser getXml(int i) {
        return this.a.getXml(i);
    }

    @Override // android.content.res.Resources
    public final TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.a.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public final TypedArray obtainTypedArray(int i) {
        return this.a.obtainTypedArray(i);
    }

    @Override // android.content.res.Resources
    public final InputStream openRawResource(int i) {
        return this.a.openRawResource(i);
    }

    @Override // android.content.res.Resources
    public final InputStream openRawResource(int i, TypedValue typedValue) {
        return this.a.openRawResource(i, typedValue);
    }

    @Override // android.content.res.Resources
    public final AssetFileDescriptor openRawResourceFd(int i) {
        return this.a.openRawResourceFd(i);
    }

    @Override // android.content.res.Resources
    public final void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.a.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public final void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public final void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }
}