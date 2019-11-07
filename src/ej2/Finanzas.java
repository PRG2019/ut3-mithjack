package ej2;

public class Finanzas {
public double Divisa;
public double conver;

//Constructores
Finanzas(){
	conver=1.36;
	Divisa=0;
	
}
Finanzas(double c){
	conver=c;
	Divisa=0;
}



//metodos
public double getDivisa() {
	return Divisa;
}
public void setDivisa(double d) {
	Divisa=d;
}

public void mostrarEur() {
	double total=Divisa/conver;
	System.out.println(total);

}
public void mostrarDol() {
	double total=Divisa*conver;
	System.out.println(total);
}
}

