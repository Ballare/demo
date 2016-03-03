package Dokumentenverwaltung;

public class TextDocument extends Document{

	protected String content;

	public TextDocument(String fileName, String content) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void printDocument(){
		System.out.println("TextDokument "+fileName+"."+content);
	}
}
