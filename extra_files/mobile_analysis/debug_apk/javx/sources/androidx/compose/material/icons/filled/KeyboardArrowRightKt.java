package androidx.compose.material.icons.filled;

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

/* compiled from: KeyboardArrowRight.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_keyboardArrowRight", "Landroidx/compose/ui/graphics/vector/ImageVector;", "KeyboardArrowRight", "Landroidx/compose/material/icons/Icons$Filled;", "getKeyboardArrowRight", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KeyboardArrowRightKt {
    private static ImageVector _keyboardArrowRight;

    public static final ImageVector getKeyboardArrowRight(Icons.Filled $this$KeyboardArrowRight) {
        Intrinsics.checkNotNullParameter($this$KeyboardArrowRight, "<this>");
        if (_keyboardArrowRight != null) {
            ImageVector imageVector = _keyboardArrowRight;
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder $this$_get_KeyboardArrowRight__u24lambda_u241 = new ImageVector.Builder("Filled.KeyboardArrowRight", Dp.m5216constructorimpl(24.0f), Dp.m5216constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int pathFillType$iv = VectorKt.getDefaultFillType();
        Brush fill$iv$iv = new SolidColor(Color.INSTANCE.m2973getBlack0d7_KjU(), null);
        int strokeLineCap$iv$iv = StrokeCap.INSTANCE.m3293getButtKaPHkGw();
        int strokeLineJoin$iv$iv = StrokeJoin.INSTANCE.m3303getBevelLxFBmk8();
        PathBuilder $this$PathData_u24lambda_u240$iv$iv$iv = new PathBuilder();
        $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(8.59f, 16.59f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineTo(13.17f, 12.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineTo(8.59f, 7.41f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineTo(10.0f, 6.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(6.0f, 6.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-6.0f, 6.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-1.41f, -1.41f);
        $this$PathData_u24lambda_u240$iv$iv$iv.close();
        _keyboardArrowRight = ImageVector.Builder.m3571addPathoIyEayM$default($this$_get_KeyboardArrowRight__u24lambda_u241, $this$PathData_u24lambda_u240$iv$iv$iv.getNodes(), pathFillType$iv, "", fill$iv$iv, 1.0f, null, 1.0f, 1.0f, strokeLineCap$iv$iv, strokeLineJoin$iv$iv, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        ImageVector imageVector2 = _keyboardArrowRight;
        Intrinsics.checkNotNull(imageVector2);
        return imageVector2;
    }
}
