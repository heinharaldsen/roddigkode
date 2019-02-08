public class VendingMachine {


    public State handleCommand(State state, String command) {


        switch (command) {
            case "Q":
                return new State(state.noOfQuarters + 1, state.noOfNickels, 0, 0);
            case "N":
                return new State(state.noOfQuarters, state.noOfNickels + 1, 0, 0);
            case "COIN-RETURN":
                return new State(0, 0, state.noOfQuarters, state.noOfNickels);
        }

        return state;
    }
}
