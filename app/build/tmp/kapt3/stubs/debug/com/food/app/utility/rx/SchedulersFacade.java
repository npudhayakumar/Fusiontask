package com.food.app.utility.rx;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0007\u00a8\u0006\n"}, d2 = {"Lcom/food/app/utility/rx/SchedulersFacade;", "", "()V", "applyAsync", "Lio/reactivex/ObservableTransformer;", "T", "computation", "Lio/reactivex/Scheduler;", "io", "ui", "app_debug"})
public final class SchedulersFacade {
    
    /**
     * IO thread pool scheduler
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Scheduler io() {
        return null;
    }
    
    /**
     * Computation thread pool scheduler
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Scheduler computation() {
        return null;
    }
    
    /**
     * Main Thread scheduler
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Scheduler ui() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>io.reactivex.ObservableTransformer<T, T> applyAsync() {
        return null;
    }
    
    public SchedulersFacade() {
        super();
    }
}