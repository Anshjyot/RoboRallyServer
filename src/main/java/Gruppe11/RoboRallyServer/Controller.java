package Gruppe11.RoboRallyServer;

import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    /*
    Denne metodes logik er at modtage et board og sende til de andre klienter
     */
    @PostMapping("/transferBoard")
    public void transferBoard(@RequestBody String jsonBoard) {
        System.out.println(jsonBoard);
    }

    /*
    Denne metodes ansvar er at modtage et board fra en klient og gemme i resource/savedgames folderen
     */
    @PostMapping("/savegame")
    public void saveGame(@RequestBody String jsonBoard) {
        System.out.println("hej" + jsonBoard);
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
