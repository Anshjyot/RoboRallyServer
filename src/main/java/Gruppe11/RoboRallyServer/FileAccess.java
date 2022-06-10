package Gruppe11.RoboRallyServer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileAccess {
    //private static final String BOARDSFOLDER = ;
    String filePath =
            "src/main/resources/saved/savedgame.json";

    public void saveGame(String jsonBoard) {

        try {
            /*
            object mapper kan bruges til at beautify streng i json fil
             */
            //ObjectMapper mapper = new ObjectMapper();
            FileWriter fileWriter = new FileWriter(filePath);
            //fileWriter.write(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonBoard));
            fileWriter.write(jsonBoard);
            fileWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String loadGame() {
        Gson gson = new Gson();
        JsonObject jsonBoard = null;
        try {
            Reader reader = Files.newBufferedReader(Paths.get(filePath));

            jsonBoard = gson.fromJson(reader, JsonObject.class);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonBoard.toString();
    }
}