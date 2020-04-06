package inheritance;

//Use of Super Keyword

public class School {
	
	String SchoolName;
	String SchoolLocation;
	String SchoolPricipal;
	int NoofTeacher;
	String SchoolType;
	int SchoolFee;
	int SchoolMaintance;
	int Standard;
	
	School(String SN, String SL, String SP,  String ST){
		SchoolName = SN;
		SchoolLocation = SL;
		SchoolPricipal = SP;
		SchoolType = ST;
	}
	School(int NumofTeacher, int SM){
		NoofTeacher =NumofTeacher;
		SchoolMaintance = SM;
	}
	
	public int Fee() {	
		return SchoolFee+SchoolMaintance;	
	}
	
	public String SchoolTimming(int Standard) {
		String Timming;
		switch(Standard) {
			 
		case 1:
			Timming = "9 AM to 12 PM";
			break;
		case 2:
			Timming = "9 AM to 1 PM";
			break;
		case 3:
			Timming = "9 AM to 2 PM";
			break;
		default:
			Timming = "10 AM to 4 PM";
		
		}
		return Timming;
		
		 
	}
	
	
	
	
	

}
