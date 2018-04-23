package com.example.sentiment.entities;

import java.util.Date;

public class Tweet {

    // Fields
    private long id;
    private String user;
    private String text;
    private Date date;
    private double sentimentScore;

    // Constructors
    public Tweet(long id, String user, String text, Date date, double sentimentScore) {

        this.id = id;
        this.user = user;
        this.text = text;
        this.date = date;
        this.sentimentScore = sentimentScore;
    }

    // Getters & Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getSentimentScore() {
        return sentimentScore;
    }

    public void setSentimentScore(double sentimentScore) {
        this.sentimentScore = sentimentScore;
    }
}
