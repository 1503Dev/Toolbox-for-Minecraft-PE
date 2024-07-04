package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* renamed from: qb0  reason: default package */
public final class qb0 extends t7 {
    public final /* synthetic */ Socket k;

    public qb0(Socket socket) {
        this.k = socket;
    }

    @Override // defpackage.t7
    public final IOException n(@Nullable IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // defpackage.t7
    public final void o() {
        Logger logger;
        Level level;
        StringBuilder sb;
        boolean z;
        try {
            this.k.close();
        } catch (AssertionError e) {
            e = e;
            if (e.getCause() != null && e.getMessage() != null && e.getMessage().contains("getsockname failed")) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                logger = rb0.a;
                level = Level.WARNING;
                sb = new StringBuilder();
                sb.append("Failed to close timed out socket ");
                sb.append(this.k);
                logger.log(level, sb.toString(), e);
            }
            throw e;
        } catch (Exception e2) {
            e = e2;
            logger = rb0.a;
            level = Level.WARNING;
            sb = new StringBuilder();
            sb.append("Failed to close timed out socket ");
            sb.append(this.k);
            logger.log(level, sb.toString(), e);
        }
    }
}