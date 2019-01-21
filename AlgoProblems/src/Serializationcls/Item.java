package Serializationcls;

import java.io.Serializable;

public class Item implements Serializable{

    /**
    *  This is the Serializable class
    */
    private static final long serialVersionUID = 475918891428093041L;
    public Long itemId;
    private String itemName;
    private transient Double itemCostPrice;
    public Item(Long itemId, String itemName, Double itemCostPrice) {
        super();
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemCostPrice = itemCostPrice;
      }

      public Long getItemId() {
          return itemId;
      }

     @Override
      public String toString() {
          return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemCostPrice=" + itemCostPrice + "]";
       }


       public void setItemId(Long itemId) {
           this.itemId = itemId;
       }

       public String getItemName() {
           return itemName;
       }
       public void setItemName(String itemName) {
            this.itemName = itemName;
        }

       public Double getItemCostPrice() {
            return itemCostPrice;
        }

        public void setItemCostPrice(Double itemCostPrice) {
             this.itemCostPrice = itemCostPrice;
        }
}