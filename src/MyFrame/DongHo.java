/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyFrame;

/**
 *
 * @author ganukuyou
 */
public class DongHo
{

    public int getIdmodel() {
        return idmodel;
    }

    public int getSeri() {
        return seri;
    }

    public DongHo(int idmodel, int seri) {
        this.idmodel = idmodel;
        this.seri = seri;
    }
    
    public String toString()
    {
        return"Model: " +  String.valueOf(idmodel) + " - Seri: " +  String.valueOf(seri);
    }
    
    private int idmodel, seri;
    
}
