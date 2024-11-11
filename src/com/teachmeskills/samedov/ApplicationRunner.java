package com.teachmeskills.samedov;

import com.teachmeskills.samedov.isHex.isHex;
import com.teachmeskills.samedov.isValidURL.isValidURL;

public class ApplicationRunner implements isHex, isValidURL {
    public static void main(String[] args) {
        String str1 = "#ffffff";
        String str2 = "#fff";
        String str3 = "#invali";
        String str4 = "https://teachmeskills.by/kursy/programmirovaniya-online";
        String str5 = "http://teachmeskills.by/kursy/programmirovaniya-online";
        String str6 = "tcp://teachmeskills.by/";

        System.out.println(isHex.isHex(str1) ? "Yes" : "No");
        System.out.println(isHex.isHex(str2) ? "Yes" : "No");
        System.out.println(isHex.isHex(str3) ? "Yes" : "No");
        System.out.println(isValidURL.isValid(str4) ? "Yes" : "No");
        System.out.println(isValidURL.isValid(str5) ? "Yes" : "No");
        System.out.println(isValidURL.isValid(str6) ? "Yes" : "No");
    }
}
