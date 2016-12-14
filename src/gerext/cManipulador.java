/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerext;

import msgsis.Erro;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author rafaelgs
 */
public final class cManipulador {

    private String login; //Variavel que guardará o login do servidor.
    private String url; //Variavel que guardará o host do servidor.
    private String password; //Variável que guardará o password do usúario.
    String[] info = new String [3];
    Erro err = new Erro();
    Properties prop = new Properties();

    public void cManipulador() {

    }

    public String[] CarregarInfo() {

        try {
            FileInputStream file = new FileInputStream("./conf/bd.properties");
            prop.load(file);

        } catch (IOException ex) {
            err.Erro("Não foi possível carregar o arquivo de configuração!");
        }

        setUrl(prop.getProperty("prop.server.url"));
        setLogin(prop.getProperty("prop.server.login"));
        setPassword(prop.getProperty("prop.server.senha"));
        
        info[0] = getUrl();
        info[1] = getLogin();
        info[2] = getPassword();
        
        return info;

    }

    public void SalvarInfo(String url, String login, String senha) {

        prop.setProperty("prop.server.url", url);
        prop.setProperty("prop.server.login", login);
        prop.setProperty("prop.server.senha", senha);

        try {
            FileOutputStream fos = new FileOutputStream("./conf/bd.properties");
            prop.store(fos, "FILE DB PROPERTIES:");
            fos.close();
        } catch (IOException ex) {
            err.Erro("Não foi possível salvar as informações");
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
