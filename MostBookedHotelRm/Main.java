public class Main {
    public static void main(String[] args){
        mostBookedHotelRoom(new String[]{"+1A", "+3E", "-1A", "+4F", "+1A", "-3E"});
        // mostBookedHotelRoom(new String[]{"+2A", "+3E", "-2A", "-3E", "+2A", "+3E"});
        // mostBookedHotelRoom(new String[]{"+1C", "+3E", "-1C", "+4F", "+1C", "-1C","+1C"});

    }
    public static void mostBookedHotelRoom(String[] input) {
        int count = 1;
        int max = 0;
        String mostBooked = "";
        
        for(int i = 0; i < input.length; i++){
            for(int j = i+1; j < input.length; j++){
                if(input[i] == input[j] && input[i].contains("+")){
                    count++;
                }
            }
            if(count > max) {
                max = count;
                mostBooked = input[i];
            }
            count = 1;
        }
        System.out.println(max);// output
        mostBooked = mostBooked.replace("+", "");
        System.out.println(mostBooked);// output
    }
}
//String.contains(); is to check is there is a specific character in the string