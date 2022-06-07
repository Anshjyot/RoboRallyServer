package Gruppe11.RoboRallyServer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestClass {
    TestDTO testDTO = new TestDTO(12,"Peter");
   @GetMapping("/Test")
    public String Test() {
        return "Hello World";

    }
}
