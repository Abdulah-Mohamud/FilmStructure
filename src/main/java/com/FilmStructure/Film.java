package com.FilmStructure;

import javax.persistence.*;

//Attributes
@Entity
public class Film extends FilmCollection{
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)

    private String filmID;
    private String title;
    private String genre;
    private Double duration;
    private Double rating;


    //Constructor
    public Film(String title, String genre, Double duration, Double rating){
        this.title=title;
        this.genre=genre;
        this.duration=duration;
        this.rating=rating;
    }

    public Film (){
    }

    //Method
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFilmID() {return filmID;}

    public void setFilmID(String filmID) {this.filmID = filmID;}

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getFilmInfo(){
        return "{"+
                "\"title\" : \" " + title + "\","+
                "\"genre\" : \" " + genre + "\","+
                "\"duration\" : \" " + duration + "\","+
                "\"rating\" : \" " + rating + "\""+
                "}";
        }
}


