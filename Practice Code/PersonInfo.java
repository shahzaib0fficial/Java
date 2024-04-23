import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PersonInfo {
    int searchPerson(String name, ArrayList<Person> person) {
        int index = -1;
        for (int i=0;i<person.size();i++) {
            Person p = person.get(i);
            if (name.equals(p.getName())) {
                index = i;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to Person Info!","Welcome",1);

        PersonInfo personInfo = new PersonInfo();
        ArrayList<Person> person = new ArrayList<>();

        while (true) {
            String choice = JOptionPane.showInputDialog("Enter Your Choice\n1. Add\n2. Delete\n3. Search\n4. Exit");

            if (choice.equals("1")) {
                String name = JOptionPane.showInputDialog("Enter Name");
                String address = JOptionPane.showInputDialog("Enter Address");
                String phoneNo = JOptionPane.showInputDialog("Enter Phone Number");

                person.add(new Person(name, address, phoneNo));
            } 

            else if(choice.equals("2")){
                String name = JOptionPane.showInputDialog("Enter Name of Person to Delete");
                int index = personInfo.searchPerson(name, person);
                if (index != -1) {
                    person.remove(index);
                    JOptionPane.showMessageDialog(null, "Person Deleted","Sucessfull",1);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Not Found","Invalid",0);
                }
            } 

            else if (choice.equals("3")) {
                String name = JOptionPane.showInputDialog("Enter Name of Person to Search");
                int index = personInfo.searchPerson(name, person);
                if (index != -1) {
                    String message = "Name: " + person.get(index).getName() + "\nAddress: " + person.get(index).getAddress() + "\nPhone no: " + person.get(index).getPhoneNo();
                    JOptionPane.showMessageDialog(null, message);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Not Found","Invalid",0);
                }
            }
            else if (choice.equals("4")) {
                JOptionPane.showMessageDialog(null, "Good Bye","Termination",1);
                System.exit(0);
            }
            else {
                JOptionPane.showMessageDialog(null, "Invalid Choice","Invalid",0);   
            }
        }
    }
}

class Person {
    String name;
    String address;
    String phoneNo;

    public Person(String name, String address, String phoneNo) {
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
}