package com.sprint1.supplierdao;
import java.util.*;
import com.sprint1.suppliermodel.SupplierDetails;
public class SupplierDaoImpl implements SupplierDao {//6
 public String displayOrder(String OrderId) {
          Map<String,SupplierDetails> raws =new HashMap<String, SupplierDetails>();//7
          SupplierDetails order=new SupplierDetails ("1","puma","4-9-7/b",86399552);//8
          SupplierDetails order1=new SupplierDetails ("2","Leo","9-97-675/g",84999902);//9
          SupplierDetails  order11=new SupplierDetails("3","Gucci","56-801/7g",434678);//10
          SupplierDetails  order12=new SupplierDetails ("4","Nike","66/734lk",414789);//11
          SupplierDetails  order13=new SupplierDetails ("5","philliphines","12p/7/89s",404908);//12

          	raws.put(order.getSupplierId(), order);//12
          	raws.put(order1.getSupplierId(), order1);//13
          	raws.put(order11.getSupplierId(), order11);//14
          	raws.put(order12.getSupplierId(), order12);//15
          	raws.put(order13.getSupplierId(), order13);//16
          	//return null;
          	for(String ord:raws.keySet())//17
          	{
          		//System.out.println(raws.toString());
          		if(raws.get(ord).getSupplierId().equalsIgnoreCase(OrderId)){
          			System.out.println(raws.get(ord));//18
          		}


          	}
          	return null;//19

 		}}


