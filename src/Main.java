import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String ay;
        int gun;
        System.out.print("Doğduğunuz Ay:");
        ay=input.nextLine();
        System.out.print("Doğduğunuz Gün:");
        gun=input.nextInt();


        switch (ay){
            case "Mart":
                if(gun>=21){
                    System.out.println("Burcunuz Koç");
                }
                else {
                    System.out.println("Burcunuz Balık");
                }
                break;
            case "Nisan":
                if(gun>=21){
                    System.out.println("Burcunuz Boğa");
                }
                else {
                    System.out.println("Burcunuz Koç");
                }
                break;
            case "Mayıs":
                if(gun>=22){
                    System.out.println("Burcunuz İkizler");
                }
                else {
                    System.out.println("Burcunuz Boğa");
                }
                break;
            case "Haziran":
                if(gun>=23){
                    System.out.println("Burcunuz Yengeç");
                }
                else {
                    System.out.println("Burcunuz İkizler");
                }
                break;
            case "Temmuz":
                if(gun>=23){
                    System.out.println("Burcunuz Aslan");
                }
                else {
                    System.out.println("Burcunuz Yengeç");
                }
                break;
            case "Ağustos":
                if(gun>=23){
                    System.out.println("Burcunuz Başak");
                }
                else {
                    System.out.println("Burcunuz Aslan");
                }
                break;
            case "Eylül":
                if(gun>=23){
                    System.out.println("Burcunuz Terazi");
                }
                else {
                    System.out.println("Burcunuz Başak");
                }
                break;
            case "Ekim":
                if(gun>=23){
                    System.out.println("Burcunuz Akrep");
                }
                else {
                    System.out.println("Burcunuz Terazi");
                }
                break;
            case "Kasım":
                if(gun>=22){
                    System.out.println("Burcunuz Yay");
                }
                else {
                    System.out.println("Burcunuz Akrep");
                }
                break;
            case "Aralık":
                if(gun>=22){
                    System.out.println("Burcunuz Oğlak");
                }
                else {
                    System.out.println("Burcunuz Yay");
                }
                break;
            case "Ocak":
                if(gun>=22){
                    System.out.println("Burcunuz Kova");
                }
                else {
                    System.out.println("Burcunuz Oğlak");
                }
                break;
            case "Şubat":
                if(gun>=20){
                    System.out.println("Burcunuz Balık");
                }
                else {
                    System.out.println("Burcunuz Kova");
                }
                break;
            default:
                System.out.println("Hatalı ay girdiniz");
                break;
        }
    }
}