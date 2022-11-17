import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int gun,ay;
        String burc = "";
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaçıncı ayda doğdunuz?: ");
        ay = inp.nextInt();
        System.out.print("Ayın Kaçında doğdunuz?: ");
        gun = inp.nextInt();
        if(ay==1){
            if(gun>21 && gun <32){
            burc = "Kova";}
            else{
                burc = "oğlak";}
        }
        if(ay==2){
            if(gun>19 && gun <29){
                burc = "Balık";}
            else{
                burc = "Kova";}
        }
        if(ay==3){
            if(gun>20 && gun <32){
                burc = "Koç";}
            else{
                burc = "Balık";}
        }
        if(ay==4){
            if(gun>20 && gun <31){
                burc = "Boğa";}
            else{
                burc = "Koç";}
        }
        if(ay==5){
            if(gun>21 && gun <32){
                burc = "İkizler";}
            else{
                burc = "Boğa";}
        }
        if(ay==6){
            if(gun>22 && gun <31){
                burc = "Yengeç";}
            else{
                burc = "İkizler";}
        }
        if(ay==7){
            if(gun>22 && gun <32){
                burc = "Aslan";}
            else{
                burc = "Yengeç";}
        }
        if(ay==8){
            if(gun>22 && gun <32){
                burc = "Başak";}
            else{
                burc = "Aslan";}
        }
        if(ay==9){
            if(gun>22 && gun <31){
                burc = "Terazi";}
            else{
                burc = "Başak";}
        }
        if(ay==10){
            if(gun>22 && gun <32){
                burc = "Akrep";}
            else{
                burc = "Terazi";}
        }
        if(ay==11){
            if(gun>21 && gun <31){
                burc = "Yay";}
            else{
                burc = "Akrep";}
        }
        if(ay==12){
            if(gun>21 && gun <32){
                burc = "Oğlak";}
            else{
                burc = "Yay";}
        }
        System.out.print("Burcunuz: " + burc);



    }
}