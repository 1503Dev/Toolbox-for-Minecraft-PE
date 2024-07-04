package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: xd1  reason: default package */
public final class xd1 {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();

    /* renamed from: xd1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public final int a;
        public final String b;
        public final int c;

        public a(int i, String str, int i2) {
            this.a = i;
            this.b = str;
            this.c = i2;
        }
    }

    public static void b(xd1 xd1Var, Cursor cursor) {
        ContentValues contentValues = new ContentValues();
        Iterator it = xd1Var.a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            int i = aVar.c;
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        contentValues.put(aVar.b, cursor.getString(aVar.a));
                    } else {
                        contentValues.put(aVar.b, cursor.getBlob(aVar.a));
                    }
                } else {
                    contentValues.put(aVar.b, Double.valueOf(cursor.getDouble(aVar.a)));
                }
            } else {
                contentValues.put(aVar.b, Long.valueOf(cursor.getLong(aVar.a)));
            }
        }
        xd1Var.b.add(contentValues);
    }

    public final String a(int i) {
        if (i < 0 || i >= this.a.size()) {
            return null;
        }
        return ((a) this.a.get(i)).b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            String str2 = "\n";
            if (i >= this.a.size()) {
                break;
            }
            sb.append(((a) this.a.get(i)).b);
            if (i != this.a.size() - 1) {
                str2 = " | ";
            }
            sb.append(str2);
            i++;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ContentValues contentValues = (ContentValues) it.next();
            for (int i2 = 0; i2 < this.a.size(); i2++) {
                sb.append(contentValues.getAsString(a(i2)));
                if (i2 == this.a.size() - 1) {
                    str = "\n";
                } else {
                    str = " | ";
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }
}