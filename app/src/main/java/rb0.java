package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* renamed from: rb0  reason: default package */
public final class rb0 {
    public static final Logger a = Logger.getLogger(rb0.class.getName());

    public static r7 a(Socket socket) {
        if (socket != null) {
            if (socket.getOutputStream() != null) {
                qb0 qb0Var = new qb0(socket);
                OutputStream outputStream = socket.getOutputStream();
                if (outputStream != null) {
                    return new r7(qb0Var, new ob0(outputStream, qb0Var));
                }
                throw new IllegalArgumentException("out == null");
            }
            throw new IOException("socket's output stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    public static s7 b(Socket socket) {
        if (socket != null) {
            if (socket.getInputStream() != null) {
                qb0 qb0Var = new qb0(socket);
                InputStream inputStream = socket.getInputStream();
                if (inputStream != null) {
                    return new s7(qb0Var, new pb0(inputStream, qb0Var));
                }
                throw new IllegalArgumentException("in == null");
            }
            throw new IOException("socket's input stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }
}