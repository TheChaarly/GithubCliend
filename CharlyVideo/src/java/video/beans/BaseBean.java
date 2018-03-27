/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video.beans;

import java.io.Serializable;

/**
 *
 * @author TheChaarly
 */
public class BaseBean implements Serializable{
    private static final long serialVersionUID = 1L;
    protected Boolean showConfirmation;
    protected Boolean showError;
    protected String message;
    protected String title;
}
