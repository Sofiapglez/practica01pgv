package launcher;

import java.io.File;
import java.io.IOException;

public class ProcessLauncher {
    private final static String OUTPUT_ROUTE = "./src/outputs/";

    public static Process initVowelCounter(String line, String fileName) {
        ProcessBuilder processBuilder = new ProcessBuilder(
                "java", "./src/processes/VowelCounter.java", line
        );

    Process javaProcess = null;

    try {
        File outputFile = new File(OUTPUT_ROUTE + fileName);
        processBuilder.redirectOutput(outputFile);
        javaProcess =  processBuilder.start();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    return javaProcess;

    }

}
