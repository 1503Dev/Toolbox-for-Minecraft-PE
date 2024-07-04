package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: fy2  reason: default package */
public final class fy2 {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final long m;
    public final long n;

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fy2(String str) {
        JSONObject jSONObject;
        long j;
        long j2;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
            this.a = a(jSONObject, "aggressive_media_codec_release", x92.C);
            this.b = b(jSONObject, "byte_buffer_precache_limit", x92.i);
            this.c = b(jSONObject, "exo_cache_buffer_size", x92.q);
            this.d = b(jSONObject, "exo_connect_timeout_millis", x92.e);
            p92 p92Var = x92.d;
            if (jSONObject != null) {
                try {
                    jSONObject.getString("exo_player_version");
                } catch (JSONException unused2) {
                }
                this.e = b(jSONObject, "exo_read_timeout_millis", x92.f);
                this.f = b(jSONObject, "load_check_interval_bytes", x92.g);
                this.g = b(jSONObject, "player_precache_limit", x92.h);
                this.h = b(jSONObject, "socket_receive_buffer_size", x92.j);
                this.i = a(jSONObject, "use_cache_data_source", x92.y3);
                b(jSONObject, "min_retry_count", x92.k);
                this.j = a(jSONObject, "treat_load_exception_as_non_fatal", x92.m);
                this.k = a(jSONObject, "enable_multiple_video_playback", x92.y1);
                this.l = a(jSONObject, "use_range_http_data_source", x92.A1);
                n92 n92Var = x92.B1;
                if (jSONObject != null) {
                    try {
                        j = jSONObject.getLong("range_http_data_source_high_water_mark");
                    } catch (JSONException unused3) {
                    }
                    this.m = j;
                    n92 n92Var2 = x92.C1;
                    if (jSONObject != null) {
                        try {
                            j2 = jSONObject.getLong("range_http_data_source_low_water_mark");
                        } catch (JSONException unused4) {
                        }
                        this.n = j2;
                    }
                    j2 = ((Long) w82.d.c.a(n92Var2)).longValue();
                    this.n = j2;
                }
                j = ((Long) w82.d.c.a(n92Var)).longValue();
                this.m = j;
                n92 n92Var22 = x92.C1;
                if (jSONObject != null) {
                }
                j2 = ((Long) w82.d.c.a(n92Var22)).longValue();
                this.n = j2;
            }
            String str2 = (String) w82.d.c.a(p92Var);
            this.e = b(jSONObject, "exo_read_timeout_millis", x92.f);
            this.f = b(jSONObject, "load_check_interval_bytes", x92.g);
            this.g = b(jSONObject, "player_precache_limit", x92.h);
            this.h = b(jSONObject, "socket_receive_buffer_size", x92.j);
            this.i = a(jSONObject, "use_cache_data_source", x92.y3);
            b(jSONObject, "min_retry_count", x92.k);
            this.j = a(jSONObject, "treat_load_exception_as_non_fatal", x92.m);
            this.k = a(jSONObject, "enable_multiple_video_playback", x92.y1);
            this.l = a(jSONObject, "use_range_http_data_source", x92.A1);
            n92 n92Var3 = x92.B1;
            if (jSONObject != null) {
            }
            j = ((Long) w82.d.c.a(n92Var3)).longValue();
            this.m = j;
            n92 n92Var222 = x92.C1;
            if (jSONObject != null) {
            }
            j2 = ((Long) w82.d.c.a(n92Var222)).longValue();
            this.n = j2;
        }
        jSONObject = null;
        this.a = a(jSONObject, "aggressive_media_codec_release", x92.C);
        this.b = b(jSONObject, "byte_buffer_precache_limit", x92.i);
        this.c = b(jSONObject, "exo_cache_buffer_size", x92.q);
        this.d = b(jSONObject, "exo_connect_timeout_millis", x92.e);
        p92 p92Var2 = x92.d;
        if (jSONObject != null) {
        }
        String str22 = (String) w82.d.c.a(p92Var2);
        this.e = b(jSONObject, "exo_read_timeout_millis", x92.f);
        this.f = b(jSONObject, "load_check_interval_bytes", x92.g);
        this.g = b(jSONObject, "player_precache_limit", x92.h);
        this.h = b(jSONObject, "socket_receive_buffer_size", x92.j);
        this.i = a(jSONObject, "use_cache_data_source", x92.y3);
        b(jSONObject, "min_retry_count", x92.k);
        this.j = a(jSONObject, "treat_load_exception_as_non_fatal", x92.m);
        this.k = a(jSONObject, "enable_multiple_video_playback", x92.y1);
        this.l = a(jSONObject, "use_range_http_data_source", x92.A1);
        n92 n92Var32 = x92.B1;
        if (jSONObject != null) {
        }
        j = ((Long) w82.d.c.a(n92Var32)).longValue();
        this.m = j;
        n92 n92Var2222 = x92.C1;
        if (jSONObject != null) {
        }
        j2 = ((Long) w82.d.c.a(n92Var2222)).longValue();
        this.n = j2;
    }

    public static final boolean a(JSONObject jSONObject, String str, l92 l92Var) {
        boolean booleanValue = ((Boolean) w82.d.c.a(l92Var)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
                return booleanValue;
            }
        }
        return booleanValue;
    }

    public static final int b(JSONObject jSONObject, String str, m92 m92Var) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) w82.d.c.a(m92Var)).intValue();
    }
}