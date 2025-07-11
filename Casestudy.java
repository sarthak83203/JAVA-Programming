import java.util.*;
public class Casestudy {
    public static void Nutrition(float x,int y){
        float quantity,supplement;
        if(y<3){
            quantity=(x * 0.04f)+ (y * 0.5f);
            supplement=(x * 0.02f)+ (y * 0.3f);
            
        }else {
            quantity=(x * 0.03f)+ (y * 0.4f);
            supplement=(x * 0.015f)+ (y * 0.25f);
        }
        System.out.printf("Quantity is: %.2f\n",quantity);
        System.out.printf("Supplement is: %.2f",supplement);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float weight=sc.nextFloat();
        int age=sc.nextInt();
        Nutrition(weight,age);
    }
    
}
