package ra.dev;

import java.util.Scanner;

public class Product {
    private String ProductID;
    private String productName;
    private String title;
    private float ImportPrice;
    private  float ExportPrice;
    private int Quantity;
    private String Descriptions;
    private boolean ProductStatus;
    private Object Catalog;

    public Product() {
    }

    public Product(String productID, String productName, String title, float importPrice, float exportPrice, int quantity, String descriptions, boolean productStatus, Object catalog) {
        ProductID = productID;
        this.productName = productName;
        this.title = title;
        ImportPrice = importPrice;
        ExportPrice = exportPrice;
        Quantity = quantity;
        Descriptions = descriptions;
        ProductStatus = productStatus;
        Catalog = catalog;
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String productID) {
        ProductID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getImportPrice() {
        return ImportPrice;
    }

    public void setImportPrice(float importPrice) {
        ImportPrice = importPrice;
    }

    public float getExportPrice() {
        return ExportPrice;
    }

    public void setExportPrice(float exportPrice) {
        ExportPrice = exportPrice;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public String getDescriptions() {
        return Descriptions;
    }

    public void setDescriptions(String descriptions) {
        Descriptions = descriptions;
    }

    public boolean isProductStatus() {
        return ProductStatus;
    }

    public void setProductStatus(boolean productStatus) {
        ProductStatus = productStatus;
    }

    public Object getCatalog() {
        return Catalog;
    }

    public void setCatalog(Object catalog) {
        Catalog = catalog;
    }
    public void inputData1(Scanner scanner,Catalog[] catalog,int index1){
        System.out.println("nhap vao ma san pham");
        this.ProductID = scanner.nextLine();
        System.out.println("nhap ten san pham");
        this.productName = scanner.nextLine();
        System.out.println("nhap vao tieu de san pham");
        this.title = scanner.nextLine();
        System.out.println("nhap vao gia nhap san pham");
        this.ImportPrice = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap vao so luong con lai cua san pham");
        this.Quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("mo ta san pham");
        this.Descriptions = scanner.nextLine();
        System.out.println("nhap vao trang thai san pham");
        this.ProductStatus = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("danh muc CATLOG");
        for (int i = 0; i < index1; i++) {
            System.out.printf("%d.%s\n",i+1,catalog[i].getCatalogName());
        }
        System.out.println("lua chon cua ban");
        int indexChoice = Integer.parseInt(scanner.nextLine());
        this.Catalog = catalog[indexChoice-1].getCatalogName();
    }
    public  void displayData1(){
        System.out.printf("%-15s%-20s%-20s%-20f%-20f%-20d%-20s%-20s%-15s\n",
                this.ProductID,this.productName,this.title,this.ImportPrice,this.ExportPrice,this.Quantity,this.Descriptions,this.ProductStatus,this.Catalog);

    }
    public void calExportPrice(){
        this.ExportPrice =this.ImportPrice*1.2f;
    }
}