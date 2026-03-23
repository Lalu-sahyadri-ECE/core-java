class AirportRunner{
public static void main(String []args){
Terminal terminal = new Terminal(2,"Devanahalli");
Airport airport = new Airport(1 , "Kempegowda International Airport" , "Devanahalli", terminal);
airport.getAirportDetails();

}
}