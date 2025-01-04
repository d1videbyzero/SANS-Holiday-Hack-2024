package androidx.compose.ui.unit;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: Dp.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a%\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u00020\b2\u0006\u00107\u001a\u00020\bH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a%\u0010:\u001a\u00020\u00022\u0006\u00102\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b;\u00109\u001a-\u0010<\u001a\u00020\b2\u0006\u0010=\u001a\u00020\b2\u0006\u0010>\u001a\u00020\b2\u0006\u0010?\u001a\u00020\u000eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a-\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\u00012\u0006\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u000eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bB\u0010C\u001a-\u0010<\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u000eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010C\u001a&\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bH\u0010I\u001a&\u0010J\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bK\u0010I\u001a\"\u0010L\u001a\u00020\b*\u00020\b2\u0006\u0010M\u001a\u00020\bH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bN\u0010I\u001a\"\u0010O\u001a\u00020\b*\u00020\b2\u0006\u0010P\u001a\u00020\bH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bQ\u0010I\u001a*\u0010R\u001a\u00020\b*\u00020\b2\u0006\u0010M\u001a\u00020\b2\u0006\u0010P\u001a\u00020\bH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bS\u0010A\u001a+\u0010T\u001a\u00020\b*\u00020\b2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\b0VH\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bW\u0010X\u001a+\u0010T\u001a\u00020\u0001*\u00020\u00012\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00010VH\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bY\u0010Z\u001a+\u0010T\u001a\u00020\u0002*\u00020\u00022\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00020VH\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b[\u0010Z\u001a\"\u0010\\\u001a\u00020\b*\u00020\t2\u0006\u0010]\u001a\u00020\bH\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b^\u0010_\u001a\"\u0010\\\u001a\u00020\b*\u00020\u000e2\u0006\u0010]\u001a\u00020\bH\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b^\u0010I\u001a\"\u0010\\\u001a\u00020\u0002*\u00020\u000e2\u0006\u0010.\u001a\u00020\u0002H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b`\u0010a\u001a\"\u0010\\\u001a\u00020\b*\u00020\u00112\u0006\u0010]\u001a\u00020\bH\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b^\u0010b\u001a\"\u0010\\\u001a\u00020\u0002*\u00020\u00112\u0006\u0010.\u001a\u00020\u0002H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b`\u0010c\"!\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\"\u0010\u0007\u001a\u00020\b*\u00020\t8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\"\u0010\u0007\u001a\u00020\b*\u00020\u000e8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\n\u0010\u000f\u001a\u0004\b\f\u0010\u0010\"\"\u0010\u0007\u001a\u00020\b*\u00020\u00118Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\n\u0010\u0012\u001a\u0004\b\f\u0010\u0013\"\"\u0010\u0014\u001a\u00020\b*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\"\u0010\u001a\u001a\u00020\u001b*\u00020\b8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u001e\"\"\u0010\u001f\u001a\u00020\u001b*\u00020\b8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b \u0010\u000f\u001a\u0004\b!\u0010\u001e\"\"\u0010\u001f\u001a\u00020\u001b*\u00020\u00018Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010$\"\"\u0010\u001f\u001a\u00020\u001b*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010$\"\"\u0010'\u001a\u00020\u001b*\u00020\b8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b(\u0010\u000f\u001a\u0004\b)\u0010\u001e\"\"\u0010'\u001a\u00020\u001b*\u00020\u00018Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b*\u0010\u0004\u001a\u0004\b+\u0010$\"\"\u0010'\u001a\u00020\u001b*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010$\"\"\u0010.\u001a\u00020\u0002*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b/\u0010\u0017\u001a\u0004\b0\u00101\"\"\u00102\u001a\u00020\b*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b3\u0010\u0017\u001a\u0004\b4\u0010\u0019\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006d"}, d2 = {"center", "Landroidx/compose/ui/unit/DpOffset;", "Landroidx/compose/ui/unit/DpSize;", "getCenter-EaSLcWc$annotations", "(J)V", "getCenter-EaSLcWc", "(J)J", "dp", "Landroidx/compose/ui/unit/Dp;", "", "getDp$annotations", "(D)V", "getDp", "(D)F", "", "(F)V", "(F)F", "", "(I)V", "(I)F", "height", "Landroidx/compose/ui/unit/DpRect;", "getHeight$annotations", "(Landroidx/compose/ui/unit/DpRect;)V", "getHeight", "(Landroidx/compose/ui/unit/DpRect;)F", "isFinite", "", "isFinite-0680j_4$annotations", "isFinite-0680j_4", "(F)Z", "isSpecified", "isSpecified-0680j_4$annotations", "isSpecified-0680j_4", "isSpecified-jo-Fl9I$annotations", "isSpecified-jo-Fl9I", "(J)Z", "isSpecified-EaSLcWc$annotations", "isSpecified-EaSLcWc", "isUnspecified", "isUnspecified-0680j_4$annotations", "isUnspecified-0680j_4", "isUnspecified-jo-Fl9I$annotations", "isUnspecified-jo-Fl9I", "isUnspecified-EaSLcWc$annotations", "isUnspecified-EaSLcWc", "size", "getSize$annotations", "getSize", "(Landroidx/compose/ui/unit/DpRect;)J", "width", "getWidth$annotations", "getWidth", "DpOffset", "x", "y", "DpOffset-YgX7TsA", "(FF)J", "DpSize", "DpSize-YgX7TsA", "lerp", "start", "stop", "fraction", "lerp-Md-fbLM", "(FFF)F", "lerp-xhh869w", "(JJF)J", "lerp-IDex15A", "max", "a", "b", "max-YgX7TsA", "(FF)F", "min", "min-YgX7TsA", "coerceAtLeast", "minimumValue", "coerceAtLeast-YgX7TsA", "coerceAtMost", "maximumValue", "coerceAtMost-YgX7TsA", "coerceIn", "coerceIn-2z7ARbQ", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-D5KLDUw", "(FLkotlin/jvm/functions/Function0;)F", "takeOrElse-gVKV90s", "(JLkotlin/jvm/functions/Function0;)J", "takeOrElse-itqla9I", "times", "other", "times-3ABfNKs", "(DF)F", "times-6HolHcs", "(FJ)J", "(IF)F", "(IJ)J", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DpKt {
    /* renamed from: getCenter-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m4905getCenterEaSLcWc$annotations(long j) {
    }

    public static /* synthetic */ void getDp$annotations(double d) {
    }

    public static /* synthetic */ void getDp$annotations(float f) {
    }

    public static /* synthetic */ void getDp$annotations(int i) {
    }

    public static /* synthetic */ void getHeight$annotations(DpRect dpRect) {
    }

    public static /* synthetic */ void getSize$annotations(DpRect dpRect) {
    }

    public static /* synthetic */ void getWidth$annotations(DpRect dpRect) {
    }

    /* renamed from: isFinite-0680j_4, reason: not valid java name */
    public static final boolean m4906isFinite0680j_4(float f) {
        return !(f == Float.POSITIVE_INFINITY);
    }

    /* renamed from: isFinite-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m4907isFinite0680j_4$annotations(float f) {
    }

    /* renamed from: isSpecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m4909isSpecified0680j_4$annotations(float f) {
    }

    /* renamed from: isSpecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m4911isSpecifiedEaSLcWc$annotations(long j) {
    }

    /* renamed from: isSpecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m4913isSpecifiedjoFl9I$annotations(long j) {
    }

    /* renamed from: isUnspecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m4915isUnspecified0680j_4$annotations(float f) {
    }

    /* renamed from: isUnspecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m4917isUnspecifiedEaSLcWc$annotations(long j) {
    }

    /* renamed from: isUnspecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m4919isUnspecifiedjoFl9I$annotations(long j) {
    }

    /* renamed from: isSpecified-0680j_4, reason: not valid java name */
    public static final boolean m4908isSpecified0680j_4(float f) {
        return !Float.isNaN(f);
    }

    /* renamed from: isUnspecified-0680j_4, reason: not valid java name */
    public static final boolean m4914isUnspecified0680j_4(float f) {
        return Float.isNaN(f);
    }

    public static final float getDp(int i) {
        return Dp.m4878constructorimpl(i);
    }

    public static final float getDp(double d) {
        return Dp.m4878constructorimpl((float) d);
    }

    public static final float getDp(float f) {
        return Dp.m4878constructorimpl(f);
    }

    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m4929times3ABfNKs(float f, float f2) {
        return Dp.m4878constructorimpl(f * f2);
    }

    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m4928times3ABfNKs(double d, float f) {
        return Dp.m4878constructorimpl(((float) d) * f);
    }

    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m4930times3ABfNKs(int i, float f) {
        return Dp.m4878constructorimpl(i * f);
    }

    /* renamed from: min-YgX7TsA, reason: not valid java name */
    public static final float m4924minYgX7TsA(float f, float f2) {
        return Dp.m4878constructorimpl(Math.min(f, f2));
    }

    /* renamed from: max-YgX7TsA, reason: not valid java name */
    public static final float m4923maxYgX7TsA(float f, float f2) {
        return Dp.m4878constructorimpl(Math.max(f, f2));
    }

    /* renamed from: coerceIn-2z7ARbQ, reason: not valid java name */
    public static final float m4903coerceIn2z7ARbQ(float f, float f2, float f3) {
        return Dp.m4878constructorimpl(RangesKt.coerceIn(f, f2, f3));
    }

    /* renamed from: coerceAtLeast-YgX7TsA, reason: not valid java name */
    public static final float m4901coerceAtLeastYgX7TsA(float f, float f2) {
        return Dp.m4878constructorimpl(RangesKt.coerceAtLeast(f, f2));
    }

    /* renamed from: coerceAtMost-YgX7TsA, reason: not valid java name */
    public static final float m4902coerceAtMostYgX7TsA(float f, float f2) {
        return Dp.m4878constructorimpl(RangesKt.coerceAtMost(f, f2));
    }

    /* renamed from: lerp-Md-fbLM, reason: not valid java name */
    public static final float m4921lerpMdfbLM(float f, float f2, float f3) {
        return Dp.m4878constructorimpl(MathHelpersKt.lerp(f, f2, f3));
    }

    /* renamed from: isSpecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m4912isSpecifiedjoFl9I(long j) {
        return j != DpOffset.INSTANCE.m4948getUnspecifiedRKDOV3M();
    }

    /* renamed from: isUnspecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m4918isUnspecifiedjoFl9I(long j) {
        return j == DpOffset.INSTANCE.m4948getUnspecifiedRKDOV3M();
    }

    /* renamed from: lerp-xhh869w, reason: not valid java name */
    public static final long m4922lerpxhh869w(long j, long j2, float f) {
        return m4899DpOffsetYgX7TsA(m4921lerpMdfbLM(DpOffset.m4939getXD9Ej5fM(j), DpOffset.m4939getXD9Ej5fM(j2), f), m4921lerpMdfbLM(DpOffset.m4941getYD9Ej5fM(j), DpOffset.m4941getYD9Ej5fM(j2), f));
    }

    /* renamed from: isSpecified-EaSLcWc, reason: not valid java name */
    public static final boolean m4910isSpecifiedEaSLcWc(long j) {
        return j != DpSize.INSTANCE.m4985getUnspecifiedMYxV2XQ();
    }

    /* renamed from: isUnspecified-EaSLcWc, reason: not valid java name */
    public static final boolean m4916isUnspecifiedEaSLcWc(long j) {
        return j == DpSize.INSTANCE.m4985getUnspecifiedMYxV2XQ();
    }

    /* renamed from: getCenter-EaSLcWc, reason: not valid java name */
    public static final long m4904getCenterEaSLcWc(long j) {
        return m4899DpOffsetYgX7TsA(Dp.m4878constructorimpl(DpSize.m4976getWidthD9Ej5fM(j) / 2.0f), Dp.m4878constructorimpl(DpSize.m4974getHeightD9Ej5fM(j) / 2.0f));
    }

    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m4932times6HolHcs(int i, long j) {
        return DpSize.m4982timesGh9hcWk(j, i);
    }

    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m4931times6HolHcs(float f, long j) {
        return DpSize.m4981timesGh9hcWk(j, f);
    }

    /* renamed from: lerp-IDex15A, reason: not valid java name */
    public static final long m4920lerpIDex15A(long j, long j2, float f) {
        return m4900DpSizeYgX7TsA(m4921lerpMdfbLM(DpSize.m4976getWidthD9Ej5fM(j), DpSize.m4976getWidthD9Ej5fM(j2), f), m4921lerpMdfbLM(DpSize.m4974getHeightD9Ej5fM(j), DpSize.m4974getHeightD9Ej5fM(j2), f));
    }

    public static final float getWidth(DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return Dp.m4878constructorimpl(dpRect.m4962getRightD9Ej5fM() - dpRect.m4961getLeftD9Ej5fM());
    }

    public static final float getHeight(DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return Dp.m4878constructorimpl(dpRect.m4960getBottomD9Ej5fM() - dpRect.m4963getTopD9Ej5fM());
    }

    /* renamed from: takeOrElse-D5KLDUw, reason: not valid java name */
    public static final float m4925takeOrElseD5KLDUw(float f, Function0<Dp> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return Float.isNaN(f) ^ true ? f : block.invoke().m4892unboximpl();
    }

    /* renamed from: DpOffset-YgX7TsA, reason: not valid java name */
    public static final long m4899DpOffsetYgX7TsA(float f, float f2) {
        return DpOffset.m4934constructorimpl((Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    /* renamed from: takeOrElse-gVKV90s, reason: not valid java name */
    public static final long m4926takeOrElsegVKV90s(long j, Function0<DpOffset> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return j != DpOffset.INSTANCE.m4948getUnspecifiedRKDOV3M() ? j : block.invoke().getPackedValue();
    }

    /* renamed from: DpSize-YgX7TsA, reason: not valid java name */
    public static final long m4900DpSizeYgX7TsA(float f, float f2) {
        return DpSize.m4967constructorimpl((Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    /* renamed from: takeOrElse-itqla9I, reason: not valid java name */
    public static final long m4927takeOrElseitqla9I(long j, Function0<DpSize> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return j != DpSize.INSTANCE.m4985getUnspecifiedMYxV2XQ() ? j : block.invoke().getPackedValue();
    }

    public static final long getSize(DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return m4900DpSizeYgX7TsA(Dp.m4878constructorimpl(dpRect.m4962getRightD9Ej5fM() - dpRect.m4961getLeftD9Ej5fM()), Dp.m4878constructorimpl(dpRect.m4960getBottomD9Ej5fM() - dpRect.m4963getTopD9Ej5fM()));
    }
}
