package ra.dev;

import java.util.Objects;
import java.util.Scanner;

public class Productmanager {
    static Product[] listProduct = new Product[200];
    static int index2 = 0;
    static Catalog[] listCatalog = new Catalog[50];
    static int index1 = 0;

    public static void main(String[] args) {
        do {
            System.out.println("*******QUAN LY CUA HANG*******\n");
            System.out.println("1.Quản lý danh mục sản phẩm");
            System.out.println("2.Quản lý sản phẩm");
            System.out.println("3.Thoát ứng dụng");
            Scanner scanner = new Scanner(System.in);
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    Productmanager.managerList();
                    break;
                case 2:
                    Productmanager.manageProduct();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        } while (true);
    }

    public static void managerList() {
        do {

            Scanner scanner = new Scanner(System.in);
            System.out.print("QUẢN LÝ DANH MỤC\n");
            System.out.println("1.Nhập thông tin danh mục");
            System.out.println("2.hiển thị danh mục theo độ ưu tiên");
            System.out.println("3.cập nhật thông tin danh mục theo mã danh mục");
            System.out.println("4.Thoát (Trở lại menu Quản lý cửa hàng)");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("nhập n danh mục muốn thêm ");
                    int n = Integer.parseInt(scanner.nextLine());
//                    System.out.println("nhập n danh mục sản phẩm");
                    for (int i = 0; i < n; i++) {
                        listCatalog[index1] = new Catalog();
                        listCatalog[index1].inputData2();
                        index1++;
                    }
                    break;
                case 2:
                    System.out.println("Danh mục theo độ ưu tiên");
                    for (int i = 0; i < index1 - 1; i++) {
                        for (int j = 0; j < index1; j++) {
                            if (listCatalog[i].getPriority() > listCatalog[i].getPriority()) {
                                Catalog temple = listCatalog[i];
                                listCatalog[i] = listCatalog[j];
                                listCatalog[i] = temple;
                            }
                        }
                    }
                    for (int i = 0; i < index1; i++) {
                        listCatalog[i].displayData2();
                    }
                    break;
                case 3:
                    for (int i = 0; i < index1; i++) {
                        System.out.println("ID danh muc\n" + listCatalog[i].getCatalogID());
                        System.out.println("ten danh muc san pham\n" + listCatalog[i].getCatalogName());
                    }
                    System.out.println("nhập mã ID cần cập nhật");
                    int n1 = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < index1; i++) {
                        if (listCatalog[i].getCatalogID() == n1) {
                            System.out.println("mã danh mục cũ là: " + listCatalog[i].getCatalogID());
                            System.out.println("mã danh mục mới là: ");
                            listCatalog[i].setCatalogID(Integer.parseInt(scanner.nextLine()));
                            System.out.println("tên danh mục cũ là : " + listCatalog[i].getCatalogName());
                            System.out.println("tên danh mục mới là: ");
                            listCatalog[i].setCatalogName(scanner.nextLine());
                            System.out.println("độ ưu tiên cũ là:" + listCatalog[i].getPriority());
                            System.out.println("độ ưu tiên mới là: ");
                            listCatalog[i].setPriority(Integer.parseInt(scanner.nextLine()));
                            System.out.println("trạng thái danh mục cũ là :" + listCatalog[i].isCatalogStatus());
                            System.out.println("trạng thái danh mục mới là :");
                            listCatalog[i].setCatalogStatus(Boolean.parseBoolean(scanner.nextLine()));
                        }
                    }
                    break;
                case 4:
                    return;
            }
        } while (true);
    }

    public static void manageProduct() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("******QUẢN LÝ SẢN PHẨM******\n");
            System.out.println("1. Nhập thông tin cho n sản phẩm");
            System.out.println("2. Tính giá bán cho tất cả sản phẩm");
            System.out.println("3. Hiển thị thông tin các sản phẩm");
            System.out.println("4. Sắp xếp sản phẩm theo giá bán tăng dần");
            System.out.println("5. Tìm kiếm sản phẩm theo tên sản phẩm");
            System.out.println("6. Thống kê số lượng và in thông tin các sản phẩm sắp hết hàng");
            System.out.println("7. Cập nhật trạng thái của sản phẩm theo mã sản phẩm");
            System.out.println("8. Thoát (Trở lại menu Quản lý cửa hàng)");
            int m = Integer.parseInt(scanner.nextLine());
            switch (m) {
                case 1:
                    System.out.println("nhap n san pham muon them");
                    int n2 = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < n2; i++) {
                        listProduct[index2] = new Product();
                        listProduct[index2].inputData1(scanner,listCatalog,index1);
                        index2++;
                    }
                    break;
                case 2:
                    for (int i = 0; i < index2; i++) {
                        listProduct[i].calExportPrice();
                    }
                    break;
                case 3:
                    System.out.printf("%-15s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-15s\n","Product ID", "Product Name", "Title", "Import Price", "Export Price", "Quantity", "Descriptions", "Product Status", "Catalog"
                    );
                    for (int i = 0; i < index2; i++) {
                        listProduct[i].displayData1();
                    }
                    break;
                case 4:
                    System.out.printf("%-15s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-15s\n","Product ID", "Product Name", "Title", "Import Price", "Export Price", "Quantity", "Descriptions", "Product Status", "Catalog"
                    );
                    for (int i = 0; i < index2 - 1; i++) {
                        for (int j = 0; j < index2; j++) {
                            if (listProduct[i].getExportPrice() > listProduct[j].getExportPrice()) {
                                Product temple = listProduct[i];
                                listProduct[i] = listProduct[j];
                                listProduct[i] = temple;
                            }
                        }
                    }
                    for (int i = 0; i < index2; i++) {
                        listProduct[i].displayData1();
                    }
                    break;
                case 5:
                    System.out.printf("%-15s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-15s\n","Product ID", "Product Name", "Title", "Import Price", "Export Price", "Quantity", "Descriptions", "Product Status", "Catalog"
                    );
                    Scanner scanner1 = new Scanner(System.in);
                    String Search = scanner1.nextLine();
                    for (int i = 0; i < index2; i++) {
                        if (Objects.equals(listProduct[i].getProductName(), Search)) {
                            listProduct[i].displayData1();
                        }
                    }
                    break;
                case 6:
                    System.out.printf("%-15s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-15s\n","Product ID", "Product Name", "Title", "Import Price", "Export Price", "Quantity", "Descriptions", "Product Status", "Catalog"
                    );
                    for (int i = 0; i < index2; i++) {
                        if (listProduct[i].getQuantity() < 5) {
                            listProduct[i].displayData1();
                        }
                    }
                    break;
                case 7:
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("nhap ma san pham can cap nhat");
                    String update = scanner2.nextLine();
                    for (int i = 0; i < index2; i++) {
                        if (listProduct[i].getProductID().equals(update)) {
                            listProduct[i].setProductStatus(!listProduct[i].isProductStatus());
                        }
                        System.out.println("trang thai cap nhat thanh cong");
                        break;

                    }
                case 8:
                    return;
            }
        }while (true) ;
    }
}

