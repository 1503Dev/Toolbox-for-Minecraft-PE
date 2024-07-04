package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: o41  reason: default package */
public final class o41 {
    public final HashMap<String, m41> a = new HashMap<>();

    public final void a() {
        for (m41 m41Var : this.a.values()) {
            HashMap hashMap = m41Var.a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    for (Object obj : m41Var.a.values()) {
                        if (obj instanceof Closeable) {
                            try {
                                ((Closeable) obj).close();
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
            }
            m41Var.a();
        }
        this.a.clear();
    }
}