package com.javasampleapproach.restdata.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Film {

    public String name;
    public String diameter;
    public String gravity;
    public String population;
    public String climate;
    public String terrain;
    public String created;
    public String edited;
    public String url;

    @JsonProperty("rotation_period")
    public String rotationPeriod;

    @JsonProperty("orbital_period")
    public String orbitalPeriod;

    @JsonProperty("surface_water")
    public String surfaceWater;

    @JsonProperty("residents")
    public List<String> residentsUrls;

    @JsonProperty("films")
    public List<String> filmsUrls;
}
