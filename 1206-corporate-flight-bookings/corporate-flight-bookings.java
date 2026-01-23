class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {

         int[] answer = new int[n];
          for (int i = 0; i < bookings.length; i++) {
           int first = bookings[i][0];
           int last = bookings[i][1]; 
           int seats = bookings[i][2];
          for (int f = first; f <= last; f++) {
              answer[f - 1] += seats;

    }
}
       return answer;
    }
}