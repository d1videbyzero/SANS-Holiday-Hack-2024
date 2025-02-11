package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeyondBoundsLayout.kt */
@Metadata(d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0019\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0006¢\u0006\u0002\b\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"searchBeyondBounds", "T", "Landroidx/compose/ui/focus/FocusTargetNode;", "direction", "Landroidx/compose/ui/focus/FocusDirection;", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "Lkotlin/ExtensionFunctionType;", "searchBeyondBounds--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BeyondBoundsLayoutKt {
    /* renamed from: searchBeyondBounds--OM-vw8, reason: not valid java name */
    public static final <T> T m2623searchBeyondBoundsOMvw8(FocusTargetNode searchBeyondBounds, int i, Function1<? super BeyondBoundsLayout.BeyondBoundsScope, ? extends T> block) {
        Modifier.Node node;
        T t;
        int m4170getBeforehoxUOeE;
        FocusTargetNode focusTargetNode;
        int i2;
        int i3;
        NodeChain nodes;
        FocusTargetNode focusTargetNode2;
        int i4;
        int i5;
        FocusTargetNode focusTargetNode3;
        int i6;
        int i7;
        int i8;
        MutableVector mutableVector;
        Intrinsics.checkNotNullParameter(searchBeyondBounds, "$this$searchBeyondBounds");
        Intrinsics.checkNotNullParameter(block, "block");
        FocusTargetNode focusTargetNode4 = searchBeyondBounds;
        int m4398constructorimpl = NodeKind.m4398constructorimpl(1024);
        int i9 = 0;
        if (!focusTargetNode4.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node parent = focusTargetNode4.getNode().getParent();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode4);
        loop0: while (true) {
            if (requireLayoutNode == null) {
                node = null;
                break;
            }
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m4398constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & m4398constructorimpl) != 0) {
                        MutableVector mutableVector2 = null;
                        Modifier.Node node2 = parent;
                        while (node2 != null) {
                            if (node2 instanceof FocusTargetNode) {
                                node = node2;
                                break loop0;
                            }
                            if (((node2.getKindSet() & m4398constructorimpl) != 0 ? 1 : 0) == 0 || !(node2 instanceof DelegatingNode)) {
                                focusTargetNode2 = focusTargetNode4;
                                i4 = m4398constructorimpl;
                                i5 = i9;
                            } else {
                                int i10 = 0;
                                Modifier.Node delegate = ((DelegatingNode) node2).getDelegate();
                                while (delegate != null) {
                                    Modifier.Node node3 = delegate;
                                    if ((node3.getKindSet() & m4398constructorimpl) != 0) {
                                        i10++;
                                        focusTargetNode3 = focusTargetNode4;
                                        if (i10 == 1) {
                                            node2 = node3;
                                            i6 = m4398constructorimpl;
                                            i7 = i9;
                                        } else {
                                            if (mutableVector2 == null) {
                                                i8 = i10;
                                                i6 = m4398constructorimpl;
                                                i7 = i9;
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            } else {
                                                i8 = i10;
                                                i6 = m4398constructorimpl;
                                                i7 = i9;
                                                mutableVector = mutableVector2;
                                            }
                                            MutableVector mutableVector3 = mutableVector;
                                            Modifier.Node node4 = node2;
                                            if (node4 != null) {
                                                if (mutableVector3 != null) {
                                                    mutableVector3.add(node4);
                                                }
                                                node2 = null;
                                            }
                                            if (mutableVector3 != null) {
                                                mutableVector3.add(node3);
                                            }
                                            mutableVector2 = mutableVector3;
                                            i10 = i8;
                                        }
                                    } else {
                                        focusTargetNode3 = focusTargetNode4;
                                        i6 = m4398constructorimpl;
                                        i7 = i9;
                                    }
                                    delegate = delegate.getChild();
                                    focusTargetNode4 = focusTargetNode3;
                                    m4398constructorimpl = i6;
                                    i9 = i7;
                                }
                                focusTargetNode2 = focusTargetNode4;
                                i4 = m4398constructorimpl;
                                i5 = i9;
                                if (i10 == 1) {
                                    focusTargetNode4 = focusTargetNode2;
                                    m4398constructorimpl = i4;
                                    i9 = i5;
                                }
                            }
                            node2 = DelegatableNodeKt.pop(mutableVector2);
                            focusTargetNode4 = focusTargetNode2;
                            m4398constructorimpl = i4;
                            i9 = i5;
                        }
                    }
                    parent = parent.getParent();
                    focusTargetNode4 = focusTargetNode4;
                    m4398constructorimpl = m4398constructorimpl;
                    i9 = i9;
                }
                focusTargetNode = focusTargetNode4;
                i2 = m4398constructorimpl;
                i3 = i9;
            } else {
                focusTargetNode = focusTargetNode4;
                i2 = m4398constructorimpl;
                i3 = i9;
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            parent = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
            focusTargetNode4 = focusTargetNode;
            m4398constructorimpl = i2;
            i9 = i3;
        }
        FocusTargetNode focusTargetNode5 = (FocusTargetNode) node;
        if (focusTargetNode5 == null) {
            t = null;
        } else {
            if (Intrinsics.areEqual(focusTargetNode5.getBeyondBoundsLayoutParent(), searchBeyondBounds.getBeyondBoundsLayoutParent())) {
                return null;
            }
            t = null;
        }
        BeyondBoundsLayout beyondBoundsLayoutParent = searchBeyondBounds.getBeyondBoundsLayoutParent();
        if (beyondBoundsLayoutParent == null) {
            return t;
        }
        if (FocusDirection.m2627equalsimpl0(i, FocusDirection.INSTANCE.m2644getUpdhqQ8s())) {
            m4170getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m4168getAbovehoxUOeE();
        } else if (FocusDirection.m2627equalsimpl0(i, FocusDirection.INSTANCE.m2635getDowndhqQ8s())) {
            m4170getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m4171getBelowhoxUOeE();
        } else if (FocusDirection.m2627equalsimpl0(i, FocusDirection.INSTANCE.m2639getLeftdhqQ8s())) {
            m4170getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m4172getLefthoxUOeE();
        } else if (FocusDirection.m2627equalsimpl0(i, FocusDirection.INSTANCE.m2643getRightdhqQ8s())) {
            m4170getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m4173getRighthoxUOeE();
        } else if (FocusDirection.m2627equalsimpl0(i, FocusDirection.INSTANCE.m2640getNextdhqQ8s())) {
            m4170getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m4169getAfterhoxUOeE();
        } else {
            if (!FocusDirection.m2627equalsimpl0(i, FocusDirection.INSTANCE.m2642getPreviousdhqQ8s())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
            }
            m4170getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m4170getBeforehoxUOeE();
        }
        return (T) beyondBoundsLayoutParent.mo636layouto7g1Pn8(m4170getBeforehoxUOeE, block);
    }
}
