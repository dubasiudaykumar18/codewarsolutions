import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.util.ArrayList;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class createSiteMapUrls {
	
	
	public static void main(String argv[]) {

		  try {
			  /*   Senior QA Automation Engineer,QA Engineer,Senior Project Manager
		           ,Full Stack Developer,Java Developer,.NET Developer,SAP BW4 HANA
				   ,Network Engineer,IT Audit Manager,UX UI Designer,Scrum Master
				   ,Senior Data Engineer,SAP BASIS Consultant,Data Analyst
					DevOps Engineer,Technical Business Analyst,Full Stack .NET Developer
					Network Administrator,RPA Developer,Senior Business Analyst
					Network Lead,Mobile Developer,Data Integration Architect
					SAP PPM,SAP Security GRC S4 HANA Consultant,Ab initio Developer
					SAP FICO S4 Hana,Hadoop Big Data Developer,Agile Coach
					iOS Developer,Service Desk Operator,IT Contractor
					Site Engineer*/
			ArrayList<String> jobtitiles = new ArrayList<String>();
			jobtitiles.add("Technical-Business-Analyst");
			jobtitiles.add("Full-Stack-.NET-Developer");
			jobtitiles.add("Network-Administrator");
			jobtitiles.add("RPA-Developer");
			jobtitiles.add("Network-Lead");
			jobtitiles.add("Mobile-Developer");
			jobtitiles.add("Data-Integration-Architect");
			jobtitiles.add("SAP-PPM");
			jobtitiles.add("SAP-Security-GRC-S4-HANA-Consultant");
			jobtitiles.add("Ab-initio-Developer");
			jobtitiles.add("Hadoop-Big-Data-Developer");
			jobtitiles.add("Agile-Coach");
			jobtitiles.add("iOS-Developer");
			jobtitiles.add("Service-Desk-Operator");
			jobtitiles.add("Senior-QA-Automation-Engineer");
			jobtitiles.add("QA-Engineer");
			jobtitiles.add("Senior-Project-Manager");
			jobtitiles.add("Full-Stack-Developer");
			jobtitiles.add("Java-Developer");
			jobtitiles.add(".NET-Developer");
			jobtitiles.add("SAP-BW4-HANA");
			jobtitiles.add("Network-Engineer");
			jobtitiles.add("UX-UI-Designer");
			jobtitiles.add("Scrum-Master");
			jobtitiles.add("Senior-Data-Engineer");
			jobtitiles.add("SAP-BASIS-Consultant");
			jobtitiles.add("Data-Analyst");
			jobtitiles.add("DevOps-Engineer");
			
			ArrayList<String> countriesList = new ArrayList<String>();
			//countriesList.add("Europe");
			countriesList.add("Ireland");
			countriesList.add("United-Kingdom");
			
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			// root elements
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("urlset");
			doc.appendChild(rootElement);

			// url elements
			for(int j=0 ; j<countriesList.size() ;j++) 
			{
            for(int i=0 ; i<jobtitiles.size() ;i++) {
            	Element url = doc.createElement("url");
    			rootElement.appendChild(url);
            	// location url element
    			Element loc = doc.createElement("loc");
    			loc.appendChild(doc.createTextNode("https://www.techfynder.com/"+jobtitiles.get(i)+"-IT-Contractors-in-"+countriesList.get(j)));
    			url.appendChild(loc);

    			// lastmodified date elements
    			Element lastmod = doc.createElement("lastmod");
    			lastmod.appendChild(doc.createTextNode("2020-02-03T13:17:13+00:00"));
    			url.appendChild(lastmod);

    			// priority elements
    			Element priority = doc.createElement("priority");
    			priority.appendChild(doc.createTextNode("0.80"));
    			url.appendChild(priority);
            	}
			}
			
			for(int j=0 ; j<countriesList.size() ;j++) 
			{
            for(int i=0 ; i<jobtitiles.size() ;i++) {
            	Element url = doc.createElement("url");
    			rootElement.appendChild(url);
            	// location url element
    			Element loc = doc.createElement("loc");
    			loc.appendChild(doc.createTextNode("https://www.techfynder.com/"+jobtitiles.get(i)+"-jobs-in-"+countriesList.get(j)));
    			url.appendChild(loc);

    			// lastmodified date elements
    			Element lastmod = doc.createElement("lastmod");
    			lastmod.appendChild(doc.createTextNode("2020-02-03T13:17:13+00:00"));
    			url.appendChild(lastmod);

    			// priority elements
    			Element priority = doc.createElement("priority");
    			priority.appendChild(doc.createTextNode("0.80"));
    			url.appendChild(priority);
            	}
			}

			// salary elements
			/*Element salary = doc.createElement("salary");
			salary.appendChild(doc.createTextNode("100000"));
			staff.appendChild(salary);*/

			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
	        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
			
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("/Users/udaykumardubasi/Desktop/TT_Docs/Asse/file.xml"));

			// Output to console for testing
			// StreamResult result = new StreamResult(System.out);
			
			transformer.transform(source, result);

			System.out.println("File saved!");

		  } catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		  } catch (TransformerException tfe) {
			tfe.printStackTrace();
		  }
		}

}
