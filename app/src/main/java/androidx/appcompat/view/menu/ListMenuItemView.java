package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.l;
import java.util.WeakHashMap;

public class ListMenuItemView extends LinearLayout implements l.a, AbsListView.SelectionBoundsAdjuster {
    public h P;
    public ImageView Q;
    public RadioButton R;
    public TextView S;
    public CheckBox T;
    public TextView U;
    public ImageView V;
    public ImageView W;
    public LinearLayout a0;
    public Drawable b0;
    public int c0;
    public Context d0;
    public boolean e0;
    public Drawable f0;
    public boolean g0;
    public LayoutInflater h0;
    public boolean i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = ih0.listMenuViewStyle;
        hx0 m = hx0.m(getContext(), attributeSet, lj0.MenuView, i);
        this.b0 = m.e(lj0.MenuView_android_itemBackground);
        this.c0 = m.i(lj0.MenuView_android_itemTextAppearance, -1);
        this.e0 = m.a(lj0.MenuView_preserveIconSpacing, false);
        this.d0 = context;
        this.f0 = m.e(lj0.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, ih0.dropDownListViewStyle, 0);
        this.g0 = obtainStyledAttributes.hasValue(0);
        m.n();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.h0 == null) {
            this.h0 = LayoutInflater.from(getContext());
        }
        return this.h0;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.V;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.W;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.W.getLayoutParams();
        rect.top = this.W.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
        if (r0 == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0113  */
    @Override // androidx.appcompat.view.menu.l.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(h hVar) {
        int i;
        boolean z;
        char c;
        int i2;
        int i3;
        String sb;
        boolean z2;
        char c2;
        char c3;
        this.P = hVar;
        int i4 = 0;
        if (hVar.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        setTitle(hVar.e);
        setCheckable(hVar.isCheckable());
        if (hVar.n.o()) {
            if (hVar.n.n()) {
                c3 = hVar.j;
            } else {
                c3 = hVar.h;
            }
            if (c3 != 0) {
                z = true;
                hVar.n.n();
                if (z) {
                    h hVar2 = this.P;
                    if (hVar2.n.o()) {
                        if (hVar2.n.n()) {
                            c2 = hVar2.j;
                        } else {
                            c2 = hVar2.h;
                        }
                        if (c2 != 0) {
                            z2 = true;
                        }
                    }
                    z2 = false;
                }
                i4 = 8;
                if (i4 == 0) {
                    TextView textView = this.U;
                    h hVar3 = this.P;
                    if (hVar3.n.n()) {
                        c = hVar3.j;
                    } else {
                        c = hVar3.h;
                    }
                    if (c == 0) {
                        sb = "";
                    } else {
                        Resources resources = hVar3.n.a.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(hVar3.n.a).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(wi0.abc_prepend_shortcut_label));
                        }
                        if (hVar3.n.n()) {
                            i2 = hVar3.k;
                        } else {
                            i2 = hVar3.i;
                        }
                        h.c(sb2, i2, 65536, resources.getString(wi0.abc_menu_meta_shortcut_label));
                        h.c(sb2, i2, 4096, resources.getString(wi0.abc_menu_ctrl_shortcut_label));
                        h.c(sb2, i2, 2, resources.getString(wi0.abc_menu_alt_shortcut_label));
                        h.c(sb2, i2, 1, resources.getString(wi0.abc_menu_shift_shortcut_label));
                        h.c(sb2, i2, 4, resources.getString(wi0.abc_menu_sym_shortcut_label));
                        h.c(sb2, i2, 8, resources.getString(wi0.abc_menu_function_shortcut_label));
                        if (c != '\b') {
                            if (c != '\n') {
                                if (c != ' ') {
                                    sb2.append(c);
                                    sb = sb2.toString();
                                } else {
                                    i3 = wi0.abc_menu_space_shortcut_label;
                                }
                            } else {
                                i3 = wi0.abc_menu_enter_shortcut_label;
                            }
                        } else {
                            i3 = wi0.abc_menu_delete_shortcut_label;
                        }
                        sb2.append(resources.getString(i3));
                        sb = sb2.toString();
                    }
                    textView.setText(sb);
                }
                if (this.U.getVisibility() != i4) {
                    this.U.setVisibility(i4);
                }
                setIcon(hVar.getIcon());
                setEnabled(hVar.isEnabled());
                setSubMenuArrowVisible(hVar.hasSubMenu());
                setContentDescription(hVar.q);
            }
        }
        z = false;
        hVar.n.n();
        if (z) {
        }
        i4 = 8;
        if (i4 == 0) {
        }
        if (this.U.getVisibility() != i4) {
        }
        setIcon(hVar.getIcon());
        setEnabled(hVar.isEnabled());
        setSubMenuArrowVisible(hVar.hasSubMenu());
        setContentDescription(hVar.q);
    }

    @Override // androidx.appcompat.view.menu.l.a
    public h getItemData() {
        return this.P;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.b0;
        WeakHashMap<View, String> weakHashMap = a41.a;
        setBackground(drawable);
        TextView textView = (TextView) findViewById(hi0.title);
        this.S = textView;
        int i = this.c0;
        if (i != -1) {
            textView.setTextAppearance(this.d0, i);
        }
        this.U = (TextView) findViewById(hi0.shortcut);
        ImageView imageView = (ImageView) findViewById(hi0.submenuarrow);
        this.V = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f0);
        }
        this.W = (ImageView) findViewById(hi0.group_divider);
        this.a0 = (LinearLayout) findViewById(hi0.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.Q != null && this.e0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.Q.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        boolean z2;
        CompoundButton compoundButton;
        View view;
        if (!z && this.R == null && this.T == null) {
            return;
        }
        if ((this.P.x & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (this.R == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(ni0.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.R = radioButton;
                LinearLayout linearLayout = this.a0;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.R;
            view = this.T;
        } else {
            if (this.T == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(ni0.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.T = checkBox;
                LinearLayout linearLayout2 = this.a0;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.T;
            view = this.R;
        }
        if (z) {
            compoundButton.setChecked(this.P.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view != null && view.getVisibility() != 8) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        CheckBox checkBox2 = this.T;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.R;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        boolean z2;
        CompoundButton compoundButton;
        if ((this.P.x & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (this.R == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(ni0.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.R = radioButton;
                LinearLayout linearLayout = this.a0;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.R;
        } else {
            if (this.T == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(ni0.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.T = checkBox;
                LinearLayout linearLayout2 = this.a0;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.T;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.i0 = z;
        this.e0 = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.W;
        if (imageView != null) {
            imageView.setVisibility((this.g0 || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.P.n.getClass();
        boolean z = this.i0;
        if (!z && !this.e0) {
            return;
        }
        ImageView imageView = this.Q;
        if (imageView == null && drawable == null && !this.e0) {
            return;
        }
        if (imageView == null) {
            ImageView imageView2 = (ImageView) getInflater().inflate(ni0.abc_list_menu_item_icon, (ViewGroup) this, false);
            this.Q = imageView2;
            LinearLayout linearLayout = this.a0;
            if (linearLayout != null) {
                linearLayout.addView(imageView2, 0);
            } else {
                addView(imageView2, 0);
            }
        }
        if (drawable == null && !this.e0) {
            this.Q.setVisibility(8);
            return;
        }
        ImageView imageView3 = this.Q;
        if (!z) {
            drawable = null;
        }
        imageView3.setImageDrawable(drawable);
        if (this.Q.getVisibility() != 0) {
            this.Q.setVisibility(0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i;
        TextView textView;
        if (charSequence != null) {
            this.S.setText(charSequence);
            if (this.S.getVisibility() == 0) {
                return;
            }
            textView = this.S;
            i = 0;
        } else {
            i = 8;
            if (this.S.getVisibility() == 8) {
                return;
            }
            textView = this.S;
        }
        textView.setVisibility(i);
    }
}