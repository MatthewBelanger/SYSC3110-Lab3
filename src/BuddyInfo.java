public class BuddyInfo {
    private String name;
    private String address;
    private int phoneNumber;

    public BuddyInfo(){
        this("no name", "0", 0);
    }

    public BuddyInfo(String name, String address, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Homer", "0", 0);
        System.out.println("Hello " + buddy.getName());
        //Branch change
    }
}
