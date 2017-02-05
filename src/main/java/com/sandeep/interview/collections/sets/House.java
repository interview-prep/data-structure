package com.sandeep.interview.collections.sets;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by Sandeep on 2/5/2017.
 */
public class House {
    private Status currentStatus;
    private String city;
    private Date date;

    public enum Status {
        AVAILABLE,
        SOLD,
        CONTINGENT
    }

    public House(Status s, String c, String d) throws ParseException {
        currentStatus = s;
        city = c;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        date = sdf.parse(d);
    }

    public Status getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(Status currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "House{" +
                "currentStatus=" + currentStatus +
                ", city='" + city + '\'' +
                ", date=" + date +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        House house = (House) o;

        if (currentStatus != house.currentStatus) return false;
        if (!city.equals(house.city)) return false;
        return date.equals(house.date);

    }

    @Override
    public int hashCode() {
        int result = currentStatus.hashCode();
        result = 31 * result + city.hashCode();
        result = 31 * result + date.hashCode();
        return result;
    }
}