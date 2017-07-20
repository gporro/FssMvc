package it.bea.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

import it.bata.model.Telefono;
import it.bata.service.Utility;

public class AdsDaoImpl implements Serializable,adsDao{
	private static final long serialVersionUID = 2184669238393484876L;

	//private static final String GET_ALL_ADS = "SELECT x FROM AdsModel x";
	public AdsDaoImpl() {}

	@SuppressWarnings("unchecked")
	public List<Telefono> getAllADS() {
		List<Telefono> adsList = new ArrayList<Telefono>();
		Query query = Utility.getInstance().getEm().createQuery("SELECT x FROM Telefono x");
        adsList = (List<Telefono>)query.getResultList();
        System.out.println("val = " + adsList.get(0).getIdNumero());
        return adsList;
	}

}
