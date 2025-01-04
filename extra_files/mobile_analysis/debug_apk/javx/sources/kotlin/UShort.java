package kotlin;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt;

/* compiled from: UShort.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\n\n\u0002\b\t\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 v2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001vB\u0014\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0097\nø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u001b\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0010J\u001b\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0013J\u001b\u0010\u001b\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b \u0010\u0018J\u001a\u0010!\u001a\u00020\"2\b\u0010\t\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\b'\u0010\u0010J\u001b\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\b(\u0010\u0013J\u001b\u0010&\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b)\u0010\u001fJ\u001b\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b*\u0010\u0018J\u0010\u0010+\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010-J\u0016\u0010.\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0005J\u0016\u00100\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0005J\u001b\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b3\u0010\u0010J\u001b\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b4\u0010\u0013J\u001b\u00102\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\b5\u0010\u001fJ\u001b\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b6\u0010\u0018J\u001b\u00107\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\b8\u00109J\u001b\u00107\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\b:\u0010\u0013J\u001b\u00107\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b;\u0010\u001fJ\u001b\u00107\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b<\u0010\u000bJ\u001b\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b>\u0010\u000bJ\u001b\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b@\u0010\u0010J\u001b\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\bA\u0010\u0013J\u001b\u0010?\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\bB\u0010\u001fJ\u001b\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bC\u0010\u0018J\u001b\u0010D\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bF\u0010GJ\u001b\u0010H\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bI\u0010GJ\u001b\u0010J\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\bK\u0010\u0010J\u001b\u0010J\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\bL\u0010\u0013J\u001b\u0010J\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\bM\u0010\u001fJ\u001b\u0010J\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bN\u0010\u0018J\u001b\u0010O\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\bP\u0010\u0010J\u001b\u0010O\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\bQ\u0010\u0013J\u001b\u0010O\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\bR\u0010\u001fJ\u001b\u0010O\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bS\u0010\u0018J\u0010\u0010T\u001a\u00020UH\u0087\b¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u00020YH\u0087\b¢\u0006\u0004\bZ\u0010[J\u0010\u0010\\\u001a\u00020]H\u0087\b¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020\rH\u0087\b¢\u0006\u0004\ba\u0010-J\u0010\u0010b\u001a\u00020cH\u0087\b¢\u0006\u0004\bd\u0010eJ\u0010\u0010f\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bg\u0010\u0005J\u000f\u0010h\u001a\u00020iH\u0016¢\u0006\u0004\bj\u0010kJ\u0016\u0010l\u001a\u00020\u000eH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bm\u0010WJ\u0016\u0010n\u001a\u00020\u0011H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bo\u0010-J\u0016\u0010p\u001a\u00020\u0014H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bq\u0010eJ\u0016\u0010r\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bs\u0010\u0005J\u001b\u0010t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\bu\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006w"}, d2 = {"Lkotlin/UShort;", "", "data", "", "constructor-impl", "(S)S", "getData$annotations", "()V", "and", "other", "and-xj2QHRw", "(SS)S", "compareTo", "", "Lkotlin/UByte;", "compareTo-7apg3OU", "(SB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(SI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(SJ)I", "compareTo-xj2QHRw", "(SS)I", "dec", "dec-Mh2AYeg", "div", "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(SJ)J", "div-xj2QHRw", "equals", "", "", "equals-impl", "(SLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "(S)I", "inc", "inc-Mh2AYeg", "inv", "inv-Mh2AYeg", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "(SB)B", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "or", "or-xj2QHRw", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-xj2QHRw", "(SS)Lkotlin/ranges/UIntRange;", "rangeUntil", "rangeUntil-xj2QHRw", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(S)B", "toDouble", "", "toDouble-impl", "(S)D", "toFloat", "", "toFloat-impl", "(S)F", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(S)J", "toShort", "toShort-impl", "toString", "", "toString-impl", "(S)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-xj2QHRw", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class UShort implements Comparable<UShort> {
    public static final short MAX_VALUE = -1;
    public static final short MIN_VALUE = 0;
    public static final int SIZE_BITS = 16;
    public static final int SIZE_BYTES = 2;
    private final short data;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UShort m5782boximpl(short s) {
        return new UShort(s);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m5788constructorimpl(short s) {
        return s;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5794equalsimpl(short s, Object obj) {
        return (obj instanceof UShort) && s == ((UShort) obj).getData();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5795equalsimpl0(short s, short s2) {
        return s == s2;
    }

    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5800hashCodeimpl(short s) {
        return Short.hashCode(s);
    }

    public boolean equals(Object obj) {
        return m5794equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m5800hashCodeimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ short getData() {
        return this.data;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UShort uShort) {
        return Intrinsics.compare(getData() & MAX_VALUE, uShort.getData() & MAX_VALUE);
    }

    private /* synthetic */ UShort(short data) {
        this.data = data;
    }

    /* renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static final int m5783compareTo7apg3OU(short arg0, byte other) {
        return Intrinsics.compare(65535 & arg0, other & UByte.MAX_VALUE);
    }

    /* renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private int m5786compareToxj2QHRw(short other) {
        return Intrinsics.compare(getData() & MAX_VALUE, 65535 & other);
    }

    /* renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static int m5787compareToxj2QHRw(short arg0, short other) {
        return Intrinsics.compare(arg0 & MAX_VALUE, 65535 & other);
    }

    /* renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m5785compareToWZ4Q5Ns(short arg0, int other) {
        return Integer.compareUnsigned(UInt.m5602constructorimpl(65535 & arg0), other);
    }

    /* renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m5784compareToVKZWuLQ(short arg0, long other) {
        return Long.compareUnsigned(ULong.m5681constructorimpl(arg0 & 65535), other);
    }

    /* renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m5812plus7apg3OU(short arg0, byte other) {
        return UInt.m5602constructorimpl(UInt.m5602constructorimpl(65535 & arg0) + UInt.m5602constructorimpl(other & UByte.MAX_VALUE));
    }

    /* renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m5815plusxj2QHRw(short arg0, short other) {
        return UInt.m5602constructorimpl(UInt.m5602constructorimpl(arg0 & MAX_VALUE) + UInt.m5602constructorimpl(65535 & other));
    }

    /* renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m5814plusWZ4Q5Ns(short arg0, int other) {
        return UInt.m5602constructorimpl(UInt.m5602constructorimpl(65535 & arg0) + other);
    }

    /* renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m5813plusVKZWuLQ(short arg0, long other) {
        return ULong.m5681constructorimpl(ULong.m5681constructorimpl(arg0 & 65535) + other);
    }

    /* renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m5803minus7apg3OU(short arg0, byte other) {
        return UInt.m5602constructorimpl(UInt.m5602constructorimpl(65535 & arg0) - UInt.m5602constructorimpl(other & UByte.MAX_VALUE));
    }

    /* renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m5806minusxj2QHRw(short arg0, short other) {
        return UInt.m5602constructorimpl(UInt.m5602constructorimpl(arg0 & MAX_VALUE) - UInt.m5602constructorimpl(65535 & other));
    }

    /* renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m5805minusWZ4Q5Ns(short arg0, int other) {
        return UInt.m5602constructorimpl(UInt.m5602constructorimpl(65535 & arg0) - other);
    }

    /* renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m5804minusVKZWuLQ(short arg0, long other) {
        return ULong.m5681constructorimpl(ULong.m5681constructorimpl(arg0 & 65535) - other);
    }

    /* renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m5822times7apg3OU(short arg0, byte other) {
        return UInt.m5602constructorimpl(UInt.m5602constructorimpl(65535 & arg0) * UInt.m5602constructorimpl(other & UByte.MAX_VALUE));
    }

    /* renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m5825timesxj2QHRw(short arg0, short other) {
        return UInt.m5602constructorimpl(UInt.m5602constructorimpl(arg0 & MAX_VALUE) * UInt.m5602constructorimpl(65535 & other));
    }

    /* renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m5824timesWZ4Q5Ns(short arg0, int other) {
        return UInt.m5602constructorimpl(UInt.m5602constructorimpl(65535 & arg0) * other);
    }

    /* renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m5823timesVKZWuLQ(short arg0, long other) {
        return ULong.m5681constructorimpl(ULong.m5681constructorimpl(arg0 & 65535) * other);
    }

    /* renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m5790div7apg3OU(short arg0, byte other) {
        return Integer.divideUnsigned(UInt.m5602constructorimpl(65535 & arg0), UInt.m5602constructorimpl(other & UByte.MAX_VALUE));
    }

    /* renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m5793divxj2QHRw(short arg0, short other) {
        return Integer.divideUnsigned(UInt.m5602constructorimpl(arg0 & MAX_VALUE), UInt.m5602constructorimpl(65535 & other));
    }

    /* renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final int m5792divWZ4Q5Ns(short arg0, int other) {
        return Integer.divideUnsigned(UInt.m5602constructorimpl(65535 & arg0), other);
    }

    /* renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m5791divVKZWuLQ(short arg0, long other) {
        return Long.divideUnsigned(ULong.m5681constructorimpl(arg0 & 65535), other);
    }

    /* renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m5818rem7apg3OU(short arg0, byte other) {
        return Integer.remainderUnsigned(UInt.m5602constructorimpl(65535 & arg0), UInt.m5602constructorimpl(other & UByte.MAX_VALUE));
    }

    /* renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m5821remxj2QHRw(short arg0, short other) {
        return Integer.remainderUnsigned(UInt.m5602constructorimpl(arg0 & MAX_VALUE), UInt.m5602constructorimpl(65535 & other));
    }

    /* renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final int m5820remWZ4Q5Ns(short arg0, int other) {
        return Integer.remainderUnsigned(UInt.m5602constructorimpl(65535 & arg0), other);
    }

    /* renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m5819remVKZWuLQ(short arg0, long other) {
        return Long.remainderUnsigned(ULong.m5681constructorimpl(arg0 & 65535), other);
    }

    /* renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final int m5796floorDiv7apg3OU(short arg0, byte other) {
        return Integer.divideUnsigned(UInt.m5602constructorimpl(65535 & arg0), UInt.m5602constructorimpl(other & UByte.MAX_VALUE));
    }

    /* renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m5799floorDivxj2QHRw(short arg0, short other) {
        return Integer.divideUnsigned(UInt.m5602constructorimpl(arg0 & MAX_VALUE), UInt.m5602constructorimpl(65535 & other));
    }

    /* renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final int m5798floorDivWZ4Q5Ns(short arg0, int other) {
        return Integer.divideUnsigned(UInt.m5602constructorimpl(65535 & arg0), other);
    }

    /* renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m5797floorDivVKZWuLQ(short arg0, long other) {
        return Long.divideUnsigned(ULong.m5681constructorimpl(arg0 & 65535), other);
    }

    /* renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m5807mod7apg3OU(short arg0, byte other) {
        return UByte.m5525constructorimpl((byte) Integer.remainderUnsigned(UInt.m5602constructorimpl(65535 & arg0), UInt.m5602constructorimpl(other & UByte.MAX_VALUE)));
    }

    /* renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m5810modxj2QHRw(short arg0, short other) {
        return m5788constructorimpl((short) Integer.remainderUnsigned(UInt.m5602constructorimpl(arg0 & MAX_VALUE), UInt.m5602constructorimpl(65535 & other)));
    }

    /* renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m5809modWZ4Q5Ns(short arg0, int other) {
        return Integer.remainderUnsigned(UInt.m5602constructorimpl(65535 & arg0), other);
    }

    /* renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m5808modVKZWuLQ(short arg0, long other) {
        return Long.remainderUnsigned(ULong.m5681constructorimpl(arg0 & 65535), other);
    }

    /* renamed from: inc-Mh2AYeg, reason: not valid java name */
    private static final short m5801incMh2AYeg(short arg0) {
        return m5788constructorimpl((short) (arg0 + 1));
    }

    /* renamed from: dec-Mh2AYeg, reason: not valid java name */
    private static final short m5789decMh2AYeg(short arg0) {
        return m5788constructorimpl((short) (arg0 - 1));
    }

    /* renamed from: rangeTo-xj2QHRw, reason: not valid java name */
    private static final UIntRange m5816rangeToxj2QHRw(short arg0, short other) {
        return new UIntRange(UInt.m5602constructorimpl(arg0 & MAX_VALUE), UInt.m5602constructorimpl(65535 & other), null);
    }

    /* renamed from: rangeUntil-xj2QHRw, reason: not valid java name */
    private static final UIntRange m5817rangeUntilxj2QHRw(short arg0, short other) {
        return URangesKt.m6774untilJ1ME1BU(UInt.m5602constructorimpl(arg0 & MAX_VALUE), UInt.m5602constructorimpl(65535 & other));
    }

    /* renamed from: and-xj2QHRw, reason: not valid java name */
    private static final short m5781andxj2QHRw(short arg0, short other) {
        return m5788constructorimpl((short) (arg0 & other));
    }

    /* renamed from: or-xj2QHRw, reason: not valid java name */
    private static final short m5811orxj2QHRw(short arg0, short other) {
        return m5788constructorimpl((short) (arg0 | other));
    }

    /* renamed from: xor-xj2QHRw, reason: not valid java name */
    private static final short m5837xorxj2QHRw(short arg0, short other) {
        return m5788constructorimpl((short) (arg0 ^ other));
    }

    /* renamed from: inv-Mh2AYeg, reason: not valid java name */
    private static final short m5802invMh2AYeg(short arg0) {
        return m5788constructorimpl((short) (~arg0));
    }

    /* renamed from: toByte-impl, reason: not valid java name */
    private static final byte m5826toByteimpl(short arg0) {
        return (byte) arg0;
    }

    /* renamed from: toShort-impl, reason: not valid java name */
    private static final short m5831toShortimpl(short arg0) {
        return arg0;
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    private static final int m5829toIntimpl(short arg0) {
        return 65535 & arg0;
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    private static final long m5830toLongimpl(short arg0) {
        return arg0 & 65535;
    }

    /* renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m5833toUBytew2LRezQ(short arg0) {
        return UByte.m5525constructorimpl((byte) arg0);
    }

    /* renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m5836toUShortMh2AYeg(short arg0) {
        return arg0;
    }

    /* renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m5834toUIntpVg5ArA(short arg0) {
        return UInt.m5602constructorimpl(65535 & arg0);
    }

    /* renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m5835toULongsVKNKU(short arg0) {
        return ULong.m5681constructorimpl(arg0 & 65535);
    }

    /* renamed from: toFloat-impl, reason: not valid java name */
    private static final float m5828toFloatimpl(short arg0) {
        return 65535 & arg0;
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    private static final double m5827toDoubleimpl(short arg0) {
        return 65535 & arg0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5832toStringimpl(short arg0) {
        return String.valueOf(65535 & arg0);
    }

    public String toString() {
        return m5832toStringimpl(this.data);
    }
}
