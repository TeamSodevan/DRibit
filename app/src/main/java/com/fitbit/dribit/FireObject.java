package com.fitbit.dribit;

import java.util.HashMap;

/**
 * Created by ravipiyush on 11/02/17.
 */

public class FireObject {

    private Integer age;
    private Integer DailySteps;
    private String gender;
    private String waterUnit;
    private Double weight;
    private HashMap<Integer ,Integer> heartbeat ;




    public FireObject() {
    }

    public FireObject(Integer age, Integer dailySteps, String gender, String waterUnit, Double weight, HashMap<Integer, Integer> heartbeat) {
        this.age = age;
        DailySteps = dailySteps;
        this.gender = gender;
        this.waterUnit = waterUnit;
        this.weight = weight;
        this.heartbeat = heartbeat;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getDailySteps() {
        return DailySteps;
    }

    public String getGender() {
        return gender;
    }

    public String getWaterUnit() {
        return waterUnit;
    }

    public Double getWeight() {
        return weight;
    }

    public HashMap<Integer, Integer> getHeartbeat() {
        return heartbeat;
    }
}
