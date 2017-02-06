package com.sandeep.interview.collections.maps;

import java.util.Date;

/**
 * Created by Sandeep on 2/6/2017.
 */
public class Book {
    private int code;
    private String name;
    private String auth;
    private Date pubDate;

    public Book() {
    }

    public Book(int code, String name, String auth, Date pubDate) {
        this.code = code;
        this.name = name;
        this.auth = auth;
        this.pubDate = pubDate;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder()
                .append("Book{")
                .append("code=" + code)
                .append(", name='" + name + "'")
                .append(", auth='" + auth + "'")
                .append(", pubDate=" + pubDate + "}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (code != book.code) return false;
        if (!name.equals(book.name)) return false;
        if (!auth.equals(book.auth)) return false;
        return pubDate.equals(book.pubDate);

    }

    @Override
    public int hashCode() {
        int result = code;
        result = 31 * result + name.hashCode();
        result = 31 * result + auth.hashCode();
        result = 31 * result + pubDate.hashCode();
        return result;
    }
}
