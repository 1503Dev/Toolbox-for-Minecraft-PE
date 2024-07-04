package defpackage;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.HashMap;

/* renamed from: u61  reason: default package */
public final class u61 {
    public static final String a = y20.e("WrkDbPathHelper");
    public static final String[] b = {"-journal", "-shm", "-wal"};

    public static void a(Context context) {
        String format;
        File file;
        String[] strArr;
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 && databasePath.exists()) {
            y20.c().a(a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            HashMap hashMap = new HashMap();
            if (i >= 23) {
                File databasePath2 = context.getDatabasePath("androidx.work.workdb");
                if (i < 23) {
                    file = context.getDatabasePath("androidx.work.workdb");
                } else {
                    file = new File(dg.b(context), "androidx.work.workdb");
                }
                hashMap.put(databasePath2, file);
                for (String str : b) {
                    hashMap.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
                }
            }
            for (File file2 : hashMap.keySet()) {
                File file3 = (File) hashMap.get(file2);
                if (file2.exists() && file3 != null) {
                    if (file3.exists()) {
                        y20.c().f(a, String.format("Over-writing contents of %s", file3), new Throwable[0]);
                    }
                    if (file2.renameTo(file3)) {
                        format = String.format("Migrated %s to %s", file2, file3);
                    } else {
                        format = String.format("Renaming %s to %s failed", file2, file3);
                    }
                    y20.c().a(a, format, new Throwable[0]);
                }
            }
        }
    }
}