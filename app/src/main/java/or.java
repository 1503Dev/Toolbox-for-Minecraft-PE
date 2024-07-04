package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.f;
import java.io.PrintWriter;

/* renamed from: or  reason: default package */
public abstract class or<E> extends z9 {
    public final Activity P;
    public final Context Q;
    public final Handler R;
    public final f S;

    public or(FragmentActivity fragmentActivity) {
        Handler handler = new Handler();
        this.S = new f();
        this.P = fragmentActivity;
        if (fragmentActivity != null) {
            this.Q = fragmentActivity;
            this.R = handler;
            return;
        }
        throw new NullPointerException("context == null");
    }

    public abstract void h();

    public abstract void j(PrintWriter printWriter, String[] strArr);

    public abstract FragmentActivity l();

    public abstract LayoutInflater m();

    public abstract void n();

    public abstract boolean o();

    public abstract boolean p();

    public abstract void q();
}