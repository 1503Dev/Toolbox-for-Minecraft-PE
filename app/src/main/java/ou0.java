package defpackage;

import android.annotation.SuppressLint;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
/* renamed from: ou0  reason: default package */
public final class ou0 extends dl0 implements View.OnClickListener {
    public static final /* synthetic */ int n0 = 0;
    public final SearchView a0;
    public final SearchableInfo b0;
    public final Context c0;
    public final WeakHashMap<String, Drawable.ConstantState> d0;
    public final int e0;
    public int f0;
    public ColorStateList g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;

    /* renamed from: ou0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a {
        public final TextView a;
        public final TextView b;
        public final ImageView c;
        public final ImageView d;
        public final ImageView e;

        public a(View view) {
            this.a = (TextView) view.findViewById(16908308);
            this.b = (TextView) view.findViewById(16908309);
            this.c = (ImageView) view.findViewById(16908295);
            this.d = (ImageView) view.findViewById(16908296);
            this.e = (ImageView) view.findViewById(hi0.edit_query);
        }
    }

    public ou0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.f0 = 1;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.l0 = -1;
        this.m0 = -1;
        SearchManager searchManager = (SearchManager) this.S.getSystemService("search");
        this.a0 = searchView;
        this.b0 = searchableInfo;
        this.e0 = searchView.getSuggestionCommitIconResId();
        this.c0 = context;
        this.d0 = weakHashMap;
    }

    public static String r(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014a  */
    @Override // defpackage.ah
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, Cursor cursor) {
        int i;
        Drawable p;
        String obj;
        Drawable drawable;
        Drawable.ConstantState constantState;
        ActivityInfo activityInfo;
        int iconResource;
        String str;
        int i2;
        int i3;
        a aVar = (a) view.getTag();
        int i4 = this.m0;
        if (i4 != -1) {
            i = cursor.getInt(i4);
        } else {
            i = 0;
        }
        if (aVar.a != null) {
            String r = r(cursor, this.h0);
            TextView textView = aVar.a;
            textView.setText(r);
            if (TextUtils.isEmpty(r)) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            textView.setVisibility(i3);
        }
        if (aVar.b != null) {
            String r2 = r(cursor, this.j0);
            if (r2 != null) {
                if (this.g0 == null) {
                    TypedValue typedValue = new TypedValue();
                    this.S.getTheme().resolveAttribute(ih0.textColorSearchUrl, typedValue, true);
                    this.g0 = this.S.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(r2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.g0, null), 0, r2.length(), 33);
                str = spannableString;
            } else {
                str = r(cursor, this.i0);
            }
            if (TextUtils.isEmpty(str)) {
                TextView textView2 = aVar.a;
                if (textView2 != null) {
                    textView2.setSingleLine(false);
                    aVar.a.setMaxLines(2);
                }
            } else {
                TextView textView3 = aVar.a;
                if (textView3 != null) {
                    textView3.setSingleLine(true);
                    aVar.a.setMaxLines(1);
                }
            }
            TextView textView4 = aVar.b;
            textView4.setText(str);
            if (TextUtils.isEmpty(str)) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            textView4.setVisibility(i2);
        }
        ImageView imageView = aVar.c;
        Drawable drawable2 = null;
        if (imageView != null) {
            int i5 = this.k0;
            if (i5 == -1) {
                p = null;
            } else {
                p = p(cursor.getString(i5));
                if (p == null) {
                    ComponentName searchActivity = this.b0.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    if (this.d0.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState2 = this.d0.get(flattenToShortString);
                        if (constantState2 == null) {
                            p = null;
                        } else {
                            p = constantState2.newDrawable(this.c0.getResources());
                        }
                    } else {
                        PackageManager packageManager = this.S.getPackageManager();
                        try {
                            activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            iconResource = activityInfo.getIconResource();
                        } catch (PackageManager.NameNotFoundException e) {
                            obj = e.toString();
                        }
                        if (iconResource != 0) {
                            drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                            if (drawable == null) {
                                obj = "Invalid icon resource " + iconResource + " for " + searchActivity.flattenToShortString();
                                Log.w("SuggestionsAdapter", obj);
                            }
                            if (drawable != null) {
                                constantState = null;
                            } else {
                                constantState = drawable.getConstantState();
                            }
                            this.d0.put(flattenToShortString, constantState);
                            p = drawable;
                        }
                        drawable = null;
                        if (drawable != null) {
                        }
                        this.d0.put(flattenToShortString, constantState);
                        p = drawable;
                    }
                    if (p == null) {
                        p = this.S.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView.setImageDrawable(p);
            if (p == null) {
                imageView.setVisibility(4);
            } else {
                imageView.setVisibility(0);
                p.setVisible(false, false);
                p.setVisible(true, false);
            }
        }
        ImageView imageView2 = aVar.d;
        if (imageView2 != null) {
            int i6 = this.l0;
            if (i6 != -1) {
                drawable2 = p(cursor.getString(i6));
            }
            imageView2.setImageDrawable(drawable2);
            if (drawable2 == null) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
                drawable2.setVisible(false, false);
                drawable2.setVisible(true, false);
            }
        }
        int i7 = this.f0;
        if (i7 != 2 && (i7 != 1 || (i & 1) == 0)) {
            aVar.e.setVisibility(8);
            return;
        }
        aVar.e.setVisibility(0);
        aVar.e.setTag(aVar.a.getText());
        aVar.e.setOnClickListener(this);
    }

    @Override // defpackage.ah
    public final void c(Cursor cursor) {
        try {
            super.c(cursor);
            if (cursor != null) {
                this.h0 = cursor.getColumnIndex("suggest_text_1");
                this.i0 = cursor.getColumnIndex("suggest_text_2");
                this.j0 = cursor.getColumnIndex("suggest_text_2_url");
                this.k0 = cursor.getColumnIndex("suggest_icon_1");
                this.l0 = cursor.getColumnIndex("suggest_icon_2");
                this.m0 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // defpackage.ah
    public final String d(Cursor cursor) {
        String r;
        String r2;
        if (cursor == null) {
            return null;
        }
        String r3 = r(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (r3 != null) {
            return r3;
        }
        if (this.b0.shouldRewriteQueryFromData() && (r2 = r(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return r2;
        }
        if (!this.b0.shouldRewriteQueryFromText() || (r = r(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return r;
    }

    @Override // defpackage.ah, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View inflate = this.Z.inflate(this.Y, viewGroup, false);
            if (inflate != null) {
                ((a) inflate.getTag()).a.setText(e.toString());
            }
            return inflate;
        }
    }

    @Override // defpackage.ah, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View h = h(viewGroup);
            ((a) h.getTag()).a.setText(e.toString());
            return h;
        }
    }

    @Override // defpackage.ah
    public final View h(ViewGroup viewGroup) {
        View inflate = this.Z.inflate(this.X, viewGroup, false);
        inflate.setTag(new a(inflate));
        ((ImageView) inflate.findViewById(hi0.edit_query)).setImageResource(this.e0);
        return inflate;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    public final Drawable i(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.S.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else if (size != 2) {
                throw new FileNotFoundException("More than two path segments: " + uri);
            } else {
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        Bundle bundle;
        super.notifyDataSetChanged();
        Cursor cursor = this.R;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        Bundle bundle;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.R;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.a0.p((CharSequence) tag);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable p(String str) {
        Drawable newDrawable;
        Drawable newDrawable2;
        Drawable drawable = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                String str2 = "android.resource://" + this.c0.getPackageName() + "/" + parseInt;
                Drawable.ConstantState constantState = this.d0.get(str2);
                if (constantState == null) {
                    newDrawable2 = null;
                } else {
                    newDrawable2 = constantState.newDrawable();
                }
                if (newDrawable2 != null) {
                    return newDrawable2;
                }
                Drawable b = cg.b(this.c0, parseInt);
                if (b != null) {
                    this.d0.put(str2, b.getConstantState());
                }
                return b;
            } catch (Resources.NotFoundException unused) {
                Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = this.d0.get(str);
                if (constantState2 == null) {
                    newDrawable = null;
                } else {
                    newDrawable = constantState2.newDrawable();
                }
                if (newDrawable != null) {
                    return newDrawable;
                }
                Uri parse = Uri.parse(str);
                try {
                } catch (FileNotFoundException e) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + parse + ", " + e.getMessage());
                    if (drawable != null) {
                    }
                    return drawable;
                }
                if ("android.resource".equals(parse.getScheme())) {
                    try {
                        drawable = i(parse);
                        if (drawable != null) {
                            this.d0.put(str, drawable.getConstantState());
                        }
                    } catch (Resources.NotFoundException unused3) {
                        throw new FileNotFoundException("Resource does not exist: " + parse);
                    }
                } else {
                    InputStream openInputStream = this.c0.getContentResolver().openInputStream(parse);
                    if (openInputStream != null) {
                        Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                        try {
                            openInputStream.close();
                        } catch (IOException e2) {
                            Log.e("SuggestionsAdapter", "Error closing icon stream for " + parse, e2);
                        }
                        drawable = createFromStream;
                        if (drawable != null) {
                        }
                    } else {
                        throw new FileNotFoundException("Failed to open " + parse);
                    }
                }
                Log.w("SuggestionsAdapter", "Icon not found: " + parse + ", " + e.getMessage());
                if (drawable != null) {
                }
            }
        }
        return drawable;
    }

    public final Cursor q(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.S.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }
}