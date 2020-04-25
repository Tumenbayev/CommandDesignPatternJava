/**
 * Объект документа с возможностью добавлять/удалять
 * @author ATIKON
 *
 */
public class Document {
	public void insertText(String text, int position) {
		System.out.println(text + " " + position + " " + "inserted");
	}
	
	public void deleteText(int position, int length) {
		System.out.println(position + " " + length + " " + "deleted");
	}
}
