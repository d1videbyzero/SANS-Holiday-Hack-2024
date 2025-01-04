package androidx.webkit;

import android.webkit.WebSettings;
import androidx.webkit.internal.ApiFeature;
import androidx.webkit.internal.ApiHelperForM;
import androidx.webkit.internal.ApiHelperForN;
import androidx.webkit.internal.ApiHelperForO;
import androidx.webkit.internal.ApiHelperForQ;
import androidx.webkit.internal.WebSettingsAdapter;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Set;

/* loaded from: classes.dex */
public class WebSettingsCompat {
    public static final int ATTRIBUTION_BEHAVIOR_APP_SOURCE_AND_APP_TRIGGER = 3;
    public static final int ATTRIBUTION_BEHAVIOR_APP_SOURCE_AND_WEB_TRIGGER = 1;
    public static final int ATTRIBUTION_BEHAVIOR_DISABLED = 0;
    public static final int ATTRIBUTION_BEHAVIOR_WEB_SOURCE_AND_WEB_TRIGGER = 2;

    @Deprecated
    public static final int DARK_STRATEGY_PREFER_WEB_THEME_OVER_USER_AGENT_DARKENING = 2;

    @Deprecated
    public static final int DARK_STRATEGY_USER_AGENT_DARKENING_ONLY = 0;

    @Deprecated
    public static final int DARK_STRATEGY_WEB_THEME_DARKENING_ONLY = 1;

    @Deprecated
    public static final int FORCE_DARK_AUTO = 1;

    @Deprecated
    public static final int FORCE_DARK_OFF = 0;

    @Deprecated
    public static final int FORCE_DARK_ON = 2;

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ForceDark {
    }

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ForceDarkStrategy {
    }

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface MenuItemFlags {
    }

    private WebSettingsCompat() {
    }

    public static void setOffscreenPreRaster(WebSettings settings, boolean enabled) {
        ApiFeature.M feature = WebViewFeatureInternal.OFF_SCREEN_PRERASTER;
        if (feature.isSupportedByFramework()) {
            ApiHelperForM.setOffscreenPreRaster(settings, enabled);
        } else {
            if (feature.isSupportedByWebView()) {
                getAdapter(settings).setOffscreenPreRaster(enabled);
                return;
            }
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    public static boolean getOffscreenPreRaster(WebSettings settings) {
        ApiFeature.M feature = WebViewFeatureInternal.OFF_SCREEN_PRERASTER;
        if (feature.isSupportedByFramework()) {
            return ApiHelperForM.getOffscreenPreRaster(settings);
        }
        if (feature.isSupportedByWebView()) {
            return getAdapter(settings).getOffscreenPreRaster();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setSafeBrowsingEnabled(WebSettings settings, boolean enabled) {
        ApiFeature.O feature = WebViewFeatureInternal.SAFE_BROWSING_ENABLE;
        if (feature.isSupportedByFramework()) {
            ApiHelperForO.setSafeBrowsingEnabled(settings, enabled);
        } else {
            if (feature.isSupportedByWebView()) {
                getAdapter(settings).setSafeBrowsingEnabled(enabled);
                return;
            }
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    public static boolean getSafeBrowsingEnabled(WebSettings settings) {
        ApiFeature.O feature = WebViewFeatureInternal.SAFE_BROWSING_ENABLE;
        if (feature.isSupportedByFramework()) {
            return ApiHelperForO.getSafeBrowsingEnabled(settings);
        }
        if (feature.isSupportedByWebView()) {
            return getAdapter(settings).getSafeBrowsingEnabled();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setDisabledActionModeMenuItems(WebSettings settings, int menuItems) {
        ApiFeature.N feature = WebViewFeatureInternal.DISABLED_ACTION_MODE_MENU_ITEMS;
        if (feature.isSupportedByFramework()) {
            ApiHelperForN.setDisabledActionModeMenuItems(settings, menuItems);
        } else {
            if (feature.isSupportedByWebView()) {
                getAdapter(settings).setDisabledActionModeMenuItems(menuItems);
                return;
            }
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    public static int getDisabledActionModeMenuItems(WebSettings settings) {
        ApiFeature.N feature = WebViewFeatureInternal.DISABLED_ACTION_MODE_MENU_ITEMS;
        if (feature.isSupportedByFramework()) {
            return ApiHelperForN.getDisabledActionModeMenuItems(settings);
        }
        if (feature.isSupportedByWebView()) {
            return getAdapter(settings).getDisabledActionModeMenuItems();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Deprecated
    public static void setForceDark(WebSettings settings, int forceDarkMode) {
        ApiFeature.Q feature = WebViewFeatureInternal.FORCE_DARK;
        if (feature.isSupportedByFramework()) {
            ApiHelperForQ.setForceDark(settings, forceDarkMode);
        } else {
            if (feature.isSupportedByWebView()) {
                getAdapter(settings).setForceDark(forceDarkMode);
                return;
            }
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @Deprecated
    public static int getForceDark(WebSettings settings) {
        ApiFeature.Q feature = WebViewFeatureInternal.FORCE_DARK;
        if (feature.isSupportedByFramework()) {
            return ApiHelperForQ.getForceDark(settings);
        }
        if (feature.isSupportedByWebView()) {
            return getAdapter(settings).getForceDark();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setAlgorithmicDarkeningAllowed(WebSettings settings, boolean allow) {
        ApiFeature.T feature = WebViewFeatureInternal.ALGORITHMIC_DARKENING;
        if (feature.isSupportedByWebView()) {
            getAdapter(settings).setAlgorithmicDarkeningAllowed(allow);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static boolean isAlgorithmicDarkeningAllowed(WebSettings settings) {
        ApiFeature.T feature = WebViewFeatureInternal.ALGORITHMIC_DARKENING;
        if (feature.isSupportedByWebView()) {
            return getAdapter(settings).isAlgorithmicDarkeningAllowed();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Deprecated
    public static void setForceDarkStrategy(WebSettings settings, int forceDarkBehavior) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.FORCE_DARK_STRATEGY;
        if (feature.isSupportedByWebView()) {
            getAdapter(settings).setForceDarkStrategy(forceDarkBehavior);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Deprecated
    public static int getForceDarkStrategy(WebSettings settings) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.FORCE_DARK_STRATEGY;
        if (feature.isSupportedByWebView()) {
            return getAdapter(settings).getForceDark();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setEnterpriseAuthenticationAppLinkPolicyEnabled(WebSettings settings, boolean enabled) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY;
        if (feature.isSupportedByWebView()) {
            getAdapter(settings).setEnterpriseAuthenticationAppLinkPolicyEnabled(enabled);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static boolean getEnterpriseAuthenticationAppLinkPolicyEnabled(WebSettings settings) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY;
        if (feature.isSupportedByWebView()) {
            return getAdapter(settings).getEnterpriseAuthenticationAppLinkPolicyEnabled();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static Set<String> getRequestedWithHeaderOriginAllowList(WebSettings settings) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.REQUESTED_WITH_HEADER_ALLOW_LIST;
        if (feature.isSupportedByWebView()) {
            return getAdapter(settings).getRequestedWithHeaderOriginAllowList();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setRequestedWithHeaderOriginAllowList(WebSettings settings, Set<String> allowList) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.REQUESTED_WITH_HEADER_ALLOW_LIST;
        if (feature.isSupportedByWebView()) {
            getAdapter(settings).setRequestedWithHeaderOriginAllowList(allowList);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setUserAgentMetadata(WebSettings settings, UserAgentMetadata metadata) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.USER_AGENT_METADATA;
        if (feature.isSupportedByWebView()) {
            getAdapter(settings).setUserAgentMetadata(metadata);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static UserAgentMetadata getUserAgentMetadata(WebSettings settings) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.USER_AGENT_METADATA;
        if (feature.isSupportedByWebView()) {
            return getAdapter(settings).getUserAgentMetadata();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setAttributionRegistrationBehavior(WebSettings settings, int behavior) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.ATTRIBUTION_REGISTRATION_BEHAVIOR;
        if (feature.isSupportedByWebView()) {
            getAdapter(settings).setAttributionRegistrationBehavior(behavior);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static int getAttributionRegistrationBehavior(WebSettings settings) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.ATTRIBUTION_REGISTRATION_BEHAVIOR;
        if (feature.isSupportedByWebView()) {
            return getAdapter(settings).getAttributionRegistrationBehavior();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setWebViewMediaIntegrityApiStatus(WebSettings settings, WebViewMediaIntegrityApiStatusConfig permissionConfig) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.WEBVIEW_MEDIA_INTEGRITY_API_STATUS;
        if (feature.isSupportedByWebView()) {
            getAdapter(settings).setWebViewMediaIntegrityApiStatus(permissionConfig);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static WebViewMediaIntegrityApiStatusConfig getWebViewMediaIntegrityApiStatus(WebSettings settings) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.WEBVIEW_MEDIA_INTEGRITY_API_STATUS;
        if (feature.isSupportedByWebView()) {
            return getAdapter(settings).getWebViewMediaIntegrityApiStatus();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    private static WebSettingsAdapter getAdapter(WebSettings settings) {
        return WebViewGlueCommunicator.getCompatConverter().convertSettings(settings);
    }
}
