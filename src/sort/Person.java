package sort;

public class Person {
    
    private Integer no;
    private Double distance;
    private Double fee;
    
    public Person (Integer _no, Double _distance, Double _fee){
        this.no = _no;
        this.distance = _distance;
        this.fee = _fee;
    }
    
    public Integer getNo(){
        return this.no;
    }
    
    public Double getDistance(){
        return this.distance;
    }
    
    public Double getFee(){
        return this.fee;
    }
    
    public void setNo(Integer _no){
         this.no = _no;
    }
    
    public void setDistance(Double _distance){
         this.distance = _distance;
    }
    
    public void setFee(Double _fee){
         this.fee = _fee;
    }
    
    @Override
    public String toString(){
        return "Person [no= " + this.no + ", distance= " + this.distance + ", fee= " + this.fee + " ] ";
    }
    
}