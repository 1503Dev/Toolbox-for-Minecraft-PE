package defpackage;

import android.util.Base64OutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* renamed from: n32  reason: default package */
public final class n32 {
    public final int a;
    public final p32 b = new p32();

    public n32(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final String a(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        ?? r3 = 0;
        for (int i = 0; i < size; i++) {
            sb.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        m32 m32Var = new m32();
        PriorityQueue priorityQueue = new PriorityQueue(this.a, new uv1(0));
        int i2 = 0;
        while (i2 < split.length) {
            String[] b = o32.b(split[i2], r3);
            if (b.length != 0) {
                int i3 = this.a;
                int length = b.length;
                if (length < 6) {
                    v32.t(i3, v32.u(b, length), v32.o(b, r3, length), length, priorityQueue);
                } else {
                    long u = v32.u(b, 6);
                    v32.t(i3, u, v32.o(b, r3, 6), 6, priorityQueue);
                    long j = u;
                    int i4 = 1;
                    while (true) {
                        int length2 = b.length;
                        if (i4 < length2 - 5) {
                            int i5 = i4;
                            String o = v32.o(b, i5, 6);
                            long a = (o32.a(b[i4 + 5]) + 2147483647L) % 1073807359;
                            long a2 = (a + (((((j + 1073807359) - ((((o32.a(b[i4 - 1]) + 2147483647L) % 1073807359) * v32.l(16785407L, 5)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
                            v32.t(i3, a2, o, length2, priorityQueue);
                            j = a2;
                            i4 = i5 + 1;
                        }
                    }
                }
            }
            i2++;
            r3 = 0;
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                ((Base64OutputStream) m32Var.R).write(this.b.b(((u32) it.next()).b));
            } catch (IOException e) {
                sv2.e("Error while writing hash to byteStream", e);
            }
        }
        return m32Var.toString();
    }
}