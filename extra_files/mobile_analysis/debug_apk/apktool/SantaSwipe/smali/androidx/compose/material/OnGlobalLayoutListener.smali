.class final Landroidx/compose/material/OnGlobalLayoutListener;
.super Ljava/lang/Object;
.source "ExposedDropdownMenu.kt"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\u0008J\u0006\u0010\u000b\u001a\u00020\u0007J\u0008\u0010\u000c\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\u0008\u0010\u0010\u001a\u00020\u0007H\u0002J\u0008\u0010\u0011\u001a\u00020\u0007H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroidx/compose/material/OnGlobalLayoutListener;",
        "Landroid/view/View$OnAttachStateChangeListener;",
        "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;",
        "view",
        "Landroid/view/View;",
        "onGlobalLayoutCallback",
        "Lkotlin/Function0;",
        "",
        "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V",
        "isListeningToGlobalLayout",
        "",
        "dispose",
        "onGlobalLayout",
        "onViewAttachedToWindow",
        "p0",
        "onViewDetachedFromWindow",
        "registerOnGlobalLayoutListener",
        "unregisterOnGlobalLayoutListener",
        "material_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private isListeningToGlobalLayout:Z

.field private final onGlobalLayoutCallback:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final view:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V
    .locals 2
    .param p1, "view"    # Landroid/view/View;
    .param p2, "onGlobalLayoutCallback"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string/jumbo v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "onGlobalLayoutCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 162
    iput-object p1, p0, Landroidx/compose/material/OnGlobalLayoutListener;->view:Landroid/view/View;

    .line 163
    iput-object p2, p0, Landroidx/compose/material/OnGlobalLayoutListener;->onGlobalLayoutCallback:Lkotlin/jvm/functions/Function0;

    .line 167
    nop

    .line 168
    iget-object v0, p0, Landroidx/compose/material/OnGlobalLayoutListener;->view:Landroid/view/View;

    move-object v1, p0

    check-cast v1, Landroid/view/View$OnAttachStateChangeListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 169
    invoke-direct {p0}, Landroidx/compose/material/OnGlobalLayoutListener;->registerOnGlobalLayoutListener()V

    .line 170
    nop

    .line 161
    return-void
.end method

.method private final registerOnGlobalLayoutListener()V
    .locals 2

    .line 179
    iget-boolean v0, p0, Landroidx/compose/material/OnGlobalLayoutListener;->isListeningToGlobalLayout:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/compose/material/OnGlobalLayoutListener;->view:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 180
    :cond_0
    iget-object v0, p0, Landroidx/compose/material/OnGlobalLayoutListener;->view:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    move-object v1, p0

    check-cast v1, Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 181
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/material/OnGlobalLayoutListener;->isListeningToGlobalLayout:Z

    .line 182
    return-void

    .line 179
    :cond_1
    :goto_0
    return-void
.end method

.method private final unregisterOnGlobalLayoutListener()V
    .locals 2

    .line 185
    iget-boolean v0, p0, Landroidx/compose/material/OnGlobalLayoutListener;->isListeningToGlobalLayout:Z

    if-nez v0, :cond_0

    return-void

    .line 186
    :cond_0
    iget-object v0, p0, Landroidx/compose/material/OnGlobalLayoutListener;->view:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    move-object v1, p0

    check-cast v1, Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 187
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/compose/material/OnGlobalLayoutListener;->isListeningToGlobalLayout:Z

    .line 188
    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 2

    .line 191
    invoke-direct {p0}, Landroidx/compose/material/OnGlobalLayoutListener;->unregisterOnGlobalLayoutListener()V

    .line 192
    iget-object v0, p0, Landroidx/compose/material/OnGlobalLayoutListener;->view:Landroid/view/View;

    move-object v1, p0

    check-cast v1, Landroid/view/View$OnAttachStateChangeListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 193
    return-void
.end method

.method public onGlobalLayout()V
    .locals 1

    .line 176
    iget-object v0, p0, Landroidx/compose/material/OnGlobalLayoutListener;->onGlobalLayoutCallback:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1
    .param p1, "p0"    # Landroid/view/View;

    const-string/jumbo v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    invoke-direct {p0}, Landroidx/compose/material/OnGlobalLayoutListener;->registerOnGlobalLayoutListener()V

    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 1
    .param p1, "p0"    # Landroid/view/View;

    const-string/jumbo v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    invoke-direct {p0}, Landroidx/compose/material/OnGlobalLayoutListener;->unregisterOnGlobalLayoutListener()V

    return-void
.end method
