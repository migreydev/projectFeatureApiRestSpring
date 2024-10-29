package org.fundacion.repaso.controllers;

import java.util.List;

import org.fundacion.repaso.dto.AsignaturaDTO;
import org.fundacion.repaso.persistance.model.Alumno;
import org.fundacion.repaso.persistance.model.Asignatura;
import org.fundacion.repaso.services.AsignaturaServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/asignaturas")
@CrossOrigin
public class AsignaturaController {
    @Autowired
    private AsignaturaServiceI asignaturaMngmnt;
    

    //metodo Get que devuleve una lista de asignaturasDTO
    @GetMapping("/")
    public List<AsignaturaDTO> selectAsignaturas() {
        return asignaturaMngmnt.getAsignaturas();
    }
    
    
 
    
}
