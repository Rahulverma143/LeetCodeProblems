// class Solution {
//     public int[] corpFlightBookings(int[][] bookings, int n) {
//          int[] answer = new int[n];
//           for (int i = 0; i < bookings.length; i++) {
//            int first = bookings[i][0];
//            int last = bookings[i][1]; 
//            int seats = bookings[i][2];
//           for (int f = first; f <= last; f++) {
//               answer[f - 1] += seats;
//     }
//  }
//        return answer;
//     }
// }


// Tumhe n flights diye gaye hain.
// Har booking me bataya gaya hai ki flight first se last tak har flight me seats seats book hui hain.
// Tumhe har flight ke liye total booked seats nikalni hain.

class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {

        int[] answer = new int[n];

       
        for (int i = 0; i < bookings.length; i++) {
            int first = bookings[i][0];
            int last = bookings[i][1];
            int seats = bookings[i][2];

            answer[first - 1] += seats;      
            if (last < n) {
                answer[last] -= seats;      
            }
        }
        for (int i = 1; i < n; i++) {
            answer[i] += answer[i - 1];
        }

        return answer;
    }
}
