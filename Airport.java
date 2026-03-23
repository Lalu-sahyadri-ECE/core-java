class Airport{
int airpotId;
String airportName ;
String airpotLocation;
Terminal terminal;

public Airport(int airpotId ,String airportName ,String airpotLocation ,Terminal terminal ){
this.airpotId = airpotId;
this.airportName = airportName;
this.airpotLocation =airpotLocation;
this.terminal =terminal;

}

public void getAirportDetails(){
System.out.println("Airport ID is "+this.airpotId);
System.out.println("Airport Name is "+this.airportName);
System.out.println("Airport Location is "+this.airpotLocation);
this.terminal.getTerminalDetails();


}

}