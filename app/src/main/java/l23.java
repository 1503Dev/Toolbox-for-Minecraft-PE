package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import defpackage.hw;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: l23  reason: default package */
public abstract class l23 extends j22 implements m23 {
    public l23() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.os.Parcel] */
    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        Object obj;
        boolean z;
        ?? emptyMap;
        int intValue;
        String e;
        switch (i) {
            case 1:
                k22.b(parcel);
                h34 h34Var = ((ok2) this).P.a;
                h34Var.getClass();
                h34Var.b(new pl3(h34Var, (Bundle) k22.a(parcel, Bundle.CREATOR), new dv2()));
                parcel2.writeNoException();
                break;
            case 2:
                k22.b(parcel);
                h34 h34Var2 = ((ok2) this).P.a;
                h34Var2.getClass();
                dv2 dv2Var = new dv2();
                h34Var2.b(new pl3(h34Var2, (Bundle) k22.a(parcel, Bundle.CREATOR), dv2Var));
                Bundle A = dv2Var.A(5000L);
                parcel2.writeNoException();
                k22.d(parcel2, A);
                break;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                k22.b(parcel);
                ((ok2) this).w3((Bundle) k22.a(parcel, Bundle.CREATOR), readString, readString2);
                parcel2.writeNoException();
                break;
            case 4:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                hw b = uv0.b(parcel, parcel);
                t6 t6Var = ((ok2) this).P;
                if (b != null) {
                    obj = va0.c0(b);
                } else {
                    obj = null;
                }
                h34 h34Var3 = t6Var.a;
                h34Var3.getClass();
                h34Var3.b(new lt3(h34Var3, readString3, readString4, obj));
                parcel2.writeNoException();
                break;
            case 5:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                ClassLoader classLoader = k22.a;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                k22.b(parcel);
                h34 h34Var4 = ((ok2) this).P.a;
                h34Var4.getClass();
                dv2 dv2Var2 = new dv2();
                h34Var4.b(new ek3(h34Var4, readString5, readString6, z, dv2Var2));
                Bundle A2 = dv2Var2.A(5000L);
                if (A2 != null && A2.size() != 0) {
                    emptyMap = new HashMap(A2.size());
                    for (String str : A2.keySet()) {
                        Object obj2 = A2.get(str);
                        if ((obj2 instanceof Double) || (obj2 instanceof Long) || (obj2 instanceof String)) {
                            emptyMap.put(str, obj2);
                        }
                    }
                } else {
                    emptyMap = Collections.emptyMap();
                }
                parcel2.writeNoException();
                parcel2.writeMap(emptyMap);
                break;
            case 6:
                String readString7 = parcel.readString();
                k22.b(parcel);
                h34 h34Var5 = ((ok2) this).P.a;
                h34Var5.getClass();
                dv2 dv2Var3 = new dv2();
                h34Var5.b(new en3(h34Var5, readString7, dv2Var3));
                Integer num = (Integer) dv2.b2(dv2Var3.A(10000L), Integer.class);
                if (num == null) {
                    intValue = 25;
                } else {
                    intValue = num.intValue();
                }
                parcel2.writeNoException();
                parcel2.writeInt(intValue);
                break;
            case 7:
                k22.b(parcel);
                h34 h34Var6 = ((ok2) this).P.a;
                h34Var6.getClass();
                h34Var6.b(new r63(h34Var6, (Bundle) k22.a(parcel, Bundle.CREATOR)));
                parcel2.writeNoException();
                break;
            case 8:
                k22.b(parcel);
                h34 h34Var7 = ((ok2) this).P.a;
                h34Var7.getClass();
                h34Var7.b(new p73(h34Var7, parcel.readString(), parcel.readString(), (Bundle) k22.a(parcel, Bundle.CREATOR)));
                parcel2.writeNoException();
                break;
            case 9:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                k22.b(parcel);
                h34 h34Var8 = ((ok2) this).P.a;
                h34Var8.getClass();
                dv2 dv2Var4 = new dv2();
                h34Var8.b(new j83(h34Var8, readString8, readString9, dv2Var4));
                List list = (List) dv2.b2(dv2Var4.A(5000L), List.class);
                if (list == null) {
                    list = Collections.emptyList();
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                break;
            case 10:
                e = ((ok2) this).e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                break;
            case 11:
                e = ((ok2) this).g();
                parcel2.writeNoException();
                parcel2.writeString(e);
                break;
            case 12:
                long M = ((ok2) this).M();
                parcel2.writeNoException();
                parcel2.writeLong(M);
                break;
            case 13:
                String readString10 = parcel.readString();
                k22.b(parcel);
                ((ok2) this).I(readString10);
                parcel2.writeNoException();
                break;
            case 14:
                String readString11 = parcel.readString();
                k22.b(parcel);
                ((ok2) this).q0(readString11);
                parcel2.writeNoException();
                break;
            case 15:
                hw Z = hw.a.Z(parcel.readStrongBinder());
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                k22.b(parcel);
                ((ok2) this).Y2(Z, readString12, readString13);
                parcel2.writeNoException();
                break;
            case 16:
                e = ((ok2) this).f();
                parcel2.writeNoException();
                parcel2.writeString(e);
                break;
            case 17:
                e = ((ok2) this).h();
                parcel2.writeNoException();
                parcel2.writeString(e);
                break;
            case 18:
                e = ((ok2) this).b();
                parcel2.writeNoException();
                parcel2.writeString(e);
                break;
            case 19:
                k22.b(parcel);
                ((ok2) this).i0((Bundle) k22.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}