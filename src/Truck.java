public class Truck extends MotorTransport{

    public Truck(String modelname, int wheelCount) {
        super(modelname, wheelCount);
    }

    public void checkTrailer(){
        System.out.println("Checking trailer for transport " + getModelName());
    }

    @Override
    public void service() {
        super.service();
        checkTrailer();
    }
}
