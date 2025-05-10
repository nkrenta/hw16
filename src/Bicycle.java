public class Bicycle extends WheeledTransport{

    public Bicycle(String modelName, int wheelCount){
        super(modelName, wheelCount);
    }

    public void updateTyre() {
        System.out.println("Change the tyre for bicycle " + getModelName());
    }
}
