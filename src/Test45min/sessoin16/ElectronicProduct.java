package Test45min.sessoin15;

public class ElectronicProduct extends Product{
    private int warrantyMonths;

    public ElectronicProduct(String id,String name, double price, int warrantyMonths){
        super(id,name,price);
        this.warrantyMonths = warrantyMonths;
    }
    public double calculateFinalPrice(){
        if(warrantyMonths > 12){
            return price + 1000000;
        }else{
            return price;
        }
    }
    public void displayInfor(){
        super.displayInfo();
        System.out.println("bảo hành"+ warrantyMonths +"tháng");
    }
}
