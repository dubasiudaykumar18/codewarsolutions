import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class CSVReader {

	public static void main(String[] args) {

        String csvFile = "/Users/udaykumardubasi/Desktop/TT_Docs/State_Country_List/CountriesList.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);
                if(country.length == 2) {
                System.out.println("Statecity [city= " + country[1].toString() + " , state=" + country[0].toString() + "]");
                }else {
                	
                	System.out.println("Statecity [state=" + country[0].toString() + "]");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
	
	
}
