package defpackage;

import android.system.ErrnoException;
import android.system.OsConstants;

/* renamed from: d65  reason: default package */
public final class d65 {
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Throwable th) {
        return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
    }
}