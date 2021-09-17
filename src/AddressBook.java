import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> addressBook;

    public AddressBook(){
        this(new ArrayList<BuddyInfo>());
    }

    public AddressBook(ArrayList<BuddyInfo> addressBook) {
        this.addressBook = addressBook;
    }

    public void addBuddy(BuddyInfo buddy){
        this.addressBook.add(buddy);
    }

    public void removeBuddy(int index){
        this.addressBook.remove(index);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}
