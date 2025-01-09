import java.util.ArrayList;

public class customer {
    private String name;
    private String phoneNumber;
    private ArrayList<Call> calls;
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        calls = new ArrayList<>();
    }
    public void addCall(int date, String notes) {
        Call newCall = new Call(date, notes);
        calls.add(newCall);
    }
    public Call getLastCall() {
        if(calls.isEmpty()) {
            return null;
        }
        return calls.getLast();
    }

}
