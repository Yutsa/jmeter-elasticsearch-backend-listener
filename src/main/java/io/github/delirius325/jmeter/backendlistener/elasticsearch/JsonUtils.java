package io.github.delirius325.jmeter.backendlistener.elasticsearch;

import org.json.JSONObject;

import java.net.HttpRetryException;

public class JsonUtils {
    public static <T> T getValueOrNull(JSONObject object, String key) {
        try {
            return (T) object.get(key);
        } catch (Exception e) {
            return null;
        }
    }
}
