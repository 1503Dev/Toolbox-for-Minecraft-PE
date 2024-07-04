package defpackage;

import android.app.Activity;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/* renamed from: v20  reason: default package */
public final class v20 extends PopupWindow {
    public static final Pattern i = Pattern.compile("\u001b\\[([0-9;]+)m");
    public final Activity a;
    public final xa0 b;
    public final TextView c;
    public CharSequence d;
    public int e;
    public Process f;
    public BufferedReader g;
    public boolean h;

    public v20(Activity activity) {
        super(-1, -1);
        this.b = new xa0(new s20(0, this), new t20(0, this));
        this.d = "";
        this.e = 10;
        this.h = false;
        setFocusable(false);
        setTouchable(false);
        this.a = activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        this.c = textView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        frameLayout.addView(textView, layoutParams);
        textView.setGravity(80);
        textView.setBackgroundColor(536870912);
        setContentView(frameLayout);
    }

    public final void a() {
        if (this.f != null) {
            return;
        }
        this.h = true;
        try {
            final Process exec = Runtime.getRuntime().exec("logcat -b all -v color");
            this.f = exec;
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f.getInputStream()));
            this.g = bufferedReader;
            new Thread(new Runnable() { // from class: u20
                @Override // java.lang.Runnable
                public final void run() {
                    v20 v20Var = v20.this;
                    BufferedReader bufferedReader2 = bufferedReader;
                    Process process = exec;
                    v20Var.getClass();
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            h21.a(new my(1, v20Var, readLine));
                        } catch (IOException e) {
                            h21.a(new my(1, v20Var, e.toString()));
                        }
                    }
                    bufferedReader2.close();
                    h21.a(new my(1, v20Var, "-- logcat died --"));
                    h21.a(new lx(1, v20Var, process));
                }
            }).start();
        } catch (IOException e) {
            h21.a(new my(1, this, e.toString()));
        }
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        Process process = this.f;
        if (process == null) {
            return;
        }
        this.h = false;
        if (Build.VERSION.SDK_INT >= 26) {
            process.destroyForcibly();
        } else {
            process.destroy();
        }
        try {
            this.g.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.f = null;
        this.g = null;
    }
}