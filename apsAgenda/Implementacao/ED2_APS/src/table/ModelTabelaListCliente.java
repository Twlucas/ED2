
package table;

import test.test;

/**
 *
 * @author nakao<nakaosensei@gmail.com>
 */
public class ModelTabelaListCliente extends UsualTableModel<test>{
    
    
    public ModelTabelaListCliente(){
        super(
            "nome=Nome",
            "cpf=CPF",
            "telfixo1=Telefone(Fixo)",
            "telfixo2=Telefone(Fixo)",
            "telcelular1=Telefone(Celular)",
            "telcelular2=Telefone(Celular)"            
        );
    }
    
    
     
    
}
