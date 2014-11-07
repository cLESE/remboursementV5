package lepackage;

/**
 * Tarif est la classe comprenant toutes les données pour un déplacement sans faire la distinction entre aller simple ou aller retour.
 *
 * @author Clément Sébillet
 * @version 5.0
 */

public class Tarif {

	private int dept;
	private double priseEnCharge;
	private double horaireJS;
	private double horaireNW;

	//*************   ACCESSEURS    *************
	/**
     * Accesseur du numéro du département.
     *
     * @return Une instance de SDZLevel, qui correspond à niveau du membre sur SDZ.
     */
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