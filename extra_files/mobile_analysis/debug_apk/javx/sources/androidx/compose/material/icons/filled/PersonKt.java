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

/* compiled from: Person.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_person", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Person", "Landroidx/compose/material/icons/Icons$Filled;", "getPerson", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PersonKt {
    private static ImageVector _person;

    public static final ImageVector getPerson(Icons.Filled $this$Person) {
        Intrinsics.checkNotNullParameter($this$Person, "<this>");
        if (_person != null) {
            ImageVector imageVector = _person;
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder $this$_get_Person__u24lambda_u241 = new ImageVector.Builder("Filled.Person", Dp.m5216constructorimpl(24.0f), Dp.m5216constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int pathFillType$iv = VectorKt.getDefaultFillType();
        Brush fill$iv$iv = new SolidColor(Color.INSTANCE.m2973getBlack0d7_KjU(), null);
        int strokeLineCap$iv$iv = StrokeCap.INSTANCE.m3293getButtKaPHkGw();
        int strokeLineJoin$iv$iv = StrokeJoin.INSTANCE.m3303getBevelLxFBmk8();
        PathBuilder $this$PathData_u24lambda_u240$iv$iv$iv = new PathBuilder();
        $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(12.0f, 12.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.close();
        $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(12.0f, 14.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.verticalLineToRelative(2.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.horizontalLineToRelative(16.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.verticalLineToRelative(-2.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.close();
        _person = ImageVector.Builder.m3571addPathoIyEayM$default($this$_get_Person__u24lambda_u241, $this$PathData_u24lambda_u240$iv$iv$iv.getNodes(), pathFillType$iv, "", fill$iv$iv, 1.0f, null, 1.0f, 1.0f, strokeLineCap$iv$iv, strokeLineJoin$iv$iv, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        ImageVector imageVector2 = _person;
        Intrinsics.checkNotNull(imageVector2);
        return imageVector2;
    }
}
