package book;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class JTextFieldLimit extends PlainDocument{
	private int limit = 4;
	
	public JTextFieldLimit(int limit) {
		super();
		this.limit = limit;
	}
	public JTextFieldLimit() {
		this(4);
	}
	 
	public void insertString(int offs,
            String str,
            AttributeSet a)
     throws BadLocationException{
		if(str == null) return;
		if(getLength() + str.length() <= limit) {
			super.insertString(offs, str, a);
		}
	}
}
