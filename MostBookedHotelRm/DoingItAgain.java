import java.util.HashMap; // import the HashMap class

public class DoingItAgain {
    public static void main(String[] args) {
        mostBookedHotelRoom(new String[]{"+1A", "+3E", "-1A", "+4F", "+1A", "-3E"});
    }
    public static void mostBookedHotelRoom(String[] array){
        int counting = 1;
        int max = 0;
        String mostBooked = "";

        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[i] == array[j] && array[i].contains("+")){
                    System.out.println(array[i]);
                    counting++;
                }
            }
            if(counting > max){
                max = counting;
                mostBooked = array[i];
            }
            counting = 1;
        }
        System.out.println(max);
        mostBooked = mostBooked.replace("+", "");
        System.out.println(mostBooked);// output  

    }
}