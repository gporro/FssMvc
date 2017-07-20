package it.bata.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import it.bata.model.Telefono;
import it.bea.dao.AdsDaoImpl;

@ManagedBean(name="adsList")
@SessionScoped
public class AdsList implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1371438258703164717L;
	private List<Telefono> adsList = new ArrayList<Telefono>();
	AdsDaoImpl adsDaoImpl = new AdsDaoImpl();
	
	public AdsList() {
//		Ads ads= new Ads("21","head","text","y","331","Roma");
//		adsList.add(ads);
//		ads= new Ads("51","head2","text2","n","31","Milano");
//		adsList.add(ads);
	}

	public List<Telefono> getAdsList() {
		return adsList;
	}

	public void setAdsList(List<Telefono> adsList) {
		this.adsList = adsList;
	}
	
	public void populateADSList(){
		setAdsList(adsDaoImpl.getAllADS());
	}

}
