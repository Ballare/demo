package Dokumentenverwaltung;
import java.util.ArrayList;
public class DocumentDemo {

	public static void main(String[] args) {
		ArrayList<String>lines=new ArrayList<>();
		
		Document Dok=new Document("doc");
		TextDocument Text=new TextDocument("Text", "txt");
		ImageDocument Imag=new ImageDocument("Image",10 ,20 ,"blue");
		CsVDocument CSV=new CsVDocument("CSV",lines);
		
		Dok.printDocument();
		Text.printDocument();
		Imag.printDocument();
		
		CSV.addLine("Dok");
		CSV.addLine("TEXT");
		CSV.addLine("Imag");
		
		CSV.printDocument();
		
		System.out.println(lines);
		
		
		
		
		
	
		
		

	}

}
