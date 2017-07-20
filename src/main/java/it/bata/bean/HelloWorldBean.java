package it.bata.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="home")
@SessionScoped
public class HelloWorldBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String messaggio = "Home page - BackEnd";
	private String name = "pippo";
	private String cognome = "pluto";	
	
	public HelloWorldBean() {
		
	}
	 
    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }
 
    public String getMessaggio() {
        return this.messaggio;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public String toString(){
		return "nome = " + name + "   cognome = " + cognome + "   messaggio = " + messaggio;
	}

}
