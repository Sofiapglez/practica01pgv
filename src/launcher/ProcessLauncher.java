package launcher;

import java.io.File;
import java.io.IOException;

import java.io.File;
import java.io.IOException;

public class ProcessLauncher {
    private static final String OUTPUT_DIRECTORY = "./outputs/";

    public static Process initVowelCounterProcess(char character, String fileName) {
        ProcessBuilder processBuilder = new ProcessBuilder(
                "java", "VowelCounter", String.valueOf(character), fileName
        );

        processBuilder.directory(new File("src"));
        processBuilder.redirectErrorStream(true);

        File outputFile = new File(OUTPUT_DIRECTORY + fileName + "_" + character + "_output.txt");
        processBuilder.redirectOutput(outputFile);

        try {
            return processBuilder.start();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

