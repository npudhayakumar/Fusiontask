package com.astrology.app.baseClass;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001cH\u0004J\u0014\u0010!\u001a\u00020\u001e2\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010$\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010%\u001a\u00020&2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010\'\u001a\u00020\u001eH\u0016J\b\u0010(\u001a\u00020\u001eH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006)"}, d2 = {"Lcom/astrology/app/baseClass/BaseBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "setDisposable", "(Lio/reactivex/disposables/CompositeDisposable;)V", "fragmentManagers", "Landroidx/fragment/app/FragmentManager;", "getFragmentManagers", "()Landroidx/fragment/app/FragmentManager;", "setFragmentManagers", "(Landroidx/fragment/app/FragmentManager;)V", "views", "Landroid/view/View;", "getViews", "()Landroid/view/View;", "setViews", "(Landroid/view/View;)V", "getTheme", "", "intent", "", "Landroid/content/Intent;", "ins", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onCreateDialog", "Landroid/app/Dialog;", "onDestroy", "onDestroyView", "app_debug"})
public abstract class BaseBottomSheetFragment extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.disposables.CompositeDisposable disposable;
    @org.jetbrains.annotations.NotNull()
    public android.app.Activity activity;
    @org.jetbrains.annotations.Nullable()
    private androidx.fragment.app.FragmentManager fragmentManagers;
    @org.jetbrains.annotations.NotNull()
    public android.view.View views;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.CompositeDisposable getDisposable() {
        return null;
    }
    
    public final void setDisposable(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity getActivity() {
        return null;
    }
    
    public final void setActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.fragment.app.FragmentManager getFragmentManagers() {
        return null;
    }
    
    public final void setFragmentManagers(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.FragmentManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getViews() {
        return null;
    }
    
    public final void setViews(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @java.lang.Override()
    public int getTheme() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    protected final void intent(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent, int ins) {
    }
    
    public BaseBottomSheetFragment() {
        super();
    }
}