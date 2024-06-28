package com.food.app.utility;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0016\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fJ\u0016\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fJ\u0016\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lcom/food/app/utility/SharedHelper;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "clearCache", "", "clearUser", "getFromCache", "", "Key", "getFromUser", "getModel", "putInCache", "Value", "putInUser", "putModel", "model", "Companion", "app_debug"})
public final class SharedHelper {
    @org.jetbrains.annotations.NotNull()
    private com.google.gson.Gson gson;
    private final android.app.Application application = null;
    private static android.content.SharedPreferences preferences;
    private static android.content.SharedPreferences.Editor editor;
    private static final java.lang.String PREF_USER = "USER";
    private static final java.lang.String PREF_CACHE = "CACHE";
    public static final com.food.app.utility.SharedHelper.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.Gson getGson() {
        return null;
    }
    
    public final void setGson(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson p0) {
    }
    
    public final void putInUser(@org.jetbrains.annotations.NotNull()
    java.lang.String Key, @org.jetbrains.annotations.NotNull()
    java.lang.String Value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFromUser(@org.jetbrains.annotations.NotNull()
    java.lang.String Key) {
        return null;
    }
    
    public final void putInCache(@org.jetbrains.annotations.NotNull()
    java.lang.String Key, @org.jetbrains.annotations.NotNull()
    java.lang.String Value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFromCache(@org.jetbrains.annotations.NotNull()
    java.lang.String Key) {
        return null;
    }
    
    public final void clearCache() {
    }
    
    public final void clearUser() {
    }
    
    public final void putModel(@org.jetbrains.annotations.NotNull()
    java.lang.Object model, @org.jetbrains.annotations.NotNull()
    java.lang.String Key) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getModel(@org.jetbrains.annotations.NotNull()
    java.lang.String Key) {
        return null;
    }
    
    public SharedHelper(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/food/app/utility/SharedHelper$Companion;", "", "()V", "PREF_CACHE", "", "PREF_USER", "editor", "Landroid/content/SharedPreferences$Editor;", "preferences", "Landroid/content/SharedPreferences;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}