package lepackage;

/**
 * AS est la classe comprenant toutes les données pour un aller simple.
 *
 * @author Clément Sébillet
 * @version 5.0
 */

public class AS extends Tarif{

	private double tarifASJS;
	private double tarifASNW;

	//*************   ACCESSEURS    *************
	public double getTarifASJS()
	{
	    return tarifASJS;
	}

	public double getTarifASNW()
	{
	    return tarifASNW;
	}

	//*************   CONSTRUCTEUR   *************
	AS(int dept, double priseEnCharge, double horaireJS, double horaireNW, double tarifASJS, double tarifASNW){
		super(dept, priseEnCharge, horaireJS, horaireNW);
		this.tarifASJS = tarifASJS;
		this.tarifASNW = tarifASNW;
	}
}