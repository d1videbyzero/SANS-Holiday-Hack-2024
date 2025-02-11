package androidx.compose.material.ripple;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Ripple.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u00002\u00020\u0001B&\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010\u0014JI\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H'ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u0019\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\n\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/material/ripple/Ripple;", "Landroidx/compose/foundation/Indication;", "bounded", "", "radius", "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "(ZFLandroidx/compose/runtime/State;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "equals", "other", "", "hashCode", "", "rememberUpdatedInstance", "Landroidx/compose/foundation/IndicationInstance;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/IndicationInstance;", "rememberUpdatedRippleInstance", "Landroidx/compose/material/ripple/RippleIndicationInstance;", "rippleAlpha", "Landroidx/compose/material/ripple/RippleAlpha;", "rememberUpdatedRippleInstance-942rkJo", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ripple/RippleIndicationInstance;", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Ripple implements Indication {
    private final boolean bounded;
    private final State<Color> color;
    private final float radius;

    public /* synthetic */ Ripple(boolean z, float f, State state, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, state);
    }

    /* renamed from: rememberUpdatedRippleInstance-942rkJo */
    public abstract RippleIndicationInstance mo1275rememberUpdatedRippleInstance942rkJo(InteractionSource interactionSource, boolean z, float f, State<Color> state, State<RippleAlpha> state2, Composer composer, int i);

    private Ripple(boolean bounded, float radius, State<Color> color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.bounded = bounded;
        this.radius = radius;
        this.color = color;
    }

    @Override // androidx.compose.foundation.Indication
    public final IndicationInstance rememberUpdatedInstance(InteractionSource interactionSource, Composer $composer, int $changed) {
        long mo1119defaultColorWaAFU9c;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        $composer.startReplaceableGroup(988743187);
        ComposerKt.sourceInformation($composer, "C(rememberUpdatedInstance)116@5361L7,117@5389L174,124@5617L13,124@5590L41,126@5656L155,134@5821L535:Ripple.kt#vhb33q");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(988743187, $changed, -1, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:113)");
        }
        ProvidableCompositionLocal<RippleTheme> localRippleTheme = RippleThemeKt.getLocalRippleTheme();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = $composer.consume(localRippleTheme);
        ComposerKt.sourceInformationMarkerEnd($composer);
        RippleTheme theme = (RippleTheme) consume;
        $composer.startReplaceableGroup(-1524341038);
        ComposerKt.sourceInformation($composer, "121@5525L14");
        long $this$isSpecified$iv = this.color.getValue().m2957unboximpl();
        if ($this$isSpecified$iv != Color.INSTANCE.m2983getUnspecified0d7_KjU()) {
            mo1119defaultColorWaAFU9c = this.color.getValue().m2957unboximpl();
        } else {
            mo1119defaultColorWaAFU9c = theme.mo1119defaultColorWaAFU9c($composer, 0);
        }
        $composer.endReplaceableGroup();
        State color = SnapshotStateKt.rememberUpdatedState(Color.m2937boximpl(mo1119defaultColorWaAFU9c), $composer, 0);
        State rippleAlpha = SnapshotStateKt.rememberUpdatedState(theme.rippleAlpha($composer, 0), $composer, 0);
        RippleIndicationInstance instance = mo1275rememberUpdatedRippleInstance942rkJo(interactionSource, this.bounded, this.radius, color, rippleAlpha, $composer, ($changed & 14) | (($changed << 12) & 458752));
        EffectsKt.LaunchedEffect(instance, interactionSource, new Ripple$rememberUpdatedInstance$1(interactionSource, instance, null), $composer, (($changed << 3) & 112) | 520);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceableGroup();
        return instance;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Ripple) && this.bounded == ((Ripple) other).bounded && Dp.m5221equalsimpl0(this.radius, ((Ripple) other).radius) && Intrinsics.areEqual(this.color, ((Ripple) other).color);
    }

    public int hashCode() {
        int result = Boolean.hashCode(this.bounded);
        return (((result * 31) + Dp.m5222hashCodeimpl(this.radius)) * 31) + this.color.hashCode();
    }
}
