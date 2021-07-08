package com.example.trycatch;

import android.util.Log;

public class Comment {
    public String authorName, authorLastName, text, date;


    public Comment(String authorName, String authorLastName, String text, String date) {
        this.authorName = authorName;
        this.authorLastName = authorLastName;
        this.text = text;
        this.date = date;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public String getText() {
        return text;
    }

    public String getDate() {
        return date;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
