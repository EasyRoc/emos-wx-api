package com.easyroc.emoswxapi.config.shiro;

import org.springframework.stereotype.Component;

@Component
public class ThreadLocalToken {
    private ThreadLocal local = new ThreadLocal();

    public void setToken(String token) {
        local.set(token);
    }

    public String getToken() {
        return (String) local.get();
    }

    public void clear() {
        local.remove();
    }
}

