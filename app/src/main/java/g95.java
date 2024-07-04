package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* renamed from: g95  reason: default package */
public class g95 extends bw4 {
    public final int Q;

    public g95() {
        super(b(2008, 1));
        this.Q = 1;
    }

    public g95(IOException iOException, int i, int i2) {
        super(b(i, i2), iOException);
        this.Q = i2;
    }

    public g95(String str, int i, int i2) {
        super(str, b(i, i2));
        this.Q = i2;
    }

    public g95(String str, IOException iOException, int i, int i2) {
        super(b(i, i2), str, iOException);
        this.Q = i2;
    }

    public static g95 a(IOException iOException, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !q05.c(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new o85(iOException) : new g95(iOException, i2, i);
    }

    public static int b(int i, int i2) {
        if (i == 2000) {
            if (i2 != 1) {
                return RecyclerView.MAX_SCROLL_DURATION;
            }
            return 2001;
        }
        return i;
    }
}