package org.fundacion.repaso.dto;

import java.util.ArrayList;
import java.util.List;

import org.fundacion.repaso.persistance.model.Alumno;
import org.fundacion.repaso.persistance.model.Asignatura;
import org.fundacion.repaso.persistance.model.Nota;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AsignaturaDTO {
    private Long id;
    private String asignaturaName;
    private List<AlumnoDTO> alumnosMat;
    private List<NotaDTO> notasAlumnos; //Lista de notas de alumnos

    public AsignaturaDTO(Asignatura a) {
        this.id = a.getAsignaturaId();
        this.asignaturaName = a.getAsignaturaName();
        this.alumnosMat = toAlumnoDTO(a.getAlumnosMatriculados());
        this.notasAlumnos= toListNotasDTO(a.getNotas());
        
    }

    private List<AlumnoDTO> toAlumnoDTO(List<Alumno> alumnos) {
        List<AlumnoDTO> alumnosDTO = new ArrayList<>();
        for (Alumno a : alumnos) {
            alumnosDTO.add(new AlumnoDTO(a));
        }
        return alumnosDTO;
    }

    
 // Convierte una lista de objetos Nota en una lista de objetos NotaDTO
    private List<NotaDTO> toListNotasDTO(List<Nota> notas){
    	List<NotaDTO> notasDTO = new ArrayList<>();
    	for(Nota n : notas) {
    		notasDTO.add(new NotaDTO(n));
    	}
    	return notasDTO;
    }
}
