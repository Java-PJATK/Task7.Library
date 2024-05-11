class Library {
    private Shelf[] shelves;

    public Library(Shelf[] shelves) {
        this.shelves = shelves;
    }

    public int countAuthor(String authorName) {
        int count = 0;
        for (Shelf shelf : shelves) {
            for (Book book : shelf.getBooks()) {
                if (book.getAuthor().equals(authorName)) {
                    count++;
                }
            }
        }
        return count;
    }
}
