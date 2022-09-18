import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddyInfos;

    public AddressBook() {
        this.buddyInfos = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        buddyInfos.add(buddy);
    }

    public BuddyInfo removeBuddy(BuddyInfo buddy) {
        buddyInfos.remove(buddy);
        return buddy;
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}
