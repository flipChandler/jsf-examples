package br.com.felipesantos;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TourBean {
	
	private String kindOfTour;

	public TourBean() {

	}
	
	public String startTheTour() {
		return kindOfTour != null && kindOfTour.equals("city") 
			? "city_tour"
			: "country_tour";
	}

	public String getKindOfTour() {
		return kindOfTour;
	}

	public void setKindOfTour(String kindOfTour) {
		this.kindOfTour = kindOfTour;
	}	
}
