package com.marvel.royalejackfruit.constant;

import com.marvel.royalejackfruit.helper.HttpHelper;

/**
 * Created by Marvel on 2019/11/12.
 */
public class RoyaleDevURL {

    private static String domain = "https://api.clashroyale.com/v1";

    public static String player(String tag) {
        return String.format("%s/players/%s", domain, HttpHelper.encode(tag));
    }

    public static String upcomingchests(String tag) {
        return String.format("%s/players/%s/upcomingchests", domain, HttpHelper.encode(tag));
    }

    public static String battlelog(String tag) {
        return String.format("%s/players/%s/battlelog", domain, HttpHelper.encode(tag));
    }

    public static String clan(String tag) {
        return String.format("%s/clans/%s", domain, HttpHelper.encode(tag));
    }

    public static String members(String tag) {
        return String.format("%s/clans/%s/members", domain, HttpHelper.encode(tag));
    }

    public static String warlog(String tag) {
        return String.format("%s/clans/%s/warlog", domain, HttpHelper.encode(tag));
    }

    public static String currentwar(String tag) {
        return String.format("%s/clans/%s/currentwar", domain, HttpHelper.encode(tag));
    }

    public static String tournaments() {
        return String.format("%s/tournaments", domain);
    }

    public static String cards() {
        return String.format("%s/cards", domain);
    }
}
