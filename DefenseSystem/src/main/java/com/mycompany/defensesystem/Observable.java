/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.defensesystem;

import java.util.ArrayList;


/**
 *
 * @author lakma
 */
public class Observable implements ControllerObserver {

    private ArrayList<Observer>observersList = new ArrayList<>();
    private Strenght strenght;
    private int ammo;            
    MainController mainController = new MainController(this);
	
    public void addObserver(Observer observer){
            observersList.add(observer);
          
    }
    public void removeObserver(Observer observer){
            observersList.remove(observer);
    }

    @Override
    public void setStrenght(Strenght strenght){
            if(this.strenght!=strenght){
                this.strenght=strenght;
                for (Observer observer : observersList){
                observer.updateStrenght(strenght);
                }
            }
    } 
    
    @Override   
    public void Sendmainmsg(String Msg1){
        for (Observer observer : observersList){
        observer.updatemassege(Msg1);
        }

    } 
    @Override 
    public void setarea(boolean Area){
        for (Observer observer : observersList){
        observer.updatearea(Area);
        }

    } 

    public void getmsgtomain(String message) {
      mainController.getmsg(message);
    }
    
    public void getAmmotomain() {
            this.ammo=this.ammo - 1;
            mainController.getAmmo(this.ammo);   
    }
    

}
