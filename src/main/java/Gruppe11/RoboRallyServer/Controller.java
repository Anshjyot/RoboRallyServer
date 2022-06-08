package Gruppe11.RoboRallyServer;

import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonWriter;
import org.springframework.web.bind.annotation.RestController;


import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.google.gson.Gson;

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
        GameState gameState = new GameState();
        gameState.saveGame(jsonBoard);
    }
}




    /*
    @Autowired

    private IProductService productService;


    @GetMapping(value = "/products")
    public ResponseEntity<List<Product>> getAllProducts() throws IOException {
        try {
            List<Product> products = productService.findAll();
            return ResponseEntity.ok().body(products);
        } catch (IOException e) {
            return ResponseEntity.internalServerError().body(null);
        }
    }

    @PostMapping("/products")
    public ResponseEntity<String> addProduct(@RequestBody Product p) throws IOException {
        try {
            productService.addProduct(p);
            return ResponseEntity.ok().body("added");
        } catch (IOException e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) throws IOException {
        try {
            Product p = productService.getProductById(id);
            return ResponseEntity.ok().body(p);
        } catch (IOException e) {
            return ResponseEntity.internalServerError().body(null);
        }
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<String> updateProduct(@PathVariable int id, @RequestBody Product p) throws IOException {
        try {
            productService.updateProduct(id, p);
            return ResponseEntity.ok().body("updated");
        } catch (IOException e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id) throws IOException {
        try {
            productService.deleteProductById(id);
            return ResponseEntity.ok().body("deleted");
        } catch (IOException e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

}

 */