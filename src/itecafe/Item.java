/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itecafe;

/**
 *
 * @author kbc19a13
 */
public class Item {

    private int no;
    private String name;
    private int prics;
    
    public Item(int no, String name, int prics) {
        this.no = no;
        this.name = name;
        this.prics = prics;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrics() {
        return prics;
    }

    public void setPrics(int prics) {
        this.prics = prics;
    }

}
