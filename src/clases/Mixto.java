/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author sony
 */
public class Mixto {

    private int entero;
    private int numerador;
    private int denominador;

    public Mixto(int entero,int numerador, int denominador) throws DenominadorCeroException {
        this.numerador = numerador;
        this.denominador = denominador;
        this.entero = entero;

        if (denominador == 0) {
            throw new DenominadorCeroException();
        }
    }

    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public Mixto sumar(Mixto f2) throws DenominadorCeroException{
    Mixto f;
    int ent,num, den,nfrac1,nfrac2,nres,dres;    
        
    nfrac1= (this.entero * this.denominador) + this.numerador;
    nfrac2= (f2.entero * f2.denominador) + f2.numerador;
    
    nres= (nfrac1 * f2.denominador) + (this.denominador * nfrac2);
    dres= this.denominador * f2.denominador;
    
    ent= nres / dres;
    num= nres % dres;
    den= dres;
    
    f = new Mixto(ent,num, den);
    return f;
    } 
    
   public Mixto restar(Mixto f2) throws DenominadorCeroException{
    Mixto f;
    int ent,num, den,nfrac1,nfrac2,nres,dres;    
        
    nfrac1= (this.entero * this.denominador) + this.numerador;
    nfrac2= (f2.entero * f2.denominador) + f2.numerador;
    
    nres= (nfrac1 * f2.denominador) - (this.denominador * nfrac2);
    dres= this.denominador * f2.denominador;
    
    ent= nres / dres;
    num= nres % dres;
    den= dres;
    
    f = new Mixto(ent,num, den);
    return f;
    }  
    
  public Mixto multiplicar(Mixto f2) throws DenominadorCeroException{
    Mixto f;
    int ent,num, den,nfrac1,nfrac2,nres,dres;    
        
    nfrac1= (this.entero * this.denominador) + this.numerador;
    nfrac2= (f2.entero * f2.denominador) + f2.numerador;
    
    nres= nfrac1 * nfrac2;
    dres= this.denominador * f2.denominador;
    
    ent= nres / dres;
    num= nres % dres;
    den= dres;
    
    f = new Mixto(ent,num, den);
    return f;
    }   
 
  public Mixto dividir (Mixto f2) throws DenominadorCeroException{
    Mixto f;
    int ent,num, den,nfrac1,nfrac2,nres,dres;    
        
    nfrac1= (this.entero * this.denominador) + this.numerador;
    nfrac2= (f2.entero * f2.denominador) + f2.numerador;
    
    nres= nfrac1 * f2.denominador;
    dres= this.denominador * nfrac2;
    
    ent= nres / dres;
    num= nres % dres;
    den= dres;
    
    f = new Mixto(ent,num, den);
    return f;
    } 
}
