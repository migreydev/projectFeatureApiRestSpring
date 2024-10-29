package org.fundacion.repaso.services;

import java.util.List;

import org.fundacion.repaso.dto.AsignaturaDTO;
import org.fundacion.repaso.persistance.model.Asignatura;

public interface AsignaturaServiceI {
    List<AsignaturaDTO> getAsignaturas();
    
    
}
