import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;

public class GeneratePDF {

	public static void main(String[] args) {
		try {
			System.out.println("Start");
			String path = "C:\\Users\\kumar\\eclipse-workspace\\testPdf.pdf";
			PdfWriter pdfWriter = new PdfWriter(path);
			
			PdfDocument pdfDocument = new PdfDocument(pdfWriter);
			pdfDocument.addNewPage();
			
			
			Document document = new Document(pdfDocument);
			
			document.close();
			
		
		
			System.out.println("End");
		}
		catch(Exception e) {
			System.out.println(e.getMessage()); 
		}
		

	}

}
