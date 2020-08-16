public class Main {
    public static void main(String[] args){
        defangIPaddr("1.1.1.1");
    }

    public static String defangIPaddr(String address) {
        address = address.replace(".", "[.]");
        return address;
    }
}