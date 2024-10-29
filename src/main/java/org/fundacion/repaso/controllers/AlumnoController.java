package org.fundacion.repaso.controllers;

import java.sql.Date;
import java.util.List;

import org.fundacion.repaso.dto.AlumnoDTO;
import org.fundacion.repaso.dto.CrearAlumnoDTO;
import org.fundacion.repaso.services.AlumnoServiceI;
import org.fundacion.repaso.services.AsignaturaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/api/v1/alumno")
@CrossOrigin
public class AlumnoController {

    @Autowired
    AlumnoServiceI alumnoMngmnt;
    
    @Autowired
    AsignaturaServiceImpl alumnoService;
    
    @GetMapping("/selectWhereEmail/{email}")
    public AlumnoDTO selectWhereEmail(@PathVariable String email) {
        return alumnoMngmnt.getAlumnoByEmail(email);
    }
    
    @GetMapping("/selectWhereBirthdate/{from_date}/{to_date}")
    public List<AlumnoDTO> getMethodName(@PathVariable("from_date") Date from_date, @PathVariable("to_date") Date to_date) {
        return alumnoMngmnt.getAlumnosBetweenBirthdates(from_date, to_date);
    }

    @PostMapping("/insert")
    public void insertAlumno(@RequestBody CrearAlumnoDTO alumno) {
        alumnoMngmnt.insertAlumno(alumno);
    }
    
    // metodo Get que devuelve una lista de alumnos como alumno DTO 
    @GetMapping("/")
    public List<AlumnoDTO> getAlumnos() {
        return alumnoMngmnt.getAlumnos();
    }
    
    
    
    
    

}
