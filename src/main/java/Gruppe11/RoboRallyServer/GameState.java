package Gruppe11.RoboRallyServer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;

import java.io.FileWriter;

public class GameState {
    public void saveGame(String jsonBoard) {
        String filePath =
                "src/main/resources/saved/savedgame.json";
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
}
