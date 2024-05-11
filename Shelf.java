class Shelf {
    private String id;
    private Book[] books;

    public Shelf(String id, Book[] books) {
        this.id = id;
        this.books = books;
    }

    public String getId() {
        return id;
    }

    public Book[] getBooks() {
        return books;
    }
}
