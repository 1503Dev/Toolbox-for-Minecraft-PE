package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import defpackage.gl0;

/* renamed from: n5  reason: default package */
public final class n5 {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static n5 c;
    public gl0 a;

    /* renamed from: n5$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements gl0.e {
        public final int[] a = {zh0.abc_textfield_search_default_mtrl_alpha, zh0.abc_textfield_default_mtrl_alpha, zh0.abc_ab_share_pack_mtrl_alpha};
        public final int[] b = {zh0.abc_ic_commit_search_api_mtrl_alpha, zh0.abc_seekbar_tick_mark_material, zh0.abc_ic_menu_share_mtrl_alpha, zh0.abc_ic_menu_copy_mtrl_am_alpha, zh0.abc_ic_menu_cut_mtrl_alpha, zh0.abc_ic_menu_selectall_mtrl_alpha, zh0.abc_ic_menu_paste_mtrl_am_alpha};
        public final int[] c = {zh0.abc_textfield_activated_mtrl_alpha, zh0.abc_textfield_search_activated_mtrl_alpha, zh0.abc_cab_background_top_mtrl_alpha, zh0.abc_text_cursor_material, zh0.abc_text_select_handle_left_mtrl_dark, zh0.abc_text_select_handle_middle_mtrl_dark, zh0.abc_text_select_handle_right_mtrl_dark, zh0.abc_text_select_handle_left_mtrl_light, zh0.abc_text_select_handle_middle_mtrl_light, zh0.abc_text_select_handle_right_mtrl_light};
        public final int[] d = {zh0.abc_popup_background_mtrl_mult, zh0.abc_cab_background_internal_bg, zh0.abc_menu_hardkey_panel_mtrl_mult};
        public final int[] e = {zh0.abc_tab_indicator_material, zh0.abc_textfield_search_material};
        public final int[] f = {zh0.abc_btn_check_material, zh0.abc_btn_radio_material, zh0.abc_btn_check_material_anim, zh0.abc_btn_radio_material_anim};

        public static boolean a(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public static ColorStateList b(Context context, int i) {
            int b = zw0.b(context, ih0.colorControlHighlight);
            return new ColorStateList(new int[][]{zw0.b, zw0.d, zw0.c, zw0.f}, new int[]{zw0.a(context, ih0.colorButtonNormal), be.a(b, i), be.a(b, i), i});
        }

        public static void d(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (um.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = n5.b;
            }
            drawable.setColorFilter(n5.c(i, mode));
        }

        public final ColorStateList c(Context context, int i) {
            if (i == zh0.abc_edit_text_material) {
                return z5.a(context, nh0.abc_tint_edittext);
            }
            if (i == zh0.abc_switch_track_mtrl_alpha) {
                return z5.a(context, nh0.abc_tint_switch_track);
            }
            if (i == zh0.abc_switch_thumb_material) {
                int[][] iArr = new int[3];
                int[] iArr2 = new int[3];
                int i2 = ih0.colorSwitchThumbNormal;
                ColorStateList c = zw0.c(context, i2);
                if (c != null && c.isStateful()) {
                    int[] iArr3 = zw0.b;
                    iArr[0] = iArr3;
                    iArr2[0] = c.getColorForState(iArr3, 0);
                    iArr[1] = zw0.e;
                    iArr2[1] = zw0.b(context, ih0.colorControlActivated);
                    iArr[2] = zw0.f;
                    iArr2[2] = c.getDefaultColor();
                } else {
                    iArr[0] = zw0.b;
                    iArr2[0] = zw0.a(context, i2);
                    iArr[1] = zw0.e;
                    iArr2[1] = zw0.b(context, ih0.colorControlActivated);
                    iArr[2] = zw0.f;
                    iArr2[2] = zw0.b(context, i2);
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i == zh0.abc_btn_default_mtrl_shape) {
                return b(context, zw0.b(context, ih0.colorButtonNormal));
            } else {
                if (i == zh0.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i == zh0.abc_btn_colored_material) {
                    return b(context, zw0.b(context, ih0.colorAccent));
                }
                if (i != zh0.abc_spinner_mtrl_am_alpha && i != zh0.abc_spinner_textfield_background_material) {
                    if (a(this.b, i)) {
                        return zw0.c(context, ih0.colorControlNormal);
                    }
                    if (a(this.e, i)) {
                        return z5.a(context, nh0.abc_tint_default);
                    }
                    if (a(this.f, i)) {
                        return z5.a(context, nh0.abc_tint_btn_checkable);
                    }
                    if (i == zh0.abc_seekbar_thumb_material) {
                        return z5.a(context, nh0.abc_tint_seek_thumb);
                    }
                    return null;
                }
                return z5.a(context, nh0.abc_tint_spinner);
            }
        }
    }

    public static synchronized n5 a() {
        n5 n5Var;
        synchronized (n5.class) {
            if (c == null) {
                d();
            }
            n5Var = c;
        }
        return n5Var;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter h;
        synchronized (n5.class) {
            h = gl0.h(i, mode);
        }
        return h;
    }

    public static synchronized void d() {
        synchronized (n5.class) {
            if (c == null) {
                n5 n5Var = new n5();
                c = n5Var;
                n5Var.a = gl0.d();
                gl0 gl0Var = c.a;
                a aVar = new a();
                synchronized (gl0Var) {
                    gl0Var.g = aVar;
                }
            }
        }
    }

    public static void e(Drawable drawable, fx0 fx0Var, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = gl0.h;
        if (um.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z = fx0Var.d;
        if (!z && !fx0Var.c) {
            drawable.clearColorFilter();
        } else {
            PorterDuffColorFilter porterDuffColorFilter = null;
            if (z) {
                colorStateList = fx0Var.a;
            } else {
                colorStateList = null;
            }
            if (fx0Var.c) {
                mode = fx0Var.b;
            } else {
                mode = gl0.h;
            }
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = gl0.h(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.f(context, i);
    }
}