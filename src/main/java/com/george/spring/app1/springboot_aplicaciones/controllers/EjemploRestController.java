package com.george.spring.app1.springboot_aplicaciones.controllers;


//port java.util.Map;
//port java.time.LocalDate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//port java.util.HashMap;
//port com.george.spring.app1.springboot_aplicaciones.models.Empleado;
import com.george.spring.app1.springboot_aplicaciones.models.dto.claseDTO;
@RestController
@RequestMapping("/api")
public class EjemploRestController {
    
   /*GetMapping("/detalles_info2")
    
    
    public Map<String, Object> respuesta() {
        Empleado empleado1= new Empleado("George", "Smith", "123 Main St", "george.smith@example.com", 1, 30, 1234567890);
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("titulo", "Detalles del Empleado");
        respuesta.put("informacion", empleado1);
        respuesta.put("fecha", LocalDate.now());
        return respuesta;
    }
}*/
@GetMapping("/detalles_info2")

public claseDTO detalle_info2() {
    claseDTO usuario1 = new claseDTO("Administrador", "George Smith");
    return usuario1;
}
}