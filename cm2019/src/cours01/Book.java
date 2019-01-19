package cours01;
//Creation de la classe
public class Book { 
	private String title;
	private String author;
	private int page;
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.title=("Manuel scolaire");
		book1.author=("Charles du roi");
		book1.page=(90);
		
		Book book2 = new Book();
		book2.title=("khok ana");
		book2.author=("lachir");
		book2.page=(300);
		
		System.out.println(book2);
		
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", page=" + page + "]";
	}
}
