/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.dandiahmadin.quiz;
import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi Program Kasir Rock n Roll Haircut dengan pendekatan berbasis objek
 */
public class QUIZIF110119033DANDIAHMADIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Customer dandi = new Customer();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("===Program Kasir Rock n Roll Haircut");
        System.out.print("Customer Name : ");
        dandi.setName(input.nextLine());
        System.out.print("Customer Email : ");
        dandi.setEmail(input.nextLine());
        
        dandi.displayService();
        dandi.getPrice(input.nextInt());
        
        System.out.print("Are you Member (yes/no) : ");
        dandi.setMember(dandi.checkMemberStatus(input.next()));
        
        System.out.println("#**************************#");
        System.out.println("#*****CUSTOMER INVOICE*****#");
        System.out.println("Date Transaction : ".concat(dandi.currentTime()));
        System.out.println("Service Price : " + dandi.getPriceService());
        dandi.getSale(dandi.isMember(), dandi.getPriceService());
        System.out.println("Discount : " + dandi.getSale(dandi.isMember(), dandi.getPriceService()));
        System.out.println("Service Price : " + dandi.getTotalPay(dandi.getPriceService(), dandi.getSale(dandi.isMember(), dandi.getPriceService())));
    }
    
}
