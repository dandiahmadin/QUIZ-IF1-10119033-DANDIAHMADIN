/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.dandiahmadin.quiz;

/**
 *
 * @author Dandi Ahmadin
 */
public class ServicePrice implements ServiceItem{
    private float priceService, discount;

    public float getPriceService() {
        return priceService;
    }

    public void setPriceService(float priceService) {
        this.priceService = priceService;
    }
    
    @Override
    public void displayService() {
        System.out.println("#*************************#");
        System.out.println("#***Rock n Roll Haircut***#");
        System.out.println("#*******Service List******#");
        System.out.println("1. Haircut : IDR 45K");
        System.out.println("2. Haircut + Hairwash: IDR 55K");
        System.out.println("3. Hairwash Only : IDR 15K");
        System.out.println("#*************************#");
        System.out.print("Choose (1/2/3): ");
    }

    @Override
    public float getPrice(int serviceItem) {
        switch(serviceItem) {
            case 1: priceService = 45000;
                    break;
            case 2: priceService = 55000;
                    break;
            case 3: priceService = 15000;
                    break;
            default: priceService = 0;
        }
        return priceService;
    }

    @Override
    public boolean checkMemberStatus(String statusMember) {
        boolean stat = false;
        if(statusMember.toUpperCase().equals("YES")) {
            stat = true;
        }
        return stat;
    }

    @Override
    public float getSale(boolean isMember, float parServicePrice) {
        discount = 0;
        if (isMember) {
            discount = (10 * parServicePrice) / 100;
        };
        
        return discount;
    }
    
    public float getTotalPay(float priceService, float discount) {
        return priceService - discount;
    }
}
