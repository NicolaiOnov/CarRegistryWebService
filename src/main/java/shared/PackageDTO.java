package shared;

import org.sdj3.model.PartList;

import java.io.Serializable;

public class PackageDTO implements Serializable
{
   private static final long serialVersionUID = 1L;
   private int packageNo;
   private String carModel;
   private PartType partType;
   private PartList parts;
   
   public PackageDTO(String carModel, PartType partType)
   {
      this.carModel = carModel;
      this.partType = partType;
      parts = new PartList();
   }
   
   public PackageDTO(int packageNo, String carModel, PartType partType)
   {
      this.packageNo = packageNo;
      this.carModel = carModel;
      this.partType = partType;
      parts = new PartList();
   }

   public PackageDTO(int packageNo, PartType partType)
   {
      this.packageNo = packageNo;
      this.partType = partType;
   }
   
   public PackageDTO(int packageNo, String model)
   {
      this.packageNo = packageNo;
      this.carModel = model;
   }

   public int getPackageNo()
   {
      return packageNo;
   }

   public String getCarModel()
   {
      return carModel;
   }

   public PartType getPartType()
   {
      return partType;
   }

   public PartList getParts()
   {
      return parts;
   }
   
   public String toString()
   {
      return "Package: " + packageNo + " carModel: " + carModel + " PT " + partType;
   }
}
