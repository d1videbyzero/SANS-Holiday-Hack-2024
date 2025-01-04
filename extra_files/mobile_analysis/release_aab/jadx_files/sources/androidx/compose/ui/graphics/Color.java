package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.UnsignedKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Color.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 :2\u00020\u0001:\u0001:B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u001d\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b\u001e\u0010\u000bJ\u0010\u0010\u001f\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b \u0010\u000bJ\u0010\u0010!\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b\"\u0010\u000bJ\u0010\u0010#\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b$\u0010\u000bJ\u0010\u0010%\u001a\u00020\u0010H\u0087\u0002¢\u0006\u0004\b&\u0010\u0013J\u001e\u0010'\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)J@\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007H\u0007ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001a\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109R\u001a\u0010\u0006\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\t\u001a\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0017\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\t\u001a\u0004\b\u0019\u0010\u000bR\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001b\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "", "value", "Lkotlin/ULong;", "constructor-impl", "(J)J", "alpha", "", "getAlpha$annotations", "()V", "getAlpha-impl", "(J)F", "blue", "getBlue$annotations", "getBlue-impl", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getColorSpace$annotations", "getColorSpace-impl", "(J)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "green", "getGreen$annotations", "getGreen-impl", "red", "getRed$annotations", "getRed-impl", "getValue-s-VKNKU", "()J", "J", "component1", "component1-impl", "component2", "component2-impl", "component3", "component3-impl", "component4", "component4-impl", "component5", "component5-impl", "convert", "convert-vNxB06k", "(JLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "copy", "copy-wmQWz5c", "(JFFFF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class Color {
    private final long value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Black = ColorKt.Color(4278190080L);
    private static final long DarkGray = ColorKt.Color(4282664004L);
    private static final long Gray = ColorKt.Color(4287137928L);
    private static final long LightGray = ColorKt.Color(4291611852L);
    private static final long White = ColorKt.Color(4294967295L);
    private static final long Red = ColorKt.Color(4294901760L);
    private static final long Green = ColorKt.Color(4278255360L);
    private static final long Blue = ColorKt.Color(4278190335L);
    private static final long Yellow = ColorKt.Color(4294967040L);
    private static final long Cyan = ColorKt.Color(4278255615L);
    private static final long Magenta = ColorKt.Color(4294902015L);
    private static final long Transparent = ColorKt.Color(0);
    private static final long Unspecified = ColorKt.Color(0.0f, 0.0f, 0.0f, 0.0f, ColorSpaces.INSTANCE.getUnspecified$ui_graphics_release());

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Color m2620boximpl(long j) {
        return new Color(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m2626constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2630equalsimpl(long j, Object obj) {
        return (obj instanceof Color) && j == ((Color) obj).m2640unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2631equalsimpl0(long j, long j2) {
        return ULong.m5347equalsimpl0(j, j2);
    }

    public static /* synthetic */ void getAlpha$annotations() {
    }

    public static /* synthetic */ void getBlue$annotations() {
    }

    public static /* synthetic */ void getColorSpace$annotations() {
    }

    public static /* synthetic */ void getGreen$annotations() {
    }

    public static /* synthetic */ void getRed$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2637hashCodeimpl(long j) {
        return ULong.m5352hashCodeimpl(j);
    }

    public boolean equals(Object obj) {
        return m2630equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2637hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m2640unboximpl() {
        return this.value;
    }

    private /* synthetic */ Color(long j) {
        this.value = j;
    }

    /* renamed from: getValue-s-VKNKU, reason: not valid java name and from getter */
    public final long getValue() {
        return this.value;
    }

    /* renamed from: getColorSpace-impl, reason: not valid java name */
    public static final ColorSpace m2634getColorSpaceimpl(long j) {
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        return colorSpaces.getColorSpacesArray$ui_graphics_release()[(int) ULong.m5340constructorimpl(j & 63)];
    }

    /* renamed from: convert-vNxB06k, reason: not valid java name */
    public static final long m2627convertvNxB06k(long j, ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        ColorSpace m2634getColorSpaceimpl = m2634getColorSpaceimpl(j);
        return Intrinsics.areEqual(colorSpace, m2634getColorSpaceimpl) ? j : ColorSpaceKt.m3043connectYBCOT_4$default(m2634getColorSpaceimpl, colorSpace, 0, 2, null).mo3045transformToColorwmQWz5c$ui_graphics_release(m2636getRedimpl(j), m2635getGreenimpl(j), m2633getBlueimpl(j), m2632getAlphaimpl(j));
    }

    /* renamed from: getRed-impl, reason: not valid java name */
    public static final float m2636getRedimpl(long j) {
        if (ULong.m5340constructorimpl(63 & j) == 0) {
            return ((float) UnsignedKt.ulongToDouble(ULong.m5340constructorimpl(ULong.m5340constructorimpl(j >>> 48) & 255))) / 255.0f;
        }
        return Float16.m2752toFloatimpl(Float16.m2736constructorimpl((short) ULong.m5340constructorimpl(ULong.m5340constructorimpl(j >>> 48) & 65535)));
    }

    /* renamed from: getGreen-impl, reason: not valid java name */
    public static final float m2635getGreenimpl(long j) {
        if (ULong.m5340constructorimpl(63 & j) == 0) {
            return ((float) UnsignedKt.ulongToDouble(ULong.m5340constructorimpl(ULong.m5340constructorimpl(j >>> 40) & 255))) / 255.0f;
        }
        return Float16.m2752toFloatimpl(Float16.m2736constructorimpl((short) ULong.m5340constructorimpl(ULong.m5340constructorimpl(j >>> 32) & 65535)));
    }

    /* renamed from: getBlue-impl, reason: not valid java name */
    public static final float m2633getBlueimpl(long j) {
        if (ULong.m5340constructorimpl(63 & j) == 0) {
            return ((float) UnsignedKt.ulongToDouble(ULong.m5340constructorimpl(ULong.m5340constructorimpl(j >>> 32) & 255))) / 255.0f;
        }
        return Float16.m2752toFloatimpl(Float16.m2736constructorimpl((short) ULong.m5340constructorimpl(ULong.m5340constructorimpl(j >>> 16) & 65535)));
    }

    /* renamed from: getAlpha-impl, reason: not valid java name */
    public static final float m2632getAlphaimpl(long j) {
        float ulongToDouble;
        float f;
        if (ULong.m5340constructorimpl(63 & j) == 0) {
            ulongToDouble = (float) UnsignedKt.ulongToDouble(ULong.m5340constructorimpl(ULong.m5340constructorimpl(j >>> 56) & 255));
            f = 255.0f;
        } else {
            ulongToDouble = (float) UnsignedKt.ulongToDouble(ULong.m5340constructorimpl(ULong.m5340constructorimpl(j >>> 6) & 1023));
            f = 1023.0f;
        }
        return ulongToDouble / f;
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m2621component1impl(long j) {
        return m2636getRedimpl(j);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m2622component2impl(long j) {
        return m2635getGreenimpl(j);
    }

    /* renamed from: component3-impl, reason: not valid java name */
    public static final float m2623component3impl(long j) {
        return m2633getBlueimpl(j);
    }

    /* renamed from: component4-impl, reason: not valid java name */
    public static final float m2624component4impl(long j) {
        return m2632getAlphaimpl(j);
    }

    /* renamed from: component5-impl, reason: not valid java name */
    public static final ColorSpace m2625component5impl(long j) {
        return m2634getColorSpaceimpl(j);
    }

    /* renamed from: copy-wmQWz5c$default, reason: not valid java name */
    public static /* synthetic */ long m2629copywmQWz5c$default(long j, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m2632getAlphaimpl(j);
        }
        float f5 = f;
        if ((i & 2) != 0) {
            f2 = m2636getRedimpl(j);
        }
        float f6 = f2;
        if ((i & 4) != 0) {
            f3 = m2635getGreenimpl(j);
        }
        float f7 = f3;
        if ((i & 8) != 0) {
            f4 = m2633getBlueimpl(j);
        }
        return m2628copywmQWz5c(j, f5, f6, f7, f4);
    }

    /* renamed from: copy-wmQWz5c, reason: not valid java name */
    public static final long m2628copywmQWz5c(long j, float f, float f2, float f3, float f4) {
        return ColorKt.Color(f2, f3, f4, f, m2634getColorSpaceimpl(j));
    }

    public String toString() {
        return m2638toStringimpl(this.value);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2638toStringimpl(long j) {
        return "Color(" + m2636getRedimpl(j) + ", " + m2635getGreenimpl(j) + ", " + m2633getBlueimpl(j) + ", " + m2632getAlphaimpl(j) + ", " + m2634getColorSpaceimpl(j).getName() + ')';
    }

    /* compiled from: Color.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JB\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0002\u00103\u001a\u000204ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106J(\u00107\u001a\u00020/2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020/2\u0006\u0010;\u001a\u00020/2\u0006\u0010<\u001a\u00020/H\u0002JB\u0010=\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u0010>\u001a\u00020/2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0002\u00103\u001a\u000204ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u00106J(\u0010@\u001a\u00020/2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020/2\u0006\u0010;\u001a\u00020/2\u0006\u0010A\u001a\u00020/H\u0002R'\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R'\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R'\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007R'\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0007R'\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0007R'\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0007R'\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u001a\u0010\u0007R'\u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u0007R'\u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u001f\u0010\u0002\u001a\u0004\b \u0010\u0007R'\u0010!\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\"\u0010\u0002\u001a\u0004\b#\u0010\u0007R'\u0010$\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b%\u0010\u0002\u001a\u0004\b&\u0010\u0007R'\u0010'\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b(\u0010\u0002\u001a\u0004\b)\u0010\u0007R'\u0010*\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b+\u0010\u0002\u001a\u0004\b,\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B"}, d2 = {"Landroidx/compose/ui/graphics/Color$Companion;", "", "()V", "Black", "Landroidx/compose/ui/graphics/Color;", "getBlack-0d7_KjU$annotations", "getBlack-0d7_KjU", "()J", "J", "Blue", "getBlue-0d7_KjU$annotations", "getBlue-0d7_KjU", "Cyan", "getCyan-0d7_KjU$annotations", "getCyan-0d7_KjU", "DarkGray", "getDarkGray-0d7_KjU$annotations", "getDarkGray-0d7_KjU", "Gray", "getGray-0d7_KjU$annotations", "getGray-0d7_KjU", "Green", "getGreen-0d7_KjU$annotations", "getGreen-0d7_KjU", "LightGray", "getLightGray-0d7_KjU$annotations", "getLightGray-0d7_KjU", "Magenta", "getMagenta-0d7_KjU$annotations", "getMagenta-0d7_KjU", "Red", "getRed-0d7_KjU$annotations", "getRed-0d7_KjU", "Transparent", "getTransparent-0d7_KjU$annotations", "getTransparent-0d7_KjU", "Unspecified", "getUnspecified-0d7_KjU$annotations", "getUnspecified-0d7_KjU", "White", "getWhite-0d7_KjU$annotations", "getWhite-0d7_KjU", "Yellow", "getYellow-0d7_KjU$annotations", "getYellow-0d7_KjU", "hsl", "hue", "", "saturation", "lightness", "alpha", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "hsl-JlNiLsg", "(FFFFLandroidx/compose/ui/graphics/colorspace/Rgb;)J", "hslToRgbComponent", "n", "", "h", "s", "l", "hsv", "value", "hsv-JlNiLsg", "hsvToRgbComponent", "v", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getBlack-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2641getBlack0d7_KjU$annotations() {
        }

        /* renamed from: getBlue-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2642getBlue0d7_KjU$annotations() {
        }

        /* renamed from: getCyan-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2643getCyan0d7_KjU$annotations() {
        }

        /* renamed from: getDarkGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2644getDarkGray0d7_KjU$annotations() {
        }

        /* renamed from: getGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2645getGray0d7_KjU$annotations() {
        }

        /* renamed from: getGreen-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2646getGreen0d7_KjU$annotations() {
        }

        /* renamed from: getLightGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2647getLightGray0d7_KjU$annotations() {
        }

        /* renamed from: getMagenta-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2648getMagenta0d7_KjU$annotations() {
        }

        /* renamed from: getRed-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2649getRed0d7_KjU$annotations() {
        }

        /* renamed from: getTransparent-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2650getTransparent0d7_KjU$annotations() {
        }

        /* renamed from: getUnspecified-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2651getUnspecified0d7_KjU$annotations() {
        }

        /* renamed from: getWhite-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2652getWhite0d7_KjU$annotations() {
        }

        /* renamed from: getYellow-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2653getYellow0d7_KjU$annotations() {
        }

        private Companion() {
        }

        /* renamed from: getBlack-0d7_KjU, reason: not valid java name */
        public final long m2656getBlack0d7_KjU() {
            return Color.Black;
        }

        /* renamed from: getDarkGray-0d7_KjU, reason: not valid java name */
        public final long m2659getDarkGray0d7_KjU() {
            return Color.DarkGray;
        }

        /* renamed from: getGray-0d7_KjU, reason: not valid java name */
        public final long m2660getGray0d7_KjU() {
            return Color.Gray;
        }

        /* renamed from: getLightGray-0d7_KjU, reason: not valid java name */
        public final long m2662getLightGray0d7_KjU() {
            return Color.LightGray;
        }

        /* renamed from: getWhite-0d7_KjU, reason: not valid java name */
        public final long m2667getWhite0d7_KjU() {
            return Color.White;
        }

        /* renamed from: getRed-0d7_KjU, reason: not valid java name */
        public final long m2664getRed0d7_KjU() {
            return Color.Red;
        }

        /* renamed from: getGreen-0d7_KjU, reason: not valid java name */
        public final long m2661getGreen0d7_KjU() {
            return Color.Green;
        }

        /* renamed from: getBlue-0d7_KjU, reason: not valid java name */
        public final long m2657getBlue0d7_KjU() {
            return Color.Blue;
        }

        /* renamed from: getYellow-0d7_KjU, reason: not valid java name */
        public final long m2668getYellow0d7_KjU() {
            return Color.Yellow;
        }

        /* renamed from: getCyan-0d7_KjU, reason: not valid java name */
        public final long m2658getCyan0d7_KjU() {
            return Color.Cyan;
        }

        /* renamed from: getMagenta-0d7_KjU, reason: not valid java name */
        public final long m2663getMagenta0d7_KjU() {
            return Color.Magenta;
        }

        /* renamed from: getTransparent-0d7_KjU, reason: not valid java name */
        public final long m2665getTransparent0d7_KjU() {
            return Color.Transparent;
        }

        /* renamed from: getUnspecified-0d7_KjU, reason: not valid java name */
        public final long m2666getUnspecified0d7_KjU() {
            return Color.Unspecified;
        }

        /* renamed from: hsv-JlNiLsg$default, reason: not valid java name */
        public static /* synthetic */ long m2655hsvJlNiLsg$default(Companion companion, float f, float f2, float f3, float f4, Rgb rgb, int i, Object obj) {
            if ((i & 8) != 0) {
                f4 = 1.0f;
            }
            float f5 = f4;
            if ((i & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m2670hsvJlNiLsg(f, f2, f3, f5, rgb);
        }

        /* renamed from: hsv-JlNiLsg, reason: not valid java name */
        public final long m2670hsvJlNiLsg(float hue, float saturation, float value, float alpha, Rgb colorSpace) {
            Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
            if (0.0f > hue || hue > 360.0f || 0.0f > saturation || saturation > 1.0f || 0.0f > value || value > 1.0f) {
                throw new IllegalArgumentException(("HSV (" + hue + ", " + saturation + ", " + value + ") must be in range (0..360, 0..1, 0..1)").toString());
            }
            return ColorKt.Color(hsvToRgbComponent(5, hue, saturation, value), hsvToRgbComponent(3, hue, saturation, value), hsvToRgbComponent(1, hue, saturation, value), alpha, colorSpace);
        }

        private final float hsvToRgbComponent(int n, float h, float s, float v) {
            float f = (n + (h / 60.0f)) % 6.0f;
            return v - ((s * v) * Math.max(0.0f, Math.min(f, Math.min(4 - f, 1.0f))));
        }

        /* renamed from: hsl-JlNiLsg$default, reason: not valid java name */
        public static /* synthetic */ long m2654hslJlNiLsg$default(Companion companion, float f, float f2, float f3, float f4, Rgb rgb, int i, Object obj) {
            if ((i & 8) != 0) {
                f4 = 1.0f;
            }
            float f5 = f4;
            if ((i & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m2669hslJlNiLsg(f, f2, f3, f5, rgb);
        }

        /* renamed from: hsl-JlNiLsg, reason: not valid java name */
        public final long m2669hslJlNiLsg(float hue, float saturation, float lightness, float alpha, Rgb colorSpace) {
            Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
            if (0.0f > hue || hue > 360.0f || 0.0f > saturation || saturation > 1.0f || 0.0f > lightness || lightness > 1.0f) {
                throw new IllegalArgumentException(("HSL (" + hue + ", " + saturation + ", " + lightness + ") must be in range (0..360, 0..1, 0..1)").toString());
            }
            return ColorKt.Color(hslToRgbComponent(0, hue, saturation, lightness), hslToRgbComponent(8, hue, saturation, lightness), hslToRgbComponent(4, hue, saturation, lightness), alpha, colorSpace);
        }

        private final float hslToRgbComponent(int n, float h, float s, float l) {
            float f = (n + (h / 30.0f)) % 12.0f;
            return l - ((s * Math.min(l, 1.0f - l)) * Math.max(-1.0f, Math.min(f - 3, Math.min(9 - f, 1.0f))));
        }
    }
}
