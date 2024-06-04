
package com.api.atividade1.data;

import com.api.atividade1.model.Alunos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface alunoRepository extends JpaRepository<Alunos, Long> {
    
}
