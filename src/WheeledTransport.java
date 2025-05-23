public abstract class WheeledTransport implements Transport {

    private final String modelName;

    private final int wheelsCount;

    public WheeledTransport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre(){
        System.out.println("Change the tyre for transport " + getModelName());
    }

    @Override
    public void service(){
        for(int i = 0; i < wheelsCount; i++){
            updateTyre();
        }
    }
}
