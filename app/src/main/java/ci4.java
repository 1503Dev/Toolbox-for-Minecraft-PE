package defpackage;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* renamed from: ci4  reason: default package */
public final class ci4 {
    public final List a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final long f;
    public final boolean g;
    public final String h;
    public final fb3 i;
    public final Bundle j;
    public final String k;
    public final String l;
    public final String m;

    public ci4(JsonReader jsonReader) {
        List emptyList = Collections.emptyList();
        Bundle bundle = new Bundle();
        jsonReader.beginObject();
        int i = 0;
        String str = "";
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        fb3 fb3Var = null;
        long j = 0;
        boolean z = false;
        String str5 = str4;
        String str6 = str5;
        int i2 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            String str7 = str;
            if ("nofill_urls".equals(nextName)) {
                emptyList = mq2.c(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str2 = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str3 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i2 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j = jsonReader.nextLong();
            } else {
                l92 l92Var = x92.W6;
                String str8 = str6;
                w82 w82Var = w82.d;
                String str9 = str5;
                if (((Boolean) w82Var.c.a(l92Var)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    fb3Var = new fb3(jsonReader);
                } else if ("bidding_data".equals(nextName)) {
                    str4 = jsonReader.nextString();
                } else if ("adapter_response_replacement_key".equals(nextName)) {
                    str7 = jsonReader.nextString();
                } else {
                    if ("response_info_extras".equals(nextName)) {
                        if (((Boolean) w82Var.c.a(x92.M5)).booleanValue()) {
                            try {
                                Bundle a = mq2.a(mq2.f(jsonReader));
                                if (a != null) {
                                    bundle = a;
                                }
                            } catch (IOException | JSONException unused) {
                            } catch (IllegalStateException unused2) {
                            }
                        }
                    } else if ("adRequestPostBody".equals(nextName)) {
                        if (((Boolean) w82Var.c.a(x92.Q7)).booleanValue()) {
                            str6 = jsonReader.nextString();
                            str5 = str9;
                            str = str7;
                        }
                    } else if ("adRequestUrl".equals(nextName)) {
                        if (((Boolean) w82Var.c.a(x92.Q7)).booleanValue()) {
                            str5 = jsonReader.nextString();
                            str6 = str8;
                            str = str7;
                        }
                    }
                    jsonReader.skipValue();
                }
                str6 = str8;
                str5 = str9;
                str = str7;
            }
            str = str7;
        }
        jsonReader.endObject();
        this.a = emptyList;
        this.c = i;
        this.b = str2;
        this.d = str3;
        this.e = i2;
        this.f = j;
        this.i = fb3Var;
        this.g = z;
        this.h = str4;
        this.j = bundle;
        this.k = str5;
        this.l = str6;
        this.m = str;
    }
}