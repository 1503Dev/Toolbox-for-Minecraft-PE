package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import defpackage.u01;

/* renamed from: q51  reason: default package */
public abstract class q51 extends u01 {
    public static final String[] n0 = {"android:visibility:visibility", "android:visibility:parent"};
    public int m0 = 3;

    /* renamed from: q51$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends AnimatorListenerAdapter implements u01.d {
        public final View a;
        public final int b;
        public final ViewGroup c;
        public boolean e;
        public boolean f = false;
        public final boolean d = true;

        public a(int i, View view) {
            this.a = view;
            this.b = i;
            this.c = (ViewGroup) view.getParent();
            f(true);
        }

        @Override // defpackage.u01.d
        public final void a() {
        }

        @Override // defpackage.u01.d
        public final void b() {
            f(false);
        }

        @Override // defpackage.u01.d
        public final void c() {
            f(true);
        }

        @Override // defpackage.u01.d
        public final void d(u01 u01Var) {
            if (!this.f) {
                a51.a.m(this.a, this.b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
            u01Var.x(this);
        }

        @Override // defpackage.u01.d
        public final void e() {
        }

        public final void f(boolean z) {
            ViewGroup viewGroup;
            if (!this.d || this.e == z || (viewGroup = this.c) == null) {
                return;
            }
            this.e = z;
            h41.a(viewGroup, z);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.f) {
                a51.a.m(this.a, this.b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            if (this.f) {
                return;
            }
            a51.a.m(this.a, this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            if (this.f) {
                return;
            }
            a51.a.m(this.a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: q51$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b {
        public boolean a;
        public boolean b;
        public int c;
        public int d;
        public ViewGroup e;
        public ViewGroup f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
        if (r8 == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
        if (r0.e == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008f, code lost:
        if (r0.c == 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b L(c11 c11Var, c11 c11Var2) {
        b bVar = new b();
        bVar.a = false;
        bVar.b = false;
        if (c11Var == null || !c11Var.a.containsKey("android:visibility:visibility")) {
            bVar.c = -1;
            bVar.e = null;
        } else {
            bVar.c = ((Integer) c11Var.a.get("android:visibility:visibility")).intValue();
            bVar.e = (ViewGroup) c11Var.a.get("android:visibility:parent");
        }
        if (c11Var2 == null || !c11Var2.a.containsKey("android:visibility:visibility")) {
            bVar.d = -1;
            bVar.f = null;
        } else {
            bVar.d = ((Integer) c11Var2.a.get("android:visibility:visibility")).intValue();
            bVar.f = (ViewGroup) c11Var2.a.get("android:visibility:parent");
        }
        if (c11Var == null || c11Var2 == null) {
            if (c11Var != null || bVar.d != 0) {
                if (c11Var2 == null) {
                }
                return bVar;
            }
            bVar.b = true;
        } else {
            int i = bVar.c;
            int i2 = bVar.d;
            if (i == i2 && bVar.e == bVar.f) {
                return bVar;
            }
            if (i != i2) {
                if (i != 0) {
                }
                bVar.b = false;
            } else {
                if (bVar.f != null) {
                }
                bVar.b = false;
            }
        }
        bVar.a = true;
        return bVar;
    }

    public final void K(c11 c11Var) {
        c11Var.a.put("android:visibility:visibility", Integer.valueOf(c11Var.b.getVisibility()));
        c11Var.a.put("android:visibility:parent", c11Var.b.getParent());
        int[] iArr = new int[2];
        c11Var.b.getLocationOnScreen(iArr);
        c11Var.a.put("android:visibility:screenLocation", iArr);
    }

    @Override // defpackage.u01
    public final void d(c11 c11Var) {
        K(c11Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        if (L(o(r1, false), r(r1, false)).a != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01fe  */
    @Override // defpackage.u01
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator l(ViewGroup viewGroup, c11 c11Var, c11 c11Var2) {
        View view;
        boolean z;
        View view2;
        int i;
        Object obj;
        int i2;
        View view3;
        boolean z2;
        boolean z3;
        ViewGroup viewGroup2;
        int i3;
        Bitmap bitmap;
        q51 q51Var;
        float f;
        float f2;
        ObjectAnimator M;
        p51 p51Var;
        float f3;
        float f4;
        float f5;
        Float f6;
        b L = L(c11Var, c11Var2);
        if (L.a && (L.e != null || L.f != null)) {
            float f7 = 0.0f;
            boolean z4 = true;
            if (L.b) {
                if ((this.m0 & 1) == 1 && c11Var2 != null) {
                    if (c11Var == null) {
                        View view4 = (View) c11Var2.b.getParent();
                    }
                    View view5 = c11Var2.b;
                    sp spVar = (sp) this;
                    if (c11Var != null && (f6 = (Float) c11Var.a.get("android:fade:transitionAlpha")) != null) {
                        f5 = f6.floatValue();
                    } else {
                        f5 = 0.0f;
                    }
                    if (f5 != 1.0f) {
                        f7 = f5;
                    }
                    return spVar.M(view5, f7, 1.0f);
                }
                return null;
            }
            int i4 = L.d;
            if ((this.m0 & 2) == 2 && c11Var != null) {
                View view6 = c11Var.b;
                if (c11Var2 != null) {
                    view = c11Var2.b;
                } else {
                    view = null;
                }
                int i5 = di0.save_overlay_view;
                View view7 = (View) view6.getTag(i5);
                if (view7 != null) {
                    i = i4;
                    obj = "android:fade:transitionAlpha";
                    i2 = i5;
                    view3 = null;
                } else {
                    if (view != null && view.getParent() != null) {
                        if (i4 == 4 || view6 == view) {
                            view7 = null;
                            z = false;
                        }
                        view = null;
                        view7 = null;
                        z = true;
                    } else {
                        if (view != null) {
                            view7 = view;
                            view = null;
                            z = false;
                        }
                        view = null;
                        view7 = null;
                        z = true;
                    }
                    if (z) {
                        if (view6.getParent() == null) {
                            view2 = view;
                            i = i4;
                            view7 = view6;
                            obj = "android:fade:transitionAlpha";
                            i2 = i5;
                            view3 = view2;
                            z4 = false;
                        } else if (view6.getParent() instanceof View) {
                            View view8 = (View) view6.getParent();
                            if (!L(r(view8, true), o(view8, true)).a) {
                                boolean z5 = b11.a;
                                Matrix matrix = new Matrix();
                                matrix.setTranslate(-view8.getScrollX(), -view8.getScrollY());
                                f51 f51Var = a51.a;
                                f51Var.n(view6, matrix);
                                f51Var.o(viewGroup, matrix);
                                RectF rectF = new RectF(0.0f, 0.0f, view6.getWidth(), view6.getHeight());
                                matrix.mapRect(rectF);
                                int round = Math.round(rectF.left);
                                int round2 = Math.round(rectF.top);
                                int round3 = Math.round(rectF.right);
                                int round4 = Math.round(rectF.bottom);
                                ImageView imageView = new ImageView(view6.getContext());
                                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                if (b11.a) {
                                    z2 = !view6.isAttachedToWindow();
                                    z3 = viewGroup.isAttachedToWindow();
                                } else {
                                    z2 = false;
                                    z3 = false;
                                }
                                boolean z6 = b11.b;
                                if (z6 && z2) {
                                    if (!z3) {
                                        view2 = view;
                                        i = i4;
                                        obj = "android:fade:transitionAlpha";
                                        i2 = i5;
                                        bitmap = null;
                                        if (bitmap != null) {
                                            imageView.setImageBitmap(bitmap);
                                        }
                                        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                        imageView.layout(round, round2, round3, round4);
                                        view7 = imageView;
                                    } else {
                                        view2 = view;
                                        ViewGroup viewGroup3 = (ViewGroup) view6.getParent();
                                        int indexOfChild = viewGroup3.indexOfChild(view6);
                                        viewGroup.getOverlay().add(view6);
                                        viewGroup2 = viewGroup3;
                                        i = i4;
                                        i3 = indexOfChild;
                                    }
                                } else {
                                    view2 = view;
                                    i = i4;
                                    viewGroup2 = null;
                                    i3 = 0;
                                }
                                i2 = i5;
                                int round5 = Math.round(rectF.width());
                                obj = "android:fade:transitionAlpha";
                                int round6 = Math.round(rectF.height());
                                if (round5 > 0 && round6 > 0) {
                                    float min = Math.min(1.0f, 1048576.0f / (round5 * round6));
                                    int round7 = Math.round(round5 * min);
                                    int round8 = Math.round(round6 * min);
                                    matrix.postTranslate(-rectF.left, -rectF.top);
                                    matrix.postScale(min, min);
                                    if (b11.c) {
                                        Picture picture = new Picture();
                                        Canvas beginRecording = picture.beginRecording(round7, round8);
                                        beginRecording.concat(matrix);
                                        view6.draw(beginRecording);
                                        picture.endRecording();
                                        bitmap = Bitmap.createBitmap(picture);
                                    } else {
                                        bitmap = Bitmap.createBitmap(round7, round8, Bitmap.Config.ARGB_8888);
                                        Canvas canvas = new Canvas(bitmap);
                                        canvas.concat(matrix);
                                        view6.draw(canvas);
                                    }
                                } else {
                                    bitmap = null;
                                }
                                if (z6 && z2) {
                                    viewGroup.getOverlay().remove(view6);
                                    viewGroup2.addView(view6, i3);
                                }
                                if (bitmap != null) {
                                }
                                imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                imageView.layout(round, round2, round3, round4);
                                view7 = imageView;
                            } else {
                                view2 = view;
                                i = i4;
                                obj = "android:fade:transitionAlpha";
                                i2 = i5;
                                int id = view8.getId();
                                if (view8.getParent() == null && id != -1) {
                                    viewGroup.findViewById(id);
                                }
                            }
                            view3 = view2;
                            z4 = false;
                        }
                    }
                    view2 = view;
                    i = i4;
                    obj = "android:fade:transitionAlpha";
                    i2 = i5;
                    view3 = view2;
                    z4 = false;
                }
                if (view7 != null) {
                    if (!z4) {
                        int[] iArr = (int[]) c11Var.a.get("android:visibility:screenLocation");
                        int i6 = iArr[0];
                        int i7 = iArr[1];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        view7.offsetLeftAndRight((i6 - iArr2[0]) - view7.getLeft());
                        view7.offsetTopAndBottom((i7 - iArr2[1]) - view7.getTop());
                        viewGroup.getOverlay().add(view7);
                    }
                    q51Var = this;
                    sp spVar2 = (sp) q51Var;
                    a51.a.getClass();
                    Float f8 = (Float) c11Var.a.get(obj);
                    if (f8 != null) {
                        f4 = f8.floatValue();
                        f3 = 0.0f;
                    } else {
                        f3 = 0.0f;
                        f4 = 1.0f;
                    }
                    M = spVar2.M(view7, f4, f3);
                    if (!z4) {
                        if (M == null) {
                            viewGroup.getOverlay().remove(view7);
                            return M;
                        }
                        view6.setTag(i2, view7);
                        p51Var = new p51(q51Var, viewGroup, view7, view6);
                    } else {
                        return M;
                    }
                } else {
                    q51Var = this;
                    Object obj2 = obj;
                    if (view3 != null) {
                        int visibility = view3.getVisibility();
                        f51 f51Var2 = a51.a;
                        f51Var2.m(view3, 0);
                        sp spVar3 = (sp) q51Var;
                        f51Var2.getClass();
                        Float f9 = (Float) c11Var.a.get(obj2);
                        if (f9 != null) {
                            f2 = f9.floatValue();
                            f = 0.0f;
                        } else {
                            f = 0.0f;
                            f2 = 1.0f;
                        }
                        M = spVar3.M(view3, f2, f);
                        if (M != null) {
                            a aVar = new a(i, view3);
                            M.addListener(aVar);
                            M.addPauseListener(aVar);
                            p51Var = aVar;
                        } else {
                            f51Var2.m(view3, visibility);
                            return M;
                        }
                    }
                }
                q51Var.a(p51Var);
                return M;
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.u01
    public final String[] q() {
        return n0;
    }

    @Override // defpackage.u01
    public final boolean s(c11 c11Var, c11 c11Var2) {
        if (c11Var == null && c11Var2 == null) {
            return false;
        }
        if (c11Var == null || c11Var2 == null || c11Var2.a.containsKey("android:visibility:visibility") == c11Var.a.containsKey("android:visibility:visibility")) {
            b L = L(c11Var, c11Var2);
            if (L.a) {
                return L.c == 0 || L.d == 0;
            }
            return false;
        }
        return false;
    }
}