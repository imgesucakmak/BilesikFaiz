package bilesikfaiz;

public class Bilesikfaiz {
    public static void main(String[] args) {
        double yatirilan_para = 1000; 
        double faiz_orani = 0.05; 
        int yil = 10;      

        System.out.println("Yıl \t Tutar ($)");
        
        
        for (int i = 1; i <= yil; i++) {
            double depozito = yatirilan_para * Math.pow(1 + faiz_orani, i);  
            System.out.printf("%d \t %.2f%n", i, depozito);
        }
    }
}
