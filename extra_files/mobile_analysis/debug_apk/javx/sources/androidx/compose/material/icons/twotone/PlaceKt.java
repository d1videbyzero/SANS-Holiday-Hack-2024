package androidx.compose.material.icons.twotone;

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

/* compiled from: Place.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_place", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Place", "Landroidx/compose/material/icons/Icons$TwoTone;", "getPlace", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlaceKt {
    private static ImageVector _place;

    public static final ImageVector getPlace(Icons.TwoTone $this$Place) {
        Intrinsics.checkNotNullParameter($this$Place, "<this>");
        if (_place != null) {
            ImageVector imageVector = _place;
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder $this$_get_Place__u24lambda_u242 = new ImageVector.Builder("TwoTone.Place", Dp.m5216constructorimpl(24.0f), Dp.m5216constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int pathFillType$iv = VectorKt.getDefaultFillType();
        Brush fill$iv$iv = new SolidColor(Color.INSTANCE.m2973getBlack0d7_KjU(), null);
        int strokeLineCap$iv$iv = StrokeCap.INSTANCE.m3293getButtKaPHkGw();
        int strokeLineJoin$iv$iv = StrokeJoin.INSTANCE.m3303getBevelLxFBmk8();
        PathBuilder $this$PathData_u24lambda_u240$iv$iv$iv = new PathBuilder();
        $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(18.5f, 10.2f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.0f, 2.57f, -2.1f, 5.79f, -6.16f, 9.51f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineTo(12.0f, 20.01f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-0.34f, -0.31f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(7.6f, 15.99f, 5.5f, 12.77f, 5.5f, 10.2f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.0f, -3.84f, 2.82f, -6.7f, 6.5f, -6.7f);
        $this$PathData_u24lambda_u240$iv$iv$iv.reflectiveCurveTo(18.5f, 6.35f, 18.5f, 10.2f);
        $this$PathData_u24lambda_u240$iv$iv$iv.close();
        ImageVector.Builder.m3571addPathoIyEayM$default($this$_get_Place__u24lambda_u242, $this$PathData_u24lambda_u240$iv$iv$iv.getNodes(), pathFillType$iv, "", fill$iv$iv, 0.3f, null, 1.0f, 1.0f, strokeLineCap$iv$iv, strokeLineJoin$iv$iv, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int pathFillType$iv2 = VectorKt.getDefaultFillType();
        Brush fill$iv$iv2 = new SolidColor(Color.INSTANCE.m2973getBlack0d7_KjU(), null);
        int strokeLineCap$iv$iv2 = StrokeCap.INSTANCE.m3293getButtKaPHkGw();
        int strokeLineJoin$iv$iv2 = StrokeJoin.INSTANCE.m3303getBevelLxFBmk8();
        PathBuilder $this$PathData_u24lambda_u240$iv$iv$iv2 = new PathBuilder();
        $this$PathData_u24lambda_u240$iv$iv$iv2.moveTo(12.0f, 2.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(4.2f, 0.0f, 8.0f, 3.22f, 8.0f, 8.2f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(0.0f, 3.32f, -2.67f, 7.25f, -8.0f, 11.8f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(-5.33f, -4.55f, -8.0f, -8.48f, -8.0f, -11.8f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveTo(4.0f, 5.22f, 7.8f, 2.0f, 12.0f, 2.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.close();
        $this$PathData_u24lambda_u240$iv$iv$iv2.moveTo(18.0f, 10.2f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveTo(18.0f, 6.57f, 15.35f, 4.0f, 12.0f, 4.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.reflectiveCurveToRelative(-6.0f, 2.57f, -6.0f, 6.2f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(0.0f, 2.34f, 1.95f, 5.44f, 6.0f, 9.14f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveTo(16.05f, 15.64f, 18.0f, 12.54f, 18.0f, 10.2f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.close();
        $this$PathData_u24lambda_u240$iv$iv$iv2.moveTo(12.0f, 12.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.reflectiveCurveTo(13.1f, 12.0f, 12.0f, 12.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.close();
        _place = ImageVector.Builder.m3571addPathoIyEayM$default($this$_get_Place__u24lambda_u242, $this$PathData_u24lambda_u240$iv$iv$iv2.getNodes(), pathFillType$iv2, "", fill$iv$iv2, 1.0f, null, 1.0f, 1.0f, strokeLineCap$iv$iv2, strokeLineJoin$iv$iv2, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        ImageVector imageVector2 = _place;
        Intrinsics.checkNotNull(imageVector2);
        return imageVector2;
    }
}
