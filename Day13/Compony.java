package Day13;

public class Compony {
    private static Compony instance;

    public static Compony getInstance(){
        if(instance == null){
            instance = new Compony();
        }
        return instance;
    }
}
