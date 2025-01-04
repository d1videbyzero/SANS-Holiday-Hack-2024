package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: LazyStaggeredGridState.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"rememberLazyStaggeredGridState", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "initialFirstVisibleItemIndex", "", "initialFirstVisibleItemScrollOffset", "(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridStateKt {
    public static final LazyStaggeredGridState rememberLazyStaggeredGridState(int initialFirstVisibleItemIndex, int initialFirstVisibleItemScrollOffset, Composer $composer, int $changed, int i) {
        Object key1$iv;
        $composer.startReplaceableGroup(161145796);
        ComposerKt.sourceInformation($composer, "C(rememberLazyStaggeredGridState)68@3273L139,68@3218L194:LazyStaggeredGridState.kt#fzvcnm");
        final int initialFirstVisibleItemIndex2 = (i & 1) != 0 ? 0 : initialFirstVisibleItemIndex;
        final int initialFirstVisibleItemScrollOffset2 = (i & 2) != 0 ? 0 : initialFirstVisibleItemScrollOffset;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(161145796, $changed, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState (LazyStaggeredGridState.kt:64)");
        }
        Object[] objArr = new Object[0];
        Saver<LazyStaggeredGridState, Object> saver = LazyStaggeredGridState.INSTANCE.getSaver();
        Object key1$iv2 = Integer.valueOf(initialFirstVisibleItemIndex2);
        Object key2$iv = Integer.valueOf(initialFirstVisibleItemScrollOffset2);
        int i2 = ($changed & 14) | ($changed & 112);
        $composer.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation($composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean invalid$iv$iv = $composer.changed(key1$iv2) | $composer.changed(key2$iv);
        Object it$iv$iv = $composer.rememberedValue();
        if (invalid$iv$iv || it$iv$iv == Composer.INSTANCE.getEmpty()) {
            key1$iv = (Function0) new Function0<LazyStaggeredGridState>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt$rememberLazyStaggeredGridState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final LazyStaggeredGridState invoke() {
                    return new LazyStaggeredGridState(initialFirstVisibleItemIndex2, initialFirstVisibleItemScrollOffset2);
                }
            };
            $composer.updateRememberedValue(key1$iv);
        } else {
            key1$iv = it$iv$iv;
        }
        $composer.endReplaceableGroup();
        Object key2$iv2 = key1$iv;
        LazyStaggeredGridState lazyStaggeredGridState = (LazyStaggeredGridState) RememberSaveableKt.m2594rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) key2$iv2, $composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceableGroup();
        return lazyStaggeredGridState;
    }
}
