public class c19SwitchStatement {
    public static void main(String[] args){
        String role = "Moderator";
        switch (role.toLowerCase()) { // cases will be checked with this value
            case "admin": // Check if this condition is true then this block is executed
                System.out.println("You have Admin Access");
                break; // used to break switch statement so no other case will be execute
            case "moderator": // Check if this condition is true then this block is executed
                System.out.println("You have Moderator Access");
                break;
            case "user": // Check if this condition is true then this block is executed
                System.out.println("You have User Access");
                break;        
            default: // Check if no condition is true then this block is executed
                System.out.println("Sign in to check your Access");
                break;
        }
    }
}
