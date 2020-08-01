package tn.lass.simplerest.rest;

import com.lass.Calcul;
import com.lass.Power;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/api")
public class SimpleRest {

    @Autowired
    public Calcul calcul;

    @PostMapping("/multiple")
    public Long multiple(@PathParam("value") Long value) {
        return calcul.multiple2(value);
    }

    @PostMapping("/power")
    public Long power(@PathParam("value") Long value) {
        return Power.power2(value);
    }

}
