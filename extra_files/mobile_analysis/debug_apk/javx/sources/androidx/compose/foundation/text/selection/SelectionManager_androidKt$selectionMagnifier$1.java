package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.MagnifierKt;
import androidx.compose.foundation.MagnifierStyle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: SelectionManager.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SelectionManager_androidKt$selectionMagnifier$1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ SelectionManager $manager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionManager_androidKt$selectionMagnifier$1(SelectionManager selectionManager) {
        super(3);
        this.$manager = selectionManager;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final Modifier invoke(Modifier composed, Composer $composer, int $changed) {
        Object value$iv$iv;
        Object value$iv$iv2;
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        $composer.startReplaceableGroup(-1914520728);
        ComposerKt.sourceInformation($composer, "C46@1956L7,47@1993L41,52@2231L472:SelectionManager.android.kt#eksfi3");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1914520728, $changed, -1, "androidx.compose.foundation.text.selection.selectionMagnifier.<anonymous> (SelectionManager.android.kt:45)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = $composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd($composer);
        final Density density = (Density) consume;
        $composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation($composer, "CC(remember):Composables.kt#9igjgp");
        Object it$iv$iv = $composer.rememberedValue();
        if (it$iv$iv == Composer.INSTANCE.getEmpty()) {
            value$iv$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m5368boximpl(IntSize.INSTANCE.m5381getZeroYbymL2g()), null, 2, null);
            $composer.updateRememberedValue(value$iv$iv);
        } else {
            value$iv$iv = it$iv$iv;
        }
        $composer.endReplaceableGroup();
        final MutableState magnifierSize$delegate = (MutableState) value$iv$iv;
        final SelectionManager selectionManager = this.$manager;
        Function0<Offset> function0 = new Function0<Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Offset invoke() {
                return Offset.m2697boximpl(m931invokeF1C5BW0());
            }

            /* renamed from: invoke-F1C5BW0, reason: not valid java name */
            public final long m931invokeF1C5BW0() {
                return SelectionManagerKt.m928calculateSelectionMagnifierCenterAndroidO0kMr_c(SelectionManager.this, SelectionManager_androidKt$selectionMagnifier$1.invoke$lambda$1(magnifierSize$delegate));
            }
        };
        $composer.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation($composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean invalid$iv$iv = $composer.changed(magnifierSize$delegate) | $composer.changed(density);
        Object it$iv$iv2 = $composer.rememberedValue();
        if (invalid$iv$iv || it$iv$iv2 == Composer.INSTANCE.getEmpty()) {
            value$iv$iv2 = new Function1<Function0<? extends Offset>, Modifier>() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Modifier invoke(Function0<? extends Offset> function02) {
                    return invoke2((Function0<Offset>) function02);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Modifier invoke2(final Function0<Offset> center) {
                    Modifier magnifier;
                    Intrinsics.checkNotNullParameter(center, "center");
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MagnifierStyle textDefault = MagnifierStyle.INSTANCE.getTextDefault();
                    Function1<Density, Offset> function1 = new Function1<Density, Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1$2$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Offset invoke(Density density2) {
                            return Offset.m2697boximpl(m932invoketuRUvjQ(density2));
                        }

                        /* renamed from: invoke-tuRUvjQ, reason: not valid java name */
                        public final long m932invoketuRUvjQ(Density magnifier2) {
                            Intrinsics.checkNotNullParameter(magnifier2, "$this$magnifier");
                            return center.invoke().getPackedValue();
                        }
                    };
                    final Density density2 = Density.this;
                    final MutableState<IntSize> mutableState = magnifierSize$delegate;
                    magnifier = MagnifierKt.magnifier(companion, function1, (r12 & 2) != 0 ? new Function1<Density, Offset>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Offset invoke(Density density3) {
                            return Offset.m2697boximpl(m217invoketuRUvjQ(density3));
                        }

                        /* renamed from: invoke-tuRUvjQ, reason: not valid java name */
                        public final long m217invoketuRUvjQ(Density $this$null) {
                            Intrinsics.checkNotNullParameter($this$null, "$this$null");
                            return Offset.INSTANCE.m2723getUnspecifiedF1C5BW0();
                        }
                    } : null, (r12 & 4) != 0 ? Float.NaN : 0.0f, (r12 & 8) != 0 ? MagnifierStyle.INSTANCE.getDefault() : textDefault, (r12 & 16) != 0 ? null : new Function1<DpSize, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1$2$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DpSize dpSize) {
                            m933invokeEaSLcWc(dpSize.getPackedValue());
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke-EaSLcWc, reason: not valid java name */
                        public final void m933invokeEaSLcWc(long size) {
                            MutableState<IntSize> mutableState2 = mutableState;
                            Density $this$invoke_EaSLcWc_u24lambda_u240 = Density.this;
                            SelectionManager_androidKt$selectionMagnifier$1.invoke$lambda$2(mutableState2, IntSizeKt.IntSize($this$invoke_EaSLcWc_u24lambda_u240.mo321roundToPx0680j_4(DpSize.m5314getWidthD9Ej5fM(size)), $this$invoke_EaSLcWc_u24lambda_u240.mo321roundToPx0680j_4(DpSize.m5312getHeightD9Ej5fM(size))));
                        }
                    });
                    return magnifier;
                }
            };
            $composer.updateRememberedValue(value$iv$iv2);
        } else {
            value$iv$iv2 = it$iv$iv2;
        }
        $composer.endReplaceableGroup();
        Modifier animatedSelectionMagnifier = SelectionMagnifierKt.animatedSelectionMagnifier(composed, function0, (Function1) value$iv$iv2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceableGroup();
        return animatedSelectionMagnifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long invoke$lambda$1(MutableState<IntSize> mutableState) {
        MutableState<IntSize> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2(MutableState<IntSize> mutableState, long value) {
        mutableState.setValue(IntSize.m5368boximpl(value));
    }
}
