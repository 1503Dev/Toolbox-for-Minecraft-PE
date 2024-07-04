package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: to1  reason: default package */
public final class to1 extends lo1 {
    public static final Parcelable.Creator<to1> CREATOR = new so1();
    public final String Q;
    public final nv4 R;

    public to1(String str, String str2, nw4 nw4Var) {
        super(str);
        tv2.G(!nw4Var.isEmpty());
        this.Q = str2;
        nv4 t = nv4.t(nw4Var);
        this.R = t;
        String str3 = (String) t.get(0);
    }

    public static ArrayList a(String str) {
        String substring;
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                substring = str.substring(8, 10);
            } else if (str.length() < 7) {
                if (str.length() >= 4) {
                    substring = str.substring(0, 4);
                }
                return arrayList;
            } else {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                substring = str.substring(5, 7);
            }
            arrayList.add(Integer.valueOf(Integer.parseInt(substring)));
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && to1.class == obj.getClass()) {
            to1 to1Var = (to1) obj;
            if (zn4.b(this.P, to1Var.P) && zn4.b(this.Q, to1Var.Q) && this.R.equals(to1Var.R)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.P.hashCode() + 527;
        String str = this.Q;
        return this.R.hashCode() + (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.lo1
    public final String toString() {
        String str = this.P;
        String str2 = this.Q;
        String valueOf = String.valueOf(this.R);
        return str + ": description=" + str2 + ": values=" + valueOf;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.lo1, defpackage.et2
    public final void w(vo2 vo2Var) {
        char c;
        Integer num;
        String str = this.P;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
                vo2Var.a = (CharSequence) this.R.get(0);
                return;
            case 2:
            case 3:
                vo2Var.b = (CharSequence) this.R.get(0);
                return;
            case 4:
            case 5:
                vo2Var.d = (CharSequence) this.R.get(0);
                return;
            case 6:
            case 7:
                vo2Var.c = (CharSequence) this.R.get(0);
                return;
            case '\b':
            case '\t':
                int i = zn4.a;
                String[] split = ((String) this.R.get(0)).split("/", -1);
                try {
                    int parseInt = Integer.parseInt(split[0]);
                    if (split.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(split[1]));
                    } else {
                        num = null;
                    }
                    vo2Var.h = Integer.valueOf(parseInt);
                    vo2Var.i = num;
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            case '\n':
            case 11:
                try {
                    vo2Var.l = Integer.valueOf(Integer.parseInt((String) this.R.get(0)));
                    return;
                } catch (NumberFormatException unused2) {
                    return;
                }
            case '\f':
            case '\r':
                try {
                    String str2 = (String) this.R.get(0);
                    int parseInt2 = Integer.parseInt(str2.substring(2, 4));
                    int parseInt3 = Integer.parseInt(str2.substring(0, 2));
                    vo2Var.m = Integer.valueOf(parseInt2);
                    vo2Var.n = Integer.valueOf(parseInt3);
                    return;
                } catch (NumberFormatException | StringIndexOutOfBoundsException unused3) {
                    return;
                }
            case 14:
                ArrayList a = a((String) this.R.get(0));
                int size = a.size();
                if (size != 1) {
                    if (size != 2) {
                        if (size == 3) {
                            vo2Var.n = (Integer) a.get(2);
                        } else {
                            return;
                        }
                    }
                    vo2Var.m = (Integer) a.get(1);
                }
                vo2Var.l = (Integer) a.get(0);
                return;
            case 15:
                ArrayList a2 = a((String) this.R.get(0));
                int size2 = a2.size();
                if (size2 != 1) {
                    if (size2 != 2) {
                        if (size2 == 3) {
                            vo2Var.q = (Integer) a2.get(2);
                        } else {
                            return;
                        }
                    }
                    vo2Var.p = (Integer) a2.get(1);
                }
                vo2Var.o = (Integer) a2.get(0);
                return;
            case 16:
            case 17:
                vo2Var.s = (CharSequence) this.R.get(0);
                return;
            case 18:
            case 19:
                vo2Var.t = (CharSequence) this.R.get(0);
                return;
            case 20:
            case 21:
                vo2Var.r = (CharSequence) this.R.get(0);
                return;
            default:
                return;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.P);
        parcel.writeString(this.Q);
        parcel.writeStringArray((String[]) this.R.toArray(new String[0]));
    }
}