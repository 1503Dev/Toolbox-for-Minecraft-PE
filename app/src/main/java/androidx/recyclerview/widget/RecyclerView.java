package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.a0;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.u;
import androidx.recyclerview.widget.z;
import defpackage.h0;
import defpackage.s0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

public class RecyclerView extends ViewGroup implements c90 {
    public static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC;
    public static final boolean ALLOW_THREAD_GAP_WORK;
    public static final boolean DEBUG = false;
    public static final int DEFAULT_ORIENTATION = 1;
    public static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION;
    public static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    public static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    public static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    public static final boolean POST_UPDATES_ON_ANIMATION;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    public static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    public static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    public static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    public static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    public static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    public static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    public static final Interpolator sQuinticInterpolator;
    public androidx.recyclerview.widget.u mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    public g mAdapter;
    public androidx.recyclerview.widget.a mAdapterHelper;
    public boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private j mChildDrawingOrderCallback;
    public androidx.recyclerview.widget.b mChildHelper;
    public boolean mClipToPadding;
    public boolean mDataSetHasChangedAfterLayout;
    public boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private k mEdgeEffectFactory;
    public boolean mEnableFastScroller;
    public boolean mFirstLayoutComplete;
    public androidx.recyclerview.widget.m mGapWorker;
    public boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private s mInterceptingOnItemTouchListener;
    public boolean mIsAttached;
    public l mItemAnimator;
    private l.b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    public final ArrayList<n> mItemDecorations;
    public boolean mItemsAddedOrRemoved;
    public boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    public o mLayout;
    private int mLayoutOrScrollCounter;
    public boolean mLayoutSuppressed;
    public boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final x mObserver;
    private List<q> mOnChildAttachStateListeners;
    private r mOnFlingListener;
    private final ArrayList<s> mOnItemTouchListeners;
    public final List<d0> mPendingAccessibilityImportanceChange;
    private y mPendingSavedState;
    public boolean mPostedAnimatorRunner;
    public m.b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    public final v mRecycler;
    public w mRecyclerListener;
    public final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private t mScrollListener;
    private List<t> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private d90 mScrollingChildHelper;
    public final a0 mState;
    public final Rect mTempRect;
    private final Rect mTempRect2;
    public final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    public final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    public final c0 mViewFlinger;
    private final a0.b mViewInfoProcessCallback;
    public final androidx.recyclerview.widget.a0 mViewInfoStore;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.mIsAttached) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.mLayoutSuppressed) {
                recyclerView2.mLayoutWasDefered = true;
            } else {
                recyclerView2.consumePendingUpdateOperations();
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a0 {
        public int a = -1;
        public int b = 0;
        public int c = 0;
        public int d = 1;
        public int e = 0;
        public boolean f = false;
        public boolean g = false;
        public boolean h = false;
        public boolean i = false;
        public boolean j = false;
        public boolean k = false;
        public int l;
        public long m;
        public int n;

        public final void a(int i) {
            if ((this.d & i) != 0) {
                return;
            }
            StringBuilder b = e5.b("Layout state should be one of ");
            b.append(Integer.toBinaryString(i));
            b.append(" but it is ");
            b.append(Integer.toBinaryString(this.d));
            throw new IllegalStateException(b.toString());
        }

        public final int b() {
            return this.g ? this.b - this.c : this.e;
        }

        public final String toString() {
            StringBuilder b = e5.b("State{mTargetPosition=");
            b.append(this.a);
            b.append(", mData=");
            b.append((Object) null);
            b.append(", mItemCount=");
            b.append(this.e);
            b.append(", mIsMeasuring=");
            b.append(this.i);
            b.append(", mPreviousLayoutItemCount=");
            b.append(this.b);
            b.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            b.append(this.c);
            b.append(", mStructureChanged=");
            b.append(this.f);
            b.append(", mInPreLayout=");
            b.append(this.g);
            b.append(", mRunSimpleAnimations=");
            b.append(this.j);
            b.append(", mRunPredictiveAnimations=");
            b.append(this.k);
            b.append('}');
            return b.toString();
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            long j;
            long j2;
            l lVar = RecyclerView.this.mItemAnimator;
            if (lVar != null) {
                androidx.recyclerview.widget.k kVar = (androidx.recyclerview.widget.k) lVar;
                boolean z = !kVar.h.isEmpty();
                boolean z2 = !kVar.j.isEmpty();
                boolean z3 = !kVar.k.isEmpty();
                boolean z4 = !kVar.i.isEmpty();
                if (z || z2 || z4 || z3) {
                    Iterator<d0> it = kVar.h.iterator();
                    while (it.hasNext()) {
                        d0 next = it.next();
                        View view = next.P;
                        ViewPropertyAnimator animate = view.animate();
                        kVar.q.add(next);
                        animate.setDuration(kVar.d).alpha(0.0f).setListener(new androidx.recyclerview.widget.f(view, animate, kVar, next)).start();
                    }
                    kVar.h.clear();
                    if (z2) {
                        ArrayList<k.b> arrayList = new ArrayList<>();
                        arrayList.addAll(kVar.j);
                        kVar.m.add(arrayList);
                        kVar.j.clear();
                        androidx.recyclerview.widget.c cVar = new androidx.recyclerview.widget.c(kVar, arrayList);
                        if (z) {
                            View view2 = arrayList.get(0).a.P;
                            long j3 = kVar.d;
                            WeakHashMap<View, String> weakHashMap = a41.a;
                            view2.postOnAnimationDelayed(cVar, j3);
                        } else {
                            cVar.run();
                        }
                    }
                    if (z3) {
                        ArrayList<k.a> arrayList2 = new ArrayList<>();
                        arrayList2.addAll(kVar.k);
                        kVar.n.add(arrayList2);
                        kVar.k.clear();
                        androidx.recyclerview.widget.d dVar = new androidx.recyclerview.widget.d(kVar, arrayList2);
                        if (z) {
                            View view3 = arrayList2.get(0).a.P;
                            long j4 = kVar.d;
                            WeakHashMap<View, String> weakHashMap2 = a41.a;
                            view3.postOnAnimationDelayed(dVar, j4);
                        } else {
                            dVar.run();
                        }
                    }
                    if (z4) {
                        ArrayList<d0> arrayList3 = new ArrayList<>();
                        arrayList3.addAll(kVar.i);
                        kVar.l.add(arrayList3);
                        kVar.i.clear();
                        androidx.recyclerview.widget.e eVar = new androidx.recyclerview.widget.e(kVar, arrayList3);
                        if (!z && !z2 && !z3) {
                            eVar.run();
                        } else {
                            long j5 = 0;
                            if (z) {
                                j = kVar.d;
                            } else {
                                j = 0;
                            }
                            if (z2) {
                                j2 = kVar.e;
                            } else {
                                j2 = 0;
                            }
                            if (z3) {
                                j5 = kVar.f;
                            }
                            View view4 = arrayList3.get(0).P;
                            WeakHashMap<View, String> weakHashMap3 = a41.a;
                            view4.postOnAnimationDelayed(eVar, Math.max(j2, j5) + j);
                        }
                    }
                }
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class b0 {
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c0 implements Runnable {
        public int P;
        public int Q;
        public OverScroller R;
        public Interpolator S;
        public boolean T;
        public boolean U;

        public c0() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.S = interpolator;
            this.T = false;
            this.U = false;
            this.R = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final void b() {
            if (this.T) {
                this.U = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            RecyclerView recyclerView = RecyclerView.this;
            WeakHashMap<View, String> weakHashMap = a41.a;
            recyclerView.postOnAnimation(this);
        }

        public final void c(int i, int i2, Interpolator interpolator, int i3) {
            boolean z;
            int height;
            int i4;
            if (i3 == Integer.MIN_VALUE) {
                int abs = Math.abs(i);
                int abs2 = Math.abs(i2);
                if (abs > abs2) {
                    z = true;
                } else {
                    z = false;
                }
                int sqrt = (int) Math.sqrt(0);
                int sqrt2 = (int) Math.sqrt((i2 * i2) + (i * i));
                RecyclerView recyclerView = RecyclerView.this;
                if (z) {
                    height = recyclerView.getWidth();
                } else {
                    height = recyclerView.getHeight();
                }
                int i5 = height / 2;
                float f = height;
                float f2 = i5;
                float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
                if (sqrt > 0) {
                    i4 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
                } else {
                    if (!z) {
                        abs = abs2;
                    }
                    i4 = (int) (((abs / f) + 1.0f) * 300.0f);
                }
                i3 = Math.min(i4, (int) RecyclerView.MAX_SCROLL_DURATION);
            }
            int i6 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.S != interpolator) {
                this.S = interpolator;
                this.R = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.Q = 0;
            this.P = 0;
            RecyclerView.this.setScrollState(2);
            this.R.startScroll(0, 0, i, i2, i6);
            if (Build.VERSION.SDK_INT < 23) {
                this.R.computeScrollOffset();
            }
            b();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            int i2;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                recyclerView.removeCallbacks(this);
                this.R.abortAnimation();
                return;
            }
            this.U = false;
            this.T = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.R;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.P;
                int i5 = currY - this.Q;
                this.P = currX;
                this.Q = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i4, i5, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    i4 -= iArr2[0];
                    i5 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(i4, i5);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(i4, i5, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i2 = iArr4[0];
                    i = iArr4[1];
                    i4 -= i2;
                    i5 -= i;
                    z zVar = recyclerView4.mLayout.T;
                    if (zVar != null && !zVar.d && zVar.e) {
                        int b = recyclerView4.mState.b();
                        if (b == 0) {
                            zVar.d();
                        } else {
                            if (zVar.a >= b) {
                                zVar.a = b - 1;
                            }
                            zVar.b(i2, i);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i2, i, i4, i5, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i6 = i4 - iArr6[0];
                int i7 = i5 - iArr6[1];
                if (i2 != 0 || i != 0) {
                    recyclerView6.dispatchOnScrolled(i2, i);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                if (overScroller.getCurrX() == overScroller.getFinalX()) {
                    z = true;
                } else {
                    z = false;
                }
                if (overScroller.getCurrY() == overScroller.getFinalY()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!overScroller.isFinished() && ((!z && i6 == 0) || (!z2 && i7 == 0))) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                RecyclerView recyclerView7 = RecyclerView.this;
                z zVar2 = recyclerView7.mLayout.T;
                if (zVar2 != null && zVar2.d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4 && z3) {
                    if (recyclerView7.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i6 < 0) {
                            i3 = -currVelocity;
                        } else if (i6 > 0) {
                            i3 = currVelocity;
                        } else {
                            i3 = 0;
                        }
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i3, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        m.b bVar = RecyclerView.this.mPrefetchRegistry;
                        int[] iArr7 = bVar.c;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        bVar.d = 0;
                    }
                } else {
                    b();
                    RecyclerView recyclerView8 = RecyclerView.this;
                    androidx.recyclerview.widget.m mVar = recyclerView8.mGapWorker;
                    if (mVar != null) {
                        mVar.b(recyclerView8, i2, i);
                    }
                }
            }
            z zVar3 = RecyclerView.this.mLayout.T;
            if (zVar3 != null && zVar3.d) {
                zVar3.b(0, 0);
            }
            this.T = false;
            if (this.U) {
                RecyclerView.this.removeCallbacks(this);
                RecyclerView recyclerView9 = RecyclerView.this;
                WeakHashMap<View, String> weakHashMap = a41.a;
                recyclerView9.postOnAnimation(this);
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.stopNestedScroll(1);
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class d implements a0.b {
        public d() {
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class d0 {
        public static final List<Object> h0 = Collections.emptyList();
        public final View P;
        public WeakReference<RecyclerView> Q;
        public int Y;
        public RecyclerView g0;
        public int R = -1;
        public int S = -1;
        public long T = -1;
        public int U = -1;
        public int V = -1;
        public d0 W = null;
        public d0 X = null;
        public ArrayList Z = null;
        public List<Object> a0 = null;
        public int b0 = 0;
        public v c0 = null;
        public boolean d0 = false;
        public int e0 = 0;
        public int f0 = -1;

        public d0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.P = view;
        }

        public final boolean A() {
            return (this.Y & 32) != 0;
        }

        public final void b(Object obj) {
            if (obj == null) {
                c(1024);
            } else if ((1024 & this.Y) == 0) {
                if (this.Z == null) {
                    ArrayList arrayList = new ArrayList();
                    this.Z = arrayList;
                    this.a0 = Collections.unmodifiableList(arrayList);
                }
                this.Z.add(obj);
            }
        }

        public final void c(int i) {
            this.Y = i | this.Y;
        }

        public final int d() {
            int i = this.V;
            return i == -1 ? this.R : i;
        }

        public final List<Object> h() {
            if ((this.Y & 1024) == 0) {
                ArrayList arrayList = this.Z;
                return (arrayList == null || arrayList.size() == 0) ? h0 : this.a0;
            }
            return h0;
        }

        public final boolean i() {
            return (this.P.getParent() == null || this.P.getParent() == this.g0) ? false : true;
        }

        public final boolean p() {
            return (this.Y & 1) != 0;
        }

        public final boolean q() {
            return (this.Y & 4) != 0;
        }

        public final boolean r() {
            if ((this.Y & 16) == 0) {
                View view = this.P;
                WeakHashMap<View, String> weakHashMap = a41.a;
                if (!view.hasTransientState()) {
                    return true;
                }
            }
            return false;
        }

        public final boolean s() {
            return (this.Y & 8) != 0;
        }

        public final String toString() {
            String simpleName;
            boolean z;
            String str;
            if (getClass().isAnonymousClass()) {
                simpleName = "ViewHolder";
            } else {
                simpleName = getClass().getSimpleName();
            }
            StringBuilder c = yg.c(simpleName, "{");
            c.append(Integer.toHexString(hashCode()));
            c.append(" position=");
            c.append(this.R);
            c.append(" id=");
            c.append(this.T);
            c.append(", oldPos=");
            c.append(this.S);
            c.append(", pLpos:");
            c.append(this.V);
            StringBuilder sb = new StringBuilder(c.toString());
            if (u()) {
                sb.append(" scrap ");
                if (this.d0) {
                    str = "[changeScrap]";
                } else {
                    str = "[attachedScrap]";
                }
                sb.append(str);
            }
            if (q()) {
                sb.append(" invalid");
            }
            if (!p()) {
                sb.append(" unbound");
            }
            boolean z2 = true;
            if ((this.Y & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                sb.append(" update");
            }
            if (s()) {
                sb.append(" removed");
            }
            if (z()) {
                sb.append(" ignored");
            }
            if (v()) {
                sb.append(" tmpDetached");
            }
            if (!r()) {
                StringBuilder b = e5.b(" not recyclable(");
                b.append(this.b0);
                b.append(")");
                sb.append(b.toString());
            }
            if ((this.Y & 512) == 0 && !q()) {
                z2 = false;
            }
            if (z2) {
                sb.append(" undefined adapter position");
            }
            if (this.P.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public final boolean u() {
            return this.c0 != null;
        }

        public final boolean v() {
            return (this.Y & 256) != 0;
        }

        public final void w(int i, boolean z) {
            if (this.S == -1) {
                this.S = this.R;
            }
            if (this.V == -1) {
                this.V = this.R;
            }
            if (z) {
                this.V += i;
            }
            this.R += i;
            if (this.P.getLayoutParams() != null) {
                ((p) this.P.getLayoutParams()).R = true;
            }
        }

        public final void x() {
            this.Y = 0;
            this.R = -1;
            this.S = -1;
            this.T = -1L;
            this.V = -1;
            this.b0 = 0;
            this.W = null;
            this.X = null;
            ArrayList arrayList = this.Z;
            if (arrayList != null) {
                arrayList.clear();
            }
            this.Y &= -1025;
            this.e0 = 0;
            this.f0 = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        public final void y(boolean z) {
            int i;
            int i2 = this.b0;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.b0 = i3;
            if (i3 < 0) {
                this.b0 = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i3 == 1) {
                i = this.Y | 16;
            } else if (!z || i3 != 0) {
                return;
            } else {
                i = this.Y & (-17);
            }
            this.Y = i;
        }

        public final boolean z() {
            return (this.Y & 128) != 0;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class e implements b.InterfaceC0010b {
        public e() {
        }

        public final int a() {
            return RecyclerView.this.getChildCount();
        }

        public final void b(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class f implements a.InterfaceC0009a {
        public f() {
        }

        public final void a(a.b bVar) {
            int i = bVar.a;
            if (i == 1) {
                RecyclerView.this.mLayout.e0(bVar.b, bVar.d);
            } else if (i == 2) {
                RecyclerView.this.mLayout.h0(bVar.b, bVar.d);
            } else if (i == 4) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.j0(recyclerView, bVar.b, bVar.d);
            } else if (i != 8) {
            } else {
                RecyclerView.this.mLayout.g0(bVar.b, bVar.d);
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class g<VH extends d0> {
        public final h a = new h();
        public boolean b = false;

        public abstract int d();

        public long f(int i) {
            return -1L;
        }

        public int g(int i) {
            return 0;
        }

        public void h() {
        }

        public abstract void i(VH vh, int i);

        public abstract d0 j(RecyclerView recyclerView, int i);

        public void k() {
        }

        public void l(VH vh) {
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class h extends Observable<i> {
        public final boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public final void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public final void c(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).d(i, i2);
            }
        }

        public final void d(int i, int i2) {
            int size = ((Observable) this).mObservers.size();
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                ((i) ((Observable) this).mObservers.get(size)).b(i, i2);
            }
        }

        public final void e(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).c(i, i2);
            }
        }

        public final void f(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).e(i, i2);
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class i {
        public void a() {
        }

        public void b(int i, int i2) {
        }

        public void c(int i, int i2) {
        }

        public void d(int i, int i2) {
        }

        public void e(int i, int i2) {
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface j {
        int a();
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class k {
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class l {
        public b a = null;
        public ArrayList<a> b = new ArrayList<>();
        public long c = 120;
        public long d = 120;
        public long e = 250;
        public long f = 250;

        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public interface a {
            void a();
        }

        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public interface b {
        }

        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public static class c {
            public int a;
            public int b;

            public final void a(d0 d0Var) {
                View view = d0Var.P;
                this.a = view.getLeft();
                this.b = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        public static void b(d0 d0Var) {
            RecyclerView recyclerView;
            int i = d0Var.Y & 14;
            if (d0Var.q() || (i & 4) != 0 || (recyclerView = d0Var.g0) == null) {
                return;
            }
            recyclerView.getAdapterPositionFor(d0Var);
        }

        public abstract boolean a(d0 d0Var, d0 d0Var2, c cVar, c cVar2);

        public final void c(d0 d0Var) {
            b bVar = this.a;
            if (bVar != null) {
                m mVar = (m) bVar;
                mVar.getClass();
                boolean z = true;
                d0Var.y(true);
                if (d0Var.W != null && d0Var.X == null) {
                    d0Var.W = null;
                }
                d0Var.X = null;
                if ((d0Var.Y & 16) == 0) {
                    z = false;
                }
                if (!z && !RecyclerView.this.removeAnimatingView(d0Var.P) && d0Var.v()) {
                    RecyclerView.this.removeDetachedView(d0Var.P, false);
                }
            }
        }

        public final void d() {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                this.b.get(i).a();
            }
            this.b.clear();
        }

        public abstract void e(d0 d0Var);

        public abstract void f();

        public abstract boolean g();
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class m implements l.b {
        public m() {
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class n {
        public void d(Canvas canvas, RecyclerView recyclerView) {
        }

        public void e(Canvas canvas, RecyclerView recyclerView) {
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class o {
        public androidx.recyclerview.widget.b P;
        public RecyclerView Q;
        public androidx.recyclerview.widget.z R;
        public androidx.recyclerview.widget.z S;
        public z T;
        public boolean U;
        public boolean V;
        public boolean W;
        public boolean X;
        public boolean Y;
        public int Z;
        public boolean a0;
        public int b0;
        public int c0;
        public int d0;
        public int e0;

        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class a implements z.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.z.b
            public final int a() {
                o oVar = o.this;
                return oVar.d0 - oVar.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.z.b
            public final int b(View view) {
                o.this.getClass();
                return (view.getLeft() - o.L(view)) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.z.b
            public final View c(int i) {
                return o.this.G(i);
            }

            @Override // androidx.recyclerview.widget.z.b
            public final int d() {
                return o.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.z.b
            public final int e(View view) {
                o.this.getClass();
                return o.O(view) + view.getRight() + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).rightMargin;
            }
        }

        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class b implements z.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.z.b
            public final int a() {
                o oVar = o.this;
                return oVar.e0 - oVar.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.z.b
            public final int b(View view) {
                o.this.getClass();
                return (view.getTop() - o.Q(view)) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.z.b
            public final View c(int i) {
                return o.this.G(i);
            }

            @Override // androidx.recyclerview.widget.z.b
            public final int d() {
                return o.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.z.b
            public final int e(View view) {
                o.this.getClass();
                return o.F(view) + view.getBottom() + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).bottomMargin;
            }
        }

        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public interface c {
        }

        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public static class d {
            public int a;
            public int b;
            public boolean c;
            public boolean d;
        }

        public o() {
            a aVar = new a();
            b bVar = new b();
            this.R = new androidx.recyclerview.widget.z(aVar);
            this.S = new androidx.recyclerview.widget.z(bVar);
            this.U = false;
            this.V = false;
            this.W = false;
            this.X = true;
            this.Y = true;
        }

        public static int F(View view) {
            return ((p) view.getLayoutParams()).Q.bottom;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (r6 == 1073741824) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int I(boolean z, int i, int i2, int i3, int i4) {
            int max = Math.max(0, i - i3);
            if (z) {
                if (i4 < 0) {
                    if (i4 == -1) {
                        if (i2 != Integer.MIN_VALUE) {
                            if (i2 != 0) {
                            }
                        }
                        i4 = max;
                    }
                    i2 = 0;
                    i4 = 0;
                }
                i2 = 1073741824;
            } else {
                if (i4 < 0) {
                    if (i4 != -1) {
                        if (i4 == -2) {
                            if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                                i4 = max;
                                i2 = RecyclerView.UNDEFINED_DURATION;
                            } else {
                                i4 = max;
                                i2 = 0;
                            }
                        }
                        i2 = 0;
                        i4 = 0;
                    }
                    i4 = max;
                }
                i2 = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(i4, i2);
        }

        public static int L(View view) {
            return ((p) view.getLayoutParams()).Q.left;
        }

        public static int M(View view) {
            return ((p) view.getLayoutParams()).a();
        }

        public static d N(Context context, AttributeSet attributeSet, int i, int i2) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gj0.RecyclerView, i, i2);
            dVar.a = obtainStyledAttributes.getInt(gj0.RecyclerView_android_orientation, 1);
            dVar.b = obtainStyledAttributes.getInt(gj0.RecyclerView_spanCount, 1);
            dVar.c = obtainStyledAttributes.getBoolean(gj0.RecyclerView_reverseLayout, false);
            dVar.d = obtainStyledAttributes.getBoolean(gj0.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static int O(View view) {
            return ((p) view.getLayoutParams()).Q.right;
        }

        public static int Q(View view) {
            return ((p) view.getLayoutParams()).Q.top;
        }

        public static boolean T(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 <= 0 || i == i3) {
                if (mode == Integer.MIN_VALUE) {
                    return size >= i;
                } else if (mode != 0) {
                    return mode == 1073741824 && size == i;
                } else {
                    return true;
                }
            }
            return false;
        }

        public static int r(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        public final void A(v vVar) {
            int H = H();
            while (true) {
                H--;
                if (H >= 0) {
                    View G = G(H);
                    d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(G);
                    if (!childViewHolderInt.z()) {
                        if (childViewHolderInt.q() && !childViewHolderInt.s() && !this.Q.mAdapter.b) {
                            if (G(H) != null) {
                                this.P.l(H);
                            }
                            vVar.h(childViewHolderInt);
                        } else {
                            G(H);
                            this.P.c(H);
                            vVar.i(G);
                            this.Q.mViewInfoStore.d(childViewHolderInt);
                        }
                    }
                } else {
                    return;
                }
            }
        }

        public void A0(Rect rect, int i, int i2) {
            int paddingRight = getPaddingRight() + getPaddingLeft() + rect.width();
            int paddingBottom = getPaddingBottom() + getPaddingTop() + rect.height();
            RecyclerView recyclerView = this.Q;
            WeakHashMap<View, String> weakHashMap = a41.a;
            this.Q.setMeasuredDimension(r(i, paddingRight, recyclerView.getMinimumWidth()), r(i2, paddingBottom, this.Q.getMinimumHeight()));
        }

        public View B(int i) {
            int H = H();
            for (int i2 = 0; i2 < H; i2++) {
                View G = G(i2);
                d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(G);
                if (childViewHolderInt != null && childViewHolderInt.d() == i && !childViewHolderInt.z() && (this.Q.mState.g || !childViewHolderInt.s())) {
                    return G;
                }
            }
            return null;
        }

        public final void B0(int i, int i2) {
            int H = H();
            if (H == 0) {
                this.Q.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = RecyclerView.UNDEFINED_DURATION;
            int i6 = RecyclerView.UNDEFINED_DURATION;
            for (int i7 = 0; i7 < H; i7++) {
                View G = G(i7);
                Rect rect = this.Q.mTempRect;
                RecyclerView.getDecoratedBoundsWithMarginsInt(G, rect);
                int i8 = rect.left;
                if (i8 < i3) {
                    i3 = i8;
                }
                int i9 = rect.right;
                if (i9 > i5) {
                    i5 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i6) {
                    i6 = i11;
                }
            }
            this.Q.mTempRect.set(i3, i4, i5, i6);
            A0(this.Q.mTempRect, i, i2);
        }

        public abstract p C();

        public final void C0(RecyclerView recyclerView) {
            int height;
            if (recyclerView == null) {
                this.Q = null;
                this.P = null;
                height = 0;
                this.d0 = 0;
            } else {
                this.Q = recyclerView;
                this.P = recyclerView.mChildHelper;
                this.d0 = recyclerView.getWidth();
                height = recyclerView.getHeight();
            }
            this.e0 = height;
            this.b0 = 1073741824;
            this.c0 = 1073741824;
        }

        public p D(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        public final boolean D0(View view, int i, int i2, p pVar) {
            return (!view.isLayoutRequested() && this.X && T(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) pVar).width) && T(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public p E(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof p ? new p((p) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new p((ViewGroup.MarginLayoutParams) layoutParams) : new p(layoutParams);
        }

        public boolean E0() {
            return false;
        }

        public final boolean F0(View view, int i, int i2, p pVar) {
            return (this.X && T(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) pVar).width) && T(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public final View G(int i) {
            androidx.recyclerview.widget.b bVar = this.P;
            if (bVar != null) {
                return bVar.d(i);
            }
            return null;
        }

        public void G0(RecyclerView recyclerView, int i) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public final int H() {
            androidx.recyclerview.widget.b bVar = this.P;
            if (bVar != null) {
                return bVar.e();
            }
            return 0;
        }

        public final void H0(androidx.recyclerview.widget.o oVar) {
            z zVar = this.T;
            if (zVar != null && oVar != zVar && zVar.e) {
                zVar.d();
            }
            this.T = oVar;
            RecyclerView recyclerView = this.Q;
            c0 c0Var = recyclerView.mViewFlinger;
            RecyclerView.this.removeCallbacks(c0Var);
            c0Var.R.abortAnimation();
            if (oVar.h) {
                StringBuilder b2 = e5.b("An instance of ");
                b2.append(oVar.getClass().getSimpleName());
                b2.append(" was started more than once. Each instance of");
                b2.append(oVar.getClass().getSimpleName());
                b2.append(" is intended to only be used once. You should create a new instance for each use.");
                Log.w(RecyclerView.TAG, b2.toString());
            }
            oVar.b = recyclerView;
            oVar.c = this;
            int i = oVar.a;
            if (i != -1) {
                recyclerView.mState.a = i;
                oVar.e = true;
                oVar.d = true;
                oVar.f = recyclerView.mLayout.B(i);
                oVar.b.mViewFlinger.b();
                oVar.h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public boolean I0() {
            return false;
        }

        public int J(v vVar, a0 a0Var) {
            RecyclerView recyclerView = this.Q;
            if (recyclerView == null || recyclerView.mAdapter == null || !o()) {
                return 1;
            }
            return this.Q.mAdapter.d();
        }

        public final int K() {
            RecyclerView recyclerView = this.Q;
            WeakHashMap<View, String> weakHashMap = a41.a;
            return recyclerView.getLayoutDirection();
        }

        public int P(v vVar, a0 a0Var) {
            RecyclerView recyclerView = this.Q;
            if (recyclerView == null || recyclerView.mAdapter == null || !p()) {
                return 1;
            }
            return this.Q.mAdapter.d();
        }

        public final void R(View view, Rect rect) {
            Matrix matrix;
            Rect rect2 = ((p) view.getLayoutParams()).Q;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (this.Q != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.Q.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean S() {
            return this.W;
        }

        public void U(View view, int i, int i2, int i3, int i4) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.Q;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) pVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) pVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) pVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
        }

        public void V(int i) {
            RecyclerView recyclerView = this.Q;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        public void W(int i) {
            RecyclerView recyclerView = this.Q;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        public void X() {
        }

        public void Y(RecyclerView recyclerView) {
        }

        public void Z(RecyclerView recyclerView) {
        }

        public View a0(View view, int i, v vVar, a0 a0Var) {
            return null;
        }

        public void b0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.Q;
            v vVar = recyclerView.mRecycler;
            a0 a0Var = recyclerView.mState;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.Q.canScrollVertically(-1) && !this.Q.canScrollHorizontally(-1) && !this.Q.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            g gVar = this.Q.mAdapter;
            if (gVar != null) {
                accessibilityEvent.setItemCount(gVar.d());
            }
        }

        public final void c0(View view, s0 s0Var) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.s() || this.P.k(childViewHolderInt.P)) {
                return;
            }
            RecyclerView recyclerView = this.Q;
            d0(recyclerView.mRecycler, recyclerView.mState, view, s0Var);
        }

        public void d0(v vVar, a0 a0Var, View view, s0 s0Var) {
            s0Var.i(s0.c.a(p() ? M(view) : 0, 1, o() ? M(view) : 0, 1));
        }

        public void e0(int i, int i2) {
        }

        public void f0() {
        }

        public void g0(int i, int i2) {
        }

        public final int getPaddingBottom() {
            RecyclerView recyclerView = this.Q;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public final int getPaddingEnd() {
            RecyclerView recyclerView = this.Q;
            if (recyclerView != null) {
                WeakHashMap<View, String> weakHashMap = a41.a;
                return recyclerView.getPaddingEnd();
            }
            return 0;
        }

        public final int getPaddingLeft() {
            RecyclerView recyclerView = this.Q;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public final int getPaddingRight() {
            RecyclerView recyclerView = this.Q;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public final int getPaddingStart() {
            RecyclerView recyclerView = this.Q;
            if (recyclerView != null) {
                WeakHashMap<View, String> weakHashMap = a41.a;
                return recyclerView.getPaddingStart();
            }
            return 0;
        }

        public final int getPaddingTop() {
            RecyclerView recyclerView = this.Q;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public void h0(int i, int i2) {
        }

        public void i0(int i) {
        }

        public void j0(RecyclerView recyclerView, int i, int i2) {
            i0(i);
        }

        public void k0(v vVar, a0 a0Var) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public final void l(int i, View view, boolean z) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!z && !childViewHolderInt.s()) {
                this.Q.mViewInfoStore.d(childViewHolderInt);
            } else {
                androidx.recyclerview.widget.a0 a0Var = this.Q.mViewInfoStore;
                a0.a orDefault = a0Var.a.getOrDefault(childViewHolderInt, null);
                if (orDefault == null) {
                    orDefault = a0.a.a();
                    a0Var.a.put(childViewHolderInt, orDefault);
                }
                orDefault.a |= 1;
            }
            p pVar = (p) view.getLayoutParams();
            if (!childViewHolderInt.A() && !childViewHolderInt.u()) {
                if (view.getParent() == this.Q) {
                    int j = this.P.j(view);
                    if (i == -1) {
                        i = this.P.e();
                    }
                    if (j != -1) {
                        if (j != i) {
                            o oVar = this.Q.mLayout;
                            View G = oVar.G(j);
                            if (G != null) {
                                oVar.G(j);
                                oVar.P.c(j);
                                p pVar2 = (p) G.getLayoutParams();
                                d0 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(G);
                                if (childViewHolderInt2.s()) {
                                    androidx.recyclerview.widget.a0 a0Var2 = oVar.Q.mViewInfoStore;
                                    a0.a orDefault2 = a0Var2.a.getOrDefault(childViewHolderInt2, null);
                                    if (orDefault2 == null) {
                                        orDefault2 = a0.a.a();
                                        a0Var2.a.put(childViewHolderInt2, orDefault2);
                                    }
                                    orDefault2.a = 1 | orDefault2.a;
                                } else {
                                    oVar.Q.mViewInfoStore.d(childViewHolderInt2);
                                }
                                oVar.P.b(G, i, pVar2, childViewHolderInt2.s());
                            } else {
                                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + j + oVar.Q.toString());
                            }
                        }
                    } else {
                        StringBuilder b2 = e5.b("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        b2.append(this.Q.indexOfChild(view));
                        throw new IllegalStateException(e5.a(this.Q, b2));
                    }
                } else {
                    this.P.a(i, view, false);
                    pVar.R = true;
                    z zVar = this.T;
                    if (zVar != null && zVar.e && zVar.b.getChildLayoutPosition(view) == zVar.a) {
                        zVar.f = view;
                    }
                }
            } else {
                if (childViewHolderInt.u()) {
                    childViewHolderInt.c0.k(childViewHolderInt);
                } else {
                    childViewHolderInt.Y &= -33;
                }
                this.P.b(view, i, view.getLayoutParams(), false);
            }
            if (pVar.S) {
                childViewHolderInt.P.invalidate();
                pVar.S = false;
            }
        }

        public void l0(a0 a0Var) {
        }

        public void m(String str) {
            RecyclerView recyclerView = this.Q;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void m0(Parcelable parcelable) {
        }

        public final void n(View view, Rect rect) {
            RecyclerView recyclerView = this.Q;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public Parcelable n0() {
            return null;
        }

        public boolean o() {
            return false;
        }

        public void o0(int i) {
        }

        public boolean p() {
            return false;
        }

        public final void p0() {
            int H = H();
            while (true) {
                H--;
                if (H < 0) {
                    return;
                }
                this.P.l(H);
            }
        }

        public boolean q(p pVar) {
            return pVar != null;
        }

        public final void q0(v vVar) {
            int H = H();
            while (true) {
                H--;
                if (H >= 0) {
                    if (!RecyclerView.getChildViewHolderInt(G(H)).z()) {
                        View G = G(H);
                        if (G(H) != null) {
                            this.P.l(H);
                        }
                        vVar.g(G);
                    }
                } else {
                    return;
                }
            }
        }

        public final void r0(v vVar) {
            int size = vVar.a.size();
            for (int i = size - 1; i >= 0; i--) {
                View view = vVar.a.get(i).P;
                d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (!childViewHolderInt.z()) {
                    childViewHolderInt.y(false);
                    if (childViewHolderInt.v()) {
                        this.Q.removeDetachedView(view, false);
                    }
                    l lVar = this.Q.mItemAnimator;
                    if (lVar != null) {
                        lVar.e(childViewHolderInt);
                    }
                    childViewHolderInt.y(true);
                    d0 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                    childViewHolderInt2.c0 = null;
                    childViewHolderInt2.d0 = false;
                    childViewHolderInt2.Y &= -33;
                    vVar.h(childViewHolderInt2);
                }
            }
            vVar.a.clear();
            ArrayList<d0> arrayList = vVar.b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.Q.invalidate();
            }
        }

        public void s(int i, int i2, a0 a0Var, c cVar) {
        }

        public final void s0(View view, v vVar) {
            androidx.recyclerview.widget.b bVar = this.P;
            int indexOfChild = RecyclerView.this.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (bVar.b.f(indexOfChild)) {
                    bVar.m(view);
                }
                ((e) bVar.a).b(indexOfChild);
            }
            vVar.g(view);
        }

        public void t(int i, c cVar) {
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a8, code lost:
            if (r10 == false) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean t0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            boolean z3;
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = this.d0 - getPaddingRight();
            int paddingBottom = this.e0 - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - paddingLeft;
            int min = Math.min(0, i);
            int i2 = top - paddingTop;
            int min2 = Math.min(0, i2);
            int i3 = width - paddingRight;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - paddingBottom);
            if (K() == 1) {
                if (max == 0) {
                    max = Math.max(min, i3);
                }
            } else {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            if (z2) {
                View focusedChild = recyclerView.getFocusedChild();
                if (focusedChild != null) {
                    int paddingLeft2 = getPaddingLeft();
                    int paddingTop2 = getPaddingTop();
                    int paddingRight2 = this.d0 - getPaddingRight();
                    int paddingBottom2 = this.e0 - getPaddingBottom();
                    Rect rect2 = this.Q.mTempRect;
                    RecyclerView.getDecoratedBoundsWithMarginsInt(focusedChild, rect2);
                    z3 = (rect2.left - max < paddingRight2 && rect2.right - max > paddingLeft2 && rect2.top - min2 < paddingBottom2 && rect2.bottom - min2 > paddingTop2) ? true : true;
                }
                z3 = false;
            }
            if (max != 0 || min2 != 0) {
                if (z) {
                    recyclerView.scrollBy(max, min2);
                } else {
                    recyclerView.smoothScrollBy(max, min2);
                }
                return true;
            }
            return false;
        }

        public int u(a0 a0Var) {
            return 0;
        }

        public final void u0() {
            RecyclerView recyclerView = this.Q;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int v(a0 a0Var) {
            return 0;
        }

        public int v0(int i, v vVar, a0 a0Var) {
            return 0;
        }

        public int w(a0 a0Var) {
            return 0;
        }

        public void w0(int i) {
        }

        public int x(a0 a0Var) {
            return 0;
        }

        public int x0(int i, v vVar, a0 a0Var) {
            return 0;
        }

        public int y(a0 a0Var) {
            return 0;
        }

        public final void y0(RecyclerView recyclerView) {
            z0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public int z(a0 a0Var) {
            return 0;
        }

        public final void z0(int i, int i2) {
            this.d0 = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.b0 = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.d0 = 0;
            }
            this.e0 = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.c0 = mode2;
            if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.e0 = 0;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class p extends ViewGroup.MarginLayoutParams {
        public d0 P;
        public final Rect Q;
        public boolean R;
        public boolean S;

        public p(int i, int i2) {
            super(i, i2);
            this.Q = new Rect();
            this.R = true;
            this.S = false;
        }

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.Q = new Rect();
            this.R = true;
            this.S = false;
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.Q = new Rect();
            this.R = true;
            this.S = false;
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.Q = new Rect();
            this.R = true;
            this.S = false;
        }

        public p(p pVar) {
            super((ViewGroup.LayoutParams) pVar);
            this.Q = new Rect();
            this.R = true;
            this.S = false;
        }

        public final int a() {
            return this.P.d();
        }

        public final boolean c() {
            return (this.P.Y & 2) != 0;
        }

        public final boolean d() {
            return this.P.s();
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface q {
        void a();

        void b();
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class r {
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface s {
        void a(MotionEvent motionEvent);

        boolean b(MotionEvent motionEvent);

        void c();
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class t {
        public void a(RecyclerView recyclerView, int i) {
        }

        public void b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class u {
        public SparseArray<a> a = new SparseArray<>();
        public int b = 0;

        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public static class a {
            public final ArrayList<d0> a = new ArrayList<>();
            public int b = 5;
            public long c = 0;
            public long d = 0;
        }

        public final a a(int i) {
            a aVar = this.a.get(i);
            if (aVar == null) {
                a aVar2 = new a();
                this.a.put(i, aVar2);
                return aVar2;
            }
            return aVar;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class v {
        public final ArrayList<d0> a;
        public ArrayList<d0> b;
        public final ArrayList<d0> c;
        public final List<d0> d;
        public int e;
        public int f;
        public u g;

        public v() {
            ArrayList<d0> arrayList = new ArrayList<>();
            this.a = arrayList;
            this.b = null;
            this.c = new ArrayList<>();
            this.d = Collections.unmodifiableList(arrayList);
            this.e = 2;
            this.f = 2;
        }

        public static void d(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    d((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        public final void a(d0 d0Var, boolean z) {
            h0 h0Var;
            RecyclerView.clearNestedRecyclerViewIfNotNested(d0Var);
            View view = d0Var.P;
            androidx.recyclerview.widget.u uVar = RecyclerView.this.mAccessibilityDelegate;
            if (uVar != null) {
                u.a aVar = uVar.e;
                if (aVar instanceof u.a) {
                    h0Var = (h0) aVar.e.remove(view);
                } else {
                    h0Var = null;
                }
                a41.n(view, h0Var);
            }
            if (z) {
                w wVar = RecyclerView.this.mRecyclerListener;
                if (wVar != null) {
                    wVar.a();
                }
                g gVar = RecyclerView.this.mAdapter;
                if (gVar != null) {
                    gVar.l(d0Var);
                }
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mState != null) {
                    recyclerView.mViewInfoStore.e(d0Var);
                }
            }
            d0Var.g0 = null;
            u c = c();
            c.getClass();
            int i = d0Var.U;
            ArrayList<d0> arrayList = c.a(i).a;
            if (c.a.get(i).b > arrayList.size()) {
                d0Var.x();
                arrayList.add(d0Var);
            }
        }

        public final int b(int i) {
            if (i >= 0 && i < RecyclerView.this.mState.b()) {
                RecyclerView recyclerView = RecyclerView.this;
                if (!recyclerView.mState.g) {
                    return i;
                }
                return recyclerView.mAdapterHelper.f(i, 0);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("invalid position ");
            sb.append(i);
            sb.append(". State item count is ");
            sb.append(RecyclerView.this.mState.b());
            throw new IndexOutOfBoundsException(e5.a(RecyclerView.this, sb));
        }

        public final u c() {
            if (this.g == null) {
                this.g = new u();
            }
            return this.g;
        }

        public final void e() {
            for (int size = this.c.size() - 1; size >= 0; size--) {
                f(size);
            }
            this.c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                m.b bVar = RecyclerView.this.mPrefetchRegistry;
                int[] iArr = bVar.c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.d = 0;
            }
        }

        public final void f(int i) {
            a(this.c.get(i), true);
            this.c.remove(i);
        }

        public final void g(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.v()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.u()) {
                childViewHolderInt.c0.k(childViewHolderInt);
            } else if (childViewHolderInt.A()) {
                childViewHolderInt.Y &= -33;
            }
            h(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator != null && !childViewHolderInt.r()) {
                RecyclerView.this.mItemAnimator.e(childViewHolderInt);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00c5 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:87:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void h(d0 d0Var) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6 = true;
            if (!d0Var.u() && d0Var.P.getParent() == null) {
                if (!d0Var.v()) {
                    if (!d0Var.z()) {
                        if ((d0Var.Y & 16) == 0) {
                            View view = d0Var.P;
                            WeakHashMap<View, String> weakHashMap = a41.a;
                            if (view.hasTransientState()) {
                                z = true;
                                g gVar = RecyclerView.this.mAdapter;
                                if (!d0Var.r()) {
                                    if (this.f > 0) {
                                        if ((d0Var.Y & 526) != 0) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (!z3) {
                                            int size = this.c.size();
                                            if (size >= this.f && size > 0) {
                                                f(0);
                                                size--;
                                            }
                                            if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0) {
                                                m.b bVar = RecyclerView.this.mPrefetchRegistry;
                                                int i = d0Var.R;
                                                if (bVar.c != null) {
                                                    int i2 = bVar.d * 2;
                                                    for (int i3 = 0; i3 < i2; i3 += 2) {
                                                        if (bVar.c[i3] == i) {
                                                            z4 = true;
                                                            break;
                                                        }
                                                    }
                                                }
                                                z4 = false;
                                                if (!z4) {
                                                    do {
                                                        size--;
                                                        if (size < 0) {
                                                            break;
                                                        }
                                                        int i4 = this.c.get(size).R;
                                                        m.b bVar2 = RecyclerView.this.mPrefetchRegistry;
                                                        if (bVar2.c != null) {
                                                            int i5 = bVar2.d * 2;
                                                            for (int i6 = 0; i6 < i5; i6 += 2) {
                                                                if (bVar2.c[i6] == i4) {
                                                                    z5 = true;
                                                                    continue;
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        z5 = false;
                                                        continue;
                                                    } while (z5);
                                                    size++;
                                                }
                                            }
                                            this.c.add(size, d0Var);
                                            z2 = true;
                                            if (!z2) {
                                                a(d0Var, true);
                                                RecyclerView.this.mViewInfoStore.e(d0Var);
                                                if (!z2 && !z6 && z) {
                                                    d0Var.g0 = null;
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                    }
                                    z2 = false;
                                    if (!z2) {
                                    }
                                } else {
                                    z2 = false;
                                }
                                z6 = false;
                                RecyclerView.this.mViewInfoStore.e(d0Var);
                                if (!z2) {
                                    return;
                                }
                                return;
                            }
                        }
                        z = false;
                        g gVar2 = RecyclerView.this.mAdapter;
                        if (!d0Var.r()) {
                        }
                        z6 = false;
                        RecyclerView.this.mViewInfoStore.e(d0Var);
                        if (!z2) {
                        }
                    } else {
                        throw new IllegalArgumentException(e5.a(RecyclerView.this, e5.b("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                    sb.append(d0Var);
                    throw new IllegalArgumentException(e5.a(RecyclerView.this, sb));
                }
            } else {
                StringBuilder b = e5.b("Scrapped or attached views may not be recycled. isScrap:");
                b.append(d0Var.u());
                b.append(" isAttached:");
                if (d0Var.P.getParent() == null) {
                    z6 = false;
                }
                b.append(z6);
                throw new IllegalArgumentException(e5.a(RecyclerView.this, b));
            }
        }

        public final void i(View view) {
            boolean z;
            ArrayList<d0> arrayList;
            boolean z2;
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            int i = childViewHolderInt.Y;
            if ((i & 12) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if ((i & 2) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                    if (this.b == null) {
                        this.b = new ArrayList<>();
                    }
                    childViewHolderInt.c0 = this;
                    childViewHolderInt.d0 = true;
                    arrayList = this.b;
                    arrayList.add(childViewHolderInt);
                }
            }
            if (childViewHolderInt.q() && !childViewHolderInt.s() && !RecyclerView.this.mAdapter.b) {
                throw new IllegalArgumentException(e5.a(RecyclerView.this, e5.b("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            }
            childViewHolderInt.c0 = this;
            childViewHolderInt.d0 = false;
            arrayList = this.a;
            arrayList.add(childViewHolderInt);
        }

        /* JADX WARN: Code restructure failed: missing block: B:237:0x046c, code lost:
            if (r7.q() == false) goto L235;
         */
        /* JADX WARN: Code restructure failed: missing block: B:247:0x04a0, code lost:
            if (r6 == false) goto L235;
         */
        /* JADX WARN: Removed duplicated region for block: B:125:0x0247  */
        /* JADX WARN: Removed duplicated region for block: B:214:0x0410  */
        /* JADX WARN: Removed duplicated region for block: B:231:0x045d  */
        /* JADX WARN: Removed duplicated region for block: B:240:0x0489  */
        /* JADX WARN: Removed duplicated region for block: B:251:0x04b2  */
        /* JADX WARN: Removed duplicated region for block: B:254:0x04d1  */
        /* JADX WARN: Removed duplicated region for block: B:257:0x04e4  */
        /* JADX WARN: Removed duplicated region for block: B:261:0x0504  */
        /* JADX WARN: Removed duplicated region for block: B:264:0x0517  */
        /* JADX WARN: Removed duplicated region for block: B:285:0x055e  */
        /* JADX WARN: Removed duplicated region for block: B:289:0x0569  */
        /* JADX WARN: Removed duplicated region for block: B:290:0x0570  */
        /* JADX WARN: Removed duplicated region for block: B:297:0x058c A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0090  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final d0 j(int i, long j) {
            d0 d0Var;
            boolean z;
            g gVar;
            ArrayList arrayList;
            ViewGroup.LayoutParams layoutParams;
            long j2;
            boolean z2;
            boolean z3;
            boolean z4;
            ViewGroup.LayoutParams layoutParams2;
            p pVar;
            ViewGroup.LayoutParams generateLayoutParams;
            boolean z5;
            RecyclerView findNestedRecyclerView;
            boolean z6;
            d0 d0Var2;
            View view;
            d0 d0Var3;
            boolean z7;
            int size;
            int f;
            if (i >= 0 && i < RecyclerView.this.mState.b()) {
                h0 h0Var = null;
                boolean z8 = false;
                if (RecyclerView.this.mState.g) {
                    ArrayList<d0> arrayList2 = this.b;
                    if (arrayList2 != null && (size = arrayList2.size()) != 0) {
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                d0Var = this.b.get(i2);
                                if (!d0Var.A() && d0Var.d() == i) {
                                    d0Var.c(32);
                                    break;
                                }
                                i2++;
                            } else {
                                RecyclerView recyclerView = RecyclerView.this;
                                if (recyclerView.mAdapter.b && (f = recyclerView.mAdapterHelper.f(i, 0)) > 0 && f < RecyclerView.this.mAdapter.d()) {
                                    long f2 = RecyclerView.this.mAdapter.f(f);
                                    for (int i3 = 0; i3 < size; i3++) {
                                        d0 d0Var4 = this.b.get(i3);
                                        if (!d0Var4.A() && d0Var4.T == f2) {
                                            d0Var4.c(32);
                                            d0Var = d0Var4;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        if (d0Var != null) {
                            z = true;
                            if (d0Var == null) {
                                int size2 = this.a.size();
                                for (int i4 = 0; i4 < size2; i4++) {
                                    d0Var3 = this.a.get(i4);
                                    if (!d0Var3.A() && d0Var3.d() == i && !d0Var3.q() && (RecyclerView.this.mState.g || !d0Var3.s())) {
                                        d0Var3.c(32);
                                        break;
                                    }
                                }
                                androidx.recyclerview.widget.b bVar = RecyclerView.this.mChildHelper;
                                int size3 = bVar.c.size();
                                int i5 = 0;
                                while (true) {
                                    if (i5 < size3) {
                                        view = (View) bVar.c.get(i5);
                                        ((e) bVar.a).getClass();
                                        d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                                        if (childViewHolderInt.d() == i && !childViewHolderInt.q() && !childViewHolderInt.s()) {
                                            break;
                                        }
                                        i5++;
                                    } else {
                                        view = null;
                                        break;
                                    }
                                }
                                if (view != null) {
                                    d0Var = RecyclerView.getChildViewHolderInt(view);
                                    androidx.recyclerview.widget.b bVar2 = RecyclerView.this.mChildHelper;
                                    int indexOfChild = RecyclerView.this.indexOfChild(view);
                                    if (indexOfChild >= 0) {
                                        if (bVar2.b.d(indexOfChild)) {
                                            bVar2.b.a(indexOfChild);
                                            bVar2.m(view);
                                            int j3 = RecyclerView.this.mChildHelper.j(view);
                                            if (j3 != -1) {
                                                RecyclerView.this.mChildHelper.c(j3);
                                                i(view);
                                                d0Var.c(8224);
                                            } else {
                                                StringBuilder sb = new StringBuilder();
                                                sb.append("layout index should not be -1 after unhiding a view:");
                                                sb.append(d0Var);
                                                throw new IllegalStateException(e5.a(RecyclerView.this, sb));
                                            }
                                        } else {
                                            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                                        }
                                    } else {
                                        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                                    }
                                } else {
                                    int size4 = this.c.size();
                                    for (int i6 = 0; i6 < size4; i6++) {
                                        d0Var3 = this.c.get(i6);
                                        if (!d0Var3.q() && d0Var3.d() == i && !d0Var3.i()) {
                                            this.c.remove(i6);
                                            d0Var = d0Var3;
                                        }
                                    }
                                    d0Var = null;
                                }
                                if (d0Var != null) {
                                    if (d0Var.s()) {
                                        z7 = RecyclerView.this.mState.g;
                                    } else {
                                        int i7 = d0Var.R;
                                        if (i7 >= 0 && i7 < RecyclerView.this.mAdapter.d()) {
                                            RecyclerView recyclerView2 = RecyclerView.this;
                                            if (recyclerView2.mState.g || recyclerView2.mAdapter.g(d0Var.R) == d0Var.U) {
                                                g gVar2 = RecyclerView.this.mAdapter;
                                                if (!gVar2.b || d0Var.T == gVar2.f(d0Var.R)) {
                                                    z7 = true;
                                                }
                                            }
                                            z7 = false;
                                        } else {
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("Inconsistency detected. Invalid view holder adapter position");
                                            sb2.append(d0Var);
                                            throw new IndexOutOfBoundsException(e5.a(RecyclerView.this, sb2));
                                        }
                                    }
                                    if (!z7) {
                                        d0Var.c(4);
                                        if (d0Var.u()) {
                                            RecyclerView.this.removeDetachedView(d0Var.P, false);
                                            d0Var.c0.k(d0Var);
                                        } else if (d0Var.A()) {
                                            d0Var.Y &= -33;
                                        }
                                        h(d0Var);
                                        d0Var = null;
                                    } else {
                                        z = true;
                                    }
                                }
                            }
                            if (d0Var == null) {
                                int f3 = RecyclerView.this.mAdapterHelper.f(i, 0);
                                if (f3 >= 0 && f3 < RecyclerView.this.mAdapter.d()) {
                                    int g = RecyclerView.this.mAdapter.g(f3);
                                    g gVar3 = RecyclerView.this.mAdapter;
                                    if (gVar3.b) {
                                        long f4 = gVar3.f(f3);
                                        int size5 = this.a.size() - 1;
                                        while (true) {
                                            if (size5 >= 0) {
                                                d0 d0Var5 = this.a.get(size5);
                                                if (d0Var5.T == f4 && !d0Var5.A()) {
                                                    if (g == d0Var5.U) {
                                                        d0Var5.c(32);
                                                        if (d0Var5.s() && !RecyclerView.this.mState.g) {
                                                            d0Var5.Y = (d0Var5.Y & (-15)) | 2;
                                                        }
                                                        d0Var = d0Var5;
                                                    } else {
                                                        this.a.remove(size5);
                                                        RecyclerView.this.removeDetachedView(d0Var5.P, false);
                                                        d0 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(d0Var5.P);
                                                        childViewHolderInt2.c0 = null;
                                                        childViewHolderInt2.d0 = false;
                                                        childViewHolderInt2.Y &= -33;
                                                        h(childViewHolderInt2);
                                                    }
                                                }
                                                size5--;
                                            } else {
                                                int size6 = this.c.size() - 1;
                                                while (true) {
                                                    if (size6 < 0) {
                                                        break;
                                                    }
                                                    d0Var = this.c.get(size6);
                                                    if (d0Var.T != f4 || d0Var.i()) {
                                                        size6--;
                                                    } else if (g == d0Var.U) {
                                                        this.c.remove(size6);
                                                    } else {
                                                        f(size6);
                                                    }
                                                }
                                                d0Var = null;
                                            }
                                        }
                                        if (d0Var != null) {
                                            d0Var.R = f3;
                                            z = true;
                                        }
                                    }
                                    if (d0Var == null) {
                                        u.a aVar = c().a.get(g);
                                        if (aVar != null && !aVar.a.isEmpty()) {
                                            ArrayList<d0> arrayList3 = aVar.a;
                                            for (int size7 = arrayList3.size() - 1; size7 >= 0; size7--) {
                                                if (!arrayList3.get(size7).i()) {
                                                    d0Var2 = arrayList3.remove(size7);
                                                    break;
                                                }
                                            }
                                        }
                                        d0Var2 = null;
                                        if (d0Var2 != null) {
                                            d0Var2.x();
                                            if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                                View view2 = d0Var2.P;
                                                if (view2 instanceof ViewGroup) {
                                                    d((ViewGroup) view2, false);
                                                }
                                            }
                                        }
                                        d0Var = d0Var2;
                                    }
                                    if (d0Var == null) {
                                        long nanoTime = RecyclerView.this.getNanoTime();
                                        if (j != RecyclerView.FOREVER_NS) {
                                            long j4 = this.g.a(g).c;
                                            if (j4 != 0 && j4 + nanoTime >= j) {
                                                z6 = false;
                                            } else {
                                                z6 = true;
                                            }
                                            if (!z6) {
                                                return null;
                                            }
                                        }
                                        RecyclerView recyclerView3 = RecyclerView.this;
                                        g gVar4 = recyclerView3.mAdapter;
                                        gVar4.getClass();
                                        try {
                                            int i8 = k01.a;
                                            Trace.beginSection(RecyclerView.TRACE_CREATE_VIEW_TAG);
                                            d0 j5 = gVar4.j(recyclerView3, g);
                                            if (j5.P.getParent() == null) {
                                                j5.U = g;
                                                Trace.endSection();
                                                if (RecyclerView.ALLOW_THREAD_GAP_WORK && (findNestedRecyclerView = RecyclerView.findNestedRecyclerView(j5.P)) != null) {
                                                    j5.Q = new WeakReference<>(findNestedRecyclerView);
                                                }
                                                long nanoTime2 = RecyclerView.this.getNanoTime() - nanoTime;
                                                u.a a = this.g.a(g);
                                                long j6 = a.c;
                                                if (j6 != 0) {
                                                    nanoTime2 = (nanoTime2 / 4) + ((j6 / 4) * 3);
                                                }
                                                a.c = nanoTime2;
                                                d0Var = j5;
                                            } else {
                                                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                                            }
                                        } catch (Throwable th) {
                                            int i9 = k01.a;
                                            Trace.endSection();
                                            throw th;
                                        }
                                    }
                                } else {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("Inconsistency detected. Invalid item position ");
                                    sb3.append(i);
                                    sb3.append("(offset:");
                                    sb3.append(f3);
                                    sb3.append(").state:");
                                    sb3.append(RecyclerView.this.mState.b());
                                    throw new IndexOutOfBoundsException(e5.a(RecyclerView.this, sb3));
                                }
                            }
                            if (z) {
                                a0 a0Var = RecyclerView.this.mState;
                                if (!a0Var.g) {
                                    int i10 = d0Var.Y;
                                    if ((i10 & 8192) != 0) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z5) {
                                        d0Var.Y = (i10 & (-8193)) | 0;
                                        if (a0Var.j) {
                                            l.b(d0Var);
                                            l lVar = RecyclerView.this.mItemAnimator;
                                            d0Var.h();
                                            lVar.getClass();
                                            l.c cVar = new l.c();
                                            cVar.a(d0Var);
                                            RecyclerView.this.recordAnimationInfoIfBouncedHiddenView(d0Var, cVar);
                                        }
                                    }
                                }
                            }
                            if (!RecyclerView.this.mState.g && d0Var.p()) {
                                d0Var.V = i;
                            } else {
                                if (d0Var.p()) {
                                    if ((d0Var.Y & 2) != 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (!z4) {
                                    }
                                }
                                int f5 = RecyclerView.this.mAdapterHelper.f(i, 0);
                                RecyclerView recyclerView4 = RecyclerView.this;
                                d0Var.g0 = recyclerView4;
                                int i11 = d0Var.U;
                                long nanoTime3 = recyclerView4.getNanoTime();
                                if (j != RecyclerView.FOREVER_NS) {
                                    long j7 = this.g.a(i11).d;
                                    if (j7 != 0 && j7 + nanoTime3 >= j) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                }
                                gVar = RecyclerView.this.mAdapter;
                                gVar.getClass();
                                d0Var.R = f5;
                                if (gVar.b) {
                                    d0Var.T = gVar.f(f5);
                                }
                                d0Var.Y = (d0Var.Y & (-520)) | 1;
                                int i12 = k01.a;
                                Trace.beginSection(RecyclerView.TRACE_BIND_VIEW_TAG);
                                d0Var.h();
                                gVar.i(d0Var, f5);
                                arrayList = d0Var.Z;
                                if (arrayList != null) {
                                    arrayList.clear();
                                }
                                d0Var.Y &= -1025;
                                layoutParams = d0Var.P.getLayoutParams();
                                if (layoutParams instanceof p) {
                                    ((p) layoutParams).R = true;
                                }
                                Trace.endSection();
                                long nanoTime4 = RecyclerView.this.getNanoTime() - nanoTime3;
                                u.a a2 = this.g.a(d0Var.U);
                                j2 = a2.d;
                                if (j2 != 0) {
                                    nanoTime4 = (nanoTime4 / 4) + ((j2 / 4) * 3);
                                }
                                a2.d = nanoTime4;
                                if (RecyclerView.this.isAccessibilityEnabled()) {
                                    View view3 = d0Var.P;
                                    WeakHashMap<View, String> weakHashMap = a41.a;
                                    if (view3.getImportantForAccessibility() == 0) {
                                        view3.setImportantForAccessibility(1);
                                    }
                                    androidx.recyclerview.widget.u uVar = RecyclerView.this.mAccessibilityDelegate;
                                    if (uVar != null) {
                                        u.a aVar2 = uVar.e;
                                        if (aVar2 instanceof u.a) {
                                            aVar2.getClass();
                                            View.AccessibilityDelegate c = a41.c(view3);
                                            if (c != null) {
                                                if (c instanceof h0.a) {
                                                    h0Var = ((h0.a) c).a;
                                                } else {
                                                    h0Var = new h0(c);
                                                }
                                            }
                                            if (h0Var != null && h0Var != aVar2) {
                                                aVar2.e.put(view3, h0Var);
                                            }
                                        }
                                        a41.n(view3, aVar2);
                                    }
                                }
                                if (RecyclerView.this.mState.g) {
                                    d0Var.V = i;
                                }
                                z2 = true;
                                layoutParams2 = d0Var.P.getLayoutParams();
                                if (layoutParams2 == null) {
                                    generateLayoutParams = RecyclerView.this.generateDefaultLayoutParams();
                                } else if (!RecyclerView.this.checkLayoutParams(layoutParams2)) {
                                    generateLayoutParams = RecyclerView.this.generateLayoutParams(layoutParams2);
                                } else {
                                    pVar = (p) layoutParams2;
                                    pVar.P = d0Var;
                                    if (z && z2) {
                                        z8 = true;
                                    }
                                    pVar.S = z8;
                                    return d0Var;
                                }
                                pVar = (p) generateLayoutParams;
                                d0Var.P.setLayoutParams(pVar);
                                pVar.P = d0Var;
                                if (z) {
                                    z8 = true;
                                }
                                pVar.S = z8;
                                return d0Var;
                            }
                            z2 = false;
                            layoutParams2 = d0Var.P.getLayoutParams();
                            if (layoutParams2 == null) {
                            }
                            pVar = (p) generateLayoutParams;
                            d0Var.P.setLayoutParams(pVar);
                            pVar.P = d0Var;
                            if (z) {
                            }
                            pVar.S = z8;
                            return d0Var;
                        }
                    }
                    d0Var = null;
                    if (d0Var != null) {
                    }
                } else {
                    d0Var = null;
                }
                z = false;
                if (d0Var == null) {
                }
                if (d0Var == null) {
                }
                if (z) {
                }
                if (!RecyclerView.this.mState.g) {
                }
                if (d0Var.p()) {
                }
                int f52 = RecyclerView.this.mAdapterHelper.f(i, 0);
                RecyclerView recyclerView42 = RecyclerView.this;
                d0Var.g0 = recyclerView42;
                int i112 = d0Var.U;
                long nanoTime32 = recyclerView42.getNanoTime();
                if (j != RecyclerView.FOREVER_NS) {
                }
                gVar = RecyclerView.this.mAdapter;
                gVar.getClass();
                d0Var.R = f52;
                if (gVar.b) {
                }
                d0Var.Y = (d0Var.Y & (-520)) | 1;
                int i122 = k01.a;
                Trace.beginSection(RecyclerView.TRACE_BIND_VIEW_TAG);
                d0Var.h();
                gVar.i(d0Var, f52);
                arrayList = d0Var.Z;
                if (arrayList != null) {
                }
                d0Var.Y &= -1025;
                layoutParams = d0Var.P.getLayoutParams();
                if (layoutParams instanceof p) {
                }
                Trace.endSection();
                long nanoTime42 = RecyclerView.this.getNanoTime() - nanoTime32;
                u.a a22 = this.g.a(d0Var.U);
                j2 = a22.d;
                if (j2 != 0) {
                }
                a22.d = nanoTime42;
                if (RecyclerView.this.isAccessibilityEnabled()) {
                }
                if (RecyclerView.this.mState.g) {
                }
                z2 = true;
                layoutParams2 = d0Var.P.getLayoutParams();
                if (layoutParams2 == null) {
                }
                pVar = (p) generateLayoutParams;
                d0Var.P.setLayoutParams(pVar);
                pVar.P = d0Var;
                if (z) {
                }
                pVar.S = z8;
                return d0Var;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Invalid item position ");
            sb4.append(i);
            sb4.append("(");
            sb4.append(i);
            sb4.append("). Item count:");
            sb4.append(RecyclerView.this.mState.b());
            throw new IndexOutOfBoundsException(e5.a(RecyclerView.this, sb4));
        }

        public final void k(d0 d0Var) {
            (d0Var.d0 ? this.b : this.a).remove(d0Var);
            d0Var.c0 = null;
            d0Var.d0 = false;
            d0Var.Y &= -33;
        }

        public final void l() {
            o oVar = RecyclerView.this.mLayout;
            this.f = this.e + (oVar != null ? oVar.Z : 0);
            for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.f; size--) {
                f(size);
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface w {
        void a();
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class x extends i {
        public x() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void a() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (RecyclerView.this.mAdapterHelper.g()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
            if (r0.b.size() == 1) goto L5;
         */
        @Override // androidx.recyclerview.widget.RecyclerView.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void b(int i, int i2) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.a aVar = RecyclerView.this.mAdapterHelper;
            boolean z = true;
            if (i2 < 1) {
                aVar.getClass();
            } else {
                aVar.b.add(aVar.h(null, 4, i, i2));
                aVar.f |= 4;
            }
            z = false;
            if (z) {
                f();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
            if (r0.b.size() == 1) goto L5;
         */
        @Override // androidx.recyclerview.widget.RecyclerView.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void c(int i, int i2) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.a aVar = RecyclerView.this.mAdapterHelper;
            boolean z = true;
            if (i2 < 1) {
                aVar.getClass();
            } else {
                aVar.b.add(aVar.h(null, 1, i, i2));
                aVar.f |= 1;
            }
            z = false;
            if (z) {
                f();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
            if (r0.b.size() == 1) goto L5;
         */
        @Override // androidx.recyclerview.widget.RecyclerView.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void d(int i, int i2) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.a aVar = RecyclerView.this.mAdapterHelper;
            aVar.getClass();
            boolean z = true;
            if (i != i2) {
                aVar.b.add(aVar.h(null, 8, i, i2));
                aVar.f |= 8;
            }
            z = false;
            if (z) {
                f();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
            if (r0.b.size() == 1) goto L5;
         */
        @Override // androidx.recyclerview.widget.RecyclerView.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void e(int i, int i2) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.a aVar = RecyclerView.this.mAdapterHelper;
            boolean z = true;
            if (i2 < 1) {
                aVar.getClass();
            } else {
                aVar.b.add(aVar.h(null, 2, i, i2));
                aVar.f |= 2;
            }
            z = false;
            if (z) {
                f();
            }
        }

        public final void f() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    Runnable runnable = recyclerView.mUpdateChildViewsRunnable;
                    WeakHashMap<View, String> weakHashMap = a41.a;
                    recyclerView.postOnAnimation(runnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class y extends defpackage.c0 {
        public static final Parcelable.Creator<y> CREATOR = new a();
        public Parcelable R;

        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public static class a implements Parcelable.ClassLoaderCreator<y> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new y(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new y[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final y createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new y(parcel, classLoader);
            }
        }

        public y(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.R = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        public y(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // defpackage.c0, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.P, i);
            parcel.writeParcelable(this.R, 0);
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class z {
        public RecyclerView b;
        public o c;
        public boolean d;
        public boolean e;
        public View f;
        public boolean h;
        public int a = -1;
        public final a g = new a();

        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public static class a {
            public int d = -1;
            public boolean f = false;
            public int g = 0;
            public int a = 0;
            public int b = 0;
            public int c = RecyclerView.UNDEFINED_DURATION;
            public Interpolator e = null;

            public final void a(RecyclerView recyclerView) {
                int i = this.d;
                if (i >= 0) {
                    this.d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.f = false;
                } else if (this.f) {
                    Interpolator interpolator = this.e;
                    if (interpolator != null && this.c < 1) {
                        throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                    }
                    int i2 = this.c;
                    if (i2 >= 1) {
                        recyclerView.mViewFlinger.c(this.a, this.b, interpolator, i2);
                        int i3 = this.g + 1;
                        this.g = i3;
                        if (i3 > 10) {
                            Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                        }
                        this.f = false;
                        return;
                    }
                    throw new IllegalStateException("Scroll duration must be a positive number");
                } else {
                    this.g = 0;
                }
            }
        }

        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public interface b {
            PointF e(int i);
        }

        public final PointF a(int i) {
            o oVar = this.c;
            if (oVar instanceof b) {
                return ((b) oVar).e(i);
            }
            StringBuilder b2 = e5.b("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            b2.append(b.class.getCanonicalName());
            Log.w(RecyclerView.TAG, b2.toString());
            return null;
        }

        public final void b(int i, int i2) {
            PointF a2;
            RecyclerView recyclerView = this.b;
            if (this.a == -1 || recyclerView == null) {
                d();
            }
            if (this.d && this.f == null && this.c != null && (a2 = a(this.a)) != null) {
                float f = a2.x;
                if (f != 0.0f || a2.y != 0.0f) {
                    recyclerView.scrollStep((int) Math.signum(f), (int) Math.signum(a2.y), null);
                }
            }
            boolean z = false;
            this.d = false;
            View view = this.f;
            if (view != null) {
                if (this.b.getChildLayoutPosition(view) == this.a) {
                    View view2 = this.f;
                    a0 a0Var = recyclerView.mState;
                    c(view2, this.g);
                    this.g.a(recyclerView);
                    d();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.f = null;
                }
            }
            if (this.e) {
                a0 a0Var2 = recyclerView.mState;
                a aVar = this.g;
                androidx.recyclerview.widget.o oVar = (androidx.recyclerview.widget.o) this;
                if (oVar.b.mLayout.H() == 0) {
                    oVar.d();
                } else {
                    int i3 = oVar.o;
                    int i4 = i3 - i;
                    if (i3 * i4 <= 0) {
                        i4 = 0;
                    }
                    oVar.o = i4;
                    int i5 = oVar.p;
                    int i6 = i5 - i2;
                    if (i5 * i6 <= 0) {
                        i6 = 0;
                    }
                    oVar.p = i6;
                    if (i4 == 0 && i6 == 0) {
                        PointF a3 = oVar.a(oVar.a);
                        if (a3 != null) {
                            float f2 = a3.x;
                            if (f2 != 0.0f || a3.y != 0.0f) {
                                float f3 = a3.y;
                                float sqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
                                float f4 = a3.x / sqrt;
                                a3.x = f4;
                                float f5 = a3.y / sqrt;
                                a3.y = f5;
                                oVar.k = a3;
                                oVar.o = (int) (f4 * 10000.0f);
                                oVar.p = (int) (f5 * 10000.0f);
                                int g = oVar.g(10000);
                                LinearInterpolator linearInterpolator = oVar.i;
                                aVar.a = (int) (oVar.o * 1.2f);
                                aVar.b = (int) (oVar.p * 1.2f);
                                aVar.c = (int) (g * 1.2f);
                                aVar.e = linearInterpolator;
                                aVar.f = true;
                            }
                        }
                        aVar.d = oVar.a;
                        oVar.d();
                    }
                }
                a aVar2 = this.g;
                if (aVar2.d >= 0) {
                    z = true;
                }
                aVar2.a(recyclerView);
                if (z && this.e) {
                    this.d = true;
                    recyclerView.mViewFlinger.b();
                }
            }
        }

        public abstract void c(View view, a aVar);

        public final void d() {
            if (!this.e) {
                return;
            }
            this.e = false;
            androidx.recyclerview.widget.o oVar = (androidx.recyclerview.widget.o) this;
            oVar.p = 0;
            oVar.o = 0;
            oVar.k = null;
            this.b.mState.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            o oVar2 = this.c;
            if (oVar2.T == this) {
                oVar2.T = null;
            }
            this.c = null;
            this.b = null;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        FORCE_INVALIDATE_DISPLAY_LIST = i2 == 19 || i2 == 20;
        ALLOW_SIZE_IN_UNSPECIFIED_SPEC = i2 >= 23;
        POST_UPDATES_ON_ANIMATION = true;
        ALLOW_THREAD_GAP_WORK = i2 >= 21;
        FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
        IGNORE_DETACHED_FOCUSED_CHILD = false;
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new c();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fh0.recyclerViewStyle);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        m.b bVar;
        float a2;
        float a3;
        boolean z2;
        this.mObserver = new x();
        this.mRecycler = new v();
        this.mViewInfoStore = new androidx.recyclerview.widget.a0();
        this.mUpdateChildViewsRunnable = new a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new k();
        this.mItemAnimator = new androidx.recyclerview.widget.k();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        boolean z3 = true;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new c0();
        if (ALLOW_THREAD_GAP_WORK) {
            bVar = new m.b();
        } else {
            bVar = null;
        }
        this.mPrefetchRegistry = bVar;
        this.mState = new a0();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new m();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new b();
        this.mViewInfoProcessCallback = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            Method method = e41.a;
            a2 = c41.a(viewConfiguration);
        } else {
            a2 = e41.a(viewConfiguration, context);
        }
        this.mScaledHorizontalScrollFactor = a2;
        if (i3 >= 26) {
            a3 = r20.a(viewConfiguration);
        } else {
            a3 = e41.a(viewConfiguration, context);
        }
        this.mScaledVerticalScrollFactor = a3;
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        if (getOverScrollMode() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        setWillNotDraw(z2);
        this.mItemAnimator.a = this.mItemAnimatorListener;
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        WeakHashMap<View, String> weakHashMap = a41.a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.u(this));
        int[] iArr = gj0.RecyclerView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        if (i3 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i2, 0);
        }
        String string = obtainStyledAttributes.getString(gj0.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(gj0.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(gj0.RecyclerView_android_clipToPadding, true);
        boolean z4 = obtainStyledAttributes.getBoolean(gj0.RecyclerView_fastScrollEnabled, false);
        this.mEnableFastScroller = z4;
        if (z4) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(gj0.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(gj0.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(gj0.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(gj0.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i2, 0);
        if (i3 >= 21) {
            int[] iArr2 = NESTED_SCROLLING_ATTRS;
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
            if (i3 >= 29) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes2, i2, 0);
            }
            z3 = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z3);
    }

    private void addAnimatingView(d0 d0Var) {
        boolean z2;
        View view = d0Var.P;
        if (view.getParent() == this) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mRecycler.k(getChildViewHolder(view));
        if (d0Var.v()) {
            this.mChildHelper.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        androidx.recyclerview.widget.b bVar = this.mChildHelper;
        if (!z2) {
            bVar.a(-1, view, true);
            return;
        }
        int indexOfChild = RecyclerView.this.indexOfChild(view);
        if (indexOfChild >= 0) {
            bVar.b.h(indexOfChild);
            bVar.i(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    private void animateChange(d0 d0Var, d0 d0Var2, l.c cVar, l.c cVar2, boolean z2, boolean z3) {
        d0Var.y(false);
        if (z2) {
            addAnimatingView(d0Var);
        }
        if (d0Var != d0Var2) {
            if (z3) {
                addAnimatingView(d0Var2);
            }
            d0Var.W = d0Var2;
            addAnimatingView(d0Var);
            this.mRecycler.k(d0Var);
            d0Var2.y(false);
            d0Var2.X = d0Var;
        }
        if (this.mItemAnimator.a(d0Var, d0Var2, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(d0 d0Var) {
        WeakReference<RecyclerView> weakReference = d0Var.Q;
        if (weakReference != null) {
            ViewParent viewParent = weakReference.get();
            while (true) {
                for (View view = (View) viewParent; view != null; view = null) {
                    if (view == d0Var.P) {
                        return;
                    }
                    viewParent = view.getParent();
                    if (viewParent instanceof View) {
                        break;
                    }
                }
                d0Var.Q = null;
                return;
            }
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i2, int i3) {
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, trim);
            try {
                Class<? extends U> asSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(o.class);
                Object[] objArr = null;
                try {
                    constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                } catch (NoSuchMethodException e2) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e3) {
                        e3.initCause(e2);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e3);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((o) constructor.newInstance(objArr));
            } catch (ClassCastException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e4);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e5);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e6);
            } catch (InstantiationException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e8);
            }
        }
    }

    private boolean didChildRangeChange(int i2, int i3) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i2 && iArr[1] == i3) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i2 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i2 != 0 && isAccessibilityEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            obtain.setContentChangeTypes(i2);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void dispatchLayoutStep1() {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.i = false;
        startInterceptRequestLayout();
        androidx.recyclerview.widget.a0 a0Var = this.mViewInfoStore;
        a0Var.a.clear();
        a0Var.b.b();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        a0 a0Var2 = this.mState;
        if (a0Var2.j && this.mItemsChanged) {
            z2 = true;
        } else {
            z2 = false;
        }
        a0Var2.h = z2;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        a0Var2.g = a0Var2.k;
        a0Var2.e = this.mAdapter.d();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.j) {
            int e2 = this.mChildHelper.e();
            for (int i2 = 0; i2 < e2; i2++) {
                d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i2));
                if (!childViewHolderInt.z() && (!childViewHolderInt.q() || this.mAdapter.b)) {
                    l lVar = this.mItemAnimator;
                    l.b(childViewHolderInt);
                    childViewHolderInt.h();
                    lVar.getClass();
                    l.c cVar = new l.c();
                    cVar.a(childViewHolderInt);
                    this.mViewInfoStore.b(childViewHolderInt, cVar);
                    if (this.mState.h) {
                        if ((childViewHolderInt.Y & 2) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5 && !childViewHolderInt.s() && !childViewHolderInt.z() && !childViewHolderInt.q()) {
                            this.mViewInfoStore.b.f(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                        }
                    }
                }
            }
        }
        if (this.mState.k) {
            saveOldPositions();
            a0 a0Var3 = this.mState;
            boolean z6 = a0Var3.f;
            a0Var3.f = false;
            this.mLayout.k0(this.mRecycler, a0Var3);
            this.mState.f = z6;
            for (int i3 = 0; i3 < this.mChildHelper.e(); i3++) {
                d0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.d(i3));
                if (!childViewHolderInt2.z()) {
                    a0.a orDefault = this.mViewInfoStore.a.getOrDefault(childViewHolderInt2, null);
                    if (orDefault != null && (orDefault.a & 4) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        l.b(childViewHolderInt2);
                        if ((8192 & childViewHolderInt2.Y) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        l lVar2 = this.mItemAnimator;
                        childViewHolderInt2.h();
                        lVar2.getClass();
                        l.c cVar2 = new l.c();
                        cVar2.a(childViewHolderInt2);
                        if (z4) {
                            recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, cVar2);
                        } else {
                            androidx.recyclerview.widget.a0 a0Var4 = this.mViewInfoStore;
                            a0.a orDefault2 = a0Var4.a.getOrDefault(childViewHolderInt2, null);
                            if (orDefault2 == null) {
                                orDefault2 = a0.a.a();
                                a0Var4.a.put(childViewHolderInt2, orDefault2);
                            }
                            orDefault2.a |= 2;
                            orDefault2.b = cVar2;
                        }
                    }
                }
            }
        }
        clearOldPositions();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.d = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.c();
        this.mState.e = this.mAdapter.d();
        a0 a0Var = this.mState;
        a0Var.c = 0;
        a0Var.g = false;
        this.mLayout.k0(this.mRecycler, a0Var);
        a0 a0Var2 = this.mState;
        a0Var2.f = false;
        this.mPendingSavedState = null;
        a0Var2.j = a0Var2.j && this.mItemAnimator != null;
        a0Var2.d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        l.c cVar;
        l.c cVar2;
        boolean h2;
        boolean z2;
        boolean z3;
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        a0 a0Var = this.mState;
        a0Var.d = 1;
        if (a0Var.j) {
            for (int e2 = this.mChildHelper.e() - 1; e2 >= 0; e2--) {
                d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(e2));
                if (!childViewHolderInt.z()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    this.mItemAnimator.getClass();
                    l.c cVar3 = new l.c();
                    cVar3.a(childViewHolderInt);
                    d0 d0Var = (d0) this.mViewInfoStore.b.e(changedHolderKey, null);
                    if (d0Var != null && !d0Var.z()) {
                        a0.a orDefault = this.mViewInfoStore.a.getOrDefault(d0Var, null);
                        if (orDefault != null && (orDefault.a & 1) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        a0.a orDefault2 = this.mViewInfoStore.a.getOrDefault(childViewHolderInt, null);
                        if (orDefault2 != null && (orDefault2.a & 1) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z2 || d0Var != childViewHolderInt) {
                            l.c c2 = this.mViewInfoStore.c(d0Var, 4);
                            this.mViewInfoStore.a(childViewHolderInt, cVar3);
                            l.c c3 = this.mViewInfoStore.c(childViewHolderInt, 8);
                            if (c2 == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, d0Var);
                            } else {
                                animateChange(d0Var, childViewHolderInt, c2, c3, z2, z3);
                            }
                        }
                    }
                    this.mViewInfoStore.a(childViewHolderInt, cVar3);
                }
            }
            androidx.recyclerview.widget.a0 a0Var2 = this.mViewInfoStore;
            a0.b bVar = this.mViewInfoProcessCallback;
            for (int i2 = a0Var2.a.R - 1; i2 >= 0; i2--) {
                d0 h3 = a0Var2.a.h(i2);
                a0.a i3 = a0Var2.a.i(i2);
                int i4 = i3.a;
                if ((i4 & 3) != 3) {
                    if ((i4 & 1) != 0) {
                        cVar = i3.b;
                        if (cVar != null) {
                            cVar2 = i3.c;
                        }
                    } else {
                        if ((i4 & 14) != 14) {
                            if ((i4 & 12) == 12) {
                                l.c cVar4 = i3.b;
                                l.c cVar5 = i3.c;
                                d dVar = (d) bVar;
                                dVar.getClass();
                                h3.y(false);
                                RecyclerView recyclerView = RecyclerView.this;
                                boolean z4 = recyclerView.mDataSetHasChangedAfterLayout;
                                l lVar = recyclerView.mItemAnimator;
                                if (z4) {
                                    if (!lVar.a(h3, h3, cVar4, cVar5)) {
                                    }
                                    RecyclerView.this.postAnimationRunner();
                                } else {
                                    androidx.recyclerview.widget.w wVar = (androidx.recyclerview.widget.w) lVar;
                                    wVar.getClass();
                                    int i5 = cVar4.a;
                                    int i6 = cVar5.a;
                                    if (i5 == i6 && cVar4.b == cVar5.b) {
                                        wVar.c(h3);
                                        h2 = false;
                                    } else {
                                        h2 = wVar.h(h3, i5, cVar4.b, i6, cVar5.b);
                                    }
                                    if (!h2) {
                                    }
                                    RecyclerView.this.postAnimationRunner();
                                }
                            } else if ((i4 & 4) != 0) {
                                cVar = i3.b;
                                cVar2 = null;
                            } else if ((i4 & 8) == 0) {
                            }
                            i3.a = 0;
                            i3.b = null;
                            i3.c = null;
                            a0.a.d.b(i3);
                        }
                        RecyclerView.this.animateAppearance(h3, i3.b, i3.c);
                        i3.a = 0;
                        i3.b = null;
                        i3.c = null;
                        a0.a.d.b(i3);
                    }
                    d dVar2 = (d) bVar;
                    RecyclerView.this.mRecycler.k(h3);
                    RecyclerView.this.animateDisappearance(h3, cVar, cVar2);
                    i3.a = 0;
                    i3.b = null;
                    i3.c = null;
                    a0.a.d.b(i3);
                }
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.s0(h3.P, recyclerView2.mRecycler);
                i3.a = 0;
                i3.b = null;
                i3.c = null;
                a0.a.d.b(i3);
            }
        }
        this.mLayout.r0(this.mRecycler);
        a0 a0Var3 = this.mState;
        a0Var3.b = a0Var3.e;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        a0Var3.j = false;
        a0Var3.k = false;
        this.mLayout.U = false;
        ArrayList<d0> arrayList = this.mRecycler.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = this.mLayout;
        if (oVar.a0) {
            oVar.Z = 0;
            oVar.a0 = false;
            this.mRecycler.l();
        }
        this.mLayout.l0(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        androidx.recyclerview.widget.a0 a0Var4 = this.mViewInfoStore;
        a0Var4.a.clear();
        a0Var4.b.b();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        s sVar = this.mInterceptingOnItemTouchListener;
        if (sVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        sVar.a(motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            s sVar = this.mOnItemTouchListeners.get(i2);
            if (sVar.b(motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = sVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int e2 = this.mChildHelper.e();
        if (e2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = UNDEFINED_DURATION;
        for (int i4 = 0; i4 < e2; i4++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i4));
            if (!childViewHolderInt.z()) {
                int d2 = childViewHolderInt.d();
                if (d2 < i2) {
                    i2 = d2;
                }
                if (d2 > i3) {
                    i3 = d2;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i2));
                if (findNestedRecyclerView != null) {
                    return findNestedRecyclerView;
                }
            }
            return null;
        }
        return null;
    }

    private View findNextViewToFocus() {
        d0 findViewHolderForAdapterPosition;
        a0 a0Var = this.mState;
        int i2 = a0Var.l;
        if (i2 == -1) {
            i2 = 0;
        }
        int b2 = a0Var.b();
        for (int i3 = i2; i3 < b2; i3++) {
            d0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i3);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            } else if (findViewHolderForAdapterPosition2.P.hasFocusable()) {
                return findViewHolderForAdapterPosition2.P;
            }
        }
        int min = Math.min(b2, i2);
        while (true) {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
            if (findViewHolderForAdapterPosition.P.hasFocusable()) {
                return findViewHolderForAdapterPosition.P;
            }
        }
    }

    public static d0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).P;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        p pVar = (p) view.getLayoutParams();
        Rect rect2 = pVar.Q;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id;
        loop0: while (true) {
            id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    break;
                }
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    private d90 getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new d90(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j2, d0 d0Var, d0 d0Var2) {
        int e2 = this.mChildHelper.e();
        for (int i2 = 0; i2 < e2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i2));
            if (childViewHolderInt != d0Var && getChangedHolderKey(childViewHolderInt) == j2) {
                g gVar = this.mAdapter;
                if (gVar != null && gVar.b) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                    sb.append(childViewHolderInt);
                    sb.append(" \n View Holder 2:");
                    sb.append(d0Var);
                    throw new IllegalStateException(e5.a(this, sb));
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                sb2.append(childViewHolderInt);
                sb2.append(" \n View Holder 2:");
                sb2.append(d0Var);
                throw new IllegalStateException(e5.a(this, sb2));
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + d0Var2 + " cannot be found but it is necessary for " + d0Var + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int e2 = this.mChildHelper.e();
        for (int i2 = 0; i2 < e2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i2));
            if (childViewHolderInt != null && !childViewHolderInt.z()) {
                if ((childViewHolderInt.Y & 2) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        int i2;
        WeakHashMap<View, String> weakHashMap = a41.a;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            i2 = t31.a(this);
        } else {
            i2 = 0;
        }
        if (i2 == 0 && i3 >= 26) {
            u31.a(this);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new androidx.recyclerview.widget.b(new e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i2) {
        int i3;
        int i4;
        if (view2 == null || view2 == this || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c2 = 65535;
        if (this.mLayout.K() == 1) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        Rect rect = this.mTempRect;
        int i5 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i6 = rect2.left;
        if ((i5 < i6 || rect.right <= i6) && rect.right < rect2.right) {
            i4 = 1;
        } else {
            int i7 = rect.right;
            int i8 = rect2.right;
            if ((i7 > i8 || i5 >= i8) && i5 > i6) {
                i4 = -1;
            } else {
                i4 = 0;
            }
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
            c2 = 1;
        } else {
            int i11 = rect.bottom;
            int i12 = rect2.bottom;
            if ((i11 <= i12 && i9 < i12) || i9 <= i10) {
                c2 = 0;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 17) {
                    if (i2 != 33) {
                        if (i2 != 66) {
                            if (i2 == 130) {
                                if (c2 <= 0) {
                                    return false;
                                }
                                return true;
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid direction: ");
                            sb.append(i2);
                            throw new IllegalArgumentException(e5.a(this, sb));
                        } else if (i4 <= 0) {
                            return false;
                        } else {
                            return true;
                        }
                    } else if (c2 >= 0) {
                        return false;
                    } else {
                        return true;
                    }
                } else if (i4 >= 0) {
                    return false;
                } else {
                    return true;
                }
            } else if (c2 <= 0 && (c2 != 0 || i4 * i3 < 0)) {
                return false;
            } else {
                return true;
            }
        } else if (c2 >= 0 && (c2 != 0 || i4 * i3 > 0)) {
            return false;
        } else {
            return true;
        }
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.mLastTouchX = x2;
            this.mInitialTouchX = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.mLastTouchY = y2;
            this.mInitialTouchY = y2;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.I0();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (this.mDataSetHasChangedAfterLayout) {
            androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
            aVar.k(aVar.b);
            aVar.k(aVar.c);
            aVar.f = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.f0();
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.j();
        } else {
            this.mAdapterHelper.c();
        }
        if (!this.mItemsAddedOrRemoved && !this.mItemsChanged) {
            z2 = false;
        } else {
            z2 = true;
        }
        a0 a0Var = this.mState;
        if (this.mFirstLayoutComplete && this.mItemAnimator != null && (((z4 = this.mDataSetHasChangedAfterLayout) || z2 || this.mLayout.U) && (!z4 || this.mAdapter.b))) {
            z3 = true;
        } else {
            z3 = false;
        }
        a0Var.j = z3;
        if (z3 && z2 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z5 = true;
        }
        a0Var.k = z5;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pullGlows(float f2, float f3, float f4, float f5) {
        boolean z2;
        EdgeEffect edgeEffect;
        float width;
        float height;
        boolean z3 = true;
        if (f3 < 0.0f) {
            ensureLeftGlow();
            edgeEffect = this.mLeftGlow;
            width = (-f3) / getWidth();
            height = 1.0f - (f4 / getHeight());
        } else if (f3 <= 0.0f) {
            z2 = false;
            if (f5 >= 0.0f) {
                ensureTopGlow();
                eo.a(this.mTopGlow, (-f5) / getHeight(), f2 / getWidth());
            } else if (f5 > 0.0f) {
                ensureBottomGlow();
                eo.a(this.mBottomGlow, f5 / getHeight(), 1.0f - (f2 / getWidth()));
            } else {
                z3 = z2;
            }
            if (z3 && f3 == 0.0f && f5 == 0.0f) {
                return;
            }
            WeakHashMap<View, String> weakHashMap = a41.a;
            postInvalidateOnAnimation();
        } else {
            ensureRightGlow();
            edgeEffect = this.mRightGlow;
            width = f3 / getWidth();
            height = f4 / getHeight();
        }
        eo.a(edgeEffect, width, height);
        z2 = true;
        if (f5 >= 0.0f) {
        }
        if (z3) {
        }
        WeakHashMap<View, String> weakHashMap2 = a41.a;
        postInvalidateOnAnimation();
    }

    private void recoverFocusFromState() {
        d0 d0Var;
        View findViewById;
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (IGNORE_DETACHED_FOCUSED_CHILD && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                        if (this.mChildHelper.e() == 0) {
                            requestFocus();
                            return;
                        }
                    } else if (!this.mChildHelper.k(focusedChild)) {
                        return;
                    }
                }
                long j2 = this.mState.m;
                View view = null;
                if (j2 != -1 && this.mAdapter.b) {
                    d0Var = findViewHolderForItemId(j2);
                } else {
                    d0Var = null;
                }
                if (d0Var != null && !this.mChildHelper.k(d0Var.P) && d0Var.P.hasFocusable()) {
                    view = d0Var.P;
                } else if (this.mChildHelper.e() > 0) {
                    view = findNextViewToFocus();
                }
                if (view != null) {
                    int i2 = this.mState.n;
                    if (i2 != -1 && (findViewById = view.findViewById(i2)) != null && findViewById.isFocusable()) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    private void releaseGlows() {
        boolean z2;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.mLeftGlow.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.mBottomGlow.isFinished();
        }
        if (z2) {
            WeakHashMap<View, String> weakHashMap = a41.a;
            postInvalidateOnAnimation();
        }
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.R) {
                Rect rect = pVar.Q;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.t0(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        a0 a0Var = this.mState;
        a0Var.m = -1L;
        a0Var.l = -1;
        a0Var.n = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        View view;
        long j2;
        d0 d0Var = null;
        if (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) {
            view = getFocusedChild();
        } else {
            view = null;
        }
        if (view != null) {
            d0Var = findContainingViewHolder(view);
        }
        if (d0Var == null) {
            resetFocusInfo();
            return;
        }
        a0 a0Var = this.mState;
        if (this.mAdapter.b) {
            j2 = d0Var.T;
        } else {
            j2 = -1;
        }
        a0Var.m = j2;
        int i2 = -1;
        if (!this.mDataSetHasChangedAfterLayout) {
            if (d0Var.s()) {
                i2 = d0Var.S;
            } else {
                RecyclerView recyclerView = d0Var.g0;
                if (recyclerView != null) {
                    i2 = recyclerView.getAdapterPositionFor(d0Var);
                }
            }
        }
        a0Var.l = i2;
        this.mState.n = getDeepestFocusedViewWithId(d0Var.P);
    }

    private void setAdapterInternal(g gVar, boolean z2, boolean z3) {
        g gVar2 = this.mAdapter;
        if (gVar2 != null) {
            gVar2.a.unregisterObserver(this.mObserver);
            this.mAdapter.k();
        }
        if (!z2 || z3) {
            removeAndRecycleViews();
        }
        androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
        aVar.k(aVar.b);
        aVar.k(aVar.c);
        aVar.f = 0;
        g gVar3 = this.mAdapter;
        this.mAdapter = gVar;
        if (gVar != null) {
            gVar.a.registerObserver(this.mObserver);
            gVar.h();
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.X();
        }
        v vVar = this.mRecycler;
        g gVar4 = this.mAdapter;
        vVar.a.clear();
        vVar.e();
        u c2 = vVar.c();
        if (gVar3 != null) {
            c2.b--;
        }
        if (!z2 && c2.b == 0) {
            for (int i2 = 0; i2 < c2.a.size(); i2++) {
                c2.a.valueAt(i2).a.clear();
            }
        }
        if (gVar4 != null) {
            c2.b++;
        } else {
            c2.getClass();
        }
        this.mState.f = true;
    }

    private void stopScrollersInternal() {
        z zVar;
        c0 c0Var = this.mViewFlinger;
        RecyclerView.this.removeCallbacks(c0Var);
        c0Var.R.abortAnimation();
        o oVar = this.mLayout;
        if (oVar != null && (zVar = oVar.T) != null) {
            zVar.d();
        }
    }

    public void absorbGlows(int i2, int i3) {
        if (i2 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i2);
            }
        }
        if (i3 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i3);
            }
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        WeakHashMap<View, String> weakHashMap = a41.a;
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.getClass();
        }
        super.addFocusables(arrayList, i2, i3);
    }

    public void addItemDecoration(n nVar) {
        addItemDecoration(nVar, -1);
    }

    public void addItemDecoration(n nVar, int i2) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.m("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.mItemDecorations.add(nVar);
        } else {
            this.mItemDecorations.add(i2, nVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(q qVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(qVar);
    }

    public void addOnItemTouchListener(s sVar) {
        this.mOnItemTouchListeners.add(sVar);
    }

    public void addOnScrollListener(t tVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(tVar);
    }

    public void animateAppearance(d0 d0Var, l.c cVar, l.c cVar2) {
        boolean z2;
        int i2;
        int i3;
        d0Var.y(false);
        androidx.recyclerview.widget.w wVar = (androidx.recyclerview.widget.w) this.mItemAnimator;
        wVar.getClass();
        if (cVar != null && ((i2 = cVar.a) != (i3 = cVar2.a) || cVar.b != cVar2.b)) {
            z2 = wVar.h(d0Var, i2, cVar.b, i3, cVar2.b);
        } else {
            androidx.recyclerview.widget.k kVar = (androidx.recyclerview.widget.k) wVar;
            kVar.m(d0Var);
            d0Var.P.setAlpha(0.0f);
            kVar.i.add(d0Var);
            z2 = true;
        }
        if (z2) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(d0 d0Var, l.c cVar, l.c cVar2) {
        int i2;
        int i3;
        boolean z2;
        addAnimatingView(d0Var);
        d0Var.y(false);
        androidx.recyclerview.widget.w wVar = (androidx.recyclerview.widget.w) this.mItemAnimator;
        wVar.getClass();
        int i4 = cVar.a;
        int i5 = cVar.b;
        View view = d0Var.P;
        if (cVar2 == null) {
            i2 = view.getLeft();
        } else {
            i2 = cVar2.a;
        }
        int i6 = i2;
        if (cVar2 == null) {
            i3 = view.getTop();
        } else {
            i3 = cVar2.b;
        }
        int i7 = i3;
        if (!d0Var.s() && (i4 != i6 || i5 != i7)) {
            view.layout(i6, i7, view.getWidth() + i6, view.getHeight() + i7);
            z2 = wVar.h(d0Var, i4, i5, i6, i7);
        } else {
            androidx.recyclerview.widget.k kVar = (androidx.recyclerview.widget.k) wVar;
            kVar.m(d0Var);
            kVar.h.add(d0Var);
            z2 = true;
        }
        if (z2) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (!isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException(e5.a(this, e5.b("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(e5.a(this, e5.b(str)));
        }
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException(e5.a(this, e5.b("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        } else if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(e5.a(this, e5.b(""))));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean canReuseUpdatedViewHolder(d0 d0Var) {
        boolean z2;
        boolean z3;
        l lVar = this.mItemAnimator;
        if (lVar != null) {
            List<Object> h2 = d0Var.h();
            androidx.recyclerview.widget.k kVar = (androidx.recyclerview.widget.k) lVar;
            kVar.getClass();
            if (h2.isEmpty()) {
                if (kVar.g && !d0Var.q()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!z3) {
                    z2 = false;
                    if (z2) {
                        return false;
                    }
                }
            }
            z2 = true;
            if (z2) {
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p) && this.mLayout.q((p) layoutParams);
    }

    public void clearOldPositions() {
        int h2 = this.mChildHelper.h();
        for (int i2 = 0; i2 < h2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i2));
            if (!childViewHolderInt.z()) {
                childViewHolderInt.S = -1;
                childViewHolderInt.V = -1;
            }
        }
        v vVar = this.mRecycler;
        int size = vVar.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            d0 d0Var = vVar.c.get(i3);
            d0Var.S = -1;
            d0Var.V = -1;
        }
        int size2 = vVar.a.size();
        for (int i4 = 0; i4 < size2; i4++) {
            d0 d0Var2 = vVar.a.get(i4);
            d0Var2.S = -1;
            d0Var2.V = -1;
        }
        ArrayList<d0> arrayList = vVar.b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i5 = 0; i5 < size3; i5++) {
                d0 d0Var3 = vVar.b.get(i5);
                d0Var3.S = -1;
                d0Var3.V = -1;
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<t> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.o()) {
            return this.mLayout.u(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.o()) {
            return this.mLayout.v(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.o()) {
            return this.mLayout.w(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.p()) {
            return this.mLayout.x(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.p()) {
            return this.mLayout.y(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.p()) {
            return this.mLayout.z(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.mLeftGlow.onRelease();
            z2 = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.mRightGlow.onRelease();
            z2 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.mTopGlow.onRelease();
            z2 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.mBottomGlow.onRelease();
            z2 |= this.mBottomGlow.isFinished();
        }
        if (z2) {
            WeakHashMap<View, String> weakHashMap = a41.a;
            postInvalidateOnAnimation();
        }
    }

    public void consumePendingUpdateOperations() {
        boolean z2;
        if (this.mFirstLayoutComplete && !this.mDataSetHasChangedAfterLayout) {
            if (!this.mAdapterHelper.g()) {
                return;
            }
            androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
            int i2 = aVar.f;
            boolean z3 = false;
            if ((4 & i2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if ((11 & i2) != 0) {
                    z3 = true;
                }
                if (!z3) {
                    int i3 = k01.a;
                    Trace.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                    startInterceptRequestLayout();
                    onEnterLayoutOrScroll();
                    this.mAdapterHelper.j();
                    if (!this.mLayoutWasDefered) {
                        if (hasUpdatedView()) {
                            dispatchLayout();
                        } else {
                            this.mAdapterHelper.b();
                        }
                    }
                    stopInterceptRequestLayout(true);
                    onExitLayoutOrScroll();
                    Trace.endSection();
                    return;
                }
            }
            if (aVar.g()) {
                int i4 = k01.a;
                Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
                Trace.endSection();
                return;
            }
            return;
        }
        int i5 = k01.a;
        Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
    }

    public void defaultOnMeasure(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, String> weakHashMap = a41.a;
        setMeasuredDimension(o.r(i2, paddingRight, getMinimumWidth()), o.r(i3, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void dispatchChildAttached(View view) {
        getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        g gVar = this.mAdapter;
        List<q> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            this.mOnChildAttachStateListeners.get(size).b();
        }
    }

    public void dispatchChildDetached(View view) {
        getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        g gVar = this.mAdapter;
        List<q> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            this.mOnChildAttachStateListeners.get(size).a();
        }
    }

    public void dispatchLayout() {
        String str;
        if (this.mAdapter == null) {
            str = "No adapter attached; skipping layout";
        } else if (this.mLayout == null) {
            str = "No layout manager attached; skipping layout";
        } else {
            a0 a0Var = this.mState;
            boolean z2 = false;
            a0Var.i = false;
            if (a0Var.d == 1) {
                dispatchLayoutStep1();
            } else {
                androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
                if (!aVar.c.isEmpty() && !aVar.b.isEmpty()) {
                    z2 = true;
                }
                if (!z2 && this.mLayout.d0 == getWidth() && this.mLayout.e0 == getHeight()) {
                    this.mLayout.y0(this);
                    dispatchLayoutStep3();
                    return;
                }
            }
            this.mLayout.y0(this);
            dispatchLayoutStep2();
            dispatchLayoutStep3();
            return;
        }
        Log.e(TAG, str);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, 0);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, i4);
    }

    public final void dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().e(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public void dispatchOnScrollStateChanged(int i2) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.o0(i2);
        }
        onScrollStateChanged(i2);
        t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.a(this, i2);
        }
        List<t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).a(this, i2);
            }
        }
    }

    public void dispatchOnScrolled(int i2, int i3) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        onScrolled(i2, i3);
        t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.b(this, i2, i3);
        }
        List<t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).b(this, i2, i3);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i2;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            d0 d0Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (d0Var.P.getParent() == this && !d0Var.z() && (i2 = d0Var.f0) != -1) {
                View view = d0Var.P;
                WeakHashMap<View, String> weakHashMap = a41.a;
                view.setImportantForAccessibility(i2);
                d0Var.f0 = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z2;
        float f2;
        float f3;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.mItemDecorations.get(i2).e(canvas, this);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z4 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                f2 = getPaddingRight() + (-getWidth());
                f3 = getPaddingBottom() + (-getHeight());
            } else {
                f2 = -getWidth();
                f3 = -getHeight();
            }
            canvas.translate(f2, f3);
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if (z2 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.g()) {
            z4 = z2;
        }
        if (z4) {
            WeakHashMap<View, String> weakHashMap = a41.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public void ensureBottomGlow() {
        int measuredWidth;
        int measuredHeight;
        if (this.mBottomGlow != null) {
            return;
        }
        this.mEdgeEffectFactory.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mBottomGlow = edgeEffect;
        if (this.mClipToPadding) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffect.setSize(measuredWidth, measuredHeight);
    }

    public void ensureLeftGlow() {
        int measuredHeight;
        int measuredWidth;
        if (this.mLeftGlow != null) {
            return;
        }
        this.mEdgeEffectFactory.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mLeftGlow = edgeEffect;
        if (this.mClipToPadding) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffect.setSize(measuredHeight, measuredWidth);
    }

    public void ensureRightGlow() {
        int measuredHeight;
        int measuredWidth;
        if (this.mRightGlow != null) {
            return;
        }
        this.mEdgeEffectFactory.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mRightGlow = edgeEffect;
        if (this.mClipToPadding) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffect.setSize(measuredHeight, measuredWidth);
    }

    public void ensureTopGlow() {
        int measuredWidth;
        int measuredHeight;
        if (this.mTopGlow != null) {
            return;
        }
        this.mEdgeEffectFactory.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mTopGlow = edgeEffect;
        if (this.mClipToPadding) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffect.setSize(measuredWidth, measuredHeight);
    }

    public String exceptionLabel() {
        StringBuilder b2 = e5.b(" ");
        b2.append(super.toString());
        b2.append(", adapter:");
        b2.append(this.mAdapter);
        b2.append(", layout:");
        b2.append(this.mLayout);
        b2.append(", context:");
        b2.append(getContext());
        return b2.toString();
    }

    public final void fillRemainingScrollValues(a0 a0Var) {
        if (getScrollState() != 2) {
            a0Var.getClass();
            return;
        }
        OverScroller overScroller = this.mViewFlinger.R;
        overScroller.getFinalX();
        overScroller.getCurrX();
        a0Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public View findChildViewUnder(float f2, float f3) {
        for (int e2 = this.mChildHelper.e() - 1; e2 >= 0; e2--) {
            View d2 = this.mChildHelper.d(e2);
            float translationX = d2.getTranslationX();
            float translationY = d2.getTranslationY();
            if (f2 >= d2.getLeft() + translationX && f2 <= d2.getRight() + translationX && f3 >= d2.getTop() + translationY && f3 <= d2.getBottom() + translationY) {
                return d2;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View findContainingItemView(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == null || parent == this || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return null;
    }

    public d0 findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public d0 findViewHolderForAdapterPosition(int i2) {
        d0 d0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int h2 = this.mChildHelper.h();
        for (int i3 = 0; i3 < h2; i3++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i3));
            if (childViewHolderInt != null && !childViewHolderInt.s() && getAdapterPositionFor(childViewHolderInt) == i2) {
                if (!this.mChildHelper.k(childViewHolderInt.P)) {
                    return childViewHolderInt;
                }
                d0Var = childViewHolderInt;
            }
        }
        return d0Var;
    }

    public d0 findViewHolderForItemId(long j2) {
        g gVar = this.mAdapter;
        d0 d0Var = null;
        if (gVar != null && gVar.b) {
            int h2 = this.mChildHelper.h();
            for (int i2 = 0; i2 < h2; i2++) {
                d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i2));
                if (childViewHolderInt != null && !childViewHolderInt.s() && childViewHolderInt.T == j2) {
                    if (this.mChildHelper.k(childViewHolderInt.P)) {
                        d0Var = childViewHolderInt;
                    } else {
                        return childViewHolderInt;
                    }
                }
            }
        }
        return d0Var;
    }

    public d0 findViewHolderForLayoutPosition(int i2) {
        return findViewHolderForPosition(i2, false);
    }

    @Deprecated
    public d0 findViewHolderForPosition(int i2) {
        return findViewHolderForPosition(i2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d0 findViewHolderForPosition(int i2, boolean z2) {
        int h2 = this.mChildHelper.h();
        d0 d0Var = null;
        for (int i3 = 0; i3 < h2; i3++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i3));
            if (childViewHolderInt != null && !childViewHolderInt.s()) {
                if (z2) {
                    if (childViewHolderInt.R != i2) {
                        continue;
                    }
                    if (this.mChildHelper.k(childViewHolderInt.P)) {
                        return childViewHolderInt;
                    }
                    d0Var = childViewHolderInt;
                } else {
                    if (childViewHolderInt.d() != i2) {
                        continue;
                    }
                    if (this.mChildHelper.k(childViewHolderInt.P)) {
                    }
                }
            }
        }
        return d0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean fling(int i2, int i3) {
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        int minFlingVelocity;
        boolean z4;
        androidx.recyclerview.widget.y yVar;
        int i6;
        int i7;
        g gVar;
        int i8;
        androidx.recyclerview.widget.t e2;
        int M;
        PointF e3;
        int i9;
        int i10;
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.mLayoutSuppressed) {
            return false;
        } else {
            boolean o2 = oVar.o();
            boolean p2 = this.mLayout.p();
            if (o2 && Math.abs(i2) >= this.mMinFlingVelocity) {
                i4 = i2;
            } else {
                i4 = 0;
            }
            if (p2 && Math.abs(i3) >= this.mMinFlingVelocity) {
                i5 = i3;
            } else {
                i5 = 0;
            }
            if (i4 == 0 && i5 == 0) {
                return false;
            }
            float f2 = i4;
            float f3 = i5;
            if (!dispatchNestedPreFling(f2, f3)) {
                if (!o2 && !p2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                dispatchNestedFling(f2, f3, z2);
                r rVar = this.mOnFlingListener;
                if (rVar != null) {
                    androidx.recyclerview.widget.x xVar = (androidx.recyclerview.widget.x) rVar;
                    o layoutManager = xVar.a.getLayoutManager();
                    if (layoutManager != null && xVar.a.getAdapter() != null && (Math.abs(i5) > (minFlingVelocity = xVar.a.getMinFlingVelocity()) || Math.abs(i4) > minFlingVelocity)) {
                        boolean z5 = layoutManager instanceof z.b;
                        if (z5) {
                            View view = null;
                            if (!z5) {
                                yVar = null;
                            } else {
                                yVar = new androidx.recyclerview.widget.y(xVar, xVar.a.getContext());
                            }
                            if (yVar != null) {
                                androidx.recyclerview.widget.p pVar = (androidx.recyclerview.widget.p) xVar;
                                if (z5) {
                                    RecyclerView recyclerView = layoutManager.Q;
                                    if (recyclerView != null) {
                                        gVar = recyclerView.getAdapter();
                                    } else {
                                        gVar = null;
                                    }
                                    if (gVar != null) {
                                        i8 = gVar.d();
                                    } else {
                                        i8 = 0;
                                    }
                                    if (i8 != 0) {
                                        if (layoutManager.p()) {
                                            e2 = pVar.f(layoutManager);
                                        } else {
                                            if (layoutManager.o()) {
                                                e2 = pVar.e(layoutManager);
                                            }
                                            if (view != null && (M = o.M(view)) != -1 && (e3 = ((z.b) layoutManager).e(i8 - 1)) != null) {
                                                if (!layoutManager.o()) {
                                                    i9 = pVar.c(layoutManager, pVar.e(layoutManager), i4, 0);
                                                    if (e3.x < 0.0f) {
                                                        i9 = -i9;
                                                    }
                                                } else {
                                                    i9 = 0;
                                                }
                                                if (!layoutManager.p()) {
                                                    i10 = pVar.c(layoutManager, pVar.f(layoutManager), 0, i5);
                                                    if (e3.y < 0.0f) {
                                                        i10 = -i10;
                                                    }
                                                } else {
                                                    i10 = 0;
                                                }
                                                if (layoutManager.p()) {
                                                    i9 = i10;
                                                }
                                                if (i9 != 0) {
                                                    int i11 = M + i9;
                                                    if (i11 < 0) {
                                                        i11 = 0;
                                                    }
                                                    if (i11 < i8) {
                                                        i7 = i11;
                                                    }
                                                    i6 = -1;
                                                    if (i7 != i6) {
                                                        yVar.a = i7;
                                                        layoutManager.H0(yVar);
                                                        z4 = true;
                                                        if (z4) {
                                                            z3 = true;
                                                            if (z3) {
                                                                return true;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        view = androidx.recyclerview.widget.p.d(layoutManager, e2);
                                        if (view != null) {
                                            if (!layoutManager.o()) {
                                            }
                                            if (!layoutManager.p()) {
                                            }
                                            if (layoutManager.p()) {
                                            }
                                            if (i9 != 0) {
                                            }
                                        }
                                    }
                                }
                                i6 = -1;
                                i7 = -1;
                                if (i7 != i6) {
                                }
                            }
                        }
                        z4 = false;
                        if (z4) {
                        }
                    }
                    z3 = false;
                    if (z3) {
                    }
                }
                int i12 = o2;
                if (z2) {
                    if (p2) {
                        i12 = (o2 ? 1 : 0) | 2;
                    }
                    startNestedScroll(i12, 1);
                    int i13 = this.mMaxFlingVelocity;
                    int max = Math.max(-i13, Math.min(i4, i13));
                    int i14 = this.mMaxFlingVelocity;
                    int max2 = Math.max(-i14, Math.min(i5, i14));
                    c0 c0Var = this.mViewFlinger;
                    RecyclerView.this.setScrollState(2);
                    c0Var.Q = 0;
                    c0Var.P = 0;
                    Interpolator interpolator = c0Var.S;
                    Interpolator interpolator2 = sQuinticInterpolator;
                    if (interpolator != interpolator2) {
                        c0Var.S = interpolator2;
                        c0Var.R = new OverScroller(RecyclerView.this.getContext(), interpolator2);
                    }
                    c0Var.R.fling(0, 0, max, max2, UNDEFINED_DURATION, Integer.MAX_VALUE, UNDEFINED_DURATION, Integer.MAX_VALUE);
                    c0Var.b();
                    return true;
                }
            }
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i2) {
        View view2;
        boolean z2;
        this.mLayout.getClass();
        boolean z3 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z3 && (i2 == 2 || i2 == 1)) {
            if (this.mLayout.p()) {
                int i3 = i2 == 2 ? 130 : 33;
                z2 = focusFinder.findNextFocus(this, view, i3) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i2 = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.mLayout.o()) {
                int i4 = (this.mLayout.K() == 1) ^ (i2 == 2) ? 66 : 17;
                boolean z4 = focusFinder.findNextFocus(this, view, i4) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i2 = i4;
                }
                z2 = z4;
            }
            if (z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.a0(view, i2, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i2);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i2);
            if (findNextFocus == null && z3) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.a0(view, i2, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return isPreferredNextFocus(view, view2, i2) ? view2 : super.focusSearch(view, i2);
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i2);
        } else {
            requestChildOnScreen(view2, null);
            return view;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.C();
        }
        throw new IllegalStateException(e5.a(this, e5.b("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.D(getContext(), attributeSet);
        }
        throw new IllegalStateException(e5.a(this, e5.b("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionFor(d0 d0Var) {
        boolean z2;
        if ((d0Var.Y & 524) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && d0Var.p()) {
            androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
            int i2 = d0Var.R;
            int size = aVar.b.size();
            for (int i3 = 0; i3 < size; i3++) {
                a.b bVar = aVar.b.get(i3);
                int i4 = bVar.a;
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 == 8) {
                            int i5 = bVar.b;
                            if (i5 == i2) {
                                i2 = bVar.d;
                            } else {
                                if (i5 < i2) {
                                    i2--;
                                }
                                if (bVar.d <= i2) {
                                    i2++;
                                }
                            }
                        }
                    } else {
                        int i6 = bVar.b;
                        if (i6 <= i2) {
                            int i7 = bVar.d;
                            if (i6 + i7 <= i2) {
                                i2 -= i7;
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (bVar.b <= i2) {
                    i2 += bVar.d;
                }
            }
            return i2;
        }
        return -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.getClass();
            return -1;
        }
        return super.getBaseline();
    }

    public long getChangedHolderKey(d0 d0Var) {
        if (this.mAdapter.b) {
            return d0Var.T;
        }
        return d0Var.R;
    }

    public int getChildAdapterPosition(View view) {
        RecyclerView recyclerView;
        d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt == null || (recyclerView = childViewHolderInt.g0) == null) {
            return -1;
        }
        return recyclerView.getAdapterPositionFor(childViewHolderInt);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        j jVar = this.mChildDrawingOrderCallback;
        return jVar == null ? super.getChildDrawingOrder(i2, i3) : jVar.a();
    }

    public long getChildItemId(View view) {
        d0 childViewHolderInt;
        g gVar = this.mAdapter;
        if (gVar == null || !gVar.b || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.T;
    }

    public int getChildLayoutPosition(View view) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.d();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public d0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public androidx.recyclerview.widget.u getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public k getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public l getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        p pVar = (p) view.getLayoutParams();
        if (!pVar.R) {
            return pVar.Q;
        }
        if (this.mState.g && (pVar.c() || pVar.P.q())) {
            return pVar.Q;
        }
        Rect rect = pVar.Q;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mTempRect.set(0, 0, 0, 0);
            Rect rect2 = this.mTempRect;
            this.mItemDecorations.get(i2).getClass();
            ((p) view.getLayoutParams()).a();
            rect2.set(0, 0, 0, 0);
            int i3 = rect.left;
            Rect rect3 = this.mTempRect;
            rect.left = i3 + rect3.left;
            rect.top += rect3.top;
            rect.right += rect3.right;
            rect.bottom += rect3.bottom;
        }
        pVar.R = false;
        return rect;
    }

    public n getItemDecorationAt(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 < 0 || i2 >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
        }
        return this.mItemDecorations.get(i2);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public o getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public r getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public u getRecycledViewPool() {
        return this.mRecycler.c();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0) != null;
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.g();
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new androidx.recyclerview.widget.a(new f());
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(qh0.fastscroll_default_thickness), resources.getDimensionPixelSize(qh0.fastscroll_minimum_range), resources.getDimensionPixelOffset(qh0.fastscroll_margin));
            return;
        }
        throw new IllegalArgumentException(e5.a(this, e5.b("Trying to set fast scroller without both required drawables.")));
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.m("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        l lVar = this.mItemAnimator;
        return lVar != null && lVar.g();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View, defpackage.c90
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public void jumpToPositionForSmoothScroller(int i2) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.w0(i2);
        awakenScrollBars();
    }

    public void markItemDecorInsetsDirty() {
        int h2 = this.mChildHelper.h();
        for (int i2 = 0; i2 < h2; i2++) {
            ((p) this.mChildHelper.g(i2).getLayoutParams()).R = true;
        }
        v vVar = this.mRecycler;
        int size = vVar.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            p pVar = (p) vVar.c.get(i3).P.getLayoutParams();
            if (pVar != null) {
                pVar.R = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int h2 = this.mChildHelper.h();
        for (int i2 = 0; i2 < h2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i2));
            if (childViewHolderInt != null && !childViewHolderInt.z()) {
                childViewHolderInt.c(6);
            }
        }
        markItemDecorInsetsDirty();
        v vVar = this.mRecycler;
        int size = vVar.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            d0 d0Var = vVar.c.get(i3);
            if (d0Var != null) {
                d0Var.c(6);
                d0Var.b(null);
            }
        }
        g gVar = RecyclerView.this.mAdapter;
        if (gVar == null || !gVar.b) {
            vVar.e();
        }
    }

    public void offsetChildrenHorizontal(int i2) {
        int e2 = this.mChildHelper.e();
        for (int i3 = 0; i3 < e2; i3++) {
            this.mChildHelper.d(i3).offsetLeftAndRight(i2);
        }
    }

    public void offsetChildrenVertical(int i2) {
        int e2 = this.mChildHelper.e();
        for (int i3 = 0; i3 < e2; i3++) {
            this.mChildHelper.d(i3).offsetTopAndBottom(i2);
        }
    }

    public void offsetPositionRecordsForInsert(int i2, int i3) {
        int h2 = this.mChildHelper.h();
        for (int i4 = 0; i4 < h2; i4++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i4));
            if (childViewHolderInt != null && !childViewHolderInt.z() && childViewHolderInt.R >= i2) {
                childViewHolderInt.w(i3, false);
                this.mState.f = true;
            }
        }
        v vVar = this.mRecycler;
        int size = vVar.c.size();
        for (int i5 = 0; i5 < size; i5++) {
            d0 d0Var = vVar.c.get(i5);
            if (d0Var != null && d0Var.R >= i2) {
                d0Var.w(i3, true);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int h2 = this.mChildHelper.h();
        int i11 = -1;
        if (i2 < i3) {
            i5 = i2;
            i4 = i3;
            i6 = -1;
        } else {
            i4 = i2;
            i5 = i3;
            i6 = 1;
        }
        for (int i12 = 0; i12 < h2; i12++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i12));
            if (childViewHolderInt != null && (i10 = childViewHolderInt.R) >= i5 && i10 <= i4) {
                if (i10 == i2) {
                    childViewHolderInt.w(i3 - i2, false);
                } else {
                    childViewHolderInt.w(i6, false);
                }
                this.mState.f = true;
            }
        }
        v vVar = this.mRecycler;
        if (i2 < i3) {
            i8 = i2;
            i7 = i3;
        } else {
            i7 = i2;
            i8 = i3;
            i11 = 1;
        }
        int size = vVar.c.size();
        for (int i13 = 0; i13 < size; i13++) {
            d0 d0Var = vVar.c.get(i13);
            if (d0Var != null && (i9 = d0Var.R) >= i8 && i9 <= i7) {
                if (i9 == i2) {
                    d0Var.w(i3 - i2, false);
                } else {
                    d0Var.w(i11, false);
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int h2 = this.mChildHelper.h();
        for (int i5 = 0; i5 < h2; i5++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i5));
            if (childViewHolderInt != null && !childViewHolderInt.z()) {
                int i6 = childViewHolderInt.R;
                if (i6 >= i4) {
                    childViewHolderInt.w(-i3, z2);
                } else if (i6 >= i2) {
                    childViewHolderInt.c(8);
                    childViewHolderInt.w(-i3, z2);
                    childViewHolderInt.R = i2 - 1;
                }
                this.mState.f = true;
            }
        }
        v vVar = this.mRecycler;
        int size = vVar.c.size();
        while (true) {
            size--;
            if (size >= 0) {
                d0 d0Var = vVar.c.get(size);
                if (d0Var != null) {
                    int i7 = d0Var.R;
                    if (i7 >= i4) {
                        d0Var.w(-i3, z2);
                    } else if (i7 >= i2) {
                        d0Var.c(8);
                        vVar.f(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        boolean z2;
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        if (this.mFirstLayoutComplete && !isLayoutRequested()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mFirstLayoutComplete = z2;
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.V = true;
            oVar.Y(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal<androidx.recyclerview.widget.m> threadLocal = androidx.recyclerview.widget.m.T;
            androidx.recyclerview.widget.m mVar = threadLocal.get();
            this.mGapWorker = mVar;
            if (mVar == null) {
                this.mGapWorker = new androidx.recyclerview.widget.m();
                WeakHashMap<View, String> weakHashMap = a41.a;
                Display display = getDisplay();
                float f2 = 60.0f;
                if (!isInEditMode() && display != null) {
                    float refreshRate = display.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f2 = refreshRate;
                    }
                }
                androidx.recyclerview.widget.m mVar2 = this.mGapWorker;
                mVar2.R = 1.0E9f / f2;
                threadLocal.set(mVar2);
            }
            this.mGapWorker.P.add(this);
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        androidx.recyclerview.widget.m mVar;
        super.onDetachedFromWindow();
        l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.f();
        }
        stopScroll();
        this.mIsAttached = false;
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.V = false;
            oVar.Z(this);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        do {
        } while (a0.a.d.a() != null);
        if (ALLOW_THREAD_GAP_WORK && (mVar = this.mGapWorker) != null) {
            mVar.P.remove(this);
            this.mGapWorker = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mItemDecorations.get(i2).d(canvas, this);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    public void onExitLayoutOrScroll(boolean z2) {
        int i2 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i2;
        if (i2 < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z2) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.mLayout.p() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.mLayout.o()) {
                    f3 = motionEvent.getAxisValue(10);
                    if (f2 == 0.0f || f3 != 0.0f) {
                        scrollByInternal((int) (f3 * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent);
                    }
                }
                f3 = 0.0f;
                if (f2 == 0.0f) {
                }
                scrollByInternal((int) (f3 * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent);
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.mLayout.p()) {
                        f2 = -axisValue;
                        f3 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        scrollByInternal((int) (f3 * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent);
                    } else if (this.mLayout.o()) {
                        f3 = axisValue;
                        f2 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        scrollByInternal((int) (f3 * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent);
                    }
                }
                f2 = 0.0f;
                f3 = 0.0f;
                if (f2 == 0.0f) {
                }
                scrollByInternal((int) (f3 * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        o oVar = this.mLayout;
        if (oVar == null) {
            return false;
        }
        boolean o2 = oVar.o();
        boolean p2 = this.mLayout.p();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                onPointerUp(motionEvent);
                            }
                        } else {
                            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                            int x2 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.mLastTouchX = x2;
                            this.mInitialTouchX = x2;
                            int y2 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.mLastTouchY = y2;
                            this.mInitialTouchY = y2;
                        }
                    } else {
                        cancelScroll();
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                    if (findPointerIndex < 0) {
                        StringBuilder b2 = e5.b("Error processing scroll; pointer index for id ");
                        b2.append(this.mScrollPointerId);
                        b2.append(" not found. Did any MotionEvents get skipped?");
                        Log.e(TAG, b2.toString());
                        return false;
                    }
                    int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.mScrollState != 1) {
                        int i2 = x3 - this.mInitialTouchX;
                        int i3 = y3 - this.mInitialTouchY;
                        if (o2 && Math.abs(i2) > this.mTouchSlop) {
                            this.mLastTouchX = x3;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (p2 && Math.abs(i3) > this.mTouchSlop) {
                            this.mLastTouchY = y3;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                }
            } else {
                this.mVelocityTracker.clear();
                stopNestedScroll(0);
            }
        } else {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x4 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x4;
            this.mInitialTouchX = x4;
            int y4 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y4;
            this.mInitialTouchY = y4;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i4 = o2;
            if (p2) {
                i4 = (o2 ? 1 : 0) | 2;
            }
            startNestedScroll(i4, 0);
        }
        if (this.mScrollState != 1) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = k01.a;
        Trace.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        o oVar = this.mLayout;
        if (oVar == null) {
            defaultOnMeasure(i2, i3);
            return;
        }
        boolean z2 = false;
        if (oVar.S()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.mLayout.Q.defaultOnMeasure(i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            if (!z2 && this.mAdapter != null) {
                if (this.mState.d == 1) {
                    dispatchLayoutStep1();
                }
                this.mLayout.z0(i2, i3);
                this.mState.i = true;
                dispatchLayoutStep2();
                this.mLayout.B0(i2, i3);
                if (this.mLayout.E0()) {
                    this.mLayout.z0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.mState.i = true;
                    dispatchLayoutStep2();
                    this.mLayout.B0(i2, i3);
                }
            }
        } else if (this.mHasFixedSize) {
            this.mLayout.Q.defaultOnMeasure(i2, i3);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll();
                a0 a0Var = this.mState;
                if (a0Var.k) {
                    a0Var.g = true;
                } else {
                    this.mAdapterHelper.c();
                    this.mState.g = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            g gVar = this.mAdapter;
            if (gVar != null) {
                this.mState.e = gVar.d();
            } else {
                this.mState.e = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.Q.defaultOnMeasure(i2, i3);
            stopInterceptRequestLayout(false);
            this.mState.g = false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y yVar = (y) parcelable;
        this.mPendingSavedState = yVar;
        super.onRestoreInstanceState(yVar.P);
        o oVar = this.mLayout;
        if (oVar != null && (parcelable2 = this.mPendingSavedState.R) != null) {
            oVar.m0(parcelable2);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable;
        y yVar = new y(super.onSaveInstanceState());
        y yVar2 = this.mPendingSavedState;
        if (yVar2 != null) {
            yVar.R = yVar2.R;
        } else {
            o oVar = this.mLayout;
            if (oVar != null) {
                parcelable = oVar.n0();
            } else {
                parcelable = null;
            }
            yVar.R = parcelable;
        }
        return yVar;
    }

    public void onScrollStateChanged(int i2) {
    }

    public void onScrolled(int i2, int i3) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        boolean z3 = false;
        if (this.mLayoutSuppressed || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (dispatchToOnItemTouchListeners(motionEvent)) {
            cancelScroll();
            return true;
        }
        o oVar = this.mLayout;
        if (oVar == null) {
            return false;
        }
        boolean o2 = oVar.o();
        boolean p2 = this.mLayout.p();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.mNestedOffsets;
        obtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                onPointerUp(motionEvent);
                            }
                        } else {
                            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                            int x2 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.mLastTouchX = x2;
                            this.mInitialTouchX = x2;
                            int y2 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.mLastTouchY = y2;
                            this.mInitialTouchY = y2;
                        }
                    } else {
                        cancelScroll();
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                    if (findPointerIndex < 0) {
                        StringBuilder b2 = e5.b("Error processing scroll; pointer index for id ");
                        b2.append(this.mScrollPointerId);
                        b2.append(" not found. Did any MotionEvents get skipped?");
                        Log.e(TAG, b2.toString());
                        return false;
                    }
                    int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    int i6 = this.mLastTouchX - x3;
                    int i7 = this.mLastTouchY - y3;
                    if (this.mScrollState != 1) {
                        if (o2) {
                            int i8 = this.mTouchSlop;
                            if (i6 > 0) {
                                i6 = Math.max(0, i6 - i8);
                            } else {
                                i6 = Math.min(0, i6 + i8);
                            }
                            if (i6 != 0) {
                                z2 = true;
                                if (p2) {
                                    int i9 = this.mTouchSlop;
                                    if (i7 > 0) {
                                        i7 = Math.max(0, i7 - i9);
                                    } else {
                                        i7 = Math.min(0, i7 + i9);
                                    }
                                    if (i7 != 0) {
                                        z2 = true;
                                    }
                                }
                                if (z2) {
                                    setScrollState(1);
                                }
                            }
                        }
                        z2 = false;
                        if (p2) {
                        }
                        if (z2) {
                        }
                    }
                    int i10 = i6;
                    int i11 = i7;
                    if (this.mScrollState == 1) {
                        int[] iArr3 = this.mReusableIntPair;
                        iArr3[0] = 0;
                        iArr3[1] = 0;
                        if (o2) {
                            i2 = i10;
                        } else {
                            i2 = 0;
                        }
                        if (p2) {
                            i3 = i11;
                        } else {
                            i3 = 0;
                        }
                        if (dispatchNestedPreScroll(i2, i3, iArr3, this.mScrollOffset, 0)) {
                            int[] iArr4 = this.mReusableIntPair;
                            i10 -= iArr4[0];
                            i11 -= iArr4[1];
                            int[] iArr5 = this.mNestedOffsets;
                            int i12 = iArr5[0];
                            int[] iArr6 = this.mScrollOffset;
                            iArr5[0] = i12 + iArr6[0];
                            iArr5[1] = iArr5[1] + iArr6[1];
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        int i13 = i11;
                        int[] iArr7 = this.mScrollOffset;
                        this.mLastTouchX = x3 - iArr7[0];
                        this.mLastTouchY = y3 - iArr7[1];
                        if (o2) {
                            i4 = i10;
                        } else {
                            i4 = 0;
                        }
                        if (p2) {
                            i5 = i13;
                        } else {
                            i5 = 0;
                        }
                        if (scrollByInternal(i4, i5, motionEvent)) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        androidx.recyclerview.widget.m mVar = this.mGapWorker;
                        if (mVar != null && (i10 != 0 || i13 != 0)) {
                            mVar.b(this, i10, i13);
                        }
                    }
                }
            } else {
                this.mVelocityTracker.addMovement(obtain);
                this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
                if (o2) {
                    f2 = -this.mVelocityTracker.getXVelocity(this.mScrollPointerId);
                } else {
                    f2 = 0.0f;
                }
                if (p2) {
                    f3 = -this.mVelocityTracker.getYVelocity(this.mScrollPointerId);
                } else {
                    f3 = 0.0f;
                }
                if ((f2 == 0.0f && f3 == 0.0f) || !fling((int) f2, (int) f3)) {
                    setScrollState(0);
                }
                resetScroll();
                z3 = true;
            }
        } else {
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x4 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x4;
            this.mInitialTouchX = x4;
            int y4 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y4;
            this.mInitialTouchY = y4;
            int i14 = o2;
            if (p2) {
                i14 = (o2 ? 1 : 0) | 2;
            }
            startNestedScroll(i14, 0);
        }
        if (!z3) {
            this.mVelocityTracker.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public void postAnimationRunner() {
        if (!this.mPostedAnimatorRunner && this.mIsAttached) {
            Runnable runnable = this.mItemAnimatorRunner;
            WeakHashMap<View, String> weakHashMap = a41.a;
            postOnAnimation(runnable);
            this.mPostedAnimatorRunner = true;
        }
    }

    public void processDataSetCompletelyChanged(boolean z2) {
        this.mDispatchItemsChangedEvent = z2 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(d0 d0Var, l.c cVar) {
        boolean z2 = false;
        int i2 = (d0Var.Y & (-8193)) | 0;
        d0Var.Y = i2;
        if (this.mState.h) {
            if ((i2 & 2) != 0) {
                z2 = true;
            }
            if (z2 && !d0Var.s() && !d0Var.z()) {
                this.mViewInfoStore.b.f(getChangedHolderKey(d0Var), d0Var);
            }
        }
        this.mViewInfoStore.b(d0Var, cVar);
    }

    public void removeAndRecycleViews() {
        l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.f();
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.q0(this.mRecycler);
            this.mLayout.r0(this.mRecycler);
        }
        v vVar = this.mRecycler;
        vVar.a.clear();
        vVar.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean removeAnimatingView(View view) {
        boolean z2;
        startInterceptRequestLayout();
        androidx.recyclerview.widget.b bVar = this.mChildHelper;
        int indexOfChild = RecyclerView.this.indexOfChild(view);
        if (indexOfChild == -1) {
            bVar.m(view);
        } else if (bVar.b.d(indexOfChild)) {
            bVar.b.f(indexOfChild);
            bVar.m(view);
            ((e) bVar.a).b(indexOfChild);
        } else {
            z2 = false;
            if (z2) {
                d0 childViewHolderInt = getChildViewHolderInt(view);
                this.mRecycler.k(childViewHolderInt);
                this.mRecycler.h(childViewHolderInt);
            }
            stopInterceptRequestLayout(!z2);
            return z2;
        }
        z2 = true;
        if (z2) {
        }
        stopInterceptRequestLayout(!z2);
        return z2;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z2) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.v()) {
                childViewHolderInt.Y &= -257;
            } else if (!childViewHolderInt.z()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(e5.a(this, sb));
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z2);
    }

    public void removeItemDecoration(n nVar) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.m("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(nVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 >= 0 && i2 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i2));
            return;
        }
        throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(q qVar) {
        List<q> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(qVar);
    }

    public void removeOnItemTouchListener(s sVar) {
        this.mOnItemTouchListeners.remove(sVar);
        if (this.mInterceptingOnItemTouchListener == sVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(t tVar) {
        List<t> list = this.mScrollListeners;
        if (list != null) {
            list.remove(tVar);
        }
    }

    public void repositionShadowingViews() {
        d0 d0Var;
        int e2 = this.mChildHelper.e();
        for (int i2 = 0; i2 < e2; i2++) {
            View d2 = this.mChildHelper.d(i2);
            d0 childViewHolder = getChildViewHolder(d2);
            if (childViewHolder != null && (d0Var = childViewHolder.X) != null) {
                View view = d0Var.P;
                int left = d2.getLeft();
                int top = d2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        boolean z2;
        z zVar = this.mLayout.T;
        boolean z3 = true;
        if (zVar != null && zVar.e) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && !isComputingLayout()) {
            z3 = false;
        }
        if (!z3 && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.mLayout.t0(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.mOnItemTouchListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mOnItemTouchListeners.get(i2).c();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public void saveOldPositions() {
        int h2 = this.mChildHelper.h();
        for (int i2 = 0; i2 < h2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i2));
            if (!childViewHolderInt.z() && childViewHolderInt.S == -1) {
                childViewHolderInt.S = childViewHolderInt.R;
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.mLayoutSuppressed) {
        } else {
            boolean o2 = oVar.o();
            boolean p2 = this.mLayout.p();
            if (o2 || p2) {
                if (!o2) {
                    i2 = 0;
                }
                if (!p2) {
                    i3 = 0;
                }
                scrollByInternal(i2, i3, null);
            }
        }
    }

    public boolean scrollByInternal(int i2, int i3, MotionEvent motionEvent) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        boolean z3;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i2, i3, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i4 = i9;
            i5 = i8;
            i6 = i2 - i8;
            i7 = i3 - i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i5, i4, i6, i7, this.mScrollOffset, 0, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i10 = iArr4[0];
        int i11 = i6 - i10;
        int i12 = iArr4[1];
        int i13 = i7 - i12;
        if (i10 == 0 && i12 == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        int i14 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i15 = iArr5[0];
        this.mLastTouchX = i14 - i15;
        int i16 = this.mLastTouchY;
        int i17 = iArr5[1];
        this.mLastTouchY = i16 - i17;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i15;
        iArr6[1] = iArr6[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null) {
                if ((motionEvent.getSource() & 8194) == 8194) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    pullGlows(motionEvent.getX(), i11, motionEvent.getY(), i13);
                }
            }
            considerReleasingGlowsOnScroll(i2, i3);
        }
        if (i5 != 0 || i4 != 0) {
            dispatchOnScrolled(i5, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (z2 || i5 != 0 || i4 != 0) {
            return true;
        }
        return false;
    }

    public void scrollStep(int i2, int i3, int[] iArr) {
        int i4;
        int i5;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        int i6 = k01.a;
        Trace.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        if (i2 != 0) {
            i4 = this.mLayout.v0(i2, this.mRecycler, this.mState);
        } else {
            i4 = 0;
        }
        if (i3 != 0) {
            i5 = this.mLayout.x0(i3, this.mRecycler, this.mState);
        } else {
            i5 = 0;
        }
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = i4;
            iArr[1] = i5;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i2) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        oVar.w0(i2);
        awakenScrollBars();
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.u uVar) {
        this.mAccessibilityDelegate = uVar;
        a41.n(this, uVar);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j jVar) {
        if (jVar == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = jVar;
        setChildrenDrawingOrderEnabled(jVar != null);
    }

    public boolean setChildImportantForAccessibilityInternal(d0 d0Var, int i2) {
        if (isComputingLayout()) {
            d0Var.f0 = i2;
            this.mPendingAccessibilityImportanceChange.add(d0Var);
            return false;
        }
        View view = d0Var.P;
        WeakHashMap<View, String> weakHashMap = a41.a;
        view.setImportantForAccessibility(i2);
        return true;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z2;
        super.setClipToPadding(z2);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(k kVar) {
        kVar.getClass();
        this.mEdgeEffectFactory = kVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z2) {
        this.mHasFixedSize = z2;
    }

    public void setItemAnimator(l lVar) {
        l lVar2 = this.mItemAnimator;
        if (lVar2 != null) {
            lVar2.f();
            this.mItemAnimator.a = null;
        }
        this.mItemAnimator = lVar;
        if (lVar != null) {
            lVar.a = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i2) {
        v vVar = this.mRecycler;
        vVar.e = i2;
        vVar.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(o oVar) {
        if (oVar == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            l lVar = this.mItemAnimator;
            if (lVar != null) {
                lVar.f();
            }
            this.mLayout.q0(this.mRecycler);
            this.mLayout.r0(this.mRecycler);
            v vVar = this.mRecycler;
            vVar.a.clear();
            vVar.e();
            if (this.mIsAttached) {
                o oVar2 = this.mLayout;
                oVar2.V = false;
                oVar2.Z(this);
            }
            this.mLayout.C0(null);
            this.mLayout = null;
        } else {
            v vVar2 = this.mRecycler;
            vVar2.a.clear();
            vVar2.e();
        }
        androidx.recyclerview.widget.b bVar = this.mChildHelper;
        bVar.b.g();
        int size = bVar.c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            e eVar = (e) bVar.a;
            eVar.getClass();
            d0 childViewHolderInt = getChildViewHolderInt((View) bVar.c.get(size));
            if (childViewHolderInt != null) {
                RecyclerView.this.setChildImportantForAccessibilityInternal(childViewHolderInt, childViewHolderInt.e0);
                childViewHolderInt.e0 = 0;
            }
            bVar.c.remove(size);
        }
        e eVar2 = (e) bVar.a;
        int a2 = eVar2.a();
        for (int i2 = 0; i2 < a2; i2++) {
            View childAt = RecyclerView.this.getChildAt(i2);
            RecyclerView.this.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        RecyclerView.this.removeAllViews();
        this.mLayout = oVar;
        if (oVar != null) {
            if (oVar.Q == null) {
                oVar.C0(this);
                if (this.mIsAttached) {
                    o oVar3 = this.mLayout;
                    oVar3.V = true;
                    oVar3.Y(this);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("LayoutManager ");
                sb.append(oVar);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(e5.a(oVar.Q, sb));
            }
        }
        this.mRecycler.l();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().g(z2);
    }

    public void setOnFlingListener(r rVar) {
        this.mOnFlingListener = rVar;
    }

    @Deprecated
    public void setOnScrollListener(t tVar) {
        this.mScrollListener = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.mPreserveFocusAfterLayout = z2;
    }

    public void setRecycledViewPool(u uVar) {
        u uVar2;
        v vVar = this.mRecycler;
        if (vVar.g != null) {
            uVar2.b--;
        }
        vVar.g = uVar;
        if (uVar != null && RecyclerView.this.getAdapter() != null) {
            vVar.g.b++;
        }
    }

    public void setRecyclerListener(w wVar) {
        this.mRecyclerListener = wVar;
    }

    void setScrollState(int i2) {
        if (i2 == this.mScrollState) {
            return;
        }
        this.mScrollState = i2;
        if (i2 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i2);
    }

    public void setScrollingTouchSlop(int i2) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 == 1) {
                scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                this.mTouchSlop = scaledTouchSlop;
            }
            Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
        }
        scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mTouchSlop = scaledTouchSlop;
    }

    public void setViewCacheExtension(b0 b0Var) {
        this.mRecycler.getClass();
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i2;
        int i3 = 0;
        if (!isComputingLayout()) {
            return false;
        }
        if (accessibilityEvent != null) {
            i2 = accessibilityEvent.getContentChangeTypes();
        } else {
            i2 = 0;
        }
        if (i2 != 0) {
            i3 = i2;
        }
        this.mEatenAccessibilityChangeFlags |= i3;
        return true;
    }

    public void smoothScrollBy(int i2, int i3) {
        smoothScrollBy(i2, i3, null);
    }

    public void smoothScrollBy(int i2, int i3, Interpolator interpolator) {
        smoothScrollBy(i2, i3, interpolator, UNDEFINED_DURATION);
    }

    public void smoothScrollBy(int i2, int i3, Interpolator interpolator, int i4) {
        smoothScrollBy(i2, i3, interpolator, i4, false);
    }

    public void smoothScrollBy(int i2, int i3, Interpolator interpolator, int i4, boolean z2) {
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.mLayoutSuppressed) {
        } else {
            if (!oVar.o()) {
                i2 = 0;
            }
            if (!this.mLayout.p()) {
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return;
            }
            if (!(i4 == Integer.MIN_VALUE || i4 > 0)) {
                scrollBy(i2, i3);
                return;
            }
            if (z2) {
                int i5 = i2 != 0 ? 1 : 0;
                if (i3 != 0) {
                    i5 |= 2;
                }
                startNestedScroll(i5, 1);
            }
            this.mViewFlinger.c(i2, i3, interpolator, i4);
        }
    }

    public void smoothScrollToPosition(int i2) {
        if (this.mLayoutSuppressed) {
            return;
        }
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.G0(this, i2);
        }
    }

    public void startInterceptRequestLayout() {
        int i2 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i2;
        if (i2 != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().h(i2, 0);
    }

    public boolean startNestedScroll(int i2, int i3) {
        return getScrollingChildHelper().h(i2, i3);
    }

    public void stopInterceptRequestLayout(boolean z2) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z2 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z2 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View, defpackage.c90
    public void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    public void stopNestedScroll(int i2) {
        getScrollingChildHelper().i(i2);
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z2) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void swapAdapter(g gVar, boolean z2) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, true, z2);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i2, int i3, Object obj) {
        int i4;
        int i5;
        int h2 = this.mChildHelper.h();
        int i6 = i3 + i2;
        for (int i7 = 0; i7 < h2; i7++) {
            View g2 = this.mChildHelper.g(i7);
            d0 childViewHolderInt = getChildViewHolderInt(g2);
            if (childViewHolderInt != null && !childViewHolderInt.z() && (i5 = childViewHolderInt.R) >= i2 && i5 < i6) {
                childViewHolderInt.c(2);
                childViewHolderInt.b(obj);
                ((p) g2.getLayoutParams()).R = true;
            }
        }
        v vVar = this.mRecycler;
        int size = vVar.c.size();
        while (true) {
            size--;
            if (size >= 0) {
                d0 d0Var = vVar.c.get(size);
                if (d0Var != null && (i4 = d0Var.R) >= i2 && i4 < i6) {
                    d0Var.c(2);
                    vVar.f(size);
                }
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().e(i2, i3, i4, i5, iArr, 0, null);
    }

    public boolean hasNestedScrollingParent(int i2) {
        return getScrollingChildHelper().f(i2) != null;
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return getScrollingChildHelper().e(i2, i3, i4, i5, iArr, i6, null);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.E(layoutParams);
        }
        throw new IllegalStateException(e5.a(this, e5.b("RecyclerView has no LayoutManager")));
    }
}