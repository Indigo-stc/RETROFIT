package com.ista.ussingservices.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fruit {

    @SerializedName("genus")
    @Expose
    private String genus;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("family")
    @Expose
    private String family;
    @SerializedName("order")
    @Expose
    private String order;
    @SerializedName("nutritions")
    @Expose
    private Nutrition nutrition;

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public Nutrition getNutrition() {
        return nutrition;
    }

    public void setNutrition(Nutrition nutrition) {
        this.nutrition = nutrition;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "genus='" + genus + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", family='" + family + '\'' +
                ", order='" + order + '\'' +
                ", nutrition=" + nutrition +
                '}';
    }
}
