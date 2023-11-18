package hexagonal_architecture.infrastructure_layer.in.web;

import hexagonal_architecture.domain_layer.model.EScooter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/escooter-registration")
public class WebUIAdapter {

    @GetMapping("")
    public String eScooterRegistration(Model model) {
        EScooter escooter = new EScooter();
        model.addAttribute("escooter", escooter);
        return "escooter-registration";
    }
}