package com.food.app.appControl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0014H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/food/app/appControl/AppController;", "Landroid/app/Application;", "()V", "isConnected", "", "()Z", "setConnected", "(Z)V", "mSocket", "Lio/socket/client/Socket;", "getMSocket", "()Lio/socket/client/Socket;", "setMSocket", "(Lio/socket/client/Socket;)V", "onConnect", "Lio/socket/emitter/Emitter$Listener;", "onConnectingError", "onConnectingTimeout", "onNewMessage", "createSocketConnection", "", "emitcurrentlocation", "event", "", "emit", "Lorg/json/JSONObject;", "onCreate", "CrashReportingTree", "app_debug"})
public final class AppController extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public io.socket.client.Socket mSocket;
    private boolean isConnected = false;
    private final io.socket.emitter.Emitter.Listener onConnect = null;
    private final io.socket.emitter.Emitter.Listener onConnectingError = null;
    private final io.socket.emitter.Emitter.Listener onConnectingTimeout = null;
    private final io.socket.emitter.Emitter.Listener onNewMessage = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.socket.client.Socket getMSocket() {
        return null;
    }
    
    public final void setMSocket(@org.jetbrains.annotations.NotNull()
    io.socket.client.Socket p0) {
    }
    
    public final boolean isConnected() {
        return false;
    }
    
    public final void setConnected(boolean p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public final void createSocketConnection() {
    }
    
    public final void emitcurrentlocation(@org.jetbrains.annotations.NotNull()
    java.lang.String event, @org.jetbrains.annotations.NotNull()
    org.json.JSONObject emit) {
    }
    
    public AppController() {
        super();
    }
    
    /**
     * A tree which logs important information for crash reporting.
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014\u00a8\u0006\f"}, d2 = {"Lcom/food/app/appControl/AppController$CrashReportingTree;", "Ltimber/log/Timber$Tree;", "()V", "log", "", "priority", "", "tag", "", "message", "t", "", "app_debug"})
    static final class CrashReportingTree extends timber.log.Timber.Tree {
        
        @java.lang.Override()
        protected void log(int priority, @org.jetbrains.annotations.Nullable()
        java.lang.String tag, @org.jetbrains.annotations.NotNull()
        java.lang.String message, @org.jetbrains.annotations.Nullable()
        java.lang.Throwable t) {
        }
        
        public CrashReportingTree() {
            super();
        }
    }
}