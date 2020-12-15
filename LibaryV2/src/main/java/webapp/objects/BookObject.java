package webapp.objects;

public class BookObject {
private int id;
private String title;
private String authorFirstName;
private String authorLastName;
private int yearOfPublish;
private String publishingHouse;
private float price;




public int getId() {
	return id;
}




public String getTitle() {
	return title;
}




public String getAuthorFirstName() {
	return authorFirstName;
}




public String getAuthorLastName() {
	return authorLastName;
}




public int getYearOfPublish() {
	return yearOfPublish;
}




public String getPublishingHouse() {
	return publishingHouse;
}




public float getPrice() {
	return price;
}




public void setId(int id) {
	this.id = id;
}




public void setTitle(String title) {
	this.title = title;
}




public void setAuthorFirstName(String authorFirstName) {
	this.authorFirstName = authorFirstName;
}




public void setAuthorLastName(String authorLastName) {
	this.authorLastName = authorLastName;
}




public void setYearOfPublish(int yearOfPublish) {
	this.yearOfPublish = yearOfPublish;
}




public void setPublishingHouse(String publishingHouse) {
	this.publishingHouse = publishingHouse;
}




public void setPrice(float price) {
	this.price = price;
}




@Override
public String toString() {
	return "BookObject [id=" + id + ", title=" + title + ", authorFirstName=" + authorFirstName + ", authorLastName="
			+ authorLastName + ", yearOfPublish=" + yearOfPublish + ", publishingHouse=" + publishingHouse + ", price="
			+ price + "]";
}
}
