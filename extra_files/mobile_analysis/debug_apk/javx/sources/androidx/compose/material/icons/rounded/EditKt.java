package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Edit.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_edit", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Edit", "Landroidx/compose/material/icons/Icons$Rounded;", "getEdit", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EditKt {
    private static ImageVector _edit;

    public static final ImageVector getEdit(Icons.Rounded $this$Edit) {
        Intrinsics.checkNotNullParameter($this$Edit, "<this>");
        if (_edit != null) {
            ImageVector imageVector = _edit;
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder $this$_get_Edit__u24lambda_u241 = new ImageVector.Builder("Rounded.Edit", Dp.m5216constructorimpl(24.0f), Dp.m5216constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int pathFillType$iv = VectorKt.getDefaultFillType();
        Brush fill$iv$iv = new SolidColor(Color.INSTANCE.m2973getBlack0d7_KjU(), null);
        int strokeLineCap$iv$iv = StrokeCap.INSTANCE.m3293getButtKaPHkGw();
        int strokeLineJoin$iv$iv = StrokeJoin.INSTANCE.m3303getBevelLxFBmk8();
        PathBuilder $this$PathData_u24lambda_u240$iv$iv$iv = new PathBuilder();
        $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(3.0f, 17.46f);
        $this$PathData_u24lambda_u240$iv$iv$iv.verticalLineToRelative(3.04f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        $this$PathData_u24lambda_u240$iv$iv$iv.horizontalLineToRelative(3.04f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.13f, 0.0f, 0.26f, -0.05f, 0.35f, -0.15f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineTo(17.81f, 9.94f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-3.75f, -3.75f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineTo(3.15f, 17.1f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-0.1f, 0.1f, -0.15f, 0.22f, -0.15f, 0.36f);
        $this$PathData_u24lambda_u240$iv$iv$iv.close();
        $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(20.71f, 7.04f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-2.34f, -2.34f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-1.83f, 1.83f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(3.75f, 3.75f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(1.83f, -1.83f);
        $this$PathData_u24lambda_u240$iv$iv$iv.close();
        _edit = ImageVector.Builder.m3571addPathoIyEayM$default($this$_get_Edit__u24lambda_u241, $this$PathData_u24lambda_u240$iv$iv$iv.getNodes(), pathFillType$iv, "", fill$iv$iv, 1.0f, null, 1.0f, 1.0f, strokeLineCap$iv$iv, strokeLineJoin$iv$iv, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        ImageVector imageVector2 = _edit;
        Intrinsics.checkNotNull(imageVector2);
        return imageVector2;
    }
}
