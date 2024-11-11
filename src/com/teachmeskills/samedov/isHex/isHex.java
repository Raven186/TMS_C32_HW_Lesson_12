package com.teachmeskills.samedov.isHex;

public interface isHex {
    public static boolean isHex(String str) {
        return str.matches("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$");
    }
}
