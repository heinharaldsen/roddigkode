public class State {

    public final int noOfQuarters;
    public final int noOfNickels;
    public final int noOfQuartersOut;
    public final int noOfNickelsOut;

    public State(int noOfQuarters, int noOfNickels, int noOfQuartersOut, int noOfNickelsOut)
    {
        this.noOfQuarters = noOfQuarters;
        this.noOfNickels = noOfNickels;
        this.noOfQuartersOut = noOfQuartersOut;
        this.noOfNickelsOut = noOfNickelsOut;
    }

    @Override
    public String toString() {
        return "State{" +
                "noOfQuarters=" + noOfQuarters +
                ", noOfNickels=" + noOfNickels +
                ", noOfQuartersOut=" + noOfQuartersOut +
                ", noOfNickelsOut=" + noOfNickelsOut +
                '}';
    }
}
