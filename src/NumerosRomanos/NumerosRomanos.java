/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumerosRomanos;

/**
 *
 * @author Marcos Júnior
 */
public class NumerosRomanos 
{
    public static String converter(int num) 
    {
        String r = "";
        while (num >= 1000) {
            r = r + 'M';
            num -= 1000;
        }
        if (num >= 900) {
            r = r + "CM";
            num -= 900;
        }
        if (num >= 500) {
            r = r + 'D';
            num -= 500;
        }
        if (num >= 400) {
            r = r + "CD";
            num -= 400;
        }
        while (num >= 100) {
            r = r + 'C';
            num -= 100;
        }
        if (num >= 90) {
            r = r + "XC";
            num -= 90;
        }
        if (num >= 50) {
            r = r + 'L';
            num -= 50;
        }
        if (num >= 40) {
            r = r + "XL";
            num -= 40;
        }
        while (num >= 10) {
            r = r + 'X';
            num -= 10;
        }
        if (num >= 9) {
            r = r + "IX";
            num -= 9;
        }
        if (num >= 5) {
            r = r + 'V';
            num -= 5;
        }
        if (num >= 4) {
            r = r + "IV";
            num -= 4;
        }
        while (num >= 1) {
            r = r + 'I';
            num--;
        }
        return r;
    }
}
