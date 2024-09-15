package enumuration;

public class Main {
    public static void main(String[] args) {
        for(var s : Season.values()){
            System.out.println(s.name() + " Ordinal " + s.ordinal());
        }

        Season summer = Season.SUMMER;
        switch (summer) {
            case WINTER:
                System.out.println("Winter season");
                break;
            case SUMMER: 
                System.out.println("Summer season");
                break;
            case FALL :
                System.out.println("Fall season.");
                break;
        
            default:
                System.out.println("Not summer!");
                break;
        }
    }
}
