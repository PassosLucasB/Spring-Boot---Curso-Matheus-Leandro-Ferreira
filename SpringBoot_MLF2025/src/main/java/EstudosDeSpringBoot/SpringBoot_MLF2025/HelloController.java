package EstudosDeSpringBoot.SpringBoot_MLF2025;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class HelloController {
    
    @GetMapping("/hello")
    public String hello() {
        return "Olá mundo!!! Bem-vindo ao Spring Boot";
    }
    


}
