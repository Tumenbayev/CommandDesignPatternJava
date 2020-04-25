/**
 *  оманда дл€ вставки текста в документ
 * 
 * @author ATIKON
 *
 */
public class PasteCommand implements Command {
	private Document document;
	private int position;
	private String text;

	public PasteCommand( Document document,   int position, String text ) {  
		this.document = document;  
		this.position = position;  
		this.text = text; 
	}  
	
	public void execute() {   
		document.insertText(text, position);  
	} 
	
	public void unexecute() {   
		document.deleteText(position, text.length());  	
	}  
	
	public boolean isReversible() { 
		return true;
	} 
}
