package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LazyListBeyondBoundsModifier.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"lazyListBeyondBoundsModifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "beyondBoundsItemCount", "", "reverseLayout", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;IZLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyListBeyondBoundsModifierKt {
    public static final Modifier lazyListBeyondBoundsModifier(Modifier $this$lazyListBeyondBoundsModifier, LazyListState state, int beyondBoundsItemCount, boolean reverseLayout, Orientation orientation, Composer $composer, int $changed) {
        Object value$iv$iv;
        Intrinsics.checkNotNullParameter($this$lazyListBeyondBoundsModifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        $composer.startReplaceableGroup(1452310458);
        ComposerKt.sourceInformation($composer, "C(lazyListBeyondBoundsModifier)P(3!1,2)38@1484L7,39@1520L110,43@1702L340:LazyListBeyondBoundsModifier.kt#428nma");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1452310458, $changed, -1, "androidx.compose.foundation.lazy.lazyListBeyondBoundsModifier (LazyListBeyondBoundsModifier.kt:32)");
        }
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = $composer.consume(localLayoutDirection);
        ComposerKt.sourceInformationMarkerEnd($composer);
        LayoutDirection layoutDirection = (LayoutDirection) consume;
        Object key2$iv = Integer.valueOf(beyondBoundsItemCount);
        int i = (($changed >> 3) & 14) | (($changed >> 3) & 112);
        $composer.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation($composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean invalid$iv$iv = $composer.changed(state) | $composer.changed(key2$iv);
        Object it$iv$iv = $composer.rememberedValue();
        if (invalid$iv$iv || it$iv$iv == Composer.INSTANCE.getEmpty()) {
            value$iv$iv = new LazyListBeyondBoundsState(state, beyondBoundsItemCount);
            $composer.updateRememberedValue(value$iv$iv);
        } else {
            value$iv$iv = it$iv$iv;
        }
        $composer.endReplaceableGroup();
        LazyListBeyondBoundsState beyondBoundsState = (LazyListBeyondBoundsState) value$iv$iv;
        LazyLayoutBeyondBoundsInfo beyondBoundsInfo = state.getBeyondBoundsInfo();
        Object[] keys$iv = {beyondBoundsState, beyondBoundsInfo, Boolean.valueOf(reverseLayout), layoutDirection, orientation};
        $composer.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation($composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean invalid$iv = false;
        for (Object key$iv : keys$iv) {
            invalid$iv |= $composer.changed(key$iv);
        }
        Object value$iv$iv2 = $composer.rememberedValue();
        if (invalid$iv || value$iv$iv2 == Composer.INSTANCE.getEmpty()) {
            value$iv$iv2 = new LazyLayoutBeyondBoundsModifierLocal(beyondBoundsState, beyondBoundsInfo, reverseLayout, layoutDirection, orientation);
            $composer.updateRememberedValue(value$iv$iv2);
        }
        $composer.endReplaceableGroup();
        Modifier then = $this$lazyListBeyondBoundsModifier.then((Modifier) value$iv$iv2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceableGroup();
        return then;
    }
}
