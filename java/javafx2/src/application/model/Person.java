package application.model;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

// 연락처 저장 모델 클래스
public class Person {
	private final StringProperty firstName;
	private final StringProperty lastName;
	private final StringProperty street;
	private final IntegerProperty postalCode;
	private final StringProperty city;
	private final ObjectProperty<LocalDate> birthday;
	public Person() {
		this(null,null);
	}
	public Person(String firstName, String lastName) {
		this.firstName = new SimpleStringProperty(firstName);
		this.lastName = new SimpleStringProperty(lastName);
//	디폴트 데이터 처리 구문
		this.street = new SimpleStringProperty("종로구 관철동");
		this.postalCode = new SimpleIntegerProperty(1004);
		this.city = new SimpleStringProperty ("서울시");
		this.birthday = new SimpleObjectProperty(LocalDate.of(2000, 1, 28));
		
	}
	public String getFirstName() {
		return firstName.get();
	}
	public void setFirstName(String firstName) {
		this.firstName.set(firstName);
	}
	public StringProperty firstNameProperty() {
		return firstName;
	}
	public String getLastName() {
		return lastName.get();
	}
	public void setLastName(String lastName) {
		this.lastName.set(lastName);
	}
	public StringProperty lastNameProperty() {
		return lastName;
	}
	
	public String getStreet() {
		return street.get();
	}
	public void setStreet(String street) {
		this.street.set(street);
	}
	public StringProperty streetProperty() {
		return street;
	}
	public String getCity() {
		return city.get();
	}
	public void setCity(String city) {
		this.city.set(city);
	}
	public StringProperty cityProperty() {
		return city;
	}
	public ObjectProperty<LocalDate> getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday.set(birthday);
	}
	public ObjectProperty<LocalDate> birthdayProperty() {
		return birthday;
	}
	public int getPostalCode() {
		return postalCode.get();
	}

	public void setPostalCode(int postalCode) {
		this.postalCode.set(postalCode);
	}

	public IntegerProperty postalCodeProperty() {
		return postalCode;
	}
	
}
