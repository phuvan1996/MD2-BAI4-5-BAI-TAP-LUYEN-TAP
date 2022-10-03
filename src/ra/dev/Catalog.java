package ra.dev;

import java.util.Scanner;

public class Catalog {
    private int catalogID;
    private String catalogName;
    private int priority;
    private boolean catalogStatus;

    public Catalog() {
    }

    public Catalog(int catalogID, String catalogName, int priority, boolean catalogStatus) {
        this.catalogID = catalogID;
        this.catalogName = catalogName;
        this.priority = priority;
        this.catalogStatus = catalogStatus;
    }

    public int getCatalogID() {
        return catalogID;
    }

    public void setCatalogID(int catalog) {
        this.catalogID = catalogID;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }

    public void inputData2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao ma danh muc san pham");
        this.catalogID = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap vao ten danh muc san pham");
        this.catalogName=scanner.nextLine();
        System.out.println("do uu tien");
        this.priority= Integer.parseInt(scanner.nextLine());
        System.out.println("trang thai danh muc san pham");
        this.catalogStatus = Boolean.parseBoolean(scanner.nextLine());
    }
    public  void displayData2(){
        System.out.printf("ma danh muc:  %s\n",this.catalogID);
        System.out.printf("ten danh muc: %s\n",this.catalogName);
        System.out.printf("do uu tien danh muc: %d\n",this.priority);
        System.out.printf("trang thai danh muc: %s\n",this.catalogStatus);
    }
}
