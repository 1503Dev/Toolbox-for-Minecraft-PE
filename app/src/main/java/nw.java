package defpackage;

/* renamed from: nw  reason: default package */
public interface nw {
    @qs("config")
    pb<hs0> a(@wg0("v") int i);

    @gd0("interact/load")
    pb<p2> b(@wg0("id") int i, @wg0("unit") String str, @wg0("type") int i2, @wg0("sid") String str2);

    @gd0("interact/close")
    pb<p2> c(@wg0("token") String str, @wg0("reason") int i);

    @gd0("interact/click")
    pb<p2> d(@wg0("token") String str);

    @gd0("interact/view")
    pb<p2> e(@wg0("token") String str);
}