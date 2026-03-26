classDiagram
    class Warehouse {
        -String warehouseId
        -String location
        -Storekeeper manager
        +getInventoryReport()
    }

    class Storekeeper {
        -String staffId
        -String name
        +createInwardDoc()
        +createOutwardDoc()
        +performInventoryCheck()
        +viewStockReport()
    }

    class Product {
        -String productId
        -String productName
        -int currentStock
    }

    class Document {
        <<abstract>>
        -String docId
        -Date date
        -String personInCharge
        +print()
    }

    class InwardDoc {
        -List items
        +calculateTotal()
    }

    class OutwardDoc {
        -List items
        +calculateTotal()
    }

    class InventoryRecord {
        -Date checkDate
        -int physicalCount
        -int expectedCount
        +updateStock()
    }

    Warehouse "1" -- "1" Storekeeper : managed by
    Warehouse "1" -- "*" Product : contains
    Storekeeper "1" -- "*" InwardDoc : creates
    Storekeeper "1" -- "*" OutwardDoc : creates
    Storekeeper "1" -- "*" InventoryRecord : performs
    InwardDoc -- Product : includes
    OutwardDoc -- Product : includes
