package com.example.badiapp.helper;

import org.json.JSONException;
import org.json.JSONObject;
import java.util.Iterator;

import com.example.badiapp.model.Badi;
import com.example.badiapp.model.Becken;


public class WieWarmJsonParser {

    public static Badi createBadiFromJsonString(String badiJsonString) throws JSONException {
        Badi badi = new Badi();
        JSONObject jsonObj = new JSONObject(badiJsonString);
        badi.setId(Integer.parseInt(jsonObj.getString("badid")));
        badi.setName(jsonObj.getString("badname"));
        badi.setKanton(jsonObj.getString("kanton"));
        badi.setOrt(jsonObj.getString("ort"));
        JSONObject beckenJson = jsonObj.getJSONObject("becken");
        Iterator keys = beckenJson.keys();

        while (keys.hasNext())
        {
            Becken becken = new Becken();
            String key = (String) keys.next();
            JSONObject subObj = beckenJson.getJSONObject(key);
            becken.setName(subObj.getString("beckenname"));
            becken.setTemperatur(Double.parseDouble(subObj.getString("temp")));
            badi.addBecken(becken);
        }

        return badi;
    }
}
