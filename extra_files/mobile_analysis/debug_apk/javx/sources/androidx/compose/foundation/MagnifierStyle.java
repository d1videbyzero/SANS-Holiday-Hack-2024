package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.webkit.Profile;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Magnifier.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB<\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0002\u0010\nB:\b\u0000\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0004\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0006\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\t\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0014\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u001f\u0010\u0002\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/foundation/MagnifierStyle;", "", "size", "Landroidx/compose/ui/unit/DpSize;", "cornerRadius", "Landroidx/compose/ui/unit/Dp;", "elevation", "clippingEnabled", "", "fishEyeEnabled", "(JFFZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "useTextDefault", "(ZJFFZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getClippingEnabled$foundation_release", "()Z", "getCornerRadius-D9Ej5fM$foundation_release", "()F", "F", "getElevation-D9Ej5fM$foundation_release", "getFishEyeEnabled$foundation_release", "isSupported", "getSize-MYxV2XQ$foundation_release", "()J", "J", "getUseTextDefault$foundation_release", "equals", "other", "hashCode", "", "toString", "", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MagnifierStyle {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final MagnifierStyle Default = new MagnifierStyle(0L, 0.0f, 0.0f, false, false, 31, (DefaultConstructorMarker) null);
    private static final MagnifierStyle TextDefault = new MagnifierStyle(true, Default.size, Default.cornerRadius, Default.elevation, Default.clippingEnabled, Default.fishEyeEnabled, (DefaultConstructorMarker) null);
    private final boolean clippingEnabled;
    private final float cornerRadius;
    private final float elevation;
    private final boolean fishEyeEnabled;
    private final long size;
    private final boolean useTextDefault;

    public /* synthetic */ MagnifierStyle(long j, float f, float f2, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, f, f2, z, z2);
    }

    public /* synthetic */ MagnifierStyle(boolean z, long j, float f, float f2, boolean z2, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, j, f, f2, z2, z3);
    }

    private MagnifierStyle(boolean useTextDefault, long size, float cornerRadius, float elevation, boolean clippingEnabled, boolean fishEyeEnabled) {
        this.useTextDefault = useTextDefault;
        this.size = size;
        this.cornerRadius = cornerRadius;
        this.elevation = elevation;
        this.clippingEnabled = clippingEnabled;
        this.fishEyeEnabled = fishEyeEnabled;
    }

    /* renamed from: getUseTextDefault$foundation_release, reason: from getter */
    public final boolean getUseTextDefault() {
        return this.useTextDefault;
    }

    /* renamed from: getSize-MYxV2XQ$foundation_release, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    /* renamed from: getCornerRadius-D9Ej5fM$foundation_release, reason: not valid java name and from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: getElevation-D9Ej5fM$foundation_release, reason: not valid java name and from getter */
    public final float getElevation() {
        return this.elevation;
    }

    /* renamed from: getClippingEnabled$foundation_release, reason: from getter */
    public final boolean getClippingEnabled() {
        return this.clippingEnabled;
    }

    /* renamed from: getFishEyeEnabled$foundation_release, reason: from getter */
    public final boolean getFishEyeEnabled() {
        return this.fishEyeEnabled;
    }

    public /* synthetic */ MagnifierStyle(long j, float f, float f2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DpSize.INSTANCE.m5323getUnspecifiedMYxV2XQ() : j, (i & 2) != 0 ? Dp.INSTANCE.m5236getUnspecifiedD9Ej5fM() : f, (i & 4) != 0 ? Dp.INSTANCE.m5236getUnspecifiedD9Ej5fM() : f2, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2, (DefaultConstructorMarker) null);
    }

    private MagnifierStyle(long size, float cornerRadius, float elevation, boolean clippingEnabled, boolean fishEyeEnabled) {
        this(false, size, cornerRadius, elevation, clippingEnabled, fishEyeEnabled, (DefaultConstructorMarker) null);
    }

    public final boolean isSupported() {
        return Companion.isStyleSupported$foundation_release$default(INSTANCE, this, 0, 2, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MagnifierStyle) && this.useTextDefault == ((MagnifierStyle) other).useTextDefault && DpSize.m5311equalsimpl0(this.size, ((MagnifierStyle) other).size) && Dp.m5221equalsimpl0(this.cornerRadius, ((MagnifierStyle) other).cornerRadius) && Dp.m5221equalsimpl0(this.elevation, ((MagnifierStyle) other).elevation) && this.clippingEnabled == ((MagnifierStyle) other).clippingEnabled && this.fishEyeEnabled == ((MagnifierStyle) other).fishEyeEnabled;
    }

    public int hashCode() {
        int result = Boolean.hashCode(this.useTextDefault);
        return (((((((((result * 31) + DpSize.m5316hashCodeimpl(this.size)) * 31) + Dp.m5222hashCodeimpl(this.cornerRadius)) * 31) + Dp.m5222hashCodeimpl(this.elevation)) * 31) + Boolean.hashCode(this.clippingEnabled)) * 31) + Boolean.hashCode(this.fishEyeEnabled);
    }

    public String toString() {
        return this.useTextDefault ? "MagnifierStyle.TextDefault" : "MagnifierStyle(size=" + ((Object) DpSize.m5321toStringimpl(this.size)) + ", cornerRadius=" + ((Object) Dp.m5227toStringimpl(this.cornerRadius)) + ", elevation=" + ((Object) Dp.m5227toStringimpl(this.elevation)) + ", clippingEnabled=" + this.clippingEnabled + ", fishEyeEnabled=" + this.fishEyeEnabled + ')';
    }

    /* compiled from: Magnifier.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0010R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/MagnifierStyle$Companion;", "", "()V", Profile.DEFAULT_PROFILE_NAME, "Landroidx/compose/foundation/MagnifierStyle;", "getDefault$annotations", "getDefault", "()Landroidx/compose/foundation/MagnifierStyle;", "TextDefault", "getTextDefault$annotations", "getTextDefault", "isStyleSupported", "", "style", "sdkVersion", "", "isStyleSupported$foundation_release", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getDefault$annotations() {
        }

        public static /* synthetic */ void getTextDefault$annotations() {
        }

        private Companion() {
        }

        public final MagnifierStyle getDefault() {
            return MagnifierStyle.Default;
        }

        public final MagnifierStyle getTextDefault() {
            return MagnifierStyle.TextDefault;
        }

        public static /* synthetic */ boolean isStyleSupported$foundation_release$default(Companion companion, MagnifierStyle magnifierStyle, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = Build.VERSION.SDK_INT;
            }
            return companion.isStyleSupported$foundation_release(magnifierStyle, i);
        }

        public final boolean isStyleSupported$foundation_release(MagnifierStyle style, int sdkVersion) {
            Intrinsics.checkNotNullParameter(style, "style");
            if (!MagnifierKt.isPlatformMagnifierSupported(sdkVersion) || style.getFishEyeEnabled()) {
                return false;
            }
            if (style.getUseTextDefault() || Intrinsics.areEqual(style, getDefault())) {
                return true;
            }
            return sdkVersion >= 29;
        }
    }
}
