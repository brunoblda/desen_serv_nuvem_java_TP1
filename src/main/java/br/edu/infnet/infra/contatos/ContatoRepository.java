

package br.edu.infnet.infra.contatos;

import java.util.HashMap;
import org.springframework.stereotype.Repository;
import br.edu.infnet.domain.contatos.Contato;
import java.util.Collection;

/**
 *
 * @author bruno
 */
@Repository
public class ContatoRepository {
    
    private HashMap<Integer, Contato> contatos;
    private static int ids = 5;
    
    public ContatoRepository(){
        
        contatos = new HashMap<>();
        contatos.put(1, new Contato(1, "Bruno Luiz","brunol" ,"bruno@email.com", "61998845552"));
        contatos.put(2, new Contato(2, "Carlos Aguiar","CarlosGuiar" ,"carlos@email.com", "61844955532"));
        contatos.put(3, new Contato(3, "Clara Cristina","ClaraCristi", "clara@email.com", "62978545344"));
        contatos.put(4, new Contato(4, "Gabriela Gomes","GaGomes", "gabriela@email.com", "61994325859"));
        
    }
    
    public Collection<Contato> listar(){
        
        return this.contatos.values();   
    }
    
    public Contato obter(int id){
        
        return contatos.get(id);
        
    }
    
}
