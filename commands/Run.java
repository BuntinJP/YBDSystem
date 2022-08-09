package commands;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;


public class Run {
    public String run() throws Exception {
        String rt = "";
        FileWriter file = new FileWriter("out.txt");
        PrintWriter pw = new PrintWriter(new BufferedWriter(file));
        ProcessBuilder p = new ProcessBuilder(".\\commands\\script.bat");
        // 2. プロセスを開始する
        Process process = p.start();

        // 3. 結果を受け取る
        InputStreamReader isr = new InputStreamReader(process.getInputStream(),"Cp943");
        try (BufferedReader r = new BufferedReader(isr)) {
            String line;
            while ((line = r.readLine()) != null) {
                rt += line + "\n";
                pw.println(line.replace('¥', '\\'));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        pw.close();
        return rt;
    }
}
