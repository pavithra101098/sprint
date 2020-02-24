package com.sprint1.supplierui;
import java.util.Scanner;
//import com.sprint1.service.RawMaterialServiceImpl;
import com.sprint1.supplierservice.SupplierImpl;
//import com.sprint1.service.RawMaterialServiceImpl
public class Main {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
SupplierImpl rawMaterialdetailsImplObj = new SupplierImpl();
	//SupplierImpl rawMaterialdetailsImpobj = new SupplierImpl();
//Scanner in=new Scanner(System.in);
System.out.println("Enter  Id");//1
String id=in.nextLine();
rawMaterialdetailsImplObj.displayOrder(id);//20
}
}