package fi.haagahelia.assignment.bookstore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity

public class Book {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;
		private String title;
		private String author;
		private int year;
		private int isbn;
		private int price;
		@ManyToOne
		@JoinColumn(name = "categoryid")
		private Category category;
		
		public Book() {}
		
		public Book(String title, String author, int year, int isbn, int price, Category category) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
		this.isbn = isbn;
		this.price = price;
		this.setCategory(category);
	}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public int getIsbn() {
			return isbn;
		}

		public void setIsbn(int isbn) {
			this.isbn = isbn;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "Book [id=" + id + ", title=" + title + ", author=" + author + ", year=" + year + ", isbn=" + isbn
					+ ", price=" + price + ", category=" + category + "]";
		}

		public Category getCategory() {
			return category;
		}

		public void setCategory(Category category) {
			this.category = category;
		}
		

}
