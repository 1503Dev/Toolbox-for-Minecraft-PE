package defpackage;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition$EpicenterCallback;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wr  reason: default package */
public final class wr extends as {

    /* renamed from: wr$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Transition.TransitionListener {
        public final /* synthetic */ View a;
        public final /* synthetic */ ArrayList b;

        public a(View view, ArrayList arrayList) {
            this.a = view;
            this.b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.a.setVisibility(8);
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.b.get(i)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: wr$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements Transition.TransitionListener {
        public final /* synthetic */ Object a;
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ ArrayList d;
        public final /* synthetic */ Object e;
        public final /* synthetic */ ArrayList f;

        public b(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.a = obj;
            this.b = arrayList;
            this.c = obj2;
            this.d = arrayList2;
            this.e = obj3;
            this.f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
            Object obj = this.a;
            if (obj != null) {
                wr.this.m(obj, this.b, null);
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                wr.this.m(obj2, this.d, null);
            }
            Object obj3 = this.e;
            if (obj3 != null) {
                wr.this.m(obj3, this.f, null);
            }
        }
    }

    /* renamed from: wr$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c extends Transition$EpicenterCallback {
        public final /* synthetic */ Rect a;

        public c(Rect rect) {
            this.a = rect;
        }

        public final Rect onGetEpicenter(Transition transition) {
            Rect rect = this.a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.a;
        }
    }

    public static boolean u(Transition transition) {
        List targetNames;
        if (as.j(transition.getTargetIds())) {
            targetNames = transition.getTargetNames();
            if (as.j(targetNames) && as.j(fm.b(transition))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.as
    public final void a(View view, Object obj) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // defpackage.as
    public final void b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int a2 = l5.a(transitionSet);
            while (i < a2) {
                b(th.c(transitionSet, i), arrayList);
                i++;
            }
        } else if (u(transition) || !as.j(transition.getTargets())) {
        } else {
            int size = arrayList.size();
            while (i < size) {
                transition.addTarget(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // defpackage.as
    public final void c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // defpackage.as
    public final boolean e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // defpackage.as
    public final Object g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // defpackage.as
    public final Object k(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // defpackage.as
    public final void l(View view, Object obj) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // defpackage.as
    public final void m(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int a2 = l5.a(transitionSet);
            while (i < a2) {
                m(th.c(transitionSet, i), arrayList, arrayList2);
                i++;
            }
        } else if (!u(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.addTarget(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    @Override // defpackage.as
    public final void n(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new a(view, arrayList));
    }

    @Override // defpackage.as
    public final void o(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new b(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // defpackage.as
    public final void p(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            as.i(view, rect);
            u0.b((Transition) obj, new vr(rect));
        }
    }

    @Override // defpackage.as
    public final void q(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new c(rect));
        }
    }

    @Override // defpackage.as
    public final void r(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            as.d(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // defpackage.as
    public final void s(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            m(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // defpackage.as
    public final Object t(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }
}