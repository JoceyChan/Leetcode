public class Main {
    public static void main(String[] args){
        defangIPaddr("1.1.1.1");
    }
    public static String defangIPaddr(String address) {

        for(int i = 0; i < address.length(); i++){
            // System.out.println(address.charAt(i));
            int index = address.indexOf('.');
            if(address.charAt(i) == index){
                System.out.println(index);
            }
            System.out.println(index);
        }
        return address;
    }
}