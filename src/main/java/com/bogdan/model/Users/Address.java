package com.bogdan.model.Users;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;

public class Address {

    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;

    public Address() {
    }

    public Address(String street, String suite, String city, String zipcode, Geo geo) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.geo = geo;
    }

    public String getStreet() {
        return street;
    }

    public String getSuite() {
        return suite;
    }

    public String getCity() {
        return city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public Geo getGeo() {
        return geo;
    }

    public String prettyPrint(List<Address> addresses) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(addresses);
    }
}
