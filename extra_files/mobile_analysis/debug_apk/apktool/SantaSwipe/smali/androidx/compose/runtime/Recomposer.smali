.class public final Landroidx/compose/runtime/Recomposer;
.super Landroidx/compose/runtime/CompositionContext;
.source "Recomposer.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/runtime/Recomposer$Companion;,
        Landroidx/compose/runtime/Recomposer$HotReloadable;,
        Landroidx/compose/runtime/Recomposer$RecomposerErrorState;,
        Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;,
        Landroidx/compose/runtime/Recomposer$State;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 6 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 8 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1502:1\n1162#1,5:1550\n1168#1:1560\n1162#1,5:1573\n1168#1:1583\n1162#1,5:1604\n1168#1:1625\n70#2:1503\n70#2:1504\n70#2:1507\n70#2:1509\n70#2:1516\n70#2:1517\n70#2:1530\n70#2:1531\n70#2:1532\n70#2:1533\n70#2:1534\n70#2:1535\n70#2:1545\n70#2:1548\n70#2:1549\n70#2:1561\n70#2:1562\n70#2:1612\n70#2:1626\n70#2:1649\n70#2:1650\n70#2:1651\n70#2:1652\n70#2:1653\n70#2:1654\n70#2:1655\n70#2:1656\n70#2:1657\n70#2:1658\n70#2:1659\n70#2:1660\n1229#3,2:1505\n1#4:1508\n33#5,6:1510\n33#5,6:1518\n33#5,6:1524\n93#5,2:1563\n33#5,4:1565\n95#5,2:1569\n38#5:1571\n97#5:1572\n120#5,3:1584\n33#5,4:1587\n123#5,2:1591\n125#5,2:1600\n38#5:1602\n127#5:1603\n82#5,3:1613\n33#5,4:1616\n85#5,2:1620\n38#5:1622\n87#5:1623\n82#5,3:1627\n33#5,4:1630\n85#5,2:1634\n38#5:1636\n87#5:1637\n33#5,6:1638\n314#6,9:1536\n323#6,2:1546\n129#7,5:1555\n129#7,5:1578\n129#7,3:1609\n133#7:1624\n129#7,5:1644\n361#8,7:1593\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n*L\n1012#1:1550,5\n1012#1:1560\n1089#1:1573,5\n1089#1:1583\n1109#1:1604,5\n1109#1:1625\n282#1:1503\n332#1:1504\n426#1:1507\n430#1:1509\n451#1:1516\n456#1:1517\n482#1:1530\n689#1:1531\n725#1:1532\n737#1:1533\n754#1:1534\n890#1:1535\n902#1:1545\n977#1:1548\n993#1:1549\n1025#1:1561\n1056#1:1562\n1112#1:1612\n1125#1:1626\n1192#1:1649\n1229#1:1650\n1244#1:1651\n1270#1:1652\n1278#1:1653\n1287#1:1654\n1294#1:1655\n1301#1:1656\n1310#1:1657\n1316#1:1658\n1328#1:1659\n1062#1:1660\n333#1:1505,2\n436#1:1510,6\n469#1:1518,6\n474#1:1524,6\n1057#1:1563,2\n1057#1:1565,4\n1057#1:1569,2\n1057#1:1571\n1057#1:1572\n1106#1:1584,3\n1106#1:1587,4\n1106#1:1591,2\n1106#1:1600,2\n1106#1:1602\n1106#1:1603\n1113#1:1613,3\n1113#1:1616,4\n1113#1:1620,2\n1113#1:1622\n1113#1:1623\n1129#1:1627,3\n1129#1:1630,4\n1129#1:1634,2\n1129#1:1636\n1129#1:1637\n1136#1:1638,6\n901#1:1536,9\n901#1:1546,2\n1012#1:1555,5\n1089#1:1578,5\n1109#1:1609,3\n1109#1:1624\n1166#1:1644,5\n1106#1:1593,7\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0096\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u0000 \u00b0\u00012\u00020\u0001:\n\u00b0\u0001\u00b1\u0001\u00b2\u0001\u00b3\u0001\u00b4\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010V\u001a\u00020U2\u0006\u0010W\u001a\u00020XH\u0002J\u0006\u0010Y\u001a\u00020ZJ\u0011\u0010[\u001a\u00020UH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\\J\u0011\u0010]\u001a\u00020UH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\\J\u0006\u0010^\u001a\u00020UJ\u0006\u0010_\u001a\u00020UJ*\u0010`\u001a\u00020U2\u0006\u0010a\u001a\u00020\u00172\u0011\u0010b\u001a\r\u0012\u0004\u0012\u00020U0c\u00a2\u0006\u0002\u0008dH\u0010\u00a2\u0006\u0004\u0008e\u0010fJ:\u0010g\u001a\u0002Hh\"\u0004\u0008\u0000\u0010h2\u0006\u0010a\u001a\u00020\u00172\u000e\u0010i\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010K2\u000c\u0010j\u001a\u0008\u0012\u0004\u0012\u0002Hh0cH\u0082\u0008\u00a2\u0006\u0002\u0010kJ\u0015\u0010l\u001a\u00020U2\u0006\u0010m\u001a\u00020\u001aH\u0010\u00a2\u0006\u0002\u0008nJ\u0010\u0010o\u001a\n\u0012\u0004\u0012\u00020U\u0018\u00010TH\u0002J\u0008\u0010p\u001a\u00020UH\u0002J\u0015\u0010q\u001a\u00020U2\u0006\u0010m\u001a\u00020\u001aH\u0010\u00a2\u0006\u0002\u0008rJ\u0015\u0010s\u001a\u00020U2\u0006\u0010a\u001a\u00020\u0017H\u0010\u00a2\u0006\u0002\u0008tJ\u0015\u0010u\u001a\u00020U2\u0006\u0010v\u001a\u00020wH\u0010\u00a2\u0006\u0002\u0008xJ\u0011\u0010y\u001a\u00020UH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\\J\u001d\u0010z\u001a\u00020U2\u0006\u0010m\u001a\u00020\u001a2\u0006\u0010{\u001a\u00020\u001bH\u0010\u00a2\u0006\u0002\u0008|J\u0017\u0010}\u001a\u0004\u0018\u00010\u001b2\u0006\u0010m\u001a\u00020\u001aH\u0010\u00a2\u0006\u0002\u0008~J\u0006\u0010\u007f\u001a\u00020UJ\u0011\u0010\u0080\u0001\u001a\u00020U2\u0006\u0010a\u001a\u00020\u0017H\u0002J0\u0010\u0081\u0001\u001a\t\u0012\u0004\u0012\u00020\u00170\u0082\u00012\u000e\u0010\u0083\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0082\u00012\u000e\u0010i\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010KH\u0002J#\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010a\u001a\u00020\u00172\u000e\u0010i\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010KH\u0002J0\u0010\u0085\u0001\u001a\u00020U2\r\u0010\u0086\u0001\u001a\u00080\u0087\u0001j\u0003`\u0088\u00012\u000b\u0008\u0002\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00172\t\u0008\u0002\u0010\u008a\u0001\u001a\u00020\u0012H\u0002J\u001e\u0010\u008b\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020U0\u008c\u00012\u0006\u0010a\u001a\u00020\u0017H\u0002JY\u0010\u008d\u0001\u001a\u00020U2D\u0010j\u001a@\u0008\u0001\u0012\u0005\u0012\u00030\u008f\u0001\u0012\u0017\u0012\u00150\u0090\u0001\u00a2\u0006\u000f\u0008\u0091\u0001\u0012\n\u0008\u0092\u0001\u0012\u0005\u0008\u0008(\u0093\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020U0\u0094\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u008e\u0001\u00a2\u0006\u0003\u0008\u0095\u0001H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0096\u0001J\t\u0010\u0097\u0001\u001a\u00020\u0012H\u0002J \u0010\u0097\u0001\u001a\u00020U2\u0014\u0010\u0098\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020U0\u008c\u0001H\u0082\u0008J\u001f\u0010\u0099\u0001\u001a\u00020U2\u000e\u0010\u009a\u0001\u001a\t\u0012\u0005\u0012\u00030\u009b\u00010\"H\u0010\u00a2\u0006\u0003\u0008\u009c\u0001J\u0017\u0010\u009d\u0001\u001a\u00020U2\u0006\u0010a\u001a\u00020\u0017H\u0010\u00a2\u0006\u0003\u0008\u009e\u0001J\u0012\u0010\u009f\u0001\u001a\u00020U2\u0007\u0010\u00a0\u0001\u001a\u00020GH\u0002J\u0017\u0010\u00a1\u0001\u001a\u00020U2\u0006\u0010a\u001a\u00020\u0017H\u0010\u00a2\u0006\u0003\u0008\u00a2\u0001J\u000b\u0010\u00a3\u0001\u001a\u0004\u0018\u000101H\u0002J\u0007\u0010\u00a4\u0001\u001a\u00020UJ\t\u0010\u00a5\u0001\u001a\u00020UH\u0002J\'\u0010\u00a6\u0001\u001a\u00020U2\u0008\u0010\u0093\u0001\u001a\u00030\u0090\u00012\u0008\u0010\u00a7\u0001\u001a\u00030\u00a8\u0001H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00a9\u0001J\u0012\u0010\u00aa\u0001\u001a\u00020UH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\\J\u001b\u0010\u00ab\u0001\u001a\u00020U2\u0006\u0010B\u001a\u00020\u0003H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00ac\u0001J\u0017\u0010\u00ad\u0001\u001a\u00020U2\u0006\u0010a\u001a\u00020\u0017H\u0010\u00a2\u0006\u0003\u0008\u00ae\u0001J.\u0010\u00af\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020U0\u008c\u00012\u0006\u0010a\u001a\u00020\u00172\u000e\u0010i\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010KH\u0002R\u0014\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128PX\u0090\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u001d\u001a\u001c\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001a0\u00160\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u00020$8PX\u0090\u0004\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010&R\u000e\u0010\'\u001a\u00020$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u00070)8F\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010+R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010-R\u000e\u0010.\u001a\u00020/X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u00102\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u00104\u001a\u00020\u00128BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00085\u0010\u0014R\u0014\u00106\u001a\u00020\u00128BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00087\u0010\u0014R\u0014\u00108\u001a\u00020\u00128BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00089\u0010\u0014R\u0014\u0010:\u001a\u00020\u00128BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008;\u0010\u0014R\u0011\u0010<\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\u0008=\u0010\u0014R\u0014\u0010>\u001a\u00020\u00128BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008?\u0010\u0014R\u000e\u0010@\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010A\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010B\u001a\u00020\u00038PX\u0090\u0004\u00a2\u0006\u0006\u001a\u0004\u0008C\u0010-R\u0012\u0010D\u001a\u00060ER\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010F\u001a\u0004\u0018\u00010GX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010H\u001a\u00020\u00128BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008I\u0010\u0014R\u0014\u0010J\u001a\u0008\u0012\u0004\u0012\u00020\u001f0KX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010L\u001a\u0008\u0012\u0004\u0012\u00020\u00070M8FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008N\u0010O\u001a\u0004\u0008P\u0010QR\u000e\u0010R\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010S\u001a\n\u0012\u0004\u0012\u00020U\u0018\u00010TX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u00b5\u0001"
    }
    d2 = {
        "Landroidx/compose/runtime/Recomposer;",
        "Landroidx/compose/runtime/CompositionContext;",
        "effectCoroutineContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "(Lkotlin/coroutines/CoroutineContext;)V",
        "_state",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Landroidx/compose/runtime/Recomposer$State;",
        "broadcastFrameClock",
        "Landroidx/compose/runtime/BroadcastFrameClock;",
        "<set-?>",
        "",
        "changeCount",
        "getChangeCount",
        "()J",
        "closeCause",
        "",
        "collectingParameterInformation",
        "",
        "getCollectingParameterInformation$runtime_release",
        "()Z",
        "compositionInvalidations",
        "",
        "Landroidx/compose/runtime/ControlledComposition;",
        "compositionValueStatesAvailable",
        "",
        "Landroidx/compose/runtime/MovableContentStateReference;",
        "Landroidx/compose/runtime/MovableContentState;",
        "compositionValuesAwaitingInsert",
        "compositionValuesRemoved",
        "Landroidx/compose/runtime/MovableContent;",
        "",
        "compositionsAwaitingApply",
        "compositionsRemoved",
        "",
        "compoundHashKey",
        "",
        "getCompoundHashKey$runtime_release",
        "()I",
        "concurrentCompositionsOutstanding",
        "currentState",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getCurrentState",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "getEffectCoroutineContext",
        "()Lkotlin/coroutines/CoroutineContext;",
        "effectJob",
        "Lkotlinx/coroutines/CompletableJob;",
        "errorState",
        "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;",
        "failedCompositions",
        "frameClockPaused",
        "hasBroadcastFrameClockAwaiters",
        "getHasBroadcastFrameClockAwaiters",
        "hasBroadcastFrameClockAwaitersLocked",
        "getHasBroadcastFrameClockAwaitersLocked",
        "hasConcurrentFrameWorkLocked",
        "getHasConcurrentFrameWorkLocked",
        "hasFrameWorkLocked",
        "getHasFrameWorkLocked",
        "hasPendingWork",
        "getHasPendingWork",
        "hasSchedulingWork",
        "getHasSchedulingWork",
        "isClosed",
        "knownCompositions",
        "recomposeCoroutineContext",
        "getRecomposeCoroutineContext$runtime_release",
        "recomposerInfo",
        "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;",
        "runnerJob",
        "Lkotlinx/coroutines/Job;",
        "shouldKeepRecomposing",
        "getShouldKeepRecomposing",
        "snapshotInvalidations",
        "Landroidx/compose/runtime/collection/IdentityArraySet;",
        "state",
        "Lkotlinx/coroutines/flow/Flow;",
        "getState$annotations",
        "()V",
        "getState",
        "()Lkotlinx/coroutines/flow/Flow;",
        "stateLock",
        "workContinuation",
        "Lkotlinx/coroutines/CancellableContinuation;",
        "",
        "applyAndCheck",
        "snapshot",
        "Landroidx/compose/runtime/snapshots/MutableSnapshot;",
        "asRecomposerInfo",
        "Landroidx/compose/runtime/RecomposerInfo;",
        "awaitIdle",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "awaitWorkAvailable",
        "cancel",
        "close",
        "composeInitial",
        "composition",
        "content",
        "Lkotlin/Function0;",
        "Landroidx/compose/runtime/Composable;",
        "composeInitial$runtime_release",
        "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V",
        "composing",
        "T",
        "modifiedValues",
        "block",
        "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;",
        "deletedMovableContent",
        "reference",
        "deletedMovableContent$runtime_release",
        "deriveStateLocked",
        "discardUnusedValues",
        "insertMovableContent",
        "insertMovableContent$runtime_release",
        "invalidate",
        "invalidate$runtime_release",
        "invalidateScope",
        "scope",
        "Landroidx/compose/runtime/RecomposeScopeImpl;",
        "invalidateScope$runtime_release",
        "join",
        "movableContentStateReleased",
        "data",
        "movableContentStateReleased$runtime_release",
        "movableContentStateResolve",
        "movableContentStateResolve$runtime_release",
        "pauseCompositionFrameClock",
        "performInitialMovableContentInserts",
        "performInsertValues",
        "",
        "references",
        "performRecompose",
        "processCompositionError",
        "e",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "failedInitialComposition",
        "recoverable",
        "readObserverOf",
        "Lkotlin/Function1;",
        "recompositionRunner",
        "Lkotlin/Function3;",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Landroidx/compose/runtime/MonotonicFrameClock;",
        "Lkotlin/ParameterName;",
        "name",
        "parentFrameClock",
        "Lkotlin/coroutines/Continuation;",
        "Lkotlin/ExtensionFunctionType;",
        "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "recordComposerModifications",
        "onEachInvalidComposition",
        "recordInspectionTable",
        "table",
        "Landroidx/compose/runtime/tooling/CompositionData;",
        "recordInspectionTable$runtime_release",
        "registerComposition",
        "registerComposition$runtime_release",
        "registerRunnerJob",
        "callingJob",
        "reportRemovedComposition",
        "reportRemovedComposition$runtime_release",
        "resetErrorState",
        "resumeCompositionFrameClock",
        "retryFailedCompositions",
        "runFrameLoop",
        "frameSignal",
        "Landroidx/compose/runtime/ProduceFrameSignal;",
        "(Landroidx/compose/runtime/MonotonicFrameClock;Landroidx/compose/runtime/ProduceFrameSignal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "runRecomposeAndApplyChanges",
        "runRecomposeConcurrentlyAndApplyChanges",
        "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "unregisterComposition",
        "unregisterComposition$runtime_release",
        "writeObserverOf",
        "Companion",
        "HotReloadable",
        "RecomposerErrorState",
        "RecomposerInfoImpl",
        "State",
        "runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Landroidx/compose/runtime/Recomposer$Companion;

.field private static final _hotReloadEnabled:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private static final _runningRecomposers:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet<",
            "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field private final _state:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Landroidx/compose/runtime/Recomposer$State;",
            ">;"
        }
    .end annotation
.end field

.field private final broadcastFrameClock:Landroidx/compose/runtime/BroadcastFrameClock;

.field private changeCount:J

.field private closeCause:Ljava/lang/Throwable;

.field private final compositionInvalidations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/runtime/ControlledComposition;",
            ">;"
        }
    .end annotation
.end field

.field private final compositionValueStatesAvailable:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroidx/compose/runtime/MovableContentStateReference;",
            "Landroidx/compose/runtime/MovableContentState;",
            ">;"
        }
    .end annotation
.end field

.field private final compositionValuesAwaitingInsert:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/runtime/MovableContentStateReference;",
            ">;"
        }
    .end annotation
.end field

.field private final compositionValuesRemoved:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroidx/compose/runtime/MovableContent<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/compose/runtime/MovableContentStateReference;",
            ">;>;"
        }
    .end annotation
.end field

.field private final compositionsAwaitingApply:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/runtime/ControlledComposition;",
            ">;"
        }
    .end annotation
.end field

.field private compositionsRemoved:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroidx/compose/runtime/ControlledComposition;",
            ">;"
        }
    .end annotation
.end field

.field private concurrentCompositionsOutstanding:I

.field private final effectCoroutineContext:Lkotlin/coroutines/CoroutineContext;

.field private final effectJob:Lkotlinx/coroutines/CompletableJob;

.field private errorState:Landroidx/compose/runtime/Recomposer$RecomposerErrorState;

.field private failedCompositions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/runtime/ControlledComposition;",
            ">;"
        }
    .end annotation
.end field

.field private frameClockPaused:Z

.field private isClosed:Z

.field private final knownCompositions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/runtime/ControlledComposition;",
            ">;"
        }
    .end annotation
.end field

.field private final recomposerInfo:Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;

.field private runnerJob:Lkotlinx/coroutines/Job;

.field private snapshotInvalidations:Landroidx/compose/runtime/collection/IdentityArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/collection/IdentityArraySet<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final stateLock:Ljava/lang/Object;

.field private workContinuation:Lkotlinx/coroutines/CancellableContinuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/CancellableContinuation<",
            "-",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/runtime/Recomposer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/runtime/Recomposer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/runtime/Recomposer;->Companion:Landroidx/compose/runtime/Recomposer$Companion;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/runtime/Recomposer;->$stable:I

    .line 1343
    invoke-static {}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt;->persistentSetOf()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    sput-object v0, Landroidx/compose/runtime/Recomposer;->_runningRecomposers:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 1345
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Landroidx/compose/runtime/Recomposer;->_hotReloadEnabled:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public constructor <init>(Lkotlin/coroutines/CoroutineContext;)V
    .locals 4
    .param p1, "effectCoroutineContext"    # Lkotlin/coroutines/CoroutineContext;

    const-string v0, "effectCoroutineContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    invoke-direct {p0}, Landroidx/compose/runtime/CompositionContext;-><init>()V

    .line 137
    new-instance v0, Landroidx/compose/runtime/BroadcastFrameClock;

    new-instance v1, Landroidx/compose/runtime/Recomposer$broadcastFrameClock$1;

    invoke-direct {v1, p0}, Landroidx/compose/runtime/Recomposer$broadcastFrameClock$1;-><init>(Landroidx/compose/runtime/Recomposer;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-direct {v0, v1}, Landroidx/compose/runtime/BroadcastFrameClock;-><init>(Lkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Landroidx/compose/runtime/Recomposer;->broadcastFrameClock:Landroidx/compose/runtime/BroadcastFrameClock;

    .line 196
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 201
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Landroidx/compose/runtime/Recomposer;->knownCompositions:Ljava/util/List;

    .line 202
    new-instance v0, Landroidx/compose/runtime/collection/IdentityArraySet;

    invoke-direct {v0}, Landroidx/compose/runtime/collection/IdentityArraySet;-><init>()V

    iput-object v0, p0, Landroidx/compose/runtime/Recomposer;->snapshotInvalidations:Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 203
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Landroidx/compose/runtime/Recomposer;->compositionInvalidations:Ljava/util/List;

    .line 204
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Landroidx/compose/runtime/Recomposer;->compositionsAwaitingApply:Ljava/util/List;

    .line 205
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Landroidx/compose/runtime/Recomposer;->compositionValuesAwaitingInsert:Ljava/util/List;

    .line 207
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v0, Ljava/util/Map;

    iput-object v0, p0, Landroidx/compose/runtime/Recomposer;->compositionValuesRemoved:Ljava/util/Map;

    .line 209
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v0, Ljava/util/Map;

    iput-object v0, p0, Landroidx/compose/runtime/Recomposer;->compositionValueStatesAvailable:Ljava/util/Map;

    .line 219
    sget-object v0, Landroidx/compose/runtime/Recomposer$State;->Inactive:Landroidx/compose/runtime/Recomposer$State;

    invoke-static {v0}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/runtime/Recomposer;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 229
    sget-object v0, Lkotlinx/coroutines/Job;->Key:Lkotlinx/coroutines/Job$Key;

    check-cast v0, Lkotlin/coroutines/CoroutineContext$Key;

    invoke-interface {p1, v0}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/Job;

    invoke-static {v0}, Lkotlinx/coroutines/JobKt;->Job(Lkotlinx/coroutines/Job;)Lkotlinx/coroutines/CompletableJob;

    move-result-object v0

    move-object v1, v0

    .local v1, "$this$effectJob_u24lambda_u240":Lkotlinx/coroutines/CompletableJob;
    const/4 v2, 0x0

    .line 230
    .local v2, "$i$a$-apply-Recomposer$effectJob$1":I
    new-instance v3, Landroidx/compose/runtime/Recomposer$effectJob$1$1;

    invoke-direct {v3, p0}, Landroidx/compose/runtime/Recomposer$effectJob$1$1;-><init>(Landroidx/compose/runtime/Recomposer;)V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v3}, Lkotlinx/coroutines/CompletableJob;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;

    .line 267
    nop

    .line 229
    .end local v1    # "$this$effectJob_u24lambda_u240":Lkotlinx/coroutines/CompletableJob;
    .end local v2    # "$i$a$-apply-Recomposer$effectJob$1":I
    iput-object v0, p0, Landroidx/compose/runtime/Recomposer;->effectJob:Lkotlinx/coroutines/CompletableJob;

    .line 273
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->broadcastFrameClock:Landroidx/compose/runtime/BroadcastFrameClock;

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    invoke-interface {p1, v0}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->effectJob:Lkotlinx/coroutines/CompletableJob;

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    invoke-interface {v0, v1}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/runtime/Recomposer;->effectCoroutineContext:Lkotlin/coroutines/CoroutineContext;

    .line 412
    new-instance v0, Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;

    invoke-direct {v0, p0}, Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;-><init>(Landroidx/compose/runtime/Recomposer;)V

    iput-object v0, p0, Landroidx/compose/runtime/Recomposer;->recomposerInfo:Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;

    .line 126
    return-void
.end method

.method public static final synthetic access$awaitWorkAvailable(Landroidx/compose/runtime/Recomposer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 124
    invoke-direct {p0, p1}, Landroidx/compose/runtime/Recomposer;->awaitWorkAvailable(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$deriveStateLocked(Landroidx/compose/runtime/Recomposer;)Lkotlinx/coroutines/CancellableContinuation;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;

    .line 124
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->deriveStateLocked()Lkotlinx/coroutines/CancellableContinuation;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$discardUnusedValues(Landroidx/compose/runtime/Recomposer;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;

    .line 124
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->discardUnusedValues()V

    return-void
.end method

.method public static final synthetic access$getBroadcastFrameClock$p(Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/BroadcastFrameClock;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;

    .line 124
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->broadcastFrameClock:Landroidx/compose/runtime/BroadcastFrameClock;

    return-object v0
.end method

.method public static final synthetic access$getCloseCause$p(Landroidx/compose/runtime/Recomposer;)Ljava/lang/Throwable;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;

    .line 124
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->closeCause:Ljava/lang/Throwable;

    return-object v0
.end method

.method public static final synthetic access$getCompositionInvalidations$p(Landroidx/compose/runtime/Recomposer;)Ljava/util/List;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;

    .line 124
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->compositionInvalidations:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic access$getCompositionValuesAwaitingInsert$p(Landroidx/compose/runtime/Recomposer;)Ljava/util/List;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;

    .line 124
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->compositionValuesAwaitingInsert:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic access$getCompositionsAwaitingApply$p(Landroidx/compose/runtime/Recomposer;)Ljava/util/List;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;

    .line 124
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->compositionsAwaitingApply:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic access$getConcurrentCompositionsOutstanding$p(Landroidx/compose/runtime/Recomposer;)I
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;

    .line 124
    iget v0, p0, Landroidx/compose/runtime/Recomposer;->concurrentCompositionsOutstanding:I

    return v0
.end method

.method public static final synthetic access$getErrorState$p(Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/Recomposer$RecomposerErrorState;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;

    .line 124
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->errorState:Landroidx/compose/runtime/Recomposer$RecomposerErrorState;

    return-object v0
.end method

.method public static final synthetic access$getHasBroadcastFrameClockAwaiters(Landroidx/compose/runtime/Recomposer;)Z
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;

    .line 124
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->getHasBroadcastFrameClockAwaiters()Z

    move-result v0

    return v0
.end method

.method public static final synthetic access$getHasConcurrentFrameWorkLocked(Landroidx/compose/runtime/Recomposer;)Z
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;

    .line 124
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->getHasConcurrentFrameWorkLocked()Z

    move-result v0

    return v0
.end method

.method public static final synthetic access$getHasSchedulingWork(Landroidx/compose/runtime/Recomposer;)Z
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;

    .line 124
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->getHasSchedulingWork()Z

    move-result v0

    return v0
.end method

.method public static final synthetic access$getKnownCompositions$p(Landroidx/compose/runtime/Recomposer;)Ljava/util/List;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;

    .line 124
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->knownCompositions:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic access$getRecomposerInfo$p(Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;

    .line 124
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->recomposerInfo:Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;

    return-object v0
.end method

.method public static final synthetic access$getRunnerJob$p(Landroidx/compose/runtime/Recomposer;)Lkotlinx/coroutines/Job;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;

    .line 124
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->runnerJob:Lkotlinx/coroutines/Job;

    return-object v0
.end method

.method public static final synthetic access$getShouldKeepRecomposing(Landroidx/compose/runtime/Recomposer;)Z
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;

    .line 124
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->getShouldKeepRecomposing()Z

    move-result v0

    return v0
.end method

.method public static final synthetic access$getSnapshotInvalidations$p(Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/collection/IdentityArraySet;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;

    .line 124
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->snapshotInvalidations:Landroidx/compose/runtime/collection/IdentityArraySet;

    return-object v0
.end method

.method public static final synthetic access$getStateLock$p(Landroidx/compose/runtime/Recomposer;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;

    .line 124
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    return-object v0
.end method

.method public static final synthetic access$getWorkContinuation$p(Landroidx/compose/runtime/Recomposer;)Lkotlinx/coroutines/CancellableContinuation;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;

    .line 124
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->workContinuation:Lkotlinx/coroutines/CancellableContinuation;

    return-object v0
.end method

.method public static final synthetic access$get_hotReloadEnabled$cp()Ljava/util/concurrent/atomic/AtomicReference;
    .locals 1

    .line 124
    sget-object v0, Landroidx/compose/runtime/Recomposer;->_hotReloadEnabled:Ljava/util/concurrent/atomic/AtomicReference;

    return-object v0
.end method

.method public static final synthetic access$get_runningRecomposers$cp()Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 1

    .line 124
    sget-object v0, Landroidx/compose/runtime/Recomposer;->_runningRecomposers:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object v0
.end method

.method public static final synthetic access$get_state$p(Landroidx/compose/runtime/Recomposer;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;

    .line 124
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object v0
.end method

.method public static final synthetic access$isClosed$p(Landroidx/compose/runtime/Recomposer;)Z
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;

    .line 124
    iget-boolean v0, p0, Landroidx/compose/runtime/Recomposer;->isClosed:Z

    return v0
.end method

.method public static final synthetic access$performInsertValues(Landroidx/compose/runtime/Recomposer;Ljava/util/List;Landroidx/compose/runtime/collection/IdentityArraySet;)Ljava/util/List;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;
    .param p1, "references"    # Ljava/util/List;
    .param p2, "modifiedValues"    # Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 124
    invoke-direct {p0, p1, p2}, Landroidx/compose/runtime/Recomposer;->performInsertValues(Ljava/util/List;Landroidx/compose/runtime/collection/IdentityArraySet;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$performRecompose(Landroidx/compose/runtime/Recomposer;Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;)Landroidx/compose/runtime/ControlledComposition;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;
    .param p1, "composition"    # Landroidx/compose/runtime/ControlledComposition;
    .param p2, "modifiedValues"    # Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 124
    invoke-direct {p0, p1, p2}, Landroidx/compose/runtime/Recomposer;->performRecompose(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;)Landroidx/compose/runtime/ControlledComposition;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$recompositionRunner(Landroidx/compose/runtime/Recomposer;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;
    .param p1, "block"    # Lkotlin/jvm/functions/Function3;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 124
    invoke-direct {p0, p1, p2}, Landroidx/compose/runtime/Recomposer;->recompositionRunner(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$recordComposerModifications(Landroidx/compose/runtime/Recomposer;)Z
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;

    .line 124
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->recordComposerModifications()Z

    move-result v0

    return v0
.end method

.method public static final synthetic access$registerRunnerJob(Landroidx/compose/runtime/Recomposer;Lkotlinx/coroutines/Job;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;
    .param p1, "callingJob"    # Lkotlinx/coroutines/Job;

    .line 124
    invoke-direct {p0, p1}, Landroidx/compose/runtime/Recomposer;->registerRunnerJob(Lkotlinx/coroutines/Job;)V

    return-void
.end method

.method public static final synthetic access$resetErrorState(Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/Recomposer$RecomposerErrorState;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;

    .line 124
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->resetErrorState()Landroidx/compose/runtime/Recomposer$RecomposerErrorState;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$retryFailedCompositions(Landroidx/compose/runtime/Recomposer;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;

    .line 124
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->retryFailedCompositions()V

    return-void
.end method

.method public static final synthetic access$runFrameLoop(Landroidx/compose/runtime/Recomposer;Landroidx/compose/runtime/MonotonicFrameClock;Landroidx/compose/runtime/ProduceFrameSignal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;
    .param p1, "parentFrameClock"    # Landroidx/compose/runtime/MonotonicFrameClock;
    .param p2, "frameSignal"    # Landroidx/compose/runtime/ProduceFrameSignal;
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 124
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/runtime/Recomposer;->runFrameLoop(Landroidx/compose/runtime/MonotonicFrameClock;Landroidx/compose/runtime/ProduceFrameSignal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$setChangeCount$p(Landroidx/compose/runtime/Recomposer;J)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;
    .param p1, "<set-?>"    # J

    .line 124
    iput-wide p1, p0, Landroidx/compose/runtime/Recomposer;->changeCount:J

    return-void
.end method

.method public static final synthetic access$setCloseCause$p(Landroidx/compose/runtime/Recomposer;Ljava/lang/Throwable;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;
    .param p1, "<set-?>"    # Ljava/lang/Throwable;

    .line 124
    iput-object p1, p0, Landroidx/compose/runtime/Recomposer;->closeCause:Ljava/lang/Throwable;

    return-void
.end method

.method public static final synthetic access$setCompositionsRemoved$p(Landroidx/compose/runtime/Recomposer;Ljava/util/Set;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;
    .param p1, "<set-?>"    # Ljava/util/Set;

    .line 124
    iput-object p1, p0, Landroidx/compose/runtime/Recomposer;->compositionsRemoved:Ljava/util/Set;

    return-void
.end method

.method public static final synthetic access$setConcurrentCompositionsOutstanding$p(Landroidx/compose/runtime/Recomposer;I)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;
    .param p1, "<set-?>"    # I

    .line 124
    iput p1, p0, Landroidx/compose/runtime/Recomposer;->concurrentCompositionsOutstanding:I

    return-void
.end method

.method public static final synthetic access$setRunnerJob$p(Landroidx/compose/runtime/Recomposer;Lkotlinx/coroutines/Job;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;
    .param p1, "<set-?>"    # Lkotlinx/coroutines/Job;

    .line 124
    iput-object p1, p0, Landroidx/compose/runtime/Recomposer;->runnerJob:Lkotlinx/coroutines/Job;

    return-void
.end method

.method public static final synthetic access$setSnapshotInvalidations$p(Landroidx/compose/runtime/Recomposer;Landroidx/compose/runtime/collection/IdentityArraySet;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;
    .param p1, "<set-?>"    # Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 124
    iput-object p1, p0, Landroidx/compose/runtime/Recomposer;->snapshotInvalidations:Landroidx/compose/runtime/collection/IdentityArraySet;

    return-void
.end method

.method public static final synthetic access$setWorkContinuation$p(Landroidx/compose/runtime/Recomposer;Lkotlinx/coroutines/CancellableContinuation;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/runtime/Recomposer;
    .param p1, "<set-?>"    # Lkotlinx/coroutines/CancellableContinuation;

    .line 124
    iput-object p1, p0, Landroidx/compose/runtime/Recomposer;->workContinuation:Lkotlinx/coroutines/CancellableContinuation;

    return-void
.end method

.method private final applyAndCheck(Landroidx/compose/runtime/snapshots/MutableSnapshot;)V
    .locals 3
    .param p1, "snapshot"    # Landroidx/compose/runtime/snapshots/MutableSnapshot;

    .line 1173
    nop

    .line 1174
    :try_start_0
    invoke-virtual {p1}, Landroidx/compose/runtime/snapshots/MutableSnapshot;->apply()Landroidx/compose/runtime/snapshots/SnapshotApplyResult;

    move-result-object v0

    .line 1175
    .local v0, "applyResult":Landroidx/compose/runtime/snapshots/SnapshotApplyResult;
    instance-of v1, v0, Landroidx/compose/runtime/snapshots/SnapshotApplyResult$Failure;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 1183
    .end local v0    # "applyResult":Landroidx/compose/runtime/snapshots/SnapshotApplyResult;
    invoke-virtual {p1}, Landroidx/compose/runtime/snapshots/MutableSnapshot;->dispose()V

    .line 1184
    nop

    .line 1185
    return-void

    .line 1176
    .restart local v0    # "applyResult":Landroidx/compose/runtime/snapshots/SnapshotApplyResult;
    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 1177
    const-string v2, "Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .end local p1    # "snapshot":Landroidx/compose/runtime/snapshots/MutableSnapshot;
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1183
    .end local v0    # "applyResult":Landroidx/compose/runtime/snapshots/SnapshotApplyResult;
    .restart local p1    # "snapshot":Landroidx/compose/runtime/snapshots/MutableSnapshot;
    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Landroidx/compose/runtime/snapshots/MutableSnapshot;->dispose()V

    throw v0
.end method

.method private final awaitWorkAvailable(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 897
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->getHasSchedulingWork()Z

    move-result v0

    if-nez v0, :cond_4

    .line 901
    const/4 v0, 0x0

    .line 1536
    .local v0, "$i$f$suspendCancellableCoroutine":I
    move-object v1, p1

    .local v1, "uCont$iv":Lkotlin/coroutines/Continuation;
    const/4 v2, 0x0

    .line 1537
    .local v2, "$i$a$-suspendCoroutineUninterceptedOrReturn-CancellableContinuationKt$suspendCancellableCoroutine$2$iv":I
    new-instance v3, Lkotlinx/coroutines/CancellableContinuationImpl;

    invoke-static {v1}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v4

    const/4 v5, 0x1

    invoke-direct {v3, v4, v5}, Lkotlinx/coroutines/CancellableContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 1543
    .local v3, "cancellable$iv":Lkotlinx/coroutines/CancellableContinuationImpl;
    invoke-virtual {v3}, Lkotlinx/coroutines/CancellableContinuationImpl;->initCancellability()V

    .line 1544
    move-object v4, v3

    check-cast v4, Lkotlinx/coroutines/CancellableContinuation;

    .local v4, "co":Lkotlinx/coroutines/CancellableContinuation;
    const/4 v5, 0x0

    .line 909
    .local v5, "$i$a$-suspendCancellableCoroutine-Recomposer$awaitWorkAvailable$2":I
    nop

    .line 902
    invoke-static {p0}, Landroidx/compose/runtime/Recomposer;->access$getStateLock$p(Landroidx/compose/runtime/Recomposer;)Ljava/lang/Object;

    move-result-object v6

    .local v6, "lock$iv":Ljava/lang/Object;
    const/4 v7, 0x0

    .line 1545
    .local v7, "$i$f$synchronized":I
    monitor-enter v6

    const/4 v8, 0x0

    .line 903
    .local v8, "$i$a$-synchronized-Recomposer$awaitWorkAvailable$2$1":I
    :try_start_0
    invoke-static {p0}, Landroidx/compose/runtime/Recomposer;->access$getHasSchedulingWork(Landroidx/compose/runtime/Recomposer;)Z

    move-result v9

    if-eqz v9, :cond_0

    .line 904
    move-object v9, v4

    goto :goto_0

    .line 906
    :cond_0
    invoke-static {p0, v4}, Landroidx/compose/runtime/Recomposer;->access$setWorkContinuation$p(Landroidx/compose/runtime/Recomposer;Lkotlinx/coroutines/CancellableContinuation;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 907
    const/4 v9, 0x0

    .line 903
    :goto_0
    nop

    .line 1545
    .end local v8    # "$i$a$-synchronized-Recomposer$awaitWorkAvailable$2$1":I
    monitor-exit v6

    .line 902
    .end local v6    # "lock$iv":Ljava/lang/Object;
    .end local v7    # "$i$f$synchronized":I
    nop

    .line 909
    if-eqz v9, :cond_1

    .line 902
    check-cast v9, Lkotlin/coroutines/Continuation;

    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 909
    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v6}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v9, v6}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    .line 910
    :cond_1
    nop

    .line 1544
    .end local v4    # "co":Lkotlinx/coroutines/CancellableContinuation;
    .end local v5    # "$i$a$-suspendCancellableCoroutine-Recomposer$awaitWorkAvailable$2":I
    nop

    .line 1546
    invoke-virtual {v3}, Lkotlinx/coroutines/CancellableContinuationImpl;->getResult()Ljava/lang/Object;

    move-result-object v1

    .line 1536
    .end local v1    # "uCont$iv":Lkotlin/coroutines/Continuation;
    .end local v2    # "$i$a$-suspendCoroutineUninterceptedOrReturn-CancellableContinuationKt$suspendCancellableCoroutine$2$iv":I
    .end local v3    # "cancellable$iv":Lkotlinx/coroutines/CancellableContinuationImpl;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_2

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_2
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_3

    return-object v1

    .line 1547
    :cond_3
    nop

    .end local v0    # "$i$f$suspendCancellableCoroutine":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 912
    return-object v0

    .line 1545
    .restart local v0    # "$i$f$suspendCancellableCoroutine":I
    .restart local v1    # "uCont$iv":Lkotlin/coroutines/Continuation;
    .restart local v2    # "$i$a$-suspendCoroutineUninterceptedOrReturn-CancellableContinuationKt$suspendCancellableCoroutine$2$iv":I
    .restart local v3    # "cancellable$iv":Lkotlinx/coroutines/CancellableContinuationImpl;
    .restart local v4    # "co":Lkotlinx/coroutines/CancellableContinuation;
    .restart local v5    # "$i$a$-suspendCancellableCoroutine-Recomposer$awaitWorkAvailable$2":I
    .restart local v6    # "lock$iv":Ljava/lang/Object;
    .restart local v7    # "$i$f$synchronized":I
    :catchall_0
    move-exception v8

    monitor-exit v6

    throw v8

    .line 912
    .end local v0    # "$i$f$suspendCancellableCoroutine":I
    .end local v1    # "uCont$iv":Lkotlin/coroutines/Continuation;
    .end local v2    # "$i$a$-suspendCoroutineUninterceptedOrReturn-CancellableContinuationKt$suspendCancellableCoroutine$2$iv":I
    .end local v3    # "cancellable$iv":Lkotlinx/coroutines/CancellableContinuationImpl;
    .end local v4    # "co":Lkotlinx/coroutines/CancellableContinuation;
    .end local v5    # "$i$a$-suspendCancellableCoroutine-Recomposer$awaitWorkAvailable$2":I
    .end local v6    # "lock$iv":Ljava/lang/Object;
    .end local v7    # "$i$f$synchronized":I
    :cond_4
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private final composing(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
    .locals 7
    .param p1, "composition"    # Landroidx/compose/runtime/ControlledComposition;
    .param p2, "modifiedValues"    # Landroidx/compose/runtime/collection/IdentityArraySet;
    .param p3, "block"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/runtime/ControlledComposition;",
            "Landroidx/compose/runtime/collection/IdentityArraySet<",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "+TT;>;)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1162
    .local v0, "$i$f$composing":I
    sget-object v1, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    .line 1163
    invoke-direct {p0, p1}, Landroidx/compose/runtime/Recomposer;->readObserverOf(Landroidx/compose/runtime/ControlledComposition;)Lkotlin/jvm/functions/Function1;

    move-result-object v2

    invoke-direct {p0, p1, p2}, Landroidx/compose/runtime/Recomposer;->writeObserverOf(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;)Lkotlin/jvm/functions/Function1;

    move-result-object v3

    .line 1162
    invoke-virtual {v1, v2, v3}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->takeMutableSnapshot(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/MutableSnapshot;

    move-result-object v1

    .line 1165
    .local v1, "snapshot":Landroidx/compose/runtime/snapshots/MutableSnapshot;
    nop

    .line 1166
    const/4 v2, 0x1

    :try_start_0
    move-object v3, v1

    check-cast v3, Landroidx/compose/runtime/snapshots/Snapshot;

    .local v3, "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    const/4 v4, 0x0

    .line 1644
    .local v4, "$i$f$enter":I
    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/Snapshot;->makeCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 1645
    .local v5, "previous$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    nop

    .line 1646
    :try_start_1
    invoke-interface {p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {v2}, Lkotlin/jvm/internal/InlineMarker;->finallyStart(I)V

    .line 1648
    invoke-virtual {v3, v5}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V

    invoke-static {v2}, Lkotlin/jvm/internal/InlineMarker;->finallyEnd(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1646
    nop

    .line 1648
    .end local v3    # "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .end local v4    # "$i$f$enter":I
    .end local v5    # "previous$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    invoke-static {v2}, Lkotlin/jvm/internal/InlineMarker;->finallyStart(I)V

    .line 1168
    invoke-direct {p0, v1}, Landroidx/compose/runtime/Recomposer;->applyAndCheck(Landroidx/compose/runtime/snapshots/MutableSnapshot;)V

    invoke-static {v2}, Lkotlin/jvm/internal/InlineMarker;->finallyEnd(I)V

    .line 1166
    return-object v6

    .line 1648
    .restart local v3    # "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .restart local v4    # "$i$f$enter":I
    .restart local v5    # "previous$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    :catchall_0
    move-exception v6

    :try_start_3
    invoke-static {v2}, Lkotlin/jvm/internal/InlineMarker;->finallyStart(I)V

    invoke-virtual {v3, v5}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V

    invoke-static {v2}, Lkotlin/jvm/internal/InlineMarker;->finallyEnd(I)V

    .end local v0    # "$i$f$composing":I
    .end local v1    # "snapshot":Landroidx/compose/runtime/snapshots/MutableSnapshot;
    .end local p1    # "composition":Landroidx/compose/runtime/ControlledComposition;
    .end local p2    # "modifiedValues":Landroidx/compose/runtime/collection/IdentityArraySet;
    .end local p3    # "block":Lkotlin/jvm/functions/Function0;
    throw v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 1168
    .end local v3    # "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .end local v4    # "$i$f$enter":I
    .end local v5    # "previous$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .restart local v0    # "$i$f$composing":I
    .restart local v1    # "snapshot":Landroidx/compose/runtime/snapshots/MutableSnapshot;
    .restart local p1    # "composition":Landroidx/compose/runtime/ControlledComposition;
    .restart local p2    # "modifiedValues":Landroidx/compose/runtime/collection/IdentityArraySet;
    .restart local p3    # "block":Lkotlin/jvm/functions/Function0;
    :catchall_1
    move-exception v3

    invoke-static {v2}, Lkotlin/jvm/internal/InlineMarker;->finallyStart(I)V

    invoke-direct {p0, v1}, Landroidx/compose/runtime/Recomposer;->applyAndCheck(Landroidx/compose/runtime/snapshots/MutableSnapshot;)V

    invoke-static {v2}, Lkotlin/jvm/internal/InlineMarker;->finallyEnd(I)V

    throw v3
.end method

.method private final deriveStateLocked()Lkotlinx/coroutines/CancellableContinuation;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/CancellableContinuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 288
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/Recomposer$State;

    sget-object v1, Landroidx/compose/runtime/Recomposer$State;->ShuttingDown:Landroidx/compose/runtime/Recomposer$State;

    check-cast v1, Ljava/lang/Enum;

    invoke-virtual {v0, v1}, Landroidx/compose/runtime/Recomposer$State;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-gtz v0, :cond_1

    .line 289
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->knownCompositions:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 290
    new-instance v0, Landroidx/compose/runtime/collection/IdentityArraySet;

    invoke-direct {v0}, Landroidx/compose/runtime/collection/IdentityArraySet;-><init>()V

    iput-object v0, p0, Landroidx/compose/runtime/Recomposer;->snapshotInvalidations:Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 291
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->compositionInvalidations:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 292
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->compositionsAwaitingApply:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 293
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->compositionValuesAwaitingInsert:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 294
    iput-object v2, p0, Landroidx/compose/runtime/Recomposer;->failedCompositions:Ljava/util/List;

    .line 295
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->workContinuation:Lkotlinx/coroutines/CancellableContinuation;

    if-eqz v0, :cond_0

    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/CancellableContinuation$DefaultImpls;->cancel$default(Lkotlinx/coroutines/CancellableContinuation;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    .line 296
    :cond_0
    iput-object v2, p0, Landroidx/compose/runtime/Recomposer;->workContinuation:Lkotlinx/coroutines/CancellableContinuation;

    .line 297
    iput-object v2, p0, Landroidx/compose/runtime/Recomposer;->errorState:Landroidx/compose/runtime/Recomposer$RecomposerErrorState;

    .line 298
    return-object v2

    .line 301
    :cond_1
    nop

    .line 302
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->errorState:Landroidx/compose/runtime/Recomposer$RecomposerErrorState;

    if-eqz v0, :cond_2

    .line 303
    sget-object v0, Landroidx/compose/runtime/Recomposer$State;->Inactive:Landroidx/compose/runtime/Recomposer$State;

    goto :goto_1

    .line 305
    :cond_2
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->runnerJob:Lkotlinx/coroutines/Job;

    if-nez v0, :cond_4

    .line 306
    new-instance v0, Landroidx/compose/runtime/collection/IdentityArraySet;

    invoke-direct {v0}, Landroidx/compose/runtime/collection/IdentityArraySet;-><init>()V

    iput-object v0, p0, Landroidx/compose/runtime/Recomposer;->snapshotInvalidations:Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 307
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->compositionInvalidations:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 308
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->getHasBroadcastFrameClockAwaitersLocked()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Landroidx/compose/runtime/Recomposer$State;->InactivePendingWork:Landroidx/compose/runtime/Recomposer$State;

    goto :goto_1

    .line 309
    :cond_3
    sget-object v0, Landroidx/compose/runtime/Recomposer$State;->Inactive:Landroidx/compose/runtime/Recomposer$State;

    goto :goto_1

    .line 311
    :cond_4
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->compositionInvalidations:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v1

    if-nez v0, :cond_6

    .line 312
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->snapshotInvalidations:Landroidx/compose/runtime/collection/IdentityArraySet;

    invoke-virtual {v0}, Landroidx/compose/runtime/collection/IdentityArraySet;->isNotEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 313
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->compositionsAwaitingApply:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v1

    if-nez v0, :cond_6

    .line 314
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->compositionValuesAwaitingInsert:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v1

    if-nez v0, :cond_6

    .line 315
    iget v0, p0, Landroidx/compose/runtime/Recomposer;->concurrentCompositionsOutstanding:I

    if-gtz v0, :cond_6

    .line 316
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->getHasBroadcastFrameClockAwaitersLocked()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_0

    .line 317
    :cond_5
    sget-object v0, Landroidx/compose/runtime/Recomposer$State;->Idle:Landroidx/compose/runtime/Recomposer$State;

    goto :goto_1

    .line 316
    :cond_6
    :goto_0
    sget-object v0, Landroidx/compose/runtime/Recomposer$State;->PendingWork:Landroidx/compose/runtime/Recomposer$State;

    .line 301
    :goto_1
    nop

    .line 320
    .local v0, "newState":Landroidx/compose/runtime/Recomposer$State;
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v1, v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 321
    sget-object v1, Landroidx/compose/runtime/Recomposer$State;->PendingWork:Landroidx/compose/runtime/Recomposer$State;

    if-ne v0, v1, :cond_7

    .line 322
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->workContinuation:Lkotlinx/coroutines/CancellableContinuation;

    move-object v3, v1

    .local v3, "it":Lkotlinx/coroutines/CancellableContinuation;
    const/4 v4, 0x0

    .line 323
    .local v4, "$i$a$-also-Recomposer$deriveStateLocked$1":I
    iput-object v2, p0, Landroidx/compose/runtime/Recomposer;->workContinuation:Lkotlinx/coroutines/CancellableContinuation;

    .line 324
    nop

    .line 322
    .end local v3    # "it":Lkotlinx/coroutines/CancellableContinuation;
    .end local v4    # "$i$a$-also-Recomposer$deriveStateLocked$1":I
    move-object v2, v1

    goto :goto_2

    .line 325
    :cond_7
    nop

    .line 321
    :goto_2
    return-object v2
.end method

.method private final discardUnusedValues()V
    .locals 20

    .line 1125
    move-object/from16 v1, p0

    iget-object v2, v1, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .local v2, "lock$iv":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 1626
    .local v3, "$i$f$synchronized":I
    monitor-enter v2

    const/4 v0, 0x0

    .line 1126
    .local v0, "$i$a$-synchronized-Recomposer$discardUnusedValues$unusedValues$1":I
    :try_start_0
    iget-object v4, v1, Landroidx/compose/runtime/Recomposer;->compositionValuesRemoved:Ljava/util/Map;

    invoke-interface {v4}, Ljava/util/Map;->isEmpty()Z

    move-result v4

    xor-int/lit8 v4, v4, 0x1

    if-eqz v4, :cond_1

    .line 1127
    iget-object v4, v1, Landroidx/compose/runtime/Recomposer;->compositionValuesRemoved:Ljava/util/Map;

    invoke-interface {v4}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->flatten(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v4

    .line 1128
    .local v4, "references":Ljava/util/List;
    iget-object v5, v1, Landroidx/compose/runtime/Recomposer;->compositionValuesRemoved:Ljava/util/Map;

    invoke-interface {v5}, Ljava/util/Map;->clear()V

    .line 1129
    move-object v5, v4

    .local v5, "$this$fastMap$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 1627
    .local v6, "$i$f$fastMap":I
    nop

    .line 1628
    new-instance v7, Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 1629
    .local v7, "target$iv":Ljava/util/ArrayList;
    move-object v8, v5

    .local v8, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v9, 0x0

    .line 1630
    .local v9, "$i$f$fastForEach":I
    nop

    .line 1631
    const/4 v10, 0x0

    .local v10, "index$iv$iv":I
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v11

    :goto_0
    if-ge v10, v11, :cond_0

    .line 1632
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    .line 1633
    .local v12, "item$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    .local v13, "it$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 1634
    .local v14, "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    move-object v15, v7

    check-cast v15, Ljava/util/Collection;

    move-object/from16 v16, v13

    check-cast v16, Landroidx/compose/runtime/MovableContentStateReference;

    move-object/from16 v17, v16

    .local v17, "it":Landroidx/compose/runtime/MovableContentStateReference;
    const/16 v16, 0x0

    .line 1130
    .local v16, "$i$a$-fastMap-Recomposer$discardUnusedValues$unusedValues$1$unusedValues$1":I
    move/from16 v18, v0

    .end local v0    # "$i$a$-synchronized-Recomposer$discardUnusedValues$unusedValues$1":I
    .local v18, "$i$a$-synchronized-Recomposer$discardUnusedValues$unusedValues$1":I
    iget-object v0, v1, Landroidx/compose/runtime/Recomposer;->compositionValueStatesAvailable:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move/from16 v19, v3

    move-object/from16 v3, v17

    .end local v17    # "it":Landroidx/compose/runtime/MovableContentStateReference;
    .local v3, "it":Landroidx/compose/runtime/MovableContentStateReference;
    .local v19, "$i$f$synchronized":I
    :try_start_1
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 1634
    .end local v3    # "it":Landroidx/compose/runtime/MovableContentStateReference;
    .end local v16    # "$i$a$-fastMap-Recomposer$discardUnusedValues$unusedValues$1$unusedValues$1":I
    invoke-interface {v15, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1635
    nop

    .line 1633
    .end local v13    # "it$iv":Ljava/lang/Object;
    .end local v14    # "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    nop

    .line 1631
    .end local v12    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v10, v10, 0x1

    move/from16 v0, v18

    move/from16 v3, v19

    goto :goto_0

    .end local v18    # "$i$a$-synchronized-Recomposer$discardUnusedValues$unusedValues$1":I
    .end local v19    # "$i$f$synchronized":I
    .restart local v0    # "$i$a$-synchronized-Recomposer$discardUnusedValues$unusedValues$1":I
    .local v3, "$i$f$synchronized":I
    :cond_0
    move/from16 v18, v0

    move/from16 v19, v3

    .line 1636
    .end local v0    # "$i$a$-synchronized-Recomposer$discardUnusedValues$unusedValues$1":I
    .end local v3    # "$i$f$synchronized":I
    .end local v10    # "index$iv$iv":I
    .restart local v18    # "$i$a$-synchronized-Recomposer$discardUnusedValues$unusedValues$1":I
    .restart local v19    # "$i$f$synchronized":I
    nop

    .line 1637
    .end local v8    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v9    # "$i$f$fastForEach":I
    move-object v0, v7

    check-cast v0, Ljava/util/List;

    .line 1129
    .end local v5    # "$this$fastMap$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastMap":I
    .end local v7    # "target$iv":Ljava/util/ArrayList;
    nop

    .line 1132
    .local v0, "unusedValues":Ljava/util/List;
    iget-object v3, v1, Landroidx/compose/runtime/Recomposer;->compositionValueStatesAvailable:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->clear()V

    .line 1133
    nop

    .end local v0    # "unusedValues":Ljava/util/List;
    .end local v4    # "references":Ljava/util/List;
    goto :goto_1

    .line 1134
    .end local v18    # "$i$a$-synchronized-Recomposer$discardUnusedValues$unusedValues$1":I
    .end local v19    # "$i$f$synchronized":I
    .local v0, "$i$a$-synchronized-Recomposer$discardUnusedValues$unusedValues$1":I
    .restart local v3    # "$i$f$synchronized":I
    :cond_1
    move/from16 v18, v0

    move/from16 v19, v3

    .end local v0    # "$i$a$-synchronized-Recomposer$discardUnusedValues$unusedValues$1":I
    .end local v3    # "$i$f$synchronized":I
    .restart local v18    # "$i$a$-synchronized-Recomposer$discardUnusedValues$unusedValues$1":I
    .restart local v19    # "$i$f$synchronized":I
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1126
    :goto_1
    nop

    .line 1626
    .end local v18    # "$i$a$-synchronized-Recomposer$discardUnusedValues$unusedValues$1":I
    monitor-exit v2

    .line 1125
    .end local v2    # "lock$iv":Ljava/lang/Object;
    .end local v19    # "$i$f$synchronized":I
    nop

    .line 1136
    .local v0, "unusedValues":Ljava/util/List;
    move-object v2, v0

    .local v2, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 1638
    .local v3, "$i$f$fastForEach":I
    nop

    .line 1639
    const/4 v4, 0x0

    .local v4, "index$iv":I
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    :goto_2
    if-ge v4, v5, :cond_3

    .line 1640
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 1641
    .local v6, "item$iv":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Lkotlin/Pair;

    const/4 v8, 0x0

    .line 1136
    .local v8, "$i$a$-fastForEach-Recomposer$discardUnusedValues$1":I
    invoke-virtual {v7}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/compose/runtime/MovableContentStateReference;

    .local v9, "reference":Landroidx/compose/runtime/MovableContentStateReference;
    invoke-virtual {v7}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/compose/runtime/MovableContentState;

    .line 1137
    .local v7, "state":Landroidx/compose/runtime/MovableContentState;
    if-eqz v7, :cond_2

    .line 1138
    invoke-virtual {v9}, Landroidx/compose/runtime/MovableContentStateReference;->getComposition$runtime_release()Landroidx/compose/runtime/ControlledComposition;

    move-result-object v10

    invoke-interface {v10, v7}, Landroidx/compose/runtime/ControlledComposition;->disposeUnusedMovableContent(Landroidx/compose/runtime/MovableContentState;)V

    .line 1140
    :cond_2
    nop

    .line 1641
    .end local v7    # "state":Landroidx/compose/runtime/MovableContentState;
    .end local v8    # "$i$a$-fastForEach-Recomposer$discardUnusedValues$1":I
    .end local v9    # "reference":Landroidx/compose/runtime/MovableContentStateReference;
    nop

    .line 1639
    .end local v6    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 1643
    .end local v4    # "index$iv":I
    :cond_3
    nop

    .line 1141
    .end local v2    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastForEach":I
    return-void

    .line 1626
    .end local v0    # "unusedValues":Ljava/util/List;
    .local v2, "lock$iv":Ljava/lang/Object;
    .restart local v19    # "$i$f$synchronized":I
    :catchall_0
    move-exception v0

    goto :goto_3

    .end local v19    # "$i$f$synchronized":I
    .local v3, "$i$f$synchronized":I
    :catchall_1
    move-exception v0

    move/from16 v19, v3

    .end local v3    # "$i$f$synchronized":I
    .restart local v19    # "$i$f$synchronized":I
    :goto_3
    monitor-exit v2

    throw v0
.end method

.method private final getHasBroadcastFrameClockAwaiters()Z
    .locals 4

    .line 282
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 1503
    .local v1, "$i$f$synchronized":I
    monitor-enter v0

    const/4 v2, 0x0

    .line 282
    .local v2, "$i$a$-synchronized-Recomposer$hasBroadcastFrameClockAwaiters$1":I
    :try_start_0
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->getHasBroadcastFrameClockAwaitersLocked()Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1503
    .end local v2    # "$i$a$-synchronized-Recomposer$hasBroadcastFrameClockAwaiters$1":I
    monitor-exit v0

    .line 282
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    return v3

    .line 1503
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :catchall_0
    move-exception v2

    monitor-exit v0

    throw v2
.end method

.method private final getHasBroadcastFrameClockAwaitersLocked()Z
    .locals 1

    .line 279
    iget-boolean v0, p0, Landroidx/compose/runtime/Recomposer;->frameClockPaused:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->broadcastFrameClock:Landroidx/compose/runtime/BroadcastFrameClock;

    invoke-virtual {v0}, Landroidx/compose/runtime/BroadcastFrameClock;->getHasAwaiters()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final getHasConcurrentFrameWorkLocked()Z
    .locals 2

    .line 1204
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->compositionsAwaitingApply:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-nez v0, :cond_1

    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->getHasBroadcastFrameClockAwaitersLocked()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method

.method private final getHasFrameWorkLocked()Z
    .locals 2

    .line 1201
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->compositionInvalidations:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-nez v0, :cond_1

    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->getHasBroadcastFrameClockAwaitersLocked()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method

.method private final getHasSchedulingWork()Z
    .locals 5

    .line 890
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 1535
    .local v1, "$i$f$synchronized":I
    monitor-enter v0

    const/4 v2, 0x0

    .line 891
    .local v2, "$i$a$-synchronized-Recomposer$hasSchedulingWork$1":I
    :try_start_0
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->snapshotInvalidations:Landroidx/compose/runtime/collection/IdentityArraySet;

    invoke-virtual {v3}, Landroidx/compose/runtime/collection/IdentityArraySet;->isNotEmpty()Z

    move-result v3

    const/4 v4, 0x1

    if-nez v3, :cond_1

    .line 892
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->compositionInvalidations:Ljava/util/List;

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    xor-int/2addr v3, v4

    if-nez v3, :cond_1

    .line 893
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->getHasBroadcastFrameClockAwaitersLocked()Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    nop

    .line 891
    :goto_1
    nop

    .line 1535
    .end local v2    # "$i$a$-synchronized-Recomposer$hasSchedulingWork$1":I
    monitor-exit v0

    .line 894
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    return v4

    .line 1535
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :catchall_0
    move-exception v2

    monitor-exit v0

    throw v2
.end method

.method private final getShouldKeepRecomposing()Z
    .locals 8

    .line 332
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 1504
    .local v1, "$i$f$synchronized":I
    monitor-enter v0

    const/4 v2, 0x0

    .line 332
    .local v2, "$i$a$-synchronized-Recomposer$shouldKeepRecomposing$1":I
    :try_start_0
    iget-boolean v3, p0, Landroidx/compose/runtime/Recomposer;->isClosed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1504
    .end local v2    # "$i$a$-synchronized-Recomposer$shouldKeepRecomposing$1":I
    const/4 v2, 0x1

    xor-int/2addr v3, v2

    monitor-exit v0

    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    if-nez v3, :cond_3

    .line 333
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->effectJob:Lkotlinx/coroutines/CompletableJob;

    invoke-interface {v0}, Lkotlinx/coroutines/CompletableJob;->getChildren()Lkotlin/sequences/Sequence;

    move-result-object v0

    .local v0, "$this$any$iv":Lkotlin/sequences/Sequence;
    const/4 v1, 0x0

    .line 1505
    .local v1, "$i$f$any":I
    invoke-interface {v0}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .local v4, "element$iv":Ljava/lang/Object;
    move-object v6, v4

    check-cast v6, Lkotlinx/coroutines/Job;

    .local v6, "it":Lkotlinx/coroutines/Job;
    const/4 v7, 0x0

    .line 333
    .local v7, "$i$a$-any-Recomposer$shouldKeepRecomposing$2":I
    invoke-interface {v6}, Lkotlinx/coroutines/Job;->isActive()Z

    move-result v6

    .line 1505
    .end local v6    # "it":Lkotlinx/coroutines/Job;
    .end local v7    # "$i$a$-any-Recomposer$shouldKeepRecomposing$2":I
    if-eqz v6, :cond_0

    move v0, v2

    goto :goto_0

    .line 1506
    .end local v4    # "element$iv":Ljava/lang/Object;
    :cond_1
    move v0, v5

    .end local v0    # "$this$any$iv":Lkotlin/sequences/Sequence;
    .end local v1    # "$i$f$any":I
    :goto_0
    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    move v2, v5

    goto :goto_2

    :cond_3
    :goto_1
    nop

    .line 333
    :goto_2
    return v2

    .line 1504
    .local v0, "lock$iv":Ljava/lang/Object;
    .local v1, "$i$f$synchronized":I
    :catchall_0
    move-exception v2

    monitor-exit v0

    throw v2
.end method

.method public static synthetic getState$annotations()V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "Replaced by currentState as a StateFlow"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "currentState"
            imports = {}
        .end subannotation
    .end annotation

    return-void
.end method

.method private final performInitialMovableContentInserts(Landroidx/compose/runtime/ControlledComposition;)V
    .locals 17
    .param p1, "composition"    # Landroidx/compose/runtime/ControlledComposition;

    .line 1056
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    iget-object v3, v1, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .local v3, "lock$iv":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 1562
    .local v4, "$i$f$synchronized":I
    monitor-enter v3

    const/4 v0, 0x0

    .line 1057
    .local v0, "$i$a$-synchronized-Recomposer$performInitialMovableContentInserts$1":I
    :try_start_0
    iget-object v5, v1, Landroidx/compose/runtime/Recomposer;->compositionValuesAwaitingInsert:Ljava/util/List;

    .local v5, "$this$fastAny$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 1563
    .local v6, "$i$f$fastAny":I
    nop

    .line 1564
    move-object v7, v5

    .local v7, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v8, 0x0

    .line 1565
    .local v8, "$i$f$fastForEach":I
    nop

    .line 1566
    const/4 v9, 0x0

    .local v9, "index$iv$iv":I
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v10

    :goto_0
    if-ge v9, v10, :cond_1

    .line 1567
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    .line 1568
    .local v12, "item$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    .local v13, "it$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 1569
    .local v14, "$i$a$-fastForEach-ListUtilsKt$fastAny$2$iv":I
    move-object v15, v13

    check-cast v15, Landroidx/compose/runtime/MovableContentStateReference;

    .local v15, "it":Landroidx/compose/runtime/MovableContentStateReference;
    const/16 v16, 0x0

    .line 1057
    .local v16, "$i$a$-fastAny-Recomposer$performInitialMovableContentInserts$1$1":I
    invoke-virtual {v15}, Landroidx/compose/runtime/MovableContentStateReference;->getComposition$runtime_release()Landroidx/compose/runtime/ControlledComposition;

    move-result-object v11

    invoke-static {v11, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1569
    .end local v15    # "it":Landroidx/compose/runtime/MovableContentStateReference;
    .end local v16    # "$i$a$-fastAny-Recomposer$performInitialMovableContentInserts$1$1":I
    if-eqz v11, :cond_0

    const/4 v7, 0x1

    goto :goto_1

    .line 1570
    :cond_0
    nop

    .line 1568
    .end local v13    # "it$iv":Ljava/lang/Object;
    .end local v14    # "$i$a$-fastForEach-ListUtilsKt$fastAny$2$iv":I
    nop

    .line 1566
    .end local v12    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 1571
    .end local v9    # "index$iv$iv":I
    :cond_1
    nop

    .line 1572
    .end local v7    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v8    # "$i$f$fastForEach":I
    const/4 v7, 0x0

    .line 1057
    .end local v5    # "$this$fastAny$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastAny":I
    :goto_1
    if-nez v7, :cond_2

    .end local v0    # "$i$a$-synchronized-Recomposer$performInitialMovableContentInserts$1":I
    .end local v3    # "lock$iv":Ljava/lang/Object;
    .end local v4    # "$i$f$synchronized":I
    monitor-exit v3

    return-void

    .line 1058
    .restart local v0    # "$i$a$-synchronized-Recomposer$performInitialMovableContentInserts$1":I
    .restart local v3    # "lock$iv":Ljava/lang/Object;
    .restart local v4    # "$i$f$synchronized":I
    :cond_2
    nop

    .end local v0    # "$i$a$-synchronized-Recomposer$performInitialMovableContentInserts$1":I
    :try_start_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1562
    monitor-exit v3

    .line 1059
    .end local v3    # "lock$iv":Ljava/lang/Object;
    .end local v4    # "$i$f$synchronized":I
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    .line 1073
    .local v0, "toInsert":Ljava/util/List;
    invoke-static {v0, v1, v2}, Landroidx/compose/runtime/Recomposer;->performInitialMovableContentInserts$fillToInsert(Ljava/util/List;Landroidx/compose/runtime/Recomposer;Landroidx/compose/runtime/ControlledComposition;)V

    .line 1074
    :goto_2
    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    const/4 v4, 0x1

    xor-int/2addr v3, v4

    if-eqz v3, :cond_3

    .line 1075
    const/4 v3, 0x0

    invoke-direct {v1, v0, v3}, Landroidx/compose/runtime/Recomposer;->performInsertValues(Ljava/util/List;Landroidx/compose/runtime/collection/IdentityArraySet;)Ljava/util/List;

    .line 1076
    invoke-static {v0, v1, v2}, Landroidx/compose/runtime/Recomposer;->performInitialMovableContentInserts$fillToInsert(Ljava/util/List;Landroidx/compose/runtime/Recomposer;Landroidx/compose/runtime/ControlledComposition;)V

    goto :goto_2

    .line 1078
    :cond_3
    return-void

    .line 1562
    .end local v0    # "toInsert":Ljava/util/List;
    .restart local v3    # "lock$iv":Ljava/lang/Object;
    .restart local v4    # "$i$f$synchronized":I
    :catchall_0
    move-exception v0

    monitor-exit v3

    throw v0
.end method

.method private static final performInitialMovableContentInserts$fillToInsert(Ljava/util/List;Landroidx/compose/runtime/Recomposer;Landroidx/compose/runtime/ControlledComposition;)V
    .locals 6
    .param p0, "toInsert"    # Ljava/util/List;
    .param p1, "this$0"    # Landroidx/compose/runtime/Recomposer;
    .param p2, "$composition"    # Landroidx/compose/runtime/ControlledComposition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/compose/runtime/MovableContentStateReference;",
            ">;",
            "Landroidx/compose/runtime/Recomposer;",
            "Landroidx/compose/runtime/ControlledComposition;",
            ")V"
        }
    .end annotation

    .line 1061
    invoke-interface {p0}, Ljava/util/List;->clear()V

    .line 1062
    iget-object v0, p1, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 1660
    .local v1, "$i$f$synchronized":I
    monitor-enter v0

    const/4 v2, 0x0

    .line 1063
    .local v2, "$i$a$-synchronized-Recomposer$performInitialMovableContentInserts$fillToInsert$1":I
    :try_start_0
    iget-object v3, p1, Landroidx/compose/runtime/Recomposer;->compositionValuesAwaitingInsert:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 1064
    .local v3, "iterator":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 1065
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/compose/runtime/MovableContentStateReference;

    .line 1066
    .local v4, "value":Landroidx/compose/runtime/MovableContentStateReference;
    invoke-virtual {v4}, Landroidx/compose/runtime/MovableContentStateReference;->getComposition$runtime_release()Landroidx/compose/runtime/ControlledComposition;

    move-result-object v5

    invoke-static {v5, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 1067
    invoke-interface {p0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1068
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    .end local v4    # "value":Landroidx/compose/runtime/MovableContentStateReference;
    goto :goto_0

    .line 1071
    :cond_1
    nop

    .end local v2    # "$i$a$-synchronized-Recomposer$performInitialMovableContentInserts$fillToInsert$1":I
    .end local v3    # "iterator":Ljava/util/Iterator;
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1660
    monitor-exit v0

    .line 1072
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    return-void

    .line 1660
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :catchall_0
    move-exception v2

    monitor-exit v0

    throw v2
.end method

.method private final performInsertValues(Ljava/util/List;Landroidx/compose/runtime/collection/IdentityArraySet;)Ljava/util/List;
    .locals 29
    .param p1, "references"    # Ljava/util/List;
    .param p2, "modifiedValues"    # Landroidx/compose/runtime/collection/IdentityArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/compose/runtime/MovableContentStateReference;",
            ">;",
            "Landroidx/compose/runtime/collection/IdentityArraySet<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/compose/runtime/ControlledComposition;",
            ">;"
        }
    .end annotation

    .line 1106
    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .local v0, "$this$fastGroupBy$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 1584
    .local v2, "$i$f$fastGroupBy":I
    nop

    .line 1585
    new-instance v3, Ljava/util/HashMap;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/HashMap;-><init>(I)V

    .line 1586
    .local v3, "destination$iv":Ljava/util/HashMap;
    move-object v4, v0

    .local v4, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 1587
    .local v5, "$i$f$fastForEach":I
    nop

    .line 1588
    const/4 v6, 0x0

    .local v6, "index$iv$iv":I
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v7

    :goto_0
    if-ge v6, v7, :cond_1

    .line 1589
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 1590
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    .local v9, "it$iv":Ljava/lang/Object;
    const/4 v10, 0x0

    .line 1591
    .local v10, "$i$a$-fastForEach-ListUtilsKt$fastGroupBy$2$iv":I
    move-object v11, v9

    check-cast v11, Landroidx/compose/runtime/MovableContentStateReference;

    .local v11, "it":Landroidx/compose/runtime/MovableContentStateReference;
    const/4 v12, 0x0

    .line 1106
    .local v12, "$i$a$-fastGroupBy-Recomposer$performInsertValues$tasks$1":I
    invoke-virtual {v11}, Landroidx/compose/runtime/MovableContentStateReference;->getComposition$runtime_release()Landroidx/compose/runtime/ControlledComposition;

    move-result-object v11

    .line 1591
    .end local v11    # "it":Landroidx/compose/runtime/MovableContentStateReference;
    .end local v12    # "$i$a$-fastGroupBy-Recomposer$performInsertValues$tasks$1":I
    nop

    .line 1592
    .local v11, "key$iv":Ljava/lang/Object;
    move-object v12, v3

    check-cast v12, Ljava/util/Map;

    .local v12, "$this$getOrPut$iv$iv":Ljava/util/Map;
    const/4 v13, 0x0

    .line 1593
    .local v13, "$i$f$getOrPut":I
    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    .line 1594
    .local v14, "value$iv$iv":Ljava/lang/Object;
    if-nez v14, :cond_0

    .line 1595
    const/4 v15, 0x0

    .line 1592
    .local v15, "$i$a$-getOrPut-ListUtilsKt$fastGroupBy$2$list$1$iv":I
    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    .line 1595
    .end local v15    # "$i$a$-getOrPut-ListUtilsKt$fastGroupBy$2$list$1$iv":I
    move-object/from16 v15, v16

    .line 1596
    .local v15, "answer$iv$iv":Ljava/lang/Object;
    invoke-interface {v12, v11, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1597
    nop

    .end local v15    # "answer$iv$iv":Ljava/lang/Object;
    goto :goto_1

    .line 1599
    :cond_0
    move-object v15, v14

    .line 1594
    :goto_1
    nop

    .line 1592
    .end local v12    # "$this$getOrPut$iv$iv":Ljava/util/Map;
    .end local v13    # "$i$f$getOrPut":I
    .end local v14    # "value$iv$iv":Ljava/lang/Object;
    move-object v12, v15

    check-cast v12, Ljava/util/ArrayList;

    .line 1600
    .local v12, "list$iv":Ljava/util/ArrayList;
    invoke-virtual {v12, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1601
    nop

    .line 1590
    .end local v9    # "it$iv":Ljava/lang/Object;
    .end local v10    # "$i$a$-fastForEach-ListUtilsKt$fastGroupBy$2$iv":I
    .end local v11    # "key$iv":Ljava/lang/Object;
    .end local v12    # "list$iv":Ljava/util/ArrayList;
    nop

    .line 1588
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 1602
    .end local v6    # "index$iv$iv":I
    :cond_1
    nop

    .line 1603
    .end local v4    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v5    # "$i$f$fastForEach":I
    move-object v0, v3

    check-cast v0, Ljava/util/Map;

    .line 1106
    .end local v0    # "$this$fastGroupBy$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastGroupBy":I
    .end local v3    # "destination$iv":Ljava/util/HashMap;
    move-object v2, v0

    .line 1107
    .local v2, "tasks":Ljava/util/Map;
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/compose/runtime/ControlledComposition;

    .local v4, "composition":Landroidx/compose/runtime/ControlledComposition;
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 1108
    .local v3, "refs":Ljava/util/List;
    invoke-interface {v4}, Landroidx/compose/runtime/ControlledComposition;->isComposing()Z

    move-result v5

    xor-int/lit8 v5, v5, 0x1

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->runtimeCheck(Z)V

    .line 1109
    move-object/from16 v5, p0

    .local v5, "this_$iv":Landroidx/compose/runtime/Recomposer;
    const/4 v6, 0x0

    .line 1604
    .local v6, "$i$f$composing":I
    sget-object v7, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    .line 1605
    invoke-direct {v5, v4}, Landroidx/compose/runtime/Recomposer;->readObserverOf(Landroidx/compose/runtime/ControlledComposition;)Lkotlin/jvm/functions/Function1;

    move-result-object v8

    move-object/from16 v9, p2

    invoke-direct {v5, v4, v9}, Landroidx/compose/runtime/Recomposer;->writeObserverOf(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;)Lkotlin/jvm/functions/Function1;

    move-result-object v10

    .line 1604
    invoke-virtual {v7, v8, v10}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->takeMutableSnapshot(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/MutableSnapshot;

    move-result-object v7

    .line 1607
    .local v7, "snapshot$iv":Landroidx/compose/runtime/snapshots/MutableSnapshot;
    nop

    .line 1608
    :try_start_0
    move-object v8, v7

    check-cast v8, Landroidx/compose/runtime/snapshots/Snapshot;

    .local v8, "this_$iv$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    const/4 v10, 0x0

    .line 1609
    .local v10, "$i$f$enter":I
    invoke-virtual {v8}, Landroidx/compose/runtime/snapshots/Snapshot;->makeCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    .line 1610
    .local v11, "previous$iv$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    nop

    .line 1611
    const/4 v12, 0x0

    .line 1112
    .local v12, "$i$a$-composing-Recomposer$performInsertValues$1":I
    :try_start_1
    iget-object v13, v1, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .local v13, "lock$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 1612
    .local v14, "$i$f$synchronized":I
    monitor-enter v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    const/4 v15, 0x0

    .line 1113
    .local v15, "$i$a$-synchronized-Recomposer$performInsertValues$1$pairs$1":I
    move-object/from16 v16, v3

    .local v16, "$this$fastMap$iv":Ljava/util/List;
    const/16 v17, 0x0

    .line 1613
    .local v17, "$i$f$fastMap":I
    nop

    .line 1614
    move-object/from16 v18, v0

    :try_start_2
    new-instance v0, Ljava/util/ArrayList;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object/from16 v19, v3

    .end local v3    # "refs":Ljava/util/List;
    .local v19, "refs":Ljava/util/List;
    :try_start_3
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 1615
    .local v0, "target$iv":Ljava/util/ArrayList;
    move-object/from16 v3, v16

    .local v3, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/16 v20, 0x0

    .line 1616
    .local v20, "$i$f$fastForEach":I
    nop

    .line 1617
    const/16 v21, 0x0

    move/from16 v22, v6

    .end local v6    # "$i$f$composing":I
    .local v21, "index$iv$iv":I
    .local v22, "$i$f$composing":I
    :try_start_4
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    move/from16 v9, v21

    .end local v21    # "index$iv$iv":I
    .local v9, "index$iv$iv":I
    :goto_3
    if-ge v9, v6, :cond_2

    .line 1618
    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v21

    .line 1619
    .local v21, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v23, v21

    .local v23, "it$iv":Ljava/lang/Object;
    const/16 v24, 0x0

    .line 1620
    .local v24, "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    move-object/from16 v25, v3

    .end local v3    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v25, "$this$fastForEach$iv$iv":Ljava/util/List;
    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    move-object/from16 v26, v23

    check-cast v26, Landroidx/compose/runtime/MovableContentStateReference;

    move-object/from16 v27, v26

    .local v27, "reference":Landroidx/compose/runtime/MovableContentStateReference;
    const/16 v26, 0x0

    .line 1114
    .local v26, "$i$a$-fastMap-Recomposer$performInsertValues$1$pairs$1$1":I
    nop

    .line 1115
    move/from16 v28, v6

    iget-object v6, v1, Landroidx/compose/runtime/Recomposer;->compositionValuesRemoved:Ljava/util/Map;

    invoke-virtual/range {v27 .. v27}, Landroidx/compose/runtime/MovableContentStateReference;->getContent$runtime_release()Landroidx/compose/runtime/MovableContent;

    move-result-object v1

    invoke-static {v6, v1}, Landroidx/compose/runtime/RecomposerKt;->removeLastMultiValue(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 1114
    move-object/from16 v6, v27

    .end local v27    # "reference":Landroidx/compose/runtime/MovableContentStateReference;
    .local v6, "reference":Landroidx/compose/runtime/MovableContentStateReference;
    invoke-static {v6, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 1620
    .end local v6    # "reference":Landroidx/compose/runtime/MovableContentStateReference;
    .end local v26    # "$i$a$-fastMap-Recomposer$performInsertValues$1$pairs$1$1":I
    invoke-interface {v3, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1621
    nop

    .line 1619
    .end local v23    # "it$iv":Ljava/lang/Object;
    .end local v24    # "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    nop

    .line 1617
    .end local v21    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v1, p0

    move-object/from16 v3, v25

    move/from16 v6, v28

    goto :goto_3

    .end local v25    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v3    # "$this$fastForEach$iv$iv":Ljava/util/List;
    :cond_2
    move-object/from16 v25, v3

    .line 1622
    .end local v3    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v9    # "index$iv$iv":I
    .restart local v25    # "$this$fastForEach$iv$iv":Ljava/util/List;
    nop

    .line 1623
    .end local v20    # "$i$f$fastForEach":I
    .end local v25    # "$this$fastForEach$iv$iv":Ljava/util/List;
    move-object v1, v0

    check-cast v1, Ljava/util/List;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 1113
    .end local v0    # "target$iv":Ljava/util/ArrayList;
    .end local v16    # "$this$fastMap$iv":Ljava/util/List;
    .end local v17    # "$i$f$fastMap":I
    nop

    .line 1612
    .end local v15    # "$i$a$-synchronized-Recomposer$performInsertValues$1$pairs$1":I
    :try_start_5
    monitor-exit v13

    .line 1112
    .end local v13    # "lock$iv":Ljava/lang/Object;
    .end local v14    # "$i$f$synchronized":I
    move-object v0, v1

    .line 1118
    .local v0, "pairs":Ljava/util/List;
    invoke-interface {v4, v0}, Landroidx/compose/runtime/ControlledComposition;->insertMovableContent(Ljava/util/List;)V

    .line 1119
    nop

    .end local v0    # "pairs":Ljava/util/List;
    .end local v12    # "$i$a$-composing-Recomposer$performInsertValues$1":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 1611
    nop

    .line 1624
    :try_start_6
    invoke-virtual {v8, v11}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 1611
    nop

    .line 1625
    .end local v8    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .end local v10    # "$i$f$enter":I
    .end local v11    # "previous$iv$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    invoke-direct {v5, v7}, Landroidx/compose/runtime/Recomposer;->applyAndCheck(Landroidx/compose/runtime/snapshots/MutableSnapshot;)V

    .line 1608
    move-object/from16 v1, p0

    move-object/from16 v0, v18

    goto/16 :goto_2

    .line 1612
    .restart local v8    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .restart local v10    # "$i$f$enter":I
    .restart local v11    # "previous$iv$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .restart local v12    # "$i$a$-composing-Recomposer$performInsertValues$1":I
    .restart local v13    # "lock$iv":Ljava/lang/Object;
    .restart local v14    # "$i$f$synchronized":I
    :catchall_0
    move-exception v0

    goto :goto_4

    .end local v22    # "$i$f$composing":I
    .local v6, "$i$f$composing":I
    :catchall_1
    move-exception v0

    move/from16 v22, v6

    .end local v6    # "$i$f$composing":I
    .restart local v22    # "$i$f$composing":I
    goto :goto_4

    .end local v19    # "refs":Ljava/util/List;
    .end local v22    # "$i$f$composing":I
    .local v3, "refs":Ljava/util/List;
    .restart local v6    # "$i$f$composing":I
    :catchall_2
    move-exception v0

    move-object/from16 v19, v3

    move/from16 v22, v6

    .end local v3    # "refs":Ljava/util/List;
    .end local v6    # "$i$f$composing":I
    .restart local v19    # "refs":Ljava/util/List;
    .restart local v22    # "$i$f$composing":I
    :goto_4
    :try_start_7
    monitor-exit v13

    .end local v2    # "tasks":Ljava/util/Map;
    .end local v4    # "composition":Landroidx/compose/runtime/ControlledComposition;
    .end local v5    # "this_$iv":Landroidx/compose/runtime/Recomposer;
    .end local v7    # "snapshot$iv":Landroidx/compose/runtime/snapshots/MutableSnapshot;
    .end local v8    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .end local v10    # "$i$f$enter":I
    .end local v11    # "previous$iv$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .end local v19    # "refs":Ljava/util/List;
    .end local v22    # "$i$f$composing":I
    .end local p1    # "references":Ljava/util/List;
    .end local p2    # "modifiedValues":Landroidx/compose/runtime/collection/IdentityArraySet;
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 1624
    .end local v12    # "$i$a$-composing-Recomposer$performInsertValues$1":I
    .end local v13    # "lock$iv":Ljava/lang/Object;
    .end local v14    # "$i$f$synchronized":I
    .restart local v2    # "tasks":Ljava/util/Map;
    .restart local v4    # "composition":Landroidx/compose/runtime/ControlledComposition;
    .restart local v5    # "this_$iv":Landroidx/compose/runtime/Recomposer;
    .restart local v7    # "snapshot$iv":Landroidx/compose/runtime/snapshots/MutableSnapshot;
    .restart local v8    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .restart local v10    # "$i$f$enter":I
    .restart local v11    # "previous$iv$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .restart local v19    # "refs":Ljava/util/List;
    .restart local v22    # "$i$f$composing":I
    .restart local p1    # "references":Ljava/util/List;
    .restart local p2    # "modifiedValues":Landroidx/compose/runtime/collection/IdentityArraySet;
    :catchall_3
    move-exception v0

    goto :goto_5

    .end local v19    # "refs":Ljava/util/List;
    .end local v22    # "$i$f$composing":I
    .restart local v3    # "refs":Ljava/util/List;
    .restart local v6    # "$i$f$composing":I
    :catchall_4
    move-exception v0

    move-object/from16 v19, v3

    move/from16 v22, v6

    .end local v3    # "refs":Ljava/util/List;
    .end local v6    # "$i$f$composing":I
    .restart local v19    # "refs":Ljava/util/List;
    .restart local v22    # "$i$f$composing":I
    :goto_5
    :try_start_8
    invoke-virtual {v8, v11}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V

    .end local v2    # "tasks":Ljava/util/Map;
    .end local v4    # "composition":Landroidx/compose/runtime/ControlledComposition;
    .end local v5    # "this_$iv":Landroidx/compose/runtime/Recomposer;
    .end local v7    # "snapshot$iv":Landroidx/compose/runtime/snapshots/MutableSnapshot;
    .end local v19    # "refs":Ljava/util/List;
    .end local v22    # "$i$f$composing":I
    .end local p1    # "references":Ljava/util/List;
    .end local p2    # "modifiedValues":Landroidx/compose/runtime/collection/IdentityArraySet;
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 1625
    .end local v8    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .end local v10    # "$i$f$enter":I
    .end local v11    # "previous$iv$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .restart local v2    # "tasks":Ljava/util/Map;
    .restart local v4    # "composition":Landroidx/compose/runtime/ControlledComposition;
    .restart local v5    # "this_$iv":Landroidx/compose/runtime/Recomposer;
    .restart local v7    # "snapshot$iv":Landroidx/compose/runtime/snapshots/MutableSnapshot;
    .restart local v19    # "refs":Ljava/util/List;
    .restart local v22    # "$i$f$composing":I
    .restart local p1    # "references":Ljava/util/List;
    .restart local p2    # "modifiedValues":Landroidx/compose/runtime/collection/IdentityArraySet;
    :catchall_5
    move-exception v0

    goto :goto_6

    .end local v19    # "refs":Ljava/util/List;
    .end local v22    # "$i$f$composing":I
    .restart local v3    # "refs":Ljava/util/List;
    .restart local v6    # "$i$f$composing":I
    :catchall_6
    move-exception v0

    move-object/from16 v19, v3

    move/from16 v22, v6

    .end local v3    # "refs":Ljava/util/List;
    .end local v6    # "$i$f$composing":I
    .restart local v19    # "refs":Ljava/util/List;
    .restart local v22    # "$i$f$composing":I
    :goto_6
    invoke-direct {v5, v7}, Landroidx/compose/runtime/Recomposer;->applyAndCheck(Landroidx/compose/runtime/snapshots/MutableSnapshot;)V

    throw v0

    .line 1121
    .end local v4    # "composition":Landroidx/compose/runtime/ControlledComposition;
    .end local v5    # "this_$iv":Landroidx/compose/runtime/Recomposer;
    .end local v7    # "snapshot$iv":Landroidx/compose/runtime/snapshots/MutableSnapshot;
    .end local v19    # "refs":Ljava/util/List;
    .end local v22    # "$i$f$composing":I
    :cond_3
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private final performRecompose(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;)Landroidx/compose/runtime/ControlledComposition;
    .locals 11
    .param p1, "composition"    # Landroidx/compose/runtime/ControlledComposition;
    .param p2, "modifiedValues"    # Landroidx/compose/runtime/collection/IdentityArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/ControlledComposition;",
            "Landroidx/compose/runtime/collection/IdentityArraySet<",
            "Ljava/lang/Object;",
            ">;)",
            "Landroidx/compose/runtime/ControlledComposition;"
        }
    .end annotation

    .line 1084
    invoke-interface {p1}, Landroidx/compose/runtime/ControlledComposition;->isComposing()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_5

    .line 1085
    invoke-interface {p1}, Landroidx/compose/runtime/ControlledComposition;->isDisposed()Z

    move-result v0

    if-nez v0, :cond_5

    .line 1086
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->compositionsRemoved:Ljava/util/Set;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-ne v0, v2, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    if-eqz v0, :cond_1

    goto :goto_4

    .line 1088
    :cond_1
    nop

    .line 1089
    move-object v0, p0

    .local v0, "this_$iv":Landroidx/compose/runtime/Recomposer;
    const/4 v4, 0x0

    .line 1573
    .local v4, "$i$f$composing":I
    sget-object v5, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    .line 1574
    invoke-direct {v0, p1}, Landroidx/compose/runtime/Recomposer;->readObserverOf(Landroidx/compose/runtime/ControlledComposition;)Lkotlin/jvm/functions/Function1;

    move-result-object v6

    invoke-direct {v0, p1, p2}, Landroidx/compose/runtime/Recomposer;->writeObserverOf(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;)Lkotlin/jvm/functions/Function1;

    move-result-object v7

    .line 1573
    invoke-virtual {v5, v6, v7}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->takeMutableSnapshot(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/MutableSnapshot;

    move-result-object v5

    .line 1576
    .local v5, "snapshot$iv":Landroidx/compose/runtime/snapshots/MutableSnapshot;
    nop

    .line 1577
    :try_start_0
    move-object v6, v5

    check-cast v6, Landroidx/compose/runtime/snapshots/Snapshot;

    .local v6, "this_$iv$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    const/4 v7, 0x0

    .line 1578
    .local v7, "$i$f$enter":I
    invoke-virtual {v6}, Landroidx/compose/runtime/snapshots/Snapshot;->makeCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 1579
    .local v8, "previous$iv$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    nop

    .line 1580
    const/4 v9, 0x0

    .line 1090
    .local v9, "$i$a$-composing-Recomposer$performRecompose$1":I
    if-eqz p2, :cond_2

    :try_start_1
    invoke-virtual {p2}, Landroidx/compose/runtime/collection/IdentityArraySet;->isNotEmpty()Z

    move-result v10

    if-ne v10, v2, :cond_2

    goto :goto_1

    .line 1582
    .end local v9    # "$i$a$-composing-Recomposer$performRecompose$1":I
    :catchall_0
    move-exception v1

    goto :goto_3

    .line 1090
    .restart local v9    # "$i$a$-composing-Recomposer$performRecompose$1":I
    :cond_2
    move v2, v3

    :goto_1
    if-eqz v2, :cond_3

    .line 1093
    new-instance v2, Landroidx/compose/runtime/Recomposer$performRecompose$1$1;

    invoke-direct {v2, p2, p1}, Landroidx/compose/runtime/Recomposer$performRecompose$1$1;-><init>(Landroidx/compose/runtime/collection/IdentityArraySet;Landroidx/compose/runtime/ControlledComposition;)V

    check-cast v2, Lkotlin/jvm/functions/Function0;

    invoke-interface {p1, v2}, Landroidx/compose/runtime/ControlledComposition;->prepareCompose(Lkotlin/jvm/functions/Function0;)V

    .line 1097
    :cond_3
    invoke-interface {p1}, Landroidx/compose/runtime/ControlledComposition;->recompose()Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1580
    .end local v9    # "$i$a$-composing-Recomposer$performRecompose$1":I
    nop

    .line 1582
    :try_start_2
    invoke-virtual {v6, v8}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1580
    nop

    .line 1583
    .end local v6    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .end local v7    # "$i$f$enter":I
    .end local v8    # "previous$iv$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    invoke-direct {v0, v5}, Landroidx/compose/runtime/Recomposer;->applyAndCheck(Landroidx/compose/runtime/snapshots/MutableSnapshot;)V

    .line 1577
    nop

    .line 1089
    .end local v0    # "this_$iv":Landroidx/compose/runtime/Recomposer;
    .end local v4    # "$i$f$composing":I
    .end local v5    # "snapshot$iv":Landroidx/compose/runtime/snapshots/MutableSnapshot;
    if-eqz v2, :cond_4

    .line 1099
    move-object v1, p1

    goto :goto_2

    :cond_4
    nop

    .line 1088
    :goto_2
    return-object v1

    .line 1582
    .restart local v0    # "this_$iv":Landroidx/compose/runtime/Recomposer;
    .restart local v4    # "$i$f$composing":I
    .restart local v5    # "snapshot$iv":Landroidx/compose/runtime/snapshots/MutableSnapshot;
    .restart local v6    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .restart local v7    # "$i$f$enter":I
    .restart local v8    # "previous$iv$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    :goto_3
    :try_start_3
    invoke-virtual {v6, v8}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V

    .end local v0    # "this_$iv":Landroidx/compose/runtime/Recomposer;
    .end local v4    # "$i$f$composing":I
    .end local v5    # "snapshot$iv":Landroidx/compose/runtime/snapshots/MutableSnapshot;
    .end local p1    # "composition":Landroidx/compose/runtime/ControlledComposition;
    .end local p2    # "modifiedValues":Landroidx/compose/runtime/collection/IdentityArraySet;
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 1583
    .end local v6    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .end local v7    # "$i$f$enter":I
    .end local v8    # "previous$iv$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .restart local v0    # "this_$iv":Landroidx/compose/runtime/Recomposer;
    .restart local v4    # "$i$f$composing":I
    .restart local v5    # "snapshot$iv":Landroidx/compose/runtime/snapshots/MutableSnapshot;
    .restart local p1    # "composition":Landroidx/compose/runtime/ControlledComposition;
    .restart local p2    # "modifiedValues":Landroidx/compose/runtime/collection/IdentityArraySet;
    :catchall_1
    move-exception v1

    invoke-direct {v0, v5}, Landroidx/compose/runtime/Recomposer;->applyAndCheck(Landroidx/compose/runtime/snapshots/MutableSnapshot;)V

    throw v1

    .line 1086
    .end local v0    # "this_$iv":Landroidx/compose/runtime/Recomposer;
    .end local v4    # "$i$f$composing":I
    .end local v5    # "snapshot$iv":Landroidx/compose/runtime/snapshots/MutableSnapshot;
    :cond_5
    :goto_4
    return-object v1
.end method

.method private final processCompositionError(Ljava/lang/Exception;Landroidx/compose/runtime/ControlledComposition;Z)V
    .locals 6
    .param p1, "e"    # Ljava/lang/Exception;
    .param p2, "failedInitialComposition"    # Landroidx/compose/runtime/ControlledComposition;
    .param p3, "recoverable"    # Z

    .line 688
    sget-object v0, Landroidx/compose/runtime/Recomposer;->_hotReloadEnabled:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "_hotReloadEnabled.get()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    instance-of v0, p1, Landroidx/compose/runtime/ComposeRuntimeError;

    if-nez v0, :cond_3

    .line 689
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 1531
    .local v1, "$i$f$synchronized":I
    monitor-enter v0

    const/4 v2, 0x0

    .line 690
    .local v2, "$i$a$-synchronized-Recomposer$processCompositionError$1":I
    :try_start_0
    const-string v3, "Error was captured in composition while live edit was enabled."

    move-object v4, p1

    check-cast v4, Ljava/lang/Throwable;

    invoke-static {v3, v4}, Landroidx/compose/runtime/ActualAndroid_androidKt;->logError(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 692
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->compositionsAwaitingApply:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 693
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->compositionInvalidations:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 694
    new-instance v3, Landroidx/compose/runtime/collection/IdentityArraySet;

    invoke-direct {v3}, Landroidx/compose/runtime/collection/IdentityArraySet;-><init>()V

    iput-object v3, p0, Landroidx/compose/runtime/Recomposer;->snapshotInvalidations:Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 696
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->compositionValuesAwaitingInsert:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 697
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->compositionValuesRemoved:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->clear()V

    .line 698
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->compositionValueStatesAvailable:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->clear()V

    .line 700
    new-instance v3, Landroidx/compose/runtime/Recomposer$RecomposerErrorState;

    .line 701
    nop

    .line 702
    nop

    .line 700
    invoke-direct {v3, p3, p1}, Landroidx/compose/runtime/Recomposer$RecomposerErrorState;-><init>(ZLjava/lang/Exception;)V

    iput-object v3, p0, Landroidx/compose/runtime/Recomposer;->errorState:Landroidx/compose/runtime/Recomposer$RecomposerErrorState;

    .line 705
    if-eqz p2, :cond_2

    .line 706
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->failedCompositions:Ljava/util/List;

    if-nez v3, :cond_0

    .line 707
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v3, Ljava/util/List;

    move-object v4, v3

    .local v4, "it":Ljava/util/List;
    const/4 v5, 0x0

    .line 708
    .local v5, "$i$a$-also-Recomposer$processCompositionError$1$failedCompositions$1":I
    iput-object v4, p0, Landroidx/compose/runtime/Recomposer;->failedCompositions:Ljava/util/List;

    .line 709
    nop

    .line 707
    .end local v4    # "it":Ljava/util/List;
    .end local v5    # "$i$a$-also-Recomposer$processCompositionError$1$failedCompositions$1":I
    nop

    .line 706
    :cond_0
    nop

    .line 711
    .local v3, "failedCompositions":Ljava/util/List;
    invoke-interface {v3, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 712
    move-object v4, v3

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 714
    :cond_1
    iget-object v4, p0, Landroidx/compose/runtime/Recomposer;->knownCompositions:Ljava/util/List;

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4, p2}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 717
    .end local v3    # "failedCompositions":Ljava/util/List;
    :cond_2
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->deriveStateLocked()Lkotlinx/coroutines/CancellableContinuation;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1531
    .end local v2    # "$i$a$-synchronized-Recomposer$processCompositionError$1":I
    monitor-exit v0

    .line 722
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    return-void

    .line 1531
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :catchall_0
    move-exception v2

    monitor-exit v0

    throw v2

    .line 720
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    :cond_3
    throw p1
.end method

.method static synthetic processCompositionError$default(Landroidx/compose/runtime/Recomposer;Ljava/lang/Exception;Landroidx/compose/runtime/ControlledComposition;ZILjava/lang/Object;)V
    .locals 0

    .line 683
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 685
    const/4 p2, 0x0

    .line 683
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 686
    const/4 p3, 0x0

    .line 683
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/runtime/Recomposer;->processCompositionError(Ljava/lang/Exception;Landroidx/compose/runtime/ControlledComposition;Z)V

    return-void
.end method

.method private final readObserverOf(Landroidx/compose/runtime/ControlledComposition;)Lkotlin/jvm/functions/Function1;
    .locals 1
    .param p1, "composition"    # Landroidx/compose/runtime/ControlledComposition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/ControlledComposition;",
            ")",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Object;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1144
    new-instance v0, Landroidx/compose/runtime/Recomposer$readObserverOf$1;

    invoke-direct {v0, p1}, Landroidx/compose/runtime/Recomposer$readObserverOf$1;-><init>(Landroidx/compose/runtime/ControlledComposition;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method private final recompositionRunner(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p1, "block"    # Lkotlin/jvm/functions/Function3;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Lkotlinx/coroutines/CoroutineScope;",
            "-",
            "Landroidx/compose/runtime/MonotonicFrameClock;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 918
    invoke-interface {p2}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/runtime/MonotonicFrameClockKt;->getMonotonicFrameClock(Lkotlin/coroutines/CoroutineContext;)Landroidx/compose/runtime/MonotonicFrameClock;

    move-result-object v0

    .line 919
    .local v0, "parentFrameClock":Landroidx/compose/runtime/MonotonicFrameClock;
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->broadcastFrameClock:Landroidx/compose/runtime/BroadcastFrameClock;

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    new-instance v2, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, v0, v3}, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;-><init>(Landroidx/compose/runtime/Recomposer;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/MonotonicFrameClock;Lkotlin/coroutines/Continuation;)V

    check-cast v2, Lkotlin/jvm/functions/Function2;

    invoke-static {v1, v2, p2}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_0

    return-object v1

    :cond_0
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 959
    return-object v1
.end method

.method private final recordComposerModifications(Lkotlin/jvm/functions/Function1;)V
    .locals 10
    .param p1, "onEachInvalidComposition"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/runtime/ControlledComposition;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 467
    .local v0, "$i$f$recordComposerModifications":I
    invoke-static {p0}, Landroidx/compose/runtime/Recomposer;->access$getSnapshotInvalidations$p(Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/collection/IdentityArraySet;

    move-result-object v1

    .line 468
    .local v1, "changes":Landroidx/compose/runtime/collection/IdentityArraySet;
    invoke-virtual {v1}, Landroidx/compose/runtime/collection/IdentityArraySet;->isNotEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 469
    invoke-static {p0}, Landroidx/compose/runtime/Recomposer;->access$getKnownCompositions$p(Landroidx/compose/runtime/Recomposer;)Ljava/util/List;

    move-result-object v2

    .local v2, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 1518
    .local v3, "$i$f$fastForEach":I
    nop

    .line 1519
    const/4 v4, 0x0

    .local v4, "index$iv":I
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    :goto_0
    if-ge v4, v5, :cond_0

    .line 1520
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 1521
    .local v6, "item$iv":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Landroidx/compose/runtime/ControlledComposition;

    .local v7, "composition":Landroidx/compose/runtime/ControlledComposition;
    const/4 v8, 0x0

    .line 470
    .local v8, "$i$a$-fastForEach-Recomposer$recordComposerModifications$4":I
    move-object v9, v1

    check-cast v9, Ljava/util/Set;

    invoke-interface {v7, v9}, Landroidx/compose/runtime/ControlledComposition;->recordModificationsOf(Ljava/util/Set;)V

    .line 471
    nop

    .line 1521
    .end local v7    # "composition":Landroidx/compose/runtime/ControlledComposition;
    .end local v8    # "$i$a$-fastForEach-Recomposer$recordComposerModifications$4":I
    nop

    .line 1519
    .end local v6    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 1523
    .end local v4    # "index$iv":I
    :cond_0
    nop

    .line 472
    .end local v2    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastForEach":I
    new-instance v2, Landroidx/compose/runtime/collection/IdentityArraySet;

    invoke-direct {v2}, Landroidx/compose/runtime/collection/IdentityArraySet;-><init>()V

    invoke-static {p0, v2}, Landroidx/compose/runtime/Recomposer;->access$setSnapshotInvalidations$p(Landroidx/compose/runtime/Recomposer;Landroidx/compose/runtime/collection/IdentityArraySet;)V

    .line 474
    :cond_1
    invoke-static {p0}, Landroidx/compose/runtime/Recomposer;->access$getCompositionInvalidations$p(Landroidx/compose/runtime/Recomposer;)Ljava/util/List;

    move-result-object v2

    .restart local v2    # "$this$fastForEach$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 1524
    .restart local v3    # "$i$f$fastForEach":I
    nop

    .line 1525
    const/4 v4, 0x0

    .restart local v4    # "index$iv":I
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    :goto_1
    if-ge v4, v5, :cond_2

    .line 1526
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 1527
    .restart local v6    # "item$iv":Ljava/lang/Object;
    invoke-interface {p1, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1525
    .end local v6    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 1529
    .end local v4    # "index$iv":I
    :cond_2
    nop

    .line 475
    .end local v2    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastForEach":I
    invoke-static {p0}, Landroidx/compose/runtime/Recomposer;->access$getCompositionInvalidations$p(Landroidx/compose/runtime/Recomposer;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 476
    invoke-static {p0}, Landroidx/compose/runtime/Recomposer;->access$deriveStateLocked(Landroidx/compose/runtime/Recomposer;)Lkotlinx/coroutines/CancellableContinuation;

    move-result-object v2

    if-nez v2, :cond_3

    .line 479
    return-void

    .line 476
    :cond_3
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 477
    const-string v3, "called outside of runRecomposeAndApplyChanges"

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method private final recordComposerModifications()Z
    .locals 14

    .line 426
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 1507
    .local v1, "$i$f$synchronized":I
    monitor-enter v0

    const/4 v2, 0x0

    .line 427
    .local v2, "$i$a$-synchronized-Recomposer$recordComposerModifications$changes$1":I
    :try_start_0
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->snapshotInvalidations:Landroidx/compose/runtime/collection/IdentityArraySet;

    invoke-virtual {v3}, Landroidx/compose/runtime/collection/IdentityArraySet;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->getHasFrameWorkLocked()Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    .end local v2    # "$i$a$-synchronized-Recomposer$recordComposerModifications$changes$1":I
    monitor-exit v0

    return v3

    .line 428
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    .restart local v2    # "$i$a$-synchronized-Recomposer$recordComposerModifications$changes$1":I
    :cond_0
    :try_start_1
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->snapshotInvalidations:Landroidx/compose/runtime/collection/IdentityArraySet;

    move-object v4, v3

    .line 1508
    .local v4, "it":Landroidx/compose/runtime/collection/IdentityArraySet;
    const/4 v5, 0x0

    .line 428
    .local v5, "$i$a$-also-Recomposer$recordComposerModifications$changes$1$1":I
    new-instance v6, Landroidx/compose/runtime/collection/IdentityArraySet;

    invoke-direct {v6}, Landroidx/compose/runtime/collection/IdentityArraySet;-><init>()V

    iput-object v6, p0, Landroidx/compose/runtime/Recomposer;->snapshotInvalidations:Landroidx/compose/runtime/collection/IdentityArraySet;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 1507
    .end local v2    # "$i$a$-synchronized-Recomposer$recordComposerModifications$changes$1":I
    .end local v4    # "it":Landroidx/compose/runtime/collection/IdentityArraySet;
    .end local v5    # "$i$a$-also-Recomposer$recordComposerModifications$changes$1$1":I
    monitor-exit v0

    .line 426
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    move-object v0, v3

    .line 430
    .local v0, "changes":Landroidx/compose/runtime/collection/IdentityArraySet;
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .local v1, "lock$iv":Ljava/lang/Object;
    const/4 v2, 0x0

    .line 1509
    .local v2, "$i$f$synchronized":I
    monitor-enter v1

    const/4 v3, 0x0

    .line 431
    .local v3, "$i$a$-synchronized-Recomposer$recordComposerModifications$compositions$1":I
    :try_start_2
    iget-object v4, p0, Landroidx/compose/runtime/Recomposer;->knownCompositions:Ljava/util/List;

    check-cast v4, Ljava/util/Collection;

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 1509
    .end local v3    # "$i$a$-synchronized-Recomposer$recordComposerModifications$compositions$1":I
    monitor-exit v1

    .line 430
    .end local v1    # "lock$iv":Ljava/lang/Object;
    .end local v2    # "$i$f$synchronized":I
    move-object v1, v4

    .line 433
    .local v1, "compositions":Ljava/util/List;
    const/4 v2, 0x0

    .line 434
    .local v2, "complete":Z
    nop

    .line 435
    :try_start_3
    move-object v3, p0

    check-cast v3, Landroidx/compose/runtime/Recomposer;

    .local v3, "$this$recordComposerModifications_u24lambda_u249":Landroidx/compose/runtime/Recomposer;
    const/4 v4, 0x0

    .line 436
    .local v4, "$i$a$-run-Recomposer$recordComposerModifications$1":I
    move-object v5, v1

    .local v5, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 1510
    .local v6, "$i$f$fastForEach":I
    nop

    .line 1511
    const/4 v7, 0x0

    .local v7, "index$iv":I
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    :goto_0
    if-ge v7, v8, :cond_1

    .line 1512
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 1513
    .local v9, "item$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Landroidx/compose/runtime/ControlledComposition;

    .local v10, "composition":Landroidx/compose/runtime/ControlledComposition;
    const/4 v11, 0x0

    .line 437
    .local v11, "$i$a$-fastForEach-Recomposer$recordComposerModifications$1$1":I
    move-object v12, v0

    check-cast v12, Ljava/util/Set;

    invoke-interface {v10, v12}, Landroidx/compose/runtime/ControlledComposition;->recordModificationsOf(Ljava/util/Set;)V

    .line 441
    iget-object v12, v3, Landroidx/compose/runtime/Recomposer;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v12}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/compose/runtime/Recomposer$State;

    sget-object v13, Landroidx/compose/runtime/Recomposer$State;->ShuttingDown:Landroidx/compose/runtime/Recomposer$State;

    check-cast v13, Ljava/lang/Enum;

    invoke-virtual {v12, v13}, Landroidx/compose/runtime/Recomposer$State;->compareTo(Ljava/lang/Enum;)I

    move-result v12

    if-lez v12, :cond_2

    .line 442
    nop

    .line 1513
    .end local v10    # "composition":Landroidx/compose/runtime/ControlledComposition;
    .end local v11    # "$i$a$-fastForEach-Recomposer$recordComposerModifications$1$1":I
    nop

    .line 1511
    .end local v9    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 1515
    .end local v7    # "index$iv":I
    :cond_1
    nop

    .line 443
    .end local v5    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastForEach":I
    nop

    .line 435
    .end local v3    # "$this$recordComposerModifications_u24lambda_u249":Landroidx/compose/runtime/Recomposer;
    .end local v4    # "$i$a$-run-Recomposer$recordComposerModifications$1":I
    :cond_2
    nop

    .line 444
    new-instance v3, Landroidx/compose/runtime/collection/IdentityArraySet;

    invoke-direct {v3}, Landroidx/compose/runtime/collection/IdentityArraySet;-><init>()V

    iput-object v3, p0, Landroidx/compose/runtime/Recomposer;->snapshotInvalidations:Landroidx/compose/runtime/collection/IdentityArraySet;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 445
    const/4 v2, 0x1

    .line 447
    nop

    .line 455
    nop

    .line 456
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .local v3, "lock$iv":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 1517
    .local v4, "$i$f$synchronized":I
    monitor-enter v3

    const/4 v5, 0x0

    .line 457
    .local v5, "$i$a$-synchronized-Recomposer$recordComposerModifications$3":I
    :try_start_4
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->deriveStateLocked()Lkotlinx/coroutines/CancellableContinuation;

    move-result-object v6

    if-nez v6, :cond_3

    .line 460
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->getHasFrameWorkLocked()Z

    move-result v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 1517
    .end local v5    # "$i$a$-synchronized-Recomposer$recordComposerModifications$3":I
    monitor-exit v3

    .line 456
    .end local v3    # "lock$iv":Ljava/lang/Object;
    .end local v4    # "$i$f$synchronized":I
    return v6

    .line 457
    .restart local v3    # "lock$iv":Ljava/lang/Object;
    .restart local v4    # "$i$f$synchronized":I
    .restart local v5    # "$i$a$-synchronized-Recomposer$recordComposerModifications$3":I
    :cond_3
    :try_start_5
    new-instance v6, Ljava/lang/IllegalStateException;

    .line 458
    const-string v7, "called outside of runRecomposeAndApplyChanges"

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .end local v0    # "changes":Landroidx/compose/runtime/collection/IdentityArraySet;
    .end local v1    # "compositions":Ljava/util/List;
    .end local v2    # "complete":Z
    .end local v3    # "lock$iv":Ljava/lang/Object;
    .end local v4    # "$i$f$synchronized":I
    throw v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 1517
    .end local v5    # "$i$a$-synchronized-Recomposer$recordComposerModifications$3":I
    .restart local v0    # "changes":Landroidx/compose/runtime/collection/IdentityArraySet;
    .restart local v1    # "compositions":Ljava/util/List;
    .restart local v2    # "complete":Z
    .restart local v3    # "lock$iv":Ljava/lang/Object;
    .restart local v4    # "$i$f$synchronized":I
    :catchall_0
    move-exception v5

    monitor-exit v3

    throw v5

    .line 447
    .end local v3    # "lock$iv":Ljava/lang/Object;
    .end local v4    # "$i$f$synchronized":I
    :catchall_1
    move-exception v3

    .line 451
    iget-object v4, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .local v4, "lock$iv":Ljava/lang/Object;
    const/4 v5, 0x0

    .line 1516
    .local v5, "$i$f$synchronized":I
    monitor-enter v4

    const/4 v6, 0x0

    .line 452
    .local v6, "$i$a$-synchronized-Recomposer$recordComposerModifications$2":I
    :try_start_6
    iget-object v7, p0, Landroidx/compose/runtime/Recomposer;->snapshotInvalidations:Landroidx/compose/runtime/collection/IdentityArraySet;

    move-object v8, v0

    check-cast v8, Ljava/util/Collection;

    invoke-virtual {v7, v8}, Landroidx/compose/runtime/collection/IdentityArraySet;->addAll(Ljava/util/Collection;)V

    .line 453
    nop

    .end local v6    # "$i$a$-synchronized-Recomposer$recordComposerModifications$2":I
    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 1516
    monitor-exit v4

    .end local v4    # "lock$iv":Ljava/lang/Object;
    .end local v5    # "$i$f$synchronized":I
    throw v3

    .restart local v4    # "lock$iv":Ljava/lang/Object;
    .restart local v5    # "$i$f$synchronized":I
    :catchall_2
    move-exception v3

    monitor-exit v4

    throw v3

    .line 1509
    .end local v4    # "lock$iv":Ljava/lang/Object;
    .end local v5    # "$i$f$synchronized":I
    .local v1, "lock$iv":Ljava/lang/Object;
    .local v2, "$i$f$synchronized":I
    :catchall_3
    move-exception v3

    monitor-exit v1

    throw v3

    .line 1507
    .end local v2    # "$i$f$synchronized":I
    .local v0, "lock$iv":Ljava/lang/Object;
    .local v1, "$i$f$synchronized":I
    :catchall_4
    move-exception v2

    monitor-exit v0

    throw v2
.end method

.method private final registerRunnerJob(Lkotlinx/coroutines/Job;)V
    .locals 5
    .param p1, "callingJob"    # Lkotlinx/coroutines/Job;

    .line 482
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 1530
    .local v1, "$i$f$synchronized":I
    monitor-enter v0

    const/4 v2, 0x0

    .line 483
    .local v2, "$i$a$-synchronized-Recomposer$registerRunnerJob$1":I
    :try_start_0
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->closeCause:Ljava/lang/Throwable;

    if-nez v3, :cond_2

    .line 484
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/runtime/Recomposer$State;

    sget-object v4, Landroidx/compose/runtime/Recomposer$State;->ShuttingDown:Landroidx/compose/runtime/Recomposer$State;

    check-cast v4, Ljava/lang/Enum;

    invoke-virtual {v3, v4}, Landroidx/compose/runtime/Recomposer$State;->compareTo(Ljava/lang/Enum;)I

    move-result v3

    if-lez v3, :cond_1

    .line 485
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->runnerJob:Lkotlinx/coroutines/Job;

    if-nez v3, :cond_0

    .line 486
    iput-object p1, p0, Landroidx/compose/runtime/Recomposer;->runnerJob:Lkotlinx/coroutines/Job;

    .line 487
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->deriveStateLocked()Lkotlinx/coroutines/CancellableContinuation;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1530
    .end local v2    # "$i$a$-synchronized-Recomposer$registerRunnerJob$1":I
    monitor-exit v0

    .line 489
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    return-void

    .line 485
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    .restart local v2    # "$i$a$-synchronized-Recomposer$registerRunnerJob$1":I
    :cond_0
    :try_start_1
    new-instance v3, Ljava/lang/IllegalStateException;

    const-string v4, "Recomposer already running"

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    .end local p1    # "callingJob":Lkotlinx/coroutines/Job;
    throw v3

    .line 484
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    .restart local p1    # "callingJob":Lkotlinx/coroutines/Job;
    :cond_1
    new-instance v3, Ljava/lang/IllegalStateException;

    const-string v4, "Recomposer shut down"

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    .end local p1    # "callingJob":Lkotlinx/coroutines/Job;
    throw v3

    .line 1508
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    .local v3, "it":Ljava/lang/Throwable;
    .restart local p1    # "callingJob":Lkotlinx/coroutines/Job;
    :cond_2
    const/4 v4, 0x0

    .line 483
    .local v4, "$i$a$-let-Recomposer$registerRunnerJob$1$1":I
    nop

    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    .end local p1    # "callingJob":Lkotlinx/coroutines/Job;
    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1530
    .end local v2    # "$i$a$-synchronized-Recomposer$registerRunnerJob$1":I
    .end local v3    # "it":Ljava/lang/Throwable;
    .end local v4    # "$i$a$-let-Recomposer$registerRunnerJob$1$1":I
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    .restart local p1    # "callingJob":Lkotlinx/coroutines/Job;
    :catchall_0
    move-exception v2

    monitor-exit v0

    throw v2
.end method

.method private final resetErrorState()Landroidx/compose/runtime/Recomposer$RecomposerErrorState;
    .locals 5

    .line 725
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 1532
    .local v1, "$i$f$synchronized":I
    monitor-enter v0

    const/4 v2, 0x0

    .line 726
    .local v2, "$i$a$-synchronized-Recomposer$resetErrorState$errorState$1":I
    :try_start_0
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->errorState:Landroidx/compose/runtime/Recomposer$RecomposerErrorState;

    .line 727
    .local v3, "error":Landroidx/compose/runtime/Recomposer$RecomposerErrorState;
    if-eqz v3, :cond_0

    .line 728
    const/4 v4, 0x0

    iput-object v4, p0, Landroidx/compose/runtime/Recomposer;->errorState:Landroidx/compose/runtime/Recomposer$RecomposerErrorState;

    .line 729
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->deriveStateLocked()Lkotlinx/coroutines/CancellableContinuation;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 731
    :cond_0
    nop

    .line 1532
    .end local v2    # "$i$a$-synchronized-Recomposer$resetErrorState$errorState$1":I
    .end local v3    # "error":Landroidx/compose/runtime/Recomposer$RecomposerErrorState;
    monitor-exit v0

    .line 725
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    move-object v0, v3

    .line 733
    .local v0, "errorState":Landroidx/compose/runtime/Recomposer$RecomposerErrorState;
    return-object v0

    .line 1532
    .local v0, "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :catchall_0
    move-exception v2

    monitor-exit v0

    throw v2
.end method

.method private final retryFailedCompositions()V
    .locals 9

    .line 737
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 1533
    .local v1, "$i$f$synchronized":I
    monitor-enter v0

    const/4 v2, 0x0

    .line 738
    .local v2, "$i$a$-synchronized-Recomposer$retryFailedCompositions$compositionsToRetry$1":I
    :try_start_0
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->failedCompositions:Ljava/util/List;

    move-object v4, v3

    .line 1508
    .local v4, "it":Ljava/util/List;
    const/4 v5, 0x0

    .line 738
    .local v5, "$i$a$-also-Recomposer$retryFailedCompositions$compositionsToRetry$1$1":I
    const/4 v6, 0x0

    iput-object v6, p0, Landroidx/compose/runtime/Recomposer;->failedCompositions:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 1533
    .end local v2    # "$i$a$-synchronized-Recomposer$retryFailedCompositions$compositionsToRetry$1":I
    .end local v4    # "it":Ljava/util/List;
    .end local v5    # "$i$a$-also-Recomposer$retryFailedCompositions$compositionsToRetry$1$1":I
    monitor-exit v0

    .line 737
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    if-nez v3, :cond_0

    .line 739
    return-void

    .line 737
    :cond_0
    move-object v0, v3

    .line 740
    .local v0, "compositionsToRetry":Ljava/util/List;
    nop

    .line 741
    :cond_1
    :try_start_1
    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_2

    .line 742
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->removeLast(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/runtime/ControlledComposition;

    .line 743
    .local v1, "composition":Landroidx/compose/runtime/ControlledComposition;
    instance-of v2, v1, Landroidx/compose/runtime/CompositionImpl;

    if-eqz v2, :cond_1

    .line 745
    invoke-interface {v1}, Landroidx/compose/runtime/ControlledComposition;->invalidateAll()V

    .line 746
    move-object v2, v1

    check-cast v2, Landroidx/compose/runtime/CompositionImpl;

    invoke-virtual {v2}, Landroidx/compose/runtime/CompositionImpl;->getComposable()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-interface {v1, v2}, Landroidx/compose/runtime/ControlledComposition;->setContent(Lkotlin/jvm/functions/Function2;)V

    .line 748
    iget-object v2, p0, Landroidx/compose/runtime/Recomposer;->errorState:Landroidx/compose/runtime/Recomposer$RecomposerErrorState;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v2, :cond_1

    .line 751
    .end local v1    # "composition":Landroidx/compose/runtime/ControlledComposition;
    :cond_2
    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_5

    .line 754
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .local v1, "lock$iv":Ljava/lang/Object;
    const/4 v2, 0x0

    .line 1534
    .local v2, "$i$f$synchronized":I
    monitor-enter v1

    const/4 v3, 0x0

    .line 755
    .local v3, "$i$a$-synchronized-Recomposer$retryFailedCompositions$1":I
    nop

    .line 756
    :try_start_2
    iget-object v4, p0, Landroidx/compose/runtime/Recomposer;->failedCompositions:Ljava/util/List;

    if-eqz v4, :cond_3

    .line 1508
    move-object v5, v4

    .local v5, "it":Ljava/util/List;
    const/4 v6, 0x0

    .line 756
    .local v6, "$i$a$-also-Recomposer$retryFailedCompositions$1$1":I
    move-object v7, v0

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v5, v7}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .end local v5    # "it":Ljava/util/List;
    .end local v6    # "$i$a$-also-Recomposer$retryFailedCompositions$1$1":I
    if-nez v4, :cond_4

    .line 757
    :cond_3
    move-object v4, v0

    .line 755
    :cond_4
    iput-object v4, p0, Landroidx/compose/runtime/Recomposer;->failedCompositions:Ljava/util/List;

    .line 758
    nop

    .end local v3    # "$i$a$-synchronized-Recomposer$retryFailedCompositions$1":I
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1534
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3

    .line 760
    .end local v1    # "lock$iv":Ljava/lang/Object;
    .end local v2    # "$i$f$synchronized":I
    :cond_5
    :goto_0
    nop

    .line 761
    return-void

    .line 751
    :catchall_1
    move-exception v1

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_8

    .line 754
    iget-object v2, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .local v2, "lock$iv":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 1534
    .local v3, "$i$f$synchronized":I
    monitor-enter v2

    const/4 v4, 0x0

    .line 755
    .local v4, "$i$a$-synchronized-Recomposer$retryFailedCompositions$1":I
    nop

    .line 756
    :try_start_3
    iget-object v5, p0, Landroidx/compose/runtime/Recomposer;->failedCompositions:Ljava/util/List;

    if-eqz v5, :cond_6

    .line 1508
    move-object v6, v5

    .local v6, "it":Ljava/util/List;
    const/4 v7, 0x0

    .line 756
    .local v7, "$i$a$-also-Recomposer$retryFailedCompositions$1$1":I
    move-object v8, v0

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v6, v8}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .end local v6    # "it":Ljava/util/List;
    .end local v7    # "$i$a$-also-Recomposer$retryFailedCompositions$1$1":I
    if-nez v5, :cond_7

    .line 757
    :cond_6
    move-object v5, v0

    .line 755
    :cond_7
    iput-object v5, p0, Landroidx/compose/runtime/Recomposer;->failedCompositions:Ljava/util/List;

    .line 758
    nop

    .end local v4    # "$i$a$-synchronized-Recomposer$retryFailedCompositions$1":I
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 1534
    monitor-exit v2

    goto :goto_1

    :catchall_2
    move-exception v1

    monitor-exit v2

    throw v1

    .end local v2    # "lock$iv":Ljava/lang/Object;
    .end local v3    # "$i$f$synchronized":I
    :cond_8
    :goto_1
    throw v1

    .line 1533
    .local v0, "lock$iv":Ljava/lang/Object;
    .local v1, "$i$f$synchronized":I
    :catchall_3
    move-exception v2

    monitor-exit v0

    throw v2
.end method

.method private final runFrameLoop(Landroidx/compose/runtime/MonotonicFrameClock;Landroidx/compose/runtime/ProduceFrameSignal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MonotonicFrameClock;",
            "Landroidx/compose/runtime/ProduceFrameSignal;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;

    iget v1, v0, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;

    invoke-direct {v0, p0, p3}, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;-><init>(Landroidx/compose/runtime/Recomposer;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object p3, v0

    .local p3, "$continuation":Lkotlin/coroutines/Continuation;
    iget-object v0, p3, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->result:Ljava/lang/Object;

    .local v0, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 815
    iget v2, p3, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->label:I

    packed-switch v2, :pswitch_data_0

    .end local v0    # "$result":Ljava/lang/Object;
    .end local p3    # "$continuation":Lkotlin/coroutines/Continuation;
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .restart local v0    # "$result":Ljava/lang/Object;
    .restart local p3    # "$continuation":Lkotlin/coroutines/Continuation;
    :pswitch_0
    iget-object p1, p3, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$4:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    .local p1, "toApply":Ljava/util/List;
    iget-object p2, p3, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$3:Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    .local p2, "toRecompose":Ljava/util/List;
    iget-object v2, p3, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$2:Ljava/lang/Object;

    check-cast v2, Landroidx/compose/runtime/ProduceFrameSignal;

    .local v2, "frameSignal":Landroidx/compose/runtime/ProduceFrameSignal;
    iget-object v3, p3, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$1:Ljava/lang/Object;

    check-cast v3, Landroidx/compose/runtime/MonotonicFrameClock;

    .local v3, "parentFrameClock":Landroidx/compose/runtime/MonotonicFrameClock;
    iget-object v4, p3, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$0:Ljava/lang/Object;

    check-cast v4, Landroidx/compose/runtime/Recomposer;

    .local v4, "this":Landroidx/compose/runtime/Recomposer;
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v7, v4

    move-object v4, p1

    move-object p1, v3

    move-object v3, p2

    move-object p2, v2

    move-object v2, v7

    goto/16 :goto_3

    .end local v2    # "frameSignal":Landroidx/compose/runtime/ProduceFrameSignal;
    .end local v3    # "parentFrameClock":Landroidx/compose/runtime/MonotonicFrameClock;
    .end local v4    # "this":Landroidx/compose/runtime/Recomposer;
    .end local p1    # "toApply":Ljava/util/List;
    .end local p2    # "toRecompose":Ljava/util/List;
    :pswitch_1
    iget-object p1, p3, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$4:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    .restart local p1    # "toApply":Ljava/util/List;
    iget-object p2, p3, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$3:Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    .restart local p2    # "toRecompose":Ljava/util/List;
    iget-object v2, p3, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$2:Ljava/lang/Object;

    check-cast v2, Landroidx/compose/runtime/ProduceFrameSignal;

    .restart local v2    # "frameSignal":Landroidx/compose/runtime/ProduceFrameSignal;
    iget-object v3, p3, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$1:Ljava/lang/Object;

    check-cast v3, Landroidx/compose/runtime/MonotonicFrameClock;

    .restart local v3    # "parentFrameClock":Landroidx/compose/runtime/MonotonicFrameClock;
    iget-object v4, p3, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$0:Ljava/lang/Object;

    check-cast v4, Landroidx/compose/runtime/Recomposer;

    .restart local v4    # "this":Landroidx/compose/runtime/Recomposer;
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    .end local v2    # "frameSignal":Landroidx/compose/runtime/ProduceFrameSignal;
    .end local v3    # "parentFrameClock":Landroidx/compose/runtime/MonotonicFrameClock;
    .end local v4    # "this":Landroidx/compose/runtime/Recomposer;
    .end local p1    # "toApply":Ljava/util/List;
    .end local p2    # "toRecompose":Ljava/util/List;
    :pswitch_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v2, p0

    .line 819
    .local v2, "this":Landroidx/compose/runtime/Recomposer;
    .local p1, "parentFrameClock":Landroidx/compose/runtime/MonotonicFrameClock;
    .local p2, "frameSignal":Landroidx/compose/runtime/ProduceFrameSignal;
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v3, Ljava/util/List;

    .line 820
    .local v3, "toRecompose":Ljava/util/List;
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/List;

    .line 821
    .local v4, "toApply":Ljava/util/List;
    :goto_1
    nop

    .line 822
    iget-object v5, v2, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    iput-object v2, p3, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$0:Ljava/lang/Object;

    iput-object p1, p3, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$1:Ljava/lang/Object;

    iput-object p2, p3, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$2:Ljava/lang/Object;

    iput-object v3, p3, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$3:Ljava/lang/Object;

    iput-object v4, p3, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$4:Ljava/lang/Object;

    const/4 v6, 0x1

    iput v6, p3, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->label:I

    invoke-virtual {p2, v5, p3}, Landroidx/compose/runtime/ProduceFrameSignal;->awaitFrameRequest(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_1

    .line 815
    return-object v1

    .line 822
    :cond_1
    move-object v7, v3

    move-object v3, p1

    move-object p1, v4

    move-object v4, v2

    move-object v2, p2

    move-object p2, v7

    .line 829
    .local v2, "frameSignal":Landroidx/compose/runtime/ProduceFrameSignal;
    .local v3, "parentFrameClock":Landroidx/compose/runtime/MonotonicFrameClock;
    .local v4, "this":Landroidx/compose/runtime/Recomposer;
    .local p1, "toApply":Ljava/util/List;
    .local p2, "toRecompose":Ljava/util/List;
    :goto_2
    new-instance v5, Landroidx/compose/runtime/Recomposer$runFrameLoop$2;

    invoke-direct {v5, v4, p2, p1, v2}, Landroidx/compose/runtime/Recomposer$runFrameLoop$2;-><init>(Landroidx/compose/runtime/Recomposer;Ljava/util/List;Ljava/util/List;Landroidx/compose/runtime/ProduceFrameSignal;)V

    check-cast v5, Lkotlin/jvm/functions/Function1;

    iput-object v4, p3, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$0:Ljava/lang/Object;

    iput-object v3, p3, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$1:Ljava/lang/Object;

    iput-object v2, p3, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$2:Ljava/lang/Object;

    iput-object p2, p3, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$3:Ljava/lang/Object;

    iput-object p1, p3, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$4:Ljava/lang/Object;

    const/4 v6, 0x2

    iput v6, p3, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->label:I

    invoke-interface {v3, v5, p3}, Landroidx/compose/runtime/MonotonicFrameClock;->withFrameNanos(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_2

    .line 815
    return-object v1

    .line 829
    :cond_2
    move-object v7, v4

    move-object v4, p1

    move-object p1, v3

    move-object v3, p2

    move-object p2, v2

    move-object v2, v7

    .local v2, "this":Landroidx/compose/runtime/Recomposer;
    .local v3, "toRecompose":Ljava/util/List;
    .local v4, "toApply":Ljava/util/List;
    .local p1, "parentFrameClock":Landroidx/compose/runtime/MonotonicFrameClock;
    .local p2, "frameSignal":Landroidx/compose/runtime/ProduceFrameSignal;
    :goto_3
    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final writeObserverOf(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;)Lkotlin/jvm/functions/Function1;
    .locals 1
    .param p1, "composition"    # Landroidx/compose/runtime/ControlledComposition;
    .param p2, "modifiedValues"    # Landroidx/compose/runtime/collection/IdentityArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/ControlledComposition;",
            "Landroidx/compose/runtime/collection/IdentityArraySet<",
            "Ljava/lang/Object;",
            ">;)",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Object;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1151
    new-instance v0, Landroidx/compose/runtime/Recomposer$writeObserverOf$1;

    invoke-direct {v0, p1, p2}, Landroidx/compose/runtime/Recomposer$writeObserverOf$1;-><init>(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    return-object v0
.end method


# virtual methods
.method public final asRecomposerInfo()Landroidx/compose/runtime/RecomposerInfo;
    .locals 1

    .line 417
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->recomposerInfo:Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;

    check-cast v0, Landroidx/compose/runtime/RecomposerInfo;

    return-object v0
.end method

.method public final awaitIdle(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1215
    invoke-virtual {p0}, Landroidx/compose/runtime/Recomposer;->getCurrentState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/flow/Flow;

    new-instance v1, Landroidx/compose/runtime/Recomposer$awaitIdle$2;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Landroidx/compose/runtime/Recomposer$awaitIdle$2;-><init>(Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1}, Lkotlinx/coroutines/flow/FlowKt;->takeWhile(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlinx/coroutines/flow/FlowKt;->collect(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 1216
    return-object v0
.end method

.method public final cancel()V
    .locals 5

    .line 977
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 1548
    .local v1, "$i$f$synchronized":I
    monitor-enter v0

    const/4 v2, 0x0

    .line 978
    .local v2, "$i$a$-synchronized-Recomposer$cancel$1":I
    :try_start_0
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/runtime/Recomposer$State;

    sget-object v4, Landroidx/compose/runtime/Recomposer$State;->Idle:Landroidx/compose/runtime/Recomposer$State;

    check-cast v4, Ljava/lang/Enum;

    invoke-virtual {v3, v4}, Landroidx/compose/runtime/Recomposer$State;->compareTo(Ljava/lang/Enum;)I

    move-result v3

    if-ltz v3, :cond_0

    .line 979
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    sget-object v4, Landroidx/compose/runtime/Recomposer$State;->ShuttingDown:Landroidx/compose/runtime/Recomposer$State;

    invoke-interface {v3, v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 981
    :cond_0
    nop

    .end local v2    # "$i$a$-synchronized-Recomposer$cancel$1":I
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1548
    monitor-exit v0

    .line 982
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->effectJob:Lkotlinx/coroutines/CompletableJob;

    check-cast v0, Lkotlinx/coroutines/Job;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/Job$DefaultImpls;->cancel$default(Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 983
    return-void

    .line 1548
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :catchall_0
    move-exception v2

    monitor-exit v0

    throw v2
.end method

.method public final close()V
    .locals 4

    .line 992
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->effectJob:Lkotlinx/coroutines/CompletableJob;

    invoke-interface {v0}, Lkotlinx/coroutines/CompletableJob;->complete()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 993
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 1549
    .local v1, "$i$f$synchronized":I
    monitor-enter v0

    const/4 v2, 0x0

    .line 994
    .local v2, "$i$a$-synchronized-Recomposer$close$1":I
    const/4 v3, 0x1

    :try_start_0
    iput-boolean v3, p0, Landroidx/compose/runtime/Recomposer;->isClosed:Z

    .line 995
    nop

    .end local v2    # "$i$a$-synchronized-Recomposer$close$1":I
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1549
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v0

    throw v2

    .line 997
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    :cond_0
    :goto_0
    return-void
.end method

.method public composeInitial$runtime_release(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V
    .locals 10
    .param p1, "composition"    # Landroidx/compose/runtime/ControlledComposition;
    .param p2, "content"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/ControlledComposition;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "composition"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1010
    invoke-interface {p1}, Landroidx/compose/runtime/ControlledComposition;->isComposing()Z

    move-result v0

    .line 1011
    .local v0, "composerWasComposing":Z
    nop

    .line 1012
    const/4 v1, 0x0

    .local v1, "modifiedValues$iv":Landroidx/compose/runtime/collection/IdentityArraySet;
    move-object v2, p0

    .local v2, "this_$iv":Landroidx/compose/runtime/Recomposer;
    const/4 v3, 0x0

    .line 1550
    .local v3, "$i$f$composing":I
    const/4 v4, 0x1

    :try_start_0
    sget-object v5, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    .line 1551
    invoke-direct {v2, p1}, Landroidx/compose/runtime/Recomposer;->readObserverOf(Landroidx/compose/runtime/ControlledComposition;)Lkotlin/jvm/functions/Function1;

    move-result-object v6

    invoke-direct {v2, p1, v1}, Landroidx/compose/runtime/Recomposer;->writeObserverOf(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;)Lkotlin/jvm/functions/Function1;

    move-result-object v7

    .line 1550
    invoke-virtual {v5, v6, v7}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->takeMutableSnapshot(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/MutableSnapshot;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 1553
    .local v5, "snapshot$iv":Landroidx/compose/runtime/snapshots/MutableSnapshot;
    nop

    .line 1554
    :try_start_1
    move-object v6, v5

    check-cast v6, Landroidx/compose/runtime/snapshots/Snapshot;

    .local v6, "this_$iv$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    const/4 v7, 0x0

    .line 1555
    .local v7, "$i$f$enter":I
    invoke-virtual {v6}, Landroidx/compose/runtime/snapshots/Snapshot;->makeCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 1556
    .local v8, "previous$iv$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    nop

    .line 1557
    const/4 v9, 0x0

    .line 1013
    .local v9, "$i$a$-composing-Recomposer$composeInitial$1":I
    :try_start_2
    invoke-interface {p1, p2}, Landroidx/compose/runtime/ControlledComposition;->composeContent(Lkotlin/jvm/functions/Function2;)V

    .line 1014
    nop

    .end local v9    # "$i$a$-composing-Recomposer$composeInitial$1":I
    sget-object v9, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1557
    nop

    .line 1559
    :try_start_3
    invoke-virtual {v6, v8}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 1557
    nop

    .line 1559
    .end local v6    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .end local v7    # "$i$f$enter":I
    .end local v8    # "previous$iv$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    nop

    .line 1560
    :try_start_4
    invoke-direct {v2, v5}, Landroidx/compose/runtime/Recomposer;->applyAndCheck(Landroidx/compose/runtime/snapshots/MutableSnapshot;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 1554
    nop

    .line 1021
    .end local v1    # "modifiedValues$iv":Landroidx/compose/runtime/collection/IdentityArraySet;
    .end local v2    # "this_$iv":Landroidx/compose/runtime/Recomposer;
    .end local v3    # "$i$f$composing":I
    .end local v5    # "snapshot$iv":Landroidx/compose/runtime/snapshots/MutableSnapshot;
    if-nez v0, :cond_0

    .line 1022
    sget-object v1, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->notifyObjectsInitialized()V

    .line 1025
    :cond_0
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .local v1, "lock$iv":Ljava/lang/Object;
    const/4 v2, 0x0

    .line 1561
    .local v2, "$i$f$synchronized":I
    monitor-enter v1

    const/4 v3, 0x0

    .line 1026
    .local v3, "$i$a$-synchronized-Recomposer$composeInitial$2":I
    :try_start_5
    iget-object v5, p0, Landroidx/compose/runtime/Recomposer;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v5}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/compose/runtime/Recomposer$State;

    sget-object v6, Landroidx/compose/runtime/Recomposer$State;->ShuttingDown:Landroidx/compose/runtime/Recomposer$State;

    check-cast v6, Ljava/lang/Enum;

    invoke-virtual {v5, v6}, Landroidx/compose/runtime/Recomposer$State;->compareTo(Ljava/lang/Enum;)I

    move-result v5

    if-lez v5, :cond_1

    .line 1027
    iget-object v5, p0, Landroidx/compose/runtime/Recomposer;->knownCompositions:Ljava/util/List;

    invoke-interface {v5, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 1028
    iget-object v5, p0, Landroidx/compose/runtime/Recomposer;->knownCompositions:Ljava/util/List;

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1031
    :cond_1
    nop

    .end local v3    # "$i$a$-synchronized-Recomposer$composeInitial$2":I
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 1561
    monitor-exit v1

    .line 1033
    .end local v1    # "lock$iv":Ljava/lang/Object;
    .end local v2    # "$i$f$synchronized":I
    nop

    .line 1034
    :try_start_6
    invoke-direct {p0, p1}, Landroidx/compose/runtime/Recomposer;->performInitialMovableContentInserts(Landroidx/compose/runtime/ControlledComposition;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    .line 1040
    nop

    .line 1041
    :try_start_7
    invoke-interface {p1}, Landroidx/compose/runtime/ControlledComposition;->applyChanges()V

    .line 1042
    invoke-interface {p1}, Landroidx/compose/runtime/ControlledComposition;->applyLateChanges()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    .line 1048
    if-nez v0, :cond_2

    .line 1051
    sget-object v1, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->notifyObjectsInitialized()V

    .line 1053
    :cond_2
    return-void

    .line 1043
    :catch_0
    move-exception v1

    move-object v3, v1

    .line 1044
    .local v3, "e":Ljava/lang/Exception;
    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, Landroidx/compose/runtime/Recomposer;->processCompositionError$default(Landroidx/compose/runtime/Recomposer;Ljava/lang/Exception;Landroidx/compose/runtime/ControlledComposition;ZILjava/lang/Object;)V

    .line 1045
    return-void

    .line 1035
    .end local v3    # "e":Ljava/lang/Exception;
    :catch_1
    move-exception v1

    .line 1036
    .local v1, "e":Ljava/lang/Exception;
    invoke-direct {p0, v1, p1, v4}, Landroidx/compose/runtime/Recomposer;->processCompositionError(Ljava/lang/Exception;Landroidx/compose/runtime/ControlledComposition;Z)V

    .line 1037
    return-void

    .line 1561
    .local v1, "lock$iv":Ljava/lang/Object;
    .restart local v2    # "$i$f$synchronized":I
    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3

    .line 1559
    .local v1, "modifiedValues$iv":Landroidx/compose/runtime/collection/IdentityArraySet;
    .local v2, "this_$iv":Landroidx/compose/runtime/Recomposer;
    .local v3, "$i$f$composing":I
    .restart local v5    # "snapshot$iv":Landroidx/compose/runtime/snapshots/MutableSnapshot;
    .restart local v6    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .restart local v7    # "$i$f$enter":I
    .restart local v8    # "previous$iv$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    :catchall_1
    move-exception v9

    :try_start_8
    invoke-virtual {v6, v8}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V

    .end local v0    # "composerWasComposing":Z
    .end local v1    # "modifiedValues$iv":Landroidx/compose/runtime/collection/IdentityArraySet;
    .end local v2    # "this_$iv":Landroidx/compose/runtime/Recomposer;
    .end local v3    # "$i$f$composing":I
    .end local v5    # "snapshot$iv":Landroidx/compose/runtime/snapshots/MutableSnapshot;
    .end local p1    # "composition":Landroidx/compose/runtime/ControlledComposition;
    .end local p2    # "content":Lkotlin/jvm/functions/Function2;
    throw v9
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 1560
    .end local v6    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .end local v7    # "$i$f$enter":I
    .end local v8    # "previous$iv$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .restart local v0    # "composerWasComposing":Z
    .restart local v1    # "modifiedValues$iv":Landroidx/compose/runtime/collection/IdentityArraySet;
    .restart local v2    # "this_$iv":Landroidx/compose/runtime/Recomposer;
    .restart local v3    # "$i$f$composing":I
    .restart local v5    # "snapshot$iv":Landroidx/compose/runtime/snapshots/MutableSnapshot;
    .restart local p1    # "composition":Landroidx/compose/runtime/ControlledComposition;
    .restart local p2    # "content":Lkotlin/jvm/functions/Function2;
    :catchall_2
    move-exception v6

    :try_start_9
    invoke-direct {v2, v5}, Landroidx/compose/runtime/Recomposer;->applyAndCheck(Landroidx/compose/runtime/snapshots/MutableSnapshot;)V

    .end local v0    # "composerWasComposing":Z
    .end local p1    # "composition":Landroidx/compose/runtime/ControlledComposition;
    .end local p2    # "content":Lkotlin/jvm/functions/Function2;
    throw v6
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_2

    .line 1015
    .end local v1    # "modifiedValues$iv":Landroidx/compose/runtime/collection/IdentityArraySet;
    .end local v2    # "this_$iv":Landroidx/compose/runtime/Recomposer;
    .end local v3    # "$i$f$composing":I
    .end local v5    # "snapshot$iv":Landroidx/compose/runtime/snapshots/MutableSnapshot;
    .restart local v0    # "composerWasComposing":Z
    .restart local p1    # "composition":Landroidx/compose/runtime/ControlledComposition;
    .restart local p2    # "content":Lkotlin/jvm/functions/Function2;
    :catch_2
    move-exception v1

    .line 1016
    .local v1, "e":Ljava/lang/Exception;
    invoke-direct {p0, v1, p1, v4}, Landroidx/compose/runtime/Recomposer;->processCompositionError(Ljava/lang/Exception;Landroidx/compose/runtime/ControlledComposition;Z)V

    .line 1017
    return-void
.end method

.method public deletedMovableContent$runtime_release(Landroidx/compose/runtime/MovableContentStateReference;)V
    .locals 5
    .param p1, "reference"    # Landroidx/compose/runtime/MovableContentStateReference;

    const-string/jumbo v0, "reference"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1301
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 1656
    .local v1, "$i$f$synchronized":I
    monitor-enter v0

    const/4 v2, 0x0

    .line 1302
    .local v2, "$i$a$-synchronized-Recomposer$deletedMovableContent$1":I
    :try_start_0
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->compositionValuesRemoved:Ljava/util/Map;

    invoke-virtual {p1}, Landroidx/compose/runtime/MovableContentStateReference;->getContent$runtime_release()Landroidx/compose/runtime/MovableContent;

    move-result-object v4

    invoke-static {v3, v4, p1}, Landroidx/compose/runtime/RecomposerKt;->addMultiValue(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1656
    .end local v2    # "$i$a$-synchronized-Recomposer$deletedMovableContent$1":I
    monitor-exit v0

    .line 1304
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    return-void

    .line 1656
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :catchall_0
    move-exception v2

    monitor-exit v0

    throw v2
.end method

.method public final getChangeCount()J
    .locals 2

    .line 134
    iget-wide v0, p0, Landroidx/compose/runtime/Recomposer;->changeCount:J

    return-wide v0
.end method

.method public getCollectingParameterInformation$runtime_release()Z
    .locals 1

    .line 1258
    const/4 v0, 0x0

    return v0
.end method

.method public getCompoundHashKey$runtime_release()I
    .locals 1

    .line 1254
    const/16 v0, 0x3e8

    return v0
.end method

.method public final getCurrentState()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Landroidx/compose/runtime/Recomposer$State;",
            ">;"
        }
    .end annotation

    .line 346
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    check-cast v0, Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getEffectCoroutineContext()Lkotlin/coroutines/CoroutineContext;
    .locals 1

    .line 272
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->effectCoroutineContext:Lkotlin/coroutines/CoroutineContext;

    return-object v0
.end method

.method public final getHasPendingWork()Z
    .locals 5

    .line 1192
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 1649
    .local v1, "$i$f$synchronized":I
    monitor-enter v0

    const/4 v2, 0x0

    .line 1193
    .local v2, "$i$a$-synchronized-Recomposer$hasPendingWork$1":I
    :try_start_0
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->snapshotInvalidations:Landroidx/compose/runtime/collection/IdentityArraySet;

    invoke-virtual {v3}, Landroidx/compose/runtime/collection/IdentityArraySet;->isNotEmpty()Z

    move-result v3

    const/4 v4, 0x1

    if-nez v3, :cond_1

    .line 1194
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->compositionInvalidations:Ljava/util/List;

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    xor-int/2addr v3, v4

    if-nez v3, :cond_1

    .line 1195
    iget v3, p0, Landroidx/compose/runtime/Recomposer;->concurrentCompositionsOutstanding:I

    if-gtz v3, :cond_1

    .line 1196
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->compositionsAwaitingApply:Ljava/util/List;

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    xor-int/2addr v3, v4

    if-nez v3, :cond_1

    .line 1197
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->getHasBroadcastFrameClockAwaitersLocked()Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    nop

    .line 1193
    :goto_1
    nop

    .line 1649
    .end local v2    # "$i$a$-synchronized-Recomposer$hasPendingWork$1":I
    monitor-exit v0

    .line 1198
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    return v4

    .line 1649
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :catchall_0
    move-exception v2

    monitor-exit v0

    throw v2
.end method

.method public getRecomposeCoroutineContext$runtime_release()Lkotlin/coroutines/CoroutineContext;
    .locals 1

    .line 276
    sget-object v0, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    return-object v0
.end method

.method public final getState()Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Landroidx/compose/runtime/Recomposer$State;",
            ">;"
        }
    .end annotation

    .line 340
    invoke-virtual {p0}, Landroidx/compose/runtime/Recomposer;->getCurrentState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/flow/Flow;

    return-object v0
.end method

.method public insertMovableContent$runtime_release(Landroidx/compose/runtime/MovableContentStateReference;)V
    .locals 4
    .param p1, "reference"    # Landroidx/compose/runtime/MovableContentStateReference;

    const-string/jumbo v0, "reference"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1297
    nop

    .line 1294
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 1655
    .local v1, "$i$f$synchronized":I
    monitor-enter v0

    const/4 v2, 0x0

    .line 1295
    .local v2, "$i$a$-synchronized-Recomposer$insertMovableContent$1":I
    :try_start_0
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->compositionValuesAwaitingInsert:Ljava/util/List;

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1296
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->deriveStateLocked()Lkotlinx/coroutines/CancellableContinuation;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1655
    .end local v2    # "$i$a$-synchronized-Recomposer$insertMovableContent$1":I
    monitor-exit v0

    .line 1294
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    nop

    .line 1297
    if-eqz v3, :cond_0

    .line 1294
    check-cast v3, Lkotlin/coroutines/Continuation;

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 1297
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3, v0}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    .line 1298
    :cond_0
    return-void

    .line 1655
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :catchall_0
    move-exception v2

    monitor-exit v0

    throw v2
.end method

.method public invalidate$runtime_release(Landroidx/compose/runtime/ControlledComposition;)V
    .locals 4
    .param p1, "composition"    # Landroidx/compose/runtime/ControlledComposition;

    const-string v0, "composition"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1283
    nop

    .line 1278
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 1653
    .local v1, "$i$f$synchronized":I
    monitor-enter v0

    const/4 v2, 0x0

    .line 1279
    .local v2, "$i$a$-synchronized-Recomposer$invalidate$1":I
    :try_start_0
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->compositionInvalidations:Ljava/util/List;

    invoke-interface {v3, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 1280
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->compositionInvalidations:Ljava/util/List;

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1281
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->deriveStateLocked()Lkotlinx/coroutines/CancellableContinuation;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 1282
    :cond_0
    const/4 v3, 0x0

    .line 1279
    :goto_0
    nop

    .line 1653
    .end local v2    # "$i$a$-synchronized-Recomposer$invalidate$1":I
    monitor-exit v0

    .line 1278
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    nop

    .line 1283
    if-eqz v3, :cond_1

    .line 1278
    check-cast v3, Lkotlin/coroutines/Continuation;

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 1283
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3, v0}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    .line 1284
    :cond_1
    return-void

    .line 1653
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :catchall_0
    move-exception v2

    monitor-exit v0

    throw v2
.end method

.method public invalidateScope$runtime_release(Landroidx/compose/runtime/RecomposeScopeImpl;)V
    .locals 4
    .param p1, "scope"    # Landroidx/compose/runtime/RecomposeScopeImpl;

    const-string/jumbo v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1290
    nop

    .line 1287
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 1654
    .local v1, "$i$f$synchronized":I
    monitor-enter v0

    const/4 v2, 0x0

    .line 1288
    .local v2, "$i$a$-synchronized-Recomposer$invalidateScope$1":I
    :try_start_0
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->snapshotInvalidations:Landroidx/compose/runtime/collection/IdentityArraySet;

    invoke-virtual {v3, p1}, Landroidx/compose/runtime/collection/IdentityArraySet;->add(Ljava/lang/Object;)Z

    .line 1289
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->deriveStateLocked()Lkotlinx/coroutines/CancellableContinuation;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1654
    .end local v2    # "$i$a$-synchronized-Recomposer$invalidateScope$1":I
    monitor-exit v0

    .line 1287
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    nop

    .line 1290
    if-eqz v3, :cond_0

    .line 1287
    check-cast v3, Lkotlin/coroutines/Continuation;

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 1290
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3, v0}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    .line 1291
    :cond_0
    return-void

    .line 1654
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :catchall_0
    move-exception v2

    monitor-exit v0

    throw v2
.end method

.method public final join(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1003
    invoke-virtual {p0}, Landroidx/compose/runtime/Recomposer;->getCurrentState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/flow/Flow;

    new-instance v1, Landroidx/compose/runtime/Recomposer$join$2;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Landroidx/compose/runtime/Recomposer$join$2;-><init>(Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p1}, Lkotlinx/coroutines/flow/FlowKt;->first(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 1004
    return-object v0
.end method

.method public movableContentStateReleased$runtime_release(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentState;)V
    .locals 4
    .param p1, "reference"    # Landroidx/compose/runtime/MovableContentStateReference;
    .param p2, "data"    # Landroidx/compose/runtime/MovableContentState;

    const-string/jumbo v0, "reference"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1310
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 1657
    .local v1, "$i$f$synchronized":I
    monitor-enter v0

    const/4 v2, 0x0

    .line 1311
    .local v2, "$i$a$-synchronized-Recomposer$movableContentStateReleased$1":I
    :try_start_0
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->compositionValueStatesAvailable:Ljava/util/Map;

    invoke-interface {v3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1312
    nop

    .end local v2    # "$i$a$-synchronized-Recomposer$movableContentStateReleased$1":I
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1657
    monitor-exit v0

    .line 1313
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    return-void

    .line 1657
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :catchall_0
    move-exception v2

    monitor-exit v0

    throw v2
.end method

.method public movableContentStateResolve$runtime_release(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;
    .locals 4
    .param p1, "reference"    # Landroidx/compose/runtime/MovableContentStateReference;

    const-string/jumbo v0, "reference"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1328
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 1659
    .local v1, "$i$f$synchronized":I
    monitor-enter v0

    const/4 v2, 0x0

    .line 1329
    .local v2, "$i$a$-synchronized-Recomposer$movableContentStateResolve$1":I
    :try_start_0
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->compositionValueStatesAvailable:Ljava/util/Map;

    invoke-interface {v3, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/runtime/MovableContentState;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1659
    .end local v2    # "$i$a$-synchronized-Recomposer$movableContentStateResolve$1":I
    monitor-exit v0

    .line 1330
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    return-object v3

    .line 1659
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :catchall_0
    move-exception v2

    monitor-exit v0

    throw v2
.end method

.method public final pauseCompositionFrameClock()V
    .locals 4

    .line 1229
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 1650
    .local v1, "$i$f$synchronized":I
    monitor-enter v0

    const/4 v2, 0x0

    .line 1230
    .local v2, "$i$a$-synchronized-Recomposer$pauseCompositionFrameClock$1":I
    const/4 v3, 0x1

    :try_start_0
    iput-boolean v3, p0, Landroidx/compose/runtime/Recomposer;->frameClockPaused:Z

    .line 1231
    nop

    .end local v2    # "$i$a$-synchronized-Recomposer$pauseCompositionFrameClock$1":I
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1650
    monitor-exit v0

    .line 1232
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    return-void

    .line 1650
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :catchall_0
    move-exception v2

    monitor-exit v0

    throw v2
.end method

.method public recordInspectionTable$runtime_release(Ljava/util/Set;)V
    .locals 1
    .param p1, "table"    # Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Landroidx/compose/runtime/tooling/CompositionData;",
            ">;)V"
        }
    .end annotation

    const-string/jumbo v0, "table"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1263
    return-void
.end method

.method public registerComposition$runtime_release(Landroidx/compose/runtime/ControlledComposition;)V
    .locals 1
    .param p1, "composition"    # Landroidx/compose/runtime/ControlledComposition;

    const-string v0, "composition"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1267
    return-void
.end method

.method public reportRemovedComposition$runtime_release(Landroidx/compose/runtime/ControlledComposition;)V
    .locals 6
    .param p1, "composition"    # Landroidx/compose/runtime/ControlledComposition;

    const-string v0, "composition"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1316
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 1658
    .local v1, "$i$f$synchronized":I
    monitor-enter v0

    const/4 v2, 0x0

    .line 1317
    .local v2, "$i$a$-synchronized-Recomposer$reportRemovedComposition$1":I
    :try_start_0
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->compositionsRemoved:Ljava/util/Set;

    if-nez v3, :cond_0

    .line 1318
    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v3, Ljava/util/Set;

    move-object v4, v3

    .local v4, "it":Ljava/util/Set;
    const/4 v5, 0x0

    .line 1319
    .local v5, "$i$a$-also-Recomposer$reportRemovedComposition$1$compositionsRemoved$1":I
    iput-object v4, p0, Landroidx/compose/runtime/Recomposer;->compositionsRemoved:Ljava/util/Set;

    .line 1320
    nop

    .line 1318
    .end local v4    # "it":Ljava/util/Set;
    .end local v5    # "$i$a$-also-Recomposer$reportRemovedComposition$1$compositionsRemoved$1":I
    nop

    .line 1317
    :cond_0
    nop

    .line 1321
    .local v3, "compositionsRemoved":Ljava/util/Set;
    invoke-interface {v3, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1658
    .end local v2    # "$i$a$-synchronized-Recomposer$reportRemovedComposition$1":I
    .end local v3    # "compositionsRemoved":Ljava/util/Set;
    monitor-exit v0

    .line 1323
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    return-void

    .line 1658
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :catchall_0
    move-exception v2

    monitor-exit v0

    throw v2
.end method

.method public final resumeCompositionFrameClock()V
    .locals 4

    .line 1249
    nop

    .line 1244
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 1651
    .local v1, "$i$f$synchronized":I
    monitor-enter v0

    const/4 v2, 0x0

    .line 1245
    .local v2, "$i$a$-synchronized-Recomposer$resumeCompositionFrameClock$1":I
    :try_start_0
    iget-boolean v3, p0, Landroidx/compose/runtime/Recomposer;->frameClockPaused:Z

    if-eqz v3, :cond_0

    .line 1246
    const/4 v3, 0x0

    iput-boolean v3, p0, Landroidx/compose/runtime/Recomposer;->frameClockPaused:Z

    .line 1247
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->deriveStateLocked()Lkotlinx/coroutines/CancellableContinuation;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 1248
    :cond_0
    const/4 v3, 0x0

    .line 1245
    :goto_0
    nop

    .line 1651
    .end local v2    # "$i$a$-synchronized-Recomposer$resumeCompositionFrameClock$1":I
    monitor-exit v0

    .line 1244
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    nop

    .line 1249
    if-eqz v3, :cond_1

    .line 1244
    check-cast v3, Lkotlin/coroutines/Continuation;

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 1249
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3, v0}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    .line 1250
    :cond_1
    return-void

    .line 1651
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :catchall_0
    move-exception v2

    monitor-exit v0

    throw v2
.end method

.method public final runRecomposeAndApplyChanges(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 502
    new-instance v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;-><init>(Landroidx/compose/runtime/Recomposer;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function3;

    invoke-direct {p0, v0, p1}, Landroidx/compose/runtime/Recomposer;->recompositionRunner(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 681
    return-object v0
.end method

.method public final runRecomposeConcurrentlyAndApplyChanges(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p1, "recomposeCoroutineContext"    # Lkotlin/coroutines/CoroutineContext;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 780
    new-instance v0, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;-><init>(Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Recomposer;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function3;

    invoke-direct {p0, v0, p2}, Landroidx/compose/runtime/Recomposer;->recompositionRunner(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 813
    return-object v0
.end method

.method public unregisterComposition$runtime_release(Landroidx/compose/runtime/ControlledComposition;)V
    .locals 4
    .param p1, "composition"    # Landroidx/compose/runtime/ControlledComposition;

    const-string v0, "composition"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1270
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 1652
    .local v1, "$i$f$synchronized":I
    monitor-enter v0

    const/4 v2, 0x0

    .line 1271
    .local v2, "$i$a$-synchronized-Recomposer$unregisterComposition$1":I
    :try_start_0
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->knownCompositions:Ljava/util/List;

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 1272
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->compositionInvalidations:Ljava/util/List;

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 1273
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->compositionsAwaitingApply:Ljava/util/List;

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 1274
    nop

    .end local v2    # "$i$a$-synchronized-Recomposer$unregisterComposition$1":I
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1652
    monitor-exit v0

    .line 1275
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    return-void

    .line 1652
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :catchall_0
    move-exception v2

    monitor-exit v0

    throw v2
.end method
