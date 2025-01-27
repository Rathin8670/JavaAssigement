package Ass1;
class Distance{
    int km,m,cm;
    Distance(int km,int m,int cm){
        this.km = km;
        this.m = m;
        this.cm = cm;
    }
    Distance(Distance d){
        km = d.km;
        m = d.m;
        cm = d.cm;
    }
    void addDistance(Distance d){
        this.km += d.km;
        this.m += d.m;
        this.cm += d.cm;
    }
    Distance addDistance(Distance d1,Distance d2){
        Distance d = new Distance(0,0,0);
        d.km = d1.km + d2.km;
        d.m = d1.m + d2.m;
        d.cm = d1.cm + d2.cm;
        return d;
    }
    // void addDistance(Distance d1,Distance d2){
    //     this.km = d1.km + d2.km ;
    //     this.m = d1.m + d2.m ;
    //     this.cm = d1.cm + d2.cm ;
    // }
    public void display(){
        System.out.println("Distance is: "+km+"km "+m+"m "+cm+"cm");
    }
}
class Qus4{
    public static void main(String[] args) {
        Distance d1 = new Distance(1,2,3);
        d1.display();
        Distance d2=new Distance(2,3,5);
        d2.display();

        Distance d3 = new Distance(d1); // Copy Constructor
        d3.display();

        System.out.println("After Adding---");
        d1.addDistance(d2);
        d1.display();

        Distance d5 = d1.addDistance(d2,d3);
        d5.display();

        d1.display();

       // d1.addDistance(new Distance(1,2,3),new Distance(1,2,3));
       // d1.display();
        
    }
}