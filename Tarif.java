package lepackage;

public class Tarif {

	private int dept;
	private double priseEnCharge;
	private double horaireJS;
	private double horaireNW;

	//*************   ACCESSEURS    *************
	public int getDept()
	{
	    return dept;
	}

	public double getPriseEnCharge()
	{
	    return priseEnCharge;
	}

	public double getHoraireJS()
	{
	    return horaireJS;
	}

	public double getHoraireNW()
	{
	    return horaireNW;
	}


	//*************   CONSTRUCTEUR   *************
	Tarif(int dept, double priseEnCharge, double horaireJS, double horaireNW){
		this.dept = dept;
		this.priseEnCharge = priseEnCharge;
		this.horaireJS = horaireJS;
		this.horaireNW = horaireNW;
	}
}