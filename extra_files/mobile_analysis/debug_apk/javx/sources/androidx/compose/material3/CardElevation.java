package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Card.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B:\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\tJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0011J*\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0011R\u0019\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\nR\u0019\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\nR\u0019\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\nR\u0019\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\nR\u0019\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\nR\u0019\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\n\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/material3/CardElevation;", "", "defaultElevation", "Landroidx/compose/ui/unit/Dp;", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "(FFFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "animateElevation", "Landroidx/compose/runtime/State;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "(ZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "equals", "other", "hashCode", "", "shadowElevation", "shadowElevation$material3_release", "tonalElevation", "tonalElevation$material3_release", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CardElevation {
    public static final int $stable = 0;
    private final float defaultElevation;
    private final float disabledElevation;
    private final float draggedElevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    public /* synthetic */ CardElevation(float f, float f2, float f3, float f4, float f5, float f6, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6);
    }

    private CardElevation(float defaultElevation, float pressedElevation, float focusedElevation, float hoveredElevation, float draggedElevation, float disabledElevation) {
        this.defaultElevation = defaultElevation;
        this.pressedElevation = pressedElevation;
        this.focusedElevation = focusedElevation;
        this.hoveredElevation = hoveredElevation;
        this.draggedElevation = draggedElevation;
        this.disabledElevation = disabledElevation;
    }

    public final State<Dp> tonalElevation$material3_release(boolean enabled, InteractionSource interactionSource, Composer $composer, int $changed) {
        Object value$iv$iv;
        $composer.startReplaceableGroup(1757792649);
        ComposerKt.sourceInformation($composer, "C(tonalElevation)586@27029L74:Card.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1757792649, $changed, -1, "androidx.compose.material3.CardElevation.tonalElevation (Card.kt:579)");
        }
        $composer.startReplaceableGroup(603878391);
        ComposerKt.sourceInformation($composer, "584@26958L45");
        if (interactionSource != null) {
            $composer.endReplaceableGroup();
            State<Dp> animateElevation = animateElevation(enabled, interactionSource, $composer, ($changed & 14) | ($changed & 112) | ($changed & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            $composer.endReplaceableGroup();
            return animateElevation;
        }
        $composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation($composer, "CC(remember):Composables.kt#9igjgp");
        Object it$iv$iv = $composer.rememberedValue();
        if (it$iv$iv == Composer.INSTANCE.getEmpty()) {
            value$iv$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m5214boximpl(this.defaultElevation), null, 2, null);
            $composer.updateRememberedValue(value$iv$iv);
        } else {
            value$iv$iv = it$iv$iv;
        }
        $composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) value$iv$iv;
        $composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceableGroup();
        return mutableState;
    }

    public final State<Dp> shadowElevation$material3_release(boolean enabled, InteractionSource interactionSource, Composer $composer, int $changed) {
        Object value$iv$iv;
        $composer.startReplaceableGroup(-1763481333);
        ComposerKt.sourceInformation($composer, "C(shadowElevation)608@27911L74:Card.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1763481333, $changed, -1, "androidx.compose.material3.CardElevation.shadowElevation (Card.kt:601)");
        }
        $composer.startReplaceableGroup(-1409180589);
        ComposerKt.sourceInformation($composer, "606@27840L45");
        if (interactionSource != null) {
            $composer.endReplaceableGroup();
            State<Dp> animateElevation = animateElevation(enabled, interactionSource, $composer, ($changed & 14) | ($changed & 112) | ($changed & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            $composer.endReplaceableGroup();
            return animateElevation;
        }
        $composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation($composer, "CC(remember):Composables.kt#9igjgp");
        Object it$iv$iv = $composer.rememberedValue();
        if (it$iv$iv == Composer.INSTANCE.getEmpty()) {
            value$iv$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m5214boximpl(this.defaultElevation), null, 2, null);
            $composer.updateRememberedValue(value$iv$iv);
        } else {
            value$iv$iv = it$iv$iv;
        }
        $composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) value$iv$iv;
        $composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceableGroup();
        return mutableState;
    }

    private final State<Dp> animateElevation(boolean enabled, InteractionSource interactionSource, Composer $composer, int $changed) {
        Object value$iv$iv;
        Object value$iv$iv2;
        float target;
        Object value$iv$iv3;
        $composer.startReplaceableGroup(-1421890746);
        ComposerKt.sourceInformation($composer, "C(animateElevation)616@28160L46,617@28249L1473,617@28215L1507,669@30284L51,671@30345L776:Card.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1421890746, $changed, -1, "androidx.compose.material3.CardElevation.animateElevation (Card.kt:612)");
        }
        $composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation($composer, "CC(remember):Composables.kt#9igjgp");
        Object it$iv$iv = $composer.rememberedValue();
        if (it$iv$iv == Composer.INSTANCE.getEmpty()) {
            value$iv$iv = SnapshotStateKt.mutableStateListOf();
            $composer.updateRememberedValue(value$iv$iv);
        } else {
            value$iv$iv = it$iv$iv;
        }
        $composer.endReplaceableGroup();
        SnapshotStateList interactions = (SnapshotStateList) value$iv$iv;
        int i = (($changed >> 3) & 14) | 48;
        $composer.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation($composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean invalid$iv$iv = $composer.changed(interactionSource) | $composer.changed(interactions);
        Object it$iv$iv2 = $composer.rememberedValue();
        if (invalid$iv$iv || it$iv$iv2 == Composer.INSTANCE.getEmpty()) {
            value$iv$iv2 = new CardElevation$animateElevation$1$1(interactionSource, interactions, null);
            $composer.updateRememberedValue(value$iv$iv2);
        } else {
            value$iv$iv2 = it$iv$iv2;
        }
        $composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) value$iv$iv2, $composer, (($changed >> 3) & 14) | 64);
        Interaction interaction = (Interaction) CollectionsKt.lastOrNull((List) interactions);
        if (!enabled) {
            target = this.disabledElevation;
        } else if (interaction instanceof PressInteraction.Press) {
            target = this.pressedElevation;
        } else if (interaction instanceof HoverInteraction.Enter) {
            target = this.hoveredElevation;
        } else if (interaction instanceof FocusInteraction.Focus) {
            target = this.focusedElevation;
        } else {
            target = interaction instanceof DragInteraction.Start ? this.draggedElevation : this.defaultElevation;
        }
        $composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation($composer, "CC(remember):Composables.kt#9igjgp");
        Object it$iv$iv3 = $composer.rememberedValue();
        if (it$iv$iv3 == Composer.INSTANCE.getEmpty()) {
            value$iv$iv3 = new Animatable(Dp.m5214boximpl(target), VectorConvertersKt.getVectorConverter(Dp.INSTANCE), null, null, 12, null);
            $composer.updateRememberedValue(value$iv$iv3);
        } else {
            value$iv$iv3 = it$iv$iv3;
        }
        $composer.endReplaceableGroup();
        Animatable animatable = (Animatable) value$iv$iv3;
        EffectsKt.LaunchedEffect(Dp.m5214boximpl(target), new CardElevation$animateElevation$2(enabled, animatable, this, target, interaction, null), $composer, 64);
        State<Dp> asState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceableGroup();
        return asState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && (other instanceof CardElevation) && Dp.m5221equalsimpl0(this.defaultElevation, ((CardElevation) other).defaultElevation) && Dp.m5221equalsimpl0(this.pressedElevation, ((CardElevation) other).pressedElevation) && Dp.m5221equalsimpl0(this.focusedElevation, ((CardElevation) other).focusedElevation) && Dp.m5221equalsimpl0(this.hoveredElevation, ((CardElevation) other).hoveredElevation) && Dp.m5221equalsimpl0(this.disabledElevation, ((CardElevation) other).disabledElevation)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int result = Dp.m5222hashCodeimpl(this.defaultElevation);
        return (((((((result * 31) + Dp.m5222hashCodeimpl(this.pressedElevation)) * 31) + Dp.m5222hashCodeimpl(this.focusedElevation)) * 31) + Dp.m5222hashCodeimpl(this.hoveredElevation)) * 31) + Dp.m5222hashCodeimpl(this.disabledElevation);
    }
}
