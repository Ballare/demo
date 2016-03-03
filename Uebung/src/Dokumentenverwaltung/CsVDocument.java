package Dokumentenverwaltung;
import java.util.ArrayList;
public class CsVDocument extends Document{

	ArrayList<String>lines=new ArrayList<>();
	
	
	public CsVDocument(String fileName, ArrayList<String>lines) {
		super(fileName);
		
		
	}

	@Override
	public void printDocument(){
		System.out.println("CSVDokument "+fileName);
		for(String CSV:lines){
			System.out.println(CSV);
		}
	}
	public void addLine(String line){
		lines.add(line);
	}
	
}
