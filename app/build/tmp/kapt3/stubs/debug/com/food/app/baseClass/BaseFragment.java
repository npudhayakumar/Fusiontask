package com.food.app.baseClass;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u00104\u001a\u000205H%J\u0016\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;J\u0012\u0010<\u001a\u0002072\b\u0010#\u001a\u0004\u0018\u00010\u0002H$J\u0010\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0002J\u0010\u0010A\u001a\u00020>2\u0006\u0010B\u001a\u00020@H\u0002J\u0010\u0010C\u001a\u00020>2\u0006\u0010D\u001a\u00020@H\u0002J\u0010\u0010E\u001a\u00020>2\u0006\u0010F\u001a\u00020@H\u0002J\u0010\u0010G\u001a\u00020>2\u0006\u0010H\u001a\u00020@H\u0002J\u0010\u0010I\u001a\u00020>2\u0006\u0010J\u001a\u00020@H\u0002J\u0010\u0010K\u001a\u00020>2\u0006\u0010L\u001a\u00020@H\u0002J&\u0010M\u001a\u0002072\u0006\u0010N\u001a\u00020\u00032\u0006\u0010O\u001a\u0002052\u0006\u0010P\u001a\u0002092\u0006\u0010Q\u001a\u00020>J&\u0010R\u001a\u0002072\u0006\u0010N\u001a\u00020\u00032\u0006\u0010O\u001a\u0002052\u0006\u0010P\u001a\u0002092\u0006\u0010Q\u001a\u00020>J*\u0010S\u001a\u0002072\u0006\u0010T\u001a\u0002052\b\u0010N\u001a\u0004\u0018\u00010\u00032\b\u0010U\u001a\u0004\u0018\u00010V2\u0006\u0010W\u001a\u00020>J\u0012\u0010X\u001a\u0002072\b\u0010Y\u001a\u0004\u0018\u00010VH\u0016J&\u0010Z\u001a\u0004\u0018\u00010/2\u0006\u0010[\u001a\u00020\\2\b\u0010]\u001a\u0004\u0018\u00010^2\b\u0010Y\u001a\u0004\u0018\u00010VH\u0016J\b\u0010_\u001a\u000207H\u0016J\u000e\u0010`\u001a\u0002092\u0006\u0010P\u001a\u000209J\u001a\u0010a\u001a\u0002072\n\u0010b\u001a\u0006\u0012\u0002\b\u00030c2\u0006\u0010d\u001a\u000205J\u001a\u0010e\u001a\u0002072\u0006\u0010f\u001a\u0002092\b\u0010g\u001a\u0004\u0018\u00010/H\u0002J\u0016\u0010h\u001a\u0002072\u0006\u0010f\u001a\u0002092\u0006\u0010g\u001a\u00020/J\u000e\u0010i\u001a\u0002072\u0006\u0010f\u001a\u000209J\u0012\u0010j\u001a\u000207*\u00020\u00062\u0006\u0010g\u001a\u00020/J\n\u0010j\u001a\u000207*\u00020\u0003J\u001e\u0010k\u001a\u000207*\u00020/2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002070mR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010(\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001b\u0010)\u001a\u00020*8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b-\u0010\u0010\u001a\u0004\b+\u0010,R\u001a\u0010.\u001a\u00020/X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103\u00a8\u0006n"}, d2 = {"Lcom/food/app/baseClass/BaseFragment;", "T", "Landroidx/databinding/ViewDataBinding;", "Landroidx/fragment/app/Fragment;", "()V", "activitys", "Landroid/app/Activity;", "getActivitys", "()Landroid/app/Activity;", "setActivitys", "(Landroid/app/Activity;)V", "commonFunction", "Lcom/food/app/utility/CommonFunction;", "getCommonFunction", "()Lcom/food/app/utility/CommonFunction;", "commonFunction$delegate", "Lkotlin/Lazy;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "setDisposable", "(Lio/reactivex/disposables/CompositeDisposable;)V", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "getFragmentActivity", "()Landroidx/fragment/app/FragmentActivity;", "setFragmentActivity", "(Landroidx/fragment/app/FragmentActivity;)V", "fragmentManagers", "Landroidx/fragment/app/FragmentManager;", "getFragmentManagers", "()Landroidx/fragment/app/FragmentManager;", "setFragmentManagers", "(Landroidx/fragment/app/FragmentManager;)V", "mViewDataBinding", "getMViewDataBinding", "()Landroidx/databinding/ViewDataBinding;", "setMViewDataBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "sharedHelper", "Lcom/food/app/utility/SharedHelper;", "getSharedHelper", "()Lcom/food/app/utility/SharedHelper;", "sharedHelper$delegate", "views", "Landroid/view/View;", "getViews", "()Landroid/view/View;", "setViews", "(Landroid/view/View;)V", "getLayoutId", "", "glideApp", "", "imagePath", "", "Images", "Landroid/widget/ImageView;", "initView", "isValidAadhaar", "", "aadhaar", "", "isValidEmail", "email", "isValidFssai", "fssai", "isValidIFSC", "ifsc", "isValidPAN", "pan", "isValidPassword", "password", "isValidPhoneNumber", "phoneNumber", "loadFragment", "fragment", "layoutId", "tag", "isBack", "loadingFragment", "movoToFragment", "fragmentid", "bundle", "Landroid/os/Bundle;", "isbackStack", "onCreate", "savedInstanceState", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "removeFragmentWithTag", "setIntent", "cObjection", "Ljava/lang/Class;", "isFrom", "showNetworkSnackBar", "message", "view", "showSnackBar", "showToast", "hideKeyboard", "setSafeOnClickListener", "onSafeClick", "Lkotlin/Function1;", "app_debug"})
public abstract class BaseFragment<T extends androidx.databinding.ViewDataBinding> extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public T mViewDataBinding;
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.disposables.CompositeDisposable disposable;
    @org.jetbrains.annotations.Nullable()
    private androidx.fragment.app.FragmentActivity fragmentActivity;
    @org.jetbrains.annotations.Nullable()
    private androidx.fragment.app.FragmentManager fragmentManagers;
    @org.jetbrains.annotations.NotNull()
    public android.view.View views;
    @org.jetbrains.annotations.NotNull()
    public android.app.Activity activitys;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy commonFunction$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy sharedHelper$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final T getMViewDataBinding() {
        return null;
    }
    
    public final void setMViewDataBinding(@org.jetbrains.annotations.NotNull()
    T p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.CompositeDisposable getDisposable() {
        return null;
    }
    
    public final void setDisposable(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.fragment.app.FragmentActivity getFragmentActivity() {
        return null;
    }
    
    public final void setFragmentActivity(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.FragmentActivity p0) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity getActivitys() {
        return null;
    }
    
    public final void setActivitys(@org.jetbrains.annotations.NotNull()
    android.app.Activity p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.food.app.utility.CommonFunction getCommonFunction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.food.app.utility.SharedHelper getSharedHelper() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    protected abstract void initView(@org.jetbrains.annotations.Nullable()
    androidx.databinding.ViewDataBinding mViewDataBinding);
    
    @androidx.annotation.LayoutRes()
    protected abstract int getLayoutId();
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public final void glideApp(@org.jetbrains.annotations.NotNull()
    java.lang.String imagePath, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView Images) {
    }
    
    public final void showSnackBar(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final void showNetworkSnackBar(java.lang.String message, android.view.View view) {
    }
    
    public final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$hideKeyboard) {
    }
    
    public final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$hideKeyboard, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void showToast(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void loadFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, int layoutId, @org.jetbrains.annotations.NotNull()
    java.lang.String tag, boolean isBack) {
    }
    
    public final void loadingFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, int layoutId, @org.jetbrains.annotations.NotNull()
    java.lang.String tag, boolean isBack) {
    }
    
    public final void movoToFragment(int fragmentid, @org.jetbrains.annotations.Nullable()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.Nullable()
    android.os.Bundle bundle, boolean isbackStack) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String removeFragmentWithTag(@org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
        return null;
    }
    
    public final void setIntent(@org.jetbrains.annotations.NotNull()
    java.lang.Class<?> cObjection, int isFrom) {
    }
    
    public final void setSafeOnClickListener(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setSafeOnClickListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> onSafeClick) {
    }
    
    private final boolean isValidEmail(java.lang.CharSequence email) {
        return false;
    }
    
    private final boolean isValidPhoneNumber(java.lang.CharSequence phoneNumber) {
        return false;
    }
    
    private final boolean isValidPassword(java.lang.CharSequence password) {
        return false;
    }
    
    private final boolean isValidPAN(java.lang.CharSequence pan) {
        return false;
    }
    
    private final boolean isValidIFSC(java.lang.CharSequence ifsc) {
        return false;
    }
    
    private final boolean isValidAadhaar(java.lang.CharSequence aadhaar) {
        return false;
    }
    
    private final boolean isValidFssai(java.lang.CharSequence fssai) {
        return false;
    }
    
    public BaseFragment() {
        super();
    }
}