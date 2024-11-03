package immutableclass;

//1. Final class
public final class Main {

    //4. Make all fields private final
    private final String name;

    //2. Private Constructor
    private Main(){
        this.name = "";
    }

    //3. No Setter Method
    public String getName(){
        return this.name;
    }
}
