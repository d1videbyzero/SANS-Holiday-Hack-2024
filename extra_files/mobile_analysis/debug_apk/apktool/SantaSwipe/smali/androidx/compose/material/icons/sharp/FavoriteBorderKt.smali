.class public final Landroidx/compose/material/icons/sharp/FavoriteBorderKt;
.super Ljava/lang/Object;
.source "FavoriteBorder.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFavoriteBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavoriteBorder.kt\nandroidx/compose/material/icons/sharp/FavoriteBorderKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,58:1\n122#2:59\n116#2,3:60\n119#2,3:64\n132#2,18:67\n152#2:104\n174#3:63\n694#4,2:85\n706#4,2:87\n708#4,11:93\n64#5,4:89\n*S KotlinDebug\n*F\n+ 1 FavoriteBorder.kt\nandroidx/compose/material/icons/sharp/FavoriteBorderKt\n*L\n29#1:59\n29#1:60,3\n29#1:64,3\n30#1:67,18\n30#1:104\n29#1:63\n30#1:85,2\n30#1:87,2\n30#1:93,11\n30#1:89,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_favoriteBorder",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "FavoriteBorder",
        "Landroidx/compose/material/icons/Icons$Sharp;",
        "getFavoriteBorder",
        "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;",
        "material-icons-core_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static _favoriteBorder:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFavoriteBorder(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 37
    .param p0, "$this$FavoriteBorder"    # Landroidx/compose/material/icons/Icons$Sharp;

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    sget-object v0, Landroidx/compose/material/icons/sharp/FavoriteBorderKt;->_favoriteBorder:Landroidx/compose/ui/graphics/vector/ImageVector;

    if-eqz v0, :cond_0

    .line 27
    sget-object v0, Landroidx/compose/material/icons/sharp/FavoriteBorderKt;->_favoriteBorder:Landroidx/compose/ui/graphics/vector/ImageVector;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v0

    .line 29
    :cond_0
    const-string v0, "Sharp.FavoriteBorder"

    .local v0, "name$iv":Ljava/lang/String;
    const/4 v14, 0x0

    .line 59
    .local v14, "$i$f$materialIcon":I
    nop

    .line 60
    new-instance v15, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 61
    nop

    .line 62
    const/high16 v2, 0x41c00000    # 24.0f

    .local v2, "$this$dp$iv$iv":F
    const/4 v3, 0x0

    .line 63
    .local v3, "$i$f$getDp":I
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v4

    .line 64
    .end local v2    # "$this$dp$iv$iv":F
    .end local v3    # "$i$f$getDp":I
    const/high16 v2, 0x41c00000    # 24.0f

    .restart local v2    # "$this$dp$iv$iv":F
    const/4 v3, 0x0

    .line 63
    .restart local v3    # "$i$f$getDp":I
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v5

    .line 65
    .end local v2    # "$this$dp$iv$iv":F
    .end local v3    # "$i$f$getDp":I
    nop

    .line 66
    nop

    .line 60
    const/16 v12, 0xe0

    const/4 v13, 0x0

    const/high16 v6, 0x41c00000    # 24.0f

    const/high16 v7, 0x41c00000    # 24.0f

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v2, v15

    move-object v3, v0

    invoke-direct/range {v2 .. v13}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 59
    nop

    .local v2, "$this$_get_FavoriteBorder__u24lambda_u241":Landroidx/compose/ui/graphics/vector/ImageVector$Builder;
    const/4 v3, 0x0

    .line 30
    .local v3, "$i$a$-materialIcon-FavoriteBorderKt$FavoriteBorder$1":I
    move-object v4, v2

    .line 67
    .local v4, "$this$materialPath_u2dYwgOQQI_u24default$iv":Landroidx/compose/ui/graphics/vector/ImageVector$Builder;
    nop

    .line 68
    const/high16 v5, 0x3f800000    # 1.0f

    .local v5, "fillAlpha$iv":F
    move/from16 v20, v5

    .line 67
    nop

    .line 69
    const/high16 v6, 0x3f800000    # 1.0f

    .local v6, "strokeAlpha$iv":F
    move/from16 v22, v6

    .line 67
    nop

    .line 70
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    move-result v7

    .local v7, "pathFillType$iv":I
    move/from16 v17, v7

    .line 67
    const/4 v8, 0x0

    .line 76
    .local v8, "$i$f$materialPath-YwgOQQI":I
    nop

    .line 77
    new-instance v9, Landroidx/compose/ui/graphics/SolidColor;

    sget-object v10, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v10}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    move-result-wide v10

    const/4 v12, 0x0

    invoke-direct {v9, v10, v11, v12}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v19, v9

    check-cast v19, Landroidx/compose/ui/graphics/Brush;

    .line 79
    nop

    .line 81
    nop

    .line 82
    sget-object v9, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    invoke-virtual {v9}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    move-result v24

    .line 83
    sget-object v9, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    invoke-virtual {v9}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    move-result v25

    .line 84
    nop

    .line 76
    const/high16 v23, 0x3f800000    # 1.0f

    .local v23, "strokeLineWidth$iv$iv":F
    const/16 v21, 0x0

    .local v21, "stroke$iv$iv":Landroidx/compose/ui/graphics/Brush;
    move-object v15, v4

    .local v15, "$this$path_u2dR_LF_u2d3I_u24default$iv$iv":Landroidx/compose/ui/graphics/vector/ImageVector$Builder;
    .local v19, "fill$iv$iv":Landroidx/compose/ui/graphics/Brush;
    .local v24, "strokeLineCap$iv$iv":I
    .local v25, "strokeLineJoin$iv$iv":I
    const/high16 v26, 0x3f800000    # 1.0f

    .line 85
    .local v26, "strokeLineMiter$iv$iv":F
    nop

    .line 86
    const-string v9, ""

    .local v9, "name$iv$iv":Ljava/lang/String;
    move-object/from16 v18, v9

    .line 85
    const/4 v10, 0x0

    .line 87
    .local v10, "$i$f$path-R_LF-3I":I
    nop

    .line 88
    const/4 v11, 0x0

    .line 89
    .local v11, "$i$f$PathData":I
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .local v12, "$this$PathData_u24lambda_u240$iv$iv$iv":Landroidx/compose/ui/graphics/vector/PathBuilder;
    const/4 v13, 0x0

    .line 90
    .local v13, "$i$a$-with-VectorKt$PathData$1$iv$iv$iv":I
    move-object/from16 v16, v12

    .local v16, "$this$_get_FavoriteBorder__u24lambda_u241_u24lambda_u240":Landroidx/compose/ui/graphics/vector/PathBuilder;
    const/16 v34, 0x0

    .line 31
    .local v34, "$i$a$-materialPath-YwgOQQI$default-FavoriteBorderKt$FavoriteBorder$1$1":I
    move-object/from16 v35, v0

    .end local v0    # "name$iv":Ljava/lang/String;
    .local v35, "name$iv":Ljava/lang/String;
    const/high16 v0, 0x41840000    # 16.5f

    const/high16 v1, 0x40400000    # 3.0f

    move-object/from16 v36, v2

    move-object/from16 v2, v16

    .end local v16    # "$this$_get_FavoriteBorder__u24lambda_u241_u24lambda_u240":Landroidx/compose/ui/graphics/vector/PathBuilder;
    .local v2, "$this$_get_FavoriteBorder__u24lambda_u241_u24lambda_u240":Landroidx/compose/ui/graphics/vector/PathBuilder;
    .local v36, "$this$_get_FavoriteBorder__u24lambda_u241":Landroidx/compose/ui/graphics/vector/ImageVector$Builder;
    invoke-virtual {v2, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 32
    const/high16 v32, -0x3f700000    # -4.5f

    const v33, 0x4005c28f    # 2.09f

    const v28, -0x402147ae    # -1.74f

    const/16 v29, 0x0

    const v30, -0x3fa5c28f    # -3.41f

    const v31, 0x3f4f5c29    # 0.81f

    move-object/from16 v27, v2

    invoke-virtual/range {v27 .. v33}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 33
    const/high16 v32, 0x40f00000    # 7.5f

    const/high16 v33, 0x40400000    # 3.0f

    const v28, 0x412e8f5c    # 10.91f

    const v29, 0x4073d70a    # 3.81f

    const v30, 0x4113d70a    # 9.24f

    const/high16 v31, 0x40400000    # 3.0f

    invoke-virtual/range {v27 .. v33}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 34
    const/high16 v32, 0x40000000    # 2.0f

    const/high16 v33, 0x41080000    # 8.5f

    const v28, 0x408d70a4    # 4.42f

    const/high16 v29, 0x40400000    # 3.0f

    const/high16 v30, 0x40000000    # 2.0f

    const v31, 0x40ad70a4    # 5.42f

    invoke-virtual/range {v27 .. v33}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 35
    const v32, 0x4108cccd    # 8.55f

    const v33, 0x4138a3d7    # 11.54f

    const/16 v28, 0x0

    const v29, 0x4071eb85    # 3.78f

    const v30, 0x4059999a    # 3.4f

    const v31, 0x40db851f    # 6.86f

    invoke-virtual/range {v27 .. v33}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 36
    const/high16 v0, 0x41400000    # 12.0f

    const v1, 0x41aacccd    # 21.35f

    invoke-virtual {v2, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 37
    const v0, 0x3fb9999a    # 1.45f

    const v1, -0x40570a3d    # -1.32f

    invoke-virtual {v2, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 38
    const/high16 v32, 0x41b00000    # 22.0f

    const/high16 v33, 0x41080000    # 8.5f

    const v28, 0x4194cccd    # 18.6f

    const v29, 0x4175c28f    # 15.36f

    const/high16 v30, 0x41b00000    # 22.0f

    const v31, 0x41447ae1    # 12.28f

    invoke-virtual/range {v27 .. v33}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 39
    const/high16 v32, 0x41840000    # 16.5f

    const/high16 v33, 0x40400000    # 3.0f

    const/high16 v28, 0x41b00000    # 22.0f

    const v29, 0x40ad70a4    # 5.42f

    const v30, 0x419ca3d7    # 19.58f

    const/high16 v31, 0x40400000    # 3.0f

    invoke-virtual/range {v27 .. v33}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 40
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 41
    const v0, 0x4141999a    # 12.1f

    const v1, 0x41946666    # 18.55f

    invoke-virtual {v2, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 42
    const v0, 0x3dcccccd    # 0.1f

    const v1, -0x42333333    # -0.1f

    invoke-virtual {v2, v1, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 43
    const v0, -0x42333333    # -0.1f

    invoke-virtual {v2, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 44
    const/high16 v32, 0x40800000    # 4.0f

    const/high16 v33, 0x41080000    # 8.5f

    const v28, 0x40e47ae1    # 7.14f

    const v29, 0x4163d70a    # 14.24f

    const/high16 v30, 0x40800000    # 4.0f

    const v31, 0x41363d71    # 11.39f

    invoke-virtual/range {v27 .. v33}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 45
    const/high16 v32, 0x40f00000    # 7.5f

    const/high16 v33, 0x40a00000    # 5.0f

    const/high16 v28, 0x40800000    # 4.0f

    const/high16 v29, 0x40d00000    # 6.5f

    const/high16 v30, 0x40b00000    # 5.5f

    const/high16 v31, 0x40a00000    # 5.0f

    invoke-virtual/range {v27 .. v33}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 46
    const v32, 0x40647ae1    # 3.57f

    const v33, 0x40170a3d    # 2.36f

    const v28, 0x3fc51eb8    # 1.54f

    const/16 v29, 0x0

    const v30, 0x40428f5c    # 3.04f

    const v31, 0x3f7d70a4    # 0.99f

    invoke-virtual/range {v27 .. v33}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 47
    const v0, 0x3fef5c29    # 1.87f

    invoke-virtual {v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 48
    const/high16 v32, 0x41840000    # 16.5f

    const/high16 v33, 0x40a00000    # 5.0f

    const v28, 0x41575c29    # 13.46f

    const v29, 0x40bfae14    # 5.99f

    const v30, 0x416f5c29    # 14.96f

    const/high16 v31, 0x40a00000    # 5.0f

    invoke-virtual/range {v27 .. v33}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 49
    const/high16 v32, 0x40600000    # 3.5f

    const/high16 v33, 0x40600000    # 3.5f

    const/high16 v28, 0x40000000    # 2.0f

    const/16 v29, 0x0

    const/high16 v30, 0x40600000    # 3.5f

    const/high16 v31, 0x3fc00000    # 1.5f

    invoke-virtual/range {v27 .. v33}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 50
    const v32, -0x3f033333    # -7.9f

    const v33, 0x4120cccd    # 10.05f

    const/16 v28, 0x0

    const v29, 0x4038f5c3    # 2.89f

    const v30, -0x3fb70a3d    # -3.14f

    const v31, 0x40b7ae14    # 5.74f

    invoke-virtual/range {v27 .. v33}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 51
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 52
    nop

    .line 90
    .end local v2    # "$this$_get_FavoriteBorder__u24lambda_u241_u24lambda_u240":Landroidx/compose/ui/graphics/vector/PathBuilder;
    .end local v34    # "$i$a$-materialPath-YwgOQQI$default-FavoriteBorderKt$FavoriteBorder$1$1":I
    nop

    .line 91
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    move-result-object v16

    .line 89
    .end local v12    # "$this$PathData_u24lambda_u240$iv$iv$iv":Landroidx/compose/ui/graphics/vector/PathBuilder;
    .end local v13    # "$i$a$-with-VectorKt$PathData$1$iv$iv$iv":I
    nop

    .line 92
    nop

    .line 93
    .end local v11    # "$i$f$PathData":I
    nop

    .line 94
    nop

    .line 95
    nop

    .line 96
    nop

    .line 97
    nop

    .line 98
    nop

    .line 99
    nop

    .line 100
    nop

    .line 101
    nop

    .line 102
    nop

    .line 87
    const/16 v30, 0x3800

    const/16 v31, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    invoke-static/range {v15 .. v31}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    move-result-object v0

    .line 103
    nop

    .line 104
    .end local v9    # "name$iv$iv":Ljava/lang/String;
    .end local v10    # "$i$f$path-R_LF-3I":I
    .end local v15    # "$this$path_u2dR_LF_u2d3I_u24default$iv$iv":Landroidx/compose/ui/graphics/vector/ImageVector$Builder;
    .end local v19    # "fill$iv$iv":Landroidx/compose/ui/graphics/Brush;
    .end local v21    # "stroke$iv$iv":Landroidx/compose/ui/graphics/Brush;
    .end local v23    # "strokeLineWidth$iv$iv":F
    .end local v24    # "strokeLineCap$iv$iv":I
    .end local v25    # "strokeLineJoin$iv$iv":I
    .end local v26    # "strokeLineMiter$iv$iv":F
    nop

    .line 30
    .end local v4    # "$this$materialPath_u2dYwgOQQI_u24default$iv":Landroidx/compose/ui/graphics/vector/ImageVector$Builder;
    .end local v5    # "fillAlpha$iv":F
    .end local v6    # "strokeAlpha$iv":F
    .end local v7    # "pathFillType$iv":I
    .end local v8    # "$i$f$materialPath-YwgOQQI":I
    nop

    .line 59
    .end local v3    # "$i$a$-materialIcon-FavoriteBorderKt$FavoriteBorder$1":I
    .end local v36    # "$this$_get_FavoriteBorder__u24lambda_u241":Landroidx/compose/ui/graphics/vector/ImageVector$Builder;
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    move-result-object v0

    .line 29
    .end local v14    # "$i$f$materialIcon":I
    .end local v35    # "name$iv":Ljava/lang/String;
    sput-object v0, Landroidx/compose/material/icons/sharp/FavoriteBorderKt;->_favoriteBorder:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 54
    sget-object v0, Landroidx/compose/material/icons/sharp/FavoriteBorderKt;->_favoriteBorder:Landroidx/compose/ui/graphics/vector/ImageVector;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v0
.end method
