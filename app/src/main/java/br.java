package defpackage;

import android.app.Notification;

/* renamed from: br  reason: default package */
public final class br {
    public final int a;
    public final int b;
    public final Notification c;

    public br(int i, int i2, Notification notification) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || br.class != obj.getClass()) {
            return false;
        }
        br brVar = (br) obj;
        if (this.a == brVar.a && this.b == brVar.b) {
            return this.c.equals(brVar.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}