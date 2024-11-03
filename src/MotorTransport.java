public abstract class MotorTransport extends WheeledTransport {

    public MotorTransport(String modelname, int wheelCount){
        super(modelname, wheelCount);
    }

    public void checkEngine(){
        System.out.println("Checking engine for transport " + getModelName());
    }

    @Override
    public void service() {
        super.service();
        checkEngine();
    }
}
