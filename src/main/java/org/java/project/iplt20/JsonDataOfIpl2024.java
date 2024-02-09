package org.java.project.iplt20;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class JsonDataOfIpl2024 {
    public static void main(String[] args) throws IOException, URISyntaxException {
        List<String> list = Files.readAllLines(Path.of(JsonDataOfIpl2024.class.getResource("/Iplt20PlayerList24.json").toURI()));
        StringBuffer JsonData = new StringBuffer();
        for (String data : list) {
            JsonData.append(data);
        }
        System.out.println(JsonData);
    }
}
