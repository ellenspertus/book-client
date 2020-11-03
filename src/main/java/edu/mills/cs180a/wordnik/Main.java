package edu.mills.cs180a.wordnik;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.IOUtils;

public class Main {
    public static void main(String[] args) {
        try (InputStream is = Main.class.getClassLoader().getResourceAsStream("api-key.txt")) {
            String key = IOUtils.toString(is, StandardCharsets.UTF_8);
            System.out.println(key);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
