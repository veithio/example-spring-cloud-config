package io.veith.configclient.environment;

import lombok.AccessLevel;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Example controller to display a message from the current env
 */
@RestController
@Getter(AccessLevel.PRIVATE)
public class EnvironmentController {

    @Value("${message}")
    private String message;

    @RequestMapping("/")
    public String home() {
        return getMessage();
    }

}
