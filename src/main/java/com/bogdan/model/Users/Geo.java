package com.bogdan.model.Users;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;

public class Geo {

    private double lat;
    private double lng;

    public Geo() {
    }

    public Geo(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    public String prettyPrint(List<Geo> geo) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(geo);
    }
}
