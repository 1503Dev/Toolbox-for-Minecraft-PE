package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.RandomAccess;

/* renamed from: cd0  reason: default package */
public final class cd0 extends AbstractList<fb> implements RandomAccess {
    public static final /* synthetic */ int R = 0;
    public final fb[] P;
    public final int[] Q;

    public cd0(fb[] fbVarArr, int[] iArr) {
        this.P = fbVarArr;
        this.Q = iArr;
    }

    public static void g(long j, za zaVar, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        za zaVar2;
        if (i2 < i3) {
            for (int i9 = i2; i9 < i3; i9++) {
                if (((fb) arrayList.get(i9)).n() < i) {
                    throw new AssertionError();
                }
            }
            fb fbVar = (fb) arrayList.get(i2);
            fb fbVar2 = (fb) arrayList.get(i3 - 1);
            if (i == fbVar.n()) {
                int intValue = ((Integer) arrayList2.get(i2)).intValue();
                int i10 = i2 + 1;
                i5 = i10;
                i4 = intValue;
                fbVar = (fb) arrayList.get(i10);
            } else {
                i4 = -1;
                i5 = i2;
            }
            long j2 = 4;
            if (fbVar.i(i) != fbVar2.i(i)) {
                int i11 = 1;
                for (int i12 = i5 + 1; i12 < i3; i12++) {
                    if (((fb) arrayList.get(i12 - 1)).i(i) != ((fb) arrayList.get(i12)).i(i)) {
                        i11++;
                    }
                }
                long j3 = j + ((int) (zaVar.Q / 4)) + 2 + (i11 * 2);
                zaVar.V(i11);
                zaVar.V(i4);
                for (int i13 = i5; i13 < i3; i13++) {
                    byte i14 = ((fb) arrayList.get(i13)).i(i);
                    if (i13 == i5 || i14 != ((fb) arrayList.get(i13 - 1)).i(i)) {
                        zaVar.V(i14 & 255);
                    }
                }
                za zaVar3 = new za();
                int i15 = i5;
                while (i15 < i3) {
                    byte i16 = ((fb) arrayList.get(i15)).i(i);
                    int i17 = i15 + 1;
                    int i18 = i17;
                    while (true) {
                        if (i18 < i3) {
                            if (i16 != ((fb) arrayList.get(i18)).i(i)) {
                                i7 = i18;
                                break;
                            }
                            i18++;
                        } else {
                            i7 = i3;
                            break;
                        }
                    }
                    if (i17 == i7 && i + 1 == ((fb) arrayList.get(i15)).n()) {
                        zaVar.V(((Integer) arrayList2.get(i15)).intValue());
                        i8 = i7;
                        zaVar2 = zaVar3;
                    } else {
                        zaVar.V((int) ((((int) (zaVar3.Q / j2)) + j3) * (-1)));
                        i8 = i7;
                        zaVar2 = zaVar3;
                        g(j3, zaVar3, i + 1, arrayList, i15, i7, arrayList2);
                    }
                    zaVar3 = zaVar2;
                    i15 = i8;
                    j2 = 4;
                }
                za zaVar4 = zaVar3;
                zaVar.e(zaVar4, zaVar4.Q);
                return;
            }
            int i19 = 0;
            int min = Math.min(fbVar.n(), fbVar2.n());
            for (int i20 = i; i20 < min && fbVar.i(i20) == fbVar2.i(i20); i20++) {
                i19++;
            }
            long j4 = 1 + j + ((int) (zaVar.Q / 4)) + 2 + i19;
            zaVar.V(-i19);
            zaVar.V(i4);
            int i21 = i;
            while (true) {
                i6 = i + i19;
                if (i21 >= i6) {
                    break;
                }
                zaVar.V(fbVar.i(i21) & 255);
                i21++;
            }
            if (i5 + 1 == i3) {
                if (i6 == ((fb) arrayList.get(i5)).n()) {
                    zaVar.V(((Integer) arrayList2.get(i5)).intValue());
                    return;
                }
                throw new AssertionError();
            }
            za zaVar5 = new za();
            zaVar.V((int) ((((int) (zaVar5.Q / 4)) + j4) * (-1)));
            g(j4, zaVar5, i6, arrayList, i5, i3, arrayList2);
            zaVar.e(zaVar5, zaVar5.Q);
            return;
        }
        throw new AssertionError();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.P[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.P.length;
    }
}