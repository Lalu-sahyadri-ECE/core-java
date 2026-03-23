class Terminal{

int terminalId;
String terminalName;

public Terminal(int terminalId,String terminalName){
this.terminalId = terminalId;
this.terminalName = terminalName;
}

public void getTerminalDetails(){
System.out.println("Terminal ID is " +this.terminalId);
System.out.println("Terminal Name is " +this.terminalName);

}
}