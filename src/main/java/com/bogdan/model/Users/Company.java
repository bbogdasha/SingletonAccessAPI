package com.bogdan.model.Users;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;

public class Company {

    private String name;
    private String catchPhrase;
    private String bs;

    public Company() {
    }

    public Company(String name, String catchPhrase, String bs) {
        this.name = name;
        this.catchPhrase = catchPhrase;
        this.bs = bs;
    }

    public String getName() {
        return name;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public String getBs() {
        return bs;
    }

    public String prettyPrint(List<Company> companies) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(companies);
    }
}
