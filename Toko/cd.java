package Toko;

//inharitation (pewarisan)
public class cd extends product {

    private String artis;
    private int numSong;
    private String label;

    public cd() {
        super(); // counstructor dari superclass
        artis = "Lady Gaga";
        numSong = 10;
        label = "Sony Music";
    }
    // contructor parameter

    public cd(int number, String name, int quantity, double price, String Artist, int numsong, String label) {
        super(number, name, quantity, price);
        this.artis = Artist;
        this.numSong = numsong;
        this.label = label;
    }

    public String getArtis() {
        return this.artis;
    }

    public void setArtis(String artis) {
        this.artis = artis;
    }

    public int getNumSong() {
        return this.numSong;
    }

    public void setNumSong(int numSong) {
        this.numSong = numSong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void print() {
        // super.print();
        System.out.println("Artist\t:" + artis);
        System.out.println("numsong\t:" + numSong);
        System.out.println("label\t:" + label);

    }

}
