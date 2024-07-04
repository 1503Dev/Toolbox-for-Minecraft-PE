package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: j4  reason: default package */
public final class j4 {
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Interpolator a(Context context, XmlResourceParser xmlResourceParser) {
        Interpolator accelerateInterpolator;
        int depth = xmlResourceParser.getDepth();
        Interpolator interpolator = null;
        while (true) {
            int next = xmlResourceParser.next();
            if ((next != 3 || xmlResourceParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                    String name = xmlResourceParser.getName();
                    if (name.equals("linearInterpolator")) {
                        interpolator = new LinearInterpolator();
                    } else {
                        if (name.equals("accelerateInterpolator")) {
                            accelerateInterpolator = new AccelerateInterpolator(context, asAttributeSet);
                        } else if (name.equals("decelerateInterpolator")) {
                            accelerateInterpolator = new DecelerateInterpolator(context, asAttributeSet);
                        } else if (name.equals("accelerateDecelerateInterpolator")) {
                            interpolator = new AccelerateDecelerateInterpolator();
                        } else if (name.equals("cycleInterpolator")) {
                            accelerateInterpolator = new CycleInterpolator(context, asAttributeSet);
                        } else if (name.equals("anticipateInterpolator")) {
                            accelerateInterpolator = new AnticipateInterpolator(context, asAttributeSet);
                        } else if (name.equals("overshootInterpolator")) {
                            accelerateInterpolator = new OvershootInterpolator(context, asAttributeSet);
                        } else if (name.equals("anticipateOvershootInterpolator")) {
                            accelerateInterpolator = new AnticipateOvershootInterpolator(context, asAttributeSet);
                        } else if (name.equals("bounceInterpolator")) {
                            interpolator = new BounceInterpolator();
                        } else if (name.equals("pathInterpolator")) {
                            accelerateInterpolator = new ce0(context, asAttributeSet, xmlResourceParser);
                        } else {
                            StringBuilder b = e5.b("Unknown interpolator name: ");
                            b.append(xmlResourceParser.getName());
                            throw new RuntimeException(b.toString());
                        }
                        interpolator = accelerateInterpolator;
                    }
                }
            }
        }
    }

    public static Interpolator b(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return AnimationUtils.loadInterpolator(context, i);
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                if (i == 17563663) {
                    return new tp();
                }
                if (i == 17563661) {
                    return new up();
                }
                if (i == 17563662) {
                    return new g10();
                }
                XmlResourceParser animation = context.getResources().getAnimation(i);
                context.getResources();
                context.getTheme();
                Interpolator a = a(context, animation);
                animation.close();
                return a;
            } catch (IOException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException.initCause(e);
                throw notFoundException;
            } catch (XmlPullParserException e2) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException2.initCause(e2);
                throw notFoundException2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}