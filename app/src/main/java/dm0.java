package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import defpackage.bm0;
import defpackage.wu0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: dm0  reason: default package */
public final class dm0 extends wu0.a {
    public pj b;
    public final a c;

    /* renamed from: dm0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class a {
        public final int a = 12;

        public abstract void a(es esVar);

        public abstract b b(es esVar);
    }

    /* renamed from: dm0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b {
        public final boolean a;
        public final String b;

        public b(String str, boolean z) {
            this.a = z;
            this.b = str;
        }
    }

    public dm0(pj pjVar, WorkDatabase_Impl.a aVar) {
        super(aVar.a);
        this.b = pjVar;
        this.c = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x007a, code lost:
        r0 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0076 A[EDGE_INSN: B:91:0x0076->B:37:0x0076 ?: BREAK  , SYNTHETIC] */
    @Override // defpackage.wu0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(es esVar, int i, int i2) {
        boolean z;
        List<f60> list;
        TreeMap<Integer, f60> treeMap;
        Set<Integer> keySet;
        int i3;
        boolean z2;
        boolean z3;
        pj pjVar = this.b;
        boolean z4 = true;
        if (pjVar != null) {
            bm0.c cVar = pjVar.d;
            cVar.getClass();
            if (i == i2) {
                list = Collections.emptyList();
            } else {
                if (i2 > i) {
                    z = true;
                } else {
                    z = false;
                }
                ArrayList arrayList = new ArrayList();
                int i4 = i;
                while (true) {
                    if (z) {
                        if (i4 >= i2) {
                            break;
                        }
                        treeMap = cVar.a.get(Integer.valueOf(i4));
                        if (treeMap == null) {
                            break;
                        }
                        if (z) {
                            keySet = treeMap.descendingKeySet();
                        } else {
                            keySet = treeMap.keySet();
                        }
                        Iterator<Integer> it = keySet.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                i3 = it.next().intValue();
                                if (!z ? !(i3 < i2 || i3 >= i4) : !(i3 > i2 || i3 <= i4)) {
                                    z3 = true;
                                    continue;
                                } else {
                                    z3 = false;
                                    continue;
                                }
                                if (z3) {
                                    arrayList.add(treeMap.get(Integer.valueOf(i3)));
                                    z2 = true;
                                    break;
                                }
                            } else {
                                i3 = i4;
                                z2 = false;
                                break;
                            }
                        }
                        if (!z2) {
                            break;
                        }
                        i4 = i3;
                    } else {
                        if (i4 <= i2) {
                            break;
                        }
                        treeMap = cVar.a.get(Integer.valueOf(i4));
                        if (treeMap == null) {
                        }
                    }
                }
                list = null;
            }
            if (list != null) {
                ((WorkDatabase_Impl.a) this.c).getClass();
                ArrayList arrayList2 = new ArrayList();
                Cursor E = esVar.E("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (E.moveToNext()) {
                    try {
                        arrayList2.add(E.getString(0));
                    } catch (Throwable th) {
                        E.close();
                        throw th;
                    }
                }
                E.close();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    if (str.startsWith("room_fts_content_sync_")) {
                        esVar.g("DROP TRIGGER IF EXISTS " + str);
                    }
                }
                for (f60 f60Var : list) {
                    f60Var.a(esVar);
                }
                b b2 = this.c.b(esVar);
                if (b2.a) {
                    this.c.getClass();
                    c(esVar);
                    if (z4) {
                        pj pjVar2 = this.b;
                        if (pjVar2 != null && !pjVar2.a(i, i2)) {
                            WorkDatabase_Impl.a aVar = (WorkDatabase_Impl.a) this.c;
                            aVar.getClass();
                            esVar.g("DROP TABLE IF EXISTS `Dependency`");
                            esVar.g("DROP TABLE IF EXISTS `WorkSpec`");
                            esVar.g("DROP TABLE IF EXISTS `WorkTag`");
                            esVar.g("DROP TABLE IF EXISTS `SystemIdInfo`");
                            esVar.g("DROP TABLE IF EXISTS `WorkName`");
                            esVar.g("DROP TABLE IF EXISTS `WorkProgress`");
                            esVar.g("DROP TABLE IF EXISTS `Preference`");
                            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
                            int i5 = WorkDatabase_Impl.s;
                            List<bm0.b> list2 = workDatabase_Impl.g;
                            if (list2 != null) {
                                int size = list2.size();
                                for (int i6 = 0; i6 < size; i6++) {
                                    WorkDatabase_Impl.this.g.get(i6).getClass();
                                }
                            }
                            this.c.a(esVar);
                            return;
                        }
                        throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
                    }
                    return;
                }
                StringBuilder b3 = e5.b("Migration didn't properly handle: ");
                b3.append(b2.b);
                throw new IllegalStateException(b3.toString());
            }
        }
        z4 = false;
        if (z4) {
        }
    }

    public final void c(es esVar) {
        esVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        esVar.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }
}