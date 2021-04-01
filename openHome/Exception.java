package openHome;


class BookException extends Exception{
	public BookException(String errMsg) {
		super(errMsg);
	}
}

class Book{
	private double price;
	public void setPrice(double price) throws BookException{
		if(price < 0)
			throw new BookException("書價不可為負數");
	}
}

class Propagate{
	public static void main(String[] args) {
		Book book = new Book();
		try {book.setPrice(-580.0);}
		catch (BookException e) {
			System.out.println("BookException");
		}
		
	}
}