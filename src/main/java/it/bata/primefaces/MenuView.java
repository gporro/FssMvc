package it.bata.primefaces;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="menuView")
@RequestScoped
public class MenuView implements Serializable {

	private static final long serialVersionUID = 7157956337831602125L;
	//this managed property will read value from request parameter pageId 
	@ManagedProperty(value="#{param.pageId}") 
	private String pageId=null;

	public void addMessage(String summary, String detail) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public String showPage(){ 
		if(pageId == null){ 
			return "404"; 
		} 
		if(pageId.equals("home")){ 
			return "home"; 
		}else if(pageId.equals("XSLImport")){
			addMessage("XSLImport", "Import data from xsl");
			return "XSLImport"; 
		}else if(pageId.equals("logout")){
			addMessage("LOGOUT", "Effettua il login per accedere");
			return "login"; 
		}else if(pageId.equals("ADSList")){
			addMessage("ADS LIST", "List of ADS Value");
			return "ADSList"; 
		}else{ 
			return "404"; 
		}
	}

	public String getPageId() {
		return pageId;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}

}