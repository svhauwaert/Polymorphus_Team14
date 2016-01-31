/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.polymorphus.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Spencer Van Hauwaert
 */
public class Doctor implements Serializable{
    
    // class instance variables
    private int payment; // payment to doctor
    private String returnMessage; // doctor's message returned to player
    private int testCure; // formula result for cure

    // default constructor
    public Doctor() {
    }

    
    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

    public int getTestCure() {
        return testCure;
    }

    public void setTestCure(int testCure) {
        this.testCure = testCure;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.payment;
        hash = 47 * hash + Objects.hashCode(this.returnMessage);
        hash = 47 * hash + this.testCure;
        return hash;
    }

    @Override
    public String toString() {
        return "Doctor{" + "payment=" + payment + ", returnMessage=" + returnMessage + ", testCure=" + testCure + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Doctor other = (Doctor) obj;
        if (this.payment != other.payment) {
            return false;
        }
        if (!Objects.equals(this.returnMessage, other.returnMessage)) {
            return false;
        }
        if (this.testCure != other.testCure) {
            return false;
        }
        return true;
    }
    
    
}
