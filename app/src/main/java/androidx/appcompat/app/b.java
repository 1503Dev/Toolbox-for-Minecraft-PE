package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.widget.c;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;

public final class b extends m5 {
    public final AlertController R;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public final AlertController.b a;
        public final int b;

        public a(Context context) {
            int d = b.d(context, 0);
            this.a = new AlertController.b(new ContextThemeWrapper(context, b.d(context, d)));
            this.b = d;
        }

        public final b a() {
            int i;
            b bVar = new b(this.a.a, this.b);
            AlertController.b bVar2 = this.a;
            AlertController alertController = bVar.R;
            View view = bVar2.e;
            if (view != null) {
                alertController.C = view;
            } else {
                CharSequence charSequence = bVar2.d;
                if (charSequence != null) {
                    alertController.e = charSequence;
                    TextView textView = alertController.A;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar2.c;
                if (drawable != null) {
                    alertController.y = drawable;
                    alertController.x = 0;
                    ImageView imageView = alertController.z;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.z.setImageDrawable(drawable);
                    }
                }
            }
            CharSequence charSequence2 = bVar2.f;
            if (charSequence2 != null) {
                alertController.f = charSequence2;
                TextView textView2 = alertController.B;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = bVar2.g;
            if (charSequence3 != null) {
                alertController.d(-1, charSequence3, bVar2.h);
            }
            CharSequence charSequence4 = bVar2.i;
            if (charSequence4 != null) {
                alertController.d(-2, charSequence4, bVar2.j);
            }
            if (bVar2.l != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar2.b.inflate(alertController.H, (ViewGroup) null);
                if (bVar2.o) {
                    i = alertController.I;
                } else {
                    i = alertController.J;
                }
                ListAdapter listAdapter = bVar2.l;
                if (listAdapter == null) {
                    listAdapter = new AlertController.d(bVar2.a, i);
                }
                alertController.D = listAdapter;
                alertController.E = bVar2.p;
                if (bVar2.m != null) {
                    recycleListView.setOnItemClickListener(new androidx.appcompat.app.a(bVar2, alertController));
                }
                if (bVar2.o) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.g = recycleListView;
            }
            View view2 = bVar2.n;
            if (view2 != null) {
                alertController.h = view2;
                alertController.i = 0;
                alertController.j = false;
            }
            this.a.getClass();
            bVar.setCancelable(true);
            this.a.getClass();
            bVar.setCanceledOnTouchOutside(true);
            this.a.getClass();
            bVar.setOnCancelListener(null);
            this.a.getClass();
            bVar.setOnDismissListener(null);
            DialogInterface.OnKeyListener onKeyListener = this.a.k;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }
    }

    public b(Context context, int i) {
        super(context, d(context, i));
        this.R = new AlertController(getContext(), this, getWindow());
    }

    public static int d(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(ih0.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x02d6, code lost:
        if (r3 != null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02df, code lost:
        if (r3 != null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02e1, code lost:
        r3.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0341, code lost:
        if (r6 != null) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0297  */
    @Override // defpackage.m5, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        View view;
        boolean z5;
        int i;
        boolean z6;
        View findViewById;
        AlertController.RecycleListView recycleListView;
        AlertController.RecycleListView recycleListView2;
        ListAdapter listAdapter;
        View view2;
        Runnable t3Var;
        int i2;
        int i3;
        View findViewById2;
        Button button;
        super.onCreate(bundle);
        AlertController alertController = this.R;
        int i4 = alertController.G;
        alertController.b.setContentView(alertController.F);
        View findViewById3 = alertController.c.findViewById(hi0.parentPanel);
        int i5 = hi0.topPanel;
        View findViewById4 = findViewById3.findViewById(i5);
        int i6 = hi0.contentPanel;
        View findViewById5 = findViewById3.findViewById(i6);
        int i7 = hi0.buttonPanel;
        View findViewById6 = findViewById3.findViewById(i7);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(hi0.customPanel);
        View view3 = alertController.h;
        View view4 = null;
        int i8 = 0;
        if (view3 == null) {
            if (alertController.i != 0) {
                view3 = LayoutInflater.from(alertController.a).inflate(alertController.i, viewGroup, false);
            } else {
                view3 = null;
            }
        }
        if (view3 != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !AlertController.a(view3)) {
            alertController.c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) alertController.c.findViewById(hi0.custom);
            frameLayout.addView(view3, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.j) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (alertController.g != null) {
                ((c.a) viewGroup.getLayoutParams()).a = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById7 = viewGroup.findViewById(i5);
        View findViewById8 = viewGroup.findViewById(i6);
        View findViewById9 = viewGroup.findViewById(i7);
        ViewGroup c = AlertController.c(findViewById7, findViewById4);
        ViewGroup c2 = AlertController.c(findViewById8, findViewById5);
        ViewGroup c3 = AlertController.c(findViewById9, findViewById6);
        NestedScrollView nestedScrollView = (NestedScrollView) alertController.c.findViewById(hi0.scrollView);
        alertController.w = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.w.setNestedScrollingEnabled(false);
        TextView textView = (TextView) c2.findViewById(16908299);
        alertController.B = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.w.removeView(alertController.B);
                if (alertController.g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.w.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.w);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    c2.setVisibility(8);
                }
            }
        }
        Button button2 = (Button) c3.findViewById(16908313);
        alertController.k = button2;
        button2.setOnClickListener(alertController.M);
        if (TextUtils.isEmpty(alertController.l) && alertController.n == null) {
            alertController.k.setVisibility(8);
            z2 = false;
        } else {
            alertController.k.setText(alertController.l);
            Drawable drawable = alertController.n;
            if (drawable != null) {
                int i9 = alertController.d;
                drawable.setBounds(0, 0, i9, i9);
                alertController.k.setCompoundDrawables(alertController.n, null, null, null);
            }
            alertController.k.setVisibility(0);
            z2 = true;
        }
        Button button3 = (Button) c3.findViewById(16908314);
        alertController.o = button3;
        button3.setOnClickListener(alertController.M);
        if (TextUtils.isEmpty(alertController.p) && alertController.r == null) {
            alertController.o.setVisibility(8);
        } else {
            alertController.o.setText(alertController.p);
            Drawable drawable2 = alertController.r;
            if (drawable2 != null) {
                int i10 = alertController.d;
                drawable2.setBounds(0, 0, i10, i10);
                alertController.o.setCompoundDrawables(alertController.r, null, null, null);
            }
            alertController.o.setVisibility(0);
            z2 |= true;
        }
        Button button4 = (Button) c3.findViewById(16908315);
        alertController.s = button4;
        button4.setOnClickListener(alertController.M);
        if (TextUtils.isEmpty(alertController.t) && alertController.v == null) {
            alertController.s.setVisibility(8);
        } else {
            alertController.s.setText(alertController.t);
            Drawable drawable3 = alertController.n;
            if (drawable3 != null) {
                int i11 = alertController.d;
                drawable3.setBounds(0, 0, i11, i11);
                alertController.k.setCompoundDrawables(alertController.n, null, null, null);
            }
            alertController.s.setVisibility(0);
            z2 |= true;
        }
        Context context = alertController.a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(ih0.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (z2) {
                button = alertController.k;
            } else if (z2) {
                button = alertController.o;
            } else if (z2) {
                button = alertController.s;
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
            layoutParams.gravity = 1;
            layoutParams.weight = 0.5f;
            button.setLayoutParams(layoutParams);
        }
        if (z2) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            c3.setVisibility(8);
        }
        if (alertController.C != null) {
            c.addView(alertController.C, 0, new ViewGroup.LayoutParams(-1, -2));
            view = alertController.c.findViewById(hi0.title_template);
        } else {
            alertController.z = (ImageView) alertController.c.findViewById(16908294);
            if ((!TextUtils.isEmpty(alertController.e)) && alertController.K) {
                TextView textView2 = (TextView) alertController.c.findViewById(hi0.alertTitle);
                alertController.A = textView2;
                textView2.setText(alertController.e);
                int i12 = alertController.x;
                if (i12 != 0) {
                    alertController.z.setImageResource(i12);
                } else {
                    Drawable drawable4 = alertController.y;
                    if (drawable4 != null) {
                        alertController.z.setImageDrawable(drawable4);
                    } else {
                        alertController.A.setPadding(alertController.z.getPaddingLeft(), alertController.z.getPaddingTop(), alertController.z.getPaddingRight(), alertController.z.getPaddingBottom());
                        alertController.z.setVisibility(8);
                    }
                }
                if (viewGroup.getVisibility() == 8) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (c == null && c.getVisibility() != 8) {
                    i = 1;
                } else {
                    i = 0;
                }
                if (c3.getVisibility() == 8) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (!z6 && (findViewById2 = c2.findViewById(hi0.textSpacerNoButtons)) != null) {
                    findViewById2.setVisibility(0);
                }
                if (i == 0) {
                    NestedScrollView nestedScrollView2 = alertController.w;
                    if (nestedScrollView2 != null) {
                        nestedScrollView2.setClipToPadding(true);
                    }
                    if (alertController.f == null && alertController.g == null) {
                        findViewById = null;
                    } else {
                        findViewById = c.findViewById(hi0.titleDividerNoCustom);
                    }
                } else {
                    findViewById = c2.findViewById(hi0.textSpacerNoTitle);
                }
                recycleListView = alertController.g;
                if (recycleListView instanceof AlertController.RecycleListView) {
                    if (z6 && i != 0) {
                        recycleListView.getClass();
                    } else {
                        int paddingLeft = recycleListView.getPaddingLeft();
                        if (i != 0) {
                            i2 = recycleListView.getPaddingTop();
                        } else {
                            i2 = recycleListView.P;
                        }
                        int paddingRight = recycleListView.getPaddingRight();
                        if (z6) {
                            i3 = recycleListView.getPaddingBottom();
                        } else {
                            i3 = recycleListView.Q;
                        }
                        recycleListView.setPadding(paddingLeft, i2, paddingRight, i3);
                    }
                }
                if (!z5) {
                    ViewGroup viewGroup3 = alertController.g;
                    if (viewGroup3 == null) {
                        viewGroup3 = alertController.w;
                    }
                    if (viewGroup3 != null) {
                        if (z6) {
                            i8 = 2;
                        }
                        int i13 = i | i8;
                        View findViewById10 = alertController.c.findViewById(hi0.scrollIndicatorUp);
                        View findViewById11 = alertController.c.findViewById(hi0.scrollIndicatorDown);
                        int i14 = Build.VERSION.SDK_INT;
                        if (i14 >= 23) {
                            WeakHashMap<View, String> weakHashMap = a41.a;
                            if (i14 >= 23) {
                                a60.b(viewGroup3, i13);
                            }
                            if (findViewById10 != null) {
                                c2.removeView(findViewById10);
                            }
                        } else {
                            if (findViewById10 != null && (i13 & 1) == 0) {
                                c2.removeView(findViewById10);
                                findViewById10 = null;
                            }
                            if (findViewById11 != null && (i13 & 2) == 0) {
                                c2.removeView(findViewById11);
                            } else {
                                view4 = findViewById11;
                            }
                            if (findViewById10 != null || view4 != null) {
                                if (alertController.f != null) {
                                    alertController.w.setOnScrollChangeListener(new q3(findViewById10, view4));
                                    view2 = alertController.w;
                                    t3Var = new r3(alertController, findViewById10, view4);
                                } else {
                                    AlertController.RecycleListView recycleListView3 = alertController.g;
                                    if (recycleListView3 != null) {
                                        recycleListView3.setOnScrollListener(new s3(findViewById10, view4));
                                        view2 = alertController.g;
                                        t3Var = new t3(alertController, findViewById10, view4);
                                    } else {
                                        if (findViewById10 != null) {
                                            c2.removeView(findViewById10);
                                        }
                                        if (view4 != null) {
                                            findViewById11 = view4;
                                            c2.removeView(findViewById11);
                                        }
                                    }
                                }
                                view2.post(t3Var);
                            }
                        }
                    }
                }
                recycleListView2 = alertController.g;
                if (recycleListView2 == null && (listAdapter = alertController.D) != null) {
                    recycleListView2.setAdapter(listAdapter);
                    int i15 = alertController.E;
                    if (i15 > -1) {
                        recycleListView2.setItemChecked(i15, true);
                        recycleListView2.setSelection(i15);
                        return;
                    }
                    return;
                }
            }
            alertController.c.findViewById(hi0.title_template).setVisibility(8);
            alertController.z.setVisibility(8);
            view = c;
        }
        view.setVisibility(8);
        if (viewGroup.getVisibility() == 8) {
        }
        if (c == null) {
        }
        i = 0;
        if (c3.getVisibility() == 8) {
        }
        if (!z6) {
            findViewById2.setVisibility(0);
        }
        if (i == 0) {
        }
        recycleListView = alertController.g;
        if (recycleListView instanceof AlertController.RecycleListView) {
        }
        if (!z5) {
        }
        recycleListView2 = alertController.g;
        if (recycleListView2 == null) {
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        NestedScrollView nestedScrollView = this.R.w;
        if (nestedScrollView != null && nestedScrollView.f(keyEvent)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        boolean z;
        NestedScrollView nestedScrollView = this.R.w;
        if (nestedScrollView != null && nestedScrollView.f(keyEvent)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // defpackage.m5, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.R;
        alertController.e = charSequence;
        TextView textView = alertController.A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}