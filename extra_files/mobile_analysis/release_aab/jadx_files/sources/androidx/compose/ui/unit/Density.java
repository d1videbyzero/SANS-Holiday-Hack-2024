package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* compiled from: Density.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u000b\u001a\u00020\f*\u00020\rH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u000b\u001a\u00020\f*\u00020\u0010H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\r*\u00020\u0010H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0013\u001a\u00020\r*\u00020\u0003H\u0017ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0013\u001a\u00020\r*\u00020\fH\u0017ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u001a*\u00020\u001bH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u0003*\u00020\rH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u0019\u0010\u001e\u001a\u00020\u0003*\u00020\u0010H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010\u0015J\f\u0010!\u001a\u00020\"*\u00020#H\u0017J\u0019\u0010$\u001a\u00020\u001b*\u00020\u001aH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010\u001dJ\u0019\u0010&\u001a\u00020\u0010*\u00020\rH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u001c\u0010&\u001a\u00020\u0010*\u00020\u0003H\u0017ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010(J\u001c\u0010&\u001a\u00020\u0010*\u00020\fH\u0017ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0002\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007ø\u0001\u0003\u0082\u0002\u0015\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!\n\u0004\b!0\u0001¨\u0006+À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/Density;", "", "density", "", "getDensity$annotations", "()V", "getDensity", "()F", "fontScale", "getFontScale$annotations", "getFontScale", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-GaN1DYA", "(J)F", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Density {
    float getDensity();

    float getFontScale();

    /* compiled from: Density.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void getDensity$annotations() {
        }

        public static /* synthetic */ void getFontScale$annotations() {
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m4871toPx0680j_4(Density density, float f) {
            return Density.super.mo327toPx0680j_4(f);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m4865roundToPx0680j_4(Density density, float f) {
            return Density.super.mo321roundToPx0680j_4(f);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m4873toSp0xMU5do(Density density, float f) {
            return Density.super.mo329toSp0xMU5do(f);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m4870toPxR2X_6o(Density density, long j) {
            return Density.super.mo326toPxR2X_6o(j);
        }

        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m4864roundToPxR2X_6o(Density density, long j) {
            return Density.super.mo320roundToPxR2X_6o(j);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m4866toDpGaN1DYA(Density density, long j) {
            return Density.super.mo322toDpGaN1DYA(j);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4868toDpu2uoSUM(Density density, int i) {
            return Density.super.mo324toDpu2uoSUM(i);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4875toSpkPz2Gy4(Density density, int i) {
            return Density.super.mo331toSpkPz2Gy4(i);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4867toDpu2uoSUM(Density density, float f) {
            return Density.super.mo323toDpu2uoSUM(f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4874toSpkPz2Gy4(Density density, float f) {
            return Density.super.mo330toSpkPz2Gy4(f);
        }

        @Deprecated
        public static Rect toRect(Density density, DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return Density.super.toRect(receiver);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m4872toSizeXkaWNTQ(Density density, long j) {
            return Density.super.mo328toSizeXkaWNTQ(j);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m4869toDpSizekrfVVM(Density density, long j) {
            return Density.super.mo325toDpSizekrfVVM(j);
        }
    }

    /* renamed from: toPx-0680j_4 */
    default float mo327toPx0680j_4(float f) {
        return f * getDensity();
    }

    /* renamed from: roundToPx-0680j_4 */
    default int mo321roundToPx0680j_4(float f) {
        float mo327toPx0680j_4 = mo327toPx0680j_4(f);
        if (Float.isInfinite(mo327toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return MathKt.roundToInt(mo327toPx0680j_4);
    }

    /* renamed from: toSp-0xMU5do */
    default long mo329toSp0xMU5do(float f) {
        return TextUnitKt.getSp(f / getFontScale());
    }

    /* renamed from: toPx--R2X_6o */
    default float mo326toPxR2X_6o(long j) {
        if (!TextUnitType.m5087equalsimpl0(TextUnit.m5058getTypeUIouoOA(j), TextUnitType.INSTANCE.m5092getSpUIouoOA())) {
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }
        return TextUnit.m5059getValueimpl(j) * getFontScale() * getDensity();
    }

    /* renamed from: roundToPx--R2X_6o */
    default int mo320roundToPxR2X_6o(long j) {
        return MathKt.roundToInt(mo326toPxR2X_6o(j));
    }

    /* renamed from: toDp-GaN1DYA */
    default float mo322toDpGaN1DYA(long j) {
        if (!TextUnitType.m5087equalsimpl0(TextUnit.m5058getTypeUIouoOA(j), TextUnitType.INSTANCE.m5092getSpUIouoOA())) {
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }
        return Dp.m4878constructorimpl(TextUnit.m5059getValueimpl(j) * getFontScale());
    }

    /* renamed from: toDp-u2uoSUM */
    default float mo324toDpu2uoSUM(int i) {
        return Dp.m4878constructorimpl(i / getDensity());
    }

    /* renamed from: toSp-kPz2Gy4 */
    default long mo331toSpkPz2Gy4(int i) {
        return TextUnitKt.getSp(i / (getFontScale() * getDensity()));
    }

    /* renamed from: toDp-u2uoSUM */
    default float mo323toDpu2uoSUM(float f) {
        return Dp.m4878constructorimpl(f / getDensity());
    }

    /* renamed from: toSp-kPz2Gy4 */
    default long mo330toSpkPz2Gy4(float f) {
        return TextUnitKt.getSp(f / (getFontScale() * getDensity()));
    }

    default Rect toRect(DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return new Rect(mo327toPx0680j_4(dpRect.m4961getLeftD9Ej5fM()), mo327toPx0680j_4(dpRect.m4963getTopD9Ej5fM()), mo327toPx0680j_4(dpRect.m4962getRightD9Ej5fM()), mo327toPx0680j_4(dpRect.m4960getBottomD9Ej5fM()));
    }

    /* renamed from: toSize-XkaWNTQ */
    default long mo328toSizeXkaWNTQ(long j) {
        if (j != DpSize.INSTANCE.m4985getUnspecifiedMYxV2XQ()) {
            return SizeKt.Size(mo327toPx0680j_4(DpSize.m4976getWidthD9Ej5fM(j)), mo327toPx0680j_4(DpSize.m4974getHeightD9Ej5fM(j)));
        }
        return Size.INSTANCE.m2468getUnspecifiedNHjbRc();
    }

    /* renamed from: toDpSize-k-rfVVM */
    default long mo325toDpSizekrfVVM(long j) {
        if (j != Size.INSTANCE.m2468getUnspecifiedNHjbRc()) {
            return DpKt.m4900DpSizeYgX7TsA(mo323toDpu2uoSUM(Size.m2460getWidthimpl(j)), mo323toDpu2uoSUM(Size.m2457getHeightimpl(j)));
        }
        return DpSize.INSTANCE.m4985getUnspecifiedMYxV2XQ();
    }
}
