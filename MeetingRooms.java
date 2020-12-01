public class MeetingRooms {
   
     public int minMeetingRooms(Interval[] intervals) {
       int ans = 0, curr = 0;
       List<TimePoint> timeline = new ArrayList<>();
       for (Interval interval: intervals) {
         timeline.add(new TimePoint(interval.start, 1));
         timeline.add(new TimePoint(interval.end, -1));
       }
       timeline.sort(new Comparator<TimePoint>() {
             public int compare(TimePoint a, TimePoint b) {
               if (a.time != b.time) return a.time - b.time;
               else return a.room - b.room;
             }
           });
       for (TimePoint t: timeline) {
         curr += t.room;
         if (curr >= ans) ans = curr;
       }
       return ans;
     }  
   
     private class TimePoint {
       int time;
       int room;
   
       TimePoint(int time, int room) {
         this.time = time;
         this.room = room;
       }
     }
   }  
}
