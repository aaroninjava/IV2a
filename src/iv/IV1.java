package iv;
//import org.apache.commons.math3.distribution.NormalDistribution;
import iv.bsa2;
public class IV1 {
    static double i=0;
    static double x=3;
    static double y=0;
    
    public static void main(String[] args) {     
        String CP="C";        
        double Pr=1.732;
        double S=100;
        double K=110;
        double T=0.1;
        double r=0.01;
        double y=0;  
        double sigma=0.3;     
        
        //bsa2 b = new bsa2(CP,Pr,S,K,T,sigma,r,y);       
        bsa2 b = new bsa2(S,K,T,sigma,r,y);       
        //System.out.println("d1="+b.d2);
        //System.out.println("ad1="+b.ad2());
        //System.out.println("call="+b.call());
        //System.out.println("call="+b.iv1a());
        b.iv1a(CP,Pr,S,K,T,r,y);
    }
    
/*    
//public  static void iv1(double P) {          
    public static void iv1a(String CP,double P,double S,double K,double T,double r,double y) {          
          //double P=1.414;  
          //double P=1.732;  
          double value=0;  
          double err=0;  
          double tol=0.0001;
          double sd1=0.0001;
          double sd2=3;  
          double std=0;   
          double i=1;   
          std = (sd1 + sd2) / 2;
          
          //value=P*P;
          value=yx(std);
          //value=b2.(std);
          err = Math.abs(value - P);
          
         //while (err >= tol)
          while (err >= tol)//(i<100)
        {          
            if (value >= P) {sd2 = std;}
            if (value < P)  {sd1 = std;}
            
             std = (sd1 + sd2) / 2;
             value=yx(std);          
             err = Math.abs(value - P);
             i=i+1;
             System.out.println("二分逼近計算次數="+i); 
             System.out.println("二分逼近計算帶入std="+std+",  估計"+value);              
         }                                 
          
          System.out.println("y=x*x二分法是"+std);           
          System.out.println("y=x*x結果是"+value); 
          System.out.println("IV1a"); 
          //System.out.println("結果誤差="+err);        
    }   
        
    public  static double yx(double x) {          
          double yx1;
          yx1=x*x;
          //System.out.println("y=x*x結果是"+yx1);
          
          return yx1;
    }   

*/    
    /*              
    public double cdf(double x)
    {                     
        double cdf1;                
        cdf1=n1.cumulativeProbability(x);
        return cdf1;        
    }
    
    public double pdf(double x)
    {                     
        double pdf1;                
        pdf1=n1.density(x);
        return pdf1;        
    }
*/    
    
    
}
