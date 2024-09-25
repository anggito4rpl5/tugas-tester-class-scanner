package Toko;
public class dvd extends product{
    private int length;
    private String rating;
    private String studio;

    public dvd(){
        length = 300;
        rating = "PG";
        studio = "NewLine Cinema";
    }
    public dvd(int number, String name , int quantity , double price, int length, String rating, String studio){
        super(number, name, quantity, price);
        this.length = length;
        this.rating = rating;
        this.studio = studio;
    }

    public int getLength() {
        return this.length;
    }
    
    public void setLength(int length) {
        this.length = length;
    }
    public String getRating() {
        return this.rating;
    }
    
    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
    public void print(){
        System.out.println("Lenght\t:" + length);
            System.out.println("Rating\t:" + rating);
            System.out.println("Studio\t:" + studio);
            
    }
}
