public class Horse {
    private String name;
    private double distance;
    private double speed;

    public Horse(String name,double speed,double distance){
        this.name = name;
        this.distance = distance;
        this.speed = speed;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setDistance(double distance){
        this.distance = distance;
    }
    public void setSpeed(double speed){
        this.speed = speed;
    }

    public String getName(){
        return this.name;
    }
    public double getDistance(){
        return this.distance;
    }
    public double getSpeed(){
        return this.speed;
    }

    public void move(){
        distance+= (speed* Math.random());
    }
    public void print(){
        StringBuilder result = new StringBuilder();
        for(int i =0;i<(int)distance;i++){
            result.append(".");
        }
        result.append(this.name);
        System.out.println(result);
    }
}
