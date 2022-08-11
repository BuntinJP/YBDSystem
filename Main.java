
import commands.Run;

public class Main {
    public static void main(String[] args) throws Exception {
        Run run = new Run();
        String[] results = run.run();
        for(int i = 0;i<results.length;i++) {
            System.out.println(results[i]);
        }
    }
}