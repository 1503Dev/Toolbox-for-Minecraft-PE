package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: jj  reason: default package */
public final class jj {
    public static DataBinderMapperImpl a = new DataBinderMapperImpl();

    public static <T extends ViewDataBinding> T a(View view) {
        int i = ViewDataBinding.Z;
        T t = (T) view.getTag(bi0.dataBinding);
        if (t == null) {
            Object tag = view.getTag();
            if (tag instanceof String) {
                int d = a.d((String) tag);
                if (d != 0) {
                    return (T) a.b(null, view, d);
                }
                throw new IllegalArgumentException(ij.b("View is not a binding layout. Tag: ", tag));
            }
            throw new IllegalArgumentException("View is not a binding layout");
        }
        return t;
    }

    public static <T extends ViewDataBinding> T b(hj hjVar, ViewGroup viewGroup, int i, int i2) {
        int childCount = viewGroup.getChildCount();
        int i3 = childCount - i;
        if (i3 == 1) {
            return (T) a.b(hjVar, viewGroup.getChildAt(childCount - 1), i2);
        }
        View[] viewArr = new View[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            viewArr[i4] = viewGroup.getChildAt(i4 + i);
        }
        return (T) a.c(hjVar, viewArr, i2);
    }

    public static ViewDataBinding c(LayoutInflater layoutInflater, int i, RecyclerView recyclerView, hj hjVar) {
        return a.b(hjVar, layoutInflater.inflate(i, (ViewGroup) recyclerView, false), i);
    }
}