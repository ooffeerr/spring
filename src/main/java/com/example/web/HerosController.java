package com.example.web;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class HerosController {


    public HerosController() {
    }

    /*
     { id: 11, name: 'Mr. Nice' },
    { id: 12, name: 'Narco' },
    { id: 13, name: 'Bombasto' },
    { id: 14, name: 'Celeritas' },
    { id: 15, name: 'Magneta' },
    { id: 16, name: 'RubberMan' },
    { id: 17, name: 'Dynama' },
    { id: 18, name: 'Dr IQ' },
    { id: 19, name: 'Magma' },
    { id: 20, name: 'Tornado' }
     */

    @CrossOrigin(origins = "*",
            methods = {RequestMethod.GET, RequestMethod.PUT, RequestMethod.POST, RequestMethod.DELETE})
    @RequestMapping("/heros")
    public ArrayList<Hero> greeting(@RequestParam(value="name", defaultValue="World") String name) {
        ArrayList<Hero> heros = new ArrayList<>(20);
        heros.add(new Hero(11, "Mr. Nice"));
        heros.add(new Hero(12, "Narco"));
        heros.add(new Hero(13, "Bombasto"));
        heros.add(new Hero(14, "Celeritas"));
        heros.add(new Hero(15, "Magneta"));
        heros.add(new Hero(16, "RubberMan"));
        heros.add(new Hero(17, "Dynama"));
        heros.add(new Hero(18, "Dr IQ"));
        heros.add(new Hero(19, "MAgma"));
        heros.add(new Hero(20, "Tornado"));
        System.out.println("heros = [" + heros + "]");
        return heros;
    }
}