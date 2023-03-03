package main_2.j_5_r;

import java.util.Date;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Book implements Comparable<Book>, Cloneable {
	
	private String title;
	private Date publishDate;
	private String comment;
	
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
	
	public boolean equals(Object o) {
		return EqualsBuilder.reflectionEquals(this, o);
	}
	
	public int compareTo(Book o) {
		return CompareToBuilder.reflectionCompare(
				this, o, "comment", "title");
	}
	
	public Book clone() {
		Book b = new Book();
		b.title = this.title;
		b.comment = this.comment;
		b.publishDate = (Date)this.publishDate.clone();
		return b;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public Date getPublishDate() {
		return this.publishDate;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getComment() {
		return this.comment;
	}

}
