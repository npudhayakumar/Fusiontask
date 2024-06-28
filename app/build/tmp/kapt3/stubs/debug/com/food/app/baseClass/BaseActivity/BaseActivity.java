package com.food.app.baseClass.BaseActivity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001a\u00107\u001a\u0002082\b\u0010\u0005\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u00010;J\u000e\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020>J\b\u0010?\u001a\u00020@H%J\u0006\u0010A\u001a\u000208J\u0012\u0010B\u001a\u0002082\b\u0010,\u001a\u0004\u0018\u00010\u0002H$J\u000f\u0010C\u001a\u0004\u0018\u00010\rH\u0004\u00a2\u0006\u0002\u0010DJ\u0014\u0010E\u001a\u00020\r2\n\u0010F\u001a\u0006\u0012\u0002\b\u00030GH\u0002J\u0010\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020JH\u0002J\u0010\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020JH\u0002J\u0010\u0010M\u001a\u00020\r2\u0006\u0010N\u001a\u00020JH\u0002J\u0010\u0010O\u001a\u00020\r2\u0006\u0010P\u001a\u00020JH\u0002J\u0010\u0010Q\u001a\u00020\r2\u0006\u0010R\u001a\u00020JH\u0002J\u0010\u0010S\u001a\u00020\r2\u0006\u0010T\u001a\u00020JH\u0002J\u0010\u0010U\u001a\u00020\r2\u0006\u0010V\u001a\u00020JH\u0002J*\u0010W\u001a\u0002082\u0006\u0010X\u001a\u00020@2\b\u0010Y\u001a\u0004\u0018\u00010Z2\b\u0010[\u001a\u0004\u0018\u00010\\2\u0006\u0010]\u001a\u00020\rJ\u0012\u0010^\u001a\u0002082\b\u0010_\u001a\u0004\u0018\u00010\\H\u0014J\"\u0010`\u001a\u0002082\u0006\u0010\u0005\u001a\u00020\u00032\n\u0010a\u001a\u0006\u0012\u0002\b\u00030G2\u0006\u0010b\u001a\u00020\rJ*\u0010c\u001a\u0002082\b\b\u0001\u0010d\u001a\u00020@2\u0006\u0010e\u001a\u00020Z2\u0006\u0010f\u001a\u00020;2\u0006\u0010g\u001a\u00020\rH\u0004J\u001a\u0010h\u001a\u0002082\n\u0010i\u001a\u0006\u0012\u0002\b\u00030G2\u0006\u0010j\u001a\u00020@J\u0006\u0010k\u001a\u000208J\u001e\u0010l\u001a\u000208*\u00020m2\u0012\u0010n\u001a\u000e\u0012\u0004\u0012\u00020m\u0012\u0004\u0012\u0002080oR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u0015\u0010*\u001a\u0006\u0012\u0002\b\u00030\f8F\u00a2\u0006\u0006\u001a\u0004\b+\u0010\u000fR\u001c\u0010,\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u00101\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001b\u00102\u001a\u0002038FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b6\u0010\u0017\u001a\u0004\b4\u00105\u00a8\u0006p"}, d2 = {"Lcom/food/app/baseClass/BaseActivity/BaseActivity;", "T", "Landroidx/databinding/ViewDataBinding;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "baseLiveDataLoading", "Landroidx/lifecycle/MutableLiveData;", "", "getBaseLiveDataLoading", "()Landroidx/lifecycle/MutableLiveData;", "setBaseLiveDataLoading", "(Landroidx/lifecycle/MutableLiveData;)V", "commonFunction", "Lcom/food/app/utility/CommonFunction;", "getCommonFunction", "()Lcom/food/app/utility/CommonFunction;", "commonFunction$delegate", "Lkotlin/Lazy;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "setDisposable", "(Lio/reactivex/disposables/CompositeDisposable;)V", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "getFragmentActivity", "()Landroidx/fragment/app/FragmentActivity;", "setFragmentActivity", "(Landroidx/fragment/app/FragmentActivity;)V", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "setFragmentManager", "(Landroidx/fragment/app/FragmentManager;)V", "loadingObservable", "getLoadingObservable", "mViewDataBinding", "getMViewDataBinding", "()Landroidx/databinding/ViewDataBinding;", "setMViewDataBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "sharedHelper", "Lcom/food/app/utility/SharedHelper;", "getSharedHelper", "()Lcom/food/app/utility/SharedHelper;", "sharedHelper$delegate", "commonToast", "", "Landroid/content/Context;", "Message", "", "getErrorBody", "throwable", "", "getLayoutId", "", "hideKeyboard", "initView", "isGPS", "()Ljava/lang/Boolean;", "isMyServiceRunning", "serviceClass", "Ljava/lang/Class;", "isValidAadhaar", "aadhaar", "", "isValidEmail", "email", "isValidFssai", "fssai", "isValidIFSC", "ifsc", "isValidPAN", "pan", "isValidPassword", "password", "isValidPhoneNumber", "phoneNumber", "movoToFragment", "fragmentid", "fragment", "Landroidx/fragment/app/Fragment;", "bundle", "Landroid/os/Bundle;", "isbackStack", "onCreate", "savedInstanceState", "openNewActivity", "cls", "finishCurrent", "replaceFragment", "id", "fragmentName", "fragmentTag", "addToBackStack", "setIntent", "cObjection", "isFrom", "showKeyboard", "setSafeOnClickListener", "Landroid/view/View;", "onSafeClick", "Lkotlin/Function1;", "app_debug"})
public abstract class BaseActivity<T extends androidx.databinding.ViewDataBinding> extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> baseLiveDataLoading;
    @org.jetbrains.annotations.NotNull()
    public T mViewDataBinding;
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.disposables.CompositeDisposable disposable;
    @org.jetbrains.annotations.NotNull()
    public android.app.Activity activity;
    @org.jetbrains.annotations.Nullable()
    private androidx.fragment.app.FragmentActivity fragmentActivity;
    @org.jetbrains.annotations.NotNull()
    public androidx.fragment.app.FragmentManager fragmentManager;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy commonFunction$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy sharedHelper$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getBaseLiveDataLoading() {
        return null;
    }
    
    protected final void setBaseLiveDataLoading(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
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
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity getActivity() {
        return null;
    }
    
    public final void setActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.fragment.app.FragmentActivity getFragmentActivity() {
        return null;
    }
    
    public final void setFragmentActivity(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.FragmentActivity p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.fragment.app.FragmentManager getFragmentManager() {
        return null;
    }
    
    public final void setFragmentManager(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager p0) {
    }
    
    @androidx.annotation.LayoutRes()
    protected abstract int getLayoutId();
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<?> getLoadingObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.food.app.utility.CommonFunction getCommonFunction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.food.app.utility.SharedHelper getSharedHelper() {
        return null;
    }
    
    protected abstract void initView(@org.jetbrains.annotations.Nullable()
    androidx.databinding.ViewDataBinding mViewDataBinding);
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void showKeyboard() {
    }
    
    public final void hideKeyboard() {
    }
    
    public final void openNewActivity(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity, @org.jetbrains.annotations.NotNull()
    java.lang.Class<?> cls, boolean finishCurrent) {
    }
    
    protected final void replaceFragment(@androidx.annotation.IdRes()
    int id, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragmentName, @org.jetbrains.annotations.NotNull()
    java.lang.String fragmentTag, boolean addToBackStack) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getErrorBody(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.lang.Boolean isGPS() {
        return null;
    }
    
    private final boolean isMyServiceRunning(java.lang.Class<?> serviceClass) {
        return false;
    }
    
    public final void setIntent(@org.jetbrains.annotations.NotNull()
    java.lang.Class<?> cObjection, int isFrom) {
    }
    
    public final void commonToast(@org.jetbrains.annotations.Nullable()
    android.content.Context activity, @org.jetbrains.annotations.Nullable()
    java.lang.String Message) {
    }
    
    public final void movoToFragment(int fragmentid, @org.jetbrains.annotations.Nullable()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.Nullable()
    android.os.Bundle bundle, boolean isbackStack) {
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
    
    public BaseActivity() {
        super();
    }
}