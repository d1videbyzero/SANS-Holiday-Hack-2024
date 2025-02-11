package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.SelectionController;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BasicText.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0087\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0093\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a}\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001ag\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001aq\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010 \u001a}\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010!\u001a\u001e\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0#2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002\u001a¯\u0001\u0010'\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010(\u001a\u00020)2\u0014\u0010*\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,\u0018\u00010+2\u001c\u0010.\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010/0+\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\u00100\u001a\u0004\u0018\u0001012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00064"}, d2 = {"BasicText", "", "text", "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", "style", "Landroidx/compose/ui/text/TextStyle;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "BasicText-VhcvRP8", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "color", "Landroidx/compose/ui/graphics/ColorProducer;", "BasicText-RWo7tUw", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V", "BasicText-4YKlhWE", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "BasicText-BpD7jsM", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILandroidx/compose/runtime/Composer;II)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/runtime/Composer;II)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V", "selectionIdSaver", "Landroidx/compose/runtime/saveable/Saver;", "", "selectionRegistrar", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "textModifier", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "onPlaceholderLayout", "Landroidx/compose/ui/geometry/Rect;", "selectionController", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "textModifier-RWo7tUw", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicTextKt {
    /* JADX WARN: Removed duplicated region for block: B:76:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03c3  */
    /* renamed from: BasicText-VhcvRP8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m744BasicTextVhcvRP8(final java.lang.String r48, androidx.compose.ui.Modifier r49, androidx.compose.ui.text.TextStyle r50, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r51, int r52, boolean r53, int r54, int r55, androidx.compose.ui.graphics.ColorProducer r56, androidx.compose.runtime.Composer r57, final int r58, final int r59) {
        /*
            Method dump skipped, instructions count: 1133
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m744BasicTextVhcvRP8(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function1, int, boolean, int, int, androidx.compose.ui.graphics.ColorProducer, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: BasicText-RWo7tUw, reason: not valid java name */
    public static final void m742BasicTextRWo7tUw(final AnnotatedString text, Modifier modifier, TextStyle style, Function1<? super TextLayoutResult, Unit> function1, int overflow, boolean softWrap, int maxLines, int minLines, Map<String, InlineTextContent> map, ColorProducer color, Composer $composer, final int $changed, final int i) {
        int i2;
        Modifier modifier2;
        TextStyle style2;
        Function1 onTextLayout;
        int overflow2;
        boolean softWrap2;
        ColorProducer color2;
        SelectionController selectionController;
        int minLines2;
        int maxLines2;
        Map inlineContent;
        Object value$iv$iv;
        Object value$iv$iv2;
        Composer $composer2;
        Object value$iv$iv3;
        Object value$iv$iv4;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer $composer3 = $composer.startRestartGroup(-1064305212);
        ComposerKt.sourceInformation($composer3, "C(BasicText)P(9,4,8,5,6:c#ui.text.style.TextOverflow,7,2,3,1)183@8574L7:BasicText.kt#423gt5");
        int $dirty = $changed;
        if ((i & 1) != 0) {
            $dirty |= 6;
        } else if (($changed & 14) == 0) {
            $dirty |= $composer3.changed(text) ? 4 : 2;
        }
        int i3 = i & 2;
        if (i3 != 0) {
            $dirty |= 48;
        } else if (($changed & 112) == 0) {
            $dirty |= $composer3.changed(modifier) ? 32 : 16;
        }
        int i4 = i & 4;
        if (i4 != 0) {
            $dirty |= 384;
        } else if (($changed & 896) == 0) {
            $dirty |= $composer3.changed(style) ? 256 : 128;
        }
        int i5 = i & 8;
        if (i5 != 0) {
            $dirty |= 3072;
        } else if (($changed & 7168) == 0) {
            $dirty |= $composer3.changedInstance(function1) ? 2048 : 1024;
        }
        int i6 = i & 16;
        if (i6 != 0) {
            $dirty |= 24576;
            i2 = overflow;
        } else if ((57344 & $changed) == 0) {
            i2 = overflow;
            $dirty |= $composer3.changed(i2) ? 16384 : 8192;
        } else {
            i2 = overflow;
        }
        int i7 = i & 32;
        if (i7 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if (($changed & 458752) == 0) {
            $dirty |= $composer3.changed(softWrap) ? 131072 : 65536;
        }
        int i8 = i & 64;
        if (i8 != 0) {
            $dirty |= 1572864;
        } else if (($changed & 3670016) == 0) {
            $dirty |= $composer3.changed(maxLines) ? 1048576 : 524288;
        }
        int i9 = i & 128;
        if (i9 != 0) {
            $dirty |= 12582912;
        } else if (($changed & 29360128) == 0) {
            $dirty |= $composer3.changed(minLines) ? 8388608 : 4194304;
        }
        int i10 = i & 256;
        if (i10 != 0) {
            $dirty |= 33554432;
        }
        int i11 = i & 512;
        if (i11 != 0) {
            $dirty |= 268435456;
        }
        if ((i & 768) == 768 && (1533916891 & $dirty) == 306783378 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            modifier2 = modifier;
            style2 = style;
            onTextLayout = function1;
            softWrap2 = softWrap;
            maxLines2 = maxLines;
            minLines2 = minLines;
            inlineContent = map;
            color2 = color;
            overflow2 = i2;
            $composer2 = $composer3;
        } else {
            modifier2 = i3 != 0 ? Modifier.INSTANCE : modifier;
            style2 = i4 != 0 ? TextStyle.INSTANCE.getDefault() : style;
            onTextLayout = i5 != 0 ? null : function1;
            overflow2 = i6 != 0 ? TextOverflow.INSTANCE.m5135getClipgIe3tQ8() : i2;
            softWrap2 = i7 != 0 ? true : softWrap;
            int maxLines3 = i8 != 0 ? Integer.MAX_VALUE : maxLines;
            int minLines3 = i9 != 0 ? 1 : minLines;
            Map inlineContent2 = i10 != 0 ? MapsKt.emptyMap() : map;
            color2 = i11 != 0 ? null : color;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1064305212, $dirty, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:167)");
            }
            HeightInLinesModifierKt.validateMinMaxLines(minLines3, maxLines3);
            ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar = SelectionRegistrarKt.getLocalSelectionRegistrar();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = $composer3.consume(localSelectionRegistrar);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            SelectionRegistrar selectionRegistrar = (SelectionRegistrar) consume;
            $composer3.startReplaceableGroup(959242448);
            ComposerKt.sourceInformation($composer3, "185@8710L7,186@8742L190");
            if (selectionRegistrar != null) {
                ProvidableCompositionLocal<SelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
                ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume2 = $composer3.consume(localTextSelectionColors);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                long backgroundSelectionColor = ((SelectionColors) consume2).getSelectionBackgroundColor();
                Object key2$iv = Color.m2937boximpl(backgroundSelectionColor);
                $composer3.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation($composer3, "CC(remember)P(1,2):Composables.kt#9igjgp");
                boolean invalid$iv$iv = $composer3.changed(selectionRegistrar) | $composer3.changed(key2$iv);
                Object it$iv$iv = $composer3.rememberedValue();
                if (invalid$iv$iv || it$iv$iv == Composer.INSTANCE.getEmpty()) {
                    value$iv$iv4 = new SelectionController(selectionRegistrar, backgroundSelectionColor, null, 4, null);
                    $composer3.updateRememberedValue(value$iv$iv4);
                } else {
                    value$iv$iv4 = it$iv$iv;
                }
                $composer3.endReplaceableGroup();
                selectionController = (SelectionController) value$iv$iv4;
            } else {
                selectionController = null;
            }
            $composer3.endReplaceableGroup();
            if (AnnotatedStringResolveInlineContentKt.hasInlineContent(text)) {
                int $dirty2 = $dirty;
                Map inlineContent3 = inlineContent2;
                minLines2 = minLines3;
                maxLines2 = maxLines3;
                $composer3.startReplaceableGroup(959243694);
                ComposerKt.sourceInformation($composer3, "222@10070L81,238@10733L7,240@10825L43,244@11020L38,225@10160L908");
                Pair<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>>> resolveInlineContent = AnnotatedStringResolveInlineContentKt.resolveInlineContent(text, inlineContent3);
                List placeholders = resolveInlineContent.component1();
                List inlineComposables = resolveInlineContent.component2();
                $composer3.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation($composer3, "CC(remember):Composables.kt#9igjgp");
                Object it$iv$iv2 = $composer3.rememberedValue();
                if (it$iv$iv2 == Composer.INSTANCE.getEmpty()) {
                    inlineContent = inlineContent3;
                    value$iv$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    $composer3.updateRememberedValue(value$iv$iv);
                } else {
                    inlineContent = inlineContent3;
                    value$iv$iv = it$iv$iv2;
                }
                $composer3.endReplaceableGroup();
                final MutableState measuredPlaceholderPositions = (MutableState) value$iv$iv;
                Modifier m3104graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m3104graphicsLayerAp8cVGQ$default(modifier2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver = CompositionLocalsKt.getLocalFontFamilyResolver();
                ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume3 = $composer3.consume(localFontFamilyResolver);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                FontFamily.Resolver resolver = (FontFamily.Resolver) consume3;
                $composer3.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation($composer3, "CC(remember)P(1):Composables.kt#9igjgp");
                boolean invalid$iv$iv2 = $composer3.changed(measuredPlaceholderPositions);
                Object it$iv$iv3 = $composer3.rememberedValue();
                if (invalid$iv$iv2 || it$iv$iv3 == Composer.INSTANCE.getEmpty()) {
                    value$iv$iv2 = (Function1) new Function1<List<? extends Rect>, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Rect> list) {
                            invoke2((List<Rect>) list);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(List<Rect> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            measuredPlaceholderPositions.setValue(it);
                        }
                    };
                    $composer3.updateRememberedValue(value$iv$iv2);
                } else {
                    value$iv$iv2 = it$iv$iv3;
                }
                $composer3.endReplaceableGroup();
                $composer2 = $composer3;
                Modifier modifier$iv = m745textModifierRWo7tUw(m3104graphicsLayerAp8cVGQ$default, text, style2, onTextLayout, overflow2, softWrap2, maxLines2, minLines2, resolver, placeholders, (Function1) value$iv$iv2, selectionController, color2);
                $composer2.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation($composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                boolean invalid$iv$iv3 = $composer2.changed(measuredPlaceholderPositions);
                Object it$iv$iv4 = $composer2.rememberedValue();
                if (invalid$iv$iv3 || it$iv$iv4 == Composer.INSTANCE.getEmpty()) {
                    value$iv$iv3 = (Function0) new Function0<List<? extends Rect>>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final List<? extends Rect> invoke() {
                            return measuredPlaceholderPositions.getValue();
                        }
                    };
                    $composer2.updateRememberedValue(value$iv$iv3);
                } else {
                    value$iv$iv3 = it$iv$iv4;
                }
                $composer2.endReplaceableGroup();
                MeasurePolicy measurePolicy$iv = new TextMeasurePolicy((Function0) value$iv$iv3);
                $composer2.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation($composer2, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
                CompositionLocalMap localMap$iv = $composer2.getCurrentCompositionLocalMap();
                Function0 factory$iv$iv = ComposeUiNode.INSTANCE.getConstructor();
                Function3 skippableUpdate$iv$iv = LayoutKt.modifierMaterializerOf(modifier$iv);
                int $changed$iv$iv = ((0 << 9) & 7168) | 6;
                if (!($composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer2.startReusableNode();
                if ($composer2.getInserting()) {
                    $composer2.createNode(factory$iv$iv);
                } else {
                    $composer2.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv = Updater.m2581constructorimpl($composer2);
                Updater.m2588setimpl($this$Layout_u24lambda_u240$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m2588setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 block$iv$iv = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!$this$Layout_u24lambda_u240$iv.getInserting() && Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv))) {
                    skippableUpdate$iv$iv.invoke(SkippableUpdater.m2572boximpl(SkippableUpdater.m2573constructorimpl($composer2)), $composer2, Integer.valueOf(($changed$iv$iv >> 3) & 112));
                    $composer2.startReplaceableGroup(2058660585);
                    int i12 = ($changed$iv$iv >> 9) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer2, 1350731549, "C226@10192L63:BasicText.kt#423gt5");
                    AnnotatedStringResolveInlineContentKt.InlineChildren(text, inlineComposables, $composer2, ($dirty2 & 14) | 64);
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    $composer2.endReplaceableGroup();
                    $composer2.endNode();
                    $composer2.endReplaceableGroup();
                    $composer2.endReplaceableGroup();
                }
                $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
                $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), block$iv$iv);
                skippableUpdate$iv$iv.invoke(SkippableUpdater.m2572boximpl(SkippableUpdater.m2573constructorimpl($composer2)), $composer2, Integer.valueOf(($changed$iv$iv >> 3) & 112));
                $composer2.startReplaceableGroup(2058660585);
                int i122 = ($changed$iv$iv >> 9) & 14;
                ComposerKt.sourceInformationMarkerStart($composer2, 1350731549, "C226@10192L63:BasicText.kt#423gt5");
                AnnotatedStringResolveInlineContentKt.InlineChildren(text, inlineComposables, $composer2, ($dirty2 & 14) | 64);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                $composer2.endReplaceableGroup();
                $composer2.endNode();
                $composer2.endReplaceableGroup();
                $composer2.endReplaceableGroup();
            } else {
                $composer3.startReplaceableGroup(959242835);
                ComposerKt.sourceInformation($composer3, "209@9592L7,197@9078L768");
                Modifier m3104graphicsLayerAp8cVGQ$default2 = GraphicsLayerModifierKt.m3104graphicsLayerAp8cVGQ$default(modifier2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver2 = CompositionLocalsKt.getLocalFontFamilyResolver();
                ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume4 = $composer3.consume(localFontFamilyResolver2);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                inlineContent = inlineContent2;
                minLines2 = minLines3;
                maxLines2 = maxLines3;
                Modifier modifier$iv2 = m745textModifierRWo7tUw(m3104graphicsLayerAp8cVGQ$default2, text, style2, onTextLayout, overflow2, softWrap2, maxLines3, minLines3, (FontFamily.Resolver) consume4, null, null, selectionController, color2);
                MeasurePolicy measurePolicy$iv2 = EmptyMeasurePolicy.INSTANCE;
                $composer3.startReplaceableGroup(544976794);
                ComposerKt.sourceInformation($composer3, "CC(Layout)P(1)122@4734L23,125@4885L385:Layout.kt#80mrfh");
                int compositeKeyHash$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer3, modifier$iv2);
                CompositionLocalMap localMap$iv2 = $composer3.getCurrentCompositionLocalMap();
                final Function0 factory$iv$iv2 = ComposeUiNode.INSTANCE.getConstructor();
                $composer3.startReplaceableGroup(1405779621);
                ComposerKt.sourceInformation($composer3, "CC(ReusableComposeNode):Composables.kt#9igjgp");
                if (!($composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer3.startReusableNode();
                if ($composer3.getInserting()) {
                    $composer3.createNode(new Function0<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-RWo7tUw$$inlined$Layout$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function0
                        public final ComposeUiNode invoke() {
                            return Function0.this.invoke();
                        }
                    });
                } else {
                    $composer3.useNode();
                }
                Composer $this$Layout_u24lambda_u241$iv = Updater.m2581constructorimpl($composer3);
                Updater.m2588setimpl($this$Layout_u24lambda_u241$iv, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m2588setimpl($this$Layout_u24lambda_u241$iv, localMap$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m2588setimpl($this$Layout_u24lambda_u241$iv, materialized$iv, ComposeUiNode.INSTANCE.getSetModifier());
                Function2 block$iv$iv2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!$this$Layout_u24lambda_u241$iv.getInserting() && Intrinsics.areEqual($this$Layout_u24lambda_u241$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv2))) {
                    $composer3.endNode();
                    $composer3.endReplaceableGroup();
                    $composer3.endReplaceableGroup();
                    $composer3.endReplaceableGroup();
                    $composer2 = $composer3;
                }
                $this$Layout_u24lambda_u241$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv2));
                $this$Layout_u24lambda_u241$iv.apply(Integer.valueOf(compositeKeyHash$iv2), block$iv$iv2);
                $composer3.endNode();
                $composer3.endReplaceableGroup();
                $composer3.endReplaceableGroup();
                $composer3.endReplaceableGroup();
                $composer2 = $composer3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        final Modifier modifier3 = modifier2;
        final TextStyle textStyle = style2;
        final Function1 function12 = onTextLayout;
        final int i13 = overflow2;
        final boolean z = softWrap2;
        final int i14 = maxLines2;
        final int i15 = minLines2;
        final Map map2 = inlineContent;
        final ColorProducer colorProducer = color2;
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i16) {
                BasicTextKt.m742BasicTextRWo7tUw(AnnotatedString.this, modifier3, textStyle, function12, i13, z, i14, i15, map2, colorProducer, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), i);
            }
        });
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: BasicText-BpD7jsM, reason: not valid java name */
    public static final /* synthetic */ void m741BasicTextBpD7jsM(final String text, Modifier modifier, TextStyle style, Function1 onTextLayout, int overflow, boolean softWrap, int maxLines, Composer $composer, final int $changed, final int i) {
        TextStyle textStyle;
        Function1 function1;
        int i2;
        boolean softWrap2;
        int i3;
        Modifier modifier2;
        TextStyle style2;
        Function1 onTextLayout2;
        int overflow2;
        int maxLines2;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer $composer2 = $composer.startRestartGroup(1022429478);
        ComposerKt.sourceInformation($composer2, "C(BasicText)P(6,1,5,2,3:c#ui.text.style.TextOverflow,4)260@11460L234:BasicText.kt#423gt5");
        int $dirty = $changed;
        if ((i & 1) != 0) {
            $dirty |= 6;
        } else if (($changed & 14) == 0) {
            $dirty |= $composer2.changed(text) ? 4 : 2;
        }
        int i4 = i & 2;
        if (i4 != 0) {
            $dirty |= 48;
        } else if (($changed & 112) == 0) {
            $dirty |= $composer2.changed(modifier) ? 32 : 16;
        }
        int i5 = i & 4;
        if (i5 != 0) {
            $dirty |= 384;
            textStyle = style;
        } else if (($changed & 896) == 0) {
            textStyle = style;
            $dirty |= $composer2.changed(textStyle) ? 256 : 128;
        } else {
            textStyle = style;
        }
        int i6 = i & 8;
        if (i6 != 0) {
            $dirty |= 3072;
            function1 = onTextLayout;
        } else if (($changed & 7168) == 0) {
            function1 = onTextLayout;
            $dirty |= $composer2.changedInstance(function1) ? 2048 : 1024;
        } else {
            function1 = onTextLayout;
        }
        int i7 = i & 16;
        if (i7 != 0) {
            $dirty |= 24576;
            i2 = overflow;
        } else if (($changed & 57344) == 0) {
            i2 = overflow;
            $dirty |= $composer2.changed(i2) ? 16384 : 8192;
        } else {
            i2 = overflow;
        }
        int i8 = i & 32;
        if (i8 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            softWrap2 = softWrap;
        } else if (($changed & 458752) == 0) {
            softWrap2 = softWrap;
            $dirty |= $composer2.changed(softWrap2) ? 131072 : 65536;
        } else {
            softWrap2 = softWrap;
        }
        int i9 = i & 64;
        if (i9 != 0) {
            $dirty |= 1572864;
            i3 = maxLines;
        } else if (($changed & 3670016) == 0) {
            i3 = maxLines;
            $dirty |= $composer2.changed(i3) ? 1048576 : 524288;
        } else {
            i3 = maxLines;
        }
        if (($dirty & 2995931) == 599186 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
            style2 = textStyle;
            onTextLayout2 = function1;
            maxLines2 = i3;
            overflow2 = i2;
        } else {
            modifier2 = i4 != 0 ? Modifier.INSTANCE : modifier;
            style2 = i5 != 0 ? TextStyle.INSTANCE.getDefault() : textStyle;
            onTextLayout2 = i6 != 0 ? null : function1;
            overflow2 = i7 != 0 ? TextOverflow.INSTANCE.m5135getClipgIe3tQ8() : i2;
            if (i8 != 0) {
                softWrap2 = true;
            }
            maxLines2 = i9 != 0 ? Integer.MAX_VALUE : i3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1022429478, $dirty, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:251)");
            }
            m744BasicTextVhcvRP8(text, modifier2, style2, (Function1<? super TextLayoutResult, Unit>) onTextLayout2, overflow2, softWrap2, maxLines2, 1, (ColorProducer) null, $composer2, 12582912 | ($dirty & 14) | ($dirty & 112) | ($dirty & 896) | ($dirty & 7168) | (57344 & $dirty) | (458752 & $dirty) | ($dirty & 3670016), 256);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        final Modifier modifier3 = modifier2;
        final TextStyle textStyle2 = style2;
        final Function1 function12 = onTextLayout2;
        final int i10 = overflow2;
        final boolean z = softWrap2;
        final int i11 = maxLines2;
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i12) {
                BasicTextKt.m741BasicTextBpD7jsM(text, modifier3, textStyle2, function12, i10, z, i11, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), i);
            }
        });
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: BasicText-4YKlhWE, reason: not valid java name */
    public static final /* synthetic */ void m739BasicText4YKlhWE(final AnnotatedString text, Modifier modifier, TextStyle style, Function1 onTextLayout, int overflow, boolean softWrap, int maxLines, Map inlineContent, Composer $composer, final int $changed, final int i) {
        TextStyle textStyle;
        Function1 function1;
        int i2;
        boolean z;
        Modifier modifier2;
        TextStyle style2;
        Function1 onTextLayout2;
        int overflow2;
        boolean softWrap2;
        int maxLines2;
        Map inlineContent2;
        Composer $composer2;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer $composer3 = $composer.startRestartGroup(-648605928);
        ComposerKt.sourceInformation($composer3, "C(BasicText)P(7,2,6,3,4:c#ui.text.style.TextOverflow,5,1)284@12151L273:BasicText.kt#423gt5");
        int $dirty = $changed;
        if ((i & 1) != 0) {
            $dirty |= 6;
        } else if (($changed & 14) == 0) {
            $dirty |= $composer3.changed(text) ? 4 : 2;
        }
        int i3 = i & 2;
        if (i3 != 0) {
            $dirty |= 48;
        } else if (($changed & 112) == 0) {
            $dirty |= $composer3.changed(modifier) ? 32 : 16;
        }
        int i4 = i & 4;
        if (i4 != 0) {
            $dirty |= 384;
            textStyle = style;
        } else if (($changed & 896) == 0) {
            textStyle = style;
            $dirty |= $composer3.changed(textStyle) ? 256 : 128;
        } else {
            textStyle = style;
        }
        int i5 = i & 8;
        if (i5 != 0) {
            $dirty |= 3072;
            function1 = onTextLayout;
        } else if (($changed & 7168) == 0) {
            function1 = onTextLayout;
            $dirty |= $composer3.changedInstance(function1) ? 2048 : 1024;
        } else {
            function1 = onTextLayout;
        }
        int i6 = i & 16;
        if (i6 != 0) {
            $dirty |= 24576;
            i2 = overflow;
        } else if (($changed & 57344) == 0) {
            i2 = overflow;
            $dirty |= $composer3.changed(i2) ? 16384 : 8192;
        } else {
            i2 = overflow;
        }
        int i7 = i & 32;
        if (i7 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z = softWrap;
        } else if (($changed & 458752) == 0) {
            z = softWrap;
            $dirty |= $composer3.changed(z) ? 131072 : 65536;
        } else {
            z = softWrap;
        }
        int i8 = i & 64;
        if (i8 != 0) {
            $dirty |= 1572864;
        } else if (($changed & 3670016) == 0) {
            $dirty |= $composer3.changed(maxLines) ? 1048576 : 524288;
        }
        int i9 = i & 128;
        if (i9 != 0) {
            $dirty |= 4194304;
        }
        if (i9 == 128 && (23967451 & $dirty) == 4793490 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            modifier2 = modifier;
            maxLines2 = maxLines;
            inlineContent2 = inlineContent;
            style2 = textStyle;
            onTextLayout2 = function1;
            softWrap2 = z;
            overflow2 = i2;
            $composer2 = $composer3;
        } else {
            modifier2 = i3 != 0 ? Modifier.INSTANCE : modifier;
            style2 = i4 != 0 ? TextStyle.INSTANCE.getDefault() : textStyle;
            onTextLayout2 = i5 != 0 ? null : function1;
            overflow2 = i6 != 0 ? TextOverflow.INSTANCE.m5135getClipgIe3tQ8() : i2;
            softWrap2 = i7 != 0 ? true : z;
            maxLines2 = i8 != 0 ? Integer.MAX_VALUE : maxLines;
            inlineContent2 = i9 != 0 ? MapsKt.emptyMap() : inlineContent;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-648605928, $dirty, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:274)");
            }
            $composer2 = $composer3;
            m742BasicTextRWo7tUw(text, modifier2, style2, onTextLayout2, overflow2, softWrap2, maxLines2, 1, inlineContent2, null, $composer3, 146800640 | ($dirty & 14) | ($dirty & 112) | ($dirty & 896) | ($dirty & 7168) | (57344 & $dirty) | ($dirty & 458752) | ($dirty & 3670016), 512);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        final Modifier modifier3 = modifier2;
        final TextStyle textStyle2 = style2;
        final Function1 function12 = onTextLayout2;
        final int i10 = overflow2;
        final boolean z2 = softWrap2;
        final int i11 = maxLines2;
        final Map map = inlineContent2;
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i12) {
                BasicTextKt.m739BasicText4YKlhWE(AnnotatedString.this, modifier3, textStyle2, function12, i10, z2, i11, map, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), i);
            }
        });
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compat")
    /* renamed from: BasicText-4YKlhWE, reason: not valid java name */
    public static final /* synthetic */ void m740BasicText4YKlhWE(final String text, Modifier modifier, TextStyle style, Function1 onTextLayout, int overflow, boolean softWrap, int maxLines, int minLines, Composer $composer, final int $changed, final int i) {
        Function1 function1;
        int i2;
        boolean z;
        Modifier modifier2;
        TextStyle style2;
        Function1 onTextLayout2;
        int overflow2;
        boolean softWrap2;
        int maxLines2;
        int minLines2;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer $composer2 = $composer.startRestartGroup(1542716361);
        ComposerKt.sourceInformation($composer2, "C(BasicText)P(7,2,6,3,4:c#ui.text.style.TextOverflow,5)308@12822L86:BasicText.kt#423gt5");
        int $dirty = $changed;
        if ((i & 1) != 0) {
            $dirty |= 6;
        } else if (($changed & 14) == 0) {
            $dirty |= $composer2.changed(text) ? 4 : 2;
        }
        int i3 = i & 2;
        if (i3 != 0) {
            $dirty |= 48;
        } else if (($changed & 112) == 0) {
            $dirty |= $composer2.changed(modifier) ? 32 : 16;
        }
        int i4 = i & 4;
        if (i4 != 0) {
            $dirty |= 384;
        } else if (($changed & 896) == 0) {
            $dirty |= $composer2.changed(style) ? 256 : 128;
        }
        int i5 = i & 8;
        if (i5 != 0) {
            $dirty |= 3072;
            function1 = onTextLayout;
        } else if (($changed & 7168) == 0) {
            function1 = onTextLayout;
            $dirty |= $composer2.changedInstance(function1) ? 2048 : 1024;
        } else {
            function1 = onTextLayout;
        }
        int i6 = i & 16;
        if (i6 != 0) {
            $dirty |= 24576;
            i2 = overflow;
        } else if (($changed & 57344) == 0) {
            i2 = overflow;
            $dirty |= $composer2.changed(i2) ? 16384 : 8192;
        } else {
            i2 = overflow;
        }
        int i7 = i & 32;
        if (i7 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z = softWrap;
        } else if (($changed & 458752) == 0) {
            z = softWrap;
            $dirty |= $composer2.changed(z) ? 131072 : 65536;
        } else {
            z = softWrap;
        }
        int i8 = i & 64;
        if (i8 != 0) {
            $dirty |= 1572864;
        } else if (($changed & 3670016) == 0) {
            $dirty |= $composer2.changed(maxLines) ? 1048576 : 524288;
        }
        int i9 = i & 128;
        if (i9 != 0) {
            $dirty |= 12582912;
        } else if (($changed & 29360128) == 0) {
            $dirty |= $composer2.changed(minLines) ? 8388608 : 4194304;
        }
        if (($dirty & 23967451) == 4793490 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
            style2 = style;
            maxLines2 = maxLines;
            minLines2 = minLines;
            onTextLayout2 = function1;
            softWrap2 = z;
            overflow2 = i2;
        } else {
            if (i3 != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (i4 == 0) {
                style2 = style;
            } else {
                style2 = TextStyle.INSTANCE.getDefault();
            }
            if (i5 == 0) {
                onTextLayout2 = function1;
            } else {
                onTextLayout2 = null;
            }
            if (i6 == 0) {
                overflow2 = i2;
            } else {
                overflow2 = TextOverflow.INSTANCE.m5135getClipgIe3tQ8();
            }
            if (i7 == 0) {
                softWrap2 = z;
            } else {
                softWrap2 = true;
            }
            if (i8 == 0) {
                maxLines2 = maxLines;
            } else {
                maxLines2 = Integer.MAX_VALUE;
            }
            if (i9 == 0) {
                minLines2 = minLines;
            } else {
                minLines2 = 1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1542716361, $dirty, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:299)");
            }
            m744BasicTextVhcvRP8(text, modifier2, style2, (Function1<? super TextLayoutResult, Unit>) onTextLayout2, overflow2, softWrap2, maxLines2, minLines2, (ColorProducer) null, $composer2, ($dirty & 14) | ($dirty & 112) | ($dirty & 896) | ($dirty & 7168) | (57344 & $dirty) | ($dirty & 458752) | ($dirty & 3670016) | ($dirty & 29360128), 256);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        final Modifier modifier3 = modifier2;
        final TextStyle textStyle = style2;
        final Function1 function12 = onTextLayout2;
        final int i10 = overflow2;
        final boolean z2 = softWrap2;
        final int i11 = maxLines2;
        final int i12 = minLines2;
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i13) {
                BasicTextKt.m740BasicText4YKlhWE(text, modifier3, textStyle, function12, i10, z2, i11, i12, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), i);
            }
        });
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compat")
    /* renamed from: BasicText-VhcvRP8, reason: not valid java name */
    public static final /* synthetic */ void m743BasicTextVhcvRP8(final AnnotatedString text, Modifier modifier, TextStyle style, Function1 onTextLayout, int overflow, boolean softWrap, int maxLines, int minLines, Map inlineContent, Composer $composer, final int $changed, final int i) {
        Function1 function1;
        int i2;
        boolean z;
        Modifier modifier2;
        TextStyle style2;
        Function1 onTextLayout2;
        int overflow2;
        boolean softWrap2;
        int maxLines2;
        int minLines2;
        Map inlineContent2;
        Composer $composer2;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer $composer3 = $composer.startRestartGroup(851408699);
        ComposerKt.sourceInformation($composer3, "C(BasicText)P(8,3,7,4,5:c#ui.text.style.TextOverflow,6,1,2)322@13374L240:BasicText.kt#423gt5");
        int $dirty = $changed;
        if ((i & 1) != 0) {
            $dirty |= 6;
        } else if (($changed & 14) == 0) {
            $dirty |= $composer3.changed(text) ? 4 : 2;
        }
        int i3 = i & 2;
        if (i3 != 0) {
            $dirty |= 48;
        } else if (($changed & 112) == 0) {
            $dirty |= $composer3.changed(modifier) ? 32 : 16;
        }
        int i4 = i & 4;
        if (i4 != 0) {
            $dirty |= 384;
        } else if (($changed & 896) == 0) {
            $dirty |= $composer3.changed(style) ? 256 : 128;
        }
        int i5 = i & 8;
        if (i5 != 0) {
            $dirty |= 3072;
            function1 = onTextLayout;
        } else if (($changed & 7168) == 0) {
            function1 = onTextLayout;
            $dirty |= $composer3.changedInstance(function1) ? 2048 : 1024;
        } else {
            function1 = onTextLayout;
        }
        int i6 = i & 16;
        if (i6 != 0) {
            $dirty |= 24576;
            i2 = overflow;
        } else if (($changed & 57344) == 0) {
            i2 = overflow;
            $dirty |= $composer3.changed(i2) ? 16384 : 8192;
        } else {
            i2 = overflow;
        }
        int i7 = i & 32;
        if (i7 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z = softWrap;
        } else if (($changed & 458752) == 0) {
            z = softWrap;
            $dirty |= $composer3.changed(z) ? 131072 : 65536;
        } else {
            z = softWrap;
        }
        int i8 = i & 64;
        if (i8 != 0) {
            $dirty |= 1572864;
        } else if (($changed & 3670016) == 0) {
            $dirty |= $composer3.changed(maxLines) ? 1048576 : 524288;
        }
        int i9 = i & 128;
        if (i9 != 0) {
            $dirty |= 12582912;
        } else if (($changed & 29360128) == 0) {
            $dirty |= $composer3.changed(minLines) ? 8388608 : 4194304;
        }
        int i10 = i & 256;
        if (i10 != 0) {
            $dirty |= 33554432;
        }
        if (i10 == 256 && (191739611 & $dirty) == 38347922 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            modifier2 = modifier;
            style2 = style;
            maxLines2 = maxLines;
            minLines2 = minLines;
            inlineContent2 = inlineContent;
            onTextLayout2 = function1;
            softWrap2 = z;
            overflow2 = i2;
            $composer2 = $composer3;
        } else {
            modifier2 = i3 != 0 ? Modifier.INSTANCE : modifier;
            style2 = i4 != 0 ? TextStyle.INSTANCE.getDefault() : style;
            onTextLayout2 = i5 != 0 ? null : function1;
            overflow2 = i6 != 0 ? TextOverflow.INSTANCE.m5135getClipgIe3tQ8() : i2;
            softWrap2 = i7 != 0 ? true : z;
            maxLines2 = i8 != 0 ? Integer.MAX_VALUE : maxLines;
            minLines2 = i9 != 0 ? 1 : minLines;
            inlineContent2 = i10 != 0 ? MapsKt.emptyMap() : inlineContent;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(851408699, $dirty, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:312)");
            }
            $composer2 = $composer3;
            m742BasicTextRWo7tUw(text, modifier2, style2, onTextLayout2, overflow2, softWrap2, maxLines2, minLines2, inlineContent2, null, $composer3, 134217728 | ($dirty & 14) | ($dirty & 112) | ($dirty & 896) | ($dirty & 7168) | (57344 & $dirty) | ($dirty & 458752) | ($dirty & 3670016) | ($dirty & 29360128), 512);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        final Modifier modifier3 = modifier2;
        final TextStyle textStyle = style2;
        final Function1 function12 = onTextLayout2;
        final int i11 = overflow2;
        final boolean z2 = softWrap2;
        final int i12 = maxLines2;
        final int i13 = minLines2;
        final Map map = inlineContent2;
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i14) {
                BasicTextKt.m743BasicTextVhcvRP8(AnnotatedString.this, modifier3, textStyle, function12, i11, z2, i12, i13, map, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), i);
            }
        });
    }

    private static final Saver<Long, Long> selectionIdSaver(final SelectionRegistrar selectionRegistrar) {
        return SaverKt.Saver(new Function2<SaverScope, Long, Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Long invoke(SaverScope saverScope, Long l) {
                return invoke(saverScope, l.longValue());
            }

            public final Long invoke(SaverScope Saver, long it) {
                Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                if (SelectionRegistrarKt.hasSelection(SelectionRegistrar.this, it)) {
                    return Long.valueOf(it);
                }
                return null;
            }
        }, new Function1<Long, Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Long invoke(Long l) {
                return invoke(l.longValue());
            }

            public final Long invoke(long it) {
                return Long.valueOf(it);
            }
        });
    }

    /* renamed from: textModifier-RWo7tUw, reason: not valid java name */
    private static final Modifier m745textModifierRWo7tUw(Modifier $this$textModifier_u2dRWo7tUw, AnnotatedString text, TextStyle style, Function1<? super TextLayoutResult, Unit> function1, int overflow, boolean softWrap, int maxLines, int minLines, FontFamily.Resolver fontFamilyResolver, List<AnnotatedString.Range<Placeholder>> list, Function1<? super List<Rect>, Unit> function12, SelectionController selectionController, ColorProducer color) {
        if (selectionController == null) {
            TextAnnotatedStringElement staticTextModifier = new TextAnnotatedStringElement(text, style, fontFamilyResolver, function1, overflow, softWrap, maxLines, minLines, list, function12, null, color, null);
            return $this$textModifier_u2dRWo7tUw.then(Modifier.INSTANCE).then(staticTextModifier);
        }
        SelectableTextAnnotatedStringElement selectableTextModifier = new SelectableTextAnnotatedStringElement(text, style, fontFamilyResolver, function1, overflow, softWrap, maxLines, minLines, list, function12, selectionController, color, null);
        return $this$textModifier_u2dRWo7tUw.then(selectionController.getModifier()).then(selectableTextModifier);
    }
}
