// Rafael Gomides

package pArietama;

import cnndb.CMDB;
import gerext.cManipulador;

public class Arietama {

	
    
    public static void main(String[] args) {

    	cnnDatabase(); // Establish connection with DB
    	loadModules(); // Load and get the modules
    }

    public static void cnnDatabase() {

        CMDB cnn = new CMDB();
        cManipulador man = new cManipulador();
        
        man.CarregarInfo();
                
        if (cnn.CMDB(1, man.getUrl(), man.getLogin(), man.getPassword()) == 1) {
            System.out.println("Deu certo");
        }
    }

    public static void loadModules() {


    }

}
