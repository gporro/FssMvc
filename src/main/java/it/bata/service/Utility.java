package it.bata.service;

import javax.persistence.*;

public class Utility {


	private static Utility istanza;
	private EntityManager em;
	private EntityManagerFactory emf;
	
	private Utility()
	{
	}

	public static Utility getInstance()
	{
		if (istanza == null)
		{
			istanza = new Utility();
		}

		return istanza;
	}

	public void initDBConnection()
	{
		emf = Persistence.createEntityManagerFactory("FssNew");//, System.getProperties()
		em = emf.createEntityManager();
	}

	public EntityManager getEm(){
		if(em == null)
		{
			this.initDBConnection();
			}
		return em;
	}


}
