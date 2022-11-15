import java.io.File;
import java.io.FileReader;
import java.util.*;

public class NFA {
    ArrayList<String> alphabet = new ArrayList<>();
    String startState;
    ArrayList<String> finalState = new ArrayList<>();
    ArrayList<String> states = new ArrayList<>();
    ArrayList<String> transitionStates = new ArrayList<>();
    String stateName;
    boolean isFinal;
    boolean isStart;

    public NFA(Scanner nfaFile){
        ArrayList<String> allStrings = new ArrayList<>();
        String nextLine = nfaFile.nextLine();
        while(!nextLine.equals(null)){
            allStrings.add(nextLine);
        }
        for(int i = 0; i < allStrings.size(); i++){
            //Alphabet
            if(allStrings.get(i).equals("ALPHABET")){
                while(!allStrings.get(i).equals("STATES")){
                    alphabet.add(allStrings.get(i));
                }
            }
            else if(allStrings.get(i).equals("STATES")){
                while (!allStrings.get(i).equals("START")){
                    states.add(allStrings.get(i));
                    stateName = allStrings.get(i);
                }
            }
            else if (allStrings.get(i).equals("START")){
                while (!allStrings.get(i).equals("FINAL")){
                    startState = allStrings.get(i);
                    isStart = true;
                }
            }
            else if (allStrings.get(i).equals("FINAL")){
                while (!allStrings.get(i).equals("TRANSITIONS")){
                    finalState.add(allStrings.get(i));
                    isFinal = true;
                }
            }
            else if (allStrings.get(i).equals("TRANSITIONS")){
                while(!allStrings.get(i).equals("END")){
                    transitionStates.add(allStrings.get(i));
                }
            }
            else{
                System.out.println("End of NFA");
            }

        }

    }
    public ArrayList<String> getAlphabet() {
        return alphabet;
    }
    public void setAlphabet(ArrayList<String> alphabet) {
        this.alphabet = alphabet;
    }
    public String getStartState() {
        return startState;
    }
    public void setStartState(String startState) {
        this.startState = startState;
    }
    public ArrayList<String> getFinalState() {
        return finalState;
    }
    public void setFinalState(ArrayList<String> finalState) {
        this.finalState = finalState;
    }
    public ArrayList<String> getStates() {
        return states;
    }
    public void setStates(ArrayList<String> states) {
        this.states = states;
    }
    public ArrayList<String> getTransitionStates() {
        return transitionStates;
    }
    public void setTransitionStates(ArrayList<String> transitionStates) {
        this.transitionStates = transitionStates;
    }
    public String getStateName() {
        return stateName;
    }
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
    public boolean isFinal() {
        return isFinal;
    }
    public void setFinal(boolean aFinal) {
        isFinal = aFinal;
    }
    public boolean isStart() {
        return isStart;
    }
    public void setStart(boolean start) {
        isStart = start;
    }
}
