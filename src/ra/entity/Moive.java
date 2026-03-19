package ra.entity;

import java.util.Scanner;

public class Moive {
    private String movieId;
    private String movieName;
    private int duration;
    private int views;

    public Moive() {
    }

    public Moive(String movieId, String movieName, int duration, int views) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.duration = duration;
        this.views = views;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public void inputData(Scanner sc){
        while (true){
            if(movieId.equals(" ")) {
                System.out.println("Nhập id: ");
                movieId = sc.nextLine();
                break;
            }else{
                System.out.println("Lỗi! nhập lại");
            }
        }
        while (true){
            if(movieName.isEmpty()){
                System.out.println("Nhập Movie Name: ");
                movieName = sc.nextLine();
                break;
            }else{
                System.out.println("Lỗi! nhập lại");
            }
        }
        while (true){
            if(duration > 0){
                System.out.println("Nhập số duration: ");
                duration = sc.nextInt();
                break;
            }else{
                System.out.println("Lỗi! nhập lại");
            }
        }
        while (true){
            if(views >= 0){
                System.out.println("Nhập số views: ");
                views = sc.nextInt();
                break;
            }else{
                System.out.println("Lỗi! nhập lại");
            }
        }
    }
    public void displayData(){
        System.out.println("ID: " + movieId);
        System.out.println("Movie Name: " + movieName);
        System.out.println("Duration: " + duration);
        System.out.println("Views: " + views);
    }
}
