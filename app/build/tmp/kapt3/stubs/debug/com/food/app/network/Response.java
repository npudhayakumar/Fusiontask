package com.food.app.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB#\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000f"}, d2 = {"Lcom/food/app/network/Response;", "", "status", "Lcom/app/washeruser/repository/Status;", "data", "error", "", "(Lcom/app/washeruser/repository/Status;Ljava/lang/Object;Ljava/lang/Throwable;)V", "getData", "()Ljava/lang/Object;", "getError", "()Ljava/lang/Throwable;", "getStatus", "()Lcom/app/washeruser/repository/Status;", "Companion", "app_debug"})
public final class Response {
    @org.jetbrains.annotations.NotNull()
    private final com.app.washeruser.repository.Status status = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object data = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Throwable error = null;
    public static final com.food.app.network.Response.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.washeruser.repository.Status getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Throwable getError() {
        return null;
    }
    
    private Response(com.app.washeruser.repository.Status status, java.lang.Object data, java.lang.Throwable error) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/food/app/network/Response$Companion;", "", "()V", "dismiss", "Lcom/food/app/network/Response;", "error", "", "loading", "loadingSecond", "success", "data", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.food.app.network.Response loading() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.food.app.network.Response loadingSecond() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.food.app.network.Response dismiss() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.food.app.network.Response success(@org.jetbrains.annotations.NotNull()
        java.lang.Object data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.food.app.network.Response error(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable error) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}