
    public class Cub{
        int storona;
        String color;
        public Cub(){}
        public Cub(int h, String c){this.storona=h;this.color=c;}
        public double calcVol(){return Math.pow(this.storona,3);}
        public String toString(){return"MyCub"+" "+"Storona="+this.storona+" "+"color"+this.color;}
    }
  

