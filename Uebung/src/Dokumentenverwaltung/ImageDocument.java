package Dokumentenverwaltung;

public class ImageDocument extends Document{

	
	protected int sizeX;
	protected int sizeY;
	protected String colour;
	
	
	public ImageDocument(String fileName, int sizeX, int sizeY, String colour) {
		super(fileName);
		this.sizeX=sizeX;
		this.sizeY=sizeY;
		this.colour=colour;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printDocument(){
		System.out.println("ImageDokument "+fileName+"Size "+sizeX+"x"+sizeY+"."+colour);
	}
}
