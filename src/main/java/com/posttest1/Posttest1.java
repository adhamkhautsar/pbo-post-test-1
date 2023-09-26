/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.posttest1;
import com.posttest1.Laptop;
import java.util.ArrayList;

/**
 *
 * @author adham
 */
public class Posttest1 {

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Asus", "ASUS TUF FX506LHB", "Intel Core i5 10300H", "8GB DDR4", "512 SSD Nvme", 10000000);
        Laptop laptop2 = new Laptop("Lenovo", "Lenovo Ideapad Gaming 3", "Ryzen 5 5600H", "8GB DDR4", "512 SSD Nvme", 20000000);
        Laptop laptop3 = new Laptop("Asus", "ASUS TUF FX506LHB", "Intel Core i5 10300H", "8GB DDR4", "512 SSD Nvme", 10000000);
        Laptop laptop4 = new Laptop("Asus", "ASUS TUF FX506LHB", "Intel Core i5 10300H", "8GB DDR4", "512 SSD Nvme", 10000000);
        Laptop laptop5 = new Laptop("Asus", "ASUS TUF FX506LHB", "Intel Core i5 10300H", "8GB DDR4", "512 SSD Nvme", 10000000);
        
        
        ArrayList<Laptop> laptops = new ArrayList<>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);
        
        for (Laptop laptop : laptops){
            String laptopBrand = "Brand laptop " + laptop.brand;
            String laptopModel = " memiliki Model terbaru " + laptop.model;
            String laptopProcessor = " dengan Processor " + laptop.processor;
            String laptopRam = " dilengkapi RAM " + laptop.ram;
            String laptopStorage = " dan memiliki penyimpanan " + laptop.storage;
            String laptopPrice = " dibandrol dengan harga " + laptop.price;
            System.out.println(laptopBrand.concat(laptopBrand + laptopModel + laptopProcessor + laptopRam + laptopStorage + laptopPrice));
        }
    }
}
