package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: rg2  reason: default package */
public final class rg2 implements mg2 {
    public static final Map S;
    public final o82 P;
    public final tn2 Q;
    public final nj2 R;

    static {
        String[] strArr = {"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"};
        Integer[] numArr = {1, 2, 3, 4, 5, 6, 7};
        e7 e7Var = new e7(7);
        for (int i = 0; i < 7; i++) {
            e7Var.put(strArr[i], numArr[i]);
        }
        S = Collections.unmodifiableMap(e7Var);
    }

    public rg2(o82 o82Var, tn2 tn2Var, nj2 nj2Var) {
        this.P = o82Var;
        this.Q = tn2Var;
        this.R = nj2Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(17:150|(1:152)(1:210)|153|154|173|(12:(1:(2:177|(1:(13:180|(1:182)(1:202)|183|184|185|186|187|188|(1:190)|191|192|193|93)(1:203))(1:205))(10:207|185|186|187|188|(0)|191|192|193|93))(1:208)|204|184|185|186|187|188|(0)|191|192|193|93)(1:209)|206|184|185|186|187|188|(0)|191|192|193|93) */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x05a7, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x05a8, code lost:
        defpackage.sv2.e("Error occurred while dispatching state change.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x05ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x05af, code lost:
        r2.c("Cannot show popup window: " + r0.getMessage());
        r2.h0.removeView((android.view.View) r2.a0);
        r0 = r2.i0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x05d2, code lost:
        if (r0 != null) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x05d4, code lost:
        r0.removeView(r2.d0);
        r2.i0.addView((android.view.View) r2.a0);
        r2.a0.A0(r2.c0);
     */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03f0 A[Catch: all -> 0x05fa, TryCatch #2 {, blocks: (B:88:0x01a8, B:274:0x05f5, B:275:0x05f8, B:91:0x01b0, B:94:0x01bc, B:97:0x01cc, B:99:0x01d4, B:101:0x01e2, B:102:0x01f4, B:104:0x0202, B:105:0x0214, B:107:0x0222, B:108:0x0234, B:110:0x0242, B:111:0x0254, B:113:0x0262, B:114:0x0270, B:116:0x027e, B:117:0x0280, B:119:0x0284, B:121:0x0288, B:123:0x0290, B:126:0x0298, B:130:0x02b7, B:203:0x03e6, B:207:0x03f0, B:209:0x040e, B:211:0x0412, B:213:0x041f, B:215:0x0459, B:245:0x0504, B:255:0x0527, B:256:0x052a, B:257:0x0542, B:258:0x055d, B:260:0x0565, B:261:0x0570, B:262:0x0592, B:265:0x05a8, B:267:0x05af, B:269:0x05d4, B:246:0x0508, B:248:0x050e, B:249:0x0512, B:250:0x0516, B:251:0x051c, B:253:0x0522, B:214:0x0456, B:137:0x02c7, B:139:0x02cb, B:167:0x031e, B:178:0x037e, B:180:0x0383, B:182:0x0386, B:184:0x038b, B:187:0x0391, B:169:0x032b, B:173:0x034c, B:171:0x0338, B:172:0x0345, B:175:0x0355, B:176:0x036a, B:177:0x0377, B:188:0x03a3, B:194:0x03c8, B:200:0x03d9, B:197:0x03cf, B:199:0x03d7, B:191:0x03c0, B:193:0x03c6), top: B:305:0x01a8, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0565 A[Catch: all -> 0x05fa, TryCatch #2 {, blocks: (B:88:0x01a8, B:274:0x05f5, B:275:0x05f8, B:91:0x01b0, B:94:0x01bc, B:97:0x01cc, B:99:0x01d4, B:101:0x01e2, B:102:0x01f4, B:104:0x0202, B:105:0x0214, B:107:0x0222, B:108:0x0234, B:110:0x0242, B:111:0x0254, B:113:0x0262, B:114:0x0270, B:116:0x027e, B:117:0x0280, B:119:0x0284, B:121:0x0288, B:123:0x0290, B:126:0x0298, B:130:0x02b7, B:203:0x03e6, B:207:0x03f0, B:209:0x040e, B:211:0x0412, B:213:0x041f, B:215:0x0459, B:245:0x0504, B:255:0x0527, B:256:0x052a, B:257:0x0542, B:258:0x055d, B:260:0x0565, B:261:0x0570, B:262:0x0592, B:265:0x05a8, B:267:0x05af, B:269:0x05d4, B:246:0x0508, B:248:0x050e, B:249:0x0512, B:250:0x0516, B:251:0x051c, B:253:0x0522, B:214:0x0456, B:137:0x02c7, B:139:0x02cb, B:167:0x031e, B:178:0x037e, B:180:0x0383, B:182:0x0386, B:184:0x038b, B:187:0x0391, B:169:0x032b, B:173:0x034c, B:171:0x0338, B:172:0x0345, B:175:0x0355, B:176:0x036a, B:177:0x0377, B:188:0x03a3, B:194:0x03c8, B:200:0x03d9, B:197:0x03cf, B:199:0x03d7, B:191:0x03c0, B:193:0x03c6), top: B:305:0x01a8, inners: #0, #1 }] */
    @Override // defpackage.mg2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Object obj, Map map) {
        int i;
        String str;
        String str2;
        int[] iArr;
        int i2;
        nj2 nj2Var;
        char c;
        int i3;
        int i4;
        int i5;
        int i6;
        String valueOf;
        String str3;
        String concat;
        String str4;
        String str5;
        String str6;
        String str7;
        Activity activity;
        Intent type;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        y03 y03Var = (y03) obj;
        int intValue = ((Integer) S.get((String) map.get("a"))).intValue();
        boolean z = true;
        if (intValue != 5) {
            if (intValue != 7) {
                if (this.P.b()) {
                    if (intValue != 1) {
                        if (intValue != 3) {
                            if (intValue != 4) {
                                if (intValue != 5) {
                                    if (intValue != 6) {
                                        if (intValue != 7) {
                                            sv2.f("Unknown MRAID command called.");
                                            return;
                                        }
                                    } else {
                                        this.Q.g(true);
                                        return;
                                    }
                                }
                            } else {
                                rn2 rn2Var = new rn2(y03Var, map);
                                if (rn2Var.S == null) {
                                    str12 = "Activity context is not available.";
                                } else {
                                    jv5 jv5Var = jv5.A;
                                    cu5 cu5Var = jv5Var.c;
                                    uf0.g(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"), "Intent can not be null");
                                    if (!(!activity.getPackageManager().queryIntentActivities(type, 0).isEmpty())) {
                                        str12 = "This feature is not available on the device.";
                                    } else {
                                        AlertDialog.Builder e = cu5.e(rn2Var.S);
                                        Resources a = jv5Var.g.a();
                                        if (a != null) {
                                            str8 = a.getString(ri0.s5);
                                        } else {
                                            str8 = "Create calendar event";
                                        }
                                        e.setTitle(str8);
                                        if (a != null) {
                                            str9 = a.getString(ri0.s6);
                                        } else {
                                            str9 = "Allow Ad to create a calendar event?";
                                        }
                                        e.setMessage(str9);
                                        if (a != null) {
                                            str10 = a.getString(ri0.s3);
                                        } else {
                                            str10 = "Accept";
                                        }
                                        e.setPositiveButton(str10, new pn2(rn2Var));
                                        if (a != null) {
                                            str11 = a.getString(ri0.s4);
                                        } else {
                                            str11 = "Decline";
                                        }
                                        e.setNegativeButton(str11, new qn2(rn2Var));
                                        e.create().show();
                                        return;
                                    }
                                }
                                rn2Var.c(str12);
                                return;
                            }
                        } else {
                            wn2 wn2Var = new wn2(y03Var, map);
                            Activity activity2 = wn2Var.R;
                            if (activity2 == null) {
                                concat = "Activity context is not available";
                            } else {
                                jv5 jv5Var2 = jv5.A;
                                cu5 cu5Var2 = jv5Var2.c;
                                if (!((((Boolean) lx2.a(activity2, j92.a)).booleanValue() && c81.a(activity2).a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) ? false : false)) {
                                    concat = "Feature is not supported by the device.";
                                } else {
                                    String str13 = (String) map.get("iurl");
                                    if (TextUtils.isEmpty(str13)) {
                                        concat = "Image url cannot be empty.";
                                    } else {
                                        if (URLUtil.isValidUrl(str13)) {
                                            String lastPathSegment = Uri.parse(str13).getLastPathSegment();
                                            if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                                                Resources a2 = jv5Var2.g.a();
                                                AlertDialog.Builder e2 = cu5.e(wn2Var.R);
                                                if (a2 != null) {
                                                    str4 = a2.getString(ri0.s1);
                                                } else {
                                                    str4 = "Save image";
                                                }
                                                e2.setTitle(str4);
                                                if (a2 != null) {
                                                    str5 = a2.getString(ri0.s2);
                                                } else {
                                                    str5 = "Allow Ad to store image in Picture gallery?";
                                                }
                                                e2.setMessage(str5);
                                                if (a2 != null) {
                                                    str6 = a2.getString(ri0.s3);
                                                } else {
                                                    str6 = "Accept";
                                                }
                                                e2.setPositiveButton(str6, new un2(wn2Var, str13, lastPathSegment));
                                                if (a2 != null) {
                                                    str7 = a2.getString(ri0.s4);
                                                } else {
                                                    str7 = "Decline";
                                                }
                                                e2.setNegativeButton(str7, new vn2(wn2Var));
                                                e2.create().show();
                                                return;
                                            }
                                            valueOf = String.valueOf(lastPathSegment);
                                            str3 = "Image type not recognized: ";
                                        } else {
                                            valueOf = String.valueOf(str13);
                                            str3 = "Invalid image url: ";
                                        }
                                        concat = str3.concat(valueOf);
                                    }
                                }
                            }
                            wn2Var.c(concat);
                            return;
                        }
                    } else {
                        tn2 tn2Var = this.Q;
                        synchronized (tn2Var.Z) {
                            if (tn2Var.b0 == null) {
                                str = "Not an activity context. Cannot resize.";
                            } else if (tn2Var.a0.L() == null) {
                                str = "Webview is not yet available, size is not set.";
                            } else if (tn2Var.a0.L().b()) {
                                str = "Is interstitial. Cannot resize an interstitial.";
                            } else if (!tn2Var.a0.V()) {
                                if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                                    cu5 cu5Var3 = jv5.A.c;
                                    tn2Var.Y = cu5.g((String) map.get("width"));
                                }
                                if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                                    cu5 cu5Var4 = jv5.A.c;
                                    tn2Var.V = cu5.g((String) map.get("height"));
                                }
                                if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                                    cu5 cu5Var5 = jv5.A.c;
                                    tn2Var.W = cu5.g((String) map.get("offsetX"));
                                }
                                if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                                    cu5 cu5Var6 = jv5.A.c;
                                    tn2Var.X = cu5.g((String) map.get("offsetY"));
                                }
                                if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                                    tn2Var.S = Boolean.parseBoolean((String) map.get("allowOffscreen"));
                                }
                                String str14 = (String) map.get("customClosePosition");
                                if (!TextUtils.isEmpty(str14)) {
                                    tn2Var.R = str14;
                                }
                                if (tn2Var.Y >= 0 && tn2Var.V >= 0) {
                                    Window window = tn2Var.b0.getWindow();
                                    if (window != null && window.getDecorView() != null) {
                                        cu5 cu5Var7 = jv5.A.c;
                                        int[] n = cu5.n(tn2Var.b0);
                                        int[] j = cu5.j(tn2Var.b0);
                                        int i7 = n[0];
                                        int i8 = n[1];
                                        int i9 = tn2Var.Y;
                                        if (i9 >= 50 && i9 <= i7) {
                                            int i10 = tn2Var.V;
                                            if (i10 >= 50 && i10 <= i8) {
                                                if (i10 == i8 && i9 == i7) {
                                                    str2 = "Cannot resize to a full-screen ad.";
                                                    sv2.g(str2);
                                                    iArr = null;
                                                    if (iArr != null) {
                                                    }
                                                } else {
                                                    if (tn2Var.S) {
                                                        String str15 = tn2Var.R;
                                                        switch (str15.hashCode()) {
                                                            case -1364013995:
                                                                if (str15.equals("center")) {
                                                                    c = 2;
                                                                    break;
                                                                }
                                                                c = 65535;
                                                                break;
                                                            case -1012429441:
                                                                if (str15.equals("top-left")) {
                                                                    c = 0;
                                                                    break;
                                                                }
                                                                c = 65535;
                                                                break;
                                                            case -655373719:
                                                                if (str15.equals("bottom-left")) {
                                                                    c = 3;
                                                                    break;
                                                                }
                                                                c = 65535;
                                                                break;
                                                            case 1163912186:
                                                                if (str15.equals("bottom-right")) {
                                                                    c = 5;
                                                                    break;
                                                                }
                                                                c = 65535;
                                                                break;
                                                            case 1288627767:
                                                                if (str15.equals("bottom-center")) {
                                                                    c = 4;
                                                                    break;
                                                                }
                                                                c = 65535;
                                                                break;
                                                            case 1755462605:
                                                                if (str15.equals("top-center")) {
                                                                    c = 1;
                                                                    break;
                                                                }
                                                                c = 65535;
                                                                break;
                                                            default:
                                                                c = 65535;
                                                                break;
                                                        }
                                                        if (c != 0) {
                                                            if (c != 1) {
                                                                if (c != 2) {
                                                                    if (c != 3) {
                                                                        if (c != 4) {
                                                                            if (c != 5) {
                                                                                i3 = e1.d(tn2Var.T, tn2Var.W, i9, -50);
                                                                                i4 = tn2Var.U;
                                                                            } else {
                                                                                i3 = e1.d(tn2Var.T, tn2Var.W, i9, -50);
                                                                                i6 = tn2Var.U;
                                                                            }
                                                                        } else {
                                                                            i3 = ((tn2Var.T + tn2Var.W) + (i9 >> 1)) - 25;
                                                                            i6 = tn2Var.U;
                                                                        }
                                                                    } else {
                                                                        i3 = tn2Var.T + tn2Var.W;
                                                                        i6 = tn2Var.U;
                                                                    }
                                                                    i5 = e1.d(i6, tn2Var.X, i10, -50);
                                                                } else {
                                                                    i3 = ((tn2Var.T + tn2Var.W) + (i9 >> 1)) - 25;
                                                                    i5 = ((tn2Var.U + tn2Var.X) + (i10 >> 1)) - 25;
                                                                }
                                                                if (i3 >= 0 && i3 + 50 <= i7 && i5 >= j[0] && i5 + 50 <= j[1]) {
                                                                    iArr = new int[]{tn2Var.T + tn2Var.W, tn2Var.U + tn2Var.X};
                                                                }
                                                                iArr = null;
                                                            } else {
                                                                i3 = ((tn2Var.T + tn2Var.W) + (i9 >> 1)) - 25;
                                                                i4 = tn2Var.U;
                                                            }
                                                        } else {
                                                            i3 = tn2Var.T + tn2Var.W;
                                                            i4 = tn2Var.U;
                                                        }
                                                        i5 = tn2Var.X + i4;
                                                        if (i3 >= 0) {
                                                            iArr = new int[]{tn2Var.T + tn2Var.W, tn2Var.U + tn2Var.X};
                                                        }
                                                        iArr = null;
                                                    } else {
                                                        int[] n2 = cu5.n(tn2Var.b0);
                                                        int[] j2 = cu5.j(tn2Var.b0);
                                                        int i11 = n2[0];
                                                        int i12 = tn2Var.T + tn2Var.W;
                                                        int i13 = tn2Var.U + tn2Var.X;
                                                        if (i12 < 0) {
                                                            i12 = 0;
                                                        } else {
                                                            int i14 = tn2Var.Y;
                                                            if (i12 + i14 > i11) {
                                                                i12 = i11 - i14;
                                                            }
                                                        }
                                                        int i15 = j2[0];
                                                        if (i13 < i15) {
                                                            i13 = i15;
                                                        } else {
                                                            int i16 = tn2Var.V;
                                                            int i17 = i13 + i16;
                                                            int i18 = j2[1];
                                                            if (i17 > i18) {
                                                                i13 = i18 - i16;
                                                            }
                                                        }
                                                        iArr = new int[]{i12, i13};
                                                    }
                                                    if (iArr != null) {
                                                        str = "Resize location out of screen or close button is not visible.";
                                                    } else {
                                                        mv2 mv2Var = n62.f.a;
                                                        int k = mv2.k(tn2Var.b0, tn2Var.Y);
                                                        int k2 = mv2.k(tn2Var.b0, tn2Var.V);
                                                        ViewParent parent = ((View) tn2Var.a0).getParent();
                                                        if (parent != null && (parent instanceof ViewGroup)) {
                                                            ViewGroup viewGroup = (ViewGroup) parent;
                                                            viewGroup.removeView((View) tn2Var.a0);
                                                            PopupWindow popupWindow = tn2Var.g0;
                                                            if (popupWindow == null) {
                                                                tn2Var.i0 = viewGroup;
                                                                y03 y03Var2 = tn2Var.a0;
                                                                ((View) y03Var2).setDrawingCacheEnabled(true);
                                                                Bitmap createBitmap = Bitmap.createBitmap(((View) y03Var2).getDrawingCache());
                                                                ((View) y03Var2).setDrawingCacheEnabled(false);
                                                                ImageView imageView = new ImageView(tn2Var.b0);
                                                                tn2Var.d0 = imageView;
                                                                imageView.setImageBitmap(createBitmap);
                                                                tn2Var.c0 = tn2Var.a0.L();
                                                                tn2Var.i0.addView(tn2Var.d0);
                                                            } else {
                                                                popupWindow.dismiss();
                                                            }
                                                            RelativeLayout relativeLayout = new RelativeLayout(tn2Var.b0);
                                                            tn2Var.h0 = relativeLayout;
                                                            relativeLayout.setBackgroundColor(0);
                                                            tn2Var.h0.setLayoutParams(new ViewGroup.LayoutParams(k, k2));
                                                            PopupWindow popupWindow2 = new PopupWindow((View) tn2Var.h0, k, k2, false);
                                                            tn2Var.g0 = popupWindow2;
                                                            popupWindow2.setOutsideTouchable(false);
                                                            tn2Var.g0.setTouchable(true);
                                                            tn2Var.g0.setClippingEnabled(!tn2Var.S);
                                                            char c2 = 65535;
                                                            tn2Var.h0.addView((View) tn2Var.a0, -1, -1);
                                                            tn2Var.e0 = new LinearLayout(tn2Var.b0);
                                                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(mv2.k(tn2Var.b0, 50), mv2.k(tn2Var.b0, 50));
                                                            String str16 = tn2Var.R;
                                                            switch (str16.hashCode()) {
                                                                case -1364013995:
                                                                    if (str16.equals("center")) {
                                                                        c2 = 2;
                                                                        break;
                                                                    }
                                                                    break;
                                                                case -1012429441:
                                                                    if (str16.equals("top-left")) {
                                                                        c2 = 0;
                                                                        break;
                                                                    }
                                                                    break;
                                                                case -655373719:
                                                                    if (str16.equals("bottom-left")) {
                                                                        c2 = 3;
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1163912186:
                                                                    if (str16.equals("bottom-right")) {
                                                                        c2 = 5;
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1288627767:
                                                                    if (str16.equals("bottom-center")) {
                                                                        c2 = 4;
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1755462605:
                                                                    if (str16.equals("top-center")) {
                                                                        c2 = 1;
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                            if (c2 != 0) {
                                                                if (c2 != 1) {
                                                                    if (c2 != 2) {
                                                                        if (c2 != 3) {
                                                                            if (c2 != 4) {
                                                                                if (c2 != 5) {
                                                                                    layoutParams.addRule(10);
                                                                                } else {
                                                                                    layoutParams.addRule(12);
                                                                                }
                                                                                i2 = 11;
                                                                                layoutParams.addRule(i2);
                                                                                tn2Var.e0.setOnClickListener(new sn2(tn2Var));
                                                                                tn2Var.e0.setContentDescription("Close button");
                                                                                tn2Var.h0.addView(tn2Var.e0, layoutParams);
                                                                                tn2Var.g0.showAtLocation(window.getDecorView(), 0, mv2.k(tn2Var.b0, iArr[0]), mv2.k(tn2Var.b0, iArr[1]));
                                                                                int i19 = iArr[0];
                                                                                int i20 = iArr[1];
                                                                                nj2Var = tn2Var.f0;
                                                                                if (nj2Var != null) {
                                                                                    ((pq3) nj2Var.Q).c.R0(n42.S);
                                                                                }
                                                                                tn2Var.a0.A0(new k23(1, k, k2));
                                                                                tn2Var.d(iArr[0], iArr[1] - cu5.j(tn2Var.b0)[0], tn2Var.Y, tn2Var.V);
                                                                                ((y03) tn2Var.P).p("onStateChanged", new JSONObject().put("state", "resized"));
                                                                            } else {
                                                                                layoutParams.addRule(12);
                                                                            }
                                                                        } else {
                                                                            layoutParams.addRule(12);
                                                                        }
                                                                    } else {
                                                                        layoutParams.addRule(13);
                                                                        tn2Var.e0.setOnClickListener(new sn2(tn2Var));
                                                                        tn2Var.e0.setContentDescription("Close button");
                                                                        tn2Var.h0.addView(tn2Var.e0, layoutParams);
                                                                        tn2Var.g0.showAtLocation(window.getDecorView(), 0, mv2.k(tn2Var.b0, iArr[0]), mv2.k(tn2Var.b0, iArr[1]));
                                                                        int i192 = iArr[0];
                                                                        int i202 = iArr[1];
                                                                        nj2Var = tn2Var.f0;
                                                                        if (nj2Var != null) {
                                                                        }
                                                                        tn2Var.a0.A0(new k23(1, k, k2));
                                                                        tn2Var.d(iArr[0], iArr[1] - cu5.j(tn2Var.b0)[0], tn2Var.Y, tn2Var.V);
                                                                        ((y03) tn2Var.P).p("onStateChanged", new JSONObject().put("state", "resized"));
                                                                    }
                                                                } else {
                                                                    layoutParams.addRule(10);
                                                                }
                                                                i2 = 14;
                                                                layoutParams.addRule(i2);
                                                                tn2Var.e0.setOnClickListener(new sn2(tn2Var));
                                                                tn2Var.e0.setContentDescription("Close button");
                                                                tn2Var.h0.addView(tn2Var.e0, layoutParams);
                                                                tn2Var.g0.showAtLocation(window.getDecorView(), 0, mv2.k(tn2Var.b0, iArr[0]), mv2.k(tn2Var.b0, iArr[1]));
                                                                int i1922 = iArr[0];
                                                                int i2022 = iArr[1];
                                                                nj2Var = tn2Var.f0;
                                                                if (nj2Var != null) {
                                                                }
                                                                tn2Var.a0.A0(new k23(1, k, k2));
                                                                tn2Var.d(iArr[0], iArr[1] - cu5.j(tn2Var.b0)[0], tn2Var.Y, tn2Var.V);
                                                                ((y03) tn2Var.P).p("onStateChanged", new JSONObject().put("state", "resized"));
                                                            } else {
                                                                layoutParams.addRule(10);
                                                            }
                                                            i2 = 9;
                                                            layoutParams.addRule(i2);
                                                            tn2Var.e0.setOnClickListener(new sn2(tn2Var));
                                                            tn2Var.e0.setContentDescription("Close button");
                                                            tn2Var.h0.addView(tn2Var.e0, layoutParams);
                                                            tn2Var.g0.showAtLocation(window.getDecorView(), 0, mv2.k(tn2Var.b0, iArr[0]), mv2.k(tn2Var.b0, iArr[1]));
                                                            int i19222 = iArr[0];
                                                            int i20222 = iArr[1];
                                                            nj2Var = tn2Var.f0;
                                                            if (nj2Var != null) {
                                                            }
                                                            tn2Var.a0.A0(new k23(1, k, k2));
                                                            tn2Var.d(iArr[0], iArr[1] - cu5.j(tn2Var.b0)[0], tn2Var.Y, tn2Var.V);
                                                            ((y03) tn2Var.P).p("onStateChanged", new JSONObject().put("state", "resized"));
                                                        } else {
                                                            str = "Webview is detached, probably in the middle of a resize or expand.";
                                                        }
                                                    }
                                                }
                                            }
                                            str2 = "Height is too small or too large.";
                                            sv2.g(str2);
                                            iArr = null;
                                            if (iArr != null) {
                                            }
                                        }
                                        str2 = "Width is too small or too large.";
                                        sv2.g(str2);
                                        iArr = null;
                                        if (iArr != null) {
                                        }
                                    }
                                    str = "Activity context is not ready, cannot get window or decor view.";
                                } else {
                                    str = "Invalid width and height options. Cannot resize.";
                                }
                            } else {
                                str = "Cannot resize an expanded banner.";
                            }
                            tn2Var.c(str);
                        }
                        return;
                    }
                } else {
                    this.P.a(null);
                    return;
                }
            }
            ((pq3) this.R.Q).m.a();
            return;
        }
        String str17 = (String) map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            z = Boolean.parseBoolean((String) map.get("allowOrientationChange"));
        }
        if (y03Var == null) {
            sv2.g("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str17)) {
            i = 7;
        } else if ("landscape".equalsIgnoreCase(str17)) {
            i = 6;
        } else if (z) {
            i = -1;
        } else {
            i = 14;
        }
        y03Var.S(i);
    }
}