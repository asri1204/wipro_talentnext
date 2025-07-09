package encapsulation;

public class Authordetails {
    
    // Author class
    static class Author {
        private String name;
        private String email;
        private char gender;

        // Constructor
        public Author(String name, String email, char gender) {
            this.name = name;
            this.email = email;
            this.gender = gender;
        }

        // Getters
        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public char getGender() {
            return gender;
        }

        // toString() for Author
        @Override
        public String toString() {
            return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
        }
    }

    // Book class
    static class Book {
        private String name;
        private Author author;
        private double price;
        private int qtyInStock;

        // Constructor
        public Book(String name, Author author, double price, int qtyInStock) {
            this.name = name;
            this.author = author;
            this.price = price;
            this.qtyInStock = qtyInStock;
        }

        // Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Author getAuthor() {
            return author;
        }

        public void setAuthor(Author author) {
            this.author = author;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQtyInStock() {
            return qtyInStock;
        }

        public void setQtyInStock(int qtyInStock) {
            this.qtyInStock = qtyInStock;
        }

        // toString() for Book
        @Override
        public String toString() {
            return "Book[name=" + name + ", " + author.toString() + ", price=" + price + ", qtyInStock=" + qtyInStock + "]";
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create an Author
        Author author = new Author("J.K. Rowling", "jkrowling@example.com", 'F');

        // Create a Book using the Author
        Book book = new Book("Harry Potter and the Sorcerer's Stone", author, 29.99, 100);

        // Print Book details (includes Author details)
        System.out.println(book);
    }
}
