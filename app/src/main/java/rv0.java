package defpackage;

import android.database.Cursor;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: rv0  reason: default package */
public final class rv0 {
    public final String a;
    public final Map<String, a> b;
    public final Set<b> c;
    public final Set<d> d;

    /* renamed from: rv0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public final String a;
        public final String b;
        public final int c;
        public final boolean d;
        public final int e;
        public final String f;
        public final int g;

        public a(int i, int i2, String str, String str2, String str3, boolean z) {
            this.a = str;
            this.b = str2;
            this.d = z;
            this.e = i;
            int i3 = 5;
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    i3 = 3;
                } else if (!upperCase.contains("CHAR") && !upperCase.contains("CLOB") && !upperCase.contains("TEXT")) {
                    if (!upperCase.contains("BLOB")) {
                        i3 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                    }
                } else {
                    i3 = 2;
                }
            }
            this.c = i3;
            this.f = str3;
            this.g = i2;
        }

        public final boolean equals(Object obj) {
            boolean z;
            boolean z2;
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (Build.VERSION.SDK_INT >= 20) {
                if (this.e != aVar.e) {
                    return false;
                }
            } else {
                if (this.e > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (aVar.e > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z != z2) {
                    return false;
                }
            }
            if (!this.a.equals(aVar.a) || this.d != aVar.d) {
                return false;
            }
            if (this.g == 1 && aVar.g == 2 && (str3 = this.f) != null && !str3.equals(aVar.f)) {
                return false;
            }
            if (this.g == 2 && aVar.g == 1 && (str2 = aVar.f) != null && !str2.equals(this.f)) {
                return false;
            }
            int i = this.g;
            if ((i == 0 || i != aVar.g || ((str = this.f) == null ? aVar.f == null : str.equals(aVar.f))) && this.c == aVar.c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (((((this.a.hashCode() * 31) + this.c) * 31) + (this.d ? 1231 : 1237)) * 31) + this.e;
        }

        public final String toString() {
            StringBuilder b = e5.b("Column{name='");
            b.append(this.a);
            b.append('\'');
            b.append(", type='");
            b.append(this.b);
            b.append('\'');
            b.append(", affinity='");
            b.append(this.c);
            b.append('\'');
            b.append(", notNull=");
            b.append(this.d);
            b.append(", primaryKeyPosition=");
            b.append(this.e);
            b.append(", defaultValue='");
            b.append(this.f);
            b.append('\'');
            b.append('}');
            return b.toString();
        }
    }

    /* renamed from: rv0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b {
        public final String a;
        public final String b;
        public final String c;
        public final List<String> d;
        public final List<String> e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = Collections.unmodifiableList(list);
            this.e = Collections.unmodifiableList(list2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c) && this.d.equals(bVar.d)) {
                return this.e.equals(bVar.e);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode();
            int hashCode2 = this.c.hashCode();
            int hashCode3 = this.d.hashCode();
            return this.e.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder b = e5.b("ForeignKey{referenceTable='");
            b.append(this.a);
            b.append('\'');
            b.append(", onDelete='");
            b.append(this.b);
            b.append('\'');
            b.append(", onUpdate='");
            b.append(this.c);
            b.append('\'');
            b.append(", columnNames=");
            b.append(this.d);
            b.append(", referenceColumnNames=");
            b.append(this.e);
            b.append('}');
            return b.toString();
        }
    }

    /* renamed from: rv0$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class c implements Comparable<c> {
        public final int P;
        public final int Q;
        public final String R;
        public final String S;

        public c(int i, String str, int i2, String str2) {
            this.P = i;
            this.Q = i2;
            this.R = str;
            this.S = str2;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            c cVar2 = cVar;
            int i = this.P - cVar2.P;
            return i == 0 ? this.Q - cVar2.Q : i;
        }
    }

    /* renamed from: rv0$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class d {
        public final String a;
        public final boolean b;
        public final List<String> c;

        public d(String str, List list, boolean z) {
            this.a = str;
            this.b = z;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.b == dVar.b && this.c.equals(dVar.c)) {
                return this.a.startsWith("index_") ? dVar.a.startsWith("index_") : this.a.equals(dVar.a);
            }
            return false;
        }

        public final int hashCode() {
            return this.c.hashCode() + ((((this.a.startsWith("index_") ? -1184239155 : this.a.hashCode()) * 31) + (this.b ? 1 : 0)) * 31);
        }

        public final String toString() {
            StringBuilder b = e5.b("Index{name='");
            b.append(this.a);
            b.append('\'');
            b.append(", unique=");
            b.append(this.b);
            b.append(", columns=");
            b.append(this.c);
            b.append('}');
            return b.toString();
        }
    }

    public rv0(String str, HashMap hashMap, HashSet hashSet, HashSet hashSet2) {
        this.a = str;
        this.b = Collections.unmodifiableMap(hashMap);
        this.c = Collections.unmodifiableSet(hashSet);
        this.d = hashSet2 == null ? null : Collections.unmodifiableSet(hashSet2);
    }

    public static rv0 a(es esVar, String str) {
        boolean z;
        int i;
        int i2;
        ArrayList arrayList;
        int i3;
        boolean z2;
        Cursor E = esVar.E("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (E.getColumnCount() > 0) {
                int columnIndex = E.getColumnIndex("name");
                int columnIndex2 = E.getColumnIndex("type");
                int columnIndex3 = E.getColumnIndex("notnull");
                int columnIndex4 = E.getColumnIndex("pk");
                int columnIndex5 = E.getColumnIndex("dflt_value");
                while (E.moveToNext()) {
                    String string = E.getString(columnIndex);
                    String string2 = E.getString(columnIndex2);
                    if (E.getInt(columnIndex3) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    hashMap.put(string, new a(E.getInt(columnIndex4), 2, string, string2, E.getString(columnIndex5), z2));
                }
            }
            E.close();
            HashSet hashSet = new HashSet();
            E = esVar.E("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = E.getColumnIndex("id");
                int columnIndex7 = E.getColumnIndex("seq");
                int columnIndex8 = E.getColumnIndex("table");
                int columnIndex9 = E.getColumnIndex("on_delete");
                int columnIndex10 = E.getColumnIndex("on_update");
                ArrayList b2 = b(E);
                int count = E.getCount();
                int i4 = 0;
                while (i4 < count) {
                    E.moveToPosition(i4);
                    if (E.getInt(columnIndex7) != 0) {
                        i = columnIndex6;
                        i2 = columnIndex7;
                        arrayList = b2;
                        i3 = count;
                    } else {
                        int i5 = E.getInt(columnIndex6);
                        i = columnIndex6;
                        ArrayList arrayList2 = new ArrayList();
                        i2 = columnIndex7;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = b2.iterator();
                        while (it.hasNext()) {
                            ArrayList arrayList4 = b2;
                            c cVar = (c) it.next();
                            int i6 = count;
                            if (cVar.P == i5) {
                                arrayList2.add(cVar.R);
                                arrayList3.add(cVar.S);
                            }
                            b2 = arrayList4;
                            count = i6;
                        }
                        arrayList = b2;
                        i3 = count;
                        hashSet.add(new b(E.getString(columnIndex8), E.getString(columnIndex9), E.getString(columnIndex10), arrayList2, arrayList3));
                    }
                    i4++;
                    columnIndex6 = i;
                    columnIndex7 = i2;
                    b2 = arrayList;
                    count = i3;
                }
                E.close();
                E = esVar.E("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = E.getColumnIndex("name");
                    int columnIndex12 = E.getColumnIndex("origin");
                    int columnIndex13 = E.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                        HashSet hashSet3 = new HashSet();
                        while (E.moveToNext()) {
                            if ("c".equals(E.getString(columnIndex12))) {
                                String string3 = E.getString(columnIndex11);
                                if (E.getInt(columnIndex13) == 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                d c2 = c(esVar, string3, z);
                                if (c2 != null) {
                                    hashSet3.add(c2);
                                }
                            }
                        }
                        E.close();
                        hashSet2 = hashSet3;
                        return new rv0(str, hashMap, hashSet, hashSet2);
                    }
                    return new rv0(str, hashMap, hashSet, hashSet2);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static ArrayList b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getString(columnIndex3), cursor.getInt(columnIndex2), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static d c(es esVar, String str, boolean z) {
        Cursor E = esVar.E("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = E.getColumnIndex("seqno");
            int columnIndex2 = E.getColumnIndex("cid");
            int columnIndex3 = E.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (E.moveToNext()) {
                    if (E.getInt(columnIndex2) >= 0) {
                        int i = E.getInt(columnIndex);
                        treeMap.put(Integer.valueOf(i), E.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new d(str, arrayList, z);
            }
            return null;
        } finally {
            E.close();
        }
    }

    public final boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || rv0.class != obj.getClass()) {
            return false;
        }
        rv0 rv0Var = (rv0) obj;
        String str = this.a;
        if (str == null ? rv0Var.a == null : str.equals(rv0Var.a)) {
            Map<String, a> map = this.b;
            if (map == null ? rv0Var.b == null : map.equals(rv0Var.b)) {
                Set<b> set2 = this.c;
                if (set2 == null ? rv0Var.c == null : set2.equals(rv0Var.c)) {
                    Set<d> set3 = this.d;
                    if (set3 == null || (set = rv0Var.d) == null) {
                        return true;
                    }
                    return set3.equals(set);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.c;
        return hashCode2 + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder b2 = e5.b("TableInfo{name='");
        b2.append(this.a);
        b2.append('\'');
        b2.append(", columns=");
        b2.append(this.b);
        b2.append(", foreignKeys=");
        b2.append(this.c);
        b2.append(", indices=");
        b2.append(this.d);
        b2.append('}');
        return b2.toString();
    }
}