package sk.stuba.fei.uim.oop;

public class App {
    public static void main(String[] args) {
    for (int cislo=1; cislo < 4;cislo++){
        switch (cislo){
            case 1:
                System.out.println("cislo je jedna");
                break;
            case 2:
                System.out.println("cislo je dva");
                break;
            default:
                System.out.println("Cislo je ine ako jedna a dva");
        }
    }
    }
}
