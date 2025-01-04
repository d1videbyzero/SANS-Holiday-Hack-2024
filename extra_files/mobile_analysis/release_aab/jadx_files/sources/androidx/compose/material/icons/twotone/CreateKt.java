package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
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

/* compiled from: Create.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_create", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Create", "Landroidx/compose/material/icons/Icons$TwoTone;", "getCreate", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CreateKt {
    private static ImageVector _create;

    public static final ImageVector getCreate(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _create;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Create", Dp.m4878constructorimpl(24.0f), Dp.m4878constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2656getBlack0d7_KjU(), null);
        int m2977getButtKaPHkGw = StrokeCap.INSTANCE.m2977getButtKaPHkGw();
        int m2987getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2987getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 18.08f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineToRelative(0.92f);
        pathBuilder.lineToRelative(9.06f, -9.06f);
        pathBuilder.lineToRelative(-0.92f, -0.92f);
        pathBuilder.close();
        ImageVector.Builder.m3255addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m2977getButtKaPHkGw, m2987getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(Color.INSTANCE.m2656getBlack0d7_KjU(), null);
        int m2977getButtKaPHkGw2 = StrokeCap.INSTANCE.m2977getButtKaPHkGw();
        int m2987getBevelLxFBmk82 = StrokeJoin.INSTANCE.m2987getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(3.0f, 17.25f);
        pathBuilder2.verticalLineTo(21.0f);
        pathBuilder2.horizontalLineToRelative(3.75f);
        pathBuilder2.lineTo(17.81f, 9.94f);
        pathBuilder2.lineToRelative(-3.75f, -3.75f);
        pathBuilder2.lineTo(3.0f, 17.25f);
        pathBuilder2.close();
        pathBuilder2.moveTo(5.92f, 19.0f);
        pathBuilder2.horizontalLineTo(5.0f);
        pathBuilder2.verticalLineToRelative(-0.92f);
        pathBuilder2.lineToRelative(9.06f, -9.06f);
        pathBuilder2.lineToRelative(0.92f, 0.92f);
        pathBuilder2.lineTo(5.92f, 19.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.71f, 5.63f);
        pathBuilder2.lineToRelative(-2.34f, -2.34f);
        pathBuilder2.curveToRelative(-0.2f, -0.2f, -0.45f, -0.29f, -0.71f, -0.29f);
        pathBuilder2.reflectiveCurveToRelative(-0.51f, 0.1f, -0.7f, 0.29f);
        pathBuilder2.lineToRelative(-1.83f, 1.83f);
        pathBuilder2.lineToRelative(3.75f, 3.75f);
        pathBuilder2.lineToRelative(1.83f, -1.83f);
        pathBuilder2.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m3255addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m2977getButtKaPHkGw2, m2987getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _create = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
