class UndergroundSystem {
    
    Map<Integer,Records> users;
    Map<String, Station> endStations;
    
    public UndergroundSystem() {
        users = new HashMap<>();
        endStations = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        users.put(id, new Records(id, stationName, t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        Records r = users.get(id);
        r.checkOut(stationName, t);
        
        Station station = endStations.get(stationName);
        if(station == null){
            station = new Station();
            endStations.put(stationName, station);
        }
        
        station.saveRecord(r);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        Station station = endStations.get(endStation);
        if(station == null)
            return 0;
        
        return station.getAverageTime(startStation);
    }
    
    public class Records{
        private int id;
        private int checkInTime;
        private int checkOutTime;
        private String startStation;
        private String endStation;
        
        public Records(int id, String stationName, int t){
            this.id = id;
            this.startStation = stationName;
            this.checkInTime = t;
            
            this.checkOutTime = -1;
            this.endStation = "";
        }
        
        public void checkOut(String stationName, int t){
            this.endStation = stationName;
            this.checkOutTime = t;
        }
        
        public String getStartStation(){
            return this.startStation;
        }
        
        public String getEndStation(){
            return this.endStation;
        }
        
        public int getTimeDiff(){
            return this.checkOutTime - this.checkInTime;
        }
    }
    
    public class Station{
        Map<String,Info> map;
        public Station(){
            map = new HashMap<>();
        }
        
        public void saveRecord(Records r){
            String startStation = r.getStartStation();
            Info info = map.get(startStation);
            if(info == null){
                info = new Info();
                map.put(startStation, info);
            }
            
            info.time += r.getTimeDiff();
            info.count++;
        }
        
        public double getAverageTime(String startStation){
            Info info = map.get(startStation);
            if(info == null)
                return 0;
            
            return info.getAverage();
        }
    }
    
    public class Info{
        private double time;
        private int count;
        
        public double getAverage(){
            if(this.count==0)
                return 0;
            
            return this.time/this.count;
        }
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */