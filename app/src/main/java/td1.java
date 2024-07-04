package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import defpackage.ud1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: td1  reason: default package */
public final class td1 {
    public final SQLiteDatabase a;
    public final ud1 b;

    /* renamed from: td1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public final String a;
        public final String b;
        public final String c;

        public a(String[] strArr) {
            this.a = strArr[1];
            this.b = strArr[2];
            this.c = strArr[4];
        }
    }

    public td1(SQLiteDatabase sQLiteDatabase, ud1 ud1Var) {
        this.a = sQLiteDatabase;
        this.b = ud1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList<String> a() {
        int size;
        Cursor rawQuery = this.a.rawQuery("SELECT name FROM sqlite_master  WHERE type='table' ORDER BY name", null);
        ArrayList<String> arrayList = new ArrayList<>();
        if (rawQuery != null && rawQuery.moveToFirst()) {
            do {
                arrayList.add(rawQuery.getString(0));
            } while (rawQuery.moveToNext());
            rawQuery.close();
            while (size >= 0) {
            }
            return arrayList;
        }
        rawQuery.close();
        for (size = arrayList.size() - 1; size >= 0; size--) {
            String str = arrayList.get(size);
            if (str.startsWith("android_") || str.startsWith("sqlite_")) {
                arrayList.remove(size);
            }
        }
        return arrayList;
    }

    public final void b(ud1.c cVar, String str) {
        String join = TextUtils.join(", ", cVar.b);
        StringBuilder b = e5.b("CREATE INDEX ");
        b.append(cVar.a);
        b.append(" ON ");
        b.append(str);
        b.append("(");
        this.a.execSQL(qq.d(b, join, ")"));
    }

    public final void c(ud1.a aVar) {
        String obj;
        StringBuilder b = e5.b("CREATE TABLE ");
        b.append(aVar.b);
        b.append(" (");
        for (int i = 0; i < aVar.f.size(); i++) {
            ud1.b bVar = (ud1.b) aVar.f.get(i);
            b.append(bVar.a);
            b.append(" ");
            b.append(bVar.b);
            Object obj2 = bVar.c;
            if (obj2 != null) {
                if (obj2 instanceof Boolean) {
                    if (((Boolean) obj2).booleanValue()) {
                        obj = "1";
                    } else {
                        obj = "0";
                    }
                } else if (obj2 instanceof String) {
                    StringBuilder b2 = e5.b("'");
                    b2.append(bVar.c);
                    b2.append("'");
                    obj = b2.toString();
                } else {
                    obj = obj2.toString();
                }
                b.append(" DEFAULT ");
                b.append(obj);
            }
            if (i < aVar.f.size() - 1) {
                b.append(", ");
            }
        }
        b.append(")");
        this.a.execSQL(b.toString());
    }

    public final ArrayList<String[]> d(String str) {
        Cursor rawQuery = this.a.rawQuery(str, null);
        ArrayList<String[]> arrayList = new ArrayList<>();
        if (rawQuery == null || !rawQuery.moveToFirst()) {
            rawQuery.close();
            return arrayList;
        }
        do {
            int columnCount = rawQuery.getColumnCount();
            String[] strArr = new String[columnCount];
            for (int i = 0; i < columnCount; i++) {
                strArr[i] = rawQuery.getString(i);
            }
            arrayList.add(strArr);
        } while (rawQuery.moveToNext());
        rawQuery.close();
        return arrayList;
    }

    public final void e(ud1.a aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        a aVar2;
        String str = aVar.b;
        ArrayList arrayList = new ArrayList();
        Iterator<String[]> it = d("PRAGMA table_info(" + str + ")").iterator();
        while (it.hasNext()) {
            String[] next = it.next();
            if (next.length >= 5) {
                aVar2 = new a(next);
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                arrayList.add(aVar2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = aVar.f.iterator();
        boolean z4 = false;
        while (it2.hasNext()) {
            ud1.b bVar = (ud1.b) it2.next();
            int size = arrayList.size() - 1;
            while (true) {
                if (size >= 0) {
                    a aVar3 = (a) arrayList.get(size);
                    if (Objects.equals(aVar3.a, bVar.a)) {
                        arrayList2.add(bVar.a);
                        if (Objects.equals(aVar3.a, bVar.a) && Objects.equals(aVar3.b, bVar.b) && Objects.equals(aVar3.c, bVar.c)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        arrayList.remove(size);
                        z3 = true;
                    } else {
                        size--;
                    }
                } else {
                    z2 = false;
                    z3 = false;
                    break;
                }
            }
            if (!z3 || !z2) {
                z4 = true;
            }
        }
        if (arrayList.size() > 0) {
            z4 = true;
        }
        if (z4) {
            String str2 = aVar.b;
            this.a.execSQL("ALTER TABLE " + str2 + " RENAME TO manager_tmp_table");
            c(aVar);
            String str3 = aVar.b;
            String join = TextUtils.join(", ", arrayList2);
            SQLiteDatabase sQLiteDatabase = this.a;
            StringBuilder b = sd1.b("INSERT INTO ", str3, " (", join, ") SELECT ");
            b.append(join);
            b.append(" FROM ");
            b.append("manager_tmp_table");
            sQLiteDatabase.execSQL(b.toString());
            this.a.execSQL("DROP TABLE manager_tmp_table");
            Iterator it3 = aVar.g.iterator();
            while (it3.hasNext()) {
                b((ud1.c) it3.next(), aVar.b);
            }
            return;
        }
        ArrayList arrayList3 = aVar.g;
        ArrayList<String[]> d = d("PRAGMA index_list(" + aVar.b + ")");
        ArrayList arrayList4 = new ArrayList();
        Iterator<String[]> it4 = d.iterator();
        while (it4.hasNext()) {
            String[] next2 = it4.next();
            if (next2.length >= 3) {
                arrayList4.add(next2[1]);
            }
        }
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            ud1.c cVar = (ud1.c) it5.next();
            if (arrayList4.contains(cVar.a)) {
                String str4 = aVar.b;
                ArrayList<String[]> d2 = d("PRAGMA index_info(" + cVar.a + ")");
                if (cVar.b.length == d2.size()) {
                    int i = 0;
                    z = false;
                    while (true) {
                        String[] strArr = cVar.b;
                        if (i >= strArr.length) {
                            break;
                        }
                        if (!Objects.equals(strArr[i], d2.get(i)[2])) {
                            z = true;
                        }
                        i++;
                    }
                } else {
                    z = true;
                }
                if (z) {
                    String str5 = cVar.a;
                    this.a.execSQL("DROP INDEX " + str5);
                    b(cVar, str4);
                }
            } else {
                b(cVar, aVar.b);
            }
            arrayList4.remove(cVar.a);
        }
        Iterator it6 = arrayList4.iterator();
        while (it6.hasNext()) {
            this.a.execSQL("DROP INDEX " + ((String) it6.next()));
        }
    }
}