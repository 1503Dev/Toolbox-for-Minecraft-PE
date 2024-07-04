package defpackage;

import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.zip.Inflater;

/* renamed from: qc1  reason: default package */
public final class qc1 {
    public static final LinkedHashMap e;
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    static {
        od0[] od0VarArr = {new od0("default", "truefalse"), new od0("la-req-01", "\"iphoneos\"ipados\"cell\"tablet\"{\"carrier_name\":\",\"data_path\":\",\"device_api\":,\"screen_width\":,\"screen_height\":,\"display_dpi\":,\"device_type\":\"phone\",\"locale_language_code\":\",\"ln\":\",\"locale_country_code\":\",\"locale\":\",\"mac_address\":\"\",\"manufacturer\":\",\"device_brand\":\",\"media_path\":\",\"temp_storage_path\":\",\"memory_class\":,\"memory_used_mb\":,\"model\":\",\"device_model\":\",\"sdk_type\":\"android_native\",\"sdk_version\":\"4.\",\"network_type\":\"wifi\",\"os_version\":\",\"os_name\":\"android\",\"platform\":\"android\",\"arch\":\",\"user_id\":\"\",\"app_id\":\",\"app_bundle_name\":\",\"app_bundle_version\":\",\"battery_level\":1,\"cell_service_country_code\":\",\"timezone_ietf\":\",\"timezone_gmt_m\":,\"timezone_dst_m\":,\"controller_version\":\"3.\",\"current_orientation\":0,\"cleartext_permitted\":true,\"density\":,\"dark_mode\":false,\"available_stores\":[],\"advertiser_id\":\",\"limit_tracking\":false,\"adc_alt_id\":\"}"), new od0("la-res-01", "{\"controller\":{\"url\":\"https://adc-ad-assets.adtilt.com/launch/__controllers__/4.0.0/controller.js\",\"sha1\":,\"version\":\"3.\"},\"libraries\":[],\"item\":0,\"logging\":{\"log_private\":false,\"send_level\":1,\"enable_crash_reporting\":false,\"print_level\":3,\"report_interval_ms\":5000},\"metadata\":{\"controller_heartbeat_interval\":300000,\"controller_heartbeat_timeout\":15000,\"ad_request_timeout\":20000,\"iab_url\":\"https://adc-ad-assets.adtilt.com/launch/__libs__/omsdk/omsdk-v1.js\",\"odt_config\":{\"version\":,\"streams\":[{\"stream\":\"events\",\"request_types\":[\"start\",\"html5_interaction\",\"in_video_engagement\",\"download\",\"info\",\"viewable_impression\",\"complete\",\"skip\",\"continue\",\"midpoint\",\"first_quartile\",\"third_quartile\",\"reward_v4vc\"configure\"session_start\",\"session_end\",\"session_resume\",\"session_pause\"]\"table_name\"max_rows\": GROUP BY ]},\"calculate_odt_timeout\":500,\"async_odt_query\":false},\"status\":\"success\",\"pie\":\"}")};
        LinkedHashMap linkedHashMap = new LinkedHashMap((int) ((3 / 0.75f) + 1.0f));
        for (int i = 0; i < 3; i++) {
            od0 od0Var = od0VarArr[i];
            linkedHashMap.put(od0Var.P, od0Var.Q);
        }
        e = linkedHashMap;
    }

    public qc1(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String a(byte[] bArr) {
        String str = this.d;
        Inflater inflater = new Inflater();
        try {
            inflater.setInput(bArr);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[512];
            while (!inflater.finished()) {
                byteArrayOutputStream.write(bArr2, 0, inflater.inflate(bArr2));
                if (inflater.needsDictionary()) {
                    Charset charset = sc1.a;
                    if (str == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    inflater.setDictionary(str.getBytes(charset));
                }
            }
            String str2 = new String(byteArrayOutputStream.toByteArray(), sc1.a);
            vj.l(byteArrayOutputStream, null);
            return str2;
        } finally {
            inflater.end();
        }
    }
}