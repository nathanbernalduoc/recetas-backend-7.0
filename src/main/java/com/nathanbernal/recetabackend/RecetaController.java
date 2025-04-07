package com.nathanbernal.recetabackend;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecetaController {
    
    private List<Receta> recetas = new ArrayList<>();

    public RecetaController() {
        recetas.add(new Receta(1, "Arroz con huevo", "1 Kilo de Arroz, 2 huevos, sal, aceite", "Cocer el arroz , feir el huevo en aceite, hechar sal a gusto." ));
        recetas.add(new Receta(2, "Sushi", "1 Kilo de Arroz, carnes varias, sal, soya", "Cocer el arroz , estirar el arroz como una masa, colocar carnes en la superficie, poner sal a gusto, enrollar, mezclar con soya." ));
        recetas.add(new Receta(3, "Puré", "1 Kilo de papas, leche, sal", "Cocer las papas, moler, mezclar con leche a gusto, y servir caliente." ));
        recetas.add(new Receta(4, "Carne mechada", "1 Kilo de carne, verduras, sal, agua", "Cocer la carne por 3 horas, mezclar con las verduras y el agua, volver a cocer por 1 hora, aplicar sal." ));
        recetas.add(new Receta(5, "Te con pan", "1 bolsa de te, 1 k de pan, mantequill", "hervir 1lt de agua, poner bolsa de te en interior de taza, hechar mantequilla al pan, servir tibio." ));
    }

    @GetMapping("/recetas")
    public List<Receta> getRecetas() {
        return recetas;
    }

}
