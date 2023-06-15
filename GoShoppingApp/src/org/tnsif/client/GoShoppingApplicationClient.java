package org.tnsif.client;
import org.tnsif.application.GSNormalAcc;
import org.tnsif.application.GSPrimeAcc;
import org.tnsif.application.GSShopFactory;
import org.tnsif.framework.NormalAcc;
import org.tnsif.framework.PrimeAcc;
import org.tnsif.framework.ShopFactory;
public class GoShoppingApplicationClient {

	public static void main(String[] args) {
		ShopFactory s=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(7547,"Manish Tanganiya ",570,true);
		NormalAcc n=new GSNormalAcc(6245,"Amit ",570,60);
		System.out.println("prime Account");
		p.bookProduct(p.getCharges());
		System.out.println("Normal Account");
		n.bookProduct(n.getCharges());
		System.out.println(p);
		System.out.println(n);

	}

}
