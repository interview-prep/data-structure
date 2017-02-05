package com.sandeep.interview.collections.sets;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Sandeep on 2/5/2017.
 */
public class DuplicateHouse implements Comparable<DuplicateHouse> {
    private String city;
    private Date date;

    public DuplicateHouse(String c, String d) throws ParseException {
        city = c;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        date = sdf.parse(d);
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
                ", city='" + city + '\'' +
                ", date=" + date +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DuplicateHouse that = (DuplicateHouse) o;

        if (!city.equals(that.city)) return false;
        return date.equals(that.date);

    }

    @Override
    public int hashCode() {
        int result = city.hashCode();
        result = 31 * result + date.hashCode();
        return result;
    }

    public int compareTo(DuplicateHouse o) {
        return city.compareToIgnoreCase(o.city);
    }
}