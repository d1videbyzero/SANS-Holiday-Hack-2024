package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DrawModifierNode.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"invalidateDraw", "", "Landroidx/compose/ui/node/DrawModifierNode;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DrawModifierNodeKt {
    public static final void invalidateDraw(DrawModifierNode $this$invalidateDraw) {
        Intrinsics.checkNotNullParameter($this$invalidateDraw, "<this>");
        if ($this$invalidateDraw.getNode().getIsAttached()) {
            DelegatableNodeKt.m4297requireCoordinator64DMado($this$invalidateDraw, NodeKind.m4398constructorimpl(1)).invalidateLayer();
        }
    }
}
