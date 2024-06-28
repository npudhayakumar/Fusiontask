package com.food.app.baseClass;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0004J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0013J\b\u0010\u0017\u001a\u00020\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0013H\u0004J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/food/app/baseClass/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "disable", "Lio/reactivex/disposables/CompositeDisposable;", "getDisable", "()Lio/reactivex/disposables/CompositeDisposable;", "setDisable", "(Lio/reactivex/disposables/CompositeDisposable;)V", "response", "Landroidx/lifecycle/MutableLiveData;", "Lcom/food/app/network/Response;", "getResponse", "()Landroidx/lifecycle/MutableLiveData;", "setResponse", "(Landroidx/lifecycle/MutableLiveData;)V", "createMultiPartImage", "Lokhttp3/MultipartBody$Part;", "value", "", "key", "getMimeType", "url", "onCleared", "", "requestBody", "Lokhttp3/RequestBody;", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private io.reactivex.disposables.CompositeDisposable disable;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.food.app.network.Response> response;
    
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.disposables.CompositeDisposable getDisable() {
        return null;
    }
    
    protected final void setDisable(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.lifecycle.MutableLiveData<com.food.app.network.Response> getResponse() {
        return null;
    }
    
    protected final void setResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.food.app.network.Response> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.food.app.network.Response> response() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final okhttp3.RequestBody requestBody(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final okhttp3.MultipartBody.Part createMultiPartImage(@org.jetbrains.annotations.NotNull()
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMimeType(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public BaseViewModel() {
        super();
    }
}