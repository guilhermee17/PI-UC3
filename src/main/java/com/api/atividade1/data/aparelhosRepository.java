
package com.api.atividade1.data;

import com.api.atividade1.model.Aparelhos;
import org.springframework.data.jpa.repository.JpaRepository;
public interface aparelhosRepository extends JpaRepository<Aparelhos, Long>{
    
}
