package lepackage;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main
{

	public static void main(String[] args)
	{


	// création des deux listes
int i=0;


	 List<AR> AR =  new ArrayList<AR>();
	 List<AS> AS =  new ArrayList<AS>();

	 //Calcul.RepriseTableau(AR, AS);
	 Connection connection = null;
		try
		{
         Class.forName("org.postgresql.Driver");
         System.out.println("Drivers Ok!!");


         Connection maConnexion = DriverManager.getConnection("jdbc:postgresql://172.16.99.2:5432/csebillet","c.sebillet","passe");
         Statement maRequete = maConnexion.createStatement();

         System.out.println("Connection effective !");

         String texteRequete = "select * from \"Taxi\".\"Taxi\"";
         //définition de l'objet qui récupera le résultat de l'éxecution de la requète
         ResultSet curseurResultat = maRequete.executeQuery(texteRequete);

         // Récupération des détails du résultats
         ResultSetMetaData detailsDonnees = curseurResultat.getMetaData();

         while(curseurResultat.next())
         {
        	AR.add(new AR (curseurResultat.getInt("departement"),curseurResultat.getDouble("PriseCharge"), curseurResultat.getDouble("TarifHJS"),curseurResultat.getDouble("TarifHND"),curseurResultat.getDouble("TarifARND"),curseurResultat.getDouble("TarifARJS")));
 			AS.add(new AS (curseurResultat.getInt("departement"),curseurResultat.getDouble("PriseCharge"), curseurResultat.getDouble("TarifHJS"),curseurResultat.getDouble("TarifHND"),curseurResultat.getDouble("TarifASND"),curseurResultat.getDouble("TarifASJS")));
         }
         maConnexion.close();
		}
     catch (Exception e)
     {
       System.out.print("Erreur de connection");
     }




	 Saisie saisie = new Saisie(AR);

	 boolean saisieOK = false;
	 do
	 {
	 i =0;
	 boolean trouve= false;

	 while (!trouve && i < AR.size())
	 { // si le departement correspond à celui saisie lors de la fonction
         if(AR.get(i).getDept() == saisie.getDept())
             trouve=true;
         else
         	i++;
     }

	 if (!trouve)
	 { Scanner saisies = new Scanner(System.in);
		System.out.print("Veuillez saisir un bon numero de departement (21 - 25 - 39 - 44 - 72 - 73 - 74 - 75 - 85 - 90 : ");
		saisie.setDept(saisies.nextInt());

	 }
	 else

		 saisieOK=true;
	 }
	 while (!saisieOK);

	 //System.out.println("résultat : " +	 String.valueOf(Calcul.calculer(i, saisie, AR, AS)) + "€");


	}

}


