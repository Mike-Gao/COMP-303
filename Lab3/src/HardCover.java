public class HardCover extends Book {
    /**
     * Creates a new book item.
     *
     * @param pTitle  The title of the book.
     * @param pAuthor The name of the author
     * @param pType   The category of the book
     * @param pPrice  The price of the item in cents
     */
    public HardCover(String pTitle, String pAuthor, BookType pType, int pPrice) {
        super(pTitle, pAuthor, pType, pPrice);
    }

    public HardCover(Book b){
        super(b.getTitle(), b.getAuthor(), b.getType(), b.getPrice());
    }
    /* Create a method to add a book to the bookstore.
       This method must return an object which has a method which allows the deletion of the added book to be deleted from the BookStore.
       Use the appropriate design pattern to achieve this functionality.
       The design must support the additional behavior that is dispatched polymorphically without modifying the client code. */
    @Override
    public int getPrice() {
        return super.getPrice() * 2;
    }
}
