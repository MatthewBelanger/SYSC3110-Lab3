import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public AddressBook(){
        this(new ArrayList<BuddyInfo>());
    }

    public AddressBook(ArrayList<BuddyInfo> addressBook) {
        this.buddies = addressBook;
    }

    public void addBuddy(BuddyInfo buddy){
        this.buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        this.buddies.remove(buddy);
    }

    public static void main(String[] args) {
        BuddyInfo buddy1 = new BuddyInfo("Tom", "Carleton", 613);
        AddressBook addressBook1 = new AddressBook();
        addressBook1.addBuddy(buddy1);
        addressBook1.removeBuddy(buddy1);
        //change
    }
}
