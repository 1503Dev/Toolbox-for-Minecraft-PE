package defpackage;

import android.app.Notification;
import android.app.Notification$Action$Builder;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ea0  reason: default package */
public final class ea0 {
    public final Notification.Builder a;
    public final y90 b;
    public final ArrayList c = new ArrayList();
    public final Bundle d = new Bundle();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024e  */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.CharSequence, android.net.Uri, long[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.app.Notification, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v18, types: [float] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ea0(y90 y90Var) {
        Notification.Builder builder;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ?? r5;
        int i;
        ?? r4;
        List<String> list;
        int i2;
        Bundle bundle;
        List b;
        Iterator<w90> it;
        int i3;
        int i4;
        Notification$Action$Builder notification$Action$Builder;
        Bundle bundle2;
        Icon icon;
        Bitmap bitmap;
        String str;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        this.b = y90Var;
        Context context = y90Var.a;
        int i5 = Build.VERSION.SDK_INT;
        Context context2 = y90Var.a;
        int i6 = 26;
        if (i5 >= 26) {
            builder = new Notification.Builder(context2, y90Var.m);
        } else {
            builder = new Notification.Builder(context2);
        }
        this.a = builder;
        Notification notification = y90Var.o;
        Notification.Builder lights = builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z);
        if ((notification.flags & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z2);
        if ((notification.flags & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z3).setDefaults(notification.defaults).setContentTitle(y90Var.e).setContentText(y90Var.f).setContentInfo(null).setContentIntent(y90Var.g).setDeleteIntent(notification.deleteIntent);
        if ((notification.flags & 128) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        deleteIntent.setFullScreenIntent(null, z4).setLargeIcon((Bitmap) null).setNumber(0).setProgress(0, 0, false);
        if (i5 < 21) {
            builder.setSound(notification.sound, notification.audioStreamType);
        }
        builder.setSubText(null).setUsesChronometer(false).setPriority(y90Var.h);
        Iterator<w90> it2 = y90Var.b.iterator();
        while (it2.hasNext()) {
            w90 next = it2.next();
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 20) {
                IconCompat a = next.a();
                if (i7 >= 23) {
                    if (a != null) {
                        int i8 = a.a;
                        switch (i8) {
                            case -1:
                                it = it2;
                                icon = (Icon) a.b;
                                break;
                            case 0:
                            default:
                                throw new IllegalArgumentException("Unknown type");
                            case 1:
                                it = it2;
                                bitmap = (Bitmap) a.b;
                                icon = Icon.createWithBitmap(bitmap);
                                colorStateList = a.g;
                                if (colorStateList != null) {
                                    icon.setTintList(colorStateList);
                                }
                                mode = a.h;
                                if (mode != IconCompat.k) {
                                    icon.setTintMode(mode);
                                    break;
                                }
                                break;
                            case 2:
                                it = it2;
                                if (i8 == -1 && i7 >= 23) {
                                    Icon icon2 = (Icon) a.b;
                                    if (i7 >= 28) {
                                        str = tw.a(icon2);
                                    } else {
                                        try {
                                            str = (String) icon2.getClass().getMethod("getResPackage", new Class[0]).invoke(icon2, new Object[0]);
                                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                                            Log.e("IconCompat", "Unable to get icon package", e);
                                            str = null;
                                        }
                                    }
                                } else if (i8 == 2) {
                                    if (TextUtils.isEmpty(a.j)) {
                                        str = ((String) a.b).split(":", -1)[0];
                                    } else {
                                        str = a.j;
                                    }
                                } else {
                                    throw new IllegalStateException("called getResPackage() on " + a);
                                }
                                icon = Icon.createWithResource(str, a.e);
                                colorStateList = a.g;
                                if (colorStateList != null) {
                                }
                                mode = a.h;
                                if (mode != IconCompat.k) {
                                }
                                break;
                            case 3:
                                it = it2;
                                icon = Icon.createWithData((byte[]) a.b, a.e, a.f);
                                colorStateList = a.g;
                                if (colorStateList != null) {
                                }
                                mode = a.h;
                                if (mode != IconCompat.k) {
                                }
                                break;
                            case 4:
                                it = it2;
                                icon = Icon.createWithContentUri((String) a.b);
                                colorStateList = a.g;
                                if (colorStateList != null) {
                                }
                                mode = a.h;
                                if (mode != IconCompat.k) {
                                }
                                break;
                            case 5:
                                if (i7 >= i6) {
                                    icon = rw.a((Bitmap) a.b);
                                    it = it2;
                                    colorStateList = a.g;
                                    if (colorStateList != null) {
                                    }
                                    mode = a.h;
                                    if (mode != IconCompat.k) {
                                    }
                                } else {
                                    Bitmap bitmap2 = (Bitmap) a.b;
                                    int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                                    Canvas canvas = new Canvas(Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888));
                                    Paint paint = new Paint(3);
                                    float f = min * 0.5f;
                                    paint.setColor(-16777216);
                                    it = it2;
                                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                    BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                                    Matrix matrix = new Matrix();
                                    ?? r9 = (-(bitmap2.getWidth() - min)) / 2;
                                    matrix.setTranslate(r9, (-(bitmap2.getHeight() - min)) / 2);
                                    bitmapShader.setLocalMatrix(matrix);
                                    paint.setShader(bitmapShader);
                                    canvas.drawCircle(f, f, 0.9166667f * f, paint);
                                    canvas.setBitmap(null);
                                    bitmap = r9;
                                    icon = Icon.createWithBitmap(bitmap);
                                    colorStateList = a.g;
                                    if (colorStateList != null) {
                                    }
                                    mode = a.h;
                                    if (mode != IconCompat.k) {
                                    }
                                }
                                break;
                            case 6:
                                if (i7 >= 30) {
                                    icon = sw.a(a.c());
                                    it = it2;
                                    colorStateList = a.g;
                                    if (colorStateList != null) {
                                    }
                                    mode = a.h;
                                    if (mode != IconCompat.k) {
                                    }
                                } else {
                                    StringBuilder b2 = e5.b("Context is required to resolve the file uri of the icon: ");
                                    b2.append(a.c());
                                    throw new IllegalArgumentException(b2.toString());
                                }
                                break;
                        }
                    } else {
                        it = it2;
                        icon = null;
                    }
                    notification$Action$Builder = new Notification$Action$Builder(icon, next.j, next.k);
                } else {
                    it = it2;
                    if (a != null) {
                        i4 = a.b();
                    } else {
                        i4 = 0;
                    }
                    notification$Action$Builder = new Notification$Action$Builder(i4, next.j, next.k);
                }
                tk0[] tk0VarArr = next.c;
                if (tk0VarArr != null) {
                    int length = tk0VarArr.length;
                    RemoteInput[] remoteInputArr = new RemoteInput[length];
                    if (tk0VarArr.length <= 0) {
                        for (int i9 = 0; i9 < length; i9++) {
                            notification$Action$Builder.addRemoteInput(remoteInputArr[i9]);
                        }
                    } else {
                        tk0 tk0Var = tk0VarArr[0];
                        throw null;
                    }
                }
                if (next.a != null) {
                    bundle2 = new Bundle(next.a);
                } else {
                    bundle2 = new Bundle();
                }
                bundle2.putBoolean("android.support.allowGeneratedReplies", next.e);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 24) {
                    notification$Action$Builder.setAllowGeneratedReplies(next.e);
                }
                bundle2.putInt("android.support.action.semanticAction", next.g);
                if (i10 >= 28) {
                    ca0.b(notification$Action$Builder, next.g);
                }
                if (i10 >= 29) {
                    da0.a(notification$Action$Builder, next.h);
                }
                bundle2.putBoolean("android.support.action.showsUserInterface", next.f);
                notification$Action$Builder.addExtras(bundle2);
                this.a.addAction(notification$Action$Builder.build());
            } else {
                it = it2;
                ArrayList arrayList = this.c;
                Notification.Builder builder2 = this.a;
                Object obj = fa0.a;
                IconCompat a2 = next.a();
                if (a2 != null) {
                    i3 = a2.b();
                } else {
                    i3 = 0;
                }
                builder2.addAction(i3, next.j, next.k);
                Bundle bundle3 = new Bundle(next.a);
                tk0[] tk0VarArr2 = next.c;
                if (tk0VarArr2 != null) {
                    bundle3.putParcelableArray("android.support.remoteInputs", fa0.a(tk0VarArr2));
                }
                tk0[] tk0VarArr3 = next.d;
                if (tk0VarArr3 != null) {
                    bundle3.putParcelableArray("android.support.dataRemoteInputs", fa0.a(tk0VarArr3));
                }
                bundle3.putBoolean("android.support.allowGeneratedReplies", next.e);
                arrayList.add(bundle3);
            }
            i6 = 26;
            it2 = it;
        }
        Bundle bundle4 = y90Var.l;
        if (bundle4 != null) {
            this.d.putAll(bundle4);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 20 && y90Var.k) {
            this.d.putBoolean("android.support.localOnly", true);
        }
        this.a.setShowWhen(y90Var.i);
        if (i11 < 21 && (b = b(c(y90Var.c), y90Var.p)) != null) {
            ArrayList arrayList2 = (ArrayList) b;
            if (!arrayList2.isEmpty()) {
                this.d.putStringArray("android.people", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }
        if (i11 >= 20) {
            r5 = 0;
            i = 0;
            this.a.setLocalOnly(y90Var.k).setGroup(null).setGroupSummary(false).setSortKey(null);
        } else {
            r5 = 0;
            i = 0;
        }
        if (i11 >= 21) {
            this.a.setCategory(r5).setColor(i).setVisibility(i).setPublicVersion(r5).setSound(notification.sound, notification.audioAttributes);
            if (i11 < 28) {
                list = b(c(y90Var.c), y90Var.p);
            } else {
                list = y90Var.p;
            }
            if (list != null && !list.isEmpty()) {
                for (String str2 : list) {
                    this.a.addPerson(str2);
                }
            }
            if (y90Var.d.size() > 0) {
                if (y90Var.l == null) {
                    y90Var.l = new Bundle();
                }
                Bundle bundle5 = y90Var.l.getBundle("android.car.EXTENSIONS");
                bundle5 = bundle5 == null ? new Bundle() : bundle5;
                Bundle bundle6 = new Bundle(bundle5);
                Bundle bundle7 = new Bundle();
                for (int i12 = 0; i12 < y90Var.d.size(); i12++) {
                    String num = Integer.toString(i12);
                    w90 w90Var = y90Var.d.get(i12);
                    Object obj2 = fa0.a;
                    Bundle bundle8 = new Bundle();
                    IconCompat a3 = w90Var.a();
                    if (a3 != null) {
                        i2 = a3.b();
                    } else {
                        i2 = 0;
                    }
                    bundle8.putInt("icon", i2);
                    bundle8.putCharSequence("title", w90Var.j);
                    bundle8.putParcelable("actionIntent", w90Var.k);
                    if (w90Var.a != null) {
                        bundle = new Bundle(w90Var.a);
                    } else {
                        bundle = new Bundle();
                    }
                    bundle.putBoolean("android.support.allowGeneratedReplies", w90Var.e);
                    bundle8.putBundle("extras", bundle);
                    bundle8.putParcelableArray("remoteInputs", fa0.a(w90Var.c));
                    bundle8.putBoolean("showsUserInterface", w90Var.f);
                    bundle8.putInt("semanticAction", w90Var.g);
                    bundle7.putBundle(num, bundle8);
                }
                bundle5.putBundle("invisible_actions", bundle7);
                bundle6.putBundle("invisible_actions", bundle7);
                if (y90Var.l == null) {
                    y90Var.l = new Bundle();
                }
                y90Var.l.putBundle("android.car.EXTENSIONS", bundle5);
                this.d.putBundle("android.car.EXTENSIONS", bundle6);
            }
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 24) {
            r4 = 0;
            this.a.setExtras(y90Var.l).setRemoteInputHistory(null);
        } else {
            r4 = 0;
        }
        if (i13 >= 26) {
            this.a.setBadgeIconType(0).setSettingsText(r4).setShortcutId(r4).setTimeoutAfter(0L).setGroupAlertBehavior(0);
            if (!TextUtils.isEmpty(y90Var.m)) {
                this.a.setSound(r4).setDefaults(0).setLights(0, 0, 0).setVibrate(r4);
            }
        }
        if (i13 >= 28) {
            Iterator<he0> it3 = y90Var.c.iterator();
            while (it3.hasNext()) {
                Notification.Builder builder3 = this.a;
                it3.next().getClass();
                uw.b(builder3, he0.a());
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            aa0.a(this.a, y90Var.n);
            ba0.a(this.a);
        }
    }

    public static List b(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList == null) {
            return arrayList2;
        }
        if (arrayList2 == null) {
            return arrayList;
        }
        g7 g7Var = new g7(arrayList2.size() + arrayList.size());
        g7Var.addAll(arrayList);
        g7Var.addAll(arrayList2);
        return new ArrayList(g7Var);
    }

    public static ArrayList c(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((he0) it.next()).getClass();
            arrayList2.add("");
        }
        return arrayList2;
    }

    public final Notification a() {
        Bundle bundle;
        z90 z90Var = this.b.j;
        SparseArray<? extends Parcelable> sparseArray = null;
        if (z90Var != null) {
            new Notification.BigTextStyle(this.a).setBigContentTitle(null).bigText(((x90) z90Var).b);
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 26 && i < 24) {
            if (i < 21 && i < 20) {
                ArrayList arrayList = this.c;
                Object obj = fa0.a;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Bundle bundle2 = (Bundle) arrayList.get(i2);
                    if (bundle2 != null) {
                        if (sparseArray == null) {
                            sparseArray = new SparseArray<>();
                        }
                        sparseArray.put(i2, bundle2);
                    }
                }
                if (sparseArray != null) {
                    this.d.putSparseParcelableArray("android.support.actionExtras", sparseArray);
                }
            }
            this.a.setExtras(this.d);
        }
        Notification build = this.a.build();
        this.b.getClass();
        if (i >= 21 && z90Var != null) {
            this.b.j.getClass();
        }
        if (z90Var != null && (bundle = build.extras) != null) {
            x90 x90Var = (x90) z90Var;
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
            if (i < 21) {
                bundle.putCharSequence("android.bigText", x90Var.b);
            }
        }
        return build;
    }
}