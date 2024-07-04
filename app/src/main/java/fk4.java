package defpackage;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* renamed from: fk4  reason: default package */
public final class fk4 implements ek4 {
    public final Object[] a;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fk4(pn5 pn5Var, String str, int i, String str2, by5 by5Var) {
        String string;
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(pn5Var.Q));
        }
        if (!hashSet.contains("extras")) {
            string = hashSet.contains("npa") ? pn5Var.R.getString("npa") : string;
            if (hashSet.contains("gender")) {
                arrayList.add(Integer.valueOf(pn5Var.S));
            }
            if (hashSet.contains("keywords")) {
                List list = pn5Var.T;
                if (list != null) {
                    arrayList.add(list.toString());
                } else {
                    arrayList.add(null);
                }
            }
            if (hashSet.contains("isTestDevice")) {
                arrayList.add(Boolean.valueOf(pn5Var.U));
            }
            if (hashSet.contains("tagForChildDirectedTreatment")) {
                arrayList.add(Integer.valueOf(pn5Var.V));
            }
            if (hashSet.contains("manualImpressionsEnabled")) {
                arrayList.add(Boolean.valueOf(pn5Var.W));
            }
            if (hashSet.contains("publisherProvidedId")) {
                arrayList.add(pn5Var.X);
            }
            if (hashSet.contains("location")) {
                Location location = pn5Var.Z;
                if (location != null) {
                    arrayList.add(location.toString());
                } else {
                    arrayList.add(null);
                }
            }
            if (hashSet.contains("contentUrl")) {
                arrayList.add(pn5Var.a0);
            }
            if (hashSet.contains("networkExtras")) {
                arrayList.add(a(pn5Var.b0));
            }
            if (hashSet.contains("customTargeting")) {
                arrayList.add(a(pn5Var.c0));
            }
            if (hashSet.contains("categoryExclusions")) {
                List list2 = pn5Var.d0;
                if (list2 != null) {
                    arrayList.add(list2.toString());
                } else {
                    arrayList.add(null);
                }
            }
            if (hashSet.contains("requestAgent")) {
                arrayList.add(pn5Var.e0);
            }
            if (hashSet.contains("requestPackage")) {
                arrayList.add(pn5Var.f0);
            }
            if (hashSet.contains("isDesignedForFamilies")) {
                arrayList.add(Boolean.valueOf(pn5Var.g0));
            }
            if (hashSet.contains("tagForUnderAgeOfConsent")) {
                arrayList.add(Integer.valueOf(pn5Var.i0));
            }
            if (hashSet.contains("maxAdContentRating")) {
                arrayList.add(pn5Var.j0);
            }
            if (hashSet.contains("orientation")) {
                if (by5Var != null) {
                    arrayList.add(Integer.valueOf(by5Var.P));
                } else {
                    arrayList.add(null);
                }
            }
            this.a = arrayList.toArray();
        }
        a(pn5Var.R);
        arrayList.add(string);
        if (hashSet.contains("gender")) {
        }
        if (hashSet.contains("keywords")) {
        }
        if (hashSet.contains("isTestDevice")) {
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
        }
        if (hashSet.contains("publisherProvidedId")) {
        }
        if (hashSet.contains("location")) {
        }
        if (hashSet.contains("contentUrl")) {
        }
        if (hashSet.contains("networkExtras")) {
        }
        if (hashSet.contains("customTargeting")) {
        }
        if (hashSet.contains("categoryExclusions")) {
        }
        if (hashSet.contains("requestAgent")) {
        }
        if (hashSet.contains("requestPackage")) {
        }
        if (hashSet.contains("isDesignedForFamilies")) {
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
        }
        if (hashSet.contains("maxAdContentRating")) {
        }
        if (hashSet.contains("orientation")) {
        }
        this.a = arrayList.toArray();
    }

    public static String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            sb.append(obj == null ? "null" : obj instanceof Bundle ? a((Bundle) obj) : obj.toString());
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fk4) {
            return Arrays.equals(this.a, ((fk4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        int hashCode = Arrays.hashCode(this.a);
        String arrays = Arrays.toString(this.a);
        return "[PoolKey#" + hashCode + " " + arrays + "]";
    }
}