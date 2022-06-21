package at.technikum.examslm;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;

@RestController
public class GeneratorController {
    @RequestMapping("/generator")
    public int randomNumber(){
        Random num = new Random();
        return num.nextInt(100);
    }
}
