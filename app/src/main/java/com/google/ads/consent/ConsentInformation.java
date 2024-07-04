package com.google.ads.consent;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import defpackage.cy0;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ConsentInformation {
    private static final String CONSENT_DATA_KEY = "consent_string";
    private static final String MOBILE_ADS_SERVER_URL = "https://adservice.google.com/getconfig/pubvendors";
    private static final String PREFERENCES_FILE_KEY = "mobileads_consent";
    private static final String TAG = "ConsentInformation";
    private static ConsentInformation instance;
    private final Context context;
    private DebugGeography debugGeography = DebugGeography.DEBUG_GEOGRAPHY_DISABLED;
    private List<String> testDevices = new ArrayList();
    private String hashedDeviceId = d();

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class AdNetworkLookupResponse {
        @wq0("company_ids")
        private List<String> companyIds;
        @wq0("ad_network_id")
        private String id;
        @wq0("is_npa")
        private boolean isNPA;
        @wq0("lookup_failed")
        private boolean lookupFailed;
        @wq0("not_found")
        private boolean notFound;
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class ConsentInfoUpdateResponse {
        public String responseInfo;
        public boolean success;

        public ConsentInfoUpdateResponse(String str, boolean z) {
            this.success = z;
            this.responseInfo = str;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class ConsentInfoUpdateTask extends AsyncTask<Void, Void, ConsentInfoUpdateResponse> {
        private static final String UPDATE_SUCCESS = "Consent update successful.";
        private final ConsentInformation consentInformation;
        private final ConsentInfoUpdateListener listener;
        private final List<String> publisherIds;
        private final String url = ConsentInformation.MOBILE_ADS_SERVER_URL;

        public ConsentInfoUpdateTask(ConsentInformation consentInformation, List list, cy0.a aVar) {
            this.listener = aVar;
            this.publisherIds = list;
            this.consentInformation = consentInformation;
        }

        public static String a(InputStream inputStream) {
            byte[] bArr = new byte[1024];
            StringBuilder sb = new StringBuilder();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            while (true) {
                try {
                    try {
                        int read = bufferedInputStream.read(bArr);
                        if (read != -1) {
                            sb.append(new String(bArr, 0, read));
                        } else {
                            try {
                                break;
                            } catch (IOException e) {
                                Log.e(ConsentInformation.TAG, e.getLocalizedMessage());
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e2) {
                            Log.e(ConsentInformation.TAG, e2.getLocalizedMessage());
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    Log.e(ConsentInformation.TAG, e3.getLocalizedMessage());
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e4) {
                        Log.e(ConsentInformation.TAG, e4.getLocalizedMessage());
                    }
                    return null;
                }
            }
            bufferedInputStream.close();
            return sb.toString();
        }

        @Override // android.os.AsyncTask
        public final ConsentInfoUpdateResponse doInBackground(Void[] voidArr) {
            ConsentInfoUpdateResponse consentInfoUpdateResponse;
            HttpURLConnection httpURLConnection;
            String join = TextUtils.join(",", this.publisherIds);
            ConsentData i = this.consentInformation.i();
            Uri.Builder appendQueryParameter = Uri.parse(this.url).buildUpon().appendQueryParameter("pubs", join).appendQueryParameter("es", "2").appendQueryParameter("plat", i.d()).appendQueryParameter("v", i.e());
            if (this.consentInformation.h() && this.consentInformation.c() != DebugGeography.DEBUG_GEOGRAPHY_DISABLED) {
                appendQueryParameter = appendQueryParameter.appendQueryParameter("debug_geo", this.consentInformation.c().b().toString());
            }
            try {
                httpURLConnection = (HttpURLConnection) new URL(appendQueryParameter.build().toString()).openConnection();
            } catch (Exception e) {
                consentInfoUpdateResponse = new ConsentInfoUpdateResponse(e.getLocalizedMessage(), false);
            }
            if (httpURLConnection.getResponseCode() == 200) {
                String a = a(httpURLConnection.getInputStream());
                httpURLConnection.disconnect();
                ConsentInformation.a(this.consentInformation, a, this.publisherIds);
                return new ConsentInfoUpdateResponse(UPDATE_SUCCESS, true);
            }
            consentInfoUpdateResponse = new ConsentInfoUpdateResponse(httpURLConnection.getResponseMessage(), false);
            return consentInfoUpdateResponse;
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(ConsentInfoUpdateResponse consentInfoUpdateResponse) {
            ConsentStatus b;
            if (consentInfoUpdateResponse.success) {
                ConsentInfoUpdateListener consentInfoUpdateListener = this.listener;
                ConsentInformation consentInformation = this.consentInformation;
                synchronized (consentInformation) {
                    b = consentInformation.i().b();
                }
                consentInfoUpdateListener.b(b);
                return;
            }
            this.listener.a();
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class ServerResponse {
        @wq0("ad_network_ids")
        public List<AdNetworkLookupResponse> adNetworkLookupResponses;
        public List<AdProvider> companies;
        @wq0("is_request_in_eea_or_unknown")
        public Boolean isRequestLocationInEeaOrUnknown;
    }

    public ConsentInformation(Context context) {
        this.context = context.getApplicationContext();
    }

    public static void a(ConsentInformation consentInformation, String str, List list) {
        boolean z;
        HashSet<AdProvider> hashSet;
        synchronized (consentInformation) {
            ServerResponse serverResponse = (ServerResponse) new xt().e(ServerResponse.class, str);
            l(serverResponse);
            HashSet hashSet2 = new HashSet();
            List<AdNetworkLookupResponse> list2 = serverResponse.adNetworkLookupResponses;
            boolean z2 = true;
            if (list2 != null) {
                z = false;
                for (AdNetworkLookupResponse adNetworkLookupResponse : list2) {
                    if (adNetworkLookupResponse.isNPA) {
                        List list3 = adNetworkLookupResponse.companyIds;
                        if (list3 != null) {
                            hashSet2.addAll(list3);
                        }
                        z = true;
                    }
                }
            } else {
                z = false;
            }
            List<AdProvider> list4 = serverResponse.companies;
            if (list4 == null) {
                hashSet = new HashSet<>();
            } else if (z) {
                ArrayList arrayList = new ArrayList();
                for (AdProvider adProvider : list4) {
                    if (hashSet2.contains(adProvider.a())) {
                        arrayList.add(adProvider);
                    }
                }
                hashSet = new HashSet<>(arrayList);
            } else {
                hashSet = new HashSet<>(serverResponse.companies);
            }
            ConsentData i = consentInformation.i();
            if (i.f() == z) {
                z2 = false;
            }
            i.m(z);
            i.o(str);
            i.n(new HashSet<>(list));
            i.i(hashSet);
            i.p(serverResponse.isRequestLocationInEeaOrUnknown.booleanValue());
            if (serverResponse.isRequestLocationInEeaOrUnknown.booleanValue() && (!i.c().containsAll(i.a()) || z2)) {
                i.j("sdk");
                i.k(ConsentStatus.UNKNOWN);
                i.l(new HashSet<>());
            }
            consentInformation.k(i);
        }
    }

    public static synchronized ConsentInformation e(Context context) {
        ConsentInformation consentInformation;
        synchronized (ConsentInformation.class) {
            if (instance == null) {
                instance = new ConsentInformation(context);
            }
            consentInformation = instance;
        }
        return consentInformation;
    }

    public static boolean f() {
        String str = Build.FINGERPRINT;
        if (!str.startsWith("generic") && !str.startsWith("unknown")) {
            String str2 = Build.MODEL;
            if (!str2.contains("google_sdk") && !str2.contains("Emulator") && !str2.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !"google_sdk".equals(Build.PRODUCT))) {
                return false;
            }
        }
        return true;
    }

    public static void l(ServerResponse serverResponse) {
        Boolean bool = serverResponse.isRequestLocationInEeaOrUnknown;
        if (bool == null) {
            throw new Exception("Could not parse Event FE preflight response.");
        }
        if (serverResponse.companies == null && bool.booleanValue()) {
            throw new Exception("Could not parse Event FE preflight response.");
        }
        if (serverResponse.isRequestLocationInEeaOrUnknown.booleanValue()) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (AdNetworkLookupResponse adNetworkLookupResponse : serverResponse.adNetworkLookupResponses) {
                if (adNetworkLookupResponse.lookupFailed) {
                    hashSet.add(adNetworkLookupResponse.id);
                }
                if (adNetworkLookupResponse.notFound) {
                    hashSet2.add(adNetworkLookupResponse.id);
                }
            }
            if (hashSet.isEmpty() && hashSet2.isEmpty()) {
                return;
            }
            StringBuilder sb = new StringBuilder("Response error.");
            if (!hashSet.isEmpty()) {
                sb.append(String.format(" Lookup failure for: %s.", TextUtils.join(",", hashSet)));
            }
            if (!hashSet2.isEmpty()) {
                sb.append(String.format(" Publisher Ids not found: %s", TextUtils.join(",", hashSet2)));
            }
            throw new Exception(sb.toString());
        }
    }

    public final void b() {
        this.testDevices.add("4CAE361E10CCAB546FB0EDB49B0DF023");
    }

    public final DebugGeography c() {
        return this.debugGeography;
    }

    public final String d() {
        ContentResolver contentResolver = this.context.getContentResolver();
        String str = null;
        String str2 = ((contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id")) == null || f()) ? "emulator" : "emulator";
        for (int i = 0; i < 3; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str2.getBytes());
                str = String.format("%032X", new BigInteger(1, messageDigest.digest()));
                break;
            } catch (ArithmeticException unused) {
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return str;
    }

    public final boolean g() {
        return i().g();
    }

    public final boolean h() {
        return f() || this.testDevices.contains(this.hashedDeviceId);
    }

    public final ConsentData i() {
        String string = this.context.getSharedPreferences(PREFERENCES_FILE_KEY, 0).getString(CONSENT_DATA_KEY, "");
        return TextUtils.isEmpty(string) ? new ConsentData() : (ConsentData) new xt().e(ConsentData.class, string);
    }

    public final void j(String[] strArr, cy0.a aVar) {
        String sb;
        if (h()) {
            sb = "This request is sent from a test device.";
        } else {
            String d = d();
            StringBuilder sb2 = new StringBuilder(String.valueOf(d).length() + 93);
            sb2.append("Use ConsentInformation.getInstance(context).addTestDevice(\"");
            sb2.append(d);
            sb2.append("\") to get test ads on this device.");
            sb = sb2.toString();
        }
        Log.i(TAG, sb);
        new ConsentInfoUpdateTask(this, Arrays.asList(strArr), aVar).execute(new Void[0]);
    }

    public final void k(ConsentData consentData) {
        SharedPreferences.Editor edit = this.context.getSharedPreferences(PREFERENCES_FILE_KEY, 0).edit();
        edit.putString(CONSENT_DATA_KEY, new xt().i(consentData));
        edit.apply();
    }
}