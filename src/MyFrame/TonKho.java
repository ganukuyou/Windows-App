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
public class TonKho
{

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTonkho() {
        return tonkho;
    }

    public void setTonkho(int tonkho) {
        this.tonkho = tonkho;
    }

    public TonKho(int id, int tonkho) {
        this.id = id;
        this.tonkho = tonkho;
    }
    private int id, tonkho;
    
}
