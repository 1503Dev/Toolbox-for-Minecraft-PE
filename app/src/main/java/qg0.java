package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ChangedPackages;
import android.content.pm.FeatureInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.SharedLibraryInfo;
import android.content.pm.VersionedPackage;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.UserHandle;
import java.util.List;

/* renamed from: qg0  reason: default package */
public final class qg0 extends PackageManager {
    public PackageManager a;
    public String b;
    public String c;

    public qg0(PackageManager packageManager, String str, String str2) {
        this.a = packageManager;
        this.b = str;
        this.c = str2;
    }

    @Override // android.content.pm.PackageManager
    public final void addPackageToPreferred(String str) {
        this.a.addPackageToPreferred(str);
    }

    @Override // android.content.pm.PackageManager
    public final boolean addPermission(PermissionInfo permissionInfo) {
        return this.a.addPermission(permissionInfo);
    }

    @Override // android.content.pm.PackageManager
    public final boolean addPermissionAsync(PermissionInfo permissionInfo) {
        return this.a.addPermissionAsync(permissionInfo);
    }

    @Override // android.content.pm.PackageManager
    public final void addPreferredActivity(IntentFilter intentFilter, int i, ComponentName[] componentNameArr, ComponentName componentName) {
        this.a.addPreferredActivity(intentFilter, i, componentNameArr, componentName);
    }

    @Override // android.content.pm.PackageManager
    public final boolean canRequestPackageInstalls() {
        return false;
    }

    @Override // android.content.pm.PackageManager
    public final String[] canonicalToCurrentPackageNames(String[] strArr) {
        return this.a.canonicalToCurrentPackageNames(strArr);
    }

    @Override // android.content.pm.PackageManager
    public final int checkPermission(String str, String str2) {
        return this.a.checkPermission(str, str2);
    }

    @Override // android.content.pm.PackageManager
    public final int checkSignatures(int i, int i2) {
        return this.a.checkSignatures(i, i2);
    }

    @Override // android.content.pm.PackageManager
    public final int checkSignatures(String str, String str2) {
        return this.a.checkSignatures(str, str2);
    }

    @Override // android.content.pm.PackageManager
    public final void clearInstantAppCookie() {
    }

    @Override // android.content.pm.PackageManager
    public final void clearPackagePreferredActivities(String str) {
        this.a.clearPackagePreferredActivities(str);
    }

    @Override // android.content.pm.PackageManager
    public final String[] currentToCanonicalPackageNames(String[] strArr) {
        return this.a.currentToCanonicalPackageNames(strArr);
    }

    @Override // android.content.pm.PackageManager
    public final void extendVerificationTimeout(int i, int i2, long j) {
        this.a.extendVerificationTimeout(i, i2, j);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityBanner(ComponentName componentName) {
        return og0.a(this.a, componentName);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityBanner(Intent intent) {
        return pg0.a(this.a, intent);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityIcon(ComponentName componentName) {
        return this.a.getActivityIcon(componentName);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityIcon(Intent intent) {
        return this.a.getActivityIcon(intent);
    }

    @Override // android.content.pm.PackageManager
    public final ActivityInfo getActivityInfo(ComponentName componentName, int i) {
        if (componentName.getClassName().equals(this.b)) {
            ActivityInfo activityInfo = this.a.getActivityInfo(componentName, i);
            activityInfo.applicationInfo.nativeLibraryDir = this.c;
            return activityInfo;
        }
        return this.a.getActivityInfo(componentName, i);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityLogo(ComponentName componentName) {
        return this.a.getActivityLogo(componentName);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityLogo(Intent intent) {
        return this.a.getActivityLogo(intent);
    }

    @Override // android.content.pm.PackageManager
    public final List<PermissionGroupInfo> getAllPermissionGroups(int i) {
        return this.a.getAllPermissionGroups(i);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationBanner(ApplicationInfo applicationInfo) {
        return mg0.a(this.a, applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationBanner(String str) {
        return lg0.a(this.a, str);
    }

    @Override // android.content.pm.PackageManager
    public final int getApplicationEnabledSetting(String str) {
        return this.a.getApplicationEnabledSetting(str);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationIcon(ApplicationInfo applicationInfo) {
        return this.a.getApplicationIcon(applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationIcon(String str) {
        return this.a.getApplicationIcon(str);
    }

    @Override // android.content.pm.PackageManager
    public final ApplicationInfo getApplicationInfo(String str, int i) {
        return this.a.getApplicationInfo(str, i);
    }

    @Override // android.content.pm.PackageManager
    public final CharSequence getApplicationLabel(ApplicationInfo applicationInfo) {
        return this.a.getApplicationLabel(applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationLogo(ApplicationInfo applicationInfo) {
        return this.a.getApplicationLogo(applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationLogo(String str) {
        return this.a.getApplicationLogo(str);
    }

    @Override // android.content.pm.PackageManager
    public final ChangedPackages getChangedPackages(int i) {
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final int getComponentEnabledSetting(ComponentName componentName) {
        return this.a.getComponentEnabledSetting(componentName);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getDefaultActivityIcon() {
        return this.a.getDefaultActivityIcon();
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getDrawable(String str, int i, ApplicationInfo applicationInfo) {
        return this.a.getDrawable(str, i, applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    public final List<ApplicationInfo> getInstalledApplications(int i) {
        return this.a.getInstalledApplications(i);
    }

    @Override // android.content.pm.PackageManager
    public final List<PackageInfo> getInstalledPackages(int i) {
        return this.a.getInstalledPackages(i);
    }

    @Override // android.content.pm.PackageManager
    public final String getInstallerPackageName(String str) {
        return this.a.getInstallerPackageName(str);
    }

    @Override // android.content.pm.PackageManager
    public final byte[] getInstantAppCookie() {
        return new byte[0];
    }

    @Override // android.content.pm.PackageManager
    public final int getInstantAppCookieMaxBytes() {
        return 0;
    }

    @Override // android.content.pm.PackageManager
    public final InstrumentationInfo getInstrumentationInfo(ComponentName componentName, int i) {
        return this.a.getInstrumentationInfo(componentName, i);
    }

    @Override // android.content.pm.PackageManager
    public final Intent getLaunchIntentForPackage(String str) {
        return this.a.getLaunchIntentForPackage(str);
    }

    @Override // android.content.pm.PackageManager
    public final Intent getLeanbackLaunchIntentForPackage(String str) {
        Intent leanbackLaunchIntentForPackage;
        leanbackLaunchIntentForPackage = this.a.getLeanbackLaunchIntentForPackage(str);
        return leanbackLaunchIntentForPackage;
    }

    @Override // android.content.pm.PackageManager
    public final String getNameForUid(int i) {
        return this.a.getNameForUid(i);
    }

    @Override // android.content.pm.PackageManager
    public final int[] getPackageGids(String str) {
        return this.a.getPackageGids(str);
    }

    @Override // android.content.pm.PackageManager
    public final int[] getPackageGids(String str, int i) {
        return new int[0];
    }

    @Override // android.content.pm.PackageManager
    public final PackageInfo getPackageInfo(VersionedPackage versionedPackage, int i) {
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final PackageInfo getPackageInfo(String str, int i) {
        return this.a.getPackageInfo(str, i);
    }

    @Override // android.content.pm.PackageManager
    public final PackageInstaller getPackageInstaller() {
        PackageInstaller packageInstaller;
        packageInstaller = this.a.getPackageInstaller();
        return packageInstaller;
    }

    @Override // android.content.pm.PackageManager
    public final int getPackageUid(String str, int i) {
        return 0;
    }

    @Override // android.content.pm.PackageManager
    public final String[] getPackagesForUid(int i) {
        return this.a.getPackagesForUid(i);
    }

    @Override // android.content.pm.PackageManager
    public final List<PackageInfo> getPackagesHoldingPermissions(String[] strArr, int i) {
        return this.a.getPackagesHoldingPermissions(strArr, i);
    }

    @Override // android.content.pm.PackageManager
    public final PermissionGroupInfo getPermissionGroupInfo(String str, int i) {
        return this.a.getPermissionGroupInfo(str, i);
    }

    @Override // android.content.pm.PackageManager
    public final PermissionInfo getPermissionInfo(String str, int i) {
        return this.a.getPermissionInfo(str, i);
    }

    @Override // android.content.pm.PackageManager
    public final int getPreferredActivities(List<IntentFilter> list, List<ComponentName> list2, String str) {
        return this.a.getPreferredActivities(list, list2, str);
    }

    @Override // android.content.pm.PackageManager
    public final List<PackageInfo> getPreferredPackages(int i) {
        return this.a.getPreferredPackages(i);
    }

    @Override // android.content.pm.PackageManager
    public final ProviderInfo getProviderInfo(ComponentName componentName, int i) {
        return this.a.getProviderInfo(componentName, i);
    }

    @Override // android.content.pm.PackageManager
    public final ActivityInfo getReceiverInfo(ComponentName componentName, int i) {
        return this.a.getReceiverInfo(componentName, i);
    }

    @Override // android.content.pm.PackageManager
    public final Resources getResourcesForActivity(ComponentName componentName) {
        return this.a.getResourcesForActivity(componentName);
    }

    @Override // android.content.pm.PackageManager
    public final Resources getResourcesForApplication(ApplicationInfo applicationInfo) {
        return this.a.getResourcesForApplication(applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    public final Resources getResourcesForApplication(String str) {
        return this.a.getResourcesForApplication(str);
    }

    @Override // android.content.pm.PackageManager
    public final ServiceInfo getServiceInfo(ComponentName componentName, int i) {
        return this.a.getServiceInfo(componentName, i);
    }

    @Override // android.content.pm.PackageManager
    public final List<SharedLibraryInfo> getSharedLibraries(int i) {
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final FeatureInfo[] getSystemAvailableFeatures() {
        return this.a.getSystemAvailableFeatures();
    }

    @Override // android.content.pm.PackageManager
    public final String[] getSystemSharedLibraryNames() {
        return this.a.getSystemSharedLibraryNames();
    }

    @Override // android.content.pm.PackageManager
    public final CharSequence getText(String str, int i, ApplicationInfo applicationInfo) {
        return this.a.getText(str, i, applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getUserBadgedDrawableForDensity(Drawable drawable, UserHandle userHandle, Rect rect, int i) {
        Drawable userBadgedDrawableForDensity;
        userBadgedDrawableForDensity = this.a.getUserBadgedDrawableForDensity(drawable, userHandle, rect, i);
        return userBadgedDrawableForDensity;
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getUserBadgedIcon(Drawable drawable, UserHandle userHandle) {
        Drawable userBadgedIcon;
        userBadgedIcon = this.a.getUserBadgedIcon(drawable, userHandle);
        return userBadgedIcon;
    }

    @Override // android.content.pm.PackageManager
    public final CharSequence getUserBadgedLabel(CharSequence charSequence, UserHandle userHandle) {
        CharSequence userBadgedLabel;
        userBadgedLabel = this.a.getUserBadgedLabel(charSequence, userHandle);
        return userBadgedLabel;
    }

    @Override // android.content.pm.PackageManager
    public final XmlResourceParser getXml(String str, int i, ApplicationInfo applicationInfo) {
        return this.a.getXml(str, i, applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    public final boolean hasSystemFeature(String str) {
        return this.a.hasSystemFeature(str);
    }

    @Override // android.content.pm.PackageManager
    public final boolean hasSystemFeature(String str, int i) {
        return false;
    }

    @Override // android.content.pm.PackageManager
    public final boolean isInstantApp() {
        return false;
    }

    @Override // android.content.pm.PackageManager
    public final boolean isInstantApp(String str) {
        return false;
    }

    @Override // android.content.pm.PackageManager
    public final boolean isPermissionRevokedByPolicy(String str, String str2) {
        boolean isPermissionRevokedByPolicy;
        isPermissionRevokedByPolicy = this.a.isPermissionRevokedByPolicy(str, str2);
        return isPermissionRevokedByPolicy;
    }

    @Override // android.content.pm.PackageManager
    public final boolean isSafeMode() {
        return this.a.isSafeMode();
    }

    @Override // android.content.pm.PackageManager
    public final List<ResolveInfo> queryBroadcastReceivers(Intent intent, int i) {
        return this.a.queryBroadcastReceivers(intent, i);
    }

    @Override // android.content.pm.PackageManager
    public final List<ProviderInfo> queryContentProviders(String str, int i, int i2) {
        return this.a.queryContentProviders(str, i, i2);
    }

    @Override // android.content.pm.PackageManager
    public final List<InstrumentationInfo> queryInstrumentation(String str, int i) {
        return this.a.queryInstrumentation(str, i);
    }

    @Override // android.content.pm.PackageManager
    public final List<ResolveInfo> queryIntentActivities(Intent intent, int i) {
        return this.a.queryIntentActivities(intent, i);
    }

    @Override // android.content.pm.PackageManager
    public final List<ResolveInfo> queryIntentActivityOptions(ComponentName componentName, Intent[] intentArr, Intent intent, int i) {
        return this.a.queryIntentActivityOptions(componentName, intentArr, intent, i);
    }

    @Override // android.content.pm.PackageManager
    public final List<ResolveInfo> queryIntentContentProviders(Intent intent, int i) {
        return this.a.queryIntentContentProviders(intent, i);
    }

    @Override // android.content.pm.PackageManager
    public final List<ResolveInfo> queryIntentServices(Intent intent, int i) {
        return this.a.queryIntentServices(intent, i);
    }

    @Override // android.content.pm.PackageManager
    public final List<PermissionInfo> queryPermissionsByGroup(String str, int i) {
        return this.a.queryPermissionsByGroup(str, i);
    }

    @Override // android.content.pm.PackageManager
    public final void removePackageFromPreferred(String str) {
        this.a.removePackageFromPreferred(str);
    }

    @Override // android.content.pm.PackageManager
    public final void removePermission(String str) {
        this.a.removePermission(str);
    }

    @Override // android.content.pm.PackageManager
    public final ResolveInfo resolveActivity(Intent intent, int i) {
        return this.a.resolveActivity(intent, i);
    }

    @Override // android.content.pm.PackageManager
    public final ProviderInfo resolveContentProvider(String str, int i) {
        return this.a.resolveContentProvider(str, i);
    }

    @Override // android.content.pm.PackageManager
    public final ResolveInfo resolveService(Intent intent, int i) {
        return this.a.resolveService(intent, i);
    }

    @Override // android.content.pm.PackageManager
    public final void setApplicationCategoryHint(String str, int i) {
    }

    @Override // android.content.pm.PackageManager
    public final void setApplicationEnabledSetting(String str, int i, int i2) {
        this.a.setApplicationEnabledSetting(str, i, i2);
    }

    @Override // android.content.pm.PackageManager
    public final void setComponentEnabledSetting(ComponentName componentName, int i, int i2) {
        this.a.setComponentEnabledSetting(componentName, i, i2);
    }

    @Override // android.content.pm.PackageManager
    public final void setInstallerPackageName(String str, String str2) {
        this.a.setInstallerPackageName(str, str2);
    }

    @Override // android.content.pm.PackageManager
    public final void updateInstantAppCookie(byte[] bArr) {
    }

    @Override // android.content.pm.PackageManager
    public final void verifyPendingInstall(int i, int i2) {
        this.a.verifyPendingInstall(i, i2);
    }
}