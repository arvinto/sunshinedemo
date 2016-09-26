package com.example.android.sunshine.app;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by arvinaboque on 9/23/16.
 */

public class WeatherDataParser {

    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex) throws JSONException {
        JSONObject jsonObject = new JSONObject(weatherJsonStr);
        JSONObject day = jsonObject.getJSONArray("list").getJSONObject(dayIndex);
        JSONObject temp = day.getJSONObject("temp");
        if(temp != null){
            return temp.getDouble("max");
        }
        return -1;
    }
}
