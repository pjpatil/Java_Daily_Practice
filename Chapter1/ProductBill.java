package Chapter1;
import java.util.*;
class Product
{
	private int proId;
	private String name;
	private int qty,rate;
	private int total;
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
}
class Shop
{
	private Product prod[];
	void calBill(Product...prod)
	{
		this .prod=prod;
	}
	void showBill()
	{
		int fbill=0;
		System.out.println("Prod_Name\tProd-id\tQty\tRate\tTotal");
		for(int i=0;i<prod.length;i++)
		{

			System.out.println(prod[i].getName()+"\t\t"+prod[i].getProId()+"\t"+prod[i].getQty()+"\t"+prod[i].getRate()+"\t"+prod[i].getTotal());
			fbill=fbill+prod[i].getTotal();
		}
		System.out.println("Grand Total is:"+fbill);
	}
}

public class ProductBill {

	public static void main(String[] args) {
		String custName;
		Product p=new Product();
		Shop s=new Shop();
		//System.out.printf("Enter Custemer Nmae:");
		
		p.setProId(1);
		p.setName("A");
		p.setQty(10);
		p.setRate(5);
		p.setTotal(10*5);
		
		
		Product p1=new Product();
		p1.setProId(2);
		p1.setName("B");
		p1.setQty(50);
		p1.setRate(2);
		p1.setTotal(50*2);
	
		
		s.calBill(p,p1);
		s.showBill();
	}

}
