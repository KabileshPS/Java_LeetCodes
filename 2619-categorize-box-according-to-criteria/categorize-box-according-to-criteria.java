class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long volume=(long)length*width*height;
        boolean Bulky=false;
        boolean Heavy=false;
        if(length>=10000||width>=10000||height>=10000||mass>=10000||volume>=1000000000){
            Bulky=true;
        }
        if(mass>=100){
            Heavy=true;
        }
        if(Bulky&&Heavy){
            return "Both";
        }
        else if(Bulky){
            return "Bulky";
        }
        else if(Heavy){
            return "Heavy";
        }
        else{
            return "Neither";
        }
    }
}