package lepackage;
import java.util.List;

/**
 * Calcul est la classe comprenant le calcul du remboursement.
 *
 * @author Clément Sébillet
 * @version 5.0
 */

public class Calcul {

	/**
     * Retourne le montant du remboursement.
     *
     * @return un décimal montantRemb, qui correspond au montant du remboursement.
     */

	public static double calculer(int i, List<AR> maListeAR, List<AS> maListeAS , boolean rdbtnAr, boolean rdbtnAs, boolean rdbtnJ, boolean rdbtnN, boolean rdbtnS, boolean rdbtnWe, int txtTemps, int txtKm)
	{
		double montantRemb = 0;

		//Calcul remboursement
				//Si c'est un aller simple
				if(rdbtnAs){
					//Si c'est en semaine de jour
					if(rdbtnS && rdbtnJ){
						montantRemb = maListeAS.get(i).getPriseEnCharge() + (txtKm * maListeAS.get(i).getTarifASJS());

						//Si le trajet dépasse 1h
						if(txtTemps > 1){
							montantRemb += montantRemb + (txtTemps * maListeAS.get(i).getHoraireJS());
						}
					}else
					//Sinon c'est de semaine de nuit ou en WE
					if((rdbtnS && rdbtnN) || rdbtnWe){
						montantRemb = maListeAS.get(i).getPriseEnCharge() + (txtKm * maListeAS.get(i).getTarifASNW());

						//Si le trajet dépasse 1h
						if(txtTemps > 1){
							montantRemb += montantRemb + (txtTemps * maListeAS.get(i).getHoraireNW());
						}
					}
				}else
					//Si c'est en semaine de jour
					if(rdbtnS && rdbtnJ){
						montantRemb = maListeAR.get(i).getPriseEnCharge() + (txtKm * maListeAR.get(i).getTarifARJS());

						//Si le trajet dépasse 1h
						if(txtTemps > 1){
							montantRemb += montantRemb + (txtTemps * maListeAR.get(i).getHoraireJS());
						}
					}else
					//Sinon c'est de semaine de nuit ou en WE
					if((rdbtnS && rdbtnN) || rdbtnWe){
						montantRemb = maListeAR.get(i).getPriseEnCharge() + (txtKm * maListeAR.get(i).getTarifARNW());

						//Si le trajet dépasse 1h
						if(txtTemps > 1){
							montantRemb = montantRemb + (txtTemps * maListeAR.get(i).getHoraireNW());
						}
				}

				return montantRemb;
	}
}