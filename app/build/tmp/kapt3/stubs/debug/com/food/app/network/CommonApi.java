package com.food.app.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0018H\u0004R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001b"}, d2 = {"Lcom/food/app/network/CommonApi;", "", "application", "Landroid/app/Application;", "sharedHelper", "Lcom/food/app/utility/SharedHelper;", "api", "Lcom/food/app/network/ApiInterface;", "schedulersFacade", "Lcom/food/app/utility/rx/SchedulersFacade;", "(Landroid/app/Application;Lcom/food/app/utility/SharedHelper;Lcom/food/app/network/ApiInterface;Lcom/food/app/utility/rx/SchedulersFacade;)V", "getApi", "()Lcom/food/app/network/ApiInterface;", "getApplication", "()Landroid/app/Application;", "setApplication", "(Landroid/app/Application;)V", "getSchedulersFacade", "()Lcom/food/app/utility/rx/SchedulersFacade;", "getSharedHelper", "()Lcom/food/app/utility/SharedHelper;", "getErrorBody", "", "throwable", "", "onError", "", "app_debug"})
public final class CommonApi {
    @org.jetbrains.annotations.NotNull()
    private android.app.Application application;
    @org.jetbrains.annotations.NotNull()
    private final com.food.app.utility.SharedHelper sharedHelper = null;
    @org.jetbrains.annotations.NotNull()
    private final com.food.app.network.ApiInterface api = null;
    @org.jetbrains.annotations.NotNull()
    private final com.food.app.utility.rx.SchedulersFacade schedulersFacade = null;
    
    protected final void onError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getErrorBody(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApplication() {
        return null;
    }
    
    public final void setApplication(@org.jetbrains.annotations.NotNull()
    android.app.Application p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.food.app.utility.SharedHelper getSharedHelper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.food.app.network.ApiInterface getApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.food.app.utility.rx.SchedulersFacade getSchedulersFacade() {
        return null;
    }
    
    public CommonApi(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.food.app.utility.SharedHelper sharedHelper, @org.jetbrains.annotations.NotNull()
    com.food.app.network.ApiInterface api, @org.jetbrains.annotations.NotNull()
    com.food.app.utility.rx.SchedulersFacade schedulersFacade) {
        super();
    }
}