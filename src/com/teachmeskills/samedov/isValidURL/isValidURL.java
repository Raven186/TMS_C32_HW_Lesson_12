package com.teachmeskills.samedov.isValidURL;

public interface isValidURL {
    public static boolean isValid(String url) {
        return url.matches("^https?://\\S+$");
    }
}
