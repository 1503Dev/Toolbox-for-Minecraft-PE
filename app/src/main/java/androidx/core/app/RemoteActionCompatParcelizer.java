package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(m31 m31Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.a;
        if (m31Var.i(1)) {
            obj = m31Var.m();
        }
        remoteActionCompat.a = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.b;
        if (m31Var.i(2)) {
            charSequence = m31Var.h();
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (m31Var.i(3)) {
            charSequence2 = m31Var.h();
        }
        remoteActionCompat.c = charSequence2;
        Parcelable parcelable = remoteActionCompat.d;
        if (m31Var.i(4)) {
            parcelable = m31Var.k();
        }
        remoteActionCompat.d = (PendingIntent) parcelable;
        remoteActionCompat.e = m31Var.f(5, remoteActionCompat.e);
        remoteActionCompat.f = m31Var.f(6, remoteActionCompat.f);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, m31 m31Var) {
        m31Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        m31Var.n(1);
        m31Var.u(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        m31Var.n(2);
        m31Var.q(charSequence);
        CharSequence charSequence2 = remoteActionCompat.c;
        m31Var.n(3);
        m31Var.q(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.d;
        m31Var.n(4);
        m31Var.s(pendingIntent);
        boolean z = remoteActionCompat.e;
        m31Var.n(5);
        m31Var.o(z);
        boolean z2 = remoteActionCompat.f;
        m31Var.n(6);
        m31Var.o(z2);
    }
}