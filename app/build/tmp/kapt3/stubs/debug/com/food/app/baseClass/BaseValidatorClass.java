package com.food.app.baseClass;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0004J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0004J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0004J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0004\u00a8\u0006\u000f"}, d2 = {"Lcom/food/app/baseClass/BaseValidatorClass;", "", "()V", "isCompare", "", "first", "", "second", "isLenghtValidLimint", "legnt", "", "value", "isValidEmail", "email", "isempty", "app_debug"})
public class BaseValidatorClass {
    
    protected final boolean isValidEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return false;
    }
    
    protected final boolean isLenghtValidLimint(int legnt, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return false;
    }
    
    protected final boolean isempty(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return false;
    }
    
    protected final boolean isCompare(@org.jetbrains.annotations.NotNull()
    java.lang.String first, @org.jetbrains.annotations.NotNull()
    java.lang.String second) {
        return false;
    }
    
    public BaseValidatorClass() {
        super();
    }
}