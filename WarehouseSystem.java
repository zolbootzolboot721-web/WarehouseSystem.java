import java.util.Date;
import java.util.List;

// 1. БАРААНЫ КЛАСС (Product)
class Product {
    private String productId;
    private String productName;
    private int currentStock; // Одоогийн үлдэгдэл

    // Барааны үлдэгдэл шинэчлэх (Тооллого эсвэл орлого зарлагын дараа)
    public void updateStock(int amount) {}
}

// 2. ПАДААНЫ СУУРЬ КЛАСС (Энэ нь Орлого болон Зарлагын ерөнхий шинжийг агуулна)
abstract class InventoryDoc {
    protected String docId;
    protected Date date;
    protected String personInCharge; // Хариуцсан эсвэл хүлээлгэн өгсөн хүн
    
    public abstract void printDoc(); // Падаан хэвлэх функц
}

// 3. ОРЛОГЫН ПАДААН (InwardDoc)
class InwardDoc extends InventoryDoc {
    private List<Product> items;
    private List<Integer> quantities;

    @Override
    public void printDoc() {
        // Орлогын падаан хэвлэх логик энд орно
    }
}

// 4. ЗАРЛАГЫН ПАДААН (OutwardDoc)
class OutwardDoc extends InventoryDoc {
    private List<Product> items;
    private List<Integer> quantities;

    @Override
    public void printDoc() {
        // Зарлагын падаан хэвлэх логик энд орно
    }
}

// 5. ТООЛЛОГЫН КЛАСС (InventoryCheck)
class InventoryCheck {
    private Date checkDate;
    private Product product;
    private int physicalCount; // Бодит тоо хэмжээ
    private int systemCount;   // Байвал зохих үлдэгдэл

    public void recordDiscrepancy() {
        // Илүүдэл, дутагдал бүртгэх логик
    }
}

// 6. НЯРАВЫН КЛАСС (Storekeeper)
class Storekeeper {
    private String staffId;
    private String name;
    private String warehouseId;

    public void createInwardDoc() {}
    public void createOutwardDoc() {}
    public void performInventory(Product p, int actualAmount) {}
    
    // Тайлан харах функцүүд
    public void viewStockReport() {} // Нөөцийн тайлан
    public void viewPeriodReport(Date start, Date end) {} // Няравын ху
