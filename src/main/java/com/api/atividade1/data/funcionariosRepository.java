
package com.api.atividade1.data;

import com.api.atividade1.model.Funcionarios;
import org.springframework.data.jpa.repository.JpaRepository;
public interface funcionariosRepository extends JpaRepository<Funcionarios, Long>{
    
}
