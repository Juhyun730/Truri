package com.example.truri;

public class Search_data {
    private int reliability_icon;
    private String link, title, date, content, color, image;
    private long id;
    private int level;

    public Search_data(int reliability_icon,
                       String link,
                       String title,
                       String date,
                       String content,
                       String color,
                       int level,
                       String image
                       ) {
        this.reliability_icon = reliability_icon;
        this.link = link;
        this.title = title;
        this.date = date;
        this.content = content;
        this.color = color;
        this.level = level;
        this.id = -1;
        this.image = image;
    }

    public int getReliability_icon() {return reliability_icon;}

    public String getImage() {return image;}

    public String getLink() {
        return link;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }

    public String getColor() {
        return color;
    }

    public void setReliability_icon(int reliability_icon) {this.reliability_icon = reliability_icon;}

    public void setLink(String link) {
        this.link = link;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
