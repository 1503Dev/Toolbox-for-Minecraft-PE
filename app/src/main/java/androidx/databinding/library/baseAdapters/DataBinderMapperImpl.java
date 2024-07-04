package androidx.databinding.library.baseAdapters;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends gj {
    public static final SparseIntArray a = new SparseIntArray(0);

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public static final HashMap<String, Integer> a = new HashMap<>(0);
    }

    @Override // defpackage.gj
    public final List<gj> a() {
        return new ArrayList(0);
    }

    @Override // defpackage.gj
    public final ViewDataBinding b(hj hjVar, View view, int i) {
        if (a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.gj
    public final ViewDataBinding c(hj hjVar, View[] viewArr, int i) {
        if (viewArr.length != 0 && a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // defpackage.gj
    public final int d(String str) {
        Integer num;
        if (str == null || (num = a.a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}