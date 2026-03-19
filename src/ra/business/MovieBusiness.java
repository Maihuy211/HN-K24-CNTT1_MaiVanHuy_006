package ra.business;

import ra.entity.Moive;

import java.util.*;

public class MovieBusiness {
    private MovieBusiness instance;
    private List<Moive> moives = new ArrayList<>();

    public MovieBusiness() {
        this.moives = moives;
    }

    public MovieBusiness getInstance() {
        return instance;
    }

    public boolean isDulicate(String id){
        if(!moives.stream().anyMatch(Moive -> Moive.getMovieId().equals(id))){
            return false;
        }
        return true;
    }
    public void displayMovie(){
        if(moives.isEmpty()){
            System.out.println("Trống");
            return;
        }
        Moive moive = new Moive();
        moive.displayData();
    }

    public void addMovies(Scanner sc){
        Moive moive = new Moive();
        moive.inputData(sc);
        while (true){
            if(isDulicate(moive.getMovieId())){
                System.out.println("Mã phim đã tồn tại");
                return;
            }else{
                moives.add(moive);
            }
        }
    }
    public void updateMovie(){
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Các thông tin cần sửa");
            System.out.println("1. Movie Name");
            System.out.println("2. Duration");
            System.out.println("3. Views");
            System.out.println("Lựa chọn thông tin cần sửa: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }while (choice != 3);
    }
    public void deleteMovie(String name){
        if(moives.isEmpty()){
            System.out.println("Trống");
            return;
        }
        moives.removeIf(moive -> moives.equals(name));
    }
    public void findMovie(String name){
        if(moives.isEmpty()){
            System.out.println("Trống");
            return;
        }
        moives.stream().filter(moive -> moives.contains(moive.getMovieName().toLowerCase()));
    }
    public void filterMovie(){
        moives.stream().filter(moive -> moive.getViews() >= 10000);
    }
    public void sortMovie(){
        moives.stream().sorted((a,b) -> a.getDuration() - b.getDuration());
    }
}
