package com.articleaggregator.POJO;

public class NewsPOJO {
    String HeadLine;
    String Date;
    String text;

    public NewsPOJO(String HeadLine, String Date, String text){
        this.HeadLine =HeadLine;
        this.Date = Date;
        this.text = text;
    }
    public String getHeadLine() {
        return HeadLine;
    }

    public void setHeadLine(String headLine) {
        HeadLine = headLine;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
