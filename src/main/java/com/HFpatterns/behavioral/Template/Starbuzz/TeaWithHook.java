import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CoffeineBeverageWithHook {

    @Override
    void brew() {
        System.out.println("Dripping tea through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();

        return answer.toLowerCase().startsWith("y");
    }

    public String getUserInput() {
        String answer = null;

        System.out.print("Would you like lemon with your tea? (y/n) ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.out.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}

