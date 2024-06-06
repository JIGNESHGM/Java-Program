public class Person {
    String name;
    String address;
    String telephoneNumber;
    String mobileNumber;
    String headOfFamily;
    String uniqueID;

    public Person(String name, String address, String telephoneNumber, String mobileNumber, String headOfFamily, String uniqueID) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.mobileNumber = mobileNumber;
        this.headOfFamily = headOfFamily;
        this.uniqueID = uniqueID;
    }

    @Override
    public String toString() {
        return "Unique ID: " + uniqueID + "\nName: " + name + "\nAddress: " + address + "\nTelephone: " + telephoneNumber + "\nMobile: " + mobileNumber + "\nHead of Family: " + headOfFamily + "\n";
    }
}
