package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnnotatedString.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u000256B;\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u0005¢\u0006\u0002\u0010\nBY\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0006\u0018\u00010\u0005\u0012\u0018\b\u0002\u0010\r\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\u0011\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0013H\u0096\u0002J\"\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u00052\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u0013J*\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u00052\u0006\u0010%\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u0013J\"\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00060\u00052\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u0013J$\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00060\u00052\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u0013H\u0007J\u001e\u0010*\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u0013J\b\u0010+\u001a\u00020\u0013H\u0016J\u0011\u0010,\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0000H\u0087\u0002J\u001b\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101J\u0018\u0010-\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u00132\u0006\u00103\u001a\u00020\u0013H\u0016J\b\u00104\u001a\u00020\u0003H\u0016R$\u0010\r\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u0006\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u00058F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011R\"\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0006\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00058F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0011R\"\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00067"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "", "text", "", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "paragraphStyles", "Landroidx/compose/ui/text/ParagraphStyle;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "spanStylesOrNull", "paragraphStylesOrNull", "annotations", "", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAnnotations$ui_text_release", "()Ljava/util/List;", "length", "", "getLength", "()I", "getParagraphStyles", "getParagraphStylesOrNull$ui_text_release", "getSpanStyles", "getSpanStylesOrNull$ui_text_release", "getText", "()Ljava/lang/String;", "equals", "", "other", "get", "", "index", "getStringAnnotations", "start", "end", "tag", "getTtsAnnotations", "Landroidx/compose/ui/text/TtsAnnotation;", "getUrlAnnotations", "Landroidx/compose/ui/text/UrlAnnotation;", "hasStringAnnotations", "hashCode", "plus", "subSequence", "range", "Landroidx/compose/ui/text/TextRange;", "subSequence-5zc-tL8", "(J)Landroidx/compose/ui/text/AnnotatedString;", "startIndex", "endIndex", "toString", "Builder", "Range", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnnotatedString implements CharSequence {
    public static final int $stable = 0;
    private final List<Range<? extends Object>> annotations;
    private final List<Range<ParagraphStyle>> paragraphStylesOrNull;
    private final List<Range<SpanStyle>> spanStylesOrNull;
    private final String text;

    /* JADX WARN: Multi-variable type inference failed */
    public AnnotatedString(String text, List<Range<SpanStyle>> list, List<Range<ParagraphStyle>> list2, List<? extends Range<? extends Object>> list3) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.spanStylesOrNull = list;
        this.paragraphStylesOrNull = list2;
        this.annotations = list3;
        int lastStyleEnd = -1;
        Iterable iterable = this.paragraphStylesOrNull;
        if (iterable == null) {
            return;
        }
        Iterable $this$sortedBy$iv = iterable;
        List $this$fastForEach$iv = CollectionsKt.sortedWith($this$sortedBy$iv, new Comparator() { // from class: androidx.compose.ui.text.AnnotatedString$special$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                AnnotatedString.Range it = (AnnotatedString.Range) t;
                AnnotatedString.Range it2 = (AnnotatedString.Range) t2;
                return ComparisonsKt.compareValues(Integer.valueOf(it.getStart()), Integer.valueOf(it2.getStart()));
            }
        });
        if ($this$fastForEach$iv == null) {
            return;
        }
        int size = $this$fastForEach$iv.size();
        for (int index$iv = 0; index$iv < size; index$iv++) {
            Object item$iv = $this$fastForEach$iv.get(index$iv);
            Range paragraphStyle = (Range) item$iv;
            if (!(paragraphStyle.getStart() >= lastStyleEnd)) {
                throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
            }
            if (!(paragraphStyle.getEnd() <= this.text.length())) {
                throw new IllegalArgumentException(("ParagraphStyle range [" + paragraphStyle.getStart() + ", " + paragraphStyle.getEnd() + ") is out of boundary").toString());
            }
            lastStyleEnd = paragraphStyle.getEnd();
        }
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int index) {
        return get(index);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public /* synthetic */ AnnotatedString(String str, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3);
    }

    public final String getText() {
        return this.text;
    }

    public final List<Range<SpanStyle>> getSpanStylesOrNull$ui_text_release() {
        return this.spanStylesOrNull;
    }

    public final List<Range<ParagraphStyle>> getParagraphStylesOrNull$ui_text_release() {
        return this.paragraphStylesOrNull;
    }

    public final List<Range<? extends Object>> getAnnotations$ui_text_release() {
        return this.annotations;
    }

    public final List<Range<SpanStyle>> getSpanStyles() {
        List<Range<SpanStyle>> list = this.spanStylesOrNull;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final List<Range<ParagraphStyle>> getParagraphStyles() {
        List<Range<ParagraphStyle>> list = this.paragraphStylesOrNull;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public /* synthetic */ AnnotatedString(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AnnotatedString(java.lang.String r5, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>> r6, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.ParagraphStyle>> r7) {
        /*
            r4 = this;
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "spanStyles"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "paragraphStyles"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto L20
            r0 = 0
            r0 = r2
        L20:
            java.util.List r0 = (java.util.List) r0
            r1 = r7
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L2d
            r1 = 0
            r1 = r2
        L2d:
            java.util.List r1 = (java.util.List) r1
            r4.<init>(r5, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.AnnotatedString.<init>(java.lang.String, java.util.List, java.util.List):void");
    }

    public int getLength() {
        return this.text.length();
    }

    public char get(int index) {
        return this.text.charAt(index);
    }

    @Override // java.lang.CharSequence
    public AnnotatedString subSequence(int startIndex, int endIndex) {
        List filterRanges;
        List filterRanges2;
        List filterRanges3;
        if (!(startIndex <= endIndex)) {
            throw new IllegalArgumentException(("start (" + startIndex + ") should be less or equal to end (" + endIndex + ')').toString());
        }
        if (startIndex == 0 && endIndex == this.text.length()) {
            return this;
        }
        String text = this.text.substring(startIndex, endIndex);
        Intrinsics.checkNotNullExpressionValue(text, "this as java.lang.String…ing(startIndex, endIndex)");
        filterRanges = AnnotatedStringKt.filterRanges(this.spanStylesOrNull, startIndex, endIndex);
        filterRanges2 = AnnotatedStringKt.filterRanges(this.paragraphStylesOrNull, startIndex, endIndex);
        filterRanges3 = AnnotatedStringKt.filterRanges(this.annotations, startIndex, endIndex);
        return new AnnotatedString(text, filterRanges, filterRanges2, filterRanges3);
    }

    /* renamed from: subSequence-5zc-tL8, reason: not valid java name */
    public final AnnotatedString m4599subSequence5zctL8(long range) {
        return subSequence(TextRange.m4722getMinimpl(range), TextRange.m4721getMaximpl(range));
    }

    public final AnnotatedString plus(AnnotatedString other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Builder $this$plus_u24lambda_u247 = new Builder(this);
        $this$plus_u24lambda_u247.append(other);
        return $this$plus_u24lambda_u247.toAnnotatedString();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<androidx.compose.ui.text.AnnotatedString.Range<java.lang.String>> getStringAnnotations(java.lang.String r17, int r18, int r19) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "tag"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = r16
            java.util.List<androidx.compose.ui.text.AnnotatedString$Range<? extends java.lang.Object>> r2 = r1.annotations
            if (r2 == 0) goto L72
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r2.size()
            r4.<init>(r5)
            r5 = r2
            r6 = 0
            r7 = 0
            int r8 = r5.size()
        L21:
            if (r7 >= r8) goto L69
            java.lang.Object r9 = r5.get(r7)
            r10 = r9
            r11 = 0
            r12 = r10
            androidx.compose.ui.text.AnnotatedString$Range r12 = (androidx.compose.ui.text.AnnotatedString.Range) r12
            r13 = 0
            java.lang.Object r14 = r12.getItem()
            boolean r14 = r14 instanceof java.lang.String
            if (r14 == 0) goto L53
            java.lang.String r14 = r12.getTag()
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r14)
            if (r14 == 0) goto L53
            int r14 = r12.getStart()
            int r15 = r12.getEnd()
            r0 = r18
            r1 = r19
            boolean r14 = androidx.compose.ui.text.AnnotatedStringKt.intersect(r0, r1, r14, r15)
            if (r14 == 0) goto L57
            r14 = 1
            goto L58
        L53:
            r0 = r18
            r1 = r19
        L57:
            r14 = 0
        L58:
            if (r14 == 0) goto L60
            r12 = r4
            java.util.Collection r12 = (java.util.Collection) r12
            r12.add(r10)
        L60:
            int r7 = r7 + 1
            r1 = r16
            r0 = r17
            goto L21
        L69:
            r0 = r18
            r1 = r19
            r2 = r4
            java.util.List r2 = (java.util.List) r2
            goto L7a
        L72:
            r0 = r18
            r1 = r19
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
        L7a:
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.AnnotatedString.getStringAnnotations(java.lang.String, int, int):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[LOOP:0: B:4:0x0018->B:13:0x0053, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean hasStringAnnotations(java.lang.String r17, int r18, int r19) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "tag"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = r16
            java.util.List<androidx.compose.ui.text.AnnotatedString$Range<? extends java.lang.Object>> r2 = r1.annotations
            if (r2 == 0) goto L60
            r4 = 0
            r5 = r2
            r6 = 0
            r7 = 0
            int r8 = r5.size()
        L18:
            if (r7 >= r8) goto L59
            java.lang.Object r9 = r5.get(r7)
            r10 = r9
            r11 = 0
            r12 = r10
            androidx.compose.ui.text.AnnotatedString$Range r12 = (androidx.compose.ui.text.AnnotatedString.Range) r12
            r13 = 0
            java.lang.Object r14 = r12.getItem()
            boolean r14 = r14 instanceof java.lang.String
            if (r14 == 0) goto L4a
            java.lang.String r14 = r12.getTag()
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r14)
            if (r14 == 0) goto L4a
            int r14 = r12.getStart()
            int r3 = r12.getEnd()
            r15 = r18
            r0 = r19
            boolean r3 = androidx.compose.ui.text.AnnotatedStringKt.intersect(r15, r0, r14, r3)
            if (r3 == 0) goto L4e
            r3 = 1
            goto L4f
        L4a:
            r15 = r18
            r0 = r19
        L4e:
            r3 = 0
        L4f:
            if (r3 == 0) goto L53
            r3 = 1
            goto L5f
        L53:
            int r7 = r7 + 1
            r0 = r17
            goto L18
        L59:
            r15 = r18
            r0 = r19
            r3 = 0
        L5f:
            goto L65
        L60:
            r15 = r18
            r0 = r19
            r3 = 0
        L65:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.AnnotatedString.hasStringAnnotations(java.lang.String, int, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<androidx.compose.ui.text.AnnotatedString.Range<java.lang.String>> getStringAnnotations(int r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            java.util.List<androidx.compose.ui.text.AnnotatedString$Range<? extends java.lang.Object>> r1 = r0.annotations
            if (r1 == 0) goto L5e
            r2 = 0
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r1.size()
            r3.<init>(r4)
            r4 = r1
            r5 = 0
            r6 = 0
            int r7 = r4.size()
        L19:
            if (r6 >= r7) goto L55
            java.lang.Object r8 = r4.get(r6)
            r9 = r8
            r10 = 0
            r11 = r9
            androidx.compose.ui.text.AnnotatedString$Range r11 = (androidx.compose.ui.text.AnnotatedString.Range) r11
            r12 = 0
            java.lang.Object r13 = r11.getItem()
            boolean r13 = r13 instanceof java.lang.String
            if (r13 == 0) goto L41
            int r13 = r11.getStart()
            int r14 = r11.getEnd()
            r15 = r17
            r0 = r18
            boolean r13 = androidx.compose.ui.text.AnnotatedStringKt.intersect(r15, r0, r13, r14)
            if (r13 == 0) goto L45
            r13 = 1
            goto L46
        L41:
            r15 = r17
            r0 = r18
        L45:
            r13 = 0
        L46:
            if (r13 == 0) goto L4e
            r11 = r3
            java.util.Collection r11 = (java.util.Collection) r11
            r11.add(r9)
        L4e:
            int r6 = r6 + 1
            r0 = r16
            goto L19
        L55:
            r15 = r17
            r0 = r18
            r1 = r3
            java.util.List r1 = (java.util.List) r1
            goto L66
        L5e:
            r15 = r17
            r0 = r18
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
        L66:
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.AnnotatedString.getStringAnnotations(int, int):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>> getTtsAnnotations(int r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            java.util.List<androidx.compose.ui.text.AnnotatedString$Range<? extends java.lang.Object>> r1 = r0.annotations
            if (r1 == 0) goto L5e
            r2 = 0
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r1.size()
            r3.<init>(r4)
            r4 = r1
            r5 = 0
            r6 = 0
            int r7 = r4.size()
        L19:
            if (r6 >= r7) goto L55
            java.lang.Object r8 = r4.get(r6)
            r9 = r8
            r10 = 0
            r11 = r9
            androidx.compose.ui.text.AnnotatedString$Range r11 = (androidx.compose.ui.text.AnnotatedString.Range) r11
            r12 = 0
            java.lang.Object r13 = r11.getItem()
            boolean r13 = r13 instanceof androidx.compose.ui.text.TtsAnnotation
            if (r13 == 0) goto L41
            int r13 = r11.getStart()
            int r14 = r11.getEnd()
            r15 = r17
            r0 = r18
            boolean r13 = androidx.compose.ui.text.AnnotatedStringKt.intersect(r15, r0, r13, r14)
            if (r13 == 0) goto L45
            r13 = 1
            goto L46
        L41:
            r15 = r17
            r0 = r18
        L45:
            r13 = 0
        L46:
            if (r13 == 0) goto L4e
            r11 = r3
            java.util.Collection r11 = (java.util.Collection) r11
            r11.add(r9)
        L4e:
            int r6 = r6 + 1
            r0 = r16
            goto L19
        L55:
            r15 = r17
            r0 = r18
            r1 = r3
            java.util.List r1 = (java.util.List) r1
            goto L66
        L5e:
            r15 = r17
            r0 = r18
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
        L66:
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.AnnotatedString.getTtsAnnotations(int, int):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>> getUrlAnnotations(int r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            java.util.List<androidx.compose.ui.text.AnnotatedString$Range<? extends java.lang.Object>> r1 = r0.annotations
            if (r1 == 0) goto L5e
            r2 = 0
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r1.size()
            r3.<init>(r4)
            r4 = r1
            r5 = 0
            r6 = 0
            int r7 = r4.size()
        L19:
            if (r6 >= r7) goto L55
            java.lang.Object r8 = r4.get(r6)
            r9 = r8
            r10 = 0
            r11 = r9
            androidx.compose.ui.text.AnnotatedString$Range r11 = (androidx.compose.ui.text.AnnotatedString.Range) r11
            r12 = 0
            java.lang.Object r13 = r11.getItem()
            boolean r13 = r13 instanceof androidx.compose.ui.text.UrlAnnotation
            if (r13 == 0) goto L41
            int r13 = r11.getStart()
            int r14 = r11.getEnd()
            r15 = r17
            r0 = r18
            boolean r13 = androidx.compose.ui.text.AnnotatedStringKt.intersect(r15, r0, r13, r14)
            if (r13 == 0) goto L45
            r13 = 1
            goto L46
        L41:
            r15 = r17
            r0 = r18
        L45:
            r13 = 0
        L46:
            if (r13 == 0) goto L4e
            r11 = r3
            java.util.Collection r11 = (java.util.Collection) r11
            r11.add(r9)
        L4e:
            int r6 = r6 + 1
            r0 = r16
            goto L19
        L55:
            r15 = r17
            r0 = r18
            r1 = r3
            java.util.List r1 = (java.util.List) r1
            goto L66
        L5e:
            r15 = r17
            r0 = r18
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
        L66:
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.AnnotatedString.getUrlAnnotations(int, int):java.util.List");
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AnnotatedString) && Intrinsics.areEqual(this.text, ((AnnotatedString) other).text) && Intrinsics.areEqual(this.spanStylesOrNull, ((AnnotatedString) other).spanStylesOrNull) && Intrinsics.areEqual(this.paragraphStylesOrNull, ((AnnotatedString) other).paragraphStylesOrNull) && Intrinsics.areEqual(this.annotations, ((AnnotatedString) other).annotations);
    }

    public int hashCode() {
        int result = this.text.hashCode();
        int i = result * 31;
        List<Range<SpanStyle>> list = this.spanStylesOrNull;
        int result2 = i + (list != null ? list.hashCode() : 0);
        int result3 = result2 * 31;
        List<Range<ParagraphStyle>> list2 = this.paragraphStylesOrNull;
        int result4 = (result3 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<Range<? extends Object>> list3 = this.annotations;
        return result4 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.text;
    }

    /* compiled from: AnnotatedString.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007B%\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0013\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J<\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Range;", "T", "", "item", "start", "", "end", "(Ljava/lang/Object;II)V", "tag", "", "(Ljava/lang/Object;IILjava/lang/String;)V", "getEnd", "()I", "getItem", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getStart", "getTag", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;IILjava/lang/String;)Landroidx/compose/ui/text/AnnotatedString$Range;", "equals", "", "other", "hashCode", "toString", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Range<T> {
        public static final int $stable = 0;
        private final int end;
        private final T item;
        private final int start;
        private final String tag;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Range copy$default(Range range, Object obj, int i, int i2, String str, int i3, Object obj2) {
            if ((i3 & 1) != 0) {
                obj = range.item;
            }
            if ((i3 & 2) != 0) {
                i = range.start;
            }
            if ((i3 & 4) != 0) {
                i2 = range.end;
            }
            if ((i3 & 8) != 0) {
                str = range.tag;
            }
            return range.copy(obj, i, i2, str);
        }

        public final T component1() {
            return this.item;
        }

        /* renamed from: component2, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* renamed from: component3, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        public final Range<T> copy(T item, int start, int end, String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            return new Range<>(item, start, end, tag);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Range)) {
                return false;
            }
            Range range = (Range) other;
            return Intrinsics.areEqual(this.item, range.item) && this.start == range.start && this.end == range.end && Intrinsics.areEqual(this.tag, range.tag);
        }

        public int hashCode() {
            return ((((((this.item == null ? 0 : this.item.hashCode()) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
        }

        public String toString() {
            return "Range(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
        }

        public Range(T t, int start, int end, String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.item = t;
            this.start = start;
            this.end = end;
            this.tag = tag;
            if (!(this.start <= this.end)) {
                throw new IllegalArgumentException("Reversed range is not supported".toString());
            }
        }

        public final int getEnd() {
            return this.end;
        }

        public final T getItem() {
            return this.item;
        }

        public final int getStart() {
            return this.start;
        }

        public final String getTag() {
            return this.tag;
        }

        public Range(T t, int start, int end) {
            this(t, start, end, "");
        }
    }

    /* compiled from: AnnotatedString.kt */
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\u0010\r\n\u0002\b\n\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00013B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u000f\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ&\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\tJ\u001e\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\tJ\u001e\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\tJ \u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\tH\u0007J \u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\tH\u0007J\u000e\u0010'\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0006J\u001e\u0010'\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\tJ\u0010\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)H\u0016J\u0012\u0010'\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010*H\u0016J\"\u0010'\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010*2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\tH\u0016J\u000e\u0010'\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0004J\u0015\u0010+\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020)H\u0007¢\u0006\u0002\b'J\u0006\u0010,\u001a\u00020\u001aJ\u000e\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\tJ\u0016\u0010.\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004J\u000e\u0010/\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0013J\u000e\u0010/\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0015J\u000e\u00100\u001a\u00020\t2\u0006\u0010\"\u001a\u00020#J\u0010\u00101\u001a\u00020\t2\u0006\u0010%\u001a\u00020&H\u0007J\u0006\u00102\u001a\u00020\u0006R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0003\u001a\u00060\u0017j\u0002`\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "text", "", "(Ljava/lang/String;)V", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;)V", "capacity", "", "(I)V", "annotations", "", "Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", "", "length", "getLength", "()I", "paragraphStyles", "Landroidx/compose/ui/text/ParagraphStyle;", "spanStyles", "Landroidx/compose/ui/text/SpanStyle;", "styleStack", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "addStringAnnotation", "", "tag", "annotation", "start", "end", "addStyle", "style", "addTtsAnnotation", "ttsAnnotation", "Landroidx/compose/ui/text/TtsAnnotation;", "addUrlAnnotation", "urlAnnotation", "Landroidx/compose/ui/text/UrlAnnotation;", "append", "char", "", "", "deprecated_append_returning_void", "pop", "index", "pushStringAnnotation", "pushStyle", "pushTtsAnnotation", "pushUrlAnnotation", "toAnnotatedString", "MutableRange", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder implements Appendable {
        public static final int $stable = 8;
        private final List<MutableRange<? extends Object>> annotations;
        private final List<MutableRange<ParagraphStyle>> paragraphStyles;
        private final List<MutableRange<SpanStyle>> spanStyles;
        private final List<MutableRange<? extends Object>> styleStack;
        private final StringBuilder text;

        public Builder() {
            this(0, 1, null);
        }

        public Builder(int capacity) {
            this.text = new StringBuilder(capacity);
            this.spanStyles = new ArrayList();
            this.paragraphStyles = new ArrayList();
            this.annotations = new ArrayList();
            this.styleStack = new ArrayList();
        }

        public /* synthetic */ Builder(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 16 : i);
        }

        /* compiled from: AnnotatedString.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\u0014\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J<\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\b\b\u0002\u0010 \u001a\u00020\u0005J\t\u0010!\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", "T", "", "item", "start", "", "end", "tag", "", "(Ljava/lang/Object;IILjava/lang/String;)V", "getEnd", "()I", "setEnd", "(I)V", "getItem", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getStart", "getTag", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;IILjava/lang/String;)Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", "equals", "", "other", "hashCode", "toRange", "Landroidx/compose/ui/text/AnnotatedString$Range;", "defaultEnd", "toString", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        private static final /* data */ class MutableRange<T> {
            private int end;
            private final T item;
            private final int start;
            private final String tag;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ MutableRange copy$default(MutableRange mutableRange, Object obj, int i, int i2, String str, int i3, Object obj2) {
                if ((i3 & 1) != 0) {
                    obj = mutableRange.item;
                }
                if ((i3 & 2) != 0) {
                    i = mutableRange.start;
                }
                if ((i3 & 4) != 0) {
                    i2 = mutableRange.end;
                }
                if ((i3 & 8) != 0) {
                    str = mutableRange.tag;
                }
                return mutableRange.copy(obj, i, i2, str);
            }

            public final T component1() {
                return this.item;
            }

            /* renamed from: component2, reason: from getter */
            public final int getStart() {
                return this.start;
            }

            /* renamed from: component3, reason: from getter */
            public final int getEnd() {
                return this.end;
            }

            /* renamed from: component4, reason: from getter */
            public final String getTag() {
                return this.tag;
            }

            public final MutableRange<T> copy(T item, int start, int end, String tag) {
                Intrinsics.checkNotNullParameter(tag, "tag");
                return new MutableRange<>(item, start, end, tag);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MutableRange)) {
                    return false;
                }
                MutableRange mutableRange = (MutableRange) other;
                return Intrinsics.areEqual(this.item, mutableRange.item) && this.start == mutableRange.start && this.end == mutableRange.end && Intrinsics.areEqual(this.tag, mutableRange.tag);
            }

            public int hashCode() {
                return ((((((this.item == null ? 0 : this.item.hashCode()) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
            }

            public String toString() {
                return "MutableRange(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
            }

            public MutableRange(T t, int start, int end, String tag) {
                Intrinsics.checkNotNullParameter(tag, "tag");
                this.item = t;
                this.start = start;
                this.end = end;
                this.tag = tag;
            }

            public /* synthetic */ MutableRange(Object obj, int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this(obj, i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, (i3 & 8) != 0 ? "" : str);
            }

            public final T getItem() {
                return this.item;
            }

            public final int getStart() {
                return this.start;
            }

            public final int getEnd() {
                return this.end;
            }

            public final void setEnd(int i) {
                this.end = i;
            }

            public final String getTag() {
                return this.tag;
            }

            public static /* synthetic */ Range toRange$default(MutableRange mutableRange, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = Integer.MIN_VALUE;
                }
                return mutableRange.toRange(i);
            }

            public final Range<T> toRange(int defaultEnd) {
                int end = this.end == Integer.MIN_VALUE ? defaultEnd : this.end;
                if (end != Integer.MIN_VALUE) {
                    return new Range<>(this.item, this.start, end, this.tag);
                }
                throw new IllegalStateException("Item.end should be set first".toString());
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(String text) {
            this(0, 1, null);
            Intrinsics.checkNotNullParameter(text, "text");
            append(text);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(AnnotatedString text) {
            this(0, 1, null);
            Intrinsics.checkNotNullParameter(text, "text");
            append(text);
        }

        public final int getLength() {
            return this.text.length();
        }

        public final void append(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text.append(text);
        }

        @Override // java.lang.Appendable
        public Builder append(CharSequence text) {
            if (text instanceof AnnotatedString) {
                append((AnnotatedString) text);
            } else {
                this.text.append(text);
            }
            return this;
        }

        @Override // java.lang.Appendable
        public Builder append(CharSequence text, int start, int end) {
            if (text instanceof AnnotatedString) {
                append((AnnotatedString) text, start, end);
            } else {
                this.text.append(text, start, end);
            }
            return this;
        }

        @Override // java.lang.Appendable
        public Builder append(char r2) {
            this.text.append(r2);
            return this;
        }

        public final void append(AnnotatedString text) {
            Intrinsics.checkNotNullParameter(text, "text");
            int start = this.text.length();
            this.text.append(text.getText());
            List $this$fastForEach$iv = text.getSpanStylesOrNull$ui_text_release();
            if ($this$fastForEach$iv != null) {
                int size = $this$fastForEach$iv.size();
                for (int index$iv = 0; index$iv < size; index$iv++) {
                    Object item$iv = $this$fastForEach$iv.get(index$iv);
                    Range it = (Range) item$iv;
                    addStyle(it.getItem(), it.getStart() + start, it.getEnd() + start);
                }
            }
            List $this$fastForEach$iv2 = text.getParagraphStylesOrNull$ui_text_release();
            if ($this$fastForEach$iv2 != null) {
                int size2 = $this$fastForEach$iv2.size();
                for (int index$iv2 = 0; index$iv2 < size2; index$iv2++) {
                    Object item$iv2 = $this$fastForEach$iv2.get(index$iv2);
                    Range it2 = (Range) item$iv2;
                    addStyle(it2.getItem(), it2.getStart() + start, it2.getEnd() + start);
                }
            }
            List $this$fastForEach$iv3 = text.getAnnotations$ui_text_release();
            if ($this$fastForEach$iv3 == null) {
                return;
            }
            int size3 = $this$fastForEach$iv3.size();
            for (int index$iv3 = 0; index$iv3 < size3; index$iv3++) {
                Object item$iv3 = $this$fastForEach$iv3.get(index$iv3);
                Range it3 = (Range) item$iv3;
                this.annotations.add(new MutableRange<>(it3.getItem(), it3.getStart() + start, it3.getEnd() + start, it3.getTag()));
            }
        }

        public final void append(AnnotatedString text, int start, int end) {
            List $this$fastForEach$iv;
            List $this$fastForEach$iv2;
            List $this$fastForEach$iv3;
            Builder builder = this;
            Intrinsics.checkNotNullParameter(text, "text");
            int insertionStart = builder.text.length();
            builder.text.append((CharSequence) text.getText(), start, end);
            $this$fastForEach$iv = AnnotatedStringKt.getLocalSpanStyles(text, start, end);
            if ($this$fastForEach$iv != null) {
                int size = $this$fastForEach$iv.size();
                for (int index$iv = 0; index$iv < size; index$iv++) {
                    Object item$iv = $this$fastForEach$iv.get(index$iv);
                    Range it = (Range) item$iv;
                    builder.addStyle((SpanStyle) it.getItem(), it.getStart() + insertionStart, it.getEnd() + insertionStart);
                }
            }
            $this$fastForEach$iv2 = AnnotatedStringKt.getLocalParagraphStyles(text, start, end);
            if ($this$fastForEach$iv2 != null) {
                int size2 = $this$fastForEach$iv2.size();
                for (int index$iv2 = 0; index$iv2 < size2; index$iv2++) {
                    Object item$iv2 = $this$fastForEach$iv2.get(index$iv2);
                    Range it2 = (Range) item$iv2;
                    builder.addStyle((ParagraphStyle) it2.getItem(), it2.getStart() + insertionStart, it2.getEnd() + insertionStart);
                }
            }
            $this$fastForEach$iv3 = AnnotatedStringKt.getLocalAnnotations(text, start, end);
            if ($this$fastForEach$iv3 == null) {
                return;
            }
            int index$iv3 = 0;
            int size3 = $this$fastForEach$iv3.size();
            while (index$iv3 < size3) {
                Object item$iv3 = $this$fastForEach$iv3.get(index$iv3);
                Range it3 = (Range) item$iv3;
                builder.annotations.add(new MutableRange<>(it3.getItem(), it3.getStart() + insertionStart, insertionStart + it3.getEnd(), it3.getTag()));
                index$iv3++;
                builder = this;
                insertionStart = insertionStart;
            }
        }

        public final void addStyle(SpanStyle style, int start, int end) {
            Intrinsics.checkNotNullParameter(style, "style");
            this.spanStyles.add(new MutableRange<>(style, start, end, null, 8, null));
        }

        public final void addStyle(ParagraphStyle style, int start, int end) {
            Intrinsics.checkNotNullParameter(style, "style");
            this.paragraphStyles.add(new MutableRange<>(style, start, end, null, 8, null));
        }

        public final void addStringAnnotation(String tag, String annotation, int start, int end) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(annotation, "annotation");
            this.annotations.add(new MutableRange<>(annotation, start, end, tag));
        }

        public final void addTtsAnnotation(TtsAnnotation ttsAnnotation, int start, int end) {
            Intrinsics.checkNotNullParameter(ttsAnnotation, "ttsAnnotation");
            this.annotations.add(new MutableRange<>(ttsAnnotation, start, end, null, 8, null));
        }

        public final void addUrlAnnotation(UrlAnnotation urlAnnotation, int start, int end) {
            Intrinsics.checkNotNullParameter(urlAnnotation, "urlAnnotation");
            this.annotations.add(new MutableRange<>(urlAnnotation, start, end, null, 8, null));
        }

        public final int pushStyle(SpanStyle style) {
            Intrinsics.checkNotNullParameter(style, "style");
            MutableRange it = new MutableRange(style, this.text.length(), 0, null, 12, null);
            this.styleStack.add(it);
            this.spanStyles.add(it);
            return this.styleStack.size() - 1;
        }

        public final int pushStyle(ParagraphStyle style) {
            Intrinsics.checkNotNullParameter(style, "style");
            MutableRange it = new MutableRange(style, this.text.length(), 0, null, 12, null);
            this.styleStack.add(it);
            this.paragraphStyles.add(it);
            return this.styleStack.size() - 1;
        }

        public final int pushStringAnnotation(String tag, String annotation) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(annotation, "annotation");
            MutableRange it = new MutableRange(annotation, this.text.length(), 0, tag, 4, null);
            this.styleStack.add(it);
            this.annotations.add(it);
            return this.styleStack.size() - 1;
        }

        public final int pushTtsAnnotation(TtsAnnotation ttsAnnotation) {
            Intrinsics.checkNotNullParameter(ttsAnnotation, "ttsAnnotation");
            MutableRange it = new MutableRange(ttsAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(it);
            this.annotations.add(it);
            return this.styleStack.size() - 1;
        }

        public final int pushUrlAnnotation(UrlAnnotation urlAnnotation) {
            Intrinsics.checkNotNullParameter(urlAnnotation, "urlAnnotation");
            MutableRange it = new MutableRange(urlAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(it);
            this.annotations.add(it);
            return this.styleStack.size() - 1;
        }

        public final void pop() {
            if (!(!this.styleStack.isEmpty())) {
                throw new IllegalStateException("Nothing to pop.".toString());
            }
            MutableRange item = this.styleStack.remove(this.styleStack.size() - 1);
            item.setEnd(this.text.length());
        }

        public final void pop(int index) {
            if (!(index < this.styleStack.size())) {
                throw new IllegalStateException((index + " should be less than " + this.styleStack.size()).toString());
            }
            while (this.styleStack.size() - 1 >= index) {
                pop();
            }
        }

        public final AnnotatedString toAnnotatedString() {
            String sb = this.text.toString();
            Intrinsics.checkNotNullExpressionValue(sb, "text.toString()");
            List $this$fastMap$iv = this.spanStyles;
            List target$iv = new ArrayList($this$fastMap$iv.size());
            int size = $this$fastMap$iv.size();
            for (int index$iv$iv = 0; index$iv$iv < size; index$iv$iv++) {
                Object item$iv$iv = $this$fastMap$iv.get(index$iv$iv);
                MutableRange it = (MutableRange) item$iv$iv;
                target$iv.add(it.toRange(this.text.length()));
            }
            List $this$fastMap$iv2 = target$iv;
            if ($this$fastMap$iv2.isEmpty()) {
                $this$fastMap$iv2 = null;
            }
            List list = $this$fastMap$iv2;
            List $this$fastMap$iv3 = this.paragraphStyles;
            List target$iv2 = new ArrayList($this$fastMap$iv3.size());
            int size2 = $this$fastMap$iv3.size();
            for (int index$iv$iv2 = 0; index$iv$iv2 < size2; index$iv$iv2++) {
                Object item$iv$iv2 = $this$fastMap$iv3.get(index$iv$iv2);
                MutableRange it2 = (MutableRange) item$iv$iv2;
                target$iv2.add(it2.toRange(this.text.length()));
            }
            List $this$fastMap$iv4 = target$iv2;
            if ($this$fastMap$iv4.isEmpty()) {
                $this$fastMap$iv4 = null;
            }
            List list2 = $this$fastMap$iv4;
            List $this$fastMap$iv5 = this.annotations;
            ArrayList target$iv3 = new ArrayList($this$fastMap$iv5.size());
            int index$iv$iv3 = 0;
            int size3 = $this$fastMap$iv5.size();
            while (index$iv$iv3 < size3) {
                Object item$iv$iv3 = $this$fastMap$iv5.get(index$iv$iv3);
                MutableRange it3 = (MutableRange) item$iv$iv3;
                target$iv3.add(it3.toRange(this.text.length()));
                index$iv$iv3++;
                $this$fastMap$iv5 = $this$fastMap$iv5;
            }
            ArrayList arrayList = target$iv3;
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            return new AnnotatedString(sb, list, list2, arrayList);
        }
    }
}
