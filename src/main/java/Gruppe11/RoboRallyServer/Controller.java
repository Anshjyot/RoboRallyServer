package Gruppe11.RoboRallyServer;

import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @PostMapping("/transferBoard")
    public void transferBoard(@RequestBody String jsonBoard) {
        System.out.println(jsonBoard);
    }

    @PostMapping("/savegame")
    public void saveGame(@RequestBody String jsonBoard) {
        FileAccess gameState = new FileAccess();
        gameState.saveGame(jsonBoard);
    }

    //retrieves a representation of the resource
    @GetMapping("/loadgame")
    public String loadGame() {

        FileAccess file = new FileAccess();
        return file.loadGame();
    }
}
