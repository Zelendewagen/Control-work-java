public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        catalog.add(0, "Apple", "monterey", 16, 128);
        catalog.add(1, "Asus", "windows", 16, 128);
        catalog.add(2, "Asus", "windows", 32, 512);
        catalog.add(2, "Lenovo", "windows", 32, 512);
        catalog.add(3, "MSI", "unix", 32, 1024);
        catalog.add(4, "Asus", "unix", 64, 1024);
        catalog.add(5, "MSI", "windows", 64, 1024);
        catalog.add(5, "Lenovo", "windows", 64, 512);


        catalog.filter(catalog.arr);
    }
}