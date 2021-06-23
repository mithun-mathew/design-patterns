package net.mithunmathew.designpatterns;

interface CourtPlan {
	
	public void setCourtType(String courtMaterial);
	public void setMarkings(String markings);
	public void setStands(String stands);
	
}

class Court implements CourtPlan {
	
	private String courtType;
	private String markings;
	private String stands;
	
	public void setCourtType(String courtType) {
		
		this.courtType = courtType;
		System.out.println("Court type set as " + this.courtType);
		
	}
	
	public void setMarkings(String markings) {
		
		this.markings = markings;
		System.out.println("Court markings set as " + this.markings);
		
	}
	
	public void setStands(String stands) {
		
		this.stands = stands;
		System.out.println("Court stands set as " + this.stands);
		
	}
	
}

interface CourtBuilder{
	
	public void addType();
	public void addMarkings();
	public void addStands();
	public Court getCourt();
	
}

class GrassCourt implements CourtBuilder{
	
	private Court court;
	
	public GrassCourt() {
		
		this.court = new Court();
		
	}
	
	public void addType() {
		
		court.setCourtType("Grass");
		
	}
	
	public void addMarkings() {
		
		court.setMarkings("Grass markings");
		
	}
	
	public void addStands() {
		
		court.setStands("Grass stands");
		
	}
	
	public Court getCourt() {
		
		return this.court;
		
	}
	
}

class ClayCourt implements CourtBuilder{
	
	private Court court;
	
	public ClayCourt() {
		
		this.court = new Court();
		
	}
	
	public void addType() {
		
		court.setCourtType("Clay");
		
	}
	
	public void addMarkings() {
		
		court.setMarkings("Clay markings");
		
	}
	
	public void addStands() {
		
		court.setStands("Clay stands");
		
	}
	
	public Court getCourt() {
		
		return this.court;
		
	}
	
}

class CourtMaker{
	
	private CourtBuilder courtBuilder;
	
	public CourtMaker(CourtBuilder courtBuilder) {
		
		this.courtBuilder = courtBuilder;
		
	}
	
	public Court getCourt() {
		
		return this.courtBuilder.getCourt();
		
	}
	
	public void makeCourt() {
		
		this.courtBuilder.addType();
		this.courtBuilder.addMarkings();
		this.courtBuilder.addStands();
		
	}
	
}

public class BuilderPattern {
	
	public static void main(String args[]) {
		
		CourtBuilder court = new GrassCourt();
		CourtMaker courtMaker = new CourtMaker(court);
		
		courtMaker.makeCourt();
		Court grassCourt = courtMaker.getCourt();
		System.out.println("Court constructed " + grassCourt);
		
		System.out.println();
		
		court = new ClayCourt();
		courtMaker = new CourtMaker(court);
		
		courtMaker.makeCourt();
		Court clayCourt = courtMaker.getCourt();
		System.out.println("Court constructed " + clayCourt);
		
	}

}
